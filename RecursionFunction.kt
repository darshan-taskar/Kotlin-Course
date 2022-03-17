/*
    RECURSION FUNCTION : Recursion function is a function which calls itself continuously. The technique is called recursion.
    Whenever function is called then there are two possibilities -
    i) Normal Function Call
    ii) Recursive Function Call

    RECURSIVE FUNCTION CALL : When function call itself then it is called recursive function call. Every recursive function should
    have terminate condition else program executions enters in infinite loop.

 */
// Direct Recursion : use function in function is called direct recursion.
fun factorial(num: Int): Int{
    return if(num <= 1){
        1
    }
    else{
        num * factorial(num -1) // direct recursion
    }
}
// Indirect Recursion : use function in another function is called indirect recursion.
fun factorial1(num: Int): Int{
    return if(num <= 1){
        1
    }
    else{
        num * factorial(num -1) // indirect recursion
    }
}

/*
    TAIL RECURSION : Tail recursion is a recursion which performs the calculation first, then makes the recursive call.
                     The result of current step is passed into the next recursive call.

Tail recursion follows one rule for implementation. This rule is as follow:
The recursive call must be the last call of the method. To declare a recursion as tail recursion we need to use tailrec modifier before the recursive function.

 */
tailrec fun recursiveSum(n: Long, answer: Long = 0): Long{
    return if (n <= 0){
        answer
    }
    else{
        recursiveSum((n-1), n + answer)
    }
}
fun main(){
    println(factorial(6))
    println(factorial1(6))
    println(recursiveSum(100000))
}