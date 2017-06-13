package com.example.coblan.app4;


import android.os.Bundle;

public class MainActivity extends MyWebViewActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setURL("http://192.168.1.101:8080/wx/home.wx");
//        setURL("http://192.168.1.101:8080/static/test.html");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}