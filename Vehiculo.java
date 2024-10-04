// Clase base Vehiculo
class Vehiculo {
    // Atributos comunes a todos los vehículos
    protected String marca; 
    protected String modelo; 
    protected int anio; 

    // Constructor para inicializar los atributos de Vehiculo
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca; 
        this.modelo = modelo; 
        this.anio = anio; 
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}

// Clase derivada VehiculoMotorizado que hereda de Vehiculo
class VehiculoMotorizado extends Vehiculo {
    // Atributo específico para vehículos motorizados
    protected double potencia; 

    // Constructor para inicializar atributos de VehiculoMotorizado
    public VehiculoMotorizado(String marca, String modelo, int anio, double potencia) {
        super(marca, modelo, anio); // Llamamos al constructor de Vehiculo
        this.potencia = potencia; // Asignamos la potencia
    }

    // Sobrescribimos el método mostrarInfo para incluir la potencia
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método de la clase base
        System.out.println("Potencia: " + potencia + " CV"); // Mostramos la potencia
    }
}

// Clase derivada Coche que hereda de VehiculoMotorizado
class Coche extends VehiculoMotorizado {
    // Atributo específico para coches
    private int puertas; 

    // Constructor para inicializar atributos de Coche
    public Coche(String marca, String modelo, int anio, double potencia, int puertas) {
        super(marca, modelo, anio, potencia); // Llamamos al constructor de VehiculoMotorizado
        this.puertas = puertas; // Asignamos el número de puertas
    }

    // Sobrescribimos el método mostrarInfo para incluir el número de puertas
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método de la clase base
        System.out.println("Número de puertas: " + puertas); // Mostramos el número de puertas
    }
}

// Clase derivada Motocicleta que hereda de VehiculoMotorizado
class Motocicleta extends VehiculoMotorizado {
    // Atributo específico para motocicletas
    private boolean tieneSidecar; // Indica si tiene un sidecar

    // Constructor para inicializar atributos de Motocicleta
    public Motocicleta(String marca, String modelo, int anio, double potencia, boolean tieneSidecar) {
        super(marca, modelo, anio, potencia); // Llamamos al constructor de VehiculoMotorizado
        this.tieneSidecar = tieneSidecar; 
    }

    // Sobrescribimos el método mostrarInfo para incluir información sobre el sidecar
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método de la clase base
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No")); // Mostramos si tiene sidecar
    }


    // Clase principal con el método main

    public static void main(String[] args) {
        // Creamos un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020, 132.0, 4);
        // Mostramos la información del coche
        System.out.println("Información del Coche:");
        miCoche.mostrarInfo();

        // Creamos un objeto de la clase Motocicleta
        Motocicleta miMotocicleta = new Motocicleta("Harley-Davidson", "Sportster", 2019, 70.0, false);
        // Mostramos la información de la motocicleta
        System.out.println("\nInformación de la Motocicleta:");
        miMotocicleta.mostrarInfo();
    }
}




















