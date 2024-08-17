package it.services.daggertesting

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getEmailService(): EmailService
}