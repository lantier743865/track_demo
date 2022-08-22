package com.example.myapplication.util

import com.example.myapplication.track.Tracking
import java.util.HashMap

class Utils {
    fun select(){
        val args = HashMap<String, Any?>()
        args["dating_id"] = "dating.datingID"
        args["channel_name"] = "dating.dating?.channelName"
        Tracking.sendUBC("pageId", "e_dating_quality_key_event", args)

    }
}