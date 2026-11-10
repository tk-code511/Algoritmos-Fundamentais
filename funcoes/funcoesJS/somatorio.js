function somatorio(numeros) {
  let soma = 0;
  for (let i = 0; i < numeros.length; i++) {
    soma = soma + numeros[i];
  }
  return soma;
}

let lista = []; 
let numero;

do {

  numero = parseInt(prompt("Digite um número (ou 0 para terminar):"));

  if (numero !== 0) {
    lista.push(numero);
  }
} while (numero !== 0);
console.log("O somatório é:", somatorio(lista));
