package com.example.android.cryptoquiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //number of questions to calculate quiz correct percentage
    private static final int TOTAL_QUESTIONS = 5;

    //save answers vars
    private int answer_1_selectedRbId = -1;
    private boolean answer_2_chk_1 = false;
    private boolean answer_2_chk_2 = false;
    private boolean answer_2_chk_3 = false;
    private boolean answer_2_chk_4 = false;
    private String answer_3_input = "";
    private int answer_4_selectedRbId = -1;
    private int answer_5_selectedRbId = -1;

    //Question 1
    private RadioGroup question_1_rg;
    private RadioButton question_1_rb_2; //correct radio button

    //Question 2
    private CheckBox question_2_chk_1;
    private CheckBox question_2_chk_2;
    private CheckBox question_2_chk_3;
    private CheckBox question_2_chk_4;

    //Question 3
    private EditText question_3_input;

    //Question 4
    private RadioGroup question_4_rg;
    private RadioButton question_4_rb_4; //correct radio button

    //Question 5
    private RadioGroup question_5_rg;
    private RadioButton question_5_rb_3; //correct radio button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //disable keyboard popup on rotate
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //Question 1
        question_1_rg = findViewById(R.id.question_1_rg);
        question_1_rb_2 = findViewById(R.id.question_1_rb_2);

        //Question 2
        question_2_chk_1 = findViewById(R.id.question_2_chk_1);
        question_2_chk_2 = findViewById(R.id.question_2_chk_2);
        question_2_chk_3 = findViewById(R.id.question_2_chk_3);
        question_2_chk_4 = findViewById(R.id.question_2_chk_4);

        //Question 3
        question_3_input = findViewById(R.id.question_3_input);

        //Question 4
        question_4_rg = findViewById(R.id.question_4_rg);
        question_4_rb_4 = findViewById(R.id.question_4_rb_4);

        //Question 5
        question_5_rg = findViewById(R.id.question_5_rg);
        question_5_rb_3 = findViewById(R.id.question_5_rb_3);

        //setup listeners

        //Question 1 RadioGroup
        question_1_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.question_1_rb_1:
                        Toast.makeText(MainActivity.this, getText(R.string.donald_trump) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_1_rb_2:
                        Toast.makeText(MainActivity.this, getText(R.string.satoshi_nakamoto) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_1_rb_3:
                        Toast.makeText(MainActivity.this, getText(R.string.mickey_mouse) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_1_rb_4:
                        Toast.makeText(MainActivity.this, getText(R.string.kim_dotcom) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        //Question 2 CheckBoxes
        question_2_chk_1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, getText(R.string.question2Chk1) + " " + getText(R.string.checked), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, getText(R.string.question2Chk1) + " " + getText(R.string.unchecked), Toast.LENGTH_SHORT).show();
                }

            }
        });

        question_2_chk_2.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, getText(R.string.question2Chk2) + " " + getText(R.string.checked), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, getText(R.string.question2Chk2) + " " + getText(R.string.unchecked), Toast.LENGTH_SHORT).show();
                }

            }
        });

        question_2_chk_3.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, getText(R.string.question2Chk3) + " " + getText(R.string.checked), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, getText(R.string.question2Chk3) + " " + getText(R.string.unchecked), Toast.LENGTH_SHORT).show();
                }

            }
        });

        question_2_chk_4.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, getText(R.string.question2Chk4) + " " + getText(R.string.checked), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, getText(R.string.question2Chk4) + " " + getText(R.string.unchecked), Toast.LENGTH_SHORT).show();
                }

            }
        });

        //Question 4 RadioGroup
        question_4_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.question_4_rb_1:
                        Toast.makeText(MainActivity.this, getText(R.string.cpu) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_4_rb_2:
                        Toast.makeText(MainActivity.this, getText(R.string.gpu) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_4_rb_3:
                        Toast.makeText(MainActivity.this, getText(R.string.fpga) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_4_rb_4:
                        Toast.makeText(MainActivity.this, getText(R.string.asic) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        //Question 5 RadioGroup
        question_5_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.question_5_rb_1:
                        Toast.makeText(MainActivity.this, getText(R.string.ferrari_488_spider) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_5_rb_2:
                        Toast.makeText(MainActivity.this, getText(R.string.gold) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_5_rb_3:
                        Toast.makeText(MainActivity.this, getText(R.string.pizza) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.question_5_rb_4:
                        Toast.makeText(MainActivity.this, getText(R.string.marijuana) + " " + getText(R.string.selected), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }


    /**
     * This method is called when the view score button is clicked.
     */
    public void showScore(View view) {
        //load vars
        setupAnswerVars();

        //calculate answers score
        double score = calculateScore();
        //Log.v("MainActivity","The score is " + score);

        //Show toast with score
        showScoreToast(score);
    }

    /**
     * Toast message to show result
     */
    private void showScoreToast(double score) {

        View toastLayout = getLayoutInflater().inflate(R.layout.toasted, null);
        Toast toast = new Toast(getApplicationContext());
        // set Score Value
        TextView scoreTxt = toastLayout.findViewById(R.id.toastscore_textview);
        scoreTxt.setText(String.valueOf(score) + "%");
        toast.setView(toastLayout);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }


    /**
     * This method is called when the submit button is clicked.
     */
    public void submitScore(View view) {
        EditText nameInput = findViewById(R.id.name_input_view);
        String username = nameInput.getText().toString();

        //load vars
        setupAnswerVars();

        //calculate answers score
        double score = calculateScore();
        //Log.v("MainActivity","The score is " + score);

        String message = createScoreSummary(score, username);
        sendScoreEmail(username, message);
    }


    /**
     * setup answer vars
     */
    private void setupAnswerVars() {
        //Question 1
        answer_1_selectedRbId = question_1_rg.getCheckedRadioButtonId();

        //Question 2
        answer_2_chk_1 = question_2_chk_1.isChecked();
        answer_2_chk_2 = question_2_chk_2.isChecked();
        answer_2_chk_3 = question_2_chk_3.isChecked();
        answer_2_chk_4 = question_2_chk_4.isChecked();

        //Question 3
        answer_3_input = question_3_input.getText().toString();

        //Question 4
        answer_4_selectedRbId = question_4_rg.getCheckedRadioButtonId();

        //Question 5
        answer_5_selectedRbId = question_5_rg.getCheckedRadioButtonId();
    }


    /**
     * Calculates the score in percentage
     */
    private double calculateScore() {

        double score = 0;

        if (answer_1_selectedRbId == question_1_rb_2.getId()) {
            score += 1;
            //Log.v("MainActivity", "Question 1 is correct ");
        }

        int scoreQuestion2 = 0;
        if (answer_2_chk_1) {
            scoreQuestion2 -= 1;
        }
        if (answer_2_chk_2) {
            scoreQuestion2 -= 1;
        }
        if (answer_2_chk_3) {
            scoreQuestion2 += 1;
        }
        if (answer_2_chk_4) {
            scoreQuestion2 += 1;
        }
        if (scoreQuestion2 == 2) {
            score += 1;
            //Log.v("MainActivity", "Question 2 is correct ");
        }

        if (answer_3_input.equals("8")) {
            score += 1;
            //Log.v("MainActivity", "Question 3 is correct ");
        }

        if (answer_4_selectedRbId == question_4_rb_4.getId()) {
            score += 1;
            //Log.v("MainActivity", "Question 4 is correct ");
        }

        if (answer_5_selectedRbId == question_5_rb_3.getId()) {
            score += 1;
            //Log.v("MainActivity", "Question 5 is correct ");
        }

        score = (score * 100.0) / TOTAL_QUESTIONS;
        //Log.v("MainActivity", "Total Score is: " + score);
        return score;

    }

    /**
     * Creates message for mail.
     */
    private String createScoreSummary(double score, String username) {
        String scoreMessage = "Hello! :) ";

        scoreMessage += "\nName: " + username;
        if (username.equals("")) {
            username = getText(R.string.unkown_user).toString();
        }
        scoreMessage += "\nScore: " + score + "%";
        scoreMessage += "\nThank you!";
        return scoreMessage;
    }

    /**
     * Send Email.
     */
    private void sendScoreEmail(String username, String message) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        //intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        if (username.equals("")) {
            username = getText(R.string.unkown_user).toString();
        }
        intent.putExtra(Intent.EXTRA_SUBJECT, getText(R.string.finalscore) + " " + username);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Reset Quiz - vars and views
     */
    public void resetQuiz(View view) {
        answer_1_selectedRbId = -1;
        answer_2_chk_1 = false;
        answer_2_chk_2 = false;
        answer_2_chk_3 = false;
        answer_2_chk_4 = false;
        answer_3_input = "";
        answer_4_selectedRbId = -1;
        answer_5_selectedRbId = -1;

        question_1_rg.clearCheck();
        question_2_chk_1.setChecked(answer_2_chk_1);
        question_2_chk_2.setChecked(answer_2_chk_2);
        question_2_chk_3.setChecked(answer_2_chk_3);
        question_2_chk_4.setChecked(answer_2_chk_4);
        question_3_input.setText(String.valueOf(answer_3_input));
        question_4_rg.clearCheck();
        question_5_rg.clearCheck();

        EditText nameInput = findViewById(R.id.name_input_view);
        nameInput.setText(String.valueOf(""));

    }
}
