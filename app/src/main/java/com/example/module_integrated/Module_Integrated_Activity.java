package com.example.module_integrated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a12053.voicectroller.VoiceCtrollerMainActivity;
import com.example.mybuletoothble.BuletoothMainActivity;

public class Module_Integrated_Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn_buletooth_shift;
    Button btn_voice_ctroller_shift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_integrated);
        initView();
    }

    private void initView() {
     btn_buletooth_shift = (Button)findViewById(R.id.btn_buletooth_shift);
     btn_voice_ctroller_shift = (Button)findViewById(R.id.btn_voice_ctroller_shift);
     btn_buletooth_shift.setOnClickListener(this);
     btn_voice_ctroller_shift.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_buletooth_shift:
                //跳转到蓝牙界面
                startActivity(new Intent(this, BuletoothMainActivity.class));
                break;
            case R.id.btn_voice_ctroller_shift:
                //跳转到语音界面
                startActivity(new Intent(this, VoiceCtrollerMainActivity.class));
                break;
        }

    }
}
