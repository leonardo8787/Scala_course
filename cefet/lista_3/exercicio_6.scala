/*
Aluno: Leonardo de Oliveira Campos  -  Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais
Engenharia de COmputação - 4° período

6. Escreva uma função literal (lambda) que recebe dois inteiros e retorna o
número mais alto. Em seguida, escreva uma função de alta ordem que recebe
uma tupla com três valores inteiros e a função literal como entrada e a usa para
retornar o maior dos três valores na tupla.
*/

object exercicio_6 {
  def math(x: Int, y:Int, f: (Int, Int)=> Int): Int = f(x, y)
  //def tupla(x: Tupla, f: (Tupla)=>(Tupla) = f(Tupla))
  def main(args: Array[String]): Unit = {
    val result = math(50, 20, (x,y)=>x max y)
    println(result)
  }
}
