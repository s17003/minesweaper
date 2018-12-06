package it.std.s17003.minesweaper_s17003

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun main(args: Array<String>) {
            val rand = Random()
            val num = rand.nextInt(10) + 100
        }

    }

}


