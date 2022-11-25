package com.gl4.tp00

fun main(){
    val point0 = Point(2,2)
    val rectangle1 = Rectangle()
    val rectangle2 = Rectangle(p=point0)
    val rectangle3 = Rectangle(q=point0)
    val rectangle4 = Rectangle(point0,point0)
    val rectangles = arrayOf(rectangle1,rectangle2,rectangle3,rectangle4)
    for(i in 1.. (rectangles.size )){
        print("/ Surface du Rectangle $i :" + rectangles[i-1].surface())
    }
}


