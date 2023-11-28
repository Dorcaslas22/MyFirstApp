package com.wtm.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val verifyBtn: Button = findViewById(R.id.verify)
        val emailEdit: EditText = findViewById(R.id.email)
        verifyBtn.setOnClickListener{
        val userEmailEntered:String = emailEdit.text.toString()
            var message = "";
            if (!userEmailEntered.matches
                    (Regex("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+\$"))){
                message = "You need to enter an email address"
             } else{
            message = "A recovery email has been sent to $userEmailEntered"
             }
        Snackbar
             .make(findViewById(R.id.layoutforgot),
               message,
                 Snackbar.LENGTH_LONG)
             .show()

    }
}
     }