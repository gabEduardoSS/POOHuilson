data class Piloto(val nome: String, val idade: Int, val habilidade: Int)

data class Carro(
    val velocidade: Int,
    val aceleracao: Int,
    val freio: Int,
    val tanque: Int,
    val consumo: Double,
    val resistencia: Int,
    val piloto: Piloto,
)

data class Resultado(val piloto: Piloto, val carro: Carro, val pontuacao: Int, val pitStops: Int)

class Pista(
    val carros: List<Carro>,
    val tamanho: Double,
    val voltas: Int,
    val clima: String
) {
    fun simularCorrida(): List<Resultado> {
        val resultados = mutableListOf<Resultado>()
        val tamanhoTotal = tamanho*voltas

        for (carro in carros) {
            var desempenho: Int = (carro.velocidade + carro.aceleracao + carro.piloto.habilidade) * voltas

            val pitStop: Int = (tamanhoTotal/(carro.tanque*carro.consumo) + voltas/carro.resistencia).toInt()
            desempenho -= pitStop*400

            resultados.add(Resultado(carro.piloto, carro, desempenho, pitStop))
        }

        return resultados.sortedWith(compareByDescending<Resultado> { it.pontuacao }.thenBy { it.pitStops })
    }
}

fun main() {
    val joao = Piloto("João", 19, 8)
    val leticia = Piloto("Letícia", 20, 6)
    val amanda = Piloto("Amanda", 19, 9)
    val eduardo = Piloto("Eduardo", 18, 7)

    val carro1 = Carro(280, 15, 10, 60, 2.0, 7, joao)
    val carro2 = Carro(250, 20, 12, 55,3.0 , 8, leticia)
    val carro3 = Carro(290, 15, 11, 52, 2.4, 6, amanda)
    val carro4 = Carro(300, 16, 10, 50, 2.1, 6, eduardo)

    val pista = Pista(listOf(carro1, carro2, carro3, carro4), tamanho = 6.5, voltas = 20, clima = "Ensolarado")

    val placar = pista.simularCorrida()

    println("Placar da Corrida (${pista.clima}):")
    placar.forEachIndexed { index, resultado ->
        println("${index + 1}º lugar: ${resultado.piloto.nome} com ${resultado.pontuacao} pontos e ${resultado.pitStops} pit stops")
    }
}
