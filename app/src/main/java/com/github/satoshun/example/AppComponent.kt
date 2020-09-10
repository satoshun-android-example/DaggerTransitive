package com.github.satoshun.example

import com.github.satoshun.lib1.Component1
import dagger.Component

@Component(
  dependencies = [Component1::class],
//  modules = [Module1::class]
)
interface AppComponent {
  fun injectAppActivity(activity: AppActivity): AppActivity
}
