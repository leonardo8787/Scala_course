import scala.collection.mutable.ListBuffer
// nome: Leonardo de Oliveira Campos - 20203006159

object atividade_5 {
  def main(args: Array[String]):Unit = {
    val lista:List[Int] = List(1,2,3,4);
    val funcao=(x:Int)=>(x/2);
    var teste=mapear(lista,funcao);
    println(teste);}
  def mapear(x:List[Int], funcao:(Int)=>Int) :Unit = {
    val result = ListBuffer[Int]();
    for(i <- 0 until x.size-1){result += funcao(x(i));
      return result.toList}}
}
