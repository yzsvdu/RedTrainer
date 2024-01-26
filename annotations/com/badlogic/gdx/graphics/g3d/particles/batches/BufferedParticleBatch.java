package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.g3d.particles.ParticleSorter;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderData;
import f.fQ;
import f.ny;

public abstract class BufferedParticleBatch implements ParticleBatch {
  public fQ renderData;
  
  public int bufferedParticlesCount;
  
  public int currentCapacity;
  
  public ParticleSorter sorter;
  
  public ny camera;
  
  public BufferedParticleBatch(Class paramClass) {
    ParticleSorter.Distance distance;
    fQ fQ1;
    this.currentCapacity = 0;
    this();
    this.sorter = (ParticleSorter)this;
    this(false, 10, paramClass);
    this.renderData = this;
  }
  
  public void begin() {
    this.renderData.clear();
    this.bufferedParticlesCount = 0;
  }
  
  public void draw(ParticleControllerRenderData paramParticleControllerRenderData) {
    if (paramParticleControllerRenderData.controller.particles.size > 0) {
      this.renderData.Com3(paramParticleControllerRenderData);
      this.bufferedParticlesCount += paramParticleControllerRenderData.controller.particles.size;
    } 
  }
  
  public void end() {
    int i;
    if ((i = this.bufferedParticlesCount) > 0) {
      ensureCapacity(i);
      flush(this.sorter.sort(this.renderData));
    } 
  }
  
  public void ensureCapacity(int paramInt) {
    if (this.currentCapacity >= paramInt)
      return; 
    this.sorter.ensureCapacity(paramInt);
    allocParticlesData(paramInt);
    this.currentCapacity = paramInt;
  }
  
  public void resetCapacity() {
    this.bufferedParticlesCount = 0;
    this.currentCapacity = 0;
  }
  
  public abstract void allocParticlesData(int paramInt);
  
  public void setCamera(ny paramny) {
    this.camera = paramny;
    this.sorter.setCamera(paramny);
  }
  
  public ParticleSorter getSorter() {
    return this.sorter;
  }
  
  public void setSorter(ParticleSorter paramParticleSorter) {
    this.sorter = paramParticleSorter;
    paramParticleSorter.setCamera(this.camera);
    paramParticleSorter.ensureCapacity(this.currentCapacity);
  }
  
  public abstract void flush(int[] paramArrayOfint);
  
  public int getBufferedCount() {
    return this.bufferedParticlesCount;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/batches/BufferedParticleBatch.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */