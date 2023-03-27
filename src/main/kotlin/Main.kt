fun main(){
    val minAmount: Int = 3500 //в копейках
    val percent: Double = 0.75
    val amount: Int = 700000 //в копейках

    if (amount <= minAmount) {
        println("Сумма перевода не может быть меньше ${minAmount/100} руб")
    } else {
        var commission = amount*percent/100
        println("Сумма комиссии ${commission/100} руб")
    }
}