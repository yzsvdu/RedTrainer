package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderData;
import f.Hc0;
import f.eo;
import f.fQ;
import f.ny;

public abstract class ParticleSorter {
  public static final eo TMP_V1 = new eo();
  
  public ny camera;
  
  public abstract int[] sort(fQ paramfQ);
  
  public void setCamera(ny paramny) {
    this.camera = paramny;
  }
  
  public void ensureCapacity(int paramInt) {}
  
  public static class Distance extends ParticleSorter {
    private float[] distances;
    
    private int[] particleIndices;
    
    private int[] particleOffsets;
    
    private int currentSize = 0;
    
    public void ensureCapacity(int param1Int) {
      if (this.currentSize < param1Int) {
        this.distances = new float[param1Int];
        this.particleIndices = new int[param1Int];
        this.particleOffsets = new int[param1Int];
        this.currentSize = param1Int;
      } 
    }
    
    public int[] sort(fQ param1fQ) {
      float f1 = this.camera.ex.Z0[2];
      float f2 = this.camera.ex.Z0[6];
      float f3 = this.camera.ex.Z0[10];
      int i = 0;
      byte b2 = 0;
      Hc0 hc0 = param1fQ.r30();
      while (hc0.hasNext()) {
        byte b = 0;
        ParticleControllerRenderData particleControllerRenderData;
        int j = b2 + (particleControllerRenderData = (ParticleControllerRenderData)hc0.next()).controller.particles.size;
        while (b2 < j) {
          float f = f1 * arrayOfFloat[b + 0];
          f = f2 * arrayOfFloat[b + 1] + f;
          ParallelArray.FloatChannel floatChannel;
          float[] arrayOfFloat;
          this.distances[b2] = f3 * (arrayOfFloat = (floatChannel = particleControllerRenderData.positionChannel).data)[b + 2] + f;
          this.particleIndices[b2] = b2;
          b2++;
          int k = b + floatChannel.strideSize;
        } 
        i += particleControllerRenderData.controller.particles.size;
      } 
      qsort(0, i - 1);
      for (byte b1 = 0; b1 < i; b1++)
        this.particleOffsets[this.particleIndices[b1]] = b1; 
      return this.particleOffsets;
    }
    
    public void qsort(int param1Int1, int param1Int2) {
      if (param1Int1 < param1Int2) {
        if (param1Int2 - param1Int1 <= 8) {
          for (int n = param1Int1; n <= param1Int2; n++) {
            float[] arrayOfFloat;
            int i2;
            float f1;
            float f2;
            for (int i1 = n; i1 > param1Int1 && (f1 = (arrayOfFloat = this.distances)[i2 = i1 - 1]) > (f2 = arrayOfFloat[i1]); i1--) {
              arrayOfFloat[i1] = f1;
              arrayOfFloat[i2] = f2;
              int i3 = this.particleIndices[i1];
              this.particleIndices[i1] = this.particleIndices[i2];
              this.particleIndices[i2] = i3;
            } 
          } 
          return;
        } 
        float f = this.distances[param1Int1];
        int j = param1Int1 + 1;
        int k = this.particleIndices[param1Int1];
        int m = j;
        while (j <= param1Int2) {
          float[] arrayOfFloat;
          float f1;
          if (f > (f1 = (arrayOfFloat = this.distances)[j])) {
            if (j > m) {
              arrayOfFloat[j] = arrayOfFloat[m];
              arrayOfFloat[m] = f1;
              int n = this.particleIndices[j];
              this.particleIndices[j] = this.particleIndices[m];
              this.particleIndices[m] = n;
            } 
            m++;
          } 
          j++;
        } 
        int i;
        this.distances[param1Int1] = this.distances[i = m - 1];
        this.distances[i] = f;
        this.particleIndices[param1Int1] = this.particleIndices[i];
        this.particleIndices[i] = k;
        qsort(param1Int1, m - 2);
        qsort(m, param1Int2);
      } 
    }
  }
  
  public static class None extends ParticleSorter {
    public int currentCapacity = 0;
    
    public int[] indices;
    
    public void ensureCapacity(int param1Int) {
      if (this.currentCapacity < param1Int) {
        this.indices = new int[param1Int];
        for (byte b = 0; b < param1Int; b++)
          this.indices[b] = b; 
        this.currentCapacity = param1Int;
      } 
    }
    
    public int[] sort(fQ param1fQ) {
      return this.indices;
    }
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleSorter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */