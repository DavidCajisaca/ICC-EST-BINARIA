public class Binaria {
    public void insercionEdad(int edad, Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona temp = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > temp.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = temp;
        }
    }
    public void busquedaBinaria(int edad, Persona[] personas) {
        int bajo = 0;
        int alto = personas.length - 1;
            for (int i = 0; i < personas.length; i++) {
            System.out.print(personas[i].getEdad());
            if (i != personas.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    
        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getEdad();
    
            // Imprimir estado actual
            System.out.print("bajo=" + bajo + " alto=" + alto +
                " centro=" + centro + " valorCentro=" + valorCentro);
    
            if (valorCentro == edad) {
                System.out.println(" --> ENCONTRADO");
                System.out.println( personas[centro]);
                return;
            } else if (valorCentro < edad) {
                System.out.println(" --> DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println(" --> IZQUIERDA");
                alto = centro - 1;
            }
    
            for (int i = bajo; i <= alto && i < personas.length; i++) {
                System.out.print(personas[i].getEdad());
                if (i != alto) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    
        System.out.println("Persona no encontrada");
    }
    

}
