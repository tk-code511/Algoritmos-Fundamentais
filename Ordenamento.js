function quicksort(lista, inicio, fim) {

  if (inicio < fim) {
    let pivo = lista[fim];
    let pivoIndex = inicio;

    for (let i = inicio; i < fim; i++) {
      

      if (lista[i] <= pivo) {

        let temporario = lista[i];
        lista[i] = lista[pivoIndex];
        lista[pivoIndex] = temporario;
        
        pivoIndex++;
      }
    }
    

    let temporario = lista[pivoIndex];
    lista[pivoIndex] = lista[fim];
    lista[fim] = temporario;
    

    quicksort(lista, inicio, pivoIndex - 1);

    quicksort(lista, pivoIndex + 1, fim);
  }
}

let listaBaguncada = [];

let numero;

do {
  numero = parseInt(prompt("Digite um número (ou 0 para terminar):"));
  if (numero !== 0) {
    listaBaguncada.push(numero);
  }
} while (numero !== 0);

console.log("Lista original: " + listaBaguncada);
quicksort(listaBaguncada, 0, listaBaguncada.length - 1);
console.log("Lista ordenada: " + listaBaguncada);
