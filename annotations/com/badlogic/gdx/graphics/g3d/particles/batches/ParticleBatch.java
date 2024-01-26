package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderData;
import f.Lc;
import f.fQ;
import f.sz0;
import f.tk;

public interface ParticleBatch extends tk, ResourceData.Configurable {
  void begin();
  
  void draw(ParticleControllerRenderData paramParticleControllerRenderData);
  
  void end();
  
  void save(sz0 paramsz0, ResourceData paramResourceData);
  
  void load(sz0 paramsz0, ResourceData paramResourceData);
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/batches/ParticleBatch.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */