/*
aluno: Leonardo de Oliveira Campos - Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais

1. Faça um programa que dado um número inteiro positivo n, imprima todos os
números naturais de 0 até N em ordem decrescente.
*/

object exercicio_1 {
  def main(args: Array[String]) = {
    var n = 10
    var i = 10
    while (n>0) {
      n -= 1;
      println(i)
      i -= 1;

    }
  }
}