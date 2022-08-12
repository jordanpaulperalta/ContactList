package com.androiddev.contactlist

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyBridge(private val context : Activity, private val arrayList: ArrayList<Info>)
    : ArrayAdapter<Info> (context, R.layout.contact_item, arrayList){

        override fun getView(position: Int, convertView: View?, parent: ViewGroup) : View {

            val inflater = LayoutInflater.from(context)
            val view = inflater.inflate(R.layout.contact_item, null)

            val contactPic : ImageView = view.findViewById(R.id.contactPic)
            val firstName : TextView = view.findViewById(R.id.firstName)
            val lastName : TextView = view.findViewById(R.id.lastName)
            val idNumber : TextView = view.findViewById(R.id.idNumber)
            val courseName : TextView = view.findViewById(R.id.courseName)
            val contactNumber : TextView = view.findViewById(R.id.contactNumber)

            contactPic.setImageResource(arrayList[position].picId)
            firstName.text = arrayList[position].firstName
            lastName.text = arrayList[position].lastName
            idNumber.text = arrayList[position].idNumber.toString()
            courseName.text = arrayList[position].courseName
            contactNumber.text = arrayList[position].contactNumber.toString()

            return view

        }

}