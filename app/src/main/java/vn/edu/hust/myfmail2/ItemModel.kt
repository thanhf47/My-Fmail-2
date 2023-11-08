package vn.edu.hust.myfmail2

import android.graphics.Color
import kotlin.random.Random

data class ItemModel (
    val sender: String,
    val Message:String,
    val Time: String
){
    var color: Int = generateRandomColor()
    var selected: Boolean = false
    private fun generateRandomColor(): Int {
        val random: Random
        val red:Int = Random.nextInt(256)
        val green:Int = Random.nextInt(256)
        val blue:Int = Random.nextInt(256)
        return Color.rgb(red, green, blue)
    }
}