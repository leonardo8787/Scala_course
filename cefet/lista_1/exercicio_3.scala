/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

3 - Dado um valor inteiro, escreva uma expressão para retornar "maior" se ele for
maior que zero, "igual" se ele for igual a zero e "menor" se for menor que zero. Escreva
essa expressão usando if..else e depois escreva utilizando match.
*/

object exercicio_3 {
  def main(args: Array[String]) {
    var x = 0

    if( x > 0 ){
      println("x é maior que zero");
    } else if( x == 0 ){
      println("x é igual a zero");
    } else if( x < 0 ){
      println("x é menor que zero");
    } else{
      println("erro!!");
    }
    x match {
      case 0 => println("igual a zero!")
      case a:Int if a<0 => println("menor que zero!")
      case _ => println("maior que zero!")
    }
  }
}
