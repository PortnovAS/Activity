package otus.gpb.homework.activities.receiver

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources

class ReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)

        val title = findViewById<TextView>(R.id.titleTextView)
        val year = findViewById<TextView>(R.id.yearTextView)
        val description = findViewById<TextView>(R.id.descriptionTextView)
        val poster = findViewById<ImageView>(R.id.posterImageView)

        title.text = intent.extras?.getString("title")
        description.text = intent.extras?.getString("description")
        year.text = intent.extras?.getString("year")

        val draw = when (title.text) {
            "Интерстеллар" -> AppCompatResources.getDrawable(applicationContext, R.drawable.interstellar)
            "Славные парни" -> AppCompatResources.getDrawable(applicationContext, R.drawable.niceguys)
            else -> null
        }
        poster.setImageDrawable(draw)
        }
}
