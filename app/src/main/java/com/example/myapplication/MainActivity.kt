package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.myapplication.track.Tracking

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
     val MAIN_ACTIVITY = "main_activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Tracking.sendMV(MAIN_ACTIVITY, "e_button_helloworld_mv")

        findViewById<TextView>(R.id.tv_show).setOnClickListener({
            Log.e(TAG, "---->>onCreate: " )
            Tracking.sendMC(MAIN_ACTIVITY, "e_button_helloworld_mc")

        })

    }

    override fun onResume() {
        super.onResume()
        Tracking.sendPV(MAIN_ACTIVITY, "e_pv_main")
    }
}