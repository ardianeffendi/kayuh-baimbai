package com.blogspot.wasakamantap.ui.komoditas

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.data.Data
import com.blogspot.wasakamantap.databinding.LayoutListKomoditasBinding
import com.bumptech.glide.Glide

class KomoditasViewHolder(
    private val binding: LayoutListKomoditasBinding,
    context: Context
) : RecyclerView.ViewHolder(binding.root) {

    private val shakyAnimation = AnimationUtils.loadAnimation(context, R.anim.shaky_animation)

    fun bind(model: Data) {
        binding.apply {
            if (model.picture == 0) {
                Glide.with(ivKomoditasImage.context)
                    .load(R.drawable.no_image_available)
                    .into(ivKomoditasImage)
            } else {
                Glide.with(ivKomoditasImage.context)
                    .load(model.picture)
                    .into(ivKomoditasImage)
            }
            tvKomoditasDescription.text = model.description
            tvKomoditasName.text = model.name
            tvKomoditasJenis.text = model.type
            tvKomoditasAlamat.text = model.address
            tvKomoditasHarga.text = model.price

            ivKuridingLeft.animation = shakyAnimation
            ivKuridingRight.animation = shakyAnimation
        }
    }

    companion object {
        fun create(parent: ViewGroup, context: Context) : KomoditasViewHolder {
            val binding = LayoutListKomoditasBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return KomoditasViewHolder(binding, context)
        }
    }
}