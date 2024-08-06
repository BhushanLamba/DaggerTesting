package it.services.daggertesting

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser()
    {
        Log.d("TAG", "saveUser: ")
    }
}