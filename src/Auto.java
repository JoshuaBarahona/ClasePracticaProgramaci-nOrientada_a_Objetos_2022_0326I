public class Auto extends VehiculoPasajeros {

    private String tipoCombustible;

    //constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    //Getter y Setter para tipoCombustible
    public String getTipoCombustible(){
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }

    //Sobrescribir el método mostrarInfo()
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }

    //Método para el calculo del costo de mantenimiento.
    public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos){
        return costoPorKm * kilometrosRecorridos;
    }

    //Implementación del método realizarMantenimiento exclusivo para Auto
    @Override
    public void realizarMantenimiento(){
        System.out.println("Realizando mantenimiento para auto: Verificando aceite, frenos y neumáticos. ");
    }

}
