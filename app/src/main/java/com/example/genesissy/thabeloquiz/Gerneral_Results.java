package com.example.genesissy.thabeloquiz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.genesissy.thabeloquiz.Genera_Quetion.total;

public class Gerneral_Results extends Activity {

    Genera_Quetion GeneraQuestion = new Genera_Quetion();
    TextView Results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerneral__results);

        Results = (TextView)findViewById(R.id.res);

        String ThirdMassage = GeneraQuestion.scoremassegeA;
        String tm = GeneraQuestion.timer2.getText().toString();

        Results.setText(String.valueOf(total));
        final TextView ScoreMassegeA=(TextView) findViewById(R.id.Timer_Resever);
        ScoreMassegeA.setText(tm);
    }
}
