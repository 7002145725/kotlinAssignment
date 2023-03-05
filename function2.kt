fun main(){
    fun findGreaterNumber(num1: Int, num2:Int): Int{
        return if(num1>num2)
            num1
        else   
            num2
    }
    println(findGreaterNumber(2,4))

}