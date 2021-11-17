/*
Aluno: Leonardo de Oliveira Campos
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

5 - Escreva um programa que, dada a idade de um nadador, o classifique em uma das
categorias na tabela abaixo. Resolva essa questão usando uma expressão match.
*/

object MatchTest1 extends App {
  def matchTest(x: Int): Int = x match {
    println("idade: 14")
    idade = 14
    case 1 => 5
    case 2 => 8
    case 3 => 11
    case 4 => 14
    case _ => 18
  }
  println(matchTest(5))
}