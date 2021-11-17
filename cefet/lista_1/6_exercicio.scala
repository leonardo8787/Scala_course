/*
Aluno: Leonardo de Oliveira Campos
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

6 - fórmula de baskara
*/

object Hello {
  def main(args: Array[String]) = {
    println("Fórmula de Baskara")
    println("f(x)=2x²+4x+6")

    var a = 2
    var b = 4
    var c = 6

    var baskara = ( ((-b)^2) + 4*a*c )

    var x1 = ( -b + (baskara^0.5) )/2*a 
    println("x1: " + x1)
    var x2 = ( -b - (baskara^0.5) )/2*a 
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