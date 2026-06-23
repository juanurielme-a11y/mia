querySnapshot.forEach((doc) => {
  let estudiante = doc.data();

  if (estudiante.Edad > 40) {
    console.warn("Alerta: Estudiante mayor de 40 años", estudiante.Nombre);
  }
});
