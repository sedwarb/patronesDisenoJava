package creacionales.singleton;

public class main {
    public static void main(String[] args) {
        //Hago la primera instacia de mi clase singleton
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);
        System.out.println(singleton.getContador());
        System.out.println("Posicion en Memoria: "+singleton);

        //Hago otro instancia de la clase singleton
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(10);
        System.out.println(singleton2.getContador());
        System.out.println("Posicion en Memoria: "+singleton2);

        //El resultado del patron de diseno Singleton es que solo pueda hacer una sola instancia de una clase
        //para evitar ocupar memoria creando nuevas instancias
    }
}
