class Pessoa {
    var nome: String = ""
    var idade: Int = 0
    var altura: Double = 0.0;
    var peso: Double = 0.0
    var cpf: String = ""
    var imc: Double = 0.0

    fun andar(){
        println("$nome está andando")
    }

    fun calcImc():String{
        imc = peso/(altura*altura)
        return(imc.toString())
    }
}