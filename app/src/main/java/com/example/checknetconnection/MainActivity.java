package com.example.checknetconnection;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import java.net.NetworkInterface;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkConnection();
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void checkConnection(){
        ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork=manager.getActiveNetworkInfo();
        if(null!=activeNetwork){
            if(activeNetwork.getType()==ConnectivityManager.TYPE_WIFI){
                Toast.makeText(this,"WiFi Enabled",Toast.LENGTH_SHORT).show(); }
          else  if(activeNetwork.getType()==ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(this,"Data Network Enabled",Toast.LENGTH_SHORT).show(); } }
        else{
            Toast.makeText(this,"No Internet Connection",Toast.LENGTH_SHORT).show(); } }}