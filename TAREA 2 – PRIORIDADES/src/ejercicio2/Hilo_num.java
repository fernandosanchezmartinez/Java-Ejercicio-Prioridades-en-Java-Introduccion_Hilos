package ejercicio2;

 class Hilo_num extends Thread {

	public Hilo_num(String nombre) {
		super(nombre);
	}

	public void run() {
		/*
		if (getName().equalsIgnoreCase("Hilo 1")) {
			try {
				sleep(500);
			} catch (InterruptedException ex) {
				System.out.println("Error " + ex);
			}
		}
		*/
		System.out.println("SE ESTÁ EJECUTANDO EL: " + getName());
		
		 for (int i = 0; i < 10; i++) {
		        System.out.println(i);
		    }
		 
	}
}
