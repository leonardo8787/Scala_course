/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

8 - Escreva uma expressão match que dado um valor de qualquer tipo (Any), retorna a
String "Número", se o valor for de algum dos tipos numéricos do Scala; "String" se o
valor for uma String; "Boolean", se o valor for do tipo booleano; e "Outro" se o valor
for de qualquer outro tipo, além de imprimir o tipo real do valor.
*/

object exercicio_8{
  def main(args: Array[String]){
    val x: Any = true
    x match {
      case x: String => println(s"String: '$x'")
      case x: Double => println(f"Double: $x%.2f")
      case x: Float => println(f"Float: $x%.2f")
      case x: Long => println(s"Long: ${x}|")
      case x: Int => println(s"Int: ${x}i")
      //case x: function => println("função")
      case x: Boolean => println("boolean")
      case _ => println("não definida!")
    }
  }
}
