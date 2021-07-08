package com.blogspot.wasakamantap.ui.tradisibudaya.tradisi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blogspot.wasakamantap.data.Data
import com.blogspot.wasakamantap.databinding.LayoutListTradisiBudayaBinding
import com.bumptech.glide.Glide

class TradisiViewHolder(
    private val binding: LayoutListTradisiBudayaBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(model: Data) {
        binding.apply {
            Glide.with(binding.ivImage.context)
                .load(model.picture)
                .into(ivImage)
            tvDesc.text = model.description
        }
    }

    companion object {
        fun create(parent: ViewGroup) : TradisiViewHolder {
            val binding = LayoutListTradisiBudayaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return TradisiViewHolder(binding)
        }
    }
}