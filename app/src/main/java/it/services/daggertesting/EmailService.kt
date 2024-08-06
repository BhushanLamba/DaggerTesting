package it.services.daggertesting

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail()
    {
        Log.d("TAG", "sendEmail: ")
    }
}