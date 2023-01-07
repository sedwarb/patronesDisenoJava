package creacionales.factory;

public class PrecioFactoria {
    //Creo una variable del tipo de la implementacion
    FactoryPrecio precio;
    //Se Oculta el Constructor
    private PrecioFactoria() {};
    public PrecioFactoria(String pais){
        if(pais=="usa") precio=new FactoryPrecioUSD();
        else precio=new FactoryPrecioEUR();
    }
    public Double getPrecio(){
        return precio.getPrecio();
    }
}
