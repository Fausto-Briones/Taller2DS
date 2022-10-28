
public class Empleado {

    private String nombre;
    private String ci;
    private double salarioBase;
    
    //Constructor
    public Empleado(String nombre, String ci, double salarioBase) {
        this.nombre = nombre;
        this.ci = ci;
        this.salarioBase = salarioBase;
    }
    
    // Getters y setters
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public String getNombre() {
        return nombre;
    }

    public String getCi() {
        return ci;
    }
    
}