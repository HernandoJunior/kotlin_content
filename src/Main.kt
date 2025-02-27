import anotacoes.colecoes.Arrays

fun main() {
    var numeros = listOf(1, 2, 3, 4, 5)
    //Não retorna uma lista, utilizando a soma, apenas a soma total da lista
    var soma = numeros.reduce{ atual, proximo ->
        atual + proximo
    }

    println(soma)
}