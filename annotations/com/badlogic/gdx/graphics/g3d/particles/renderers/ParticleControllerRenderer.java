package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;

public abstract class ParticleControllerRenderer extends ParticleControllerComponent {
  public ParticleBatch batch;
  
  public ParticleControllerRenderData renderData;
  
  public ParticleControllerRenderer() {}
  
  public ParticleControllerRenderer(ParticleControllerRenderData paramParticleControllerRenderData) {
    this.renderData = paramParticleControllerRenderData;
  }
  
  public void update() {
    this.batch.draw(this.renderData);
  }
  
  public boolean setBatch(ParticleBatch paramParticleBatch) {
    if (isCompatible(paramParticleBatch)) {
      this.batch = paramParticleBatch;
      return true;
    } 
    return false;
  }
  
  public abstract boolean isCompatible(ParticleBatch paramParticleBatch);
  
  public void set(ParticleController paramParticleController) {
    super.set(paramParticleController);
    ParticleControllerRenderData particleControllerRenderData;
    if ((particleControllerRenderData = this.renderData) != null)
      particleControllerRenderData.controller = this.controller; 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/renderers/ParticleControllerRenderer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */