package com.example.genesissy.thabeloquiz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.genesissy.thabeloquiz.ScienceQuestion.total;

public class ScienceResults extends Activity {

    ScienceQuestion scienceQuestion = new ScienceQuestion();
    TextView Score_Resilts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_results);

//        Bundle ScoreDataOne = getIntent().getExtras();
//        String ThirdMassage=ScoreDataOne.getString("ScoreA");
        String ThirdMassage = scienceQuestion.scoremassegeA;
        String tm = scienceQuestion.timer.getText().toString();
        Score_Resilts=(TextView)findViewById(R.id.total);
        Score_Resilts.setText(String.valueOf(total));




        final TextView ScoreMassegeA=(TextView) findViewById(R.id.Timer_Resever);
        ScoreMassegeA.setText(tm);
    }
}
