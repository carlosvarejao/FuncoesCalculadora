fun main() {

    val calculadora = "/"

    when (calculadora) {
        "+" -> println(somar(12.0, 13.0))
        "-" -> println(subtratacao(12.0, 11.0))
        "*" -> println(multiplicar(2.0, 5.0))
        "/" -> println(divisao(4.0, 2.0))
        else -> println("Operação inválida")
        }
    }

    fun somar(x: Double, y: Double): Double{

        return x + y
    }

    fun subtratacao(x: Double, y: Double): Double{

        return x - y
    }

    fun multiplicar(x: Double, y: Double): Double{

        return x * y
    }

    fun divisao(x: Double, y: Double): Double{

        return x / y
    }












