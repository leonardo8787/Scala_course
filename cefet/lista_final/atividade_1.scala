import scala.io.StdIn

object atividade_1 {
  def main(args: Array[String]) = {
    var x:Int = 0
    println("Digite um valor: ")
    x = StdIn.readInt()
    divisor(x)
  }

  def divisor(x:Int): Unit = {
    var result = 0
    result = x
    while (result > 1) {
      result -= 1
      if ((result % 2) == 0){
        println(result)
      }
    }
  }
}
