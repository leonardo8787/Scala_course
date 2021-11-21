/*
aluno: Leonardo de Oliveira Campos - Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais

2. Escreva uma expressão que gere uma coleção com os 50 primeiros números
impares. Sua expressão não pode ter mais do que uma linha.
*/

object exercicio_2 {def main(args: Array[String]) = {var a = 1;var b = 1;while(a<100){a+=1;if ((a % 2) != 0) println("=> "+a)}}}
