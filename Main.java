
public class Main {
    public static void main(String[]args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador(); 
        cliente.nombre = "Pedro"; 
        cliente.edad = 28;
        cliente.telefono = 123450;
        cliente.credito = 1230.5; 
        System.out.println("Soy " + cliente.nombre + " y tengo " + cliente.edad + " años " + ", mi numero de telefono es " + cliente.telefono + ", y tengo un credito pendiente de " + cliente.credito + " € ");
        

        trabajador.nombre = "Manolo"; 
        trabajador.edad = 25;
        trabajador.telefono = 123123; 
        trabajador.salario = 1200.15; 

        System.out.println("Yo soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi número de teléfono es " + trabajador.telefono + ", y mi salario mensual es de " + trabajador.salario); 
    }

}

class Persona {
    int edad;
    String nombre;
    int telefono;  

}

class Cliente extends Persona {
    double credito; 
}

class Trabajador extends Persona {
    double salario; 
}