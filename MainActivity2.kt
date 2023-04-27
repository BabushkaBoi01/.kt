class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bt2=findViewById<Button>(R.id.button2)
        val result=findViewById<TextView>(R.id.txtresult)


        val intentValue = intent.getStringExtra("Data")
        val num2 = Integer.parseInt(intentValue)
        var factorial :Int = 1
        for(num in 1..num2) {
            factorial *= num
        }
        result.text="Factorial of $num2 is $factorial"

        bt2.setOnClickListener(){
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}
