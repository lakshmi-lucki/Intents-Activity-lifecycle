package com.pd.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button Btn_23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        Btn_23 = (Button) findViewById( R.id.btn_23 );
        Btn_23.setOnClickListener( this );

        Intent getintent = getIntent();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v( "OnStart2", "I'm inside the OnStart Method" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v( "OnResume2", "I'm inside the Resume Method" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v( "OnPause2", "I'm inside the OnPause Method" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v( "OnStop2", "I'm inside the OnStop Method" );

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v( "OnRestart2", "I'm inside the OnRestart Method" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v( "OnDestroy2", "I'm inside the OnDestroy Method" );
    }

    @Override
    public void onClick(View view) {

        Intent int2 = new Intent( MainActivity2.this, MainActivity3.class );
        startActivity( int2 );


    }
}