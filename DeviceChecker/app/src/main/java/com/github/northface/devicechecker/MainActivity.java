package com.github.northface.devicechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.techrdy.deviceinfo.DeviceInfo;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.message);


        DeviceInfo deviceInfo = new DeviceInfo(this);

        String ramInfo = "RAM Information\n";
        ramInfo += "\tTotal :" + deviceInfo.getTotalRam() + "\n";
        ramInfo += "\tfree :" + deviceInfo.getFreeRam() + "\n";
        ramInfo += "\tused :" + deviceInfo.getUsedRam()+ "\n";


        String andInfo = "Android Version :" + deviceInfo.getAndroidVersion() + "\n";
        andInfo += "Brand :" + deviceInfo.getBrand() + "\n";
        andInfo += "Device :" + deviceInfo.getDevice() + "\n";
        andInfo += "Model :" + deviceInfo.getModel() + "\n";

        String cpu = "CPU Core" + deviceInfo.getProcessorCore() +"";

        String message = ramInfo + "\n"+ andInfo + "\n" + cpu;
        textView.setText(message);
    }


}
