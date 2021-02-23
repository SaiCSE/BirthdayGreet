package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.clevertap.android.sdk.CleverTapAPI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // overding onCreate methods, we can use onPause, OnDestroy, OnClick,etc

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Clevertap variables
        var cleverTapDefaultInstance: CleverTapAPI? = null
        cleverTapDefaultInstance = CleverTapAPI.getDefaultInstance(applicationContext)


    }

    //Creating a new button and linking it to the button in the main activity xml file
    //CreateBirthdayButton.setOnClickListner {}

    //or

    // we can use the above method or use or set a onclick property in the event [button click] acitivty in the activity main xml file


        fun createBirthdayCard(view: View) {

            // Lets print a toast
            // Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()

            // we can use the input text as toast message here
            // We extracted the name via editableText from nameInput, converted it to string and passed it to toast
            val name = nameInput.editableText.toString()
            Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()






        }


    }


