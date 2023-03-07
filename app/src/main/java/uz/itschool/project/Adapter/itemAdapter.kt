package uz.itschool.project.Adapter

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.project.CategoryFood
import uz.itschool.project.Ingredient
import uz.itschool.project.R

class itemAdapter(var item_list: Array<CategoryFood>) :RecyclerView.Adapter<itemAdapter.MyHolder>(){
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.name)
        var img = itemView.findViewById<ImageView>(R.id.img)
        var cardView = itemView.findViewById<CardView>(R.id.cardviewItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val index= item_list[position]
        holder.name.text = index.n
        holder.img.setImageResource(index.photo)
        holder.cardView.setCardBackgroundColor(index.color)
    }

    override fun getItemCount(): Int {
        return item_list.size
    }
}