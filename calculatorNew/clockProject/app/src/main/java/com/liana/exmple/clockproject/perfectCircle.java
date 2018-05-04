package com.liana.exmple.clockproject;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.DisplayMetrics;


/**
 * Created by Liana on 19/11/2017.
 */

public class perfectCircle {
    private int y, x , center_x , center_y  = 0;
    private int padding = 0;
    private int numeralSpacing = 0;
    private int radius;

    public perfectCircle (){
        //to get the size of the screen
        int x= Resources.getSystem().getDisplayMetrics().widthPixels;
        int y=Resources.getSystem().getDisplayMetrics().heightPixels;




        // center point
        center_x = x / 2  ;
        center_y = y/ 2;

        padding = numeralSpacing + 50;
        int min = Math.min(x, y);
        radius = min / 2 - padding;
    }


    // two point on  a circle

    public int getX1 () {
        return  center_x ;}

    public int getY1 ()
    {
        int y1 = radius + center_y - padding ;
        return  y1 ;

    }

    public int getX2 () {
        int x2 = radius + center_x -padding ;
        return  x2  ;}

    public int getY2 ()
    {
        return  center_y ;
    }

}
