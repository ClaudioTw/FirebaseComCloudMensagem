package com.example.claudio.guiadecomercio;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by claudio on 19/02/18.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        String title = remoteMessage.getNotification().getTitle();
        String body = remoteMessage.getNotification().getBody();

        MyNotififcationManager.getInstance(getApplicationContext())
                .displayNotification(title, body);

    }
}
