/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

5 - Escreva um programa que, dada a idade de um nadador, o classifique em uma das
categorias na tabela abaixo. Resolva essa questão usando uma expressão match.
*/

object exercicio_5 {
  def main(args: Array[String]) {
    var x = 18
    println("idade = " + x)
    x match {
      case a:Int if a>=5 && a<=7 => println("Infantil A!")
      case a:Int if a>=8 && a<=10 => println("Infantil B!")
      case a:Int if a>=11 && a<=13 => println("Juvenil A!")
      case a:Int if a>=14 && a<=17 => println("Juvenil B!")
      case _ => println("Sênior!")
    }
  }
}
