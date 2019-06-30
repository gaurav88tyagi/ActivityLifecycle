package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "ActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate :")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart :")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume :")
    }

    override fun onPause() {
        Log.d(TAG, "onPause :")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop :")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart :")
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy :")
        super.onDestroy()
    }

}
