package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import f.JU;

public class ParticleControllerFinalizerInfluencer extends Influencer {
  public ParallelArray.FloatChannel positionChannel;
  
  public ParallelArray.FloatChannel scaleChannel;
  
  public ParallelArray.FloatChannel rotationChannel;
  
  public ParallelArray.ObjectChannel controllerChannel;
  
  public boolean hasScale;
  
  public boolean hasRotation;
  
  public void init() {
    if ((this.controllerChannel = (ParallelArray.ObjectChannel)this.controller.particles.getChannel(ParticleChannels.ParticleController)) != null) {
      boolean bool1;
      boolean bool2;
      this.scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Scale);
      ParallelArray.FloatChannel floatChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Rotation3D);
      if (this.scaleChannel != null) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.hasScale = bool2;
      if (floatChannel != null) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.hasRotation = bool1;
      return;
    } 
    throw new JU("ParticleController channel not found, specify an influencer which will allocate it please.");
  }
  
  public void allocateChannels() {
    this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
  }
  
  public void update() {
    byte b1 = 0;
    byte b2 = 0;
    int i = this.controller.particles.size;
    while (b1 < i) {
      float f3;
      ParticleController particleController = ((ParticleController[])this.controllerChannel.data)[b1];
      if (this.hasScale) {
        f3 = this.scaleChannel.data[b1];
      } else {
        f3 = 1.0F;
      } 
      float f4 = 0.0F;
      float f5 = 0.0F;
      float f6 = 0.0F;
      float f7 = 1.0F;
      if (this.hasRotation) {
        int k = b1 * ((ParallelArray.Channel)this.rotationChannel).strideSize;
        f4 = arrayOfFloat1[k + 0];
        f5 = arrayOfFloat1[k + 1];
        f6 = arrayOfFloat1[k + 2];
        float[] arrayOfFloat1;
        f7 = (arrayOfFloat1 = this.rotationChannel.data)[k + 3];
      } 
      float f1 = arrayOfFloat[b2 + 0];
      float f2 = arrayOfFloat[b2 + 1];
      float[] arrayOfFloat;
      float f8 = (arrayOfFloat = this.positionChannel.data)[b2 + 2];
      particleController.setTransform(f1, f2, f8, f4, f5, f6, f7, f3);
      particleController.update();
      b1++;
      int j = b2 + ((ParallelArray.Channel)this.positionChannel).strideSize;
    } 
  }
  
  public ParticleControllerFinalizerInfluencer copy() {
    return new ParticleControllerFinalizerInfluencer();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/ParticleControllerFinalizerInfluencer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */