object atividade_5 {
  def main(args: Array[String]):Unit = {
    var x:List[Int] = List(1,2,3,4,5,6)
    //funcao(numero1 = 1,numero2 =2)
    filtrar(x:List[Int],funcao)
    println(filtrar(x:List[Int],funcao))
  }
  def funcao(numero1: Int, numero2: Int): Int = {
    numero1 + numero2
  }
  def filtrar(x:List[Int], funcao:(Int, Int)=>Int): Int = x match {
    case Nil => 0
    case x::xs => if(xs.nonEmpty){
      funcao(x , xs.head) + filtrar(xs.tail,funcao)
    }
    else x + filtrar(xs.tail, funcao)
  }
}
