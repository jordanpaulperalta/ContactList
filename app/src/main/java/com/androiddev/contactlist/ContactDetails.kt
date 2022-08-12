package com.androiddev.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ContactDetails : AppCompatActivity() {
    lateinit var access : MyBridge
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        val bundleData : Bundle? = intent.extras

        val showPic: ImageView = findViewById(R.id.showPic)
        val pic: Int = bundleData!!.getInt("pic")
        showPic.setImageResource(pic)

        val fn = bundleData?.get("fn")
        val showFirstName : TextView = findViewById(R.id.showFirstName)
        showFirstName.text = "First Name : ${fn.toString()}"

        val ln = bundleData?.get("ln")
        val showLastName : TextView = findViewById(R.id.showLastName)
        showLastName.text = "Last Name : " + ln.toString()

        val id = bundleData?.get("id")
        val showIdNumber : TextView = findViewById(R.id.showIdNumber)
        showIdNumber.text = "ID Number : " + id.toString()

        val cn = bundleData?.get("cn")
        val showCourseName : TextView = findViewById(R.id.showCourseName)
        showCourseName.text = "Course Name : " + cn.toString()

        val con = bundleData?.get("con")
        val showContactNumber : TextView = findViewById(R.id.showContactNumber)
        showContactNumber.text = "Contact number : " + con.toString()
    }
}