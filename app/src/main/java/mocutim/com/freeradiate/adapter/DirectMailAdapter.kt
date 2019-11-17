package mocutim.com.freeradiate.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mocutim.com.freeradiate.databinding.AdapterSkidRight1Binding
import mocutim.com.freeradiate.model.item.DirectMail

class DirectMailAdapter : RecyclerView.Adapter<DirectMailAdapter.DirectMailHolder> {

    private var list: ArrayList<DirectMail>

    constructor(list: ArrayList<DirectMail>) : super() {
        this.list = list
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DirectMailHolder {
        var inflate = LayoutInflater.from(parent.context)
        var binding = AdapterSkidRight1Binding.inflate(inflate, parent, false)

        return DirectMailHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: DirectMailHolder, position: Int) {
        var directMail = list.get(position)
        holder.bind(directMail)
    }


    class DirectMailHolder : RecyclerView.ViewHolder {
        private var binding: AdapterSkidRight1Binding

        constructor(binding: AdapterSkidRight1Binding) : super(binding.root) {
            this.binding = binding
        }

        fun bind(directMail: DirectMail) {
            binding.item = directMail
            binding.executePendingBindings()
        }
    }
}