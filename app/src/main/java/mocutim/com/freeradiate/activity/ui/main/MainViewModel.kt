package mocutim.com.freeradiate.activity.ui.main

import androidx.lifecycle.ViewModel
import mocutim.com.freeradiate.adapter.DirectMailAdapter
import mocutim.com.freeradiate.databinding.MainFragmentBinding
import mocutim.com.freeradiate.model.ApiModel
import mocutim.com.freeradiate.model.item.DirectMail


class MainViewModel : ViewModel() {

    private var apiModel = ApiModel()



    public fun getDirectMailData(binding: MainFragmentBinding) {
        apiModel.getDirectMailList(object : ApiModel.onDataReadyCallback {

            override fun onDataReady(list: ArrayList<DirectMail>) {

                var adapter = DirectMailAdapter(list)

                binding.recyclerView.adapter = adapter
            }

        })
    }
}
