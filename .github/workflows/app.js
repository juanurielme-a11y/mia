import { initializeApp } from "https://www.gstatic.com/firebasejs/10.7.0/firebase-app.js";
import {
  getFirestore,
  doc,
  setDoc,
  getDoc,
  updateDoc,
  deleteDoc
} from "https://www.gstatic.com/firebasejs/10.7.0/firebase-firestore.js";

// ✅ TU CONFIG
const firebaseConfig = {
  apiKey: "AIzaSyAfmE_f9Q28xqxXbh2mRpU-8WIFjhQ5n6U",
  authDomain: "mia-fcloud-unidad-2.firebaseapp.com",
  projectId: "mia-fcloud-unidad-2",
  storageBucket: "mia-fcloud-unidad-2.firebasestorage.app",
  messagingSenderId: "213073960951",
  appId: "1:213073960951:web:0dbe959280fbd8cb1858f2"
};

const app = initializeApp(firebaseConfig);
const db = getFirestore(app);

// ✅ INSERTAR
window.insertar = async () => {
  const id = document.getElementById("id").value;

  const estudiante = {
    Nombre: document.getElementById("nombre").value,
    Apellido: document.getElementById("apellido").value,
    Edad: parseInt(document.getElementById("edad").value),
    Semestre: parseInt(document.getElementById("semestre").value),
    Jornada: "Virtual"
  };

  await setDoc(doc(db, "Estudiantes", id), estudiante);

  mostrar("✅ Insertado");
};

// ✅ BUSCAR
window.buscar = async () => {
  const id = document.getElementById("id").value;

  const ref = doc(db, "Estudiantes", id);
  const docSnap = await getDoc(ref);

  if (docSnap.exists()) {
    mostrar(JSON.stringify(docSnap.data(), null, 2));
  } else {
    mostrar("❌ No encontrado");
  }
};

// ✅ ACTUALIZAR
window.actualizar = async () => {
  const id = document.getElementById("id").value;
  const semestre = parseInt(document.getElementById("semestre").value);

  await updateDoc(doc(db, "Estudiantes", id), {
    Semestre: semestre
  });

  mostrar("✅ Actualizado");
};

// ✅ ELIMINAR
window.eliminarEst = async () => {
  const id = document.getElementById("id").value;

  await deleteDoc(doc(db, "Estudiantes", id));

  mostrar("✅ Eliminado");
};

// RESULTADO
function mostrar(msg) {
  document.getElementById("resultado").textContent = msg;
}
