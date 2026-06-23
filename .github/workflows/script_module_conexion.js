<script type="module">
import { initializeApp } from "https://www.gstatic.com/firebasejs/10.7.0/firebase-app.js";
import { getFirestore, collection, getDocs } from "https://www.gstatic.com/firebasejs/10.7.0/firebase-firestore.js";

const firebaseConfig = {
  apiKey: "AIzaSyAfmE_f9Q28xqxXbh2mRpU-8WIFjhQ5n6U",
  authDomain: "mia-fcloud-unidad-2.firebaseapp.com",
  projectId: "mia-fcloud-unidad-2",
  storageBucket: "mia-fcloud-unidad-2.firebasestorage.app",
  messagingSenderId: "213073960951",
  appId: "1:213073960951:web:0dbe959280fbd8cb1858f2",
  measurementId: "G-TL33FH41T3"
};

const app = initializeApp(firebaseConfig);
const db = getFirestore(app);

// Consultar estudiantes
async function obtenerEstudiantes() {
  const querySnapshot = await getDocs(collection(db, "Estudiantes"));
  querySnapshot.forEach((doc) => {
    console.log(doc.id, " => ", doc.data());
  });
}

obtenerEstudiantes();
</script>