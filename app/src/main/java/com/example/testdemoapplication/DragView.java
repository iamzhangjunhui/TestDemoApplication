package com.example.testdemoapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DragView extends View {
    private Point assistantPoint = new Point(150, 150);

    public DragView(Context context) {
        super(context);
    }

    public DragView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DragView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(12);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        Path path = new Path();
        path.moveTo(200, 200);
        path.quadTo(assistantPoint.x, assistantPoint.y, 320, 320);
        canvas.drawPath(path, paint);
        canvas.drawPoint(assistantPoint.x,assistantPoint.y,paint);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                assistantPoint.x= (int) event.getX();
                assistantPoint.y= (int) event.getY();
                //重新绘制视图
                invalidate();
        }
        //这里需要返回true，代表该view消费了onTouch事件，如果返回super方法的话还会继续传给父级View
        return true;

    }
}
