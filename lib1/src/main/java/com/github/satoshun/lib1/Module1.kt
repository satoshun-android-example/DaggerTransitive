package com.github.satoshun.lib1

import com.github.satoshun.lib2.Component2
import com.github.satoshun.lib2.Lib22
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
interface Module1 {
  companion object {
    @Provides
    fun provideLib11(lib22: Lib22): Lib11 = Lib11(lib22)
  }
}

class Lib1 @Inject constructor(
//  private val lib2: Lib2
)

class Lib11(private val lib22: Lib22)

@Component(
  dependencies = [Component2::class],
  modules = [Module1::class]
)
interface Component1 {
  fun lib11(): Lib11
}
