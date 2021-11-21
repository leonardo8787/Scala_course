/*
aluno: Leonardo de Oliveira Campos - Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais

4. Escreva uma expressão que gere uma coleção com todos os números entre 1 e
1000 que possuem o número 6. Sua expressão não pode ter mais do que uma
linha. Dica: trate o número como uma String (use o método toString()).
*/

object exercicio_4 {def main(args: Array[String]) = {var a=1; while (a<1000) {a += 1; if (a == '6') println(a.toString())}}}
