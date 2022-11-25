package com.gl4.tp00

open class Rectangle(private val p : Point = Point(0,0),private val q : Point = Point(1,1))  {
    override fun toString(): String {
        return "p=$p q=$q"}
    fun surface(): Int {
        return 2*p.distance(p,q)
    }
    }