package andorid.sample.practice_2019mar.kotlin.demo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

//https://www.journaldev.com/20567/kotlin-interview-questions

/*By default classes are final in Kotlin.
 To make them non-final, you need to add the open modifier.*/
open class HelloKotlin : AppCompatActivity() {

    var str: String = "HI"

    //lateinit later initialization for only strings
    lateinit var str2: String

    //lateinit not allowed on primitive datatypes. uncomment and check
    //lateinit var data: Int

    //lazy -> used for val. val would be created at runtime when its required
    val a: Int by lazy { 10 }



    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val str3: String = "Hello"
        //uncomment below n check
        //str3 = "Welcome"

        var count: Int = 12
        count = "13".toInt()

        //Elvis Operator ? to avoid null pointer exception
        var str5: String? = "welcome"

        //list example
        var arr = arrayListOf<Int>()
        arr.addAll(listOf(1, 2, 3))

        val arr2 = arrayListOf(1, 2, 3)

        add(2, 3)

        //compare example == compare value. === compare reference
        if (str == str3)
            println("equal")

        if (str === str3) {
            println("not equal")
            Log.d("", "")
        }

        /*
        public
        internal
        protected
        private
        public is the default visibility modifier.*/

        //create object
        var obj = HelloKotlin2("HI", "Hello", 10)
        obj.callee()

        //use "component funtion" to get value from "data" key
        println(obj.component1()+obj.component2())

        // destructuring function to assign multiple values from objecet/array content
        var (a, b) = obj
        println(a + b)

        //Singleton call
        var strData = SingletonDemo.primaNumber();

        //Static method call use companion object key
        val aa = StaticDemo.add()


    }

    //function example
    fun add(a: Int, b: Int): Int {
        return a + b
    }

}