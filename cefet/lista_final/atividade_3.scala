object atividade_3 {
  def main(args: Array[String]) = {
    var x:List[Int] = List(1,2,3,4,5,6,7,8)
    func(x)
  }

  def func(x:List[Int]): Unit = {
    var soma:Int = 0
    for(y <- x){
      soma += y
    }
    println(soma)
  }
}
