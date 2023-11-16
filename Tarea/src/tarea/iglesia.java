/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author CPUw1010
 */
public class iglesia {
    private String nombre;
    private String pastor;
    private Tarea.Feligres[] feligreses;

    // Constructor
     public iglesia(String nombre, String pastor, int cantidadFeligreses) {
        this.nombre = nombre;
        this.pastor = pastor;
        this.feligreses = new Tarea.Feligres[cantidadFeligreses];
    }

    iglesia(String nombreIglesia, String nombrePastor, int cantidadFeligreses) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPastor() {
        return pastor;
    }

    public void setPastor(String pastor) {
        this.pastor = pastor;
    }

    public Tarea.Feligres[] getFeligreses() {
        return feligreses;
    }

    public void setFeligreses(Tarea.Feligres[] feligreses) {
        this.feligreses = feligreses;
    }
    public static void generarInforme(Iglesia iglesia) {
        double montoTotalGanancias = 0;
        double montoMunicipalidadInfraestructura = 0;
        double montoComedorMunicipal = 0;
        double montoGananciaPastor = 0;
        String feligresesDiezmoCero = "";
        String feligresesDiezmoMayorCienMil = "";

        // Calcular montos y generar listas de feligreses
        for (Feligres feligres : iglesia.getFeligreses()) {
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

