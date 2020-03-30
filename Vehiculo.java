/**
 *
 * @author molgu
 */
public abstract class Vehiculo {
    private String marca;
    private String color;
    
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color string que indica el color a establecer 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Activa el sistema de propulsión del vehiculo
     * @return String que indica la operación realizada
    */
    public abstract String avanza();
    
    /**
     * Activa el sistema de frenado del vehiculo
     * @return String que indica la operación realizada
    */
    
    public String frena() {
        return "frenando";
    };
    
    /**
     * Activa el sistema de giro del vehiculo
     * @return String que indica la operación realizada
    */
    public abstract String vira();
    
}
