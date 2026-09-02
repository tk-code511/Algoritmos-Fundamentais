function fibonacci(n) {
  let sequencia = [0, 1];
  for (let i = 2; i < n; i++) {
    let proximoNumero = sequencia[i - 1] + sequencia[i - 2];
    sequencia.push(proximoNumero);
  }
  return sequencia;
}

let quantidadeDeTermos = 8; 

console.log("Os primeiros " + quantidadeDeTermos + " termos de Fibonacci são:");
console.log(fibonacci(quantidadeDeTermos));
