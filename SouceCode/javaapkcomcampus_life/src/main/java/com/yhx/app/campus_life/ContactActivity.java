package com.yhx.app.campus_life;

import com.yhx.app.campus_life.R.id;
import com.yhx.app.service.MyApplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactActivity extends Activity implements View.OnClickListener {
    private TextView title;
    private Button btn_back;
    private ImageView contact;
    private MyApplication myApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        myApplication = (MyApplication) this.getApplicationContext();
        myApplication.addActivity(this);

        title = (TextView) this.findViewById(id.title_tv1);
        title.setText("联系我们");

        //返回按钮
        btn_back = (Button) this.findViewById(id.button_back1);
        btn_back.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case id.button_back1:
                ContactActivity.this.finish();
                break;
        }
    }

}
