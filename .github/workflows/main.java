public class Main {

    public static void main(String[] args) {

        // Cargar CSV
        CargaCSV.cargar("estudiantes.csv");

        // Consultar
        Consultar.buscar("10000001");

        // Actualizar
        Actualizar.actualizarSemestre("10000001", 5);

        // Eliminar
        Eliminar.eliminar("10000001");
    }
}
``
