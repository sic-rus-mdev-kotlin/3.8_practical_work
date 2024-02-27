package ru.samsung.itschool.myapplication.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.samsung.itschool.myapplication.R

class SlideshowFragment : Fragment() {

    private val slideshowViewModel: SlideshowViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_slideshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val textView: TextView = view.findViewById(R.id.text_slideshow)
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
    }
}
