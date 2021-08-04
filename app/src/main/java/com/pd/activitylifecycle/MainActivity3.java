package com.pd.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URLConnection;

public class MainActivity3 extends AppCompatActivity {

    Button btn_url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );

        EditText ed_url = (EditText) findViewById( R.id.edurl );
        ed_url.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url1 = ed_url.getText().toString();
                Intent inte2 = new Intent( Intent.ACTION_VIEW, Uri.parse( url1 ) );
                startActivity( inte2 );

            }
        } );

        btn_url = (Button) findViewById( R.id.btn_url );
        btn_url.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view == btn_url) {
                    // String url = ed_url.getText().toString();
                    Intent imp = new Intent( Intent.ACTION_VIEW ).setData( Uri.parse( "https://www.google.com" ) );
                    startActivity( imp );
                }
            }

            ;



      /*  Intent intent = getIntent();

    }
    // Explicit Intent

    @Override
    public void onClick(View view) {

      / Intent int3 = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(int3);
    }*/

        } );
    }
}