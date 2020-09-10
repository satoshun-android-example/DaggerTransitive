package com.github.satoshun.example

import dagger.Component

@Component
interface AppComponent {
  fun injectAppActivity(activity: AppActivity): AppActivity
}
