package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener{

    private Button btnsign;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsign = (Button) findViewById(R.id.signButton);
        imageButton = (ImageButton) findViewById(R.id.touchID);

        btnsign.setOnClickListener(this);
        imageButton.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent webview = new Intent(MainActivity.this, Webview.class);
        startActivity(webview);
        finish();

    }

    @Override
    public boolean onLongClick(View view) {
        Intent webviewimage = new Intent(MainActivity.this, Webview.class);
        startActivity(webviewimage);
        return false;
    }
}
