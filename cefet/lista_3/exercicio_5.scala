import scala.io.StdIn

/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

5. Escreva uma função que recebe e calcula a diferença entre dois vetores
geométricos de duas dimensões (par x e y) e retorna como resultado um vetor
geométrico de duas dimensões. Use tuplas para representar os vetores
geométricos.
*/

object exercicio_5 {
  def main(args: Array[String]): Unit = {
    var a: (Int, Int) = (3,6)
    var b: (Int, Int) = (4,8)
    //println("Digite um valor: ")
    //x = StdIn.readInt()
    println(vetor(a, b))
  }

  def vetor(x:(Int, Int),y:(Int, Int)): (Int, Int) = {
    var result: (Int, Int) = (0,0)
    println(s"tupla a:${x._1} , ${x._2}")
    println(s"tupla b:${y._1} , ${y._2}")
    result = (x._1 - y._1, x._2 - y._2)
    result
  }
}
