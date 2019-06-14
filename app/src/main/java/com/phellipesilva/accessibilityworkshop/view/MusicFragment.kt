package com.phellipesilva.accessibilityworkshop.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.phellipesilva.accessibilityworkshop.R
import com.phellipesilva.accessibilityworkshop.data.Music
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_music.view.*

class MusicFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val music = arguments?.getSerializable("music") as Music

        val musicFragmentView = inflater.inflate(R.layout.fragment_music, container, false)
        musicFragmentView.musicAlbumTextView.text = music.album
        musicFragmentView.musicArtistTextView.text = music.artist
        musicFragmentView.musicPriceTextView.text = music.price
        musicFragmentView.musicTitleTextView.text = music.title
        musicFragmentView.musicDownloadsTextView.text = "${music.downloadNumber} Downloads"

        Picasso.get()
            .load(music.albumPhotoUrl)
            .resize(128, 128)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(musicFragmentView.albumImageView)

        musicFragmentView.musicCardView.setOnClickListener {
            (activity as MainActivity).showTransactionSuccessfulMessage()
        }

        return musicFragmentView
    }
}
