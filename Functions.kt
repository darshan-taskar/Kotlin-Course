// FUNTIONS
// Function is a group of inter related block of code which performs a specific task


import java.util.Scanner;
fun main(){
    println(firstKotlinFunction())
    println(secondKotlinFuntion())
    var input = Scanner(System.`in`)
    println("Enter the first number")
    var num1 = input.nextInt()
    println("Enter the second number")
    var num2 = input.nextInt()
    println("Addition is :" + sum(num1, num2))
    println("Subtraction is :" + sub(num1, num2))


}
fun firstKotlinFunction():Unit {
    println("This is my first function") // this is block body function
}
fun secondKotlinFuntion():Unit =  println("this is my second function") // this is expression body function

fun sum(number1:Int, number2: Int):Int{
    val addition = number1 + number2
    return  addition
}
fun sub(number1:Int, number2: Int):Int {
    val subtraction = number1 - number2
    return subtraction
}



