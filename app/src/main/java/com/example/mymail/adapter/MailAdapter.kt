package com.example.mymail.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mymail.R
import com.example.mymail.model.EmailUser
import com.google.android.material.imageview.ShapeableImageView

class MailAdapter(private val context: Context, private val mailList:List<EmailUser>): BaseAdapter() {
    private val inflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater

    override fun getCount(): Int = mailList.size
    override fun getItem(position: Int): Any = mailList[position]

    override fun getItemId(position: Int): Long = position.toLong()
    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val rowView =inflater.inflate(R.layout.list_item ,p2,false)


        val tvName = rowView.findViewById<TextView>(R.id.tvName)
        val shivProfilePicture = rowView.findViewById<ShapeableImageView>(R.id.shivProfilePicture)
        val tvSubject = rowView.findViewById<TextView>(R.id.tvSubject)
        val tvLongMessage = rowView.findViewById<TextView>(R.id.tvLongMessage)
        val tvTime = rowView.findViewById<TextView>(R.id.tvTime)



        shivProfilePicture.setImageResource(mailList[position].profilePicture)
        tvName.text = mailList[position].Userame
        tvSubject.text = mailList[position].Subject
        tvLongMessage.text = mailList[position].LongMessage?.substring(0,20) + "..."
        tvTime.text=mailList[position].Time


        return rowView

    }

    }


