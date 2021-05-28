package com.hosseinkurd.smacksample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jivesoftware.smack.AbstractXMPPConnection
import org.jivesoftware.smack.tcp.XMPPTCPConnection

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a connection and login to the example.org XMPP service.
        // Create a connection and login to the example.org XMPP service.
        val conn1: AbstractXMPPConnection = XMPPTCPConnection("username", "password", "example.org")
        conn1.connect().login()
    }
}