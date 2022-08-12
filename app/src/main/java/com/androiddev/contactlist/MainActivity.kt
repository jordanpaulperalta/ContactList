package com.androiddev.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactList : ListView = findViewById(R.id.contactList)
        val contactPerson = ArrayList<Info>()

        val contact1 = Info(R.drawable.android,"Adam","Apple",101,"Mobile App Dev",587000123)
        val contact2 = Info(R.drawable.android2,"Bryan","Banana",201,"Business Admin",587000122)
        val contact3 = Info(R.drawable.deadpool,"Chris","Cantaloupe",301,"Mobile App Dev",587000125)
        val contact4 = Info(R.drawable.deadpool2,"Darryl","Dates",401,"Business Admin",587000127)
        val contact5 = Info(R.drawable.frost,"Evan","Elderberry",501,"Mobile App Dev",587000123)
        val contact6 = Info(R.drawable.ic_launcher_background,"Francis","Feijoa",601,"Business Admin",587000546)
        val contact7 = Info(R.drawable.ic_launcher_foreground,"Gavin","Grapes",701,"Mobile App Dev",587000132)
        val contact8 = Info(R.drawable.marshmallow,"Harry","Honeydew",801,"Business Admin",587000134)
        val contact9 = Info(R.drawable.starry_night,"Isaac","Igloo",901,"Mobile App Dev",587000136)
        val contact10 = Info(R.drawable.wolf,"Jacob","Jackfruit",1011,"Business Admin",587000456)

        contactPerson.add(contact1)
        contactPerson.add(contact2)
        contactPerson.add(contact3)
        contactPerson.add(contact4)
        contactPerson.add(contact5)
        contactPerson.add(contact6)
        contactPerson.add(contact7)
        contactPerson.add(contact8)
        contactPerson.add(contact9)
        contactPerson.add(contact10)

        val bridge = MyBridge(this, contactPerson)
        contactList.adapter = bridge

        val sendData = Intent(this, ContactDetails::class.java)

        contactList.setOnItemClickListener { adapterView, view, i, l ->
            sendData.putExtra("pic", contactPerson.get(i).picId)
            sendData.putExtra("fn", contactPerson.get(i).firstName)
            sendData.putExtra("ln", contactPerson.get(i).lastName)
            sendData.putExtra("id", contactPerson.get(i).idNumber)
            sendData.putExtra("cn", contactPerson.get(i).courseName)
            sendData.putExtra("con", contactPerson.get(i).contactNumber)
            startActivity(sendData)
        }
    }
}