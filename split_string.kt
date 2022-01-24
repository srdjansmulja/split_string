fun main() {

    val allowedWords = arrayOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    val delim = "-"
    var sum = 0
    var count = 0
    var returnString = String()
    var value = 0
    
    val inputString = readLine()!!
    
    if (inputString.startsWith(delim) || inputString.endsWith(delim)){
    println("String should not start or end with -")
    }else {
    
        if (inputString.contains(delim )){
            
            val arr = inputString.split(delim).toTypedArray()
    
            for (number in arr) {
                if (allowedWords.contains(number)) {
    
                    when(number) {
                        "null" -> value = 0
                        "one" -> value = 1
                        "two" -> value = 2
                        "three" -> value = 3
                        "four" -> value = 4
                        "five" -> value = 5
                        "six" -> value = 6
                        "seven" -> value = 7
                        "eight" -> value = 8
                        "nine" -> value = 9
                    }
    
                     if (count != 0)
                                {
                                    returnString += " + "
                                }
                                count += 1
                                 returnString += value
                                sum += value
                                
                                if (count == arr.size){
                                print(returnString)
                                print(" = $sum")}
                                }else{
                                println("Number $number was spelled wrong")
                                break
                                }
            }else{
            print("missing -")
            }
        }
    }
