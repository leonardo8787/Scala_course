// nome: Leonardo de Oliveira Campos - 20203006159

object atividade_6 {
  def main(args: Array[String]):Unit = {
    var x:List[Int] = List(1,2,3,4,5,6)
    reduzir(x:List[Int],funcao)
    println(reduzir(x:List[Int],funcao))
  }
  def funcao(numero1: Int, numero2: Int): Int = {
    numero1 + numero2
  }
  def reduzir(x:List[Int], funcao:(Int, Int)=>Int): Int = x match {
    case Nil => 0
    case x::xs => if(xs.nonEmpty){
      funcao(x , xs.head) + reduzir(xs.tail,funcao)
    }
    else x + reduzir(xs.tail, funcao)
  }
}
