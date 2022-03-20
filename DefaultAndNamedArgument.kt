/*
    Kotlin Default Argument :
    If a function is called without passing any argument than default argument are used as parameter of function definition.
    And when a function is called using argument, than the passing argument is used as parameter in function definition.

 */
fun main(args: Array<String>) {
    run()
    bun(latter = 'a')
}

fun run(num:Int= 5, latter: Char ='x'){     // default arguments
    println("This is run() function : parameter in function definition $num and $latter")
}
/*
     Kotlin Named Argument :
     A named argument is an argument in which we define the name of argument in the function call.
     The name defined to argument of function call checks the name in the function definition and assign to it.
 */
fun bun(num:Int= 5, latter: Char ='x'){
    print("This is bun() function : parameter in function definition $num and $latter")
}