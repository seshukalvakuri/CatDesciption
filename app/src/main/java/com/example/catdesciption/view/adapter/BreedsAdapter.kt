package com.example.catdesciption.view.adapter

import Json4Kotlin_Base
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.catdesciption.R

class BreedsAdapter(var breedsList: List<Json4Kotlin_Base>): RecyclerView.Adapter<BreedsAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imageView)
        val id: TextView = itemView.findViewById(R.id.id_tv)
        val name: TextView = itemView.findViewById(R.id.name_tv)
        val username: TextView = itemView.findViewById(R.id.username_tv)
        val email: TextView = itemView.findViewById(R.id.email_tv)
        val phone: TextView = itemView.findViewById(R.id.phone_tv)
        val website: TextView = itemView.findViewById(R.id.website_tv)
        val street: TextView = itemView.findViewById(R.id.street_tv)
        val suite: TextView = itemView.findViewById(R.id.suite_tv)
        val city: TextView = itemView.findViewById(R.id.city_tv)
        val zipcode: TextView = itemView.findViewById(R.id.zipcode_tv)
        val lat: TextView = itemView.findViewById(R.id.lat_tv)
        val lng: TextView = itemView.findViewById(R.id.lng_tv)
        val company: TextView = itemView.findViewById(R.id.company_tv)
        val catchPhrase: TextView = itemView.findViewById(R.id.catchPhrase_tv)
        val bs: TextView = itemView.findViewById(R.id.bs_tv)
    }

}