package com.example.hw06;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.MainThread;

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback{

    private MainThread thread;

    public GamePanel (Context context){

        super(context);
        getHolder().addCallback(this);

        thread = new MainThread(getHolder(),this);

        setFocusable(true);

    }

    @Override
    public void surfaceChanged (SurfaceHolder holder, int format, int width, int height){


    }

    @Override
    public void surfaceCreated (SurfaceHolder holder){

        thread = new MainThread(getHolder(), this);
        thread.setRunning(true);
        thread.start();

    }

}
