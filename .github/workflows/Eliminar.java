import com.google.cloud.firestore.Firestore;

public class Eliminar {

    public static void eliminar(String id) {

        try {
            Firestore db = FirebaseConnection.connect();

            db.collection("Estudiantes")
              .document(id)
              .delete();

            System.out.println("Eliminado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
