package uz.itschool.project

import android.graphics.Color

enum class CategoryFood (var n:String, var photo: Int, var color: Int){
    FREE("Fries", R.drawable.free, Color.parseColor("#FFEF92")),
    BURGER("Burgers", R.drawable.burger, Color.parseColor("#F5CAC3")),
    DRINK("Drinks", R.drawable.drinks, Color.parseColor("#B6D7CF")),
    DESERT("Deserts", R.drawable.desert, Color.parseColor("#F28482")),
    COFFEE("Coffee", R.drawable.coffe, Color.parseColor("#84A59D"))
}