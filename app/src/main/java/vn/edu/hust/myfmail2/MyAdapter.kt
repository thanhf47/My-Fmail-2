package vn.edu.hust.myfmail2

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings.LayoutAlgorithm
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextClock
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MyAdapter(val itemList: List<ItemModel>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(val item: View) : RecyclerView.ViewHolder(item) {
        val sender = item.findViewById<TextView>(R.id.sender)
        val time = item.findViewById<TextClock>(R.id.time)
        val message = item.findViewById<TextView>(R.id.message)
        val iconImage = item.findViewById<TextView>(R.id.icon_image)
        val selected = item.findViewById<CheckBox>(R.id.selected)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.sender.text = itemList[position].sender
        holder.message.text = itemList[position].Message
        holder.time.text = itemList[position].Time

        val color = itemList[position].color
        val shape = GradientDrawable()
        shape.shape = GradientDrawable.OVAL
        shape.setColor(color)
        holder.iconImage.background = shape
        holder.iconImage.text = itemList[position].sender[0].toString()


        holder.selected.isChecked = itemList[position].selected
        if (holder.selected.isChecked) holder.selected.setButtonDrawable(android.R.drawable.star_on)
        else holder.selected.setButtonDrawable((android.R.drawable.star_off))

        holder.selected.setOnClickListener {
            itemList[position].selected = (it as CheckBox).isChecked
            notifyDataSetChanged()
        }
    }
}