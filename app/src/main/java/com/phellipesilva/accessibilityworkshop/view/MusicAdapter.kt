package com.phellipesilva.accessibilityworkshop.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.phellipesilva.accessibilityworkshop.data.Music

class MusicAdapter(
    private val musics: List<Music>,
    fm: FragmentManager,
    behavior: Int
) : FragmentPagerAdapter(fm, behavior) {

    override fun getItem(position: Int): Fragment {
        val bundle = Bundle()
        bundle.putSerializable("music", musics[position])

        val fragment =  MusicFragment()
        fragment.arguments = bundle

        return fragment
    }

    override fun getCount() = musics.size
}