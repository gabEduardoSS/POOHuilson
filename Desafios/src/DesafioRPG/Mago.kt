package DesafioRPG

class Mago(
    nome: String,
    forca: Int,
    velocidade: Int,
    vida: Int,
    val magia: Int
) : Personagem(nome, forca, velocidade, vida) {

    private var poderUsado = false

    override fun usarPoder(): String {
        return if (!poderUsado) {
            forca += magia
            vida  += magia
            poderUsado = true
            "✨ $nome conjura um feitiço! Força e Vida aumentadas em $magia! (Força: $forca | Vida: $vida)"
        } else {
            "✨ $nome já conjurou seu feitiço nesta batalha!"
        }
    }

    override fun status(): String {
        return "[$nome (Mago) | ❤️ Vida: $vida | ⚔️ Força: $forca | 💨 Vel: $velocidade | ✨ Magia: $magia]"
    }
}
