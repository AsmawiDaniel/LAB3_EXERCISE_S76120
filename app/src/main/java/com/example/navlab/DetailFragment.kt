package com.example.navlab

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {
    private val tag = "LC_Detail"

    override fun onAttach(context: Context) { super.onAttach(context); Log.d(tag, "onAttach") }
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); Log.d(tag, "onCreate") }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        Log.d(tag, "onCreateView")
        // Step 5: Read itemId and display it
        val itemId = arguments?.getInt("itemId") ?: 0
        return TextView(requireContext()).apply {
            text = "Detail Fragment\nItem ID: $itemId"
            textSize = 24f
            gravity = Gravity.CENTER
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { super.onViewCreated(view, savedInstanceState); Log.d(tag, "onViewCreated") }
    override fun onStart() { super.onStart(); Log.d(tag, "onStart") }
    override fun onResume() { super.onResume(); Log.d(tag, "onResume") }
    override fun onPause() { super.onPause(); Log.d(tag, "onPause") }
    override fun onStop() { super.onStop(); Log.d(tag, "onStop") }
    override fun onDestroyView() { super.onDestroyView(); Log.d(tag, "onDestroyView") }
    override fun onDestroy() { super.onDestroy(); Log.d(tag, "onDestroy") }
    override fun onDetach() { super.onDetach(); Log.d(tag, "onDetach") }
}