package mocutim.com.freeradiate.application

import androidx.multidex.MultiDexApplication
import mma.security.component.diagnostics.Debuk
import mocutim.com.freeradiate.BuildConfig

class MainApplication: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.isShowLog) {
            Debuk.OpenWriteDebukMessage()
        }
    }
}