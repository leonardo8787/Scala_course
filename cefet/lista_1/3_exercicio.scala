/*
Aluno: Leonardo de Oliveira Campos
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

3 - Dado um valor inteiro, escreva uma expressão para retornar "maior" se ele for
maior que zero, "igual" se ele for igual a zero e "menor" se for menor que zero. Escreva
essa expressão usando if..else e depois escreva utilizando match.
*/

object MatchTest1 extends App {
  def matchTest(x: Int): Int = x match {
    case 1 => 1
    case 2 => 2
    case _ => 3
  }
  println("maior: "+matchTest(3))
}


object Demo {
   def main(args: Array[String]) {
      var x = 30;

      if( x > 0 ){
         println("x é maior que zero");
      } else if( x == 0 ){
         println("x é igual a zero");
      } else if( x < 0 ){
         println("x é menor que zero");
      } else{
         println("erro!!");
      }
   }
}