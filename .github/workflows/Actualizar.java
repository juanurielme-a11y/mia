import com.google.cloud.firestore.Firestore;

public class Actualizar {

    public static void actualizarSemestre(String id, int semestre) {

        try {
            Firestore db = FirebaseConnection.connect();

            db.collection("Estudiantes")
              .document(id)
              .update("Semestre", semestre);

            System.out.println("Actualizado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
