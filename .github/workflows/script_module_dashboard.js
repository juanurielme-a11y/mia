let virtual = 0;
let presencial = 0;

querySnapshot.forEach((doc) => {
  let est = doc.data();

  if (est.Jornada === "Virtual") virtual++;
  else presencial++;
});

console.log("Virtual:", virtual);
console.log("Presencial:", presencial);
