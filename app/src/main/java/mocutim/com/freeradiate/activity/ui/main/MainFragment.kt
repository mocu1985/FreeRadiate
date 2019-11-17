package mocutim.com.freeradiate.activity.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.dingmouren.layoutmanagergroup.skidright.SkidRightLayoutManager
import mocutim.com.freeradiate.R
import mocutim.com.freeradiate.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding
    private lateinit var skidRightLayoutManager: SkidRightLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)

        skidRightLayoutManager = SkidRightLayoutManager(1.5f, 0.85f)

        binding.recyclerView.layoutManager = skidRightLayoutManager


        return binding.root


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        viewModel.getDirectMailData(binding)

    }

}
