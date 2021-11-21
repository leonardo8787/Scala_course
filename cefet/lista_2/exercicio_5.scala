import scala.io.StdIn
/*
aluno: Leonardo de Oliveira Campos - Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais

5. Elabore um programa que faça a leitura de vários números inteiros até que se
digite um número negativo. O programa deve informar o maior e o menor
número lido. Utilize a função "scala.io.StdIn.readInt()" para fazer a leitura de
um número inteiro.
*/

object exercicio_5 {
  def main(args: Array[String]) = {
    var x = 1
    do {
      println("Digite um número: ")
      x = StdIn.readInt()
    }while(x > 0)
  }
}
