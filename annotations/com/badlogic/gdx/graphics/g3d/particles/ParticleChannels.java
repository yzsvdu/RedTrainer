package com.badlogic.gdx.graphics.g3d.particles;

import f.Tb;
import java.util.Arrays;

public class ParticleChannels {
  private static int currentGlobalId;
  
  public static final ParallelArray.ChannelDescriptor Life;
  
  public static final ParallelArray.ChannelDescriptor Position;
  
  public static final ParallelArray.ChannelDescriptor PreviousPosition;
  
  public static final ParallelArray.ChannelDescriptor Color;
  
  public static final ParallelArray.ChannelDescriptor TextureRegion;
  
  public static final ParallelArray.ChannelDescriptor Rotation2D;
  
  public static final ParallelArray.ChannelDescriptor Rotation3D;
  
  public static final ParallelArray.ChannelDescriptor Scale;
  
  public static final ParallelArray.ChannelDescriptor ModelInstance = new ParallelArray.ChannelDescriptor(newGlobalId(), Tb.class, 1);
  
  public static final ParallelArray.ChannelDescriptor ParticleController = new ParallelArray.ChannelDescriptor(newGlobalId(), ParticleController.class, 1);
  
  public static final ParallelArray.ChannelDescriptor Acceleration;
  
  public static final ParallelArray.ChannelDescriptor AngularVelocity2D;
  
  public static final ParallelArray.ChannelDescriptor AngularVelocity3D;
  
  public static final ParallelArray.ChannelDescriptor Interpolation;
  
  public static final ParallelArray.ChannelDescriptor Interpolation4;
  
  public static final ParallelArray.ChannelDescriptor Interpolation6;
  
  public static final int CurrentLifeOffset = 0;
  
  public static final int TotalLifeOffset = 1;
  
  public static final int LifePercentOffset = 2;
  
  public static final int RedOffset = 0;
  
  public static final int GreenOffset = 1;
  
  public static final int BlueOffset = 2;
  
  public static final int AlphaOffset = 3;
  
  public static final int InterpolationStartOffset = 0;
  
  public static final int InterpolationDiffOffset = 1;
  
  public static final int VelocityStrengthStartOffset = 0;
  
  public static final int VelocityStrengthDiffOffset = 1;
  
  public static final int VelocityThetaStartOffset = 0;
  
  public static final int VelocityThetaDiffOffset = 1;
  
  public static final int VelocityPhiStartOffset = 2;
  
  public static final int VelocityPhiDiffOffset = 3;
  
  public static final int XOffset = 0;
  
  public static final int YOffset = 1;
  
  public static final int ZOffset = 2;
  
  public static final int WOffset = 3;
  
  public static final int UOffset = 0;
  
  public static final int VOffset = 1;
  
  public static final int U2Offset = 2;
  
  public static final int V2Offset = 3;
  
  public static final int HalfWidthOffset = 4;
  
  public static final int HalfHeightOffset = 5;
  
  public static final int CosineOffset = 0;
  
  public static final int SineOffset = 1;
  
  private int currentId;
  
  public static int newGlobalId() {
    return currentGlobalId++;
  }
  
  public ParticleChannels() {
    resetIds();
  }
  
  static {
    Acceleration = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 3);
    AngularVelocity2D = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 1);
    AngularVelocity3D = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 3);
    Interpolation = new ParallelArray.ChannelDescriptor(-1, clazz, 2);
    Interpolation4 = new ParallelArray.ChannelDescriptor(-1, clazz, 4);
    Interpolation6 = new ParallelArray.ChannelDescriptor(-1, clazz, 6);
  }
  
  public int newId() {
    return this.currentId++;
  }
  
  public void resetIds() {
    this.currentId = currentGlobalId;
  }
  
  static {
    Class<float> clazz;
    Life = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz = float.class, 3);
    Position = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 3);
    PreviousPosition = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 3);
    Color = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 4);
    TextureRegion = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 6);
    Rotation2D = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 2);
    Rotation3D = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 4);
    Scale = new ParallelArray.ChannelDescriptor(newGlobalId(), clazz, 1);
  }
  
  public static class Rotation3dInitializer implements ParallelArray.ChannelInitializer {
    private static Rotation3dInitializer instance;
    
    public static Rotation3dInitializer get() {
      if (instance == null)
        instance = new Rotation3dInitializer(); 
      return instance;
    }
    
    public void init(ParallelArray.FloatChannel param1FloatChannel) {
      int i = 0;
      int j = param1FloatChannel.data.length;
      while (i < j) {
        int k = i + 0;
        param1FloatChannel.data[i++ + 2] = 0.0F;
        param1FloatChannel.data[i] = 0.0F;
        param1FloatChannel.data[k] = 0.0F;
        param1FloatChannel.data[i + 3] = 1.0F;
        i += param1FloatChannel.strideSize;
      } 
    }
  }
  
  public static class Rotation2dInitializer implements ParallelArray.ChannelInitializer {
    private static Rotation2dInitializer instance;
    
    public static Rotation2dInitializer get() {
      if (instance == null)
        instance = new Rotation2dInitializer(); 
      return instance;
    }
    
    public void init(ParallelArray.FloatChannel param1FloatChannel) {
      int i = 0;
      int j = param1FloatChannel.data.length;
      while (i < j) {
        param1FloatChannel.data[i + 0] = 1.0F;
        param1FloatChannel.data[i + 1] = 0.0F;
        i += param1FloatChannel.strideSize;
      } 
    }
  }
  
  public static class ScaleInitializer implements ParallelArray.ChannelInitializer {
    private static ScaleInitializer instance;
    
    public static ScaleInitializer get() {
      if (instance == null)
        instance = new ScaleInitializer(); 
      return instance;
    }
    
    public void init(ParallelArray.FloatChannel param1FloatChannel) {
      Arrays.fill(param1FloatChannel.data, 0, param1FloatChannel.data.length, 1.0F);
    }
  }
  
  public static class ColorInitializer implements ParallelArray.ChannelInitializer {
    private static ColorInitializer instance;
    
    public static ColorInitializer get() {
      if (instance == null)
        instance = new ColorInitializer(); 
      return instance;
    }
    
    public void init(ParallelArray.FloatChannel param1FloatChannel) {
      Arrays.fill(param1FloatChannel.data, 0, param1FloatChannel.data.length, 1.0F);
    }
  }
  
  public static class TextureRegionInitializer implements ParallelArray.ChannelInitializer {
    private static TextureRegionInitializer instance;
    
    public static TextureRegionInitializer get() {
      if (instance == null)
        instance = new TextureRegionInitializer(); 
      return instance;
    }
    
    public void init(ParallelArray.FloatChannel param1FloatChannel) {
      int i = 0;
      int j = param1FloatChannel.data.length;
      while (i < j) {
        arrayOfFloat[i + 0] = 0.0F;
        arrayOfFloat[i + 1] = 0.0F;
        arrayOfFloat[i + 2] = 1.0F;
        arrayOfFloat[i + 3] = 1.0F;
        arrayOfFloat[i + 4] = 0.5F;
        float[] arrayOfFloat;
        (arrayOfFloat = param1FloatChannel.data)[i + 5] = 0.5F;
        i += param1FloatChannel.strideSize;
      } 
    }
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleChannels.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */