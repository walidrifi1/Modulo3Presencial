
/**
 * Clase que representa una figura geométrica.
 * 
 * Esta clase permite crear figuras con un nombre, calcular su área,
 * describir la figura, cambiar su nombre y verificar si es un cuadrado.
 */
public class Figura {
    private String nombre;

    /**
     * Constructor que inicializa la figura con un nombre.
     * 
     * @param nombre El nombre de la figura.
     */
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Calcula el área de la figura en base a la base y altura proporcionadas.
     * 
     * @param base {double} La base de la figura.
     * @param altura {double} La altura de la figura.
     * @return El área calculada de la figura.
     */
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2; 
    }

    /**
     * Describe la figura y devuelve su nombre.
     * 
     * @return Una descripción de la figura.
     */
    public String describir() {
        return "Esta es una figura llamada: " + nombre;
    }

    /**
     * Cambia el nombre de la figura a uno nuevo.
     * 
     * @param nuevoNombre {String} El nuevo nombre para la figura.
     * @return El nuevo nombre de la figura.
     */
    public String cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
        return this.nombre;
    }

    /**
     * Verifica si la figura es un cuadrado basándose en los lados proporcionados.
     * 
     * @param lado1 {double} La longitud del primer lado.
     * @param lado2 {double} La longitud del segundo lado.
     * @return Un mensaje indicando si es un cuadrado o no.
     */
    public String esCuadrado(double lado1, double lado2) {
        if (lado1 == lado2) {
            return "Es un cuadrado.";
        } else {
            return "No es un cuadrado.";
        }
    }
}
