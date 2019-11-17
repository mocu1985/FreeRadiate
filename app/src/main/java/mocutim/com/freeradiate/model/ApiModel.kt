package mocutim.com.freeradiate.model

import android.os.Handler
import mocutim.com.freeradiate.model.item.DirectMail

class ApiModel {

    public fun getDirectMailList(callback: onDataReadyCallback) {

        Handler().postDelayed(
            {
                callback.onDataReady(initList())
            }
            , 1500)
    }


    private fun initList(): ArrayList<DirectMail> {
        var list = ArrayList<DirectMail>()

        for (i in 0..5) {
            var directMail = DirectMail(i, "名字$i", "內容內容內容內容")
            list.add(directMail)
        }

        return list
    }

    interface onDataReadyCallback {
        fun onDataReady(list: ArrayList<DirectMail>)
    }
}