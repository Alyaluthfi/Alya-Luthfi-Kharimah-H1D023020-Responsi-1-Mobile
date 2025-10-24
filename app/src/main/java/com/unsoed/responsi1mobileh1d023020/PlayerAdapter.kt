package com.unsoed.responsi1mobileh1d023020

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.unsoed.responsi1mobileh1d023020.databinding.ItemPlayerBinding


interface OnPlayerClickListener {
    fun onPlayerClick(player: Player) // [cite: 407]
}

class PlayerAdapter(
    private val players: List<Player>,
    private val listener: OnPlayerClickListener // 2. Tambahkan listener di constructor [cite: 420]
) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    inner class PlayerViewHolder(val binding: ItemPlayerBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val binding = ItemPlayerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayerViewHolder(binding)
    }

    override fun getItemCount() = players.size

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = players[position]

        holder.binding.tvPlayerName.text = player.name
        holder.binding.tvPlayerNationality.text = player.nationality

        // Logika pewarnaan CardView
        val colorRes = when (player.position) {
            "Goalkeeper" -> R.color.player_goalie
            "Defence", "Left-Back", "Right-Back", "Centre-Back" -> R.color.player_defender
            "Midfield", "Defensive Midfield", "Central Midfield" -> R.color.player_midfielder
            "Offence", "Left Winger", "Right Winger", "Centre-Forward" -> R.color.player_forward
            else -> android.R.color.white
        }
        holder.binding.cardPlayer.setCardBackgroundColor(
            ContextCompat.getColor(holder.itemView.context, colorRes)
        )

        // 3. Set OnClickListener (sesuai P5) [cite: 438]
        holder.binding.root.setOnClickListener {
            listener.onPlayerClick(player) // [cite: 439]
        }
    }
}