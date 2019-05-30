package andorid.sample.practice_2019mar.kotlin.demo

//https://www.programiz.com/kotlin-programming/object-singleton

//An object cannot have a constructor set. We can use the init block inside it though.
object SingletonDemo {

    //uncomment below and check
    /*constructor(){

    }*/

    init {

    }

    fun primaNumber(): String {
        return "girish"
    }

}