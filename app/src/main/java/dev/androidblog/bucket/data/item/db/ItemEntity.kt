package dev.androidblog.bucket.data.item.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ItemEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val data: String,
    val createAt: Long,
    val updateAt: Long,
)