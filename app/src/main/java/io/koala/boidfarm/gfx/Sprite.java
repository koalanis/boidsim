package io.koala.boidfarm.gfx;


import io.koala.boidfarm.boids.GLCallback;
import io.koala.boidfarm.boids.RenderTarget;

/**
 * Created by kaleb on 28/10/16.
 */

public class Sprite extends RenderTarget implements GLCallback {
    float width;
    float height;

    int texture;

    public Sprite() {
        super(Graphics.getUnitTexturedSquareVertices(), Graphics.getUnitTexturedSquareIndices());
    }

    @Override
    public void preDrawFrame(RenderContext rc) {

    }



}
