fun main() {
    println("os fatoriais de 0 até 10 são")
    ex2()
}
fun fatorial(x: Int): Int {
    var fatorial: Int = 1
    for (x in 1..x){
        fatorial = fatorial*x
    }
    return fatorial
}
fun ex2(){
    println(fatorial(0))
    for (i in 1..10 ){
        println(fatorial(i))
    }
}