package com.example.homework05

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdapter (val myList: List<MyData>): RecyclerView.Adapter<myAdapter.myViewHolder>() {
        class myViewHolder(myView: View) : RecyclerView.ViewHolder(myView) {
            val my_image : ImageView = myView.findViewById(R.id.imageView)
            val my_text1: TextView = myView.findViewById(R.id.textView4)
            val my_text2: TextView = myView.findViewById(R.id.textView5)

            init {
                myView.setOnClickListener { v : View ->
                    val position: Int = adapterPosition

                    val intent = Intent(myView.context, Second_Activity::class.java)
                    intent.putExtra("pos", position)
                    myView.context.startActivity(intent)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
            val myView = LayoutInflater.from(parent.context).inflate(
                R.layout.item_card,
                parent,false
            )
            return myViewHolder(myView)
        }

        override fun onBindViewHolder(holder: myViewHolder, position: Int) {
            holder.my_image.setImageResource(myList[position].imageNumber)
            holder.my_text1.text = myList[position].text1
            holder.my_text2.text = myList[position].text2
        }

        override fun getItemCount(): Int {
            return myList.size
        }


    }
