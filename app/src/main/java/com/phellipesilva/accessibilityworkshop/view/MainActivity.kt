package com.phellipesilva.accessibilityworkshop.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import com.google.android.material.snackbar.Snackbar
import com.phellipesilva.accessibilityworkshop.R
import com.phellipesilva.accessibilityworkshop.data.Music
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val musics = listOf(
            Music("Fade to Black", "Metallica", "10 U\$S", "Ride the Lighting", 102_060, "https://img.cdandlp.com/2017/09/imgL/118933420.jpg"),
            Music("Aces High", "Iron Maiden", "12 U\$S", "Powerslave", 80_123, "https://upload.wikimedia.org/wikipedia/en/1/1c/Iron_Maiden_-_Powerslave.jpg"),
            Music("Even Flow", "Perl Jam", "9 U\$S", "Ten", 133_000, "https://upload.wikimedia.org/wikipedia/pt/thumb/0/04/Ten_Pearl_Jam.jpg/220px-Ten_Pearl_Jam.jpg"),
            Music("Love Me Again", "John Newman", "8 U\$S", "John Newman Tribute", 99_987, "https://images-na.ssl-images-amazon.com/images/I/816Xs9WrdwL._SY355_.jpg")
        )
        musicViewPager.adapter = MusicAdapter(musics, supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
    }

    fun showTransactionSuccessfulMessage() {
        Snackbar.make(coordinatorLayout, "Compra realizada com sucesso", Snackbar.LENGTH_LONG).show()
    }
}
