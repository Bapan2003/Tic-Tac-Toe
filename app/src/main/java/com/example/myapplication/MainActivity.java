package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,Restart;
   String b1,b2,b3,b4,b5,b6,b7,b8,b9;
   int flag=0;
   int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Restart=findViewById(R.id.ReStart);
        Restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newGame();
            }
        });
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }

    private void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);


    }
    public void Check(View view){
       Button btnCurr=(Button)view;
       if(btnCurr.getText().toString().equals("")) {
           count++;
           if (flag == 0) {
               btnCurr.setText("x");
               flag = 1;
           } else {
               btnCurr.setText("O");
               flag = 0;
           }
           if (count >= 5) {
               b1 = btn1.getText().toString();
               b2 = btn2.getText().toString();
               b3 = btn3.getText().toString();
               b4 = btn4.getText().toString();
               b5 = btn5.getText().toString();
               b6 = btn6.getText().toString();
               b7 = btn7.getText().toString();
               b8 = btn8.getText().toString();
               b9 = btn9.getText().toString();


               //condition
               if (b1.equals(b2) && b1.equals(b3) && !b1.equals("")) {
                   Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                   sleep();
//                   btn1.setText("");
//                   btn2.setText("");
//                   btn3.setText("");
//                   btn4.setText("");
//                   btn5.setText("");
//                   btn6.setText("");
//                   btn7.setText("");
//                   btn8.setText("");
//                   btn9.setText("");
               } else if (b4.equals(b5) && b4.equals(b6) && !b4.equals("")) {
                   Toast.makeText(this, "Winner is : " + b4, Toast.LENGTH_LONG).show();
                   sleep();
               } else if (b7.equals(b8) && b7.equals(b9) && !b7.equals("")) {
                   Toast.makeText(this, "Winner is : " + b7, Toast.LENGTH_LONG).show();
                   sleep();
               } else if (b1.equals(b4) && b1.equals(b7) && !b1.equals("")) {
                   Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_LONG).show();
                   sleep();
               } else if (b2.equals(b5) && b2.equals(b8) && !b2.equals("")) {
                   Toast.makeText(this, "Winner is : " + b2, Toast.LENGTH_LONG).show();
                   sleep();
               } else if (b3.equals(b6) && b3.equals(b9) && !b3.equals("")) {
                   Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_LONG).show();

                   sleep();
               } else if (b1.equals(b5) && b1.equals(b9) && !b1.equals("")) {
                   Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_LONG).show();
                  sleep();
               } else if (b3.equals(b5) && b3.equals(b7) && !b3.equals("")) {
                   Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_LONG).show();
                   sleep();

               }
//               }else if(count==9){
//                   Toast.makeText(this, "Game is drawn.", Toast.LENGTH_SHORT).show();
//
//               }
           }

       }
    }
    public void sleep(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                newGame();
            }
        },6000);
    }
    public void newGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        flag=0;
    }
}