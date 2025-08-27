package org.example.app

import android.app.Activity
import android.media.AudioManager
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import org.example.list.LinkedList
import org.example.utilities.SplitUtils
import org.example.utilities.StringUtils
import org.apache.commons.text.WordUtils

class MainActivity : Activity() {

    private var isPlaying = false
    private var durationSec = 354 // 5:54 as per reference
    private var elapsedSec = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use the new Now Playing layout
        setContentView(R.layout.activity_now_playing)

        // Top bar
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val btnLike = findViewById<ImageButton>(R.id.btnLike)

        // Album art and info
        val imgAlbum = findViewById<ImageView>(R.id.imgAlbum)
        val tvTitle = findViewById<TextView>(R.id.tvTrackTitle)
        val tvArtist = findViewById<TextView>(R.id.tvArtist)

        // Populate using previous demo logic just to keep code paths warm
        tvTitle.text = "Clint Eastwood"
        tvArtist.text = buildMessage() // "Hello World!" capitalized — stand-in for dynamic artist; keeps util usage

        // Time/seek
        val tvElapsed = findViewById<TextView>(R.id.tvElapsed)
        val tvDuration = findViewById<TextView>(R.id.tvDuration)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        tvElapsed.text = formatTime(elapsedSec)
        tvDuration.text = formatTime(durationSec)
        seekBar.max = durationSec
        seekBar.progress = elapsedSec
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    elapsedSec = progress
                    tvElapsed.text = formatTime(elapsedSec)
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // Volume
        val volSeek = findViewById<SeekBar>(R.id.seekVolume)
        val audioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        val maxVol = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        val curVol = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
        volSeek.max = maxVol
        volSeek.progress = curVol
        volSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0)
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // Controls
        val btnPrev = findViewById<ImageButton>(R.id.btnPrev)
        val btnPlayPause = findViewById<ImageButton>(R.id.btnPlayPause)
        val btnNext = findViewById<ImageButton>(R.id.btnNext)

        btnPrev.setOnClickListener {
            // PUBLIC_INTERFACE
            // Stub: Previous track
            /** Jumps to previous track (placeholder). */
            elapsedSec = 0
            seekBar.progress = elapsedSec
            tvElapsed.text = formatTime(elapsedSec)
        }

        btnPlayPause.setOnClickListener {
            // PUBLIC_INTERFACE
            // Toggle play/pause UI state
            /** Toggles play/pause state and updates icon accordingly. */
            isPlaying = !isPlaying
            btnPlayPause.setImageResource(if (isPlaying) R.drawable.ic_pause else R.drawable.ic_play)
        }

        btnNext.setOnClickListener {
            // PUBLIC_INTERFACE
            // Stub: Next track
            /** Skips to next track (placeholder). */
            elapsedSec = 0
            seekBar.progress = elapsedSec
            tvElapsed.text = formatTime(elapsedSec)
        }

        btnBack.setOnClickListener { finish() }
        btnLike.setOnClickListener {
            // could animate/favorite; using accent tint as visual
            it.isSelected = !it.isSelected
            it.alpha = if (it.isSelected) 1.0f else 0.6f
        }
    }

    // PUBLIC_INTERFACE
    private fun buildMessage(): String {
        /** Builds a demo string using existing utilities; stands in for dynamic artist name. */
        val tokens: LinkedList = SplitUtils.split(MessageUtils.message())
        val result: String = StringUtils.join(tokens)
        return WordUtils.capitalize(result)
    }

    // PUBLIC_INTERFACE
    private fun formatTime(totalSeconds: Int): String {
        /** Formats seconds as M:SS text for time labels. */
        val m = totalSeconds / 60
        val s = totalSeconds % 60
        return "$m:${s.toString().padStart(2, '0')}"
    }
}
