package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import f.JU;

public class ParticleControllerControllerRenderer extends ParticleControllerRenderer {
  public ParallelArray.ObjectChannel controllerChannel;
  
  public void init() {
    if ((this.controllerChannel = (ParallelArray.ObjectChannel)this.controller.particles.getChannel(ParticleChannels.ParticleController)) != null)
      return; 
    throw new JU("ParticleController channel not found, specify an influencer which will allocate it please.");
  }
  
  public void update() {
    byte b = 0;
    int i = this.controller.particles.size;
    while (b < i) {
      ((ParticleController[])this.controllerChannel.data)[b].draw();
      b++;
    } 
  }
  
  public ParticleControllerComponent copy() {
    return new ParticleControllerControllerRenderer();
  }
  
  public boolean isCompatible(ParticleBatch paramParticleBatch) {
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/renderers/ParticleControllerControllerRenderer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */