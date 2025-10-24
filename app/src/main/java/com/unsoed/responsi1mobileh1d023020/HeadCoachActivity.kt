package com.unsoed.responsi1mobileh1d023020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.unsoed.responsi1mobileh1d023020.databinding.ActivityHeadCoachBinding // Ganti dengan package-mu

class HeadCoachActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeadCoachBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeadCoachBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this)
            .load(R.drawable.ajauxerrecoach)
            .into(binding.imgCoachPhoto)
    }
}