import scala.io.StdIn

/*
aluno: Leonardo de Oliveira Campos - Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais

7. Em matemática, o número harmônico designado por Hn define-se como o
enésimo termo da série harmônica. Ou seja:
Apresente um programa que calcule o valor de qualquer Hn.
*/

object exercicio_7 {
  def main(args: Array[String]) = {
    var x:Double = 0
    var cont = 0
    while (cont<=25) {
      cont+=1
      x += 1.0/cont
      println(x)
    }
    println(x)
  }
}