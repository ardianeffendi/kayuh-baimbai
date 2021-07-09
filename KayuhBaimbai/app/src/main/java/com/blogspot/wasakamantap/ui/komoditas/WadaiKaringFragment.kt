package com.blogspot.wasakamantap.ui.komoditas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.blogspot.wasakamantap.adapter.KomoditasAdapter
import com.blogspot.wasakamantap.data.komoditas.KomoditasWadaiKaring
import com.blogspot.wasakamantap.databinding.FragmentWadaiKaringBinding

class WadaiKaringFragment : Fragment() {
    private var _binding: FragmentWadaiKaringBinding? = null
    private val binding get() = _binding!!

    private lateinit var wadaiKaringAdapter: KomoditasAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentWadaiKaringBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Hook up the adapter and populate the list
        wadaiKaringAdapter = KomoditasAdapter(requireContext())
        wadaiKaringAdapter.submitList(KomoditasWadaiKaring.getListData())
        showRecyclerList()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showRecyclerList() {
        binding.rvWadaiKaring.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = wadaiKaringAdapter
        }
    }
}