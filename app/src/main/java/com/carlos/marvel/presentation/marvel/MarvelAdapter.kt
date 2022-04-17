package com.carlos.marvel.presentation.marvel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.carlos.marvel.R
import com.carlos.marvel.data.network.response.MarvelResultsResponse
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_recycler.view.*

/**
 * Created by CarlosJr
 */

class MarvelAdapter(
    private val heroisList: List<MarvelResultsResponse>,
    val OnItemClickListener: ((marvelResults: MarvelResultsResponse) -> Unit)
) : RecyclerView.Adapter<MarvelAdapter.HeroesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, view: Int): HeroesViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return HeroesViewHolder(itemView, OnItemClickListener)
    }

    override fun getItemCount(): Int {
        return heroisList.size
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {

        holder.bind(heroisList[position])
    }

    class HeroesViewHolder(
        itemView: View,
        private val OnItemClickListener: ((marvelResults: MarvelResultsResponse) -> Unit)
    ) : RecyclerView.ViewHolder(itemView) {
        private val heroiName = itemView.nome_heroi


        fun bind(aChar: MarvelResultsResponse) {

            heroiName.text = aChar.name

            var thumbnail =
                "${aChar.marvelThumbnail.path}/standard_large.${aChar.marvelThumbnail.extension}"
                    .split(":")

            Picasso.get().load("https:" + thumbnail[1]).into(itemView.imagem_heroi)

            itemView.setOnClickListener {
                OnItemClickListener.invoke(aChar)
            }
        }
    }
}