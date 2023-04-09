fun main() {
    val minCommission = 3500 //в копейках
    val percent = 0.75
    val amount = 10000 //в копейках

    if (amount < minCommission) {
        println("Сумма перевода не может быть меньше ${minCommission / 100} руб")
    } else {
        var commission = amount * percent / 100
        if (commission < minCommission) {
            commission = minCommission.toDouble()
        }
        println("Сумма комиссии ${commission / 100} руб")
    }
}