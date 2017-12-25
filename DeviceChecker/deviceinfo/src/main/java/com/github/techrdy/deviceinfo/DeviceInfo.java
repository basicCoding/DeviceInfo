package com.github.techrdy.deviceinfo;

import android.content.Context;
import android.os.Build;

/**
 * Created by witsawa on 12/25/2017 AD.
 */

public class DeviceInfo {

    private Context context;
    private MemoryChecker memoryChecker;

    public DeviceInfo(Context context) {

        this.context = context;
        this.memoryChecker = new MemoryChecker(context);

    }

    public String getTotalRam(){
        return memoryChecker.totalRamMemorySize()+"";
    }

    public String getFreeRam(){
        return memoryChecker.freeRamMemorySize()+"";
    }

    public String getUsedRam(){
        return (memoryChecker.totalRamMemorySize() - memoryChecker.freeRamMemorySize())+"";
    }

    public String getAndroidVersion(){
        return Build.VERSION.SDK_INT+"";
    }

    public String getBrand(){
        return Build.BRAND+"";
    }

    public String getDevice(){
        return Build.DEVICE+"";
    }

    public String getModel(){
        return Build.MODEL+"";
    }

    public String getProcessorCore(){
        return memoryChecker.getCpuCore()+"";
    }


}
