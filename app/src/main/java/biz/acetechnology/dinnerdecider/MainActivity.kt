package biz.acetechnology.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var foodList = arrayListOf("Rice & Stew with Beef","Rice & Stew with Goat Meat", "Rice & Stew with Turkey")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener() {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener() {

            val newfood = addFoodTxt.text.toString()
            foodList.add(newfood)
            addFoodTxt.text.clear()
        }
    }
}
