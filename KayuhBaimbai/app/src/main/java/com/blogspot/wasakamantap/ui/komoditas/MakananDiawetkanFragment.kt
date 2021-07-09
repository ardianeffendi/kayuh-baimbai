package com.blogspot.wasakamantap.ui.komoditas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.blogspot.wasakamantap.adapter.KomoditasAdapter
import com.blogspot.wasakamantap.data.komoditas.KomoditasMakananDiawetkan
import com.blogspot.wasakamantap.databinding.FragmentMakananDiawetkanBinding

class MakananDiawetkanFragment : Fragment() {
    private var _binding: FragmentMakananDiawetkanBinding? = null
    private val binding get() = _binding!!

    private lateinit var makananDiawetkanAdapter: KomoditasAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMakananDiawetkanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Hook up the adapter and populate the list
        makananDiawetkanAdapter = KomoditasAdapter(requireContext())
        makananDiawetkanAdapter.submitList(KomoditasMakananDiawetkan.getListData())
        showRecyclerList()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showRecyclerList() {
        binding.rvMakananDiawetkan.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = makananDiawetkanAdapter
        }
    }
}