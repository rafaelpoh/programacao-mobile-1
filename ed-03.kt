fun main(args: Array<String>) {

}
class contabank(var cliente: Long, var saldo: Double, var numero: Long, var ag: Int) {

    fun depositar(){
        var deposito: Double
        deposito= readLine()!!.toDouble()
        saldo= saldo+deposito
    }
    fun retirar(){
        var saque: Double
        saque= readLine()!!.toDouble()
        saldo= saldo-saque
    }
    fun transferir(){
        var transf: Double
        var contatransf: Long
        var agtranf: Int
        transf= readLine()!!.toDouble()
        contatransf= readLine()!!.toLong()
        agtranf= readLine()!!.toInt()
        saldo= saldo-transf

    }
    fun imprimirextrato(){
        println("seu saldo é $saldo")
    }
}