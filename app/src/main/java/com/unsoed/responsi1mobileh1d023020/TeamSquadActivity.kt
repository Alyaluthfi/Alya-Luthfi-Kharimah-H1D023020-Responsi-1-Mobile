package com.unsoed.responsi1mobileh1d023020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.unsoed.responsi1mobileh1d023020.databinding.ActivityTeamSquadBinding

// 4. Implement interface di Activity [cite: 451]
class TeamSquadActivity : AppCompatActivity(), OnPlayerClickListener {

    private lateinit var binding: ActivityTeamSquadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeamSquadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup RecyclerView
        val adapter = PlayerAdapter(PlayerData.list, this) // 'this' adalah listener-nya
        binding.rvPlayers.layoutManager = LinearLayoutManager(this)
        binding.rvPlayers.adapter = adapter
    }

    // 5. Override fungsi dari interface [cite: 478, 488]
    override fun onPlayerClick(player: Player) {
        // Buat dan tampilkan BottomSheetDialogFragment
        val playerDetailFragment = PlayerDetailFragment(
            name = player.name,
            dob = player.dateOfBirth,
            nationality = player.nationality,
            position = player.position
        )
        // Tampilkan fragment [cite: 497]
        playerDetailFragment.show(supportFragmentManager, "PlayerDetailFragmentTag")
    }
}