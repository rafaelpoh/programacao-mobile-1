fun main(){
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