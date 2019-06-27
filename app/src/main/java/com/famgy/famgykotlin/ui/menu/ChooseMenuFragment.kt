package com.famgy.famgykotlin.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.famgy.famgykotlin.R
import kotlinx.android.synthetic.main.fragment_choose_menu.*

class ChooseMenuFragment : Fragment() {

    private val menuList = ArrayList<String>()
    private lateinit var rvAdapter: RecyclerView.Adapter<*>
    private lateinit var rvLayoutManager: RecyclerView.LayoutManager

    enum class LayoutManagerType {
        LINEAR_LAYOUT_MANAGER,
        GRID_LAYOUT_MANAGER
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_choose_menu, container, false)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        menuList.add("Coroutine")
        menuList.add("DataBinding")
        menuList.add("RecyclerView")
        menuList.add("ModleView")

        rvLayoutManager = LinearLayoutManager(context)

        rvAdapter = ChooseMenuAdapter(menuList)
        rv_menu.apply {
            setHasFixedSize(true)
            layoutManager = rvLayoutManager
            adapter = rvAdapter
        }

        linear_layout_rb.setOnClickListener{
            setRecyclerViewLayoutManager(LayoutManagerType.LINEAR_LAYOUT_MANAGER)
        }

        grid_layout_rb.setOnClickListener{
            setRecyclerViewLayoutManager(LayoutManagerType.GRID_LAYOUT_MANAGER)
        }
    }

    private fun setRecyclerViewLayoutManager(layoutManagerType: LayoutManagerType) {
        when (layoutManagerType) {
            LayoutManagerType.LINEAR_LAYOUT_MANAGER -> {
                rvLayoutManager
            }

            LayoutManagerType.GRID_LAYOUT_MANAGER -> {

            }
        }
    }
}