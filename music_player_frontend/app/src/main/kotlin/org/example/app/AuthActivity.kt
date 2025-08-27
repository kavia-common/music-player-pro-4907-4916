package org.example.app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

/**
 * PUBLIC_INTERFACE
 * AuthActivity
 * Placeholder authentication screen providing email/password inputs and a sign-in button.
 * Parameters: none
 * Returns: none
 */
class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val email: EditText = findViewById(R.id.input_email)
        val password: EditText = findViewById(R.id.input_password)
        val btn: Button = findViewById(R.id.btn_sign_in)

        btn.setOnClickListener {
            // Placeholder: Validate inputs and proceed
            finish() // return to MainActivity
        }
    }
}
