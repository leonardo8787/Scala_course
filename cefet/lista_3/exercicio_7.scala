/*
  Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
  Centro Federal de Educação Tecnológica de Minas Gerais
  Engenharia de COmputação - 4° período

  7. Escreva uma função de alta ordem que recebe um número inteiro como
  entrada e retorna uma função. A função retornada deve receber um único
  argumento inteiro (x, por exemplo) como entrada e retornar o produto de x
  pelo número inteiro passado para a função de alta ordem.
 */

object exercicio_7 {

  def math_1(x: Int): Int = x*x

  def math_2(y: Int) = math_1(y)

  def main(args: Array[String]): Unit = {
    println(math_2(2))
  }

}
