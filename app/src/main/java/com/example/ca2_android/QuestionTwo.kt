package com.example.ca2_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.button.MaterialButton

class QuestionTwo : AppCompatActivity() {
    private lateinit var radioButton: RadioButton
     var outcome:String = ""
    var items: MutableList<String> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two)
        val radioGroup : RadioGroup = findViewById(R.id.radioGroup)
        val placeBtn : MaterialButton =findViewById(R.id.place)
        val checkbox : CheckBox = findViewById(R.id.checkBox)
        val editText : EditText = findViewById(R.id.menu)
        radioGroup.clearCheck()


        placeBtn.setOnClickListener {

            if(!checkbox.isChecked){
                Toast.makeText(this, "Please select free items", Toast.LENGTH_LONG).show()
            }
            else {
                if(editText.text.toString() != "")
                {
                    items.add("Free items : \n" + editText.text.toString())
                }
                val setId: Int = radioGroup.checkedRadioButtonId
                radioButton = findViewById(setId)
                items.add("\n Main items : \n" + radioButton.text.toString())
                for (item in items)
                {
                    outcome += item
                }
                Toast.makeText(this, "Your order is \n" + outcome , Toast.LENGTH_LONG).show()
               radioGroup.clearCheck();
                editText.setText("")
                items.clear()
                checkbox.isChecked = false


            }
        }
    }
}