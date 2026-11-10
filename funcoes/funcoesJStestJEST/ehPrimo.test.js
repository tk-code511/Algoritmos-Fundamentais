const ehPrimo = require("../funcoes/ehPrimo");

test("deve retornar true para um número primo (ex: 17)", () => {
  expect(ehPrimo.ePrimo(17)).toBe(true);
});

test("deve retornar false para um número não primo (ex: 4)", () => {
  expect(ehPrimo.ePrimo(4)).toBe(false);
});
