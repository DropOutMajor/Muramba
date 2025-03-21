// MainActivity.kt or the respective Fragment file

package com.example.muramba_2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.cardview.widget.CardView
private lateinit var panicButtonHelper: Panic_Button
class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Setting click listeners for each card to open respective pages

        // Consult Page
        view.findViewById<CardView>(R.id.cardConsult).setOnClickListener {
            val intent = Intent(activity, Messages::class.java)
            startActivity(intent)
        }

        // Connect Page
        view.findViewById<CardView>(R.id.cardConnect).setOnClickListener {
            val intent = Intent(activity, Connect::class.java)
            startActivity(intent)
        }

        // About Us Page
        view.findViewById<CardView>(R.id.cardAboutUs).setOnClickListener {
            val intent = Intent(activity, About_us::class.java)
            startActivity(intent)
        }

        // Services Page
        view.findViewById<CardView>(R.id.cardServices).setOnClickListener {
            val intent = Intent(activity, Services::class.java)
            startActivity(intent)
        }

        // Contact Us Page
        view.findViewById<CardView>(R.id.cardContactUs).setOnClickListener {
            val intent = Intent(activity, Contact_us::class.java)
            startActivity(intent)
        }

        // Access Control Page
        view.findViewById<CardView>(R.id.cardAccessControl).setOnClickListener {
            val intent = Intent(activity, Access_Control::class.java)
            startActivity(intent)
        }
        // Initialize PanicButtonHelper
        panicButtonHelper = Panic_Button(requireContext())

        // Set up long-press listener
        val panicButton = view.findViewById<ImageButton>(R.id.panicButton)
        panicButton.setOnLongClickListener {
            panicButtonHelper.handleLongPress()
            true // return true to indicate the event is handled
        }

        return view
    }


}
