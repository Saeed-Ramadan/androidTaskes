//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.CheckBox
//import android.widget.EditText
//import android.widget.TextView
//import com.example.myapplication.databinding.ActivityMainBinding
//import com.example.myapplication.R
//
//import kotlinx.parcelize.Parcelize
//
//@Parcelize
//data class YourParcelableClass(val name: String, val age: Int) : Parcelable
//
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        // Now you can access your UI elements using their IDs
//        val emailEditText = findViewById<EditText>(R.id.emailEditText)
//        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
//        val rememberMeCheckbox = findViewById<CheckBox>(R.id.rememberMeCheckbox)
//        val loginButton = findViewById<Button>(R.id.loginButton)
//
//        // Handle button click or any other interactions as needed
//        loginButton.setOnClickListener {
//            // Add your login logic here
//        }
//    }
//}
