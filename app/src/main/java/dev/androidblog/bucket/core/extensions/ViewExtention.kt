package dev.androidblog.bucket.core.extensions

import androidx.viewbinding.ViewBinding

fun ViewBinding?.safe(block: () -> Unit) {
    this?.let {
        block()
    }
}
