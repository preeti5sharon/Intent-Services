package github.preeti5sharon.intentservices

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService: IntentService("MyIntentService") {

    init {
        instance = this
    }

    companion object{
        private lateinit var instance : MyIntentService
        var isRunning = false

        fun stopService() {
            Log.w("MyIntentService","Service is stopping")
            isRunning = false
            instance.stopSelf()
        }
    }
    override fun onHandleIntent(p0: Intent?) {
        try {
            isRunning = true
            while (isRunning == true){
                Log.w("MyIntentService","Service is starting")
                Thread.sleep(1000)
            }
        }catch (e: InterruptedException){
            Thread.currentThread().interrupt()
        }
    }
}