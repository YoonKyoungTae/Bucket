package dev.androidblog.bucket.data

import android.content.Context
import androidx.room.Room
import dev.androidblog.bucket.data.item.db.ItemDataBase

class RoomManager {

    fun getItemDataBase(context: Context): ItemDataBase = Room.databaseBuilder(context, ItemDataBase::class.java, "database-bucket").build()

}