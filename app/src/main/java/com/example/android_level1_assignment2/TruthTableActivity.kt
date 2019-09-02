package com.example.android_level1_assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.truth_activity.*

class TruthTableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.truth_activity)

        btnSubmit.setOnClickListener {
            validateAnswers()
        }
    }

    /**
     * Validates wheather the answers of the user where valid.
     */
    private fun validateAnswers() {
        if (tvRowOne.text.toString().toUpperCase() == "T" && tvRowTwo.text.toString().toUpperCase() == "F" &&
            tvRowThree.text.toString().toUpperCase() == "F" && tvRowFour.text.toString().toUpperCase() == "F"
        ) {
            onCorrectAnswers()
        } else {
            onIncorrectAnswers()
        }
    }

    /**
     * Method to inform the user his answers where valid
     */
    private fun onCorrectAnswers() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }

    /**
     * Method to inform the user his answers where invalid
     */
    private fun onIncorrectAnswers() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
    }
}
