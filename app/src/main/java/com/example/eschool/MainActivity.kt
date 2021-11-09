package com.example.eschool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.eschool.databinding.ActivityMainBinding
import java.util.logging.Level.INFO

class MainActivity : AppCompatActivity() {
    lateinit var binding: com.example.eschool.databinding.ActivityMainBinding//declaration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)//initialization
        val view = binding.root


        setContentView(view)// determines what is displayed in your activity
        binding.login.setOnClickListener {
            val a: Int = 9
            val b: Int = 90
            val c: Int = a + b
            Log.i("MainActivity", "Sum is " + c)
            val toast: Toast = Toast.makeText(this, "The answer is $c", Toast.LENGTH_LONG)
            toast.show()
            val age: Int = 25
            val msg = if (age>30)"Senior" else "Junior"
            Log.i("Test",msg)
            Log.i("Test",""+sum(10,20))
            Log.i("Test",""+d(80,40))
            Log.i("Test",""+tax(80.0))

        }


        // Log.i("MainActivity","Application has started");


    }

    override fun onStop() {
        super.onStop()
        Log.i("Test", "Stopped")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Test", "Paused")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Test", "Resumed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Test", "Restarted")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Test", "Started")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Test", "Destroyed")
    }
    fun sum(a:Int, b: Int): Int{
        val c = a + b
        return c
    }
    val d = {a:Int,b:Int-> a+b} //lambda function
    val tax = {salary: Double->(salary*23)/100}
}