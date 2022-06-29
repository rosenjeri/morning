class wanafunzi(val jina:String,val jinsia:String,var miaka:Int,var urefu:Int) {
}

fun main() {
    val obj=wanafunzi("Rose","Female",45,6)
    println("Student name "+obj.jina+
    "Student gender "+obj.jinsia+
    "Student age "+obj.miaka +"Student height"+obj.urefu+"metres")
}