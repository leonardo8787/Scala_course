/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

8. Escreva uma função de alta ordem que recebe duas funções, f e g, como
entrada e retornar uma função h que é a composição de f e g como saída. As funções f e g recebem um número inteiro como entrada e retornam um
número inteiro como saída. Por exemplo, dado f(x) = x + 1 e g(x) = 2x, sua
função deve retornar uma função h tal que h(x) = f(g(x)), ou seja, h(x) = 2x + 1.
*/

object exercicio_8 {
  def fx(x: Int): Int = x + 1

  def gx(x: Int): Int = 2 * x

  def hx(fx: Int => Int, gx: Int => Int): Int = fx(gx(4))

  //def hx():
  def main(args: Array[String]): Unit = {
    println(fx(2))
    println(gx(3))
    println(hx(fx,gx))
  }
}
