import java.lang.Thread.MAX_PRIORITY
import java.lang.Thread.sleep
import kotlin.concurrent.thread

fun main(){
    val t1 = Thread{
        sleep(100)
        for(i in 1..50){
            print(" $i")
        }
    }

    val t2 = Thread{
        println()
    }

    t1.start()
    t1.name = "Thread 1"
    println("${t1.name} ainda está operando?: ${t1.isAlive}")

    // t1.interrupt() // Mata a thread

    t1.join() //Trava as thread que vem depois, elas tendo que esperar a thread em questão acabar

    t2.start()

    println("${t1.name} ainda está operando?: ${t1.isAlive}")

    /*
    - LAMBDA -> : Para realizar alguma ação
    - DIAMANTE <> : Indicar tipagem
     */

    val t3 = Thread{
        for(i in 1..10){
            print(" $i")
        }
    }

    val t4 = Thread{
        for(i in 11..20){
            print(" $i")
        }
    }

    val t5 = Thread{
        for(i in 21..31){
            print(" $i")
        }
    }

    t3.start()
    t4.start()
    t5.start()

    t3.priority = Thread.MIN_PRIORITY
    t4.priority = Thread.NORM_PRIORITY
    t5.priority = MAX_PRIORITY
}

fun criarPilha(){
    val pilha: ArrayDeque<String> = ArrayDeque<String>()
    pilha.add("Ás de Paus")
    pilha.add("Rei de Espada")
    pilha.add("Valete de Ouro")
    pilha.add("Dama de Copa")

    println("A carta no topo da pilha é ${pilha.last()}")

    pilha.removeLast()

    println("A carta no topo da pilha é ${pilha.last()}")

}

fun criarFila(){
    val fila: ArrayDeque<String> = ArrayDeque<String>()
    fila.addLast("Fulano")
    fila.addLast("Ciclano")
    fila.addLast("Beltrano")

    println("O primeiro a ser atendido é o ${fila.removeFirst()}")

}