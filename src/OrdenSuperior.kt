fun main(){
    println(aplicarOperacion(5, ::cuadrado))
}

fun cuadrado(numero: Int): Int {
    return numero * numero
}

fun aplicarOperacion(numero:Int, funcion: (Int) -> Int): Int {
    return funcion(numero)
}