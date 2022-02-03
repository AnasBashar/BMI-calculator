package com.example.bmicalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import java.text.DecimalFormat;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import android.os.Bundle;
import android.view.textclassifier.ConversationActions;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private TextView result;
    //protected Cursor cursor;
    //String[] register;
    //DataHelper dbcenter;

    //public static MainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        result=(TextView) findViewById(R.id.result);

      //  DataHelper dbHelper = new DataHelper(this);
        //ma = this;
        //dbcenter = new DataHelper(this);

    }



    public void CalculateBMI(View V)  {

        DecimalFormat df = new DecimalFormat("#.#");

       // File file =null;
        String h=height.getText().toString();
        String w=weight.getText().toString();

        if(h!=null && !"".equals(h)&&w!=null && !"".equals(w)) {
            float hf = Float.parseFloat(h);
            float wf = Float.parseFloat(w);

            if (hf > 10) {
                hf = (hf / 100);
            }

            float bmi = (wf / (hf * hf));
            String lbl1 = "";
            String lbl2 = "";

            if (bmi <= 18.4) {
                lbl1 = getString(R.string.under);
                lbl2 = getString(R.string.underrisk);
            } else if (bmi > 18.4 && bmi < 25) {
                lbl1 = getString(R.string.normal);
                lbl2 = getString(R.string.normalrisk);
            } else if (bmi > 24.9 && bmi < 30) {
                lbl1 = getString(R.string.over);
                lbl2 = getString(R.string.overrisk);
            } else if (bmi > 29.9 && bmi < 35) {
                lbl1 = getString(R.string.mobesity);
                lbl2 = getString(R.string.moberisk);
            } else if (bmi > 34.9 && bmi < 40) {
                lbl1 = getString(R.string.sobesity);
                lbl2 = getString(R.string.severisk);
            } else {
                lbl1 = getString(R.string.vobesity);
                lbl2 = getString(R.string.veberisk);
            }
          // SQLiteOpenHelper dbHelper;
            //SQLiteDatabase db = dbHelper.getWritableDatabase();
            //db.execSQL("insert into data(height, weight) values('"+height.getText().toString()+"','"+ weight.getText().toString()+"')");

              //      finish();
            result.setText("\n\n" + df.format(bmi) + "\n" + lbl1 + "\n" + lbl2);
        }

        /*public void RefreshList() {
            SQLiteDatabase db = dbcenter.getReadableDatabase();
            cursor = db.rawQuery("SELECT * FROM data", null);
            register = new String[cursor.getCount()];
            cursor.moveToFirst();
            for (int cc = 0; cc < cursor.getCount(); cc++) {
                cursor.moveToPosition(cc);
                register[cc] = cursor.getString(1).toString();
            }*/

      /*  public void CalculateBMI(View V){


        String he=height.getText().toString();
        String we=weight.getText().toString();

            if(h!=null && !"".equals(h)&&w!=null && !"".equals(w)) {
                float hf = Float.parseFloat(he);
                float wf = Float.parseFloat(we);

                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into data(height, weight) values('"+height.getText().toString()+"','"+ weight.getText().toString()+'")");

                finish();
            }}*/
                /*FileOutputStream fileOutputStream = null;
            try {

                file = getFilesDir();
                fileOutputStream = openFileOutput("Code.txt", Context.MODE_PRIVATE); //MODE PRIVATE
                fileOutputStream.write(h.getBytes());
                fileOutputStream.write(w.getBytes());
                height.setText("");
                weight.setText("");
                return;
            }
            catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }*/

    }
    /*public void ViewData (View V){
        File file=null;
        String h=height.getText().toString();
        String w=weight.getText().toString();

        FileOutputStream fileOutputStream=null;
        try{
            h=h+"";
            file = getFilesDir();
            fileOutputStream= openFileOutput("Code.txt", Context.MODE_PRIVATE);
            fileOutputStream.write(h.getBytes());
            fileOutputStream.write(w.getBytes());
            height.setText("");
            weight.setText("");
            return;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            try{
                fileOutputStream.close();
            }
            catch (IOException e) {
              e.printStackTrace();
            }

        }*/

      /*  @Override
                public void CalculateBMI( View arg0){
            SQLiteOpenHelper dbHelper;
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            db.execSQL("insert into data(height, weight) values('"+height.getText().toString()+"','"+ weight.getText().toString()+"')");

            finish();
        }*/

    public void ViewData(View V){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void About( View V){
        Intent intent = new Intent ( this, MainActivity3.class);
        startActivity(intent);
    }
    }

