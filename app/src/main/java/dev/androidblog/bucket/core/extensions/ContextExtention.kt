package dev.androidblog.bucket.core.extensions

import android.content.Context
import android.widget.Toast

fun Context?.showShortToast(msg: String) {
    this?.let {
        Toast.makeText(it, msg, Toast.LENGTH_SHORT).show()
    }
}

fun Context?.showLongToast(msg: String) {
    this?.let {
        Toast.makeText(it, msg, Toast.LENGTH_LONG).show()
    }
}