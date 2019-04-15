package andorid.sample.practice_2019mar.kotlin.demo

//primary construction. "data" key for setter and getter
data class HelloKotlin2(val str: String, val str2: String) {

    var count: Int = 0

    //secodary construction
    constructor(str: String, str2: String, count: Int) : this(str, str2) {
        this.count = count
    }

    lateinit var str3: String

    //init to initialize. called after primary constructor
    init {
        str3 = str2
    }

    fun callee() {

    }


    fun whenDemo() {
        //if else ifelse and switch replace with when

        val count: Int = 25
        if (count > 25)
            println()
        else if (count < 25)
            println()
        else
            println()

        //replace above with when

        when {
            count > 25 -> println()
            count < 25 -> println()
            else -> println()
        }


        //switch replace with when
        when (count) {
            25 -> println()
            24 -> println()
            else -> println()
        }
    }

    //inline and infix demo pending


}