package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signinactivity)

        val signup = findViewById<Button>(R.id.btn_signup)
        val id = findViewById<EditText>(R.id.id_data)
        val password = findViewById<EditText>(R.id.pw_data)



        val login = findViewById<Button>(R.id.btn_login)
        login.setOnClickListener {if (id.text.isBlank() || password.text.isBlank()) {
            Toast.makeText(this, "아이디/비밀번호를 모두 입력하세요.", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
            val edittext = findViewById<EditText>(R.id.id_data)
            val strData = edittext.text.toString()
            val intent = Intent(this, HomeActivity1::class.java)
            intent.putExtra("dataFromFirstActivity", strData)
            startActivity(intent)

        }




        signup.setOnClickListener{
            val intent = Intent(this, SignUpActivity1::class.java)
            startActivity(intent)


    }
}}}
