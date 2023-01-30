package com.fetchingdata.f1officialappattempt.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fetchingdata.f1officialappattempt.R
import com.fetchingdata.f1officialappattempt.StandingsRecyclerviewAdapter
import com.fetchingdata.f1officialappattempt.constructorspage
import kotlinx.android.synthetic.main.fragment_standings.*
import kotlin.reflect.KClass

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [StandingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StandingsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null




    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<StandingsRecyclerviewAdapter.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)



        }

//        val BtnOpenFragment : Button = findViewById(R.id.constructorsTxt)
//        BtnOpenFragment.setOnClickListener {
//            // https://stackoverflow.com/questions/53355786/kotlin-open-new-activity-inside-of-a-fragment
//            val intent = Intent(MainScreen(), constructorspage::class.java)
//            MainScreen().startActivity(intent)
//        }





    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_standings, container, false)

        // https://www.youtube.com/watch?v=fp-b9o4HgTg



        /*
        val bind = FragmentHomeBinding.inflate(layoutInflater)

        bind.btbnOpenSecondActivity.setOnClickListener{
            val intent = Intent(this@StandingsFragment.requireContext(), constructorspage::class.java)
            startActivity(intent)
        }

        return bind.root
        */

    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


        StandingsRecyclerview.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = StandingsRecyclerviewAdapter()


        }


//        constructorsTxtBtn.setOnClickListener {
//            activity?.let {
//                val intent = Intent(requireContext(), constructorspage::class)
//                startActivity(intent)
//            }
//        }



    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StandingsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StandingsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


}


//
// https://www.youtube.com/watch?v=-DCZLKxmdIk
// https://stackoverflow.com/questions/64391291/kotlin-how-to-open-activity-from-fragment-with-button-in-android