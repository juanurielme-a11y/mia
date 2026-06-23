import java.io.BufferedReader;
import java.io.FileReader;
import com.google.cloud.firestore.Firestore;

public class CargaCSV {

    public static void cargar(String ruta) {
        try {
            Firestore db = FirebaseConnection.connect();

            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;

            br.readLine(); // saltar encabezado

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                Estudiante est = new Estudiante(
                        datos[0], datos[1], datos[2], datos[3],
                        Integer.parseInt(datos[4]), datos[5],
                        Integer.parseInt(datos[6]), datos[7],
                        datos[8], datos[9]
                );

                String id = String.valueOf(System.currentTimeMillis());

                db.collection("Estudiantes").document(id).set(est);

                System.out.println("Insertado: " + est.Nombre);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
