package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.g3d.particles.ParticleShaderExt;
import f.R40;

public class PointSpriteParticleBatchExt extends PointSpriteParticleBatch {
  public PointSpriteParticleBatchExt(int paramInt, ParticleShaderExt.Config paramConfig) {
    super(paramInt);
    this.renderable.Yc.dispose();
    this.renderable.Yc = (R40)new ParticleShaderExt(this.renderable, paramConfig);
    this.renderable.Yc.init();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/batches/PointSpriteParticleBatchExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */