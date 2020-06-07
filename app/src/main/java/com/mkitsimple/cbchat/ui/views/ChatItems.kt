package com.mkitsimple.cbchat.ui.views

import com.mkitsimple.cbchat.R
import com.mkitsimple.cbchat.models.User
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.chat_from_row.view.*
import kotlinx.android.synthetic.main.chat_to_row.view.*

//class ChatFromItem(val text: String, val user: User): Item<ViewHolder>() {
class ChatFromItem(): Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.textview_from_row.text = "Hello there"

        val uri = R.drawable.pi
        val targetImageView = viewHolder.itemView.imageview_chat_from_row
        Picasso.get().load(uri).into(targetImageView)
    }

    override fun getLayout(): Int {
        return R.layout.chat_from_row
    }
}

class ChatToItem(): Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
//        viewHolder.itemView.textview_to_row.text = "Where are you now?"

        val uri = R.drawable.pi
        val targetImageView = viewHolder.itemView.imageview_chat_to_row
        Picasso.get().load(uri).into(targetImageView)
    }

    override fun getLayout(): Int {
        return R.layout.chat_to_row
    }
}