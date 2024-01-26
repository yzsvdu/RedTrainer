package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import f.pe0;

public class RegionInfluencerExt {
  public static class AnimatedExt extends RegionInfluencer {
    public ParallelArray.FloatChannel lifeChannel;
    
    public AnimatedExt() {}
    
    public AnimatedExt(AnimatedExt param1AnimatedExt) {
      super(param1AnimatedExt);
    }
    
    public AnimatedExt(pe0 param1pe0) {
      super(this);
    }
    
    public AnimatedExt(Texture param1Texture) {
      super(param1Texture);
    }
    
    public void allocateChannels() {
      super.allocateChannels();
      this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
    }
    
    public void update() {
      int i = 0;
      byte b = 2;
      int j = this.controller.particles.size * ((ParallelArray.Channel)this.regionChannel).strideSize;
      while (i < j) {
        int m;
        RegionInfluencer.AspectTextureRegion aspectTextureRegion = (RegionInfluencer.AspectTextureRegion)this.regions.get(Math.min((m = this.regions.Z8) - 1, (int)(this.lifeChannel.data[b] * m)));
        int k = i + 0;
        arrayOfFloat[k] = aspectTextureRegion.u;
        k = i + 1;
        arrayOfFloat[k] = aspectTextureRegion.v;
        k = i + 2;
        arrayOfFloat[k] = aspectTextureRegion.u2;
        k = i + 3;
        arrayOfFloat[k] = aspectTextureRegion.v2;
        arrayOfFloat[i + 4] = 0.5F;
        i += 5;
        float[] arrayOfFloat;
        (arrayOfFloat = this.regionChannel.data)[i] = aspectTextureRegion.halfInvAspectRatio;
        i += ((ParallelArray.Channel)this.regionChannel).strideSize;
        k = b + ((ParallelArray.Channel)this.lifeChannel).strideSize;
      } 
    }
    
    public AnimatedExt copy() {
      return new AnimatedExt(this);
    }
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/RegionInfluencerExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */