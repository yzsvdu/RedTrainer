package com.badlogic.gdx.graphics.g3d.particles;

import java.util.Arrays;

public class ParticleChannelsExt {
  public static final ParallelArray.ChannelDescriptor ScaleXY;
  
  public static final ParallelArray.ChannelDescriptor BaseScaleXY;
  
  public static final ParallelArray.ChannelDescriptor PathId;
  
  public static final ParallelArray.ChannelDescriptor ParticleId;
  
  public static final ParallelArray.ChannelDescriptor ColorParentId;
  
  public static final ParallelArray.ChannelDescriptor RotationParentId;
  
  public static final ParallelArray.ChannelDescriptor SpawnPosition;
  
  public static final int ScaleXStartOffset = 0;
  
  public static final int ScaleXDiffOffset = 1;
  
  public static final int ScaleYStartOffset = 2;
  
  public static final int ScaleYDiffOffset = 3;
  
  static {
    Class<float> clazz;
    ScaleXY = new ParallelArray.ChannelDescriptor(ParticleChannels.newGlobalId(), clazz = float.class, 2);
    BaseScaleXY = new ParallelArray.ChannelDescriptor(ParticleChannels.newGlobalId(), clazz, 2);
    Class<int> clazz1;
    PathId = new ParallelArray.ChannelDescriptor(ParticleChannels.newGlobalId(), clazz1 = int.class, 1);
    ParticleId = new ParallelArray.ChannelDescriptor(ParticleChannels.newGlobalId(), clazz1, 1);
    ColorParentId = new ParallelArray.ChannelDescriptor(ParticleChannels.newGlobalId(), clazz1, 1);
    RotationParentId = new ParallelArray.ChannelDescriptor(ParticleChannels.newGlobalId(), clazz1, 1);
    SpawnPosition = new ParallelArray.ChannelDescriptor(ParticleChannels.newGlobalId(), clazz, 3);
  }
  
  public static class ScaleXYInitializer implements ParallelArray.ChannelInitializer {
    private static ScaleXYInitializer instance;
    
    public static ScaleXYInitializer get() {
      if (instance == null)
        instance = new ScaleXYInitializer(); 
      return instance;
    }
    
    public void init(ParallelArray.FloatChannel param1FloatChannel) {
      Arrays.fill(param1FloatChannel.data, 0, param1FloatChannel.data.length, 1.0F);
    }
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleChannelsExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */