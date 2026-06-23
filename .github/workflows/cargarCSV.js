window.cargarCSV = async () => {
  const file = document.getElementById("csvFile").files[0];
  const text = await file.text();
  const lines = text.split("\n");
  for (let i = 1; i < lines.length; i++) {
    let data = lines[i].split(",");
    const estudiante = {
      Nombre: data[0],
      Apellido: data[1],
      Edad: parseInt(data[4]),
      Semestre: parseInt(data[6])
    };
    const id = Date.now().toString();
    await setDoc(doc(db, "Estudiantes", id), estudiante);
  }
};
