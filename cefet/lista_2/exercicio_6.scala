import scala.io.StdIn
/*
aluno: Leonardo de Oliveira Campos - Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais

6. Faça um programa que leia um número inteiro e informe se esse número é
primo ou não. Os números primos são os números naturais que podem ser
divididos por apenas dois fatores: o número um e ele mesmo.
*/

object exercicio_6 {
  def main(args: Array[String]) = {
    var x = 1
    do {
      println("Digite um número: ")
      x = StdIn.readInt()
      if ((x % 2) != 0){
        println("primo!")
      }else{
        println("não primo!")
      }
    }while(x > 0)
  }
}
