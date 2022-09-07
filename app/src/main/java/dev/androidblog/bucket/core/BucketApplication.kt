package dev.androidblog.bucket.core

import android.app.Application
import dev.androidblog.bucket.BuildConfig
import timber.log.Timber

class BucketApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}