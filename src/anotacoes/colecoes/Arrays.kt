package anotacoes.colecoes

class Arrays {
    fun arraysInicial(){

        /* Tipo de coleção imutavel, é criado com os valores iniciais,
            não é permitido adicionar, apenas alterar */

        var cidades = arrayOf("Salvador", "São Paulo", "Curitiba")
        println(cidades[1])

        /* Conceito de Casting:
            Quando voce determina um tipo inicial da variavel e tenta implementar tipos de dados
            diferentes.
            Em uma array que foi definido como String, o valor que voce tentar incluir vai ser
            transformado em String.
         */

        var temCidade = cidades.isEmpty()
        println(temCidade)
        var temvalores = arrayOf<Int>()
        println(temvalores.isEmpty())

        var frutas = ArrayList<String>()
        frutas.add("Banana")
        frutas.add("Mamão")
        frutas.add("Uva")

        println(frutas)
        print(frutas.contains("Uva"))

        frutas.remove("Uva")

        println("Frutas: ${frutas.size}")
    }

    fun setInicial(){
        /* Coleção versátio que não permite elementos repetidos, ideal para quando for
        fazer uma coleção de itens que não podem repetir
        Ex: Alunos da turma, lista de times favoritos,
         */

        //Criando um Set de Strings
        var movies = HashSet<String> ()
        var catalog = listOf(
            "Matrix",
            "Vingadores",
            "Jurassic Park",
            "De Volta para o Futuro"
        )
        movies.addAll(catalog)

        //Perceba que o catálogo de filmes está ordenado alfabeticamente
        println(movies) //[Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
        println(movies.count()) //4
        println("\n")

//Criando um set vazio
        var movies2 = HashSet<String> ()

//Inserindo elementos
        movies.add("Homem-Aranha: De Volta ao o Lar")
        println(movies) //[Homem-Aranha: De Volta ao o Lar, Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
        println(movies.count()) //5
        println("\n")
        /*Perceba que o código abaixo NÃO alterará a quantidade
        de itens do Set pois ele NÃO aceita itens repetidos. */

        movies.add("Homem-Aranha: De Volta ao o Lar")
        println(movies)   //[Homem-Aranha: De Volta ao o Lar, Jurassic Park, Matrix, De Volta para o Futuro, Vingadores]
        println(movies.count()) //5 ( Nenhum elemento repetido. E ainda tudo ordenado )
        println("\n")

        //Removendo elemento
        movies.remove("Homem-Aranha: De Volta ao o Lar")
        println(movies)   //["Vingadores", "De Volta para o Futuro", "Matrix", "Jurassic Park"]
        println(movies.count()) //4
        println("\n")

        //Percorrendo um Set
        for (movie in movies) {
            println(movie)
        }
        println("\n")

        //Verificando se determinado elemento está contido no List
        if (movies.contains("Matrix")) {
            println("Matrix está na minha lista de filmes favoritos!!")
        }
        println("\n")

        /* Vamos criar um novo set para realizarmos algumas operações
        No exemplo abaixo, usaremos um formato mais simplificado de criação de Set */

        var myWifeMovies  = setOf(
            "De Repente 30",
            "Mensagem para você",
            "Sintonia de Amor",
            "De Volta para o Futuro",
            "Jurassic Park"
        )

        //Criando um Set com todos os filmes. SEM repetição. TUDO ordenado ;)
        var allMovies = movies + myWifeMovies
        println(allMovies) // [Jurassic Park, Matrix, De Volta para o Futuro, Vingadores, De Repente 30, Mensagem para você, Sintonia de Amor]
        println(allMovies.count()) //7
    }
}