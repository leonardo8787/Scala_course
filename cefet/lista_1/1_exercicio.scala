/*
Aluno: Leonardo de Oliveira Campos
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

1 - Dada uma temperatura em graus Centígrados, escreva uma expressão de conversão
de Centígrado para Fahrenheit usando a fórmula (c * 9/5) + 32).
*/

object Hello {
  def main(args: Array[String]) = {
    println("Conversão")
    var cent = 2
    var fahr = ((cent * 9/5)+32)
    var texto = "A conversão é: "
    var texto2 = " Fahrenheit"
    println(texto + (fahr) + texto2)
  }
}