package com.example.actividad12moviles

import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var scrollToggle: ToggleButton
    private lateinit var horizontalScrollView: HorizontalScrollView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Referenciamos èl toogle y el scroll

        scrollToggle = findViewById(R.id.toogle_id)
        horizontalScrollView = findViewById(R.id.scroll_id)

        // Inicializamos el scroll como false para que no sea visible
        horizontalScrollView.isHorizontalScrollBarEnabled = false


        // Eventos para mostrar y escoder la barra del scroll horizontal

        scrollToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                horizontalScrollView.isHorizontalScrollBarEnabled = true
            } else {
                horizontalScrollView.isHorizontalScrollBarEnabled = false
            }
        }
    }
}
