package com.example.a23012021015_mad_practical_4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadCastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val str1 = intent.getStringExtra("Service1")
        if (str1 != null) {
            val intentService = Intent(context, AlarmService::class.java)
            //intentService.putExtra("Service1", intent.getStringExtra("Service1"))
            if (str1 == "Start")
                context.startService(intentService)
            else if (str1 == "Stop")
                context.stopService(intentService)
        }
    }
}