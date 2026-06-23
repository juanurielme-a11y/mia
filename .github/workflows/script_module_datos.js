<div id="listaEstudiantes"></div>

<script>
async function mostrarEstudiantes() {
  const contenedor = document.getElementById("listaEstudiantes");
  const querySnapshot = await getDocs(collection(db, "Estudiantes"));

  querySnapshot.forEach((doc) => {
    let data = doc.data();
    contenedor.innerHTML += `
      <p>
        ${data.Nombre} ${data.Apellido} - 
        Edad: ${data.Edad} - 
        Semestre: ${data.Semestre}
      </p>
    `;
  });
}
</script>
``
