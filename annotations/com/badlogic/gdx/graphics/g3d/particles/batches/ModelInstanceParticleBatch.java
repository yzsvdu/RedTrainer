package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ModelInstanceControllerRenderData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderData;
import f.Hc0;
import f.Lc;
import f.Tb;
import f.fQ;
import f.sz0;

public class ModelInstanceParticleBatch implements ParticleBatch {
  public fQ controllersRenderData;
  
  public int bufferedParticlesCount;
  
  public ModelInstanceParticleBatch() {
    fQ fQ1;
    this(false, 5);
    this.controllersRenderData = this;
  }
  
  public void getRenderables(fQ paramfQ, Lc paramLc) {
    Hc0 hc0 = this.controllersRenderData.r30();
    while (hasNext()) {
      byte b = 0;
      ModelInstanceControllerRenderData modelInstanceControllerRenderData;
      int i = ((ParticleControllerRenderData)(modelInstanceControllerRenderData = (ModelInstanceControllerRenderData)next())).controller.particles.size;
      while (b < i) {
        ((Tb[])modelInstanceControllerRenderData.modelInstanceChannel.data)[b].getRenderables(paramfQ, paramLc);
        b++;
      } 
    } 
  }
  
  public int getBufferedCount() {
    return this.bufferedParticlesCount;
  }
  
  public void begin() {
    this.controllersRenderData.clear();
    this.bufferedParticlesCount = 0;
  }
  
  public void end() {}
  
  public void draw(ModelInstanceControllerRenderData paramModelInstanceControllerRenderData) {
    this.controllersRenderData.Com3(paramModelInstanceControllerRenderData);
    this.bufferedParticlesCount += ((ParticleControllerRenderData)paramModelInstanceControllerRenderData).controller.particles.size;
  }
  
  public void save(sz0 paramsz0, ResourceData paramResourceData) {}
  
  public void load(sz0 paramsz0, ResourceData paramResourceData) {}
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/batches/ModelInstanceParticleBatch.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */