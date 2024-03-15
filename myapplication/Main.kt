package com.example.myapplication

fun main() {
    val menu = Menu()
    val menu1 = Menu1()
    val menu2 = Menu2()
    val menu3 = Menu3()
    val menu4 = Menu4()

    while(true) {

        println("==============================")

        println(menu.getMenu())
        val choice = readLine()!!.toInt()

        if(choice == 0) {
            println("주문을 종료합니다.")
            break
        }

        when(choice) {
            1 -> {
                println(menu1.getMenu1())
            }
            2 -> {
                println(menu2.getMenu2())
            }
            3 -> {
                println(menu3.getMenu3())
            }
            4 -> {
                println(menu4.getMenu4())
            }
        }

        println("==============================")
    }
}