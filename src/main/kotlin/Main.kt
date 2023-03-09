fun main() {
//    println(takesStrings("Hopper", "Ada"))
 println(arrayNumbers(arrayOf(4,5,7,8,9)))
    (myString("Marion"))
    println(joinsString(arrayOf("Apples", "Mangoes", "Bananas", "Orange")))
    var calculator = Calculator()
    calculator.adds(3, 7)
    calculator.subtracts(100, 87)
    println(calculator.division(3.0, 4.0))
    calculator.multiply(3, 4)
}
//fun takesTwoStrings(string1: String, string2: String){
//    var firstStr = string1.length
//    var secondStr = string2.length
//
//    var result = firstStr > secondStr
//    return
//
//}
fun arrayNumbers(numbers: Array<Int>) :String{
   var minNum = numbers.min()
    var maxNum = numbers.max()
    var average = numbers.average()

    return ("${minNum}, ${maxNum}, ${average}")
}

fun myString(name: String){
    println(name.split(" ,"," ,"))
}
fun joinsString(strings: Array<String>): String{
    return strings.joinToString(",")
}

class Calculator(){
    fun adds(number1: Int, number2: Int){
        println(number1 + number2)
    }
    fun subtracts(number3: Int, number4: Int){
        println (number3 - number4)
    }
    fun division(number5: Double, number6: Double): Double{
        return  number5 / number6
    }
    fun multiply(number7: Int, number8: Int){
        println(number7 * number8)
    }
}