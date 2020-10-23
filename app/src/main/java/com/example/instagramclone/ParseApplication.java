package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("N0TJdadaafUOQp5MVnAX5UoKDlNclHgkMyEHHEG2")
                .clientKey("eXQ04sSa4PNbhAqwZpOozUk8l1Oldbd7JKmXezxe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}



