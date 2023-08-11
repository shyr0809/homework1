package com.example.homework1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up1)


        val name = findViewById<EditText>(R.id.signup_name_data)
        val id = findViewById<EditText>(R.id.signup_id_data)
        val password = findViewById<EditText>(R.id.signup_pw_data)
        val signupBtn = findViewById<Button>(R.id.btn_signup_page)

        signupBtn.setOnClickListener {
            if (name.text.isBlank() || id.text.isBlank() || password.text.isBlank()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "회원가입 성공!", Toast.LENGTH_SHORT).show()
                intent.putExtra("id", id.text.toString())
                intent.putExtra("password", password.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            }



    }
}}