package io.koala.boidsim.boids;


import io.koala.boidsim.gfx.RenderContext;
import io.koala.boidsim.gfx.Shader;

/**
 * Created by kaleb on 11/20/2016.
 */

public interface GLCallback {

    void init();

    void preDrawFrame(RenderContext rc);

    void postDrawFrame(RenderContext rc);

    void onDrawFrame(RenderContext rc);

    void attachShader(Shader shader);
}
