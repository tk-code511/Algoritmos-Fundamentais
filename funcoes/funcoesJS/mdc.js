function mdc(a, b) {
  let resto;
  while (b !== 0) {
    resto = a % b;
    a = b;
    b = resto;
  }
  return a;
}

let numero1 = 48;
let numero2 = 18;

console.log("O MDC entre " + numero1 + " e " + numero2 + " é: " + mdc(numero1, numero2));
