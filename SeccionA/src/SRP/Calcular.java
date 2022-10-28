
public class Calcular extends Empleado{
    

     public double calcularAportacionIESS(){
        
        
        double aportacion=salarioBase*0.0915;           
        return aportacion;  
    }
    
    public double calcularSalarioMensual(){
        
        double salario=salarioBase-this.calcularAportacionIESS();
        return salario;
    }
}