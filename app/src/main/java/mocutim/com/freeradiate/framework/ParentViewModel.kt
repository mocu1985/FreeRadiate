package mocutim.com.freeradiate.framework

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class ParentViewModel : ViewModel() {

    public lateinit var activity: Activity
    public lateinit var frg: Fragment


    abstract fun invisibleTitle()

}