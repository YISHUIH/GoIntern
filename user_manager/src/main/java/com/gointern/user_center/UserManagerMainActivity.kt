package com.gointern.user_center

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_user_manager_main.*

class UserManagerMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_manager_main)
        Glide.with(this).load(R.mipmap.ic_launcher).into(image)
    }
}
