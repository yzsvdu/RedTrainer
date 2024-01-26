package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import f.Hc0;
import f.Lc;
import f.fQ;
import f.tk;

public final class ParticleSystem implements tk {
  private static ParticleSystem instance;
  
  private fQ batches;
  
  private fQ effects;
  
  @Deprecated
  public static ParticleSystem get() {
    if (instance == null)
      instance = new ParticleSystem(); 
    return instance;
  }
  
  public ParticleSystem() {
    fQ fQ1;
    this();
    this.batches = this;
    this();
    this.effects = this;
  }
  
  public void add(ParticleBatch paramParticleBatch) {
    this.batches.Com3(paramParticleBatch);
  }
  
  public void add(ParticleEffect paramParticleEffect) {
    this.effects.Com3(paramParticleEffect);
  }
  
  public void remove(ParticleEffect paramParticleEffect) {
    this.effects.Ct(paramParticleEffect, true);
  }
  
  public void removeAll() {
    this.effects.clear();
  }
  
  public void update() {
    Hc0 hc0 = this.effects.r30();
    while (hasNext())
      ((ParticleEffect)next()).update(); 
  }
  
  public void updateAndDraw() {
    Hc0 hc0 = this.effects.r30();
    while (hasNext()) {
      ((ParticleEffect)next()).update();
      ((ParticleEffect)next()).draw();
    } 
  }
  
  public void update(float paramFloat) {
    Hc0 hc0 = this.effects.r30();
    while (hasNext())
      ((ParticleEffect)next()).update(paramFloat); 
  }
  
  public void updateAndDraw(float paramFloat) {
    Hc0 hc0 = this.effects.r30();
    while (hasNext()) {
      ((ParticleEffect)next()).update(paramFloat);
      ((ParticleEffect)next()).draw();
    } 
  }
  
  public void begin() {
    Hc0 hc0 = this.batches.r30();
    while (hasNext())
      ((ParticleBatch)next()).begin(); 
  }
  
  public void draw() {
    Hc0 hc0 = this.effects.r30();
    while (hasNext())
      ((ParticleEffect)next()).draw(); 
  }
  
  public void end() {
    Hc0 hc0 = this.batches.r30();
    while (hasNext())
      ((ParticleBatch)next()).end(); 
  }
  
  public void getRenderables(fQ paramfQ, Lc paramLc) {
    Hc0 hc0 = this.batches.r30();
    while (hasNext())
      ((ParticleBatch)next()).getRenderables(paramfQ, paramLc); 
  }
  
  public fQ getBatches() {
    return this.batches;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleSystem.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */