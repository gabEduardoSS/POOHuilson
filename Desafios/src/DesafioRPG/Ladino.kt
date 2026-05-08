package DesafioRPG

class Ladino(
    nome: String,
    forca: Int,
    velocidade: Int,
    vida: Int,
    val sagacidade: Int
) : Personagem(nome, forca, velocidade, vida) {

    private val forcaOriginal = forca
    private var poderAtivo    = false

    override fun usarPoder(): String {
        return if (!poderAtivo) {
            forca      = sagacidade
            poderAtivo = true
            "🗡️  $nome entra em modo furtivo! Sagacidade ($sagacidade) substituindo a Força!"
        } else {
            forca      = forcaOriginal
            poderAtivo = false
            "👁️  $nome sai do modo furtivo. Força restaurada para $forcaOriginal."
        }
    }

    override fun status(): String {
        val modo = if (poderAtivo) "🗡️ FURTIVO" else "⚔️ NORMAL"
        return "[$nome (Ladino) | ❤️ Vida: $vida | ⚔️ Força: $forca | 💨 Vel: $velocidade | 👁️ Sagacidade: $sagacidade | $modo]"
    }
}
