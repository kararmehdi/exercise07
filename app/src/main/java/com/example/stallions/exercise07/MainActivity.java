package com.example.stallions.exercise07;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener  {
    Button button7,button8,button9,button4,button5,button6,button1,button2,button3,button0,plus,equals;
    TextView result;
    String output2 = "";
    Values value = new Values();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         button7 =(Button)findViewById(R.id.button7);
       button8 =(Button)findViewById(R.id.button8);
         button9 =(Button)findViewById(R.id.button9);
        button4 =(Button)findViewById(R.id.button4);
         button5 =(Button)findViewById(R.id.button5);
         button6 =(Button)findViewById(R.id.button6);
       button1 =(Button)findViewById(R.id.button1);
         button2 =(Button)findViewById(R.id.button2);
         button3 =(Button)findViewById(R.id.button3);
         button0 =(Button)findViewById(R.id.button0);
      plus =(Button)findViewById(R.id.plus);
         equals =(Button)findViewById(R.id.result);
         result = (TextView)findViewById(R.id.output);


        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button0.setOnClickListener(this);
        plus.setOnClickListener(this);
        equals.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.button7:
                 this.output2=output2.concat("7");


                result.setText(output2);
                break;

            case R.id.button8:
                this.output2=output2.concat("8");

                result.setText(output2);


                break;
            case R.id.button9:
                this.output2=output2.concat("9");
                result.setText(output2);
                break;
            case R.id.button4:
                this.output2=output2.concat("4");
                result.setText(output2);
                break;
            case R.id.button5:
                this.output2=output2.concat("5");
                result.setText(output2);
                break;
            case R.id.button6:
                this.output2=output2.concat("6");
                result.setText(output2);
                break;
            case R.id.button1:
                this.output2=output2.concat("1");
                result.setText(output2);
                break;
            case R.id.button2:
                this.output2=output2.concat("2");
                result.setText(output2);
                break;
            case R.id.button3:
                this.output2=output2.concat("3");
                result.setText(output2);
                break;

            case R.id.button0:
                this.output2=output2.concat("0");
                result.setText(output2);
                break;

            case R.id.plus:
                this.output2=output2.concat("+");
                result.setText(output2);

                break;

            case R.id.result:
                    String finalresult = this.output2;
                value.getnumber(finalresult);

                int i = Integer.valueOf(value.add());
                    result.setText(Integer.toString(value.add()));
                this.output2= Integer.toString(i);

                    break;

        }
    }
}
