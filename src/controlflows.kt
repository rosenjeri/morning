fun main() {
    var number=56
    if (number<40){
        println("You dont qualify")
    }else{
        println("You Qualify")
    }

    var marks=50
    if (marks>0 && marks<=40){
        println("Failed")
    }else if (marks>40 && marks<=60){
        println("passed")
    }else if (marks>60 && marks<=80){
        println("Excellent")
    }else if (marks>80 && marks<=100){
        println("distiction")
    }else{
        println("invalid input")
    }
}