package com.example.devajob20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import  com.example.devajob20.KelasAdapter
import com.example.devajob20.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "AHMAD ARDHI SETIAWAN",
        "ANISATUR ROFIQOH",
        "AYU FEBRIANA PUTRI",
        "BOWO SAKTI WIRATAMA",
        "DANUARDI WAHYU ",
        "DEVA BUDIYANA",
        "DWI FEBRI STIYANINGRUM",
        "EVA ROHAS",
        "FELIM EDI PRABOWO",
        "FITRI RAHMAWATI",
        "HAMDAN AINUN NA'IM"
    )

    val listNis = arrayOf(
        "2973",
        "2974",
        "2977",
        "2979",
        "2981",
        "2982",
        "2985",
        "2987",
        "2988",
        "2992",
        "2993",
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}