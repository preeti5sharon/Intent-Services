package github.preeti5sharon.intentservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import github.preeti5sharon.intentservices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {private var _binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(_binding?.root)


        _binding?.startBtn?.setOnClickListener{
            Intent(this,MyIntentService::class.java).also {
                startService(it)
                _binding?.textView?.text = "Service Running"
            }
        }
        _binding?.stopBtn?.setOnClickListener {
            MyIntentService.stopService()
            _binding?.textView?.text = "Service Stopped"
        }
    }
}