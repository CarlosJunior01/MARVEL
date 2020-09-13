package com.carlos.marvel.presentation.marvel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carlos.marvel.R
import com.carlos.marvel.data.model.MarvelItem
import kotlinx.android.synthetic.main.item_recycler.view.*

/**
 * Created by CarlosJr
 */

class MarvelAdapter(private val herois: List<MarvelItem>
) : RecyclerView.Adapter<MarvelAdapter.HeroesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, view: Int): HeroesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return HeroesViewHolder(itemView)
    }

    override fun getItemCount() = herois.count()


    override fun onBindViewHolder(viewHolder: HeroesViewHolder, position: Int) {
         viewHolder.bindView(herois[position])
    }

    class HeroesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nome   = itemView.nome_heroi

        fun bindView(heroi: MarvelItem) {
            nome.text= heroi.nomeHeroi

        }
    }
}