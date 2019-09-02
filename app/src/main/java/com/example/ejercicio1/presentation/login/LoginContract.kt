package com.example.ejercicio1.presentation.login

interface LoginContract {

    interface View{
        fun showError(msgError:String)
        fun showProgressBar()
        fun hideProgressBar()
        fun signIn()
    }

}