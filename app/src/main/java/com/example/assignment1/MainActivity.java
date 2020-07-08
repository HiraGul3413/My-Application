package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView date1;
    TextView date2;
    TextView date3;
    TextView date4;
    TextView t1;
    TextView p1;
    TextView t2;
    TextView p2;
    TextView t3;
    TextView p3;
    TextView t4;
    TextView p4;
    TextView t5;
    TextView p5;
    TextView t6;
    TextView p6;
    TextView t7;
    TextView p7;
    TextView t8;
    TextView p8;
    int i=0;
    int f=0;
    float j=0;
    String s;
    String z;

    int ii=0;
    int ff=0;
    float jj=0;
    String ss;
    String zz;

    int iii=0;
    int fff=0;
    float jjj=0;
    String sss;
    String zzz;

    int iiii=0;
    int ffff=0;
    float jjjj=0;
    String ssss;
    String zzzz;

    int i5=0;
    int f5=0;
    float j5=0;
    String s5;
    String z5;

    int i6=0;
    int f6=0;
    float j6=0;
    String s6;
    String z6;

    int i7=0;
    int f7=0;
    float j7=0;
    String s7;
    String z7;

    int i8=0;
    int f8=0;
    float j8=0;
    String s8;
    String z8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date1=(TextView)findViewById(R.id.date1);
        date2=(TextView)findViewById(R.id.date2);
        date3=(TextView)findViewById(R.id.date3);
        date4=(TextView)findViewById(R.id.date4);
    }
    public void setDate(View v)
    {
        boolean checked=((TextView) v).isInTouchMode();
        switch (v.getId()){
            case R.id.date1:
                if(checked){
                    final Calendar c1= Calendar.getInstance();
                    int day=c1.get(Calendar.DAY_OF_MONTH);
                    int month=c1.get(Calendar.MONTH);
                    int year=c1.get(Calendar.YEAR);
                    DatePickerDialog datePickerDialog;
                    datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker v, int year, int month, int dayOfMonth) {
                            date1.setText(dayOfMonth+"/"+(month+1)+"  ");
                        }
                    },year,month,day);
                    datePickerDialog.show();
                    break;
                }
            case R.id.date2:
                if(checked){
                    final Calendar c1= Calendar.getInstance();
                    int day=c1.get(Calendar.DAY_OF_MONTH);
                    int month=c1.get(Calendar.MONTH);
                    int year=c1.get(Calendar.YEAR);
                    DatePickerDialog datePickerDialog;
                    datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker v, int year, int month, int dayOfMonth) {
                            date2.setText(dayOfMonth+"/"+(month+1)+"  ");
                        }
                    },year,month,day);
                    datePickerDialog.show();
                break;}
            case R.id.date3:
                if(checked){
                    final Calendar c1= Calendar.getInstance();
                    int day=c1.get(Calendar.DAY_OF_MONTH);
                    int month=c1.get(Calendar.MONTH);
                    int year=c1.get(Calendar.YEAR);
                    DatePickerDialog datePickerDialog;
                    datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker v, int year, int month, int dayOfMonth) {
                            date3.setText(dayOfMonth+"/"+(month+1)+"  ");
                        }
                    },year,month,day);
                    datePickerDialog.show();
                break;}
            case R.id.date4:
                if(checked){
                    final Calendar c1= Calendar.getInstance();
                    int day=c1.get(Calendar.DAY_OF_MONTH);
                    int month=c1.get(Calendar.MONTH);
                    int year=c1.get(Calendar.YEAR);
                    DatePickerDialog datePickerDialog;
                    datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker v, int year, int month, int dayOfMonth) {
                            date4.setText(dayOfMonth+"/"+(month+1)+"  ");
                        }
                    },year,month,day);
                    datePickerDialog.show();
                break;}
        }

    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.c1:
            case R.id.d1:
            case R.id.e1:
            case R.id.f1:
                if (checked)
                {
                    t1=(TextView)findViewById(R.id.t1);
                    p1=(TextView)findViewById(R.id.p1);
                    i++;
                    s=String.valueOf(i);
                    j=(i*100)/4;
                    f= (int) j;
                    z=String.valueOf(f);
                    t1.setText(s);
                    p1.setText(z+"%");
                }
                else
                {
                    i--;
                    s=String.valueOf(i);
                    j=(i*100)/4;
                    f= (int) j;
                    z=String.valueOf(f);
                    t1.setText(s);
                    p1.setText(z+"%");
                }
                break;
            case R.id.c2:
            case R.id.d2:
            case R.id.e2:
            case R.id.f2:
                if (checked)
                {
                    t2=(TextView)findViewById(R.id.t2);
                    p2=(TextView)findViewById(R.id.p2);
                    ii++;
                    ss=String.valueOf(ii);
                    jj=(ii*100)/4;
                    ff= (int) jj;
                    zz=String.valueOf(ff);
                    t2.setText(ss);
                    p2.setText(zz+"%");
                }
                else
                {
                    ii--;
                    ss=String.valueOf(ii);
                    jj=(ii*100)/4;
                    ff= (int) jj;
                    zz=String.valueOf(ff);
                    t2.setText(ss);
                    p2.setText(zz+"%");
                }
                break;
            case R.id.c3:
            case R.id.d3:
            case R.id.e3:
            case R.id.f3:
                if (checked)
                {
                    t3=(TextView)findViewById(R.id.t3);
                    p3=(TextView)findViewById(R.id.p3);
                    iii++;
                    sss=String.valueOf(iii);
                    jjj=(iii*100)/4;
                    fff= (int) jjj;
                    zzz=String.valueOf(fff);
                    t3.setText(sss);
                    p3.setText(zzz+"%");
                }
                else
                {
                    iii--;
                    sss=String.valueOf(iii);
                    jjj=(iii*100)/4;
                    fff= (int) jjj;
                    zzz=String.valueOf(fff);
                    t3.setText(sss);
                    p3.setText(zzz+"%");
                }
                break;
            case R.id.c4:
            case R.id.d4:
            case R.id.e4:
            case R.id.f4:
                if (checked)
                {
                    t4=(TextView)findViewById(R.id.t4);
                    p4=(TextView)findViewById(R.id.p4);
                    iiii++;
                    ssss=String.valueOf(iiii);
                    jjjj=(iiii*100)/4;
                    ffff= (int) jjjj;
                    zzzz=String.valueOf(ffff);
                    t4.setText(ssss);
                    p4.setText(zzzz+"%");
                }
                else
                {
                    iiii--;
                    ssss=String.valueOf(iiii);
                    jjjj=(iiii*100)/4;
                    ffff= (int) jjjj;
                    zzzz=String.valueOf(ffff);
                    t4.setText(ssss);
                    p4.setText(zzzz+"%");
                }
                break;
            case R.id.c5:
            case R.id.d5:
            case R.id.e5:
            case R.id.f5:
                if (checked)
                {
                    t5=(TextView)findViewById(R.id.t5);
                    p5=(TextView)findViewById(R.id.p5);
                    i5++;
                    s5=String.valueOf(i5);
                    j5=(i5*100)/4;
                    f5= (int) j5;
                    z5=String.valueOf(f5);
                    t5.setText(s5);
                    p5.setText(z5+"%");
                }
                else
                {
                    i5--;
                    s5=String.valueOf(i5);
                    j5=(i5*100)/4;
                    f5= (int) j5;
                    z5=String.valueOf(f5);
                    t5.setText(s5);
                    p5.setText(z5+"%");
                }
                break;
            case R.id.c6:
            case R.id.d6:
            case R.id.e6:
            case R.id.f6:
                if (checked)
                {
                    t6=(TextView)findViewById(R.id.t6);
                    p6=(TextView)findViewById(R.id.p6);
                    i6++;
                    s6=String.valueOf(i6);
                    j6=(i6*100)/4;
                    f6= (int) j6;
                    z6=String.valueOf(f6);
                    t6.setText(s6);
                    p6.setText(z6+"%");
                }
                else
                {
                    i6--;
                    s6=String.valueOf(i6);
                    j6=(i6*100)/4;
                    f6= (int) j6;
                    z6=String.valueOf(f6);
                    t6.setText(s6);
                    p6.setText(z6+"%");
                }
                break;
            case R.id.c7:
            case R.id.d7:
            case R.id.e7:
            case R.id.f7:
                if (checked)
                {
                    t7=(TextView)findViewById(R.id.t7);
                    p7=(TextView)findViewById(R.id.p7);
                    i7++;
                    s7=String.valueOf(i7);
                    j7=(i7*100)/4;
                    f7= (int) j7;
                    z7=String.valueOf(f7);
                    t7.setText(s7);
                    p7.setText(z7+"%");
                }
                else
                {
                    i7--;
                    s7=String.valueOf(i7);
                    j7=(i7*100)/4;
                    f7= (int) j7;
                    z7=String.valueOf(f7);
                    t7.setText(s7);
                    p7.setText(z7+"%");
                }
                break;
            case R.id.c8:
            case R.id.d8:
            case R.id.e8:
            case R.id.f8:
                if (checked)
                {
                    t8=(TextView)findViewById(R.id.t8);
                    p8=(TextView)findViewById(R.id.p8);
                    i8++;
                    s8=String.valueOf(i8);
                    j8=(i8*100)/4;
                    f8= (int) j8;
                    z8=String.valueOf(f8);
                    t8.setText(s8);
                    p8.setText(z8+"%");
                }
                else
                {
                    i8--;
                    s8=String.valueOf(i8);
                    j8=(i8*100)/4;
                    f8= (int) j8;
                    z8=String.valueOf(f8);
                    t8.setText(s8);
                    p8.setText(z8+"%");
                }
                break;
        }
    }

}
