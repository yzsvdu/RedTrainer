package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;

public class BillboardRenderer extends ParticleControllerRenderer {
  public BillboardRenderer() {
    this();
    BillboardControllerRenderData billboardControllerRenderData;
    super(this);
  }
  
  public BillboardRenderer(BillboardParticleBatch paramBillboardParticleBatch) {
    this();
    setBatch((ParticleBatch)paramBillboardParticleBatch);
  }
  
  public void allocateChannels() {
    this.renderData.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
    ((BillboardControllerRenderData)this.renderData).regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion, (ParallelArray.ChannelInitializer)ParticleChannels.TextureRegionInitializer.get());
    ((BillboardControllerRenderData)this.renderData).colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color, (ParallelArray.ChannelInitializer)ParticleChannels.ColorInitializer.get());
    ((BillboardControllerRenderData)this.renderData).scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Scale, (ParallelArray.ChannelInitializer)ParticleChannels.ScaleInitializer.get());
    ((BillboardControllerRenderData)this.renderData).rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D, (ParallelArray.ChannelInitializer)ParticleChannels.Rotation2dInitializer.get());
  }
  
  public ParticleControllerComponent copy() {
    return new BillboardRenderer((BillboardParticleBatch)this.batch);
  }
  
  public boolean isCompatible(ParticleBatch paramParticleBatch) {
    return paramParticleBatch instanceof BillboardParticleBatch;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/renderers/BillboardRenderer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */