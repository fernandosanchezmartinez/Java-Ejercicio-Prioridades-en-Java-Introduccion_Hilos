package ejercicio1;

/**
 * 
 * @author fernando.sanchez E J E R C I C I O 1 --> UTILIZACIÓN DE PRIORIDADES
 *         Las preguntas y respuestas se encuentran al final del
 *         código(comentarios)
 */
public class CounterThread extends Thread {// Se crea la clase y ponemos que
											// hereda de Thread

	String name;// se crea una variable "name" que representa el nombre de los
				// respectivos "hilos"

	public CounterThread(String name) {
		super();
		this.name = name;
		// pasamos en el constructor por parámetro dicho nombre
	}

	/**
	 * se inicia una variable contador y, en un bucle while, con parametro true
	 * para que sea infinito. usando el método sleep, ampliamos o disminuimos el
	 * tiempo entre listo y ejecucion de los threads. Finalmente se crea un
	 * bucle if que va imprimiendo por pantalla dichos Threads hasta la cifra
	 * indicada por parametro
	 */
	public void run() {

		int count = 0;
		while (true) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (count == 1000)
				count = 0;
			System.out.println(name + ":" + count++);
		}
	}
}

/**
 * 
 * @author fernando.sanchez Se crea la clase prioridad la cual se encarga de
 *         gestionar el main
 */
class Prioridad {
	public static void main(String[] args) {
		CounterThread thread1 = new CounterThread("thread1");// se crea el
																// primer hilo

		thread1.setPriority(Thread.MIN_PRIORITY);// mediante setPriority()
													// establecemos el rango
		// de prioridad a la hora de ejecutarse

		// thread1.setPriority(1);
		// thread1.setPriority(10);

		CounterThread thread2 = new CounterThread("thread2");// se crea el
																// segundo hilo
		// thread2.setPriority(10);
		// thread2.setPriority(5);
		// thread2.setPriority(2);

		thread2.setPriority(Thread.MAX_PRIORITY);

		thread2.start();// se inicializan los threads
		thread1.start();
	}
}

// ------------------------------------- P R E G U N T A S -->

/**
 * 1. ¿El cambio está afectando significativamente al resultado? Si cambiamos
 * los parametors de las propiedades observamos que cambia el orden de ejecucion
 * de los hilos <2,1, 2,1, 1,2,..>
 * 
 * 
 * 
 * 
 * 
 * 
 */

