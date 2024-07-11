fun sumarPares(numeros: Array<Int>) {
    var suma = 0
    val numerosPares = mutableListOf<Int>()
    for (numero in numeros) {
        if (numero % 2 == 0) {
            suma += numero
            numerosPares.add(numero)
        }
    }
    println("$suma (${numerosPares.joinToString(" + ")})")

}

fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(sumarPares(numeros))
}


