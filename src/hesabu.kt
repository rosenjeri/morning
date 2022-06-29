class hesabu {
    //datamember
    var num1:Int=20
    var num2:Int=76

    //member function
    fun arithmetic():Int{
        return num1 *num2
    }
}

fun main() {
    //creating object
    val myobj=hesabu()
    println(myobj.arithmetic())
}