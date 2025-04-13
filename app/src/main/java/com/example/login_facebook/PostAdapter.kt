package com.example.login_facebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.login_facebook.databinding.ItemPostBinding

class PostAdapter(private val postList: List<post>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val Postview = layoutInflater.inflate(R.layout.item_post,parent,false)
        return PostViewHolder(Postview)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = postList[position]
        holder.bind(post)

        }

    override fun getItemCount(): Int  = postList.size

    class PostViewHolder( postView: View) : RecyclerView.ViewHolder(postView){
        private val profile : ImageView = postView.findViewById(R.id.profile_image)
        private val profileName = postView.findViewById<TextView>(R.id.title)
        private val post_image : ImageView = postView.findViewById(R.id.image2)
        private val caption = postView.findViewById<TextView>(R.id.caption)

        fun bind(post: post) {
            profile.setImageResource(post.profileImageUrl)
            post_image.setImageResource(post.postImageUrl)
            profileName.text = post.title
            caption.text = post.caption

        }
    }


}
