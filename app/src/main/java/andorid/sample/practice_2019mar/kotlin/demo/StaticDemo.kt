package andorid.sample.practice_2019mar.kotlin.demo

import android.util.Log

//https://www.programiz.com/kotlin-programming/companion-objects
class StaticDemo {
    companion object {
        val number: Int = 10
        fun add():Int {
            return 10
        }
        fun subtract(msg: String) = Log.d("",""+msg)
        fun mult() : Int = 10
    }
}