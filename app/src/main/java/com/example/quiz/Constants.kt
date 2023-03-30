package com.example.quiz

object Constants {
    fun getQuestion():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.usa_flag,
            "Mexico","Germany","USA","Canada",3
        )
        val ques2 = Question(
            2,"What Country does this flag belong to?",
            R.drawable.brasil,
            "Mexico","Brazil","USA","Uk",2
        )
        questionList.add(ques2)
        val ques3 = Question(
            3,"What Country does this flag belong to?",
            R.drawable.french_flag,
            "France","India","Netherland","Spain",1
        )
        questionList.add(ques3)
        val ques4 = Question(
            4,"What Country does this flag belong to?",
            R.drawable.nepal,
            "China","Bhutan ","Sri Lanka","Nepal",4
        )
        questionList.add(ques4)
        val ques5 = Question(
            5,"What Country does this flag belong to?",
            R.drawable.norway,
            "Sweden","Finland","Norway","Scotland",3
        )
        questionList.add(ques5)
        val ques6 = Question(
            6,"What Country does this flag belong to?",
            R.drawable.poland_flag,
            "Austria","Hungary","Indonesia","Poland",4
        )
        questionList.add(ques6)
        val ques7 = Question(
            7,"What Country does this flag belong to?",
            R.drawable.puerto_rico_flag,
            "Cuba","Jamaica","USA","Puerto Rico",4
        )
        questionList.add(ques7)
        val ques8 = Question(
            8,"What Country does this flag belong to?",
            R.drawable.thailand,
            "Thailand","Myanmar","Cambodia","Russia",1
        )
        questionList.add(ques8)
        val ques9 = Question(
            9,"What Country does this flag belong to?",
            R.drawable.turkey,
            "Saudi Arabia","Egypt","Turkiye","Pakistan",3
        )
        questionList.add(ques9)
        val ques10 = Question(
            10,"What Country does this flag belong to?",
            R.drawable.argentina_flag,
            "Argentina","Spain","France","China",1
        )
        questionList.add(ques10)
        return questionList
    }
}