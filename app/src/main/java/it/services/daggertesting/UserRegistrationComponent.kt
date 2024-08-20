package it.services.daggertesting

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getEmailService(): EmailService

    fun getUserRepository():UserRepository
    fun getUserRegistration():UserRepository
}