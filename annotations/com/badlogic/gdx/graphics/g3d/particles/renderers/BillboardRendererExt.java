package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannelsExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;

public class BillboardRendererExt extends ParticleControllerRenderer {
  public BillboardRendererExt() {
    this();
    BillboardControllerRenderData billboardControllerRenderData;
    super(this);
  }
  
  public BillboardRendererExt(BillboardParticleBatchExt paramBillboardParticleBatchExt) {
    this();
    setBatch((ParticleBatch)paramBillboardParticleBatchExt);
  }
  
  public void allocateChannels() {
    this.renderData.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
    ((BillboardControllerRenderData)this.renderData).regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion, (ParallelArray.ChannelInitializer)ParticleChannels.TextureRegionInitializer.get());
    ((BillboardControllerRenderData)this.renderData).colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color, (ParallelArray.ChannelInitializer)ParticleChannels.ColorInitializer.get());
    ((BillboardControllerRenderData)this.renderData).scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannelsExt.ScaleXY, (ParallelArray.ChannelInitializer)ParticleChannelsExt.ScaleXYInitializer.get());
    ((BillboardControllerRenderData)this.renderData).rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D, (ParallelArray.ChannelInitializer)ParticleChannels.Rotation2dInitializer.get());
  }
  
  public ParticleControllerComponent copy() {
    return new BillboardRendererExt((BillboardParticleBatchExt)this.batch);
  }
  
  public boolean isCompatible(ParticleBatch paramParticleBatch) {
    return paramParticleBatch instanceof BillboardParticleBatchExt;
  }
  
  public BillboardParticleBatchExt getBatch() {
    return (BillboardParticleBatchExt)this.batch;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/renderers/BillboardRendererExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */