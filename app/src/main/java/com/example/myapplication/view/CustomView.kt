package com.example.myapplication.view

import com.example.myapplication.track.Tracking

class CustomView {
    fun init(){
        Tracking.sendSC("trackParam.pageId", "trackParam.eid")
    }
}