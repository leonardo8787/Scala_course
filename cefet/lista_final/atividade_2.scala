// nome: Leonardo de Oliveira Campos - 20203006159

object atividade_2 {
  def main(args: Array[String]) = {
    var names = List("Joel", "Chris", "Leonardo")
    cont(names:List[String])
  }

  def cont(names:List[String]): Unit = {
    var maior:Int = 0
    var nome_maior:String = "teste"
    for(x <- names){
      if (x.size >= maior) {
        maior = x.size
      }
    }
    println("A String de maior tamanho contém " + maior + " caracteres")
  }
}
