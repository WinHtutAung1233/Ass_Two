package com.example.hwfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hwfc.adapter.CrushAdapter
import com.example.hwfc.model.Crush

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.crush_recycler)
        var crushArray = ArrayList<Crush>()
        crushArray.add(Crush(R.drawable.neo,R.drawable.a))
        crushArray.add(Crush(R.drawable.waiter,R.drawable.b))

        val crushAdapter = CrushAdapter(crushArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = crushAdapter
    }
}
