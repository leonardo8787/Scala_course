import scala.io.StdIn

/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

4. Escreva uma função que recebe dois números como entrada e retorna o
primeiro valor elevado ao expoente do segundo valor, considerando que o
segundo valor é maior ou igual a zero. Você não pode usar a função pow da
biblioteca math na sua implementação. Escreva três versões para essa função:
a. Imperativa (utilizando variáveis e laços de repetição)
b. Recursiva sem recursão de cauda
c. Recursiva com recursão de cauda
*/

object exercicio_4 {
  def main(args: Array[String]) = {
    var x:Double = 0
    var y:Double = 0
    do{
      println("Digite um número: ")
      x = StdIn.readInt()
      println("Digite um número: ")
      y = StdIn.readInt()
    }while(y <= 0)
    exp1(x,y)
    exp2(x,y)
    exp3(x,y)
  }

  def exp1(x:Double, i:Double): Unit = {
    var result = 0.0
    result = x
  }

  def exp2(x:Double, i:Double): Unit = {
    var result = 0.0
    result = x
  }

  def exp3(x:Double, i:Double): Unit = {
    var result = 0.0
    result = x
  }
}
