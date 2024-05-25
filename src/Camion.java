public class Camion extends VehiculoCarga{

    private int numEjes;

    //constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    //Getter y Setter para numEjes
    public int getNumEjes(){
        return numEjes;
    }

    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }

    //Sobrescribir el método MostrarInfo()
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Número de Ejes: " + numEjes);
    }

    //método realizarMantenimiento exclusivo para camion.
    @Override
    public void realizarMantenimiento(){
        System.out.println("Realizando mantenimiento para camión: Verificando aceite, frenos, neumáticos y sistema de carga.");
        

    }

}
