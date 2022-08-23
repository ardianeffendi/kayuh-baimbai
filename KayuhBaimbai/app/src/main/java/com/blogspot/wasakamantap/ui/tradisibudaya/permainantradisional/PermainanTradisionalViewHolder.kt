package com.blogspot.wasakamantap.ui.tradisibudaya.permainantradisional

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.data.Data
import com.blogspot.wasakamantap.databinding.LayoutListTradisiBudayaBinding
import com.bumptech.glide.Glide

class PermainanTradisionalViewHolder(
    private val binding: LayoutListTradisiBudayaBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(model: Data) {
        binding.apply {
            if (model.picture == 0) {
                Glide.with(binding.ivImage.context)
                    .load(R.drawable.no_image_available)
                    .into(ivImage)
            } else {
                Glide.with(binding.ivImage.context)
                    .load(model.picture)
                    .into(ivImage)
            }
            tvDesc.text = model.description
        }
    }

    companion object {
        fun create(parent: ViewGroup) : PermainanTradisionalViewHolder {
            val binding = LayoutListTradisiBudayaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return PermainanTradisionalViewHolder(binding)
        }
    }
}