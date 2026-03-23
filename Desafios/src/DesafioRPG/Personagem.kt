package DesafioRPG

private class Personagem (
    val nome: String,
    val força: Int,
    val velocidade: Int,
    val vida: Int
){
    fun usarPoder(){
        print("O herói $nome usou seu poder")
    }

     /*
     * Para a função de ataque, calcule quem é o mais
     * rápido, desconte o valor da Força da Vida do
     * adversário*/
     fun atacar(velocidadeInimigo: Double): Int{
        if(velocidade > velocidadeInimigo){
            return força
        }
         return 0
     }

     /**
     * Para a função de defensa, calcule se a Velocidade
     * do herói é maior que a Força do adversário
     * */
     fun defender(forcaInimigo: Int): Boolean{
         if(velocidade > forcaInimigo){
             return true
         }
         return false
     }

}
