package com.example.android.quiz_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Result button is clicked.
     */
    public void getResult(View view) {

        EditText question1 = (EditText) findViewById(R.id.answer_q1);
        String gotQuestion1 = question1.getText().toString();

        RadioButton question2 = (RadioButton) findViewById(R.id.answer_q2);
        boolean gotQuestion2 = question2.isChecked();

        CheckBox question3_1 = (CheckBox) findViewById(R.id.answer_q3_1);
        boolean gotQuestion3_1 = question3_1.isChecked();
        CheckBox question3_2 = (CheckBox) findViewById(R.id.answer_q3_2);
        boolean gotQuestion3_2 = question3_2.isChecked();
        CheckBox question3_3 = (CheckBox) findViewById(R.id.answer_q3_3);
        boolean gotQuestion3_3 = question3_3.isChecked();

        RadioButton question4 = (RadioButton) findViewById(R.id.answer_q4);
        boolean gotQuestion4 = question4.isChecked();

        RadioButton question5 = (RadioButton) findViewById(R.id.answer_q5);
        boolean gotQuestion5 = question5.isChecked();

        calculateAnswers(gotQuestion1, gotQuestion2, gotQuestion3_1, gotQuestion3_2, gotQuestion3_3, gotQuestion4, gotQuestion5);

    }

    /**
     * Calculates the number of correct answers and display result.
     */
    private void calculateAnswers(String checkQuestion1, boolean checkQuestion2, boolean checkQuestion3_1, boolean checkQuestion3_2, boolean checkQuestion3_3,
                                  boolean checkQuestion4, boolean checkQuestion5) {
        int correctAnswer = 0;
        int resultQuestion1 = 0;
        int resultQuestion2 = 0;
        int resultQuestion3 = 0;
        int resultQuestion4 = 0;
        int resultQuestion5 = 0;

        if (checkQuestion1.equalsIgnoreCase("Bryan Cranston")) {
            resultQuestion1 = 1;

            TextView answerQuestion = (TextView) findViewById(R.id.result_q1);
            answerQuestion.setText("Answer: Correct");
        } else {
            TextView answerQuestion = (TextView) findViewById(R.id.result_q1);
            answerQuestion.setText("Answer: Not correct");
        }


        if (checkQuestion2 == true) {
            resultQuestion2 = 1;
            TextView answerQuestion = (TextView) findViewById(R.id.result_q2);
            answerQuestion.setText("Answer: Correct");
        } else {
            TextView answerQuestion = (TextView) findViewById(R.id.result_q2);
            answerQuestion.setText("Answer: Not correct");
        }


        if (checkQuestion3_1 == true & checkQuestion3_2 == true & checkQuestion3_3 == false) {
            resultQuestion3 = 1;
            TextView answerQuestion = (TextView) findViewById(R.id.result_q3);
            answerQuestion.setText("Answer: Correct");
        } else {
            TextView answerQuestion = (TextView) findViewById(R.id.result_q3);
            answerQuestion.setText("Answer: Not correct");
        }


        if (checkQuestion4 == true) {
            resultQuestion4 = 1;
            TextView answerQuestion = (TextView) findViewById(R.id.result_q4);
            answerQuestion.setText("Answer: Correct");
        } else {
            TextView answerQuestion = (TextView) findViewById(R.id.result_q4);
            answerQuestion.setText("Answer: Not correct");
        }

        if (checkQuestion5 == true) {
            resultQuestion5 = 1;
            TextView answerQuestion = (TextView) findViewById(R.id.result_q5);
            answerQuestion.setText("Answer: Correct");
        } else {
            TextView answerQuestion = (TextView) findViewById(R.id.result_q5);
            answerQuestion.setText("Answer: Not correct");
        }


        correctAnswer = resultQuestion1 + resultQuestion2 + resultQuestion3 + resultQuestion4 + resultQuestion5;

        Toast.makeText(this, "You have " + correctAnswer + " correct answers out of 5", Toast.LENGTH_SHORT).show();
    }
}
