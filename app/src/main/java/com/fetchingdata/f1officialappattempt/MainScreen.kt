package com.fetchingdata.f1officialappattempt


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fetchingdata.f1officialappattempt.fragment.DashboardFragment
import com.fetchingdata.f1officialappattempt.fragment.SettingsFragment
import com.fetchingdata.f1officialappattempt.fragment.StandingsFragment
import com.google.android.material.internal.NavigationMenu
import androidx.appcompat.view.menu.MenuView
import kotlinx.android.synthetic.main.activity_main_screen.*
import kotlinx.android.synthetic.main.fragment_standings.*


// https://www.youtube.com/watch?v=v8MbOjBCu0o - Bottom menu


// *THIS IS THE MAIN ACTIVITY*

class MainScreen : AppCompatActivity() {

    private val dashboardFragment = DashboardFragment()
    private val settingsFragment = SettingsFragment()
    private val standingsFragment = StandingsFragment()

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)


        // FRAGMENT STUFF
//        val BtnOpenFragment : Button = findViewById(R.id.constructorsTxt)
//        BtnOpenFragment.setOnClickListener {
//            val homeFragment = StandingsFragment
//            val fragment : Fragment? =
//                supportFragmentManager.findFragmentById(homeFragment::class.java.simpleName)
//
//            if (fragment !is homeFragment) {
//                supportFragmentManager.beginTransaction()
//                    .add(R.id.constructorsTxt, homeFragment, homeFragment::class.java.simpleName)
//                    .commit()
//            }
//            BtnOpenFragment.visibility= View.GONE
//        }

//        val BtnOpenFragment : Button = findViewById(R.id.constructorsTxt)
//        BtnOpenFragment.setOnClickListener {
//           // https://stackoverflow.com/questions/53355786/kotlin-open-new-activity-inside-of-a-fragment
//           val intent = Intent(MainScreen(), constructorspage::class.java)
//           MainScreen().startActivity(intent)
//        }



        // HIDES ACTION BAR
//        if (supportActionBar != null) {
//            supportActionBar!!.hide()
//        }

        replaceFragment(dashboardFragment)

        //val bottom_navigation = findViewById<View>(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.ic_dashboard -> replaceFragment(dashboardFragment)
                R.id.ic_settings -> replaceFragment(settingsFragment)
                R.id.ic_standings -> replaceFragment(standingsFragment)
            }
            true
        }


    }



    // MAKING THE FUNCTION FOR FRAGMENT
    // https://www.youtube.com/watch?v=v8MbOjBCu0o

    private fun replaceFragment(fragment: Fragment) {
        if(fragment !=null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }

//    internal fun Intent() {
//         constructorsTxtBtn.setOnClickListener {
//             val intent = Intent(it, constructorspage::class)
//         }
//    }

}