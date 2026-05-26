package com.example.flashlight;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class flashlight extends AppCompatActivity {

    private ToggleButton flashLightButton;

    private CameraManager cameraManager;

    private String cameraid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashlight);

        flashLightButton = findViewById(R.id.flashLightButton);

        boolean hasFlash = getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if(!hasFlash){
            Toast.makeText(this, "No flashlight detected on this device!", Toast.LENGTH_SHORT).show();
            flashLightButton.setEnabled(false);
            return;
        }

        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            cameraid = cameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

        flashLightButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
                    toggleFlash(isChecked);
            }
        });
    }

    private void toggleFlash(boolean isOn){
        try {
            cameraManager.setTorchMode(cameraid, isOn);
        } catch (CameraAccessException e) {
            Toast.makeText(this, "Error accessing camera", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        try {
            if (cameraid != null) {
                cameraManager.setTorchMode(cameraid, false);
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }
}
