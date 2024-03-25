package kr.co.fastcampus.part4plus.restaurantapp.di

import com.mbj.restaurantapp.libraries.storage.StorageManager
import com.mbj.restaurantapp.libraries.storage.helpers.DataConverter
import com.mbj.restaurantapp.libraries.storage.helpers.DataEncoding
import com.mbj.restaurantapp.libraries.storage.prefs.SharedPrefsStorageProvider
import com.mbj.restaurantapp.libraries.storage.prefs.StorageProvider
import com.mbj.restaurantapp.libraries.storage_contract.IStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule {

    @Singleton
    @Provides
    fun bindOnDiscStorage(
        storage: StorageProvider,
        converter: DataConverter,
        encoding: DataEncoding
    ): IStorage = StorageManager(storage, converter, encoding)

    @Provides
    fun provideSharePrefStorageProvider(provider: SharedPrefsStorageProvider): StorageProvider = provider
}
