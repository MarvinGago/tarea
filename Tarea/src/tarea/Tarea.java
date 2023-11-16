/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author CPUw1010
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar información de la iglesia
        System.out.print("Ingrese el nombre de la iglesia: ");
        String nombreIglesia = scanner.nextLine();

        System.out.print("Ingrese el nombre del pastor: ");
        String nombrePastor = scanner.nextLine();

        System.out.print("Ingrese la cantidad de feligreses: ");
        int cantidadFeligreses = scanner.nextInt();

        // Crear objeto de la clase Iglesia
        iglesia iglesia = new iglesia(nombreIglesia, nombrePastor, cantidadFeligreses);

        // Solicitar información de los feligreses
        for (int i = 0; i < cantidadFeligreses; i++) {
            scanner.nextLine(); // Limpiar el buffer del scanner

            System.out.println("Feligres " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombreFeligres = scanner.nextLine();

            System.out.print("Cédula: ");
            String cedulaFeligres = scanner.nextLine();

            System.out.print("Diezmo: ");
            double diezmoFeligres = scanner.nextDouble();

            // Crear objeto de la clase Feligrés y agregarlo al arreglo de feligreses de la iglesia
            Feligres feligres = new Feligres(nombreFeligres, cedulaFeligres, diezmoFeligres);
            iglesia.getFeligreses()[i] = feligres;
        }
    
        // Generar informe
        generarInforme(iglesia);
    }

        public static void generarInforme(iglesia iglesia) {
        double montoTotalGanancias = 0;
        double montoMunicipalidadInfraestructura = 0;
        double montoComedorMunicipal = 0;
        double montoGananciaPastor = 0;
        String feligresesDiezmoCero = "";
        String feligresesDiezmoMayorCienMil = "";

        // Calcular montos y generar listas de feligreses
           for (Feligreses feligres : iglesia.setFeligreses()) {
            montoTotalGanancias += feligres.getDiezmo();

            if (feligres.getDiezmo() == 0) {
                feligresesDiezmoCero += feligres.getNombre() + " - " + feligres.getCedula() + "\n";
            }

            if (feligres.getDiezmo() > 100000) {
                feligresesDiezmoMayorCienMil += feligres.getNombre() + " - " + feligres.getCedula() + "\n";
            }
        }

        montoMunicipalidadInfraestructura = montoTotalGanancias * 0.09;
        montoComedorMunicipal = montoTotalGanancias * 0.21;
        montoGananciaPastor = montoTotalGanancias * 0.7;

        // Mostrar informe
        System.out.println("Informe de la iglesia:");
        System.out.println("Nombre de la iglesia: " + iglesia.getNombre());
        System.out.println("Nombre del pastor: " + iglesia.getPastor());
        System.out.println("Monto total de ganancias de la iglesia: " + montoTotalGanancias);
        System.out.println("Monto para la municipalidad (infraestructura): " + montoMunicipalidadInfraestructura);
        System.out.println("Monto para el comedor municipal: " + montoComedorMunicipal);
        System.out.println("Monto de ganancia para el pastor: " + montoGananciaPastor);
        System.out.println("Lista de feligreses con diezmo igual a 0:\n" + feligresesDiezmoCero);
        System.out.println("Lista de feligreses con diezmo mayor a 100000:\n" + feligresesDiezmoMayorCienMil);
    }
}
    }
    

