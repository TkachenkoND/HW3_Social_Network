package com.example.hw_3.View

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.hw_3.R
import com.example.hw_3.ViewModel.UserViewModel

class UserListActivity : AppCompatActivity() {

    private lateinit var vm: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_list_activity)

        vm = ViewModelProvider(this).get(UserViewModel::class.java)

        val user1: LinearLayout = findViewById(R.id.layout1)
        val user2: LinearLayout = findViewById(R.id.layout2)
        val user3: LinearLayout = findViewById(R.id.layout3)
        val user4: LinearLayout = findViewById(R.id.layout4)
        val user5: LinearLayout = findViewById(R.id.layout5)
        val user6: LinearLayout = findViewById(R.id.layout6)
        val user7: LinearLayout = findViewById(R.id.layout7)

        val userName1: TextView = findViewById(R.id.userName1)
        val userName2: TextView = findViewById(R.id.userName2)
        val userName3: TextView = findViewById(R.id.userName3)
        val userName4: TextView = findViewById(R.id.userName4)
        val userName5: TextView = findViewById(R.id.userName5)
        val userName6: TextView = findViewById(R.id.userName6)
        val userName7: TextView = findViewById(R.id.userName7)

        val userTime1: TextView = findViewById(R.id.timeToOnline1)
        val userTime2: TextView = findViewById(R.id.timeToOnline2)
        val userTime3: TextView = findViewById(R.id.timeToOnline3)
        val userTime4: TextView = findViewById(R.id.timeToOnline4)
        val userTime5: TextView = findViewById(R.id.timeToOnline5)
        val userTime6: TextView = findViewById(R.id.timeToOnline6)
        val userTime7: TextView = findViewById(R.id.timeToOnline7)

        val userPhoto1: ImageView = findViewById(R.id.userPhoto1)
        val userPhoto2: ImageView = findViewById(R.id.userPhoto2)
        val userPhoto3: ImageView = findViewById(R.id.userPhoto3)
        val userPhoto4: ImageView = findViewById(R.id.userPhoto4)
        val userPhoto5: ImageView = findViewById(R.id.userPhoto5)
        val userPhoto6: ImageView = findViewById(R.id.userPhoto6)
        val userPhoto7: ImageView = findViewById(R.id.userPhoto7)

        val imUri = "https://cameralabs.org/media/k2/items/cache/3cb06e4cb464be7a87ae9907c7d62b4b_L.jpg"
        vm.loadUserData()

        vm.userLiveData.observe(this, Observer {
            userName1.text = it.userList[0].name
            userTime1.text = it.userList[0].time
            Glide.with(this)
                .load(it.userList[0].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(userPhoto1)

            userName2.text = it.userList[1].name
            userTime2.text = it.userList[1].time
            Glide.with(this)
                .load(it.userList[1].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(userPhoto2)

            userName3.text = it.userList[2].name
            userTime3.text = it.userList[2].time
            Glide.with(this)
                .load(it.userList[2].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(userPhoto3)


            userName4.text = it.userList[3].name
            userTime4.text = it.userList[3].time
            Glide.with(this)
                .load(it.userList[3].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(userPhoto4)


            userName5.text = it.userList[4].name
            userTime5.text = it.userList[4].time
            Glide.with(this)
                .load(it.userList[4].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(userPhoto5)


            userName6.text = it.userList[5].name
            userTime6.text = it.userList[5].time
            Glide.with(this)
                .load(it.userList[5].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(userPhoto6)


            userName7.text = it.userList[6].name
            userTime7.text = it.userList[6].time
            Glide.with(this)
                .load(it.userList[6].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(userPhoto7)



        })


        user1.setOnClickListener {
            val intent = Intent(this, DetailsUser1Activity::class.java)
            startActivity(intent);
        }

        user2.setOnClickListener {
            val intent = Intent(this, DetailsUser2Activity::class.java)
            startActivity(intent);
        }

        user3.setOnClickListener {
            val intent = Intent(this, DetailsUser3Activity::class.java)
            startActivity(intent);
        }

        user4.setOnClickListener {
            val intent = Intent(this, DetailsUser4Activity::class.java)
            startActivity(intent);
        }

        user5.setOnClickListener {
            val intent = Intent(this, DetailsUser5Activity::class.java)
            startActivity(intent);
        }

        user6.setOnClickListener {
            val intent = Intent(this, DetailsUser6Activity::class.java)
            startActivity(intent);
        }

        user7.setOnClickListener {
            val intent = Intent(this, DetailsUser7Activity::class.java)
            startActivity(intent);
        }


    }


}