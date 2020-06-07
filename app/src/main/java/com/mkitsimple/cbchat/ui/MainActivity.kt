package com.mkitsimple.cbchat.ui
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mkitsimple.cbchat.R
import com.mkitsimple.cbchat.ui.views.ChatFromItem
import com.mkitsimple.cbchat.ui.views.ChatToItem
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_chat_log.*


class MainActivity : AppCompatActivity() {

    val adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_chat_log)

        setDummyData()
    }

    private fun setDummyData() {
        recyclerview_chat_log.adapter = adapter

        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
    }
}
