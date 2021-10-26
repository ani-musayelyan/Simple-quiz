package com.example.myquiz

import android.content.Context
import android.content.res.Resources
import android.provider.Settings.Global.getString
import com.example.myquiz.R.string.correct

object Constants {

    const val User_Name : String = "user name"
    const val Total_Questions =" total questions"
    const val Correct_Answers = "correct answers"


    fun getQuestion() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val qu1 = Question(1, "Свет – это вид энергии" ,
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 1
        )
        questionsList.add(qu1)

        val qu2 = Question(1, "Процесс перехода жидкости в газ называется испарение",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 1
        )
        questionsList.add(qu2)

        val qu3 = Question(1, "Масса вещества на единицу объема - это вязкость",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 2
        )
        questionsList.add(qu3)

        val qu4= Question(1, "Движущийся объект обладает кинетической энергией",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 1
        )
        questionsList.add(qu4)

        val qu5 = Question(1, "Манометр измеряет частоту электрических колебаний",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 2
        )
        questionsList.add(qu5)

        val qu6 = Question(1, "Чем больше разница температур тел , тем быстрее передается тепло",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 1
        )
        questionsList.add(qu6)

        val qu7 = Question(1, "При нагревании объем и плотность тела увеличивается",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 2
        )
        questionsList.add(qu7)

        val qu8 = Question(1, "Спидометр автомобиля показывает мгновенную скорость движения.",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 1
        )
        questionsList.add(qu8)

        val qu9 = Question(1, "Сила тяготения между однородным шаром и материальной точкой , соприкасающейся с шаром, уменьшится в 2,5 раза , если материальную точку удалить от поверхности шара на расстояние, равное двум диаметрам шара.",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 2
        )
        questionsList.add(qu9)

        val qu10 = Question(1, "Усиление света в результате вынужденного излучения - это лазер",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 1
        )
        questionsList.add(qu10)

        val qu11 = Question(1, "Сумма импульсов тел до взаимодействия равна сумме их импульсов после взаимодействия.",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 1
        )
        questionsList.add(qu11)

        val qu12 = Question(1, "Сила мысли приводит к возникновению силы Ампера",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 2
        )
        questionsList.add(qu12)

        val qu13 = Question(1, "Сила Лоренца направлена в направлении движения заряда",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 2
        )
        questionsList.add(qu13)

        val qu14 = Question(1,"Электрический ток, в котором носители заряда движутся в одном направлении, называется направленным",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 2
        )
        questionsList.add(qu14)

        val qu15 = Question(1, "Если два колебания равной частоты происходят синфазно, то разность их фаз равна 0",
            optionTrue = "Правда",
            optionFalse = "Ложь" ,
            correct = 1
        )
        questionsList.add(qu15)



         return questionsList
    }
}