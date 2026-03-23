/**
Instanciar: Criar algo, no caso, um Objeto
Se eu instanciar uma classe, estarei criando um objeto
 * */
fun main(){
    val golfinho = Especie()
    golfinho.setNome("Free Willy")
    println(golfinho.getNome())

    val doginho = Animal("Rex", 10.0)//Depêndencia
    val billy = Cachorro("Billy", 5.5)
    val mimi = Gato()//A instância já está contida no construtor da classe
    doginho.fazerBarulho()
    billy.fazerBarulho()
    mimi.fazerBarulho()

    val pessoa : Pessoa = Pessoa()//Isso aqui é um objeto vazio
    pessoa.nome = "Maria"
    pessoa.altura = 1.69
    pessoa.peso = 48.2
    pessoa.cpf = "000.000.000-01"
    pessoa.imc = pessoa.peso / (pessoa.altura*2)

    val pessoa2 : Pessoa = Pessoa()
    pessoa2.nome = "Fulaninho"

    val mustang : Carro = Carro(modelo = "Ford KA", velocidade = 50.0)//Explicito
    val fusca : Carro = Carro("Fusca", 150.0)
    //Implícito, sou obrigado a seguir a ordem dos atributos
}