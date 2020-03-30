/**
 *
 * @author molgu
 */
public class Barco extends Vehiculo{

    Barco(String marca, String color) {
        super(marca,color);
    }
    
    @Override
    public String vira() {
        return "El barco está moviendo el timón para virar";
    }
    
    @Override
    public String avanza() {
        return "Barco acelerando propela para avanzar";
    }
}
