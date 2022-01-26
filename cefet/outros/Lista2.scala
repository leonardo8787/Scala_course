// Nome: Daniel Alves Sanches - Matricula: 20203012906

import scala.io.StdIn

object Lista2 {
  def main(args: Array[String]): Unit = {

    val n = 15
    println("QUESTAO 1:")
    numerosNaturais(n)

    println("\n\nQUESTAO 2:")
    val impares = for(i <- 1 to 50 if i%2 != 0) yield i
    for(i <- impares) print(i + " ")

    println("\n\nQUESTAO 3:")
    val multiplos = for(i <- 1 to 1000 if i%2 == 0 || i%3 == 0) yield i
    for(m <- multiplos) print(m + " ")

    println("\n\nQUESTAO 4:")
    val numero6 = for (i <- 1 to 1000; str = i.toString; if str.contains('6')) yield str
    for(n <- numero6) print(n + ' ')

    println("\n\nQUESTAO 5:")
    maiorMenor()

    println("\n\nQUESTAO 6:")
    primo()

    println("\nQUESTAO 7:")
    println(numeroHarmonico(25))

    println("\nQUESTAO 8:")
    pesquisaMercado()
  }

  // questao 1
  def numerosNaturais(n: Int): Unit =  {
    var N = n
    do {
      print(s"$N ")
      N -= 1
    } while (N >= 0)
  }

  // questao 5
  def maiorMenor(): Unit = {
    var numero = 0
    var maior = 0
    var menor = 0

    print("Informe um numero: ")
    numero = StdIn.readInt()

    maior = numero
    menor = numero

    while (numero >= 0) {
      print("Informe um numero: ")
      numero = StdIn.readInt()

      if(numero > maior) maior = numero
      else if(numero < menor && numero >= 0) menor = numero
    }

    if(maior == menor && maior < 0)
      println("O primeiro valor lido é negativo")
    println(s"maior: $maior, menor: $menor")
  }

  // questao 6
  def primo(): Unit = {
    var num = 0

    do {
      print("\nInforme um número natural: ")
      num = StdIn.readInt()

      if(num < 0)
          println("\nO número não é natural, tente novamente!")
    } while(num < 0)

    if(num < 0)
      println("Numero negativo")
    else {
      var cont = 0
      var i = 1

      while (cont <= 2 && i <= num) {
        if (num % i == 0)
          cont += 1
        i += 1
      }
      cont match {
        case 2 => println(s"O numero $num é primo")
        case _ => println(s"O numero $num não é primo")
      }
    }
  }

  // quetao 7
  def numeroHarmonico(n: Int): Double = {
    var soma: Double = 0
    for(i <- 1 to n) {
      soma += 1.0/i
    }
    soma
  }

  // questao 8
  def pesquisaMercado(): Unit = {
    var sexo = ""
    var resposta = ""
    var controle = false

    var quantHomem = 0
    var quantHomemS = 0
    var quantHomemN = 0
    var quantMulher = 0
    var quantMulherS = 0
    var quantMulherN = 0

    var cont = 10
    while(cont > 0) {
      println("\nPessoas restantes: " + cont)

      do {
        print("\nInforme o sexo (H – Homem; M – Mulher): ")
        sexo = StdIn.readLine()

        print("Informe o a resposta (S – Sim; N - Não): ")
        resposta = StdIn.readLine()

        if(!(sexo.equals("H") || sexo.equals("M")) || !(resposta.equals("S") || resposta.equals("N"))) {
          println("\nO valor para sexo ou respota é invalida. Tente novamente!")
          controle = true
        } else
            controle = false
      } while (controle)

      if(sexo.equals("H")) {
        quantHomem += 1

        if(resposta.equals("S"))
          quantHomemS += 1
        else
          quantHomemN += 1
      }
      else if(sexo.equals("M")) {
        quantMulher += 1

        if(resposta.equals("S"))
          quantMulherS += 1
        else
          quantMulherN += 1
      }
      cont -= 1
    }

    println("Quantidade de pessoas que responderam sim: " + (quantHomemS + quantMulherS))
    println("Quantidade de pessoas que responderam não: " + (quantHomemN + quantMulherN))
    println("Quantidade de mulheres que responderam sim: " + quantMulherS)
    println("Porcentagem dos homens que responderam não: " + (quantHomemN * 100.0 / quantHomem) + "%")
  }
}
