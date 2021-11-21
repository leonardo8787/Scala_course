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
    var n = 0
    println("Digite o valor limite: ")
    n = StdIn.readInt()
    var x = 0
    var funcao = 1/x
    var soma = 0
    while (x <= n) {
      x+=1;
      funcao = (1/(1+x))
      soma = soma + funcao
      println(soma)
    }
    println(soma)
  }
}