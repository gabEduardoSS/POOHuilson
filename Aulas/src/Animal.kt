/**Classe Mãe ou Raiz*/
open class Animal(
    val nome: String,
    val peso : Double
    // Sempre que há um construtor a instância da classe necessita ter os valores iniciados na inicialização
) {
    open fun fazerBarulho(){
        println("$nome fez um barulho")
    }
}
/**Classe Filha ou Folha*/
//Exemplo 1
class Cachorro (
    nome : String,
    peso : Double)
    : Animal (
    nome,
    peso){
    override fun fazerBarulho(){
        println("O cachorrinho $nome latiu!")
    }
}
//Exemplo 2
class Gato : Animal (nome = "Mimo", peso = 2.0){
    override fun fazerBarulho(){
        println("O gatinho $nome fez miau")
    }
}