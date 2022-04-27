package com.example.homework05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listFrag = ListFragment()
        val mapFrag = MapFragment()

        val botnav: BottomNavigationView = findViewById(R.id.bot_nav)
        val navController = findNavController(R.id.fragmentHost)
        botnav.setupWithNavController(navController)

    /*val exampleList = generateData()
    val myRV: RecyclerView = findViewById(R.id.recyclerView)
    myRV.adapter = myAdapter(exampleList)
    myRV.layoutManager = LinearLayoutManager(this)
    myRV.setHasFixedSize(true)*/
}
    public fun generateData(): List<MyData> {
        val list = ArrayList<MyData>()
        val countryList: List<String> = resources.getStringArray(R.array.country_list).toList()
        val populationList: List<String> = resources.getStringArray(R.array.population_list).toList()
        var image = R.drawable.usa
        list += MyData(image, countryList[0], populationList[0])
        image = R.drawable.mexico
        list += MyData(image, countryList[1], populationList[1])
        image = R.drawable.canada
        list += MyData(image, countryList[2], populationList[2])
        image = R.drawable.guatemala
        list += MyData(image, countryList[3], populationList[3])
        image = R.drawable.cuba
        list += MyData(image, countryList[4], populationList[4])
        image = R.drawable.haiti
        list += MyData(image, countryList[5], populationList[5])
        image = R.drawable.dominican_republic
        list += MyData(image, countryList[6], populationList[6])
        image = R.drawable.honduras
        list += MyData(image, countryList[7], populationList[7])
        image = R.drawable.nicaragua
        list += MyData(image, countryList[8], populationList[8])
        image = R.drawable.el_salvador
        list += MyData(image, countryList[9], populationList[9])
        image = R.drawable.costa_rica
        list += MyData(image, countryList[10], populationList[10])
        image = R.drawable.costa_rica
        list += MyData(image, countryList[11], populationList[11])
        image = R.drawable.jamaica
        list += MyData(image, countryList[12], populationList[12])
        image = R.drawable.tandt
        list += MyData(image, countryList[13], populationList[13])
        image = R.drawable.belize
        list += MyData(image, countryList[14], populationList[14])
        image = R.drawable.bahamas
        list += MyData(image, countryList[15], populationList[15])
        image = R.drawable.barbados
        list += MyData(image, countryList[16], populationList[16])
        image = R.drawable.saint_lucia
        list += MyData(image, countryList[17], populationList[17])
        image = R.drawable.grenada
        list += MyData(image, countryList[18], populationList[18])
        image = R.drawable.antigua_and_barbuda
        list += MyData(image, countryList[19], populationList[19])
        image = R.drawable.dominica
        list += MyData(image, countryList[20], populationList[20])
        image = R.drawable.saint_kitts_and_nevis
        list += MyData(image, countryList[21], populationList[21])
        return list
    }

    internal fun onOpenMap(){
        supportFragmentManager.beginTransaction()
            .replace(com.google.android.material.R.id.container, MapFragment())
            .commitNow()
    }
}