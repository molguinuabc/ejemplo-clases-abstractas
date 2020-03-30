/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author molgu
 */
public class Vehiculo {
    private String marca;

    public Vehiculo() {
        this.marca = "";
        this.color = "";
    }
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
    private String color;
    
    /**
     Activa el sistema de propulsión del vehiculo
     * @return String que indica la operación realizada
    */
    public String avanza() {
        return "avanzando";
    }
    
    public String frena() {
        return "frenando";
    };
    public String vira() {
        return "virando";
    };
    
    
    
}
