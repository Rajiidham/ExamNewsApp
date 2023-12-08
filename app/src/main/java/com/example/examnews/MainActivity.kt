package com.example.examnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.examnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavView.setupWithNavController(navController)

        binding.bottomNavView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Suara -> {
                    // Navigasi ke tujuan Home
                    navController.navigate(R.id.suaraFragment)
                    true
                }

                R.id.Tempo -> {
                    // Navigasi ke tujuan Home
                    navController.navigate(R.id.tempoFragment)
                    true
                }

                R.id.Sindonews-> {
                    // Navigasi ke tujuan Home
                    navController.navigate(R.id.sindonewsFragment)
                    true
                }

                // Tambahkan tindakan lain sesuai kebutuhan
                else -> false
            }
        }
    }


//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main_menu, menu)
////
////        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
////        (menu?.findItem(R.id.menu_search)?.actionView as SearchView).apply {
////            setSearchableInfo(searchManager.getSearchableInfo(componentName))
////
////            return true
////        }
//    }
}