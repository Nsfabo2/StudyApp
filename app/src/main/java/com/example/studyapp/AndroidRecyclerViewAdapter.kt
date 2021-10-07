package com.example.studyapp

import android.app.AlertDialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AndroidRecyclerViewAdapter: RecyclerView.Adapter<AndroidRecyclerViewAdapter.ViewHolder>() {
    private val titles = listOf<String>(
        "Project Setup",
        "Resource Files",
        "OnClickListener"
    )
    private val describes = listOf<String>(
        "Setting up an Android Studio Project.",
        "All the files you will need in a project.",
        "To activity a button."
    )
    private val notes = listOf<String>(
        """1- Download Android Studio.
2- Click on "Create New Project".
3- Choose "Empty Activity"  
       """.trimMargin(),
        "They are xml files and they catogrized by: drawable, layout,mipmap and values.",
        """ myButton.setOnClickListener { myFuction() }
            # we need the button myButton to call the pre-dfined function setOnClickListener
            # we can do whatever we want in {} call another function or do something
        """.trimMargin()
    )
    //Dialog for details
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var ItemTitle: TextView = itemView.findViewById(R.id.AMetrialsTitle)
        var ItemDescribe: TextView = itemView.findViewById(R.id.AMetrialsDescrbtion)

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
                R.layout.item_android,
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