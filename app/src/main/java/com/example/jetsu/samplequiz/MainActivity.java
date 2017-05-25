package com.example.jetsu.samplequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view){

        int totalPoint = getQuestion1Answer() + getQuestion2Answer() + getQuestion3Answer() + getQuestion4Answer();
        TextView answer = (TextView) findViewById(R.id.answer_text);

        if(totalPoint == 8)
            answer.setText("Congratulation, you have answered all of the questions correctly!"
                            + "\nTotal Points: " +totalPoint + " / 8");

        else
            answer.setText("You did not answer all of the questions correctly."
                            + "\nTotal Points: " + totalPoint + " / 8");




    }




    private int getQuestion1Answer()
    {
        RadioButton q1Answer = (RadioButton) findViewById(R.id.european_or_african);
        if(q1Answer.isChecked())
            return 1;
        else
            return 0;

    }




    private int getQuestion3Answer()
    {

        int question3Point = 0;

        CheckBox c1 = (CheckBox) findViewById(R.id.text_view);
        if(c1.isChecked())
            question3Point++;


        CheckBox c3 = (CheckBox) findViewById(R.id.button);
        if(c3.isChecked())
            question3Point++;

        CheckBox c4 = (CheckBox) findViewById(R.id.scroll_view);
        if(c4.isChecked())
            question3Point++;



        CheckBox c6 = (CheckBox) findViewById(R.id.check_box);
        if(c6.isChecked())
            question3Point++;



        CheckBox c9 = (CheckBox) findViewById(R.id.edit_text);
        if(c9.isChecked())
            question3Point++;

        return question3Point;
    }

    private int getQuestion2Answer(){

        EditText q2Answer =  (EditText) findViewById(R.id.q2_answer);
        String q2AnswerString =  q2Answer.getText().toString();

        if(q2AnswerString.compareTo(getString(R.string.question2_answer)) == 0)
            return 1;
        else
            return 0;


    }


    private int getQuestion4Answer(){

        EditText q4Answer = (EditText) findViewById(R.id.q4_answer);
        String q4AnswerString = q4Answer.getText().toString();

        if(q4AnswerString.compareTo(getString(R.string.question4_answer)) == 0)
            return  1;
        else
            return 0;

    }

}
