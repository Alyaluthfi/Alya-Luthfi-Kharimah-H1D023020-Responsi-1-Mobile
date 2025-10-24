package com.unsoed.responsi1mobileh1d023020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide //
import com.unsoed.responsi1mobileh1d023020.databinding.ActivityClubHistoryBinding

class ClubHistoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityClubHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClubHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Gunakan Glide untuk memuat gambar (sesuai P5)
        Glide.with(this)
            .load(R.drawable.ajauxerrelbackground)
            .into(binding.imgHistoryBanner) // [cite: 322]
    }
}