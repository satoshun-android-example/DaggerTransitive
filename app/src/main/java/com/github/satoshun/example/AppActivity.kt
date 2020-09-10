package com.github.satoshun.example

import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.lib1.Lib1
import javax.inject.Inject

class AppActivity : AppCompatActivity(R.layout.app_act) {
  @Inject lateinit var lib1: Lib1
}
