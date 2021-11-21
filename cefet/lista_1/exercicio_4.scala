/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

4- Dada a altura (em metros) e o peso (em quilos) de uma pessoa, escreva um
programa que calcula o seu IMC (IMC = peso / altura 2 ). Em seguida, mostre a
classificação da pessoa de acordo com a tabela a seguir. Resolva essa questão usando
uma expressão if..else.
*/


object exercicio_4 {
  def main(args: Array[String]) = {
    println("Calculadora IMC")
    var altura = 2
    var peso = 70
    var imc = (peso/altura*2)
    println("IMC = " + imc)

    if (imc == 18.5) {
      println("abaixo do peso")
    } else if (imc > 18.5 || imc < 24.9) {
      println("peso normal")
    } else if (imc > 24.9 || imc < 30){
      println("sobrepeso")
    } else if (imc > 30){
      println("obesidade")
    }
  }
}
