package com.liana.exmple.clockproject;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;

import android.view.View;
import android.graphics.Canvas;
import android.widget.Toast;

public class ClientCircle extends View {



        public int width;
        public int hight;
        public Bitmap mBitmap = null;
        public android.graphics.Canvas mCanvas;
        public Path mPath;
        private float mX, mY;
        private Paint mPaint;
        public static final float TOLERANCE = 5;
        public Context context;
        public int x1 ;
        public int y1 ;
        public int x2 ;
        public int y2 ;
        private Paint paint ;
        private perfectCircle circle ;
        private static boolean isDraw = true ;


        public ClientCircle(Context context,  AttributeSet attrs) {
            super(context, attrs);
            this.context = context;
            mPath = new Path();
            mPaint = new Paint();
            mPaint.setColor(Color.BLACK);
            mPaint.setStyle(Paint.Style.STROKE);
            mPaint.setStrokeJoin(Paint.Join.ROUND);
            mPaint.setStrokeWidth(4f);
            circle = new perfectCircle();
            x1 = circle.getX1();
            y1 = circle.getY1();
            x2= circle.getX2();
            y2 = circle.getY2();


        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            mBitmap = Bitmap.createBitmap(w, h , Bitmap.Config.ARGB_8888);
            mCanvas = new android.graphics.Canvas(mBitmap);
        }

        public void clear(){
            mPath.reset();
            invalidate();
        }

        private void startTouch(float x, float y){
            mPath.moveTo(x,y);
            mX = x;
            mY = y;
        }

        private void moveTouch(float x, float y){
            float dx = Math.abs(x - mX);
            float dy = Math.abs(y - mY);
            if(dx >= TOLERANCE || dy>= TOLERANCE){
                mPath.quadTo(mX, mY, (x + mX)/ 2, (y + mY)/ 2);
                mX= x;
                mY = y;
            }
        }


        private void upTouch(){
            mPath.lineTo(mX, mY);
        }

    @Override
        protected void onDraw(Canvas canvas ) {
            super.onDraw(canvas);
            canvas.drawPath(mPath,mPaint);

            // draw two points from perfect circle
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStrokeWidth(5);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(x1 , y1 , 20 , paint);
            canvas.drawCircle(x2 , y2 , 20 , paint);

        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            float touchX = event.getX();
            float touchY = event.getY();
            if (isDraw) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        startTouch(touchX, touchY);
                        invalidate();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        moveTouch(touchX, touchY);
                        invalidate();
                        break;
                    case MotionEvent.ACTION_UP:
                        upTouch();
                        invalidate();
                        break;
                    default:
                        return false;
                }
                return true;
            }
            return  false ;
        }

    public void check() {
            isDraw = false;
            Toast.makeText(context , "finish" , Toast.LENGTH_LONG);

        return
                ;
    }


}





