// Nome: Daniel Alves Sanches, matricula: 20203012906

import scala.annotation.tailrec

object Lista3 {
  def main(args: Array[String]): Unit = {

    println("QUESTAO 1:")
    println("Volume da esfera: " + volumeEsfera(6))

    println("\nQUESTAO 2:")
    funcaoRecursiva(5)

    println("\nQUESTAO 3:")
    println("O orario em HH:MM:SS e: " + horarioString(8500))

    println("\nQUESTAO 4a:")
    println("potencia Imperativa: " + potenciaImperativa(2,5)) // 32

    println("\nQUESTAO 4b:")
    println("potencia recursiva: " + potenciaRecursiva(2,10)) // 1024

    println("\nQUESTAO 4c:")
    println("potencia recursiva com calda: " + potenciaRecursivaComCalda(3,7)) // 2187

    println("\nQUESTAO 5:")
    val vetorGeometricoA = (12, 2)
    val vetorGeometricoB = (1, 5)

    val diferenca = diferencaVetores2Dimensoes(vetorGeometricoA, vetorGeometricoB)
    println(s"A diferenca de $vetorGeometricoA e $vetorGeometricoB: $diferenca")

    println("\nQUESTAO 6:")

    val maisAlto = (a: Int, b: Int) => if(a > b) a else b // funcao literal
    val tupla3 = (34, 5, 40)

    println(s"O valor mais alta da tupla $tupla3: " + maiorComTupla(tupla3, maisAlto))

    println("\nQUESTAO 7:")
    val num = 7
    println(s"O produto de $num * $num: " + produtoAltaOrdem(num))

    println("\nQUESTAO 8:")
    val x = 10
    println(s"Para x = $x: " + funcaoH(x, funcaoF, funcaoG))
    for(i <- 1 to 10) println(s"Para x = $i: " + funcaoH(i, funcaoF, funcaoG))
  }

  // questao 1
  def volumeEsfera(r: Int): Double = (4 * Math.PI * Math.pow(r,3))/3

  // questao 2
  @tailrec
  def funcaoRecursiva(num: Int): Unit = {
    println(num)

    if(num < 50)
      funcaoRecursiva(num + 5)
  }

  // questao 3
  def horarioString(segundos: Int): String = {
    val H = segundos/3600
    val M = (segundos - (H * 3600)) / 60
    val S = segundos % 60

    var res = ""

    if(H < 10) res = res+"0"+H else res = res+H
    res = res + ":"
    if(M < 10) res = res+"0"+M else res = res+M
    res = res + ":"
    if(S < 10) res = res+"0"+S else res = res+S

    res
  }

  //questao 4: a -> Imperativa
  def potenciaImperativa(n: Int, p: Int): Long = {
    var cont = 1
    var res = n

    if(p == 0)
      res = 1
    else {
      while(cont < p) {
        res = res * n
        cont = cont + 1
      }
    }
    res
  }

  //questao 4: b -> Recursiva sem recursao de cauda
  def potenciaRecursiva(n: Int, p: Int): Long = {
    if(p == 0) 1
    else if(p == 1) n
    else
      n * potenciaRecursiva(n, p - 1)
  }

  @annotation.tailrec
  //questao 4: c -> Recursiva com recursao de cauda
  def potenciaRecursivaComCalda(n: Int, p: Int, res: Long = 1): Long = {
    if(p == 0) 1
    else if(p == 1) res * n
    else {
      potenciaRecursivaComCalda(n, p - 1, res * n)
    }
  }

  // questao 5
  def diferencaVetores2Dimensoes(tuplaA: (Int, Int), tuplaB: (Int, Int)): (Int, Int) = {
    val diferenca = (tuplaA._1 - tuplaB._1, tuplaA._2 - tuplaB._2)
    diferenca
  }

  // questao 6
  def maiorComTupla(tupla: (Int, Int, Int), f: (Int, Int) => Int): Int = {
    val a = f(tupla._1, tupla._2)
    val b = f(a, tupla._3)
    b
  }

  // questao 7
  def produto(x: Int):Int = x*x

  // questao 7
  def produtoAltaOrdem(num: Int): Int = produto(num)

  // questao 8 -> f(x) = x + 1
  def funcaoF(x: Int): Int = x + 1

  // questao 8 -> g(x) = 2x
  def funcaoG(x: Int): Int = 2 * x

  // questao 8 -> h(x) = f(g(x)) = 2x + 1
  def funcaoH(x: Int, f: Int => Int, g: Int => Int): Int = f(g(x))
}
