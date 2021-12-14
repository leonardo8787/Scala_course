import scala.io.StdIn

/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

3. Escreva uma função que receba um valor em segundos e retorne uma String
descrevendo o valor em horas, minutos e segundos no formato HH:MM:SS. Por
exemplo, se entrar com o valor de 8500 segundos, a função deve retornar
2:21:40.
*/

object exercicio_3 {
  def main(args: Array[String]) = {
    var x:Double = 0
    println("Digite os segundos: ")
    x = StdIn.readInt()
    hora(x)
  }

  def hora(x:Double): Unit = {
    var result = 0.0
    result = (x/60)/60
    println(result + "horas")
  }
}
