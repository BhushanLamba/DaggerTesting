package it.services.daggertesting

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String,password:String)
    {
        Log.d("dagger", "saveUser: $email $password")
    }
}