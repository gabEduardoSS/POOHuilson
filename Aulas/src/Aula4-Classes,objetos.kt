/*
- 5 Características de um carro
    / Atributos
    Modelo
    Cor
    Ano
    Combustível
    Motor

    / Funções/Ações
    Acelerar
    Freiar
    Abastecer
    TrocarMarcha
    Bater

- 5 Características de um alimento
    / Atributos
    Nome
    Sabor
    Cor

- 5 Ações de uma planta
    / Funções/Ações
    Madurar
    Cair
    Germinar
    Florescer

- 5 Características de uma pessoa
    / Atributos
    Nome
    Idade
    Altura
    Peso
    Profissão

    / Funções/Ações
    Andar
    Pular
    Correr
    Deitar
    Pegar

-> INSTANCIAR: Criar algo, no caso, um objeto
    Se eu instanciar uma classe, estarei criando um objeto
*/

fun main(){
    val pessoa: Pessoa = Pessoa() // Cria um objeto vazio
    val fordKa: Carro = Carro("Ford KA",120.0)

    pessoa.nome = "Eduardo"
    pessoa.idade = 18
    pessoa.altura = 1.69
    pessoa.peso = 54.0
    pessoa.cpf = "12645123929"

    fordKa.atropelarPessoa(pessoa)
    println(pessoa.calcImc())



}