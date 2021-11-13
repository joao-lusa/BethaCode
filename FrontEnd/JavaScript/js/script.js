var peso1 = document.querySelector("#peso1").textContent;
var altura1 = document.querySelector("#altura1").textContent;
var imc1 = peso1 / (altura1 * altura1);
document.querySelector("#imc1").textContent = imc1.toFixed(2)

var peso2 = document.querySelector("#peso2").textContent;
var altura2 = document.querySelector("#altura2").textContent;
var imc2 = peso2 / (altura2 * altura2);
document.querySelector("#imc2").textContent = imc2;