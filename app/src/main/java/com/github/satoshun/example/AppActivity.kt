package com.github.satoshun.example

import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.lib1.Lib1
import com.github.satoshun.lib1.Lib11
import javax.inject.Inject

class AppActivity : AppCompatActivity(R.layout.app_act) {
  @Inject lateinit var lib1: Lib1
  @Inject lateinit var lib11: Lib11
}
