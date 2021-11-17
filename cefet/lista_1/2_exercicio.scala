/*
Aluno: Leonardo de Oliveira Campos
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

2 - Dado uma String nome, escreva uma expressão match que retornar a mesma string
se ela não estiver vazia, ou então "n/a" se ela estiver vazia.
*/

object MatchTest1 extends App {
  def matchTest(x: Int): String = x match {
    case 1 => ""
    case 2 => "n/d"
    case _ => "teste"
  }
  println(matchTest(3))
}