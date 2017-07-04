package com.example.genesissy.thabeloquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void Open(View view) {
        Intent open = new Intent(this, Science.class);
        startActivity(open);
    }

    public void Open_General(View view) {
        Intent open = new Intent(this, General.class);
        startActivity(open);

    }

    public void About(View view) {
        Intent open = new Intent(this, Real_Fact.class);
        startActivity(open);
    }

    public void Close(View view) {

        AlertDialog.Builder dialog = new AlertDialog.Builder(Menu.this);
        dialog.setTitle("EXIT");
        dialog.setMessage("Do You Real Want To Exit This Application? ");


        dialog.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        dialog.show();
    }
}


