package com.github.satoshun.lib2

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
interface Module2 {
  companion object {
    @Provides
    fun provideLib22(): Lib22 = Lib22()
  }
}

class Lib2 @Inject constructor()

class Lib22

@Component(modules = [Module2::class])
interface Component2 {
  fun lib22(): Lib22
}
