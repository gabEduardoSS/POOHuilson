fun main(){
    print("Insira a sua conta: ")
    var conta:String = readln()

    var n1:String = ""
    var n2:String = ""
    var op:String = ""
    var resultado:Double = 0.0

    if(conta.any{it in "+-*/"}){
        for(char in conta) if(char.toString().matches(Regex("[0-9,.]"))){
            if(op.equals("")){
                n1 = n1+char
            } else{
                n2 = n2+char
            }
        } else{
            op = char.toString()
        }

        var n1Formatado:Double = n1.replace(",", ".").toDouble()
        var n2Formatado:Double = n2.replace(",", ".").toDouble()

        when (op){
            "+" -> resultado = n1Formatado+n2Formatado
            "-" -> resultado = n1Formatado-n2Formatado
            "*" -> resultado = n1Formatado*n2Formatado
            "/" -> resultado = n1Formatado/n2Formatado
        }
    }
    print("${resultado}")
}