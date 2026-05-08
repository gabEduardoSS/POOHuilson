package DesafioRPG

open class Personagem(
    val nome: String,
    var forca: Int,
    val velocidade: Int,
    var vida: Int
) {
    open fun usarPoder(): String {
        return "⚡ $nome usou seu poder!"
    }

    fun atacar(inimigo: Personagem): Int {
        return if (velocidade > inimigo.velocidade) {
            val dano = forca
            inimigo.receberDano(dano)
            println("⚔️  $nome atacou ${inimigo.nome} e causou $dano de dano!")
            dano
        } else {
            println("💨 ${inimigo.nome} é mais rápido e esquivou do ataque de $nome!")
            0
        }
    }

    fun defender(inimigo: Personagem): Boolean {
        val defendeu = velocidade > inimigo.forca
        if (defendeu) {
            println("🛡️  $nome defendeu o ataque de ${inimigo.nome}!")
        } else {
            println("💥 $nome não conseguiu defender o ataque de ${inimigo.nome}!")
        }
        return defendeu
    }

    open fun receberDano(dano: Int) {
        vida = maxOf(0, vida - dano)
    }

    fun estaVivo(): Boolean = vida > 0

    open fun status(): String {
        return "[$nome | ❤️ Vida: $vida | ⚔️ Força: $forca | 💨 Velocidade: $velocidade]"
    }
}
