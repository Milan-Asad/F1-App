package com.fetchingdata.f1officialappattempt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.standings_cardview.*
import kotlinx.android.synthetic.main.toolbar.view.*
import org.w3c.dom.Text

class StandingsRecyclerviewAdapter: RecyclerView.Adapter<StandingsRecyclerviewAdapter.ViewHolder>() {

    private var drivernames = arrayOf( "Max Verstappen", "Charles Leclerc", "Sergio Perez", "George Russell", "Carlos Sainz", "Lewis Hamilton", "Lando Norris", "Esteban Ocon", "Fernando Alonso", "Valtteri Bottas", "Sebastian Vettel", "Daniel Ricciardo", "Kevin Magnussen", "Pierre Gasly", "Lance Stroll", "Mick Schumacher", "Yuki Tsunoda", "Zhou Guanyu", "Alexander Albon", "Nicholas Latifi", "Nyck De Vries", "Nico Hulkenberg")
    private var number = arrayOf( "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22")
    private var teamnames = arrayOf("Red Bull", "Ferrari", "Red Bull", "Mercedes", "Ferrari", "Mercedes", "McLaren", "Alpine", "Alpine", "Alfa Romeo", "Aston Martin", "McLaren", "Haas F1 Team", "Alpha Tauri", "Aston Martin", "Haas F1 Team", "AlphaTauri", "Alfa Romeo", "Williams", "Williams", "Williams", "Aston Martin")
    private var points = arrayOf("391 PTS", "267 PTS", "265 PTS", "218 PTS", "202 PTS", "198 PTS", "109 PTS", "78 PTS", "71 PTS", "46 PTS", "36 PTS", "29 PTS", "24 PTS", "23 PTS", "13 PTS", "12 PTS", "12 PTS", "6 PTS", "4 PTS", "2 PTS", "2 PTS", "0 PTS")
    private var teamstrips = intArrayOf(R.drawable.redbullstrip, R.drawable.ferraristrip, R.drawable.redbullstrip, R.drawable.mercedesstrip, R.drawable.ferraristrip, R.drawable.mercedesstrip,  R.drawable.mclarenstrip,  R.drawable.alpinestrip,  R.drawable.alpinestrip,  R.drawable.alfastrip,  R.drawable.astonstrip,  R.drawable.mclarenstrip,  R.drawable.haasstrip,  R.drawable.atstrip,  R.drawable.astonstrip,  R.drawable.haasstrip,  R.drawable.atstrip,  R.drawable.alfastrip,  R.drawable.williamsstrip,  R.drawable.williamsstrip,  R.drawable.williamsstrip,  R.drawable.astonstrip)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StandingsRecyclerviewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.standings_cardview, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.drivername.text = drivernames[position]
        holder.number.text = number[position]
        holder.teamnames.text = teamnames[position]
        holder.points.text = points[position]
        holder.teamstrips.setImageResource(teamstrips[position])
    }

    override fun getItemCount(): Int {
        return drivernames.size

    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var drivername: TextView
        var number: TextView
        var teamnames: TextView
        var points: TextView
        var teamstrips: ImageView

        init{
            drivername = itemView.findViewById(R.id.driver_name)
            number = itemView.findViewById(R.id.standing_number)
            teamnames = itemView.findViewById(R.id.team_name)
            points = itemView.findViewById(R.id.points)
            teamstrips = itemView.findViewById(R.id.teamstrip)
        }
    }

}