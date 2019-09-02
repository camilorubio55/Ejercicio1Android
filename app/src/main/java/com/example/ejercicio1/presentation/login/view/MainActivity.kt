package com.example.ejercicio1.presentation.login.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ejercicio1.R
import com.example.ejercicio1.base.BaseActivity
import com.example.ejercicio1.presentation.login.LoginContract
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sin

class MainActivity : BaseActivity(), LoginContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BtIngresar.setOnClickListener {
            signIn()
        }
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun showError(msgError: String) {
        Toast.makeText(this,msgError,Toast.LENGTH_SHORT).show()
    }

    override fun showProgressBar() {
        progressBar_SingIn.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        progressBar_SingIn.visibility = View.GONE
    }

    override fun signIn() {
        toast(this,"Prueba 1")
    }
}
