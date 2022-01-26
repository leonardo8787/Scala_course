
object atividade_7 {
  def main(args: Array[String]):Unit = {
    val Console = new Console(modelo = "Ps4", 1970, "fisica", "playstation", 1720)
    println(Console)
    val Game = new Game("mario", 2004, List("nitendo", "agario", "playstation5"))
    println(Game)
  }
}

object atividade_8 {
  def main(args: Array[String]):Unit = {
    println("Carrinho de Compras")
    val Produto = new Produto()
    println(Produto)
    val ItemCarrinho = new ItemCarrinho()
    println(ItemCarrinho)
    val CarrinhoCompras = new CarrinhoCompras()
    println(CarrinhoCompras)
    val Cliente = new Cliente()
    println(Cliente)
  }
}

object atividade_9 {
  def main(args: Array[String]):Unit = {

  }
}

object atividade_10 {
  def main(args: Array[String]):Unit = {
    val Veiculo = new Veiculo()
    println(Veiculo)
  }
}

// =============================== atividade 7 =====================
class Console(val modelo: String, ano: Int, midia: String, suporte: String, resolucao: Int){
  override def toString = s"Console $modelo do ano $ano com midia $midia e suporte $suporte, resolução $resolucao"
}

class Game(nome_jogo: String, ano_lancamento_jogo: Int, suportado: List[String]){
  override def toString = s"nome do jogo: $nome_jogo; ano de lançamento: $ano_lancamento_jogo; Consoles suportados: $suportado"
}


// =============================== atividade 8 =====================
class Produto(){
  override def toString = s""
}

class ItemCarrinho(){
  override def toString = s""
}

class CarrinhoCompras(){
  override def toString = s""
}

class Cliente(){
  override def toString = s""
}


// =============================== atividade 9 =====================




// =============================== atividade 10 =====================
class Veiculo(){
  override def toString = s""
}


