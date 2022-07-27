package com.rnflicmodule;
import android.util.Log;

import androidx.annotation.NonNull;
import io.flic.flic2libandroid.Flic2Button

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class RNFlicModule extends ReactContextBaseJavaModule {
    RNFlicModule(ReactApplicationContext context) {
        super(context);
    }

    @ReactMethod
    public void logEvent(String name, String location) {
        Log.d("CalendarModule", "Create event called with name: " + name
                + " and location: " + location);
    }

    @NonNull
    @Override
    public String getName() {
        return "RNFlicModule";
    }
}
