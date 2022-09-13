package dev.androidblog.bucket.data.item.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * title
 * data
 * filterType 필터링될 옵션 (url, file, number....)
 * createAt
 * updateAt
 */
@Entity
data class ItemEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val data: String,
    val filterType: String,
    val createAt: Long,
    val updateAt: Long,
)