package DesafioRPG

open class Personagem (
    val nome: String,
    val forca: Int,
    val velocidade: Int,
    val vida: Int
){
    open fun usarPoder(){
        print("O herói $nome usou seu poder")
    }

     /*
     * Para a função de ataque, calcule quem é o mais
     * rápido, desconte o valor da Força da Vida do
     * adversário*/
     fun atacar(velocidadeInimigo: Double): Int{
        if(velocidade > velocidadeInimigo){
            return forca
        }
         return 0
     }

     /**
     * Para a função de defensa, calcule se a Velocidade
     * do herói é maior que a Força do adversário
     * */
     fun defender(forcaInimigo: Int): Boolean{
         return velocidade > forcaInimigo
     }

    open fun returnAtributoEsp(){

    }

}

class Mago(
    nome: String,
    forca: Int,
    velocidade: Int,
    vida: Int,
    val Magia: Int
) : Personagem(nome, forca, velocidade, vida) {
    override fun usarPoder(){

    }
}

class Guerreiro(
    nome: String,
    forca: Int,
    velocidade: Int,
    vida: Int,
    val defesa: Int
) : Personagem(nome, forca, velocidade, vida) {
    override fun usarPoder() {

    }
}

class Ladino(
    nome: String,
    forca: Int,
    velocidade: Int,
    vida: Int,
    val sagacidade: Int
) : Personagem(nome, forca, velocidade, vida) {
    override fun usarPoder(){

    }
}