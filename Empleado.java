// Clase base Empleado
class Empleado {
    // Atributos de la clase Empleado
    protected String nombre; // protegido para que las subclases lo puedan acceder
    protected double salario; //protegido para las subclases

    // Constructor para inicializar los atributos de Empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre; 
        this.salario = salario; 
    }

    // Método para calcular el bono del empleado
    public double calcularBono() {
        return salario * 0.10; // Devuelve el 10% del salario como bono
    }
}

// Clase derivada Gerente que hereda de Empleado
class Gerente extends Empleado {
    // Constructor para inicializar los atributos de Gerente
    public Gerente(String nombre, double salario) {
        super(nombre, salario); // Llamamos al constructor de la clase base (Empleado)
    }

    // Sobrescribimos el método calcularBono para Gerente
    @Override
    public double calcularBono() {
        return salario * 0.15; // Devuelve el 15% del salario como bono para un Gerente
    }


    // Clase principal con el método main

    public static void main(String[] args) {
        // Creamos un objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", 2000.0);
        // Mostramos el nombre y el bono del empleado
        System.out.println("Empleado: " + empleado1.nombre);
        System.out.println("Bono: " + empleado1.calcularBono()); // Salida: Bono del 10%

        // Creamos un objeto de la clase Gerente
        Gerente gerente1 = new Gerente("Ana Gómez", 3000.0);
        // Mostramos el nombre y el bono del gerente
        System.out.println("Gerente: " + gerente1.nombre);
        System.out.println("Bono: " + gerente1.calcularBono()); // Salida: Bono del 15%
    }
}













