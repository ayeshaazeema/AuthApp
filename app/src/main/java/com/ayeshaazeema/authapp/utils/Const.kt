package com.ayeshaazeema.authapp.utils

object Const {
    val COLLECTION_PATH = "recipes"

    fun setTimeStamp(): Long {
        val time = (-1 * System.currentTimeMillis())
        return time
    }
}