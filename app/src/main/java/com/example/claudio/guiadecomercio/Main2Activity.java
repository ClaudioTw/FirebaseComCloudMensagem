package com.example.claudio.guiadecomercio;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) ;
        {
            NotificationManager mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

            NotificationChannel mChannel = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mChannel = new NotificationChannel(Constants.CHANNEL_ID,
                                Constants.CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mChannel.setDescription(Constants.CHANNEL_DESCRIPTION);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mChannel.enableLights(true);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mChannel.setLightColor(Color.RED);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mChannel.enableVibration(true);
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mNotificationManager.createNotificationChannel(mChannel);
            }
        }
    }
}
