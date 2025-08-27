package org.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * PUBLIC_INTERFACE
 * LibraryFragment
 * Displays placeholder library view for playlists and saved tracks.
 * Parameters: none
 * Returns: Fragment instance
 */
class LibraryFragment : Fragment() {

    companion object {
        // PUBLIC_INTERFACE
        fun newInstance(): LibraryFragment {
            /** Returns a new instance of LibraryFragment. */
            return LibraryFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_library, container, false)
    }
}
