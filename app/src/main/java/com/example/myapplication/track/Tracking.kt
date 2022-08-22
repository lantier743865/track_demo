package com.example.myapplication.track


/**
 * 整个工程很多地方都调用这个类的各种方法，但参数都是 pageId: String, eid: String
 * 现在想扫描整个工程，把调用Tracking.xxx()的第1，2参数打印到文件里。
 */
object Tracking {

    const val TAG = "Tracking"

    fun send(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }


    @JvmStatic
    fun sendMC(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }

    @JvmStatic
    fun sendMV(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }

    @JvmStatic
    fun sendPV(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }

    @JvmStatic
    fun sendSC(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }

    @JvmStatic
    fun sendUBC(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }

    @JvmStatic
    fun sendMS(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }

    @JvmStatic
    fun sendBO(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }

    @JvmStatic
    fun sendBP(pageId: String, eid: String, args: Map<String, Any?>? = null) {

    }

}