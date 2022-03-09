fun main(){
    var str = "My name is Darshan"

    // KOTLIN STRING PROPERTY
    println("Length of string is : ${str.length}") // Use to print length of string ($ is a string template)
    println("Total indices in string is :" + str.indices) // It returns the ranges of valid character indices from current char sequence.
    println("The last index of string is :" + str.lastIndex)  // It returns the index of last character from char sequence.

    // KOTLIN STRING FUNCTIONS
    println("Use of compareTo :" + str.compareTo("My name is Darshan"))
    // It compares the current object with specified object for order. It returns zero if current is equals to specified other object.
    println("Character at given index is: " + str.get(12)) //It returns the character at given index from the current character sequence.
    println(" Joins two strings or other: " + str.plus(2))
    //It returns the concatenate string with the string representation of the given other string.
    println("use of subsequence() :" + str.subSequence(11, 18))
    //It returns the new character sequence from current character sequence, starting from startIndex to endIndex.

    // KOTLIN STRING LITERALS
    // 1. Escaped String :
    // Escape String is declared within double quote (" ") and may contain escape characters like '\n', '\t', '\b' ,'\r','\$'etc.
    val text1 ="Hello, Kotlin"
//or
    val text2 ="Hello, Kotlin\n"
//or
    val text3 ="Hello, \nKotlin"

    // 2. Row String :
    /* Row String is declared within triple quote (""" """).
       It provides facility to declare String in new lines and contain multiple lines. Row String cannot contain any escape character.*/
    val text4 ="""  
             Welcome   
                 To  
             Kotlin 
    """
    // While using raw string with new line, it generates a | as margin prefix.
    // Leading whitespace can be removed with trimMargin() function. By default, trimMargin() function uses | as margin prefix.
    val text = """Kotlin is official language  
        |announce by Google for  
        |android application development  
    """.trimMargin()
    println(text)

    // KOTLIN STRING EQUALITY
    // 1. Structural equality (==)
    /*
    To check the two objects containing the same value, we use == operator or != operator for negation. It is equivalent to equals() in java.
    */
    val str1 = "Hello, World!"
    val str2 = "Hello, World!"
    println(str1==str2) //true
    println(str1!=str2) //false

    // 2. Referential equality (===)
    /*
     To check the two different references point to the same instance, we use === operator.
     The !== operator is used for negation. a === b specifies true if and only if a and b both point to the same object.
    */
    val str3 = buildString { "string value" }
    val str4 = buildString { "string value" }
    println(str3===str4)
    println(str3!==str4)

}