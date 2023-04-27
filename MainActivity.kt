import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt1= findViewById<Button>(R.id.button1)
        val txt= findViewById<EditText>(R.id.numtxt)
        bt1.setOnClickListener(){
            var num:String= numtxt.text.toString()
            val intent = Intent(this,MainActivity2::class.java).apply { putExtra("Data",numtxt.text.toString()) }
            startActivity(intent)

        }

    }
    
}
