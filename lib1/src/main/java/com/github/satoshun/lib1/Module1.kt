package com.github.satoshun.lib1

import com.github.satoshun.lib2.Lib2
import dagger.Module
import javax.inject.Inject

@Module
interface Module1

class Lib1 @Inject constructor(
  private val lib2: Lib2
)
