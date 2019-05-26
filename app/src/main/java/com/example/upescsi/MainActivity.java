package com.example.upescsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import  com.facebook.login.LoginManager;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FacebookSdk.setApplicationId("1303933753107188");
        FacebookSdk.sdkInitialize(this.getApplicationContext());
        intent = new Intent(getApplicationContext(), fbLogin.class);


    Toast.makeText(getApplicationContext(),AccessToken.getCurrentAccessToken()+"",Toast.LENGTH_SHORT).show();
        if (AccessToken.getCurrentAccessToken() == null) {
            goLoginScreen();
        }

    }

    public void goLoginScreen() {

       //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

   /* public void logout(View view) {
        LoginManager.getInstance().logOut();
        goLoginScreen();
    }
    */
}
