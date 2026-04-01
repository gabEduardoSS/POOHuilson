fun main() {
    print("Insira a conta: ")
    val conta: String = readln().replace(" ", "").replace(",", ".")

    val output: ArrayDeque<String> = ArrayDeque()
    val operadores: ArrayDeque<String> = ArrayDeque()
}

fun RPN(){

}

fun calcular(n1: Double, n2: Double, op: String): Double{
    when(op){
        "+" -> return n1+n2
        "-" -> return n1-n2
        "*" -> return n1*n2
        "/" -> return n1/n2
    }
    return 0.0
}