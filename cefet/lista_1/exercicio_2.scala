/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

2 - Dado uma String nome, escreva uma expressão match que retornar a mesma string
se ela não estiver vazia, ou então "n/a" se ela estiver vazia.
*/

object exercicio_2{
  def main(args: Array[String]): Unit = {
    val nome = "leonardo"
    println("nome: " + nome)
    nome match {
      case a:String if nome!="" => println(nome)
      case a:String if nome=="" => println("n/d")
    }
  }
}
