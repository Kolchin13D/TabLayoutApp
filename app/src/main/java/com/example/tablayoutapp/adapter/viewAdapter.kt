package com.example.tablayoutapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutapp.fragments.Fragment1
import com.example.tablayoutapp.fragments.Fragment2
import com.example.tablayoutapp.fragments.Fragment3

class viewAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val size = 3
    override fun getItemCount(): Int {
        return this.size
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Fragment1()
            1 -> return Fragment2()
            2 -> return Fragment3()
        }

        return Fragment1()
    }


}