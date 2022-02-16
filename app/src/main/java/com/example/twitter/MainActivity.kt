package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    lateinit var recyclerFeed: RecyclerView
    lateinit var recyclerStory: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        recyclerFeed=findViewById(R.id.recyclerFood)
        recyclerStory=findViewById(R.id.recyclerStory)


        val manager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerStory.setLayoutManager(manager)

        val manager2=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerFeed.layoutManager=manager2

        refreshFeedAdapter(getAllFeed())
        refreshStoryAdapter(getAllStory())
    }

    private fun refreshFeedAdapter(feeds : ArrayList<Post>) {

        val adapter=FeedAdapter(this,feeds)
        recyclerFeed.adapter=adapter

    }

    private fun refreshStoryAdapter(story : ArrayList<Story>) {

        val adapter=StoryAdapter(this,story)
        recyclerStory.adapter=adapter

    }
    fun getAllFeed(): ArrayList<Post>{
        var feeds : ArrayList<Post> = ArrayList()

        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))
        feeds.add(Post(R.drawable.me,"Shaxzod",R.drawable.me))


        return feeds
    }


    fun getAllStory(): ArrayList<Story>{
        var storys : ArrayList<Story> = ArrayList()

      storys.add(Story(R.drawable.me,"Shaxzod"))
      storys.add(Story(R.drawable.me,"Shaxzod"))
      storys.add(Story(R.drawable.me,"Shaxzod"))
      storys.add(Story(R.drawable.me,"Shaxzod"))
      storys.add(Story(R.drawable.me,"Shaxzod"))
      storys.add(Story(R.drawable.me,"Shaxzod"))
      storys.add(Story(R.drawable.me,"Shaxzod"))
      storys.add(Story(R.drawable.me,"Shaxzod"))

        return storys
    }
}