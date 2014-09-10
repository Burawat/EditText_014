package com.example.resume_014;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
public class MainActivity extends Activity implements OnClickListener {
private Button btn1, btn2;
private TextView txt1, txt2, txt3, txt4, txt5;
private String show1,show2,show3,show4,show5;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
ViewMatching();
}
private void ViewMatching() {
btn1 = (Button) findViewById(R.id.btnsave);
btn2 = (Button) findViewById(R.id.btnimg);
btn1.setOnClickListener(this);
btn2.setOnClickListener(this);
txt1 = (TextView) findViewById(R.id.txt1);
txt2 = (TextView) findViewById(R.id.txt2);
txt3 = (TextView) findViewById(R.id.txt3);
txt4 = (TextView) findViewById(R.id.txt4);
txt5 = (TextView) findViewById(R.id.txt5);

txt1.setText("golf");
txt2.setText("21");
txt3.setText("65");
txt4.setText("183");
txt5.setText("0851586105");
 
show1 = getIntent().getStringExtra("txt1");
show2 = getIntent().getStringExtra("txt2");
show3 = getIntent().getStringExtra("txt3");
show4 = getIntent().getStringExtra("txt4");
show5 = getIntent().getStringExtra("txt5");

txt1.setText(show1);
txt2.setText(show2);
txt3.setText(show3);
txt4.setText(show4);
txt5.setText(show5);

}
@Override
public void onClick(View v) {
switch (v.getId()) {
case R.id.btnsave:
Intent i = new Intent(getApplicationContext(), edit_golf.class);
startActivity(i);
break;
case R.id.btnimg:
Intent j = new Intent(getApplicationContext(),ImageActivity.class);
startActivity(j);
break;
default:
break;
  }
 }
}