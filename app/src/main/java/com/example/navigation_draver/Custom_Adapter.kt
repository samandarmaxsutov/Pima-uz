package com.example.navigation_draver

import com.example.navigation_draver.databinding.ItemBinding
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class Custom_Adapter internal constructor(
    context: Context,
    private val nameList: Array<String>,
    private val imageList: IntArray
) : BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(position: Int): Any {
        return nameList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var convertView = view
        val holder: ViewHolder
        if (convertView == null) {
            val binding = ItemBinding.inflate(inflater)
            convertView = binding.root
            holder = ViewHolder()
            holder.imageView = binding.idImageView
            holder.name = binding.idTextView
            convertView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
        }
        holder.name!!.text = nameList[position]
        holder.imageView!!.setBackgroundResource(imageList[position])
        return convertView
    }

    inner class ViewHolder {
        internal var imageView: ImageView? = null
        internal var name: TextView? = null
    }
}