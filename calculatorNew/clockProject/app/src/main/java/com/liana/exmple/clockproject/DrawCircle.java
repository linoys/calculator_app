package com.liana.exmple.clockproject;

        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.support.annotation.Nullable;
        import android.util.AttributeSet;
        import android.util.DisplayMetrics;
        import android.util.TypedValue;
        import android.view.View;

/**
 * Created by Liana on 13/11/2017.
 */

public class DrawCircle extends View {

    private int y, x , center_x , center_y  = 0;
    private int padding = 0;
    private int numeralSpacing = 0;
    private int radius;
    private  ClientCircle client ;

    public DrawCircle(Context context, AttributeSet attrs) {
        super(context);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawCircle(canvas);
        postInvalidateDelayed(500);
        invalidate();



    }

    public void drawCircle (Canvas canvas){
        //to get the size of the screen
        x = getWidth();
        y = getHeight();

        // center point
        center_x = x / 2 ;
        center_y = y/ 2 ;

        // draw circle
        padding = numeralSpacing + 50;
        int min = Math.min(x, y);
        radius = min / 2 - padding;
        Paint myPaint = new Paint();
        myPaint.reset();
        myPaint.setColor(Color.WHITE);
        myPaint.setStrokeWidth(5);
        myPaint.setStyle(Paint.Style.STROKE);

        canvas.drawColor(Color.BLACK);
        canvas.drawCircle(center_x , center_y , radius + padding -10 , myPaint );

        drawCircle(canvas);

    }

    public void drawPoint (Canvas canvas){
        int x1 , y1 , x2 , y2 = 0 ;
        y1 = radius + center_y ;
        x1 = center_x ;

        y2 = center_y ;
        x2 = radius + center_x ;
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(x1 , y1 , 50 , paint);
        canvas.drawCircle(x2 , y2 , 50 , paint);
    }


}


