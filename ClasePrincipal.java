/**
 *
 * @author molgu
 */
public class ClasePrincipal {

    public static void main() {
        Auto auto = new Auto("Ford","Negro");
        Barco barco = new Barco("Beneteau","Blanco");
        
        Vehiculo vehiculo = barco;
        System.out.println(vehiculo.vira());
        
        vehiculo=auto;
        System.out.println(vehiculo.vira());
        
        System.out.print(auto.avanza() + " ");
        System.out.println(barco.avanza());
        
    }
    
}
