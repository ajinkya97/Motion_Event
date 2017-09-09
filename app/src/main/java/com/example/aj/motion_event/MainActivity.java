package com.example.aj.motion_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    float x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=(TextView)findViewById(R.id.textview);
        textview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                    x=event.getX();
                    y=event.getY();
                int action=event.getActionMasked();
                switch (action)
                {
                    case MotionEvent.ACTION_DOWN:
                    textview.setText("Down");
                    return true;

                    case MotionEvent.ACTION_UP:
                        textview.setText("UP");
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        textview.setText(""+x);
                        textview.setText(""+y);
                        return true;

                    case MotionEvent.ACTION_POINTER_UP:
                        textview.setText("Pointer Up");
                        return true;

                    case MotionEvent.ACTION_POINTER_DOWN:
                        textview.setText("Pointer Down");
                        return true;

                    default:return false;

                }
            }
        });

    }
}
