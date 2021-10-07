package com.example.quizapp.Data


object SetData {

    const val name:String="name"
    const val score:String="score"

    //Setting return type to List of question data
    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "For which of the following Android is mainly developed?",

            "Servers",
            "Laptops",
            "Desktops",
            "Mobile Devices",
            4
        )
        var question2 = QuestionData(
            2,
            "Which of the following virtual machine is used by the Android operating system?",

            "Dalvik virtual machine",
            "JVM",
            "Simple virtual machine",
            "None of the above",
            1
        )
        var question3 = QuestionData(
            3,
            "Which of the following kernel is used in Android?",

            "MAC",
            "Linux",
            "Windows",
            "None of the above",
            2
        )
        var question4 = QuestionData(
            4,
            "Which of the following is contained in the src folder?",

            "Java source code",
            "XML",
            "Manifest",
            "Drawable",
            3
        )

        var question5 = QuestionData(
            5,
            "Which of the following is the built-in database of Android?",

            "MySQL",
            "Oracle",
            "SQLite",
            "None of the above",
            3
        )

        //Adding questions to QuestionData class
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}