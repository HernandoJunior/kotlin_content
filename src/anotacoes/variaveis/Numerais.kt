package anotacoes.variaveis

class Numerais {
    fun intCategory(){
        fun longNumerais(){
            val bytes = 64
            println(Long.MAX_VALUE)
            println(Long.MIN_VALUE)
        }
        fun intNumerais(){
            val bytes = 32
            println(Int.MAX_VALUE)
            println(Int.MIN_VALUE)
        }
        fun shortNumerais(){
            val bytes = 16
            println(Short.MAX_VALUE)
            println(Short.MIN_VALUE)
        }
        fun byteNumerais(){
            var bytes = 8
            var peso: Byte = 127 //Max 127 e -127
        }
    }

    fun doubleNumerais(){
        var bytes = 64
        println(Double.MAX_VALUE)
        println(Double.MIN_VALUE)
    }
    fun floatNumerais(){
        var bytes = 32
        println(Float.MAX_VALUE)
        println(Float.MIN_VALUE)
    }
}