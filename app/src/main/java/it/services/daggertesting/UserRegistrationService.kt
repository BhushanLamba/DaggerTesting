package it.services.daggertesting

import javax.inject.Inject

class UserRegistrationService @Inject constructor (private val userRepository: UserRepository,
                                                   private val emailService: EmailService) {

    fun registerUser()
    {
        userRepository.saveUser()
        emailService.sendEmail()
    }


}