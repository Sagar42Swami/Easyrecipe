package com.example.p1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity()
{

    public override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bt:Button=findViewById(R.id.b1)
        val textViewRecipe:TextView = findViewById(R.id.textView2)
        val textViewRecipe3:TextView = findViewById(R.id.textView3)
        val iv9:ImageView =findViewById(R.id.iv9)
        val bt2:Button=findViewById(R.id.b2)
        bt.setOnClickListener {

            val recipe = """
                Ingredients:
                - 2 cups flour
                - 1 cup sugar
                - 1/2 cup butter
                - 2 eggs
                - 1 tsp vanilla

                Procedure:
                1. Preheat the oven to 350°F (175°C).
                2. In a bowl, mix the flour, sugar, and butter.
                3. Add eggs and vanilla, and mix until smooth.
                4. Pour the mixture into a greased pan and bake for 30 minutes.
                5. Let it cool, then serve.
            """.trimIndent()
            textViewRecipe3.visibility=View.GONE
            iv9.visibility=View.GONE
            bt2.visibility=View.GONE
            // Display the recipe in the TextView
            textViewRecipe.text = recipe
            textViewRecipe.visibility = View.VISIBLE // Make the TextView visible
        }


    }
}