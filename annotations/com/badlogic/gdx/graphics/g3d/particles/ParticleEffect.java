package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import com.badlogic.gdx.math.Matrix4;
import f.Eb;
import f.Hc0;
import f.TG0;
import f.eo;
import f.fQ;
import f.iq0;
import f.sz0;

public class ParticleEffect implements iq0, ResourceData.Configurable {
  private fQ controllers;
  
  private Eb bounds;
  
  public ParticleEffect() {
    fQ fQ1;
    this(true, 3, ParticleController.class);
    this.controllers = this;
  }
  
  public ParticleEffect(ParticleEffect paramParticleEffect) {
    this.controllers = new fQ(true, paramParticleEffect.controllers.Z8);
    byte b = 0;
    int i = paramParticleEffect.controllers.Z8;
    while (b < i) {
      this.controllers.Com3(((ParticleController)paramParticleEffect.controllers.get(b)).copy());
      b++;
    } 
  }
  
  public ParticleEffect(ParticleController... paramVarArgs) {
    fQ fQ1;
    this((Object[])paramVarArgs);
    this.controllers = this;
  }
  
  public void init() {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).init();
      b++;
    } 
  }
  
  public void start() {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).start();
      b++;
    } 
  }
  
  public void end() {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).end();
      b++;
    } 
  }
  
  public void reset() {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).reset();
      b++;
    } 
  }
  
  public void update() {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).update();
      b++;
    } 
  }
  
  public void update(float paramFloat) {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).update(paramFloat);
      b++;
    } 
  }
  
  public void draw() {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).draw();
      b++;
    } 
  }
  
  public boolean isComplete() {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      if (!((ParticleController)this.controllers.get(b)).isComplete())
        return false; 
      b++;
    } 
    return true;
  }
  
  public void setTransform(Matrix4 paramMatrix4) {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).setTransform(paramMatrix4);
      b++;
    } 
  }
  
  public void rotate(TG0 paramTG0) {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).rotate(paramTG0);
      b++;
    } 
  }
  
  public void rotate(eo parameo, float paramFloat) {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).rotate(parameo, paramFloat);
      b++;
    } 
  }
  
  public void translate(eo parameo) {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).translate(parameo);
      b++;
    } 
  }
  
  public void scale(float paramFloat1, float paramFloat2, float paramFloat3) {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).scale(paramFloat1, paramFloat2, paramFloat3);
      b++;
    } 
  }
  
  public void scale(eo parameo) {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      float f1 = parameo.x;
      float f2 = parameo.y;
      float f3 = parameo.z;
      ((ParticleController)this.controllers.get(b)).scale(f1, f2, f3);
      b++;
    } 
  }
  
  public fQ getControllers() {
    return this.controllers;
  }
  
  public ParticleController findController(String paramString) {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ParticleController particleController;
      if ((particleController = (ParticleController)this.controllers.get(b)).name.equals(paramString))
        return particleController; 
      b++;
    } 
    return null;
  }
  
  public void dispose() {
    byte b = 0;
    int i = this.controllers.Z8;
    while (b < i) {
      ((ParticleController)this.controllers.get(b)).dispose();
      b++;
    } 
  }
  
  public Eb getBoundingBox() {
    if (this.bounds == null) {
      Eb eb1;
      this();
      this.bounds = eb1;
    } 
    Eb eb;
    (eb = this.bounds).Te0();
    Hc0 hc0 = this.controllers.r30();
    while (hc0.hasNext())
      fY(((ParticleController)hc0.next()).getBoundingBox()); 
    return this;
  }
  
  public void setBatch(fQ paramfQ) {
    Hc0 hc0 = this.controllers.r30();
    while (hasNext()) {
      ParticleBatch particleBatch;
      ParticleController particleController = (ParticleController)next();
      Hc0 hc01 = paramfQ.r30();
      do {
        particleBatch = (ParticleBatch)hc01.next();
      } while (hc01.hasNext() && !particleController.renderer.setBatch(particleBatch));
    } 
  }
  
  public ParticleEffect copy() {
    return new ParticleEffect(this);
  }
  
  public void save(sz0 paramsz0, ResourceData paramResourceData) {
    Hc0 hc0 = this.controllers.r30();
    while (hasNext())
      ((ParticleController)next()).save(paramsz0, paramResourceData); 
  }
  
  public void load(sz0 paramsz0, ResourceData paramResourceData) {
    Hc0 hc0 = this.controllers.r30();
    while (hasNext())
      ((ParticleController)next()).load(paramsz0, paramResourceData); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleEffect.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */