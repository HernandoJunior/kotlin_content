package anotacoes.variaveis

class Strings {
    fun string(){
        //Criando uma constante
        val nomeFaculdade = "FIAP"
        //Criando variaveis
        var nomeDoAluno = "Hernando"

        var texto: String = "STRINGS Armazenam textos em geral."
        var formatString: String = "String formatadas: ${nomeDoAluno}"
    }

    fun char(){
        //Para usarmos o tipo Char, precisamos declarar para não virar String
        var texto: Char = '!'
    }
}