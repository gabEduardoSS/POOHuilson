fun main(){
    colecoes()

}

fun intervalos(){
    for(i in 1..5){
        println("FOR com contagem crescente em um intervalo de 1 à 5: $i")
    }

    for(i in 5 downTo 1){
        println("FOR com contagem decrescente em um intavalo de 5 à 1: $i")
    }

    for(i in 1..10 step 2){
        println("FOR com contagem crescente em um intervalo de 1 à 10 de 2 em 2 números: $i")
    }

    val x:Int = 3
    if(x in 1..5){
        println("Verificar se a variável está presente no intervalo")
    }
}
fun quando_When(){
    print("Digite um número de 1 à 7: ")
    val dia:Int = readln().toInt() // READLN sempre retorna uma String

    when (dia){
        1 -> {
            println("Domingo")
            println("Esse é um exemplo de WHEN com mais de uma linha")
        }
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sábado")
    } // -> é um operador Lambda
}
fun colecoes(){
    println("Array de String: ")
    val alfabeto = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i")

    println("Array de Inteiros: ")
    val numerosPares = arrayOf(2, 4, 6, 8, 10, 12)

    for(i in alfabeto.indices){
        println("ALFA Index: $i, Valor: ${alfabeto[i]}")
        if(i in numerosPares.indices)println("NUM Index: $i, Valor: ${numerosPares[i]}")
    }
}