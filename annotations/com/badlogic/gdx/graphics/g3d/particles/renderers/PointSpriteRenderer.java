package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.batches.PointSpriteParticleBatch;

public class PointSpriteRenderer extends ParticleControllerRenderer {
  public PointSpriteRenderer() {
    this();
    PointSpriteControllerRenderData pointSpriteControllerRenderData;
    super(this);
  }
  
  public PointSpriteRenderer(PointSpriteParticleBatch paramPointSpriteParticleBatch) {
    this();
    setBatch((ParticleBatch)paramPointSpriteParticleBatch);
  }
  
  public void allocateChannels() {
    this.renderData.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
    ((PointSpriteControllerRenderData)this.renderData).regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion, (ParallelArray.ChannelInitializer)ParticleChannels.TextureRegionInitializer.get());
    ((PointSpriteControllerRenderData)this.renderData).colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color, (ParallelArray.ChannelInitializer)ParticleChannels.ColorInitializer.get());
    ((PointSpriteControllerRenderData)this.renderData).scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Scale, (ParallelArray.ChannelInitializer)ParticleChannels.ScaleInitializer.get());
    ((PointSpriteControllerRenderData)this.renderData).rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D, (ParallelArray.ChannelInitializer)ParticleChannels.Rotation2dInitializer.get());
  }
  
  public boolean isCompatible(ParticleBatch paramParticleBatch) {
    return paramParticleBatch instanceof PointSpriteParticleBatch;
  }
  
  public ParticleControllerComponent copy() {
    return new PointSpriteRenderer((PointSpriteParticleBatch)this.batch);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/renderers/PointSpriteRenderer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */