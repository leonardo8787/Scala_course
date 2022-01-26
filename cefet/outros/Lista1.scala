// Nome: Daniel Alves Sanches - Matricula: 20203012906

object Lista1 {

  def main(args: Array[String]): Unit = {

    println("QUESTAO 1")
    val centigrado = 30
    var fhrenheit = centigradoToFhrenheit(centigrado)
    println(centigrado + " graus centigrados corresponde a " + fhrenheit + " graus fhrenheits")

    println("\nQUESTAO 2")
    val nome: String = "daniel"
    println(verificaString(nome))

    println("\nQUESTAO 3a")
    val valor: Int = 10
    println(verificaInteiroA(valor))

    println("\nQUESTAO 3b")
    println(verificaInteiroB(valor))

    println("\nQUESTAO 4")
    val altura = 1.83
    val peso = 60.0
    println(classificacaoIMC(IMC(altura, peso)))

    println("\nQUESTAO 5")
    val idade = 15
    println(classifacaoNadador(idade))

    println("\nQUESTAO 6")
    val a = 9
    val b = -12
    val c = 4
    verificaDelta(a, b, c)

    println("\nQUESTAO 7")
    val exp = (14, "*", 2)

    exp match {
      case (num1, "+", num2) =>  println(num1 + num2)
      case (num1, "-", num2) =>  println(num1 - num2)
      case (num1, "*", num2) =>  println(num1 * num2)
      case (num1, "/", num2) =>  println(num1 / num2)
      case (num1, "/", num2) =>  println(num1 / num2)
      case (_, _, _) =>  println("Operação não encontrada")
      case _ =>  println("Expressão não permitida")
    }

    println("\nQUESTAO 8")
    val tipo: Any = "daniel alves"
    println(verificaTipo(tipo))

  }

  // funcao utilizada na questao 1
  def centigradoToFhrenheit(c: Int): Double = {
    (c * 9/5) + 32
  }

  // funcao utilizada na questao 2
  def verificaString(nome: String): String = nome.isEmpty match {
      case true =>  "n/a"
      case _ => nome
    }

  // funcao utilizada na questao 3a
  def verificaInteiroA(valor: Int): String = {
    if(valor > 0)
      "maior"
    else if(valor == 0)
      "igual"
    else
      "menor"
  }

  // funcao utilizada na questao 3b
  def verificaInteiroB(valor: Int): String = valor match {
    case _ if valor > 0 => "maior"
    case 0 => "igual"
    case _ => "menor"
  }

  // funcao utilizada na questao 4
  def IMC(altura: Double, peso: Double): Double = peso / (altura * altura)

  // funcao utilizada na questao 4
  def classificacaoIMC(imc: Double): String = {
    if(imc < 18.5)
        "Abaixo do peso"
    else if(imc >= 18.5 && imc <= 24.9)
        "Peso normal"
    else if(imc >= 24.9 && imc <= 30)
        "Sobrepeso"
    else
        "Obesidade"
  }

  // funcao utilizada na questao 5
  def classifacaoNadador(idade: Int): String = idade match {
    case _ if idade >= 5 && idade <= 7 => "Infantil A"
    case _ if idade >= 8 && idade <= 10 => "Infantil B"
    case _ if idade >= 11 && idade <= 13 => "Juvenil A"
    case _ if idade >= 14 && idade <= 17 => "Juvenil B"
    case _ if idade >= 18 => "Senior"
    case _ => "Idade nao possui categoria"
  }

  // funcao utilizada na questao 6
  def delta(a: Int, b: Int, c: Int): Int = b * b - (4 * a * c)

  // funcao utilizada na questao 6
  def verificaDelta(a: Int, b: Int, c: Int): Unit = {
    val d = delta(a, b, c)

    if(d < 0)
      println("Não existe raiz real")
    else if(d == 0) {
      bhaskara(a, b, math.sqrt(d), bool = false)
      println("Raiz única")
    } else {
      bhaskara(a, b, math.sqrt(d), bool = true)
    }
  }

  // funcao utilizada na questao 6
  def bhaskara(a: Int, b: Int, delta: Double, bool: Boolean): Unit = {
    var x = (-b - delta) / (2 * a)
    println("x1: " + x)

    if(bool) {
      x = (-b + delta) / (2 * a)
      println("x2: " + x)
    }
  }

  // funcao utilizada na questao 8
  def verificaTipo(tipo: Any): String = tipo match {
      case t: Int => "Número"
      case t: String => "String"
      case t: Boolean => "Boolean"
      case outro => {
        println(outro.getClass)
        "Outro"
      }
  }

}
