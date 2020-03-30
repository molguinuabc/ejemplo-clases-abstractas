/**
 * Clase especializada que implementa los métodos abstractos
 * @author molguin
 * @see Vehiculo
 */
public class Auto extends Vehiculo{

    Auto(String marca, String color) {
        super(marca,color);
    }
    
    @Override
    public String vira() {
        return "El Auto está virando moviendo las llantas";
    }
    
    @Override
    public String avanza() {
        return "Auto avanzando revolucionando motor y diferencial";
    }
}
