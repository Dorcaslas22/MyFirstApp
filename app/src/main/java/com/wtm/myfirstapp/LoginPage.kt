package com.wtm.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val forgotPasswordBtn: TextView =findViewById(R.id.forgot)
        forgotPasswordBtn.setOnClickListener{
            val intent = Intent(this,ForgotPassword::class.java)
            startActivity(intent)
    }
        val createAccountBtn: TextView =findViewById(R.id.create1)
        createAccountBtn.setOnClickListener{
            val intent = Intent(this,CreateAccount::class.java)
            startActivity(intent)
}
        val loginBtn: Button =findViewById(R.id.Login)
        val username: EditText= findViewById(R.id.username)
        val password: EditText= findViewById(R.id.password)
        loginBtn.setOnClickListener{
            val usernameTxt: String = username.text.toString()
            val passwordTxt: String = password.text.toString()
            var message: String =""
            if (usernameTxt != "Dorcas"){
                message = "Wrong Username"

            }else if (passwordTxt != "demo"){
                message = "Invalid Password"
            }
            if (message.isNotEmpty()){
                Snackbar.make(findViewById(R.id.layoutlog),message,Snackbar.LENGTH_LONG).show()
                 }else{
                     navigateToLoginPage()



    }
     }
     }

    private fun navigateToLoginPage() {
        val intent = Intent(this,HomePage::class.java)
        startActivity(intent)
    }
}