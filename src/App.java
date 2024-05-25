public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 2000, 4);
        
        //mostrar la informacion de cada vehículo
        System.out.println("Información del Auto: ");
        auto.MostrarInfo();
        auto.realizarMantenimiento();
        
        double CostoMantenimientoAuto = auto.calcularCostoMantenimiento(50, 15000);
        System.out.println("Costo de mantenimiento del auto: $" + CostoMantenimientoAuto);

        System.out.println("Información del Camión: ");
        camion.MostrarInfo();
        camion.realizarMantenimiento();
    }
}
