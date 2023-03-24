fun main(args: Array<String>) {
    var X: Int
    var resultado: Int
    println("digite o numero a ser calculado o fatorial")
    X = readLine()!!.toInt()
    resultado = ex1(X)
    println("o fatorial de $X é $resultado")
    println("os fatoriais de 0 até 10 são")
    ex2()
    ex3()
    ex4()
    ex5()
}
fun ex1(x: Int): Int {
    var fatorial: Int = 1
    for (x in 1..x){
        fatorial = fatorial*x
    }
    return fatorial
}
fun ex2(){
    println(ex1(0))
    for (i in 1..10 ){
        println(ex1(i))
    }
}
fun ex3(){
    var numero1: Float
    var numero2: Float
    var numero3: Float
    println("digite o primeiro numero")
    numero1= readLine()!!.toFloat()
    println("digite o segundo numero")
    numero2= readLine()!!.toFloat()
    println("digite o terceiro numero")
    numero3= readLine()!!.toFloat()
    if (numero1<=numero2 && numero1<=numero3 && numero2<=numero3){
        println("Os numeros ordenados são $numero1, $numero2, $numero3")
    }
    if (numero1<=numero2 && numero1<=numero3 && numero3<=numero2){
        println("Os numeros ordenados são $numero1, $numero3, $numero2")
    }
    if (numero2<=numero1 && numero2<=numero3 && numero1<=numero3){
        println("Os numeros ordenados são $numero2, $numero1, $numero3")
    }
    if (numero2<=numero1 && numero2<=numero3 && numero3<=numero1){
        println("Os numeros ordenados são $numero2, $numero3,$numero1")
    }
    if (numero3<=numero1 && numero3<=numero2 && numero1<=numero2){
        println("Os numeros ordenados são $numero3, $numero1, $numero2")
    }
    if (numero3<=numero1 && numero3<=numero2 && numero2<=numero1){
        println("Os numeros ordenados são $numero3, $numero2, $numero1")
    }
}
fun ex4() {
    var nota1: Double
    var nota2: Double
    var nota3: Double
    var media: Double
    println("digite a primeira nota")
    nota1 = readLine()!!.toDouble()
    nota1= nota1* 0.2
    println("digite a segunda nota")
    nota2 = readLine()!!.toDouble()
    nota2= nota2* 0.3
    println("digite a terceira nota")
    nota3 = readLine()!!.toDouble()
    nota3= nota3* 0.5
    media = nota1 + nota2 + nota3
    if (media >= 7) {
        println("Aprovado com media $media")
    }
    else if (media >= 4) {
        println("Final com media $media")
    }
    else{
        println("Reprovado com media $media")
    }
}
fun ex5(){
    var valor: Double
    var resto: Double
    var moedas1: Int = 0
    var moedas05: Int = 0
    var moedas025: Int = 0
    var moedas010: Int = 0
    var moedas005: Int = 0
    var moedas001: Int = 0
    println("Digite o valor a ser calculado")
    valor= readLine()!!.toDouble()
    while (valor !=0.0) {
        resto = valor % 1
        valor = valor - resto
        if (valor >= 1) {
            moedas1++
        } else if (valor >= 0.5) {
            moedas05++
        } else if (valor >= 0.25) {
            moedas025++
        } else if (valor >= 0.1) {
            moedas010++
        } else if (valor >= 0.05) {
            moedas005++
        } else (){
            moedas001++
        }
    }
    println("vai precisar de $moedas1 moedas de 1")
    println("vai precisar de $moedas05 moedas de 0.50")
    println("vai precisar de $moedas025 moedas de 0.25")
    println("vai precisar de $moedas010 moedas de 0.10")
    println("vai precisar de $moedas005 moedas de 0.05")
    println("vai precisar de $moedas001 moedas de 0.01")
}
