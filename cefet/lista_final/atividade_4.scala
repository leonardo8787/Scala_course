object atividade_4 {
  def main(args: Array[String]) = {
    var x:List[Any] = List("ana",22,"joão",13,"marcos",25)
    func(x:List[Any])
  }

  def func(x:List[Any]): Unit = {
    x.collect{ case (a: Int) => println(a)}
  }
}
