package com.example.homework05

import android.os.Bundle
import android.view.Gravity.apply
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat.apply
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var recyclerView: RecyclerView? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<myAdapter.myViewHolder>? = null

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        recyclerView.apply {
            var list = generateData()
            layoutManager = LinearLayoutManager(activity)
            adapter = myAdapter(list)
        }
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




    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}