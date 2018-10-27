package com.example.akacq.knowledgesuite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_Question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_Question).setVisibility(View.INVISIBLE);
            }
        });
    }


}
