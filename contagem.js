function contagem(dados, n) {
  let contador = 0;
  let primeiroDado = dados[0];
  
  for (let i = 0; i < dados.length; i++) {
    let valorAtual = dados[i];
    if (valorAtual >= primeiroDado && valorAtual <= n) {
      contador = contador + 1;
    }
  }
  return contador;
}

let conjunto = [5, 12, 6, 8, 10, 3];
let valorN = 9;

let resultado = contagem(conjunto, valorN);
console.log("Existem " + resultado + " números entre " + conjunto[0] + " e " + valorN + " nesta lista.");
