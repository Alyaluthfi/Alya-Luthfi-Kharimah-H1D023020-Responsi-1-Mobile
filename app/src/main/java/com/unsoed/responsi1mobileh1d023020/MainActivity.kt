package com.unsoed.responsi1mobileh1d023020

// Import yang diperlukan
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.unsoed.responsi1mobileh1d023020.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
        initNavigation()
    }

    private fun initLayout() {
        binding.layoutHistory.imgMenuIcon.setImageResource(R.drawable.ic_history)
        binding.layoutHistory.tvMenuTitle.text = getString(R.string.menu_history)

        binding.layoutCoach.imgMenuIcon.setImageResource(R.drawable.ic_coach)
        binding.layoutCoach.tvMenuTitle.text = getString(R.string.menu_coach)

        binding.layoutSquad.imgMenuIcon.setImageResource(R.drawable.ic_squad)
        binding.layoutSquad.tvMenuTitle.text = getString(R.string.menu_squad)
    }

    // Fungsi untuk navigasi
    private fun initNavigation() {
        // Ke Halaman History
        binding.layoutHistory.root.setOnClickListener {
            val intent = Intent(this, ClubHistoryActivity::class.java)
            startActivity(intent)
        }

        // Ke Halaman Coach
        binding.layoutCoach.root.setOnClickListener {
            val intent = Intent(this, HeadCoachActivity::class.java)
            startActivity(intent)
        }

        // Ke Halaman Squad
        binding.layoutSquad.root.setOnClickListener {
            val intent = Intent(this, TeamSquadActivity::class.java)
            startActivity(intent)
        }
    }
}