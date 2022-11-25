package com.gl4.tp00

import kotlin.math.abs

data class Point(val x : Int, val y : Int) {
    fun distance(p : Point, q : Point ): Int {
    return (abs(p.x-q.x)+abs(p.y-q.y))
    }
}