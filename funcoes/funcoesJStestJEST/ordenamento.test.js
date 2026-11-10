const Ordenamento = require("../funcoes/Ordenamento");

test("deve ordenar corretamente um array desordenado", () => {
  expect(
    Ordenamento.Ordenamento([34, 7, 23, 32, 5, 62, 1, 9, 5, 0, -3]),
  ).toMatchObject([-3, 0, 1, 5, 5, 7, 9, 23, 32, 34, 62]);
});

test("deve manter a ordem de um array que já está ordenado", () => {
  expect(Ordenamento.Ordenamento([1, 2, 3, 4, 5])).toMatchObject([
    1, 2, 3, 4, 5,
  ]);
});
