package org.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * PUBLIC_INTERFACE
 * NowPlayingFragment
 * Displays placeholder now-playing screen with playback controls: play/pause/next/prev and a seek bar.
 * Parameters: none
 * Returns: Fragment instance
 */
class NowPlayingFragment : Fragment() {

    companion object {
        // PUBLIC_INTERFACE
        fun newInstance(): NowPlayingFragment {
            /** Returns a new instance of NowPlayingFragment. */
            return NowPlayingFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_now_playing, container, false)
    }
}
