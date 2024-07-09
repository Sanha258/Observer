package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread{
	
	private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();
	
	void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			while(true) {
				int valor = scanner.nextInt();
				
				if(valor == 1) {
					ChegadaAniversarianteEvento Evento = new ChegadaAniversarianteEvento(new Date());
					
					// Notificar os obseervers
					for(ChegadaAniversarianteObserver observer: this.observers) {
						observer.chegou(Evento);
					}
				}else {
					System.out.println("Alarme falso!");
				}
			}
			
		} finally {
			scanner.close();
		}
	}

}
