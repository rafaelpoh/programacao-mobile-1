fun main() {
    var X: Int
    var resultado: Int
    var fatorial: Int = 1
    println("digite o numero a ser calculado o fatorial")
    X = readLine()!!.toInt()
    for (X in 1..X){
        fatorial = fatorial*X
    }
    println("o fatorial é $fatorial")

}