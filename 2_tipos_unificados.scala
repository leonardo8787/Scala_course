object TiposUnificados extends App {
	val set = new scala.collection.mutable.LinkedHashSet[Any]
	set += "Sou uma string"    //adiciona uma string ao set
	set += 732                 //adiciona um número
	set += 'c'                 //adiciona um caractere
	set += true                //adiciona um valor booleano
	set += main _             //adiciona a função main
	val iter: Iterator[Any] = set.iterator
	while (iter.hasNext) {
		println(iter.next.toString())
	}
}
