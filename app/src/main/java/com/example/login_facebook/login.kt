package com.example.login_facebook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class login : AppCompatActivity() {
    lateinit var recyclerview : RecyclerView
    lateinit var postAdapter : PostAdapter

    val posts = mutableListOf<post>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        recyclerview = findViewById(R.id.recyclerview)
        createPostAdapter()
        postAdapter = PostAdapter(posts)
        recyclerview.adapter = postAdapter
    }

    private fun createPostAdapter() {
        for (i in 1 ..30 )
        posts.add(
            post(
                title = "unblast", postImageUrl = R.drawable.yellow
            ,caption = "this post is great"
            ,profileImageUrl = R.drawable.yellow,
                timestamp = "10:00",
                likesCount = 100,
                commentsCount = 10,
                user = "Nadine")
        )
    }
}