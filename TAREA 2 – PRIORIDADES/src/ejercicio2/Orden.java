package ejercicio2;

public class Orden {

	public static void main(String[] args) {
		Hilo_num hilo1 = new Hilo_num("hilo1");
		Hilo_letras hilo2 = new Hilo_letras("hilo2");
        
		hilo2.setPriority(Thread.MAX_PRIORITY);
		hilo1.setPriority(Thread.MIN_PRIORITY);
       
		hilo2.start();
        hilo1.start();
        

	}

}
