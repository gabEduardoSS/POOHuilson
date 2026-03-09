var produtos: MutableList<MutableMap<String, Double>> = mutableListOf(mutableMapOf("Arroz" to 5.5))
var opt: Int = 0

fun main(){
    do{

        header()
        opt = readln().toInt()
        if(produtos.isEmpty() && opt!=1){
            println("Não há produtos cadastrados, utilize o menu de cadastro(opção 1)")
        } else{
            when(opt){
                1 -> addProduto()
                2 -> remProduto()
                6 -> mostrarProdutos()
                else -> println("Opção inválida")
            }
        }
        println()
    } while(opt != -1)

}

fun header(){
    println("--= SUPERMERCADO =--")
    println("1 - Adicionar Produto")
    println("2 - Remover Produto")
    println("6 - Mostrar Estoque")

    print("Escolha uma das opções(ou -1 para sair): ")
}
fun addProduto(){
    print("Nome do produto: ")
    val nome: String = readln()
    print("Preço do produto: ")
    val preco: Double = readln().replace(",", ".").toDouble()
    produtos.add(mutableMapOf(nome to preco))

}

fun remProduto(){
    mostrarProdutos()
    print("Qual produto você deseja remover?: ")
    val produtoIdx: Int = readln().toInt() - 1

    if(produtoIdx in produtos.indices){
        produtos[produtoIdx].keys.forEach{nome -> println("Removendo o produto: $nome")}
        produtos.removeAt(produtoIdx)
    } else{
        println("Produto não consta no sistema, retornando ao menu")
    }
    println()
}

fun alterarPreco(){
    mostrarProdutos()
    print("De qual produto o preço será alterado?: ")
    val produtoIdx: Int = readln().toInt() - 1

    if(produtoIdx in produtos.indices){
        produtos[produtoIdx].keys.forEach{nome ->
            println("Produto: $nome")
            print("Preço: ")
            val preco:Double = readln().replace(",", ".").toDouble()
        }
    } else{
        println("Produto não consta no sistema, retornando ao menu")
    }
    println()
}

fun mostrarProdutos(){
    var index: Int = 1
    println("--= PRODUTOS =--")
    produtos.forEach{produto ->
        produto.forEach{
                (nome, preco) -> println("$index - Nome: $nome | Preço: R$ ${formatarPreco(preco)}")
        }
        index += 1

    }
}

fun formatarPreco(preco:Double):String{
    return String.format("%.2f", preco).replace(".", ",")
}