package com.fetchingdata.f1officialappattempt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewAdapter: RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>() {

    private var title = arrayOf("VERSTAPPEN SNATCHES VICTORY FROM FERRARI'S JAW IN ITALY", "VERSTAPPEN PIPES MERCEDES TO WIN IN NETHERLANDS", "VERSTAPPEN SAILS AWAY TO WIN IN BELGIUM", "VERSTAPPEN WINS IN HUNGARY", "VERSTAPPEN WINS IN FRANCE AS LECLERC CRASHES OUT", "LECLERC WINS IN RED BULL TURF", "SAINZ WINS MAIDEN SILVERSTONE GRAND PRIX", "VERSTAPPEN WINS IN TENSE CANADIAN GRAND PRIX", "VERSTAPPEN LEADS RED BULL 1-2 AS BOTH FERRARI SUFFER ISSUES" ,"PEREZ WINS MONACO IN MASTERCLASS PERFORMANCE", "VERSTAPPEN WINS IN SPAIN AS LECLERC FACES ENGINE ISSUE", "VERSTAPPEN WINS IN MIAMI", "VERSTAPPEN WINS IN IMOLA AS LECLERC RECOVERS FROM SPIN")
    private var images = arrayOf(R.drawable.verstappenitaly, R.drawable.verstappennetherlands, R.drawable.verstappenbelgium, R.drawable.verstappenhungary, R.drawable.verstappenfrance, R.drawable.leclercaustria, R.drawable.sainzengland, R.drawable.verstappencanada, R.drawable.verstappenbaku ,R.drawable.perezmonaco, R.drawable.verstappenspain, R.drawable.verstappenmiami, R.drawable.verstappenimola)
    private var dates = arrayOf("21/03/2022", "27/03/2022", "3/04/2022", "13/03/2022", "12/05/2022", "27/05/2022", "4/06/2022", "9/06/2022", "21/06/2022", "1/07/2022", "8/07/2022", "21/07/2022", "28/07/2022")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.dashboard_cardview_test, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.images.setImageResource(images[position])
        holder.item_title.text = title[position]
        holder.item_date.text = dates[position]
    }

    override fun getItemCount(): Int {
        return title.size


    }

    // HELPED SOLVE ERROR IN MAINSCREEN
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var images: ImageView
        var item_title: TextView
        var item_date: TextView

        init {
            images = itemView.findViewById(R.id.item_image)
            item_title = itemView.findViewById(R.id.item_title)
            item_date = itemView.findViewById(R.id.item_date)
        }
    }

}