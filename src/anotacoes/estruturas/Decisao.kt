package anotacoes.estruturas

class Decisao {
    fun ifElse(){
        var grade = 7.5
        var result = if (grade > 7.5 ) "aprovado" else "reprovado"
        println(result)
    }

    fun concienciaNull (){
        var age: Int? = null
        var myAge = age ?: 0

        println(myAge)

        age = 25
        var newAge = age ?: 0
        println(newAge)
    }

    fun closedRange(){
        println("\nClosed Range ..")
        var numbers = 1..10
        for (number in numbers) {
            println(number)   //Imprime de 1 a 10
        }

        println("\nHalf Closed Range (until)")
        var newNumbers = (1 until 10)
        for (number in newNumbers) {
            println(number)   //Imprime de 1 a 9
        }
    }

    fun whenFunction(){
        var number = 7
        when (number % 2) {
            0 ->
                println("$number é par")
            else ->
                println("$number é ímpar")
        }
        //Exemplo com vários cenários no mesmo case
        var letter = "z"
        when (letter) {
            "a", "e", "i", "o", "u" ->
                println("vogal")
            else ->
                println("consoante")
        }
        //Exemplo com range de letras
        when (letter) {
            in "a".."f" ->
                println("Você está na turma 1")
            in "g".."l" ->
                println("Você está na turma 2")
            in "m".."r" ->
                println("Você está na turma 3")
            else ->
                println("Você está na turma 4")
        }
        //Range de números
        var speed = 33
        when (speed) {
            in 0 until 20 ->
                println("Primeira marcha")
            in 20 until 40 ->
                println("Segunda marcha")
            in 40 until 50 ->
                println("Terceira marcha")
            in 50 until 90 ->
                println("Quarta marcha")
            else ->
                println("Quinta marcha")
        }
    }

    fun doWHILE(){
        //Usando: while
        var life = 10
        while (life > 0) {
            println("O jogador está com $life vidas")
            life = life - 1
        }

        println("\n")

        //Usando: do while
        var tries = 0
        var diceNumber = 0
        do {
            tries += 1

            diceNumber = ((Math.random() * 6) + 1).toInt()

            println("Tentativa:$tries <-> Número Randomizado: $diceNumber")
        } while (diceNumber != 6)

        println("\nVocê tirou 6 após $tries tentativas")
    }

    fun forIN(){
        //Percorrendo um Array
        var students = arrayOf(
            "João Francisco",
            "Pedro Henrique",
            "Gustavo Oliveira",
            "Janaina Santos",
            "Francisco José"
        )

        for (student in students) {
            println("O aluno $student veio na aula de hoje!")
        }

        //Percorrendo uma sequência (range)
        for (day in 1..30) {
            println("Estou no dia $day")
        }

        //Note abaixo que uma String também é uma coleção
        var name = "FIAP"
        for (letter in name) {
            println(letter)
        }

        //Vejamos como percorrer uma coleção,
        //imprimindo sua chave e valor. Nesta coleção
        //a chave é String e o valor é Int
        var people = mapOf(
            (25 to "Paulo"),
            (18 to "Renata"),
            (33 to "Kleber"),
            (51 to "Roberto"),
            (36 to "Carol")
        )

        //A variável person, abaixo, recebe a chave
        //(key) e o valor (value) de cada elemento da coleção
        for (person in people) {
            println(" ${person.key} => ${person.value}")
        }

        //Podemos quebrar a execução de um laço usando
        //o comando break
        var grades = arrayOf(10.0, 9.0, 8.5, 7.0, 9.5, 5.0, 22.0, 6.5, 10.0)
        for (grade in grades) {
            println(grade)
            if (grade < 0.0 || grade > 10.0) {
                println("Nota inválida")
                break
            }
        }
    }
}