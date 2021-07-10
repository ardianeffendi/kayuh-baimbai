package com.blogspot.wasakamantap.ui.komoditas

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.adapter.KomoditasAdapter
import com.blogspot.wasakamantap.data.komoditas.KomoditasMasakanKhas
import com.blogspot.wasakamantap.databinding.FragmentMasakanKhasBinding

@SuppressLint("ClickableViewAccessibility")
class MasakanKhasFragment : Fragment() {
    private var _binding: FragmentMasakanKhasBinding? = null
    private val binding get() = _binding!!

    private lateinit var masakanKhasAdapter: KomoditasAdapter
    private var media: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMasakanKhasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Hook up the adapter and populate the list
        masakanKhasAdapter = KomoditasAdapter(requireContext())
        masakanKhasAdapter.submitList(KomoditasMasakanKhas.getListData())
        showRecyclerList()
    }

    private fun showRecyclerList() {
        binding.rvMasakanKhas.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = masakanKhasAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}