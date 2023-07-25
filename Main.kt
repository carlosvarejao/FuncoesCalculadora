fun main() {
    val resultadoSoma = somar(5.6,6.4)
    println("O resultado da soma é $resultadoSoma")
    
    println("O resultado da subtratação é ${subtratacao(5.0,4.0)}")

    val resultadoMulti = multiplicar(2.0,5.0)
    println("O resultado da multiplicação é $resultadoMulti")

    println("O resultado da divisão é ${divisao(5.0,2.0)}")
}
        fun somar(x:Double,y:Double): Double{
            val result = x + y

            return result
        }

        fun subtratacao(x:Double,y:Double):Double{
            return x - y
        }

        fun multiplicar(x:Double,y:Double): Double{
            val result = x * y

            return result
        }

        fun divisao(x:Double,y:Double): Double{
            val result = x / y

            return result
        }



