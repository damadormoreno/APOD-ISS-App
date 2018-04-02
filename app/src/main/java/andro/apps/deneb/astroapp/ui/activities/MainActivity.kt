package andro.apps.deneb.astroapp.ui.activities

import andro.apps.deneb.astroapp.R
import andro.apps.deneb.astroapp.ui.fragments.HomeFragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottombar = find<BottomNavigationBar>(R.id.bottomBar)
                bottombar
                        .setMode(BottomNavigationBar.MODE_FIXED)
                        .setActiveColor(R.color.black)
                        .addItem(BottomNavigationItem(R.drawable.ic_action_home,"Home"))
                        .addItem(BottomNavigationItem(R.drawable.ic_public_black_24dp,"APOD"))
                        .addItem(BottomNavigationItem(R.drawable.ic_brightness_2_black_24dp, "AstroBin"))
                        .addItem(BottomNavigationItem(R.drawable.ic_favorite_black_24dp, "Favoritos"))
                        .addItem(BottomNavigationItem(R.drawable.ic_person_black_24dp, "Profile"))
                        .initialise()


        bottombar.setTabSelectedListener(object : BottomNavigationBar.OnTabSelectedListener {
            override fun onTabSelected(position: Int) {
                toast("$position")
                when(position){
                    0 -> {
                        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment()).commit()
                    }
                    1 -> {

                    }
                    2 -> {

                    }
                    3 -> {

                    }
                    else -> {}
                }
            }
            override fun onTabUnselected(position: Int) {

            }
            override fun onTabReselected(position: Int) {
                //Vuelve a tocar en el mismo tab
                toast("reselected $position")
            }
        })
    }
}
