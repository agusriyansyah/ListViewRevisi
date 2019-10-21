package com.example.listviewicon.Model

import com.example.listviewicon.R

object DataIcon {
    private val namaIcon = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "JavaScript",
        "PHP"
    )

    private val deskripsi = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language.",
        "Ruby on Rails is a server-side web application development framework written in Ruby language.",
        "Python is interpreted scripting and object-oriented programming language.",
        "JavaScript is an object-based scripting language.",
        "PHP is an interpreted language, i.e., there is no need for compilation"
    )

    private val IconPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.php
    )

    val listModelList: ArrayList<ModelList>
    get() {
        val list = arrayListOf<ModelList>()
        for (position in namaIcon.indices){
            val presiden = ModelList()
            presiden.name = namaIcon[position]
            presiden.data = deskripsi[position]
            presiden.poster = IconPoster[position]
            list.add(presiden)
        }
        return list
    }
}