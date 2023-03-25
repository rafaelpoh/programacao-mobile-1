fun main() {
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