package ejercicio2;

public class Hilo_letras extends Thread {

	public Hilo_letras(String nombre) {
		super(nombre);
	}

	public void run() {
		if (getName().equalsIgnoreCase("Hilo 1")) {
			try {
				sleep(1000);
			} catch (InterruptedException ex) {
				System.out.println("Error " + ex);
			}
		}
		System.out.println("SE ESTÁ EJECUTANDO EL: " + getName());
		// char letra = 65;
		for (char letra = 65; letra < 76; letra++) {
			System.out.println(letra);
		}

	}
}
