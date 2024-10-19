/**
 * @author Walid Rifi
 * @since version 1.0
 * @version 1.2
 */
/**
 * La clase App es la clase principal que ejecuta la aplicación.
 * 
 */
public class App {
    
    /**
     * El método main es el punto de entrada de la aplicación.
     * 
     * Este método crea una figura de tipo triángulo, calcula su área, 
     * cambia su nombre a cuadrado y verifica si la figura es un cuadrado.
     * 
     * @param args Parámetros de línea de comandos (no utilizados).
     * @throws Exception Si ocurre algún error durante la ejecución del programa.
     */
    public static void main(String[] args) throws Exception {
        // Crear una figura de tipo triángulo
        Figura figura = new Figura("Triángulo");

        // Describir la figura
        System.out.println(figura.describir());

        // Calcular el área del triángulo
        double area = figura.calcularArea(5, 10);
        System.out.println("Área del triángulo: " + area);

        // Cambiar el nombre de la figura
        String nuevoNombre = figura.cambiarNombre("Cuadrado");
        System.out.println("Nuevo nombre de la figura: " + nuevoNombre);

        // Verificar si la figura es un cuadrado
        String resultadoCuadrado = figura.esCuadrado(5, 5);
        System.out.println(resultadoCuadrado);
    }
}
