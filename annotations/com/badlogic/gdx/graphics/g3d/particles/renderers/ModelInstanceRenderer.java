package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ModelInstanceParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import f.T0;
import f.Tb;
import f.qo;
import f.zc;

public class ModelInstanceRenderer extends ParticleControllerRenderer {
  private boolean hasColor;
  
  private boolean hasScale;
  
  private boolean hasRotation;
  
  public ModelInstanceRenderer() {
    this();
    ModelInstanceControllerRenderData modelInstanceControllerRenderData;
    super(this);
  }
  
  public ModelInstanceRenderer(ModelInstanceParticleBatch paramModelInstanceParticleBatch) {
    this();
    setBatch((ParticleBatch)paramModelInstanceParticleBatch);
  }
  
  public void allocateChannels() {
    this.renderData.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
  }
  
  public void init() {
    boolean bool1;
    boolean bool2;
    ((ModelInstanceControllerRenderData)this.renderData).modelInstanceChannel = (ParallelArray.ObjectChannel)this.controller.particles.getChannel(ParticleChannels.ModelInstance);
    ((ModelInstanceControllerRenderData)this.renderData).colorChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Color);
    ((ModelInstanceControllerRenderData)this.renderData).scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Scale);
    ((ModelInstanceControllerRenderData)this.renderData).rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Rotation3D);
    ParticleControllerRenderData particleControllerRenderData;
    if (((ModelInstanceControllerRenderData)(particleControllerRenderData = this.renderData)).colorChannel != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.hasColor = bool2;
    if (((ModelInstanceControllerRenderData)particleControllerRenderData).scaleChannel != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.hasScale = bool2;
    if (((ModelInstanceControllerRenderData)particleControllerRenderData).rotationChannel != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.hasRotation = bool1;
  }
  
  public void update() {
    byte b = 0;
    int i = 0;
    int j = this.controller.particles.size;
    while (b < j) {
      float f2;
      ParticleControllerRenderData particleControllerRenderData1;
      Tb tb = ((Tb[])((ModelInstanceControllerRenderData)(particleControllerRenderData1 = this.renderData)).modelInstanceChannel.data)[b];
      if (this.hasScale) {
        f2 = ((ModelInstanceControllerRenderData)particleControllerRenderData1).scaleChannel.data[b];
      } else {
        f2 = 1.0F;
      } 
      float f3 = 0.0F;
      float f4 = 0.0F;
      float f5 = 0.0F;
      float f6 = 1.0F;
      if (this.hasRotation) {
        int m = b * ((ParallelArray.Channel)((ModelInstanceControllerRenderData)particleControllerRenderData1).rotationChannel).strideSize;
        f4 = ((ModelInstanceControllerRenderData)particleControllerRenderData1).rotationChannel.data[m + 0];
        f5 = ((ModelInstanceControllerRenderData)particleControllerRenderData1).rotationChannel.data[m + 1];
        f6 = ((ModelInstanceControllerRenderData)particleControllerRenderData1).rotationChannel.data[m + 2];
        f3 = ((ModelInstanceControllerRenderData)particleControllerRenderData1).rotationChannel.data[m + 3];
        f6 = f3;
        f5 = f6;
        f4 = f5;
        f3 = f4;
      } 
      float f1 = particleControllerRenderData1.positionChannel.data[i + 1];
      tb.mh.iO(particleControllerRenderData1.positionChannel.data[i + 0], f1, particleControllerRenderData1.positionChannel.data[i + 2], f3, f4, f5, f6, f2, f2, f2);
      int k = b * ((ParallelArray.Channel)((ModelInstanceControllerRenderData)this.renderData).colorChannel).strideSize;
      qo qo = (qo)((T0)tb.xl0.get(0)).cOM1(qo.A80);
      ParticleControllerRenderData particleControllerRenderData2;
      qo.vF0.r = ((ModelInstanceControllerRenderData)(particleControllerRenderData2 = this.renderData)).colorChannel.data[k + 0];
      qo.vF0.g = ((ModelInstanceControllerRenderData)particleControllerRenderData2).colorChannel.data[k + 1];
      qo.vF0.b = ((ModelInstanceControllerRenderData)particleControllerRenderData2).colorChannel.data[k + 2];
      zc zc;
      if (this.hasColor && (zc = (zc)((T0)tb.xl0.get(0)).cOM1(zc.U7)) != null)
        zc.yg0 = ((ModelInstanceControllerRenderData)particleControllerRenderData2).colorChannel.data[k + 3]; 
      b++;
      i += ((ParallelArray.Channel)this.renderData.positionChannel).strideSize;
    } 
    super.update();
  }
  
  public ParticleControllerComponent copy() {
    return new ModelInstanceRenderer((ModelInstanceParticleBatch)this.batch);
  }
  
  public boolean isCompatible(ParticleBatch paramParticleBatch) {
    return paramParticleBatch instanceof ModelInstanceParticleBatch;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/renderers/ModelInstanceRenderer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */