class Especie {
    private var nome: String = "Toby"
    private var peso: Double = 0.0

    fun setNome(nome: String){ // Função para editar o atributo
        this.nome = nome
    }
    fun getNome(): String{ // Função para acessar o dado do atributo
        return nome
    }
}