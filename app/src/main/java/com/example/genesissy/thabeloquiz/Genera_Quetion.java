package com.example.genesissy.thabeloquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Genera_Quetion extends Activity {

    static TextView timer2;
    CountDownTimer countDownTimer2;
    static String scoremassegeA;
    public RadioGroup quetion_One,quetion_Two,Question_Three,Question_Four,Question_Five,Question_Six,Question_Seven,Questio_Eight,Question_Nine,Question_Ten,Question_Eleven,Question_Thwelf,Question_Thirteen,Question_Fourteen,Question_FiveTeen,Question_SixTeen,Question_SevenTeen,Question_EigTeen,Question_NineTeen,Question_Twenty;

    QuizApp Myobject = new QuizApp();
    int score1,score2,score3,score4,score5,score6,score7,score8,score9,score10,score11,score12,score13,score14,score15,score16,score17,score18,score19,score20= 0;

    static int total;
    public Button General;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genera__quetion);
        General= (Button) findViewById(R.id.Gneral_btn);
        quetion_One= (RadioGroup) findViewById(R.id.quetion_One);
        quetion_Two= (RadioGroup) findViewById(R.id.quetion_Two);
        Question_Three= (RadioGroup) findViewById(R.id.Question_Three);
        Question_Four= (RadioGroup) findViewById(R.id.Question_Four);
        Question_Five= (RadioGroup) findViewById(R.id.Question_Five);
        Question_Six= (RadioGroup) findViewById(R.id.Question_Six);
        Question_Seven= (RadioGroup) findViewById(R.id.Question_Seven);
        Questio_Eight= (RadioGroup) findViewById(R.id.Questio_Eight);
        Question_Nine= (RadioGroup) findViewById(R.id.Question_Nine);
        Question_Ten= (RadioGroup) findViewById(R.id.Question_Ten);
        Question_Eleven= (RadioGroup) findViewById(R.id.Question_Eleven);
        Question_Thwelf= (RadioGroup) findViewById(R.id.Question_Thwelf);
        Question_Thirteen= (RadioGroup) findViewById(R.id.Question_Thirteen);
        Question_Fourteen= (RadioGroup) findViewById(R.id.Question_Fourteen);
        Question_FiveTeen= (RadioGroup) findViewById(R.id.Question_FiveTeen);
        Question_SixTeen= (RadioGroup) findViewById(R.id.Question_SixTeen);
        Question_SevenTeen= (RadioGroup) findViewById(R.id.Question_SevenTeen);
        Question_EigTeen= (RadioGroup) findViewById(R.id.Question_EigTeen);
        Question_NineTeen= (RadioGroup) findViewById(R.id.Question_NineTeen);
        Question_Twenty= (RadioGroup) findViewById(R.id.Question_Twenty);

        timer2 = (TextView)findViewById(R.id.General_Timer);
        timmer2();
    }
    public void GeneralBtn(View v){
        countDownTimer2.cancel();
        Intent GeneralResults=new Intent(this,Gerneral_Results.class);

        //this display for score A
        final TextView ResultsA= (TextView)findViewById(R.id.General_Timer);
        scoremassegeA = ResultsA.getText().toString();
        GeneralResults.putExtra("ScoreA",scoremassegeA);

        Myobject.setFirstRadio(0);
        Myobject.setSecondRadio(3);
        Myobject.setThirdRadio(0);

        //this show point in Question1
        if(quetion_One.getCheckedRadioButtonId()==R.id.radioButton2){
            score1= Myobject.getSecondRadio();
        }else if (quetion_Two.getCheckedRadioButtonId()==R.id.radioButton1){
            score1= Myobject.getFirstRadio();
        }else {
            score1= Myobject.getThirdRadio();
        }
        //this show point in Question2
        if(quetion_Two.getCheckedRadioButtonId()==R.id.radioButton5){
            score2= Myobject.getFirstRadio();
        }else if (quetion_Two.getCheckedRadioButtonId()==R.id.radioButton4){
            score2= Myobject.getSecondRadio();
        }else {
            score2= Myobject.getThirdRadio();
        }
        //this show point in Question3
        if(Question_Three.getCheckedRadioButtonId()==R.id.radioButton9){
            score3= Myobject.getSecondRadio();
        }else if (Question_Three.getCheckedRadioButtonId()==R.id.radioButton8){
            score3= Myobject.getFirstRadio();
        }else {
            score3= Myobject.getThirdRadio();
        }
        //this show point in Question4
        if(Question_Four.getCheckedRadioButtonId()==R.id.radioButton12){
            score4= Myobject.getSecondRadio();
        }else if (Question_Four.getCheckedRadioButtonId()==R.id.radioButton11){
            score4= Myobject.getFirstRadio();
        }else {
            score4= Myobject.getThirdRadio();
        }
        //this show point in Question5
        if(Question_Five.getCheckedRadioButtonId()==R.id.radioButton14){
            score5= Myobject.getSecondRadio();
        }else if (Question_Five.getCheckedRadioButtonId()==R.id.radioButton16){
            score5= Myobject.getFirstRadio();
        }else {
            score5= Myobject.getThirdRadio();
        }
        //this show point in Question6
        if(Question_Six.getCheckedRadioButtonId()==R.id.radioButton18){
            score6= Myobject.getFirstRadio();
        }else if (Question_Six.getCheckedRadioButtonId()==R.id.radioButton19){
            score6= Myobject.getSecondRadio();
        }else {
            score6= Myobject.getThirdRadio();
        }
        //this show point in Question7
        if(Question_Seven.getCheckedRadioButtonId()==R.id.radioButton20){
            score7= Myobject.getSecondRadio();
        }else if (Question_Seven.getCheckedRadioButtonId()==R.id.radioButton21){
            score7= Myobject.getFirstRadio();
        }else {
            score7= Myobject.getThirdRadio();
        }
        //this show point in Question8
        if(Questio_Eight.getCheckedRadioButtonId()==R.id.radioButton25){
            score8= Myobject.getSecondRadio();
        }else if (Questio_Eight.getCheckedRadioButtonId()==R.id.radioButton24){
            score8= Myobject.getFirstRadio();
        }else {
            score8= Myobject.getThirdRadio();
        }
        //this show point in Question9
        if(Question_Nine.getCheckedRadioButtonId()==R.id.radioButton26){
            score9= Myobject.getSecondRadio();
        }else if (Question_Nine.getCheckedRadioButtonId()==R.id.radioButton27){
            score9= Myobject.getFirstRadio();
        }else {
            score9= Myobject.getThirdRadio();
        }
        //this show point in Question10
        if(Question_Ten.getCheckedRadioButtonId()==R.id.radioButton31){
            score10= Myobject.getSecondRadio();
        }else if (Question_Ten.getCheckedRadioButtonId()==R.id.radioButton30){
            score10= Myobject.getFirstRadio();
        }else {
            score10= Myobject.getThirdRadio();
        }
        //this show point in Question11
        if(Question_Eleven.getCheckedRadioButtonId()==R.id.radioButton32){
            score11= Myobject.getSecondRadio();
        }else if (Question_Eleven.getCheckedRadioButtonId()==R.id.radioButton33){
            score11= Myobject.getFirstRadio();
        }else {
            score11= Myobject.getThirdRadio();
        }

        //this show point in Question12
        if(Question_Thwelf.getCheckedRadioButtonId()==R.id.radioButton37){
            score12= Myobject.getSecondRadio();
        }else if (Question_Thwelf.getCheckedRadioButtonId()==R.id.radioButton36){
            score12= Myobject.getFirstRadio();
        }else {
            score12= Myobject.getThirdRadio();
        }
        //this show point in Question13
        if(Question_Thirteen.getCheckedRadioButtonId()==R.id.radioButton38){
            score13= Myobject.getSecondRadio();
        }else if (Question_Thirteen.getCheckedRadioButtonId()==R.id.radioButton39){
            score13= Myobject.getFirstRadio();
        }else {
            score13= Myobject.getThirdRadio();
        }
        //this show point in Question14
        if(Question_Fourteen.getCheckedRadioButtonId()==R.id.radioButton42){
            score14= Myobject.getSecondRadio();
        }else if (Question_Fourteen.getCheckedRadioButtonId()==R.id.radioButton41){
            score14= Myobject.getFirstRadio();
        }else {
            score14= Myobject.getThirdRadio();
        }
        //this show point in Question15
        if(Question_FiveTeen.getCheckedRadioButtonId()==R.id.radioButton45){
            score15= Myobject.getSecondRadio();
        }else if (Question_FiveTeen.getCheckedRadioButtonId()==R.id.radioButton46){
            score15= Myobject.getFirstRadio();
        }else {
            score15= Myobject.getThirdRadio();
        }
        //this show point in Question16
        if(Question_SixTeen.getCheckedRadioButtonId()==R.id.radioButton49){
            score16= Myobject.getSecondRadio();
        }else if (Question_SixTeen.getCheckedRadioButtonId()==R.id.radioButton48){
            score16= Myobject.getFirstRadio();
        }else {
            score16= Myobject.getThirdRadio();
        }
        //this show point in Question17
        if(Question_SevenTeen.getCheckedRadioButtonId()==R.id.radioButton50){
            score17= Myobject.getSecondRadio();
        }else if (Question_SevenTeen.getCheckedRadioButtonId()==R.id.radioButton51){
            score17= Myobject.getFirstRadio();
        }else {
            score17= Myobject.getThirdRadio();
        }
        //this show point in Question18
        if(Question_EigTeen.getCheckedRadioButtonId()==R.id.radioButton54){
            score18= Myobject.getSecondRadio();
        }else if (Question_EigTeen.getCheckedRadioButtonId()==R.id.radioButton53){
            score18= Myobject.getFirstRadio();
        }else {
            score18= Myobject.getThirdRadio();
        }
        //this show point in Question19
        if(Question_NineTeen.getCheckedRadioButtonId()==R.id.radioButton58){
            score19= Myobject.getSecondRadio();
        }else if (Question_NineTeen.getCheckedRadioButtonId()==R.id.radioButton57){
            score19= Myobject.getFirstRadio();
        }else {
            score19= Myobject.getThirdRadio();
        }
        //this show point in Question20
        if(Question_Twenty.getCheckedRadioButtonId()==R.id.radioButton59){
            score20= Myobject.getSecondRadio();
        }else if (Question_Twenty.getCheckedRadioButtonId()==R.id.radioButton60){
            score20= Myobject.getFirstRadio();
        }else {
            score20= Myobject.getThirdRadio();
        }
        //this show the toast
        total =score1+score2+score3+score4+score5+score6+score7+score8+score9+score10+score11+score12+score13+score14+score15+score16+score17+score18+score19+score20;
        Toast.makeText(getApplication(),"Score: " + total,Toast.LENGTH_LONG).show();

       startActivity(GeneralResults);

    }

    void timmer2(){
        countDownTimer2 = new CountDownTimer(180000, 1000){
            @Override
            public void onTick(long millisUntilFinished) {
                timer2.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Intent me = new Intent(Genera_Quetion.this,General_Gameover.class);
                startActivity(me);
                int total =score1+score2+score3+score4+score5+score6+score7+score8+score9+score10+score11+score12+score13+score14+score15+score16+score17+score18+score19+score20;
                Toast.makeText(getApplication(),"Score: " + total,Toast.LENGTH_LONG).show();
            }
        }.start();
    }

}
