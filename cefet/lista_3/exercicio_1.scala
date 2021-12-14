import scala.io.StdIn

/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

1 - Escreva uma função que compute o volume de uma esfera dado o seu raio.
*/

object exercicio_1 {
  def main(args: Array[String]) = {
    var x:Double = 0
    println("Digite um valor: ")
    x = StdIn.readInt()
    esfera(x)
  }

  def esfera(x:Double): Unit = {
    var result = 0.0
    result = (4/3)*3.14*x*x
    println(result)
  }
}
