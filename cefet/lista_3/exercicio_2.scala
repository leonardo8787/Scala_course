/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

2. Escreva uma função recursiva que imprima os valores de 5 a 50 com passo 5,
sem usar loops for ou while.
*/

object exercicio_2 {
  def main(args: Array[String]) {
    var n = 5
    countUp(n)
  }

  def countUp(n:Int):Unit = {
    if(n <= 50){
      countUp(n+5)
      println(n)
    }
  }
}
