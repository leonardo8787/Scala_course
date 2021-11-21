import scala.io.StdIn

/*
aluno: Leonardo de Oliveira Campos - Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais

8. Uma empresa quer fazer uma pesquisa de mercado para saber se as pessoas
gostaram ou não de um novo produto lançado. Nesse formulário, a empresa
quer saber o sexo do entrevistado (H – Homem; M – Mulher) e sua resposta
sobre se ela gostou do produto (S – Sim; N - Não). Faça um programa que
receba essas informações de 10 pessoas. Então, calcule e mostre:
a. O número de pessoas que responderam sim
b. O número de pessoas que responderam não.
c. O número de mulheres que responderam sim.
d. A percentagem de homens que responderam não, entre todos os
homens analisados.
Utilize a função "scala.io.StdIn.readLine()" para fazer a leitura de uma String.
*/

object exercicio_8 {
  def main(args: Array[String]) = {
    var homen = 0
    var mulher = 0
    var genero = "homen"
    var resposta = "n"
    var sair = "n"
    var gostou = 0
    var y = 1
    var gostou2 = 0
    var gostouHomen = 0
    var gostouMulher = 0
    var naoGostouHomen = 0
    while(y<10){
      y+=1
      println("-----pesquisa----")
      println("vocẽ é homen ou mulher? ")
      genero = StdIn.readLine()
      if (genero == homen){
        homen += 1
        println("você gostou do produto? sim-nao")
        resposta = StdIn.readLine()
        if(resposta == "sim"){
          gostou += 1
          gostouHomen += 1
        }else{
          gostou2 +=1
          naoGostouHomen += 1
        }
      } else {
        mulher += 1
        println("você gostou do produto? sim-nao")
        resposta = StdIn.readLine()
        if(resposta == "sim"){
          gostou += 1
          gostouMulher += 1
        }else{
          gostou2 +=1
        }
      }
    }
    println("Pessoas que responderam 'sim': " + gostou)
    println("O número de pessoas que responderam 'não': " + gostou2 )
    println("O número de mulheres que responderam 'sim': " + gostouMulher)
    println("A percentagem de homens que responderam não, entre todos os\nhomens analisados: " + naoGostouHomen/100 + "%")
  }
}