package com.example.p1
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.ImageView
import android.os.Bundle

import androidx.activity.enableEdgeToEdge


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val imageView: ImageView = this.findViewById(R.id.imageView)
        // Set an OnClickListener on the ImageView
        imageView.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

            val imageView2: ImageView = this.findViewById(R.id.imageView2)
            // Set an OnClickListener on the ImageView
            imageView2.setOnClickListener {
                // Create an Intent to start SecondActivity
                val intent2 = Intent(this, Nonveg::class.java)
                startActivity(intent2)
                val imageView3: ImageView = this.findViewById(R.id.imageView3)
                // Set an OnClickListener on the ImageView
                imageView3.setOnClickListener {
                    // Create an Intent to start SecondActivity
                    val intent3 = Intent(this, Desserts::class.java)
                    startActivity(intent3)

                    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))
                    { v, insets ->
                        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                        v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                        )
                        insets
                    }
                }
            }
        }
    }
}


