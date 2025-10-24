package com.unsoed.responsi1mobileh1d023020

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment // [cite: 228]
import com.unsoed.responsi1mobileh1d023020.R
import com.unsoed.responsi1mobileh1d023020.databinding.FragmentPlayerDetailBinding

class PlayerDetailFragment(
    private val name: String,
    private val dob: String,
    private val nationality: String,
    private val position: String
) : BottomSheetDialogFragment() {

    // 2. Setup ViewBinding [cite: 240]
    private var _binding: FragmentPlayerDetailBinding? = null
    private val binding get() = _binding!!

    // 3. Terapkan Style [cite: 245, 254]
    override fun getTheme(): Int = R.style.ThemeOverlay_App_BottomSheetDialog

    // 4. Inflate layout [cite: 271]
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlayerDetailBinding.inflate(inflater, container, false) // [cite: 278]
        return binding.root
    }

    // 5. Panggil loadData [cite: 338]
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData() // [cite: 341]
    }

    // 6. Buat fungsi loadData [cite: 311, 314]
    private fun loadData() {
        binding.tvDetailPlayerName.text = name // [cite: 316]
        binding.tvDetailPlayerDob.text = "Lahir: $dob"
        binding.tvDetailPlayerNationality.text = "Negara: $nationality"
        binding.tvDetailPlayerPosition.text = "Posisi: $position"
    }

    // 7. Bersihkan binding (cegah memory leak) [cite: 282]
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // [cite: 305]
    }

    // 8. Hapus semua kode lain yang di-generate (onCreate, companion object) [cite: 347-384]
}