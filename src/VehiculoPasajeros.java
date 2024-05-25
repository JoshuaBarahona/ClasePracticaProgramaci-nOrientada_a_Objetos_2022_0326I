public class VehiculoPasajeros extends Vehiculo{

    private int numPasajeros;

    //constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros){
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros(){
        return numPasajeros;
    }
    
    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros = numPasajeros;
    }

    //Sobrescribir el método MostrarInfo()
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Número de pasajeros: " + numPasajeros);
    }

    
}