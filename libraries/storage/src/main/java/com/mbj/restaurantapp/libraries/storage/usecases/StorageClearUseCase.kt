package com.mbj.restaurantapp.libraries.storage.usecases

import com.mbj.restaurantapp.libraries.storage_contract.IStorage
import javax.inject.Inject

class StorageClearUseCase @Inject constructor(
    private val storage: IStorage
) : IStorageClearUseCase {
    override fun invoke() {
        storage.clear()
    }
}
