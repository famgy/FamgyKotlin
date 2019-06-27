package com.famgy.famgykotlin.ui.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.famgy.famgykotlin.R

class ChooseMenuAdapter(private val dataList: ArrayList<String>) : RecyclerView.Adapter<ChooseMenuAdapter.ChooseMenuViewHolder>() {
    override fun onBindViewHolder(holder: ChooseMenuViewHolder, position: Int) {
        holder.textView.setText(dataList[position])
    }

    override fun getItemCount() = dataList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChooseMenuViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false) as TextView

        return ChooseMenuViewHolder(textView)
    }

    class ChooseMenuViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}