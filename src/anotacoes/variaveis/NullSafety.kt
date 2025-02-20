package anotacoes.variaveis

//Nulo com segurança
class NullSafety {
    fun notValueInVariables(){
        //NULL POINTER Exception = Quando queremos utilizar uma variavel de valor nulo

        var idade: Int? = null // A interrogação serve para falarmos ao kotlin que queremos valor nulo na variavel
        println(idade)

        idade = 10
        println(idade)
    }
}