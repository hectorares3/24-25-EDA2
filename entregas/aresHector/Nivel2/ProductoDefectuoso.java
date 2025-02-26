public class ProductoDefectuoso {
    public static int primerDefectuoso(boolean[] productos) {
        int izquierda = 0, derecha = productos.length - 1;

        while (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            if (productos[medio]) {
                derecha = medio;
            } else {
                izquierda = medio + 1;
            }
        }

        return productos[izquierda] ? izquierda : -1;
    }

    public static void main(String[] args) {
        boolean[] productos = {false, false, false, true, true};
        System.out.println(primerDefectuoso(productos));
    }
}
