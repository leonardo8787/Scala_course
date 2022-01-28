// nome: Leonardo de Oliveira Campos - 20203006159

object atividade_7 {
  def main(args: Array[String]):Unit = {
    val cliente = new Cliente
  }
}

class Console(val modelo: String, ano: Int, midia: List[String], resolucao: Int){
  override def toString = s"Console $modelo do ano $ano com midia $midia, resolução $resolucao"
}

class Game(nome_jogo: String, ano_lancamento_jogo: Int, suportado: List[Console]){
  def isSupported(nome: Console): Boolean = {
    var y:Boolean = false
    suportado.foreach( x => {
      if (nome.equals(x)){
       y = true
      }
    } )
    y
  }
  override def toString = s"nome do jogo: $nome_jogo; ano de lançamento: $ano_lancamento_jogo; Consoles suportados: $suportado"
}

class Cliente {
  val play_1 = new Console("playstation", 2002, List("física"), 1260)
  val xbox = new Console("xbox", 2006, List("física"), 1960)
  val nitendo = new Console("nitendo", 1994, List("física"), 720)

  val game1 = new Game("mario", 1990, List(play_1, xbox, nitendo))
  val game2 = new Game("god of for", 1995, List(play_1))
  val game3 = new Game("call of dutty", 2004, List(xbox))
  val game4 = new Game("zelda", 1992, List(nitendo))
  val game5 = new Game("teste",2020,List(xbox))
  //println(game1)

  val consoles:List[Console] = List(play_1, xbox, nitendo)
  val jogos:List[Game] = List(game1, game2, game3, game4)

  consoles.foreach(x => {
    jogos.foreach(y => {
      if (y.isSupported(x)) {
        println("Consoles: " + x + " Jogo: " +  y)
      }
    })
    println()
  })
}