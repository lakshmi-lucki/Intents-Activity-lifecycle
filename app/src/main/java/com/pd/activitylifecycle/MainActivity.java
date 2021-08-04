package com.pd.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button btn_next, btn_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Log.v( "OnCreate1", "I'm inside the OnCreate Method" );

        btn_next = (Button) findViewById( R.id.btn_nxt );
        btn_next.setOnClickListener( this );
        btn_three = (Button) findViewById( R.id.btn_three );
        btn_three.setOnClickListener( this );

        Intent intent = getIntent();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v( "OnStart1", "I'm inside the OnStart Method" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v( "OnResume1", "I'm inside the Resume Method" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v( "OnPause1", "I'm inside the OnPause Method" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v( "OnStop1", "I'm inside the OnStop Method" );

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v( "OnRestart1", "I'm inside the OnRestart Method" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v( "OnDestroy1", "I'm inside the OnDestroy Method" );
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_nxt:
                Intent intent = new Intent( MainActivity.this, MainActivity2.class );
                startActivity( intent );
                break;

            case R.id.btn_three:
                Intent intent2 = new Intent( MainActivity.this, MainActivity3.class );
                startActivity( intent2 );
                break;
        }

    }
}