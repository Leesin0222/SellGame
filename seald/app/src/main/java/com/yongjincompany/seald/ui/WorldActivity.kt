package com.yongjincompany.seald.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.yongjincompany.seald.R
import com.yongjincompany.seald.databinding.ActivityWorldBinding


class WorldActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWorldBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorldBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }


}