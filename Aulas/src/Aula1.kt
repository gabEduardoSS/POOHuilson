fun main(){
    var nome:String = ""
    val sobrenome = "Fulano"

    print("Insira o seu nome: ")
    nome = readln()
    println("Hello World! $nome $sobrenome")

    print("Insira a sua idade: ")
    val idadeString:String = readln()
    val idadeInt:Int = idadeString.toInt()

    print(idadeInt)
}