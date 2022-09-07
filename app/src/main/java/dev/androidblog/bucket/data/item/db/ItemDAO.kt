package dev.androidblog.bucket.data.item.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDao {

    @Query("SELECT * FROM itemEntity")
    fun getAll(): List<ItemEntity>

    @Insert
    fun insertAll(vararg users: ItemEntity)

    @Delete
    fun delete(itemEntity: ItemEntity)

}