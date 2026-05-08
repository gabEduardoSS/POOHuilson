package DesafioRPG

fun main() {
    println("╔══════════════════════════════════════╗")
    println("║       ⚔️   SIMULADOR DE RPG   ⚔️       ║")
    println("╚══════════════════════════════════════╝\n")



    val guerreiro = Guerreiro(
        nome       = "Arthas",
        forca      = 15,
        velocidade = 8,
        vida       = 100,
        defesa     = 25
    )

    val mago = Mago(
        nome       = "Merlin",
        forca      = 18,
        velocidade = 6,
        vida       = 70,
        magia      = 15
    )

    val ladino = Ladino(
        nome       = "Shadow",
        forca      = 12,
        velocidade = 16,
        vida       = 80,
        sagacidade = 28
    )

    val personagens: List<Personagem> = listOf(guerreiro, mago, ladino)

    println("═══════════ STATUS INICIAL ═══════════")
    personagens.forEach { println(it.status()) }

    println("\n═══════════ ATIVANDO PODERES ═══════════")
    personagens.forEach { println(it.usarPoder()) }

    println("\n════════ STATUS APÓS PODERES ════════")
    personagens.forEach { println(it.status()) }

    println("\n╔══════════════════════════════════════╗")
    println("║            ⚔️  BATALHA  ⚔️             ║")
    println("╚══════════════════════════════════════╝")

    batalhar(guerreiro, ladino)

    println("\n═══════════ RESULTADO FINAL ═══════════")
    personagens.forEach { p ->
        val estado = if (p.estaVivo()) "✅ Vivo" else "💀 Derrotado"
        println("${p.status()} → $estado")
    }
}

fun batalhar(personagem1: Personagem, personagem2: Personagem) {
    println("\n🥊 ${personagem1.nome} vs ${personagem2.nome} — COMEÇOU!\n")

    var turno = 1
    while (personagem1.estaVivo() && personagem2.estaVivo() && turno <= 6) {
        println("--- Turno $turno ---")
        if (personagem1.estaVivo()) personagem1.atacar(personagem2)
        if (personagem2.estaVivo()) personagem2.atacar(personagem1)
        println("  ${personagem1.status()}")
        println("  ${personagem2.status()}\n")
        turno++
    }

    when {
        !personagem1.estaVivo() -> println("🏆 ${personagem2.nome} venceu a batalha!")
        !personagem2.estaVivo() -> println("🏆 ${personagem1.nome} venceu a batalha!")
        else                    -> println("⚖️  Empate! Ambos sobreviveram.")
    }
}
