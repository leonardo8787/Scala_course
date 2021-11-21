/*
aluno: Leonardo de Oliveira Campos - Matrícula: 20203006159
Centro Federal de Educação Tecnológica de Minas Gerais

3. Escreva uma expressão que gere uma coleção com todos os números múltiplos
de 2 ou 3 que estão entre 1 e 1000. Sua expressão não pode ter mais do que
uma linha.

OBS: como vc falou 2 ou 3, podemos escolher qual iremos comparar!
*/

object exercicio_3 {def main(args: Array[String]) = {var a = 1;while (a<1000){a+=1;if (a%2==0) print(a+", ")}}}

