package com.example.bmicalculator;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.util.*;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
   /* TextView getheight, getweight;

    String[] register;

    //access Database
    protected Cursor cursor;
    //use polymorphism toaccess DataHelper
    DataHelper dbcenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getheight = (TextView) findViewById(R.id.getheight);
        getweight = (TextView) findViewById(R.id.getweight);
    }
 /* public void load (View V){
        try{
            FileInputStream fileInputStream = openFileInput("Code.txt");
            int read = -1;
            StringBuffer buffer = new StringBuffer();
            while ((read = fileInputStream.read())!= -1){
                buffer.append((char)read);
            }
            Log.d("Code", buffer.toString());
            String height = buffer.substring(0, buffer.indexOf(""));
            String weight = buffer.substring(buffer.indexOf("")+1);
            getheight.setText(height);
            getweight.setText(weight);
        } catch (Exception e){
            e.printStackTrace();

        }

    }*/







   /* private void saveContent() {
        String content = getheight.getText().toString();
        String name = "Note 1"; // You can create a new EditText for getting name
        // Using SharedPreferences (the simple way)
        SharedPreferences sp = this.getApplicationContext().getSharedPreferences("notes", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(name, content);
        editor.apply();
    }

    private Map<String, ?> getAllNotes() {
        SharedPreferences sp = this.getApplicationContext().getSharedPreferences("notes", Context.MODE_PRIVATE);
        return sp.getAll();
    }

    private String getNoteContent(String noteName) {
        SharedPreferences sp = this.getApplicationContext().getSharedPreferences("notes", Context.MODE_PRIVATE);
        return sp.getString(noteName, "Default Value (If not exists)");
    }*/
   /*public void RefreshList() {
       SQLiteDatabase db = dbcenter.getReadableDatabase();
       cursor = db.rawQuery("SELECT * FROM biodata", null);
       register = new String[cursor.getCount()];
       cursor.moveToFirst();
       for (int cc = 0; cc < cursor.getCount(); cc++) {
           cursor.moveToPosition(cc);
           register[cc] = cursor.getString(1).toString();
       }}}
*/

    public void Back(View V) {
        Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
