import kotlin.concurrent.thread
import kotlin.random.Random

fun main() {

    val fila = ArrayDeque<Int>()
    var semaforoAberto = false

    thread {
        while (true) {

            semaforoAberto = true
            println("\n🟢 Semáforo ABERTO\n")
            Thread.sleep(5000)

            semaforoAberto = false
            println("\n🔴 Semáforo FECHADO\n")
            Thread.sleep(10000)
        }
    }

    thread {
        while (true) {

            if (semaforoAberto && fila.isNotEmpty()) {
                val carro = fila.removeFirst()
                println("🚗 Carro $carro passou")
                Thread.sleep(1000)
            } else {
                Thread.sleep(200)
            }

        }
    }

    thread {

        var id = 1

        while (true) {

            Thread.sleep(Random.nextLong(500, 2000))

            fila.addLast(id)
            println("➡️ Carro $id chegou. Fila: ${fila.size}")

            id++
        }
    }
}