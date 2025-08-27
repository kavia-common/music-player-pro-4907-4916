package org.example.app

import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationBarView

/**
 * PUBLIC_INTERFACE
 * MainActivity
 * This is the main entrypoint activity. It hosts bottom tab navigation with four screens:
 * Home, Search, Library, and Now Playing. Each tab shows a placeholder fragment screen.
 * Parameters: none
 * Returns: none
 */
class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var navView: BottomNavigationView
    private lateinit var container: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navView = findViewById(R.id.bottom_nav)
        container = findViewById(R.id.fragment_container)

        navView.setOnItemSelectedListener(this)

        // Default selection
        if (savedInstanceState == null) {
            navView.selectedItemId = R.id.menu_home
            navigateTo(R.id.menu_home)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        navigateTo(item.itemId)
        return true
    }

    private fun navigateTo(@IdRes itemId: Int) {
        val fragment = when (itemId) {
            R.id.menu_home -> HomeFragment.newInstance()
            R.id.menu_search -> SearchFragment.newInstance()
            R.id.menu_library -> LibraryFragment.newInstance()
            R.id.menu_now_playing -> NowPlayingFragment.newInstance()
            else -> HomeFragment.newInstance()
        }
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment, fragment::class.java.simpleName)
            .commit()
    }
}
