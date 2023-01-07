package creacionales.singleton;

public class Singleton {
    private static Singleton singleton;
    int contador;

    //creo un constructorprivado para que no se pueda instaciar con new
    private Singleton() {}
    //solo puede haber una instacia de una clase
    //creo un metodo para instanciar
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
