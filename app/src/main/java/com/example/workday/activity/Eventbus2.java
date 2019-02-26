package com.example.workday.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.workday.R;
import com.example.workday.base.PagerBase;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Eventbus2 extends AppCompatActivity {

    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.tv2)
    EditText tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventbus2);
        ButterKnife.bind(this);
        pool();

    }

    private void pool() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new base(tv2.getText().toString()));
                finish();
            }
        });
    }
}
