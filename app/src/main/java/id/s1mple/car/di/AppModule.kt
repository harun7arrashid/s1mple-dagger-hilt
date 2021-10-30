package id.s1mple.car.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import id.s1mple.car.Engine
import javax.inject.Singleton

@Module // untuk memberitahu bahwa suatu class adalah module
@InstallIn(SingletonComponent::class) // untuk memasukan module ini ke Component yg di inginkan
class AppModule {
    @Singleton
    @Provides // untuk mengsuplai Object
    fun provideEngine(@ApplicationContext context: Context): Engine = Engine(context)
}