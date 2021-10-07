package com.example.studyapp

import android.app.AlertDialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class KotlinRecyclerViewAdapter: RecyclerView.Adapter<KotlinRecyclerViewAdapter.ViewHolder>() {

    private val titles = listOf<String>(
        "var and val",
        "Data Types",
        "Random Module"
    )
    private val describes = listOf<String>(
        "Declaring variables.",
        "There are many types of data in kotlin.",
        "Random library to generate random numbers.",

    )
    private val notes = listOf<String>(
        """Val: immutable, meaning they can not be reassigned later. Var: mutable and can be changed anytime.
            """.trimMargin(),
        """
            - Int aka numbers 2
            - String s.t hello world , 2021
            - Boolean true / false
            - Char like: A
            - Float aka double 2.0
            """.trimMargin(),
        """Once a library is imported, we can use it as many times as we want:
            # import kotlin.random.Random
            # Create a random number between 0 and 10 : val randomNumber = Random.nextInt(11)
            # Here we would get a number between 7 and 14: val randomNumber = Random.nextInt(7, 15)  
           
            """.trimMargin()
    )
//Dialog for details
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var ItemTitle: TextView = itemView.findViewById(R.id.KMetrialsTitle)
        var ItemDescribe: TextView = itemView.findViewById(R.id.KMetrialsDescribe)
        init {
            itemView.setOnClickListener{
                val builder = AlertDialog.Builder(itemView.context)
                builder.setTitle(titles[adapterPosition])
                builder.setMessage(notes[adapterPosition])
                builder.setPositiveButton("Ok", DialogInterface.OnClickListener { _, _ ->
                })
                builder.show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_kotlin,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ItemTitle.text = titles[position]
        holder.ItemDescribe.text = describes[position]

    }

    override fun getItemCount(): Int = titles.size
}//end class