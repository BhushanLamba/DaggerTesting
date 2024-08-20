package it.services.daggertesting

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(email: String, from: String, to: String)
    {
        Log.d("dagger", "sendEmail: $email $from $to")
    }
}