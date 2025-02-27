package anotacoes.funcoes.mapfilterreduce

class MapFilterReduce {
    fun filter(){
        var numeros = listOf(1, 2, 3, 4, 5, 6, 7)
        //Filter retorna uma nova lista
        var pares = numeros.filter {
            /* it de iteração */
            it % 2 == 0
        }
        println(pares)

        var frutas = listOf("Manga", "Morango", "Abacaxi", "Melancia", "Laranja")

        var frutasM = frutas.filter {
            //função que retorna a letra de inicio
            it.startsWith("M")
        }
    }

    fun map(){
        var frutas = listOf("Manga", "Morango", "Abacaxi", "Melancia", "Laranja")

        var frutasMaiusculas = frutas.map{
            it.uppercase()
        }

        println(frutasMaiusculas)
    }

    fun reduce(){
        /* Exemplo de uso:
        Quando estamos utilizando o extrato bancário
        o deposito seria uma lista positiva de valores
        e o saque seria uma lista negativa de valores
        poderiamos utlizar o reduce para definir o valor final da conta
        (somaDeposito - somaSaque)
         */
        var numeros = listOf(1, 2, 3, 4, 5)
        //Não retorna uma lista, utilizando a soma, apenas a soma total da lista
        var soma = numeros.reduce{ atual, proximo ->
            atual + proximo
        }

        println(soma)
    }
}