package com.iyoker.mytest1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
   private Button btn_click;
   private EditText et_number;
    private Button mBtn1;
    private EditText editText;
    private Button dial;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.dial = (Button) findViewById(R.id.dial);
        this.editText = (EditText) findViewById(R.id.editText);
        et_number = (EditText) MainActivity.this.findViewById(R.id.editText);

        Button btn_dial= (Button) findViewById(R.id.dial);
       // btn_dial.setOnClickListener(new MyListener());
        btn_dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callMe();
            }
        });
        Button btn_tv =(Button) findViewById(R.id.dial);
        mBtn = (Button) findViewById(R.id.dial);
        // TODO: 2016/9/2  
        // FIXME: 2016/9/2
        for (int i = 0; i < 10; i++) {
            i=i=2;
            i++;
        }

    //辅导费发送
    }
    private class MyListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            callMe();

        }


    }
    private void callMe() {
        String number = et_number.getText().toString().trim();
        if (TextUtils.isEmpty(number)){
            Toast.makeText(MainActivity.this, "号码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+number));
        startActivity(intent);
    }


}
