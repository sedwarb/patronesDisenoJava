package creacionales.factory;

public class main {
    public static void main(String[] args) {
        //Este patron se usa para instanciar con la misma clase el uso de clases diferentes con una
        //implementacion en comun 

        PrecioFactoria precioFactoria = new PrecioFactoria("usa");
        PrecioFactoria precioFactoria2 = new PrecioFactoria("Espana");

        System.out.println(precioFactoria.getPrecio());
        System.out.println(precioFactoria2.getPrecio());
    }
}
