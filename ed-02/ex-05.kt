fun main(){
    var valor: Double
    var moedas1: Int = 0
    var moedas05: Int = 0
    var moedas025: Int = 0
    var moedas010: Int = 0
    var moedas005: Int = 0
    var moedas001: Int = 0
    println("Digite o valor a ser calculado")
    valor= readLine()!!.toDouble()
    while (valor>=1) {
        valor = valor-1
        moedas1++
    }
    while (valor>=0.5) {
        valor = valor-0.5
        moedas05++
    }
    while (valor>=0.25) {
        valor = valor-0.25
        moedas025++
    }
    while (valor>=0.1) {
        valor = valor-0.1
        moedas010++
    }
    while (valor>=0.05) {
        valor = valor-0.05
        moedas005++
    }
    while (valor>=0.01) {
        valor = valor-0.01
        moedas001++
    }
    println("vai precisar de $moedas1 moedas de 1")
    println("vai precisar de $moedas05 moedas de 0.50")
    println("vai precisar de $moedas025 moedas de 0.25")
    println("vai precisar de $moedas010 moedas de 0.10")
    println("vai precisar de $moedas005 moedas de 0.05")
    println("vai precisar de $moedas001 moedas de 0.01")
}