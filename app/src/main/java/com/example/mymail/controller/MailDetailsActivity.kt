package com.example.mymail.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymail.R
import com.example.mymail.databinding.ActivityMailDetailsBinding
import com.example.mymail.model.EmailUser

class MailDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMailDetailsBinding
    private lateinit var mailList: List<EmailUser>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMailDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val ivImage = intent.getIntExtra("email_photo",0)
        val tvName = intent.getStringExtra("email_username")
        val tvSubject = intent.getStringExtra("email_subject")
        val tvLongMessage = intent.getStringExtra("email_longmessage")
        val tvTime = intent.getStringExtra("email_time")

        binding.ivImage.setImageResource(ivImage)
        binding.tvUsername1.text = tvName
        binding.tvSubject1.text = tvSubject
        binding.tvLongMessage.text=tvLongMessage
//        if (tvLongMessage != null) {
//            binding.tvLongMessage.text = tvLongMessage.substring(1,10) + "..."
//        }
        binding.tvTime1.text=tvTime
    }
}