class Rectangulo(val base:Double, val altura:Double):FiguraGeometrica() {

    override fun calcularArea(): Double {
        return base * altura
    }

}