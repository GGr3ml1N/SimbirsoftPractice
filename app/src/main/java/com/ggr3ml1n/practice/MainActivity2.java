package com.ggr3ml1n.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Lambda myClosure = new Lambda();
        Lambda.Operationable operation = () -> Log.d("Lambda", "I Love Java!");
        myClosure.repeatTask(10, operation);

        Directions up = Directions.UP;
        Directions left = Directions.LEFT;
        Directions down = Directions.DOWN;
        Directions right = Directions.RIGHT;
        Coordinate x = new Coordinate(0.0,0.0);
        Directions.move(up, up, left, down, left, down, down, right, right, down, right);
        x.setY(0.0);
        x.setX(0.0);
        Coordinate newLocation =  Directions.move(x, up);
        Log.d("Direction", "new location is " + newLocation);
    }
}