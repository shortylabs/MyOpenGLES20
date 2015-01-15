package com.shortylabs.myopengles20;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Could be inner class of OpenGLES20Activity
 * Need this subclass to override onTouchEvent()
 * Created by Jeri on 1/14/15.
 */
public class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        mRenderer = new MyGLRenderer();

        init();
    }

    private void init() {
        // Create an OpenGL 2.0 context
        setEGLContextClientVersion(2);


        setRenderer(mRenderer);

        // render the view only when there is a change in the drawing data
        // view will be redrawm when requestRender() is called
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);


    }
}
