/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

7 - Dada uma tupla contendo um número inteiro, uma String e outro número inteiro,
como (1, "+", 2), por exemplo, escreva uma expressão match que avalia a expressão
  matemática representada na tupla, onde a String representa a operação matemática a
  ser realizada (considere +, -, * e /). Por exemplo, a expressão deve retornar 3 para a
tupla (1, "+", 2) e 12 para a tupla (3, "*", 4).
*/

object exercicio_7 {
  def main(args: Array[String]): Unit = {
    val x = (1,"+",2)
    x match {
      case (a,"+",b) => println("adição: " + (a+b))
    }
  }
}

