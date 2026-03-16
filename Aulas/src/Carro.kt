class Carro(
    private val modelo: String,
    private val velocidade: Double // Obrigado a declarar a velocidade na inizialização
) {
    fun atropelarPessoa(pessoa: Pessoa){
        println("O $modelo atropelou ${pessoa.nome} à ${velocidade.toInt()}KM/h ")
    }
}