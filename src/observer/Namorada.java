package observer;

public class Namorada implements ChegadaAniversarianteObserver{
	
	public void chegou(ChegadaAniversarianteEvento Evento) {
		System.out.println("apagar as luzes...");
		System.out.println("fazer silencio...");
		System.out.println("Surpresa!!!");
	}

}
