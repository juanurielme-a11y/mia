import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {

    JTextField txtId, txtNombre, txtApellido, txtEdad, txtSemestre;

    public Interfaz() {

        setTitle("Gestión de Estudiantes - Firebase");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("ID:"));
        txtId = new JTextField();
        add(txtId);

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Apellido:"));
        txtApellido = new JTextField();
        add(txtApellido);

        add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        add(txtEdad);

        add(new JLabel("Semestre:"));
        txtSemestre = new JTextField();
        add(txtSemestre);

        JButton btnInsertar = new JButton("Insertar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar");

        add(btnInsertar);
        add(btnBuscar);
        add(btnActualizar);
        add(btnEliminar);

        setLocationRelativeTo(null); // ✅ CENTRA LA VENTANA
        setVisible(true); // ✅ HACE VISIBLE
    }
}
