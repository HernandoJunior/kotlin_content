package anotacoes.funcoes

class Funcoes {
    fun main(Args : Array<String>) {
        somar(5, 10)
        somar(90, 100)
        somar(valor1 = 100, valor2 = 200)

        saudar()
    }

    fun somar(valor1: Int, valor2: Int) {
        println("A soma dos numeros é ${valor1 + valor2}")
    }

    fun subtrair(valor1: Int, valor2: Int): Int {
        val total = valor1 - valor2
        return total
    }

    fun dividir(valor1: Int, valor2: Int) = valor1 / valor2

    fun saudar(){
        println("Olá")
    }
}