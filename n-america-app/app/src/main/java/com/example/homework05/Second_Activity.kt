package com.example.homework05

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val extras = intent.extras
        val position:Int = extras!!.getInt("pos")
        val actionBar = supportActionBar
        actionBar!!.title = "Description"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val list:List<MyData> = generateData()
        val descriptionList: List<String> = resources.getStringArray(R.array.descriptionList).toList()
        var image:ImageView = findViewById(R.id.imageView)
        var text1:TextView = findViewById(R.id.textView4)
        var text2: TextView = findViewById(R.id.textView5)
        image.setImageResource(list[position].imageNumber)
        text1.text = list[position].text1
        text2.text = list[position].text2

        var description:TextView = findViewById(R.id.textView)
        description.text = descriptionList[position]
    }
    //I realize that is in bad pratice to completely rewrite an entire method
    //but i tried to create an instance of the main activity and then create a variable
    //that contained the list by accessing that instance's generateData() method, but
    //my app crashed every time, so i changed it to this
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
}