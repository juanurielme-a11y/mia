import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

public class Crud {

    static Firestore db = FirebaseConnection.connect();

    public static void insertar(String id, Estudiante est) {
        try {
            db.collection("Estudiantes").document(id).set(est);
            JOptionPane.showMessageDialog(null, "Insertado");
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void buscar(String id) {
        try {
            var doc = db.collection("Estudiantes").document(id).get().get();
            JOptionPane.showMessageDialog(null, doc.getData().toString());
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void actualizar(String id, int semestre) {
        try {
            db.collection("Estudiantes").document(id)
                    .update("Semestre", semestre);
            JOptionPane.showMessageDialog(null, "Actualizado");
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void eliminar(String id) {
        try {
            db.collection("Estudiantes").document(id).delete();
            JOptionPane.showMessageDialog(null, "Eliminado");
        } catch (Exception e) { e.printStackTrace(); }
    }
}
``
