package mocutim.com.freeradiate.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mocutim.com.freeradiate.R
import mocutim.com.freeradiate.activity.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
