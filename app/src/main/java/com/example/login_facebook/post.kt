package com.example.login_facebook

data class post (
    val user : String,
    val title: String,
    val profileImageUrl: Int,
    val postImageUrl: Int,
    val caption: String,
    val timestamp: String,
    val likesCount: Int,
    val commentsCount: Int
)