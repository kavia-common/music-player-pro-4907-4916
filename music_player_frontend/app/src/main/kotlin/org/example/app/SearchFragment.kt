package org.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * PUBLIC_INTERFACE
 * SearchFragment
 * Displays a placeholder search UI to browse/search music.
 * Parameters: none
 * Returns: Fragment instance
 */
class SearchFragment : Fragment() {

    companion object {
        // PUBLIC_INTERFACE
        fun newInstance(): SearchFragment {
            /** Returns a new instance of SearchFragment. */
            return SearchFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }
}
