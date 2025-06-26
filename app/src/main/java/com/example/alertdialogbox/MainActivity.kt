package com.example.alertdialogbox

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //delare and initialize button
        val alertBtn = findViewById<Button>(R.id.btnAlert)

        alertBtn.setOnClickListener {
            showAlertDialog()
        }
    }

    private fun showAlertDialog()
    {
        val builder = AlertDialog.Builder(this) // builder is used to configure the dialog box
        builder.setTitle("Facebook")
            .setMessage("Do you want to uninstall Facebook?")
            .setPositiveButton("Yes"){dialog, which ->     //"dialog" triggers th click event , "which" identifies which button was clicked
                Toast.makeText(this, "App has been successfully uninstalled", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No")
            {dialog, which ->
               dialog.dismiss() //closes the dialog box
            }

        val alertDialogBox : AlertDialog = builder.create()
        alertDialogBox.show()
    }
}