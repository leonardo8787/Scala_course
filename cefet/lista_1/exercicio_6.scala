import scala.math.sqrt

/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

6 - fórmula de baskara
*/

object exercicio_6{
  def main(args: Array[String]){
    println("Fórmula de Baskara")
    println("f(x)=2x²+4x+6")

    val a = 2
    val b = 4
    val c = 6

    var baskara = ( ((-b)^2) + 4*a*c )

    var x1 = ( -b + (sqrt(baskara)) )/2*a
    println("x1: " + x1)
    var x2 = ( -b - (sqrt(baskara)) )/2*a
    println("x2: " + x2)

    if ( baskara < 0 ) {
      println("não existe raizes reais!")
    } else if ( baskara == 0 ) {
      println("existe uma raiz real!")
    } else if ( baskara > 0 ){
      println("existem duas raizes reais!")
    }
  }
}
