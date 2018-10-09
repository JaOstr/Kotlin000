package pl.trrrt.kotlin000

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val toast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countMe(view: View) {
        val cnt = Integer.parseInt(textView.text.toString()) + 1
        textView.text = cnt.toString()
    }
}
