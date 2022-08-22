package com.example.myapplication.rec;

import com.example.myapplication.track.Tracking;

public class Recommend {
    void upload(){
        Tracking.sendMS("p_newswipecardgroup", "e_computeScroll",null);
    }
}
