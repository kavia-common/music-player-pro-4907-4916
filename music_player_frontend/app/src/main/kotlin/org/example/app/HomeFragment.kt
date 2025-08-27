package org.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * PUBLIC_INTERFACE
 * HomeFragment
 * Displays a placeholder home screen with favorites and recently played sections.
 * Parameters: none
 * Returns: Fragment instance
 */
class HomeFragment : Fragment() {

    companion object {
        // PUBLIC_INTERFACE
        fun newInstance(): HomeFragment {
            /** Returns a new instance of HomeFragment. */
            return HomeFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}
