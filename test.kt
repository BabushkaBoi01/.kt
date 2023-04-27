import java.util.Scanner

fun main(){
    var num:Int = 0
    var factorial:Int = 1
    val sc= Scanner(System.`in`)
    print("Enter number : ")
    num = sc.nextInt()
    for(num2 in 1..num)
        factorial*=num2

    print("Factorial of $num is $factorial")


}
