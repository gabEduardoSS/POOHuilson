package DesafioRPG

class Guerreiro(
    nome: String,
    forca: Int,
    velocidade: Int,
    vida: Int,
    var defesa: Int
) : Personagem(nome, forca, velocidade, vida) {

    override fun usarPoder(): String {
        return "🗡️  $nome ergue seu escudo de guerra! (Defesa ativa: $defesa)"
    }

    override fun receberDano(dano: Int) {
        if (defesa > 0) {
            val danoAbsorvido = minOf(dano, defesa)
            defesa -= danoAbsorvido
            val danoRestante = dano - danoAbsorvido
            if (danoRestante > 0) {
                vida = maxOf(0, vida - danoRestante)
                println("   🛡️  Defesa absorveu $danoAbsorvido. Dano na vida: $danoRestante | Defesa restante: $defesa")
            } else {
                println("   🛡️  Defesa de $nome bloqueou todo o dano ($danoAbsorvido)! Defesa restante: $defesa")
            }
        } else {
            vida = maxOf(0, vida - dano)
            println("   💔 $nome não tem mais defesa! Levou $dano de dano direto na vida!")
        }
    }

    override fun status(): String {
        return "[$nome (Guerreiro) | ❤️ Vida: $vida | ⚔️ Força: $forca | 💨 Vel: $velocidade | 🛡️ Defesa: $defesa]"
    }
}
