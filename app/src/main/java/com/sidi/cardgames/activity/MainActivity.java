package com.sidi.cardgames.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.sidi.cardgames.R;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.sidi.cardgames.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    public void playPatience(View view) {

        Intent intent = new Intent(this, PatienceActivity.class);
        startActivity(intent);

    }
}
