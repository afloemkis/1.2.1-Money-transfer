fun main(){
    val minCommission: Int = 3500 //в копейках
    val percent: Double = 0.75
    val amount: Int = 10000 //в копейках

        var commission = amount*percent/100
        if (commission < minCommission) {commission = minCommission.toDouble()}
        println("Сумма комиссии ${commission/100} руб")

}