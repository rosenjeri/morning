class fruits {
    var type=""
    var color=""
    var amount=0

    var customer=""
    var stalk=0
    var transportation=""

}

fun main() {
    val matunda=fruits()
    val matunda2=fruits()
    matunda.type="Banana"
    matunda.color="Yellow"
    matunda.amount=30

    matunda2.customer="Rose"
    matunda2.stalk=4
    matunda2.transportation="car"

    println(matunda.type)
    println(matunda.amount)
    println(matunda.color)

    println(matunda2.customer)
    println(matunda2.transportation)
    println(matunda2.stalk)
}