package com.splice.rifatrashid.circlepong;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by Reefer on 6/12/15.
 */
public class paddle {

    private int x, y, width, height, arcLength;
    private double degree;
    private Paint paint;
    private RectF rectF;

    public paddle(int x, int y, int width, int height, double degree, int arcLength) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.degree = degree;
        this.arcLength = arcLength;

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#16a085"));
        paint.setStrokeWidth(12.0f);
        rectF = new RectF(this.x, this.y, this.width, this.height);
    }

    public void Draw(Canvas canvas) {
        canvas.drawArc(rectF, (int)this.degree, this.arcLength, false, paint);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public double getDegree() {
        return this.degree;
    }

    public int getArcLength() {
        return this.arcLength;
    }

    public double getMaxDegree() {
        if (degree >= 360) {
            degree = degree - 360;
        }
        return degree + getArcLength()+5;
    }

    public double getMinDegree() {
        if (degree >= 360) {
            degree = degree - 360;
        }
        return degree-5;
    }

    public void setPaint(Paint paint){
        this.paint = paint;
    }

    public void setStroke(int stroke){
        this.paint.setStrokeWidth(stroke);
    }

    public void setArcLength(int arcLength){
        this.arcLength = arcLength;
    }
}
