object exemplo {
  class Console(val modelo: String, ano: Int, midia: String, suporte: String){
    override def toString = s"Console $modelo do ano $ano com midia $midia e suporte $suporte"
  }
  val Console1 = new Console(modelo = "Ps4", 1970, "fisica", "playstation")
  println(Console1)
}
