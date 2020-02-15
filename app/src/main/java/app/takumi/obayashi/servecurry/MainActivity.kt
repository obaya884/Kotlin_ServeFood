package app.takumi.obayashi.servecurry

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("炭治郎", "禰豆子", "善逸", "伊之助")
    val food = arrayOf<String>("山かけうどん", "三色団子", "まんじゅう", "カステラ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View) {
//        val randomName = Random()
        val index = Random.nextInt(4)
        val name  = people[index]
        nameText.text = name + "に"

        foodText.text = food[Random.nextInt(4)] + "を"

        if (Random.nextInt(100) < 50) {
            verbText.text = "よそえました！"
            verbText.setTextColor(Color.RED)
            verbText.setTextSize(32F)
        }
        else {
            verbText.text = "よそえませんでした。。。"
            verbText.setTextColor(Color.BLUE)
            verbText.setTextSize(24F)
        }
    }
}
