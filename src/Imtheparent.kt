 open class Imtheparent {
    var num1=64
     var jina="Rose"
}
class Child1: Imtheparent(){
    fun display(){
        println("My number is $num1")
    }
}
 class Child2: Imtheparent(){
     fun display(){
         println("My name is $jina")
     }
 }

 fun main() {
     val myobj=Child1()
     println(myobj.display())

     val obj=Child2()
     println(obj.display())
 }