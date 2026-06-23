import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;

public class Consultar {

    public static void buscar(String id) {
        try {
            Firestore db = FirebaseConnection.connect();

            ApiFuture<DocumentSnapshot> future =
                    db.collection("Estudiantes").document(id).get();

            DocumentSnapshot document = future.get();

            if (document.exists()) {
                System.out.println("Datos: " + document.getData());
            } else {
                System.out.println("No existe");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
