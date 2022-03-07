fun main(){
    // VARIABLES

    var variable1 = "we can reasign the var"
    println(variable1) // var (Mutable variable): We can change the value of variable declared using var keyword later in the program.
    val variable2 = "we cannot reasign value in val"
    println(variable2) // val (Immutable variable): We cannot change the value of variable which is declared using val keyword.

    var Kotlin : String =" This is how we explicitely declared type."
    var Number : Int = 22
    println(Kotlin + " "+ Number)



    // DATATYPES

    //Number Types
    var B : Byte = 1
    var S : Short = 11
    var I : Int = 12345
    var L : Long = 123456789101112
    var F : Float = 22.03F
    var D : Double = 11111111.5555555

    // Character Type
    var C : Char = 'C'

    // Boolean Type
    var bool : Boolean = true

    // Array
     arrayOf(1,2,3,4,5)

    // String

    //1. Escaped String: Escape string is declared within double quote("") and may contain escape characters like \n, \t, \b etc.

    val EscapedString = "Hello, this is Escaped string"

    //2. Raw String: Raw string is declared within triple quote(""" """). It provides facility to declare string in new lines and contain multiple lines

    val RawString = """
        Hello,
        This is Row String
    """


}