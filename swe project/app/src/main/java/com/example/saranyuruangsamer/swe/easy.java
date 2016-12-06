package com.example.saranyuruangsamer.swe;
import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class easy extends Activity {

    /** Called when the activity is first created. */

public int count = 1;


  public   int a;
   public int b ;
   public int c ;
   public int d ;
   public int l;

    int e = 0;
    int f = 0;
    int h = 0;
    public String  textans;
    public String  textans1;
    public int z=0,w=0,x=0,y=0;
    public int ans = 0;
    public int an = 0;
  // public TextView TextStart;


    @Override
    public void onCreate(Bundle State) {
        super.onCreate(State);
        setContentView(R.layout.easy);



        Button butt1 = (Button) findViewById(R.id.ButtonNumber01);
        Typeface face=Typeface.createFromAsset(getAssets(),"font/bit.TTF");
        butt1.setTypeface(face);

        Button butt2 = (Button) findViewById(R.id.ButtonNumber02);
        Typeface face1=Typeface.createFromAsset(getAssets(),"font/bit.TTF");
        butt2.setTypeface(face1);

        Button butt3 = (Button) findViewById(R.id.ButtonNumber03);
        Typeface face2=Typeface.createFromAsset(getAssets(),"font/bit.TTF");
        butt3.setTypeface(face2);

        Button butt4 = (Button) findViewById(R.id.ButtonNumber04);
        Typeface face3=Typeface.createFromAsset(getAssets(),"font/bit.TTF");
        butt4.setTypeface(face3);


        Button btn2 = (Button) findViewById(R.id.ButtonSymbolExe);
        Button btn1 = (Button) findViewById(R.id.ButtonSymbolDel);
        Button back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), menu.class);
                startActivity(i);
            }
        });
        //TextStart = (TextView)findViewById(R.id.);
       // Button butt0 = (Button) findViewById(R.id.ButtonNumber00);
       /* Button butt5 = (Button) findViewById(R.id.ButtonSymbolDivide);
       Button butt6 = (Btton) findViewById(R.id.ButtonSymbolMultiply);
        Button butt7 = (Button) findViewById(R.id.ButtonSymbolSubtract);
        Button butt8 = (Button) findViewById(R.id.ButtonSymbolAdd);*/
        TextView textstart = (TextView) findViewById(R.id.textView2);
        TextView station = (TextView) findViewById(R.id.textView3);

       // ImageView plane = (ImageView) findViewById(R.id.imageView3);




        Animation ab = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.tranplane);

        station.startAnimation(ab);

        SharedPreferences sp = getSharedPreferences("PREF_NAME", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        count = sp.getInt("My_Value", 1);//countนี่คือgetค่าในsession เป็นเลขด่าน
        station.setText(count+ "     ");//เลขด่าน


         a = rand1(0,9);
         b = rand1(0,9);
         c = rand1(0,9);
         d = rand1(0,9);
         l = rand1(1,10);
        int[] test1 = new int[]{'*', '-', '+', '/'};
        int[] test = new int[]{a,b,c,d};

       textans="";
        textans1="";
        switch(l) {
            case 1: an = b+c+d+a;
                textans1 = b+"+?+"+d+"+?";
                break;
            case 2: an = c+d+b-a;
                textans1 = "?+"+d+"+"+b+"-?";
                break;
            case 3: an = c+d-b-a;
                textans1 = c+"+?-"+b+"-?";
                break;
            case 4: an = c+b-d+a;
                textans1 = "?+"+b+"-?+"+a;
                break;
            case 5: an = a-d+b-c;
                textans1 = "?-"+d+"+"+b+"-?";
                break;
            case 6: an = a-c+b-d;
                textans1 = a+"-"+"?"+"+"+"?"+"-"+d;
                break;
            case 7: an = a-b+c+d;
                textans1 = a+"-"+"b"+"+"+"?"+"+"+"?";
                break;
            case 8: an = b+c+d-a;
                textans1 = "?"+"+"+c+"+"+d+"-"+"?";
                break;
            case 9: an = d+c+b-a;
                textans1 = d+"+"+"?"+"+?"+"-"+a;
                break;
            case 10: an = c-a+b+d;
                textans1 = c+"-?"+"+"+b+"+?";
                break;

        }
           // butt0.setText(+ans+"");
            butt1.setText(+a + "");
            butt2.setText(+b + "");
            butt3.setText(+c + "");
            butt4.setText(+d + "");

            ans = an;


        textstart.setText(""+an + "   ");



        final AlertDialog.Builder dDialog = new AlertDialog.Builder(this);

        // Button1
        //  final Button btn1 = (Button) findViewById(R.id.ButtonSymbolDel);
        final String finalTextans = textans;

        final EditText text1 = (EditText) findViewById(R.id.EditText01);
       // final EditText text2 = (EditText) findViewById(R.id.EditText02);

        //final Button btn2 = (Button) findViewById(R.id.ButtonSymbolExe);

    }

    //random 1
    public  static int rand1(int min,int max)
    {

        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;


        return randomNum;

    }


    // ตรวจจับการคลิกปุ่มต่างๆ
    public int ButtonClickHandler(View v){


      /*  Random rn = new Random();
        int answer = rn.nextInt(10) + 1;*/


        final EditText text1 = (EditText) findViewById(R.id.EditText01);
        final AlertDialog.Builder dDialog = new AlertDialog.Builder(this);




        switch(v.getId()) {
            case R.id.ButtonNumber01:

                if (z != 0 || e != 0) {
                    text1.append("");
                } else {
                    text1.append(+a + "");
                    z++;
                    e++;
                    f++;

                }


                break;
            case R.id.ButtonNumber02:
                if (w != 0 || e != 0) {
                    text1.append("");
                } else {
                    text1.append(+b + "");
                    w++;
                    e++;
                    f++;
                }
                break;

            case R.id.ButtonNumber03:
                if (y != 0 || e != 0) {
                    text1.append("");
                } else {
                    text1.append(+c + "");
                    y++;
                    e++;
                    f++;
                }
                break;


            case R.id.ButtonNumber04:
                if (x != 0 || e != 0) {
                    text1.append("");
                } else {
                    text1.append(+d + "");
                    x++;
                    e++;
                    f++;
                }
                break;

       /*
            case R.id.ButtonSymbolBracketLeft:
                text1.append("(");
                break;
            case R.id.ButtonSymbolBracketRight:
                text1.append(")");
                break;*/
            case R.id.mul:
                dDialog.setTitle("หมายเหตุ");
                dDialog.setMessage("ไม่สามารถใช้ได้ในโหมดEASY");
                dDialog.setPositiveButton("ปิด", null);
                dDialog.show();
                break;
            case R.id.div:
                dDialog.setTitle("หมายเหตุ");
                dDialog.setMessage("ไม่สามารถใช้ได้ในโหมดEASY");
                dDialog.setPositiveButton("ปิด", null);
                dDialog.show();
                break;
            case R.id.ButtonSymbolSubtract:
                if (f != 1 || h == 3) {
                    text1.append("");
                } else {
                    text1.append("-");
                    e--;
                    f--;
                    h++;
                }
                break;

            case R.id.ButtonSymbolAdd:
                if (f != 1 || h == 3) {
                    text1.append("");
                } else {
                    text1.append("+");

                    e--;
                    f--;
                    h++;
                }
                break;

            case R.id.ButtonSymbolClear:
                text1.setText("");
                //text2.setText("");
                e = 0;
                f = 0;
                h = 0;
                z = 0;
                w = 0;
                x = 0;
                y = 0;
                break;
            case R.id.ButtonSymbolDel:

                dDialog.setTitle("สู้ๆครับเด็กๆ");
                dDialog.setMessage("" + textans1 + "");
                dDialog.setPositiveButton("ปิด", null);
                dDialog.show();
                break;

            case R.id.ButtonSymbolExe:

                String strStack = toPostfix(text1.getText().toString());
                float intValue = Calculator(strStack);
                int sss;

                sss= (int)intValue;
                SharedPreferences sp = getSharedPreferences("PREF_NAME", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                count = sp.getInt("My_Value", 1);

                 if(ans == sss )
                 {


                     count = count +1;
                    if(count >=1&&count<=10)
                    {        dDialog.setTitle("ผ่าน");

                        dDialog.setPositiveButton("ด่านถัดไป", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                /* User clicked OK so do some stuff */
                                Intent i = new Intent(getApplicationContext(), easy.class);
                                startActivity(i);
                            }
                        });

                        dDialog.show();

                     editor.putInt("My_Value", count);
                     editor.commit();



                 }
                     else
                    {
                        count = 1;
                        dDialog.setTitle("ผ่าน");

                        dDialog.setPositiveButton("จบแล้วไปโหมดถัดไป", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                /* User clicked OK so do some stuff */
                                Intent i = new Intent(getApplicationContext(), menu.class);
                                startActivity(i);
                            }
                        });

                        dDialog.show();
                        editor.putInt("My_Value", count);
                        editor.commit();
                    }

                }

            else {  count = count +0;
                     dDialog.setTitle("ผิดลองทำใหม่");

                dDialog.setPositiveButton("ปิด", null);
                dDialog.show();
                     editor.putInt("My_Value", count);
                     editor.commit();
                     //ตรงนี้
                 }
                break;


        }
        return 0 ;


    }
    // ตรวจสอบลำดับของเครื่องหมาย * / + -


    public static int getPriority(char chaOperator){
        if(chaOperator == '+' || chaOperator == '-'){
            return 1;
        }else if(chaOperator == '*' || chaOperator == '/'){
            return 2;
        }

        return 0;
    }

    // ตรวจสอบว่าเป็นตัวเลขหรือไม่
    public static boolean isFloat(String strInput){
        try{
            Float.parseFloat(strInput);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    // ทบทวนความรู้สมัยเรียนกันก่อน แปลงจาก infix เป็น postfix
    public static String toPostfix(String strInfix){
        String strExpression;
        String strPostfix = " ";

        strInfix  = strInfix.replaceAll("\\+|\\(|\\)|-|\\*|/", " $0 ");
        StringTokenizer strToken = new StringTokenizer(strInfix);

        Stack<Character> operatorStack = new Stack<Character>();

        while(strToken.hasMoreTokens()){
            strExpression = strToken.nextToken();

            if(Character.isDigit(strExpression.charAt(0))){
                strPostfix = strPostfix + " " + Float.parseFloat(strExpression);
            }else if(strExpression.equals("(")){
                Character operator = new Character('(');
                operatorStack.push(operator);
            }else if (strExpression.equals(")")){
                while(((Character) operatorStack.peek()).charValue() != '('){
                    strPostfix = strPostfix + " " + operatorStack.pop();
                }

                operatorStack.pop();
            }else{

                while(!operatorStack.isEmpty() && !(operatorStack.peek()).equals("(") && getPriority(strExpression.charAt(0)) <= getPriority(((Character) operatorStack.peek()).charValue())){
                    strPostfix = strPostfix + " " + operatorStack.pop();
                }

                Character operator = new Character(strExpression.charAt(0));
                operatorStack.push(operator);
            }
        }

        while(!operatorStack.isEmpty()){
            strPostfix = strPostfix + " " + operatorStack.pop();
        }

        return strPostfix;
    }

    // ทำการคำนวน  + - * / จาก postfix
    public static float Calculator(String strPostfix) {
        float a;
        float b;
        float result = 0;

        String[] arrPostfix = strPostfix.split(" ");
        Stack<Float> CalStack = new Stack<Float>();

        for (int i = 0; i < arrPostfix.length; i++) {
            String ch = arrPostfix[i];

            if (isFloat(ch)) {
                CalStack.push(Float.parseFloat(ch));
            } else {

                if (ch.equals("+")) {
                    a = CalStack.pop();
                    b = CalStack.pop();
                    result = a + b;
                    CalStack.push(result);
                } else if (ch.equals("-")) {
                    a = CalStack.pop();
                    b = CalStack.pop();
                    result = b - a;
                    CalStack.push(result);
                } else if (ch.equals("*")) {
                    a = CalStack.pop();
                    b = CalStack.pop();
                    result = a * b;
                    CalStack.push(result);
                } else if (ch.equals("/")) {
                    a = CalStack.pop();
                    b = CalStack.pop();
                    result = b / a;
                    CalStack.push(result);
                }
            }
        }

        return result;

    }}