package com.developersbreach.viewpagertabfragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.developersbreach.viewpagertabfragment.fragments.CategoriesFragment
import com.developersbreach.viewpagertabfragment.fragments.NeedsFragment
import com.developersbreach.viewpagertabfragment.fragments.PetsFragment
import com.developersbreach.viewpagertabfragment.fragments.WishlistFragment

class ParentFragmentPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PetsFragment()
            1 -> NeedsFragment()
            2 -> WishlistFragment()
            else -> CategoriesFragment()
        }
    }

    override fun getItemCount(): Int {
        return 4
    }
}

