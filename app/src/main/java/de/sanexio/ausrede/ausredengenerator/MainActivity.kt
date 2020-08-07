package de.sanexio.ausrede.ausredengenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    val eins = listOf("Harmonische", "Solaren","Termalen","Linearen","Heisenbergschen","Kollidierten","Magnetischen","Konstanten","Subharmonischen")
    val zwei = listOf("Störungen","Interferenzen", "Kollisionen","Interups", "Determinierungen","Kompilierungen")
    val drei = listOf("RAM", "CD", "LAN","WAN","CPU","HDD", "IOT")
    val vier =listOf("Bus", "Controller","Stack","Array","Communications Interfaces","Treiber")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {
            val random = Random()
            var max = 30
            var min = 0
            val zufall1 = random.nextInt(eins.size - min) + min
            val zufall2 = random.nextInt(zwei.size - min) + min
            val zufall3 = random.nextInt(drei.size - min) + min
            val zufall4 = random.nextInt(vier.size - min) + min
            ausgabe.setText("Es liegt an ${eins[zufall1]} ${zwei[zufall2]} im ${drei[zufall3]} ${vier[zufall4]} ")
        }


    }
}
