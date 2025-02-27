package anotacoes.enumeradores

class Enumeradores {
    enum class TipoConta(var nomeConta: String){
        CONTA_CORRENTE("Corrente"),
        CONTA_POUPANCA("Poupança"),
        CONTA_SALARIO("Salário")
    }

    fun enumeradores(){
        val tiposConta = TipoConta.CONTA_CORRENTE
        val tipoConta2 = TipoConta.CONTA_POUPANCA
        val tipoConta3 = TipoConta.CONTA_SALARIO
        //Imprimindo o valor da variavel, que está armazenado em TipoConta
        println(tiposConta.nomeConta)
        println(tipoConta2.nomeConta)
        //name imprime o nome do enumerador
        println(tipoConta3.name)
    }


    //Definindo um enum fora da função main
    enum class Compass {
        north,
        east,
        west,
        south
    }

    fun enumeradoresExemplo2(){
        fun main(args: Array<String>) {
            //Criando uma variável do tipo Compass
            var direction = Compass.north
            //Como Kotlin trabalha com inferência de tipo, podemos usar
            // somente .valor, caso o tipo seja definido explicitamente
            var direction2: Compass = Compass.south
            println("Minha direção é $direction")
            //Minha direção é north
            //Enums são muito usados com switch para análise do valor
            when (direction) {
                Compass.north ->
                    println("Estamos indo para o norte")
                Compass.south ->
                    println("Estamos indo para o sul")
                Compass.east ->
                    println("Estamos indo para o leste")
                Compass.west ->
                    println("Estamos indo para o oeste")
            }
            //Estamos indo para o norte

            //Outra forma de apresentar informações de um Enum
            Compass.values().forEach {
                println(it)
            }
        }
    }

    //Enum que define as posições das poltronas em um avião
        enum class SeatPosition(var seat: String) {
            aisle("corredor"),
            middle("meio"),
            window("janela")
        }
        //Enum de Int com valores padrões
        enum class Month(var m: Int) {
            january(1), february(2), march(3), april(4), may(5), june(6),
            july(7), august(8), september(9), october(10), november(11), december(12)
        }

    fun valoresPadrao(){
        //Veja que é possível atribuir um valor padrão a cada uma delas
        fun main(args: Array<String>) {
            var passengerSeat = SeatPosition.window
            //Para imprimir o valor padrão, usamos o nome utilizado na construção do enum. Veja:
            println(passengerSeat.seat)   //janela
            var currentMonth: Month = Month.june
            println("Estamos no mês ${currentMonth.m} do ano")
        }
    }
}