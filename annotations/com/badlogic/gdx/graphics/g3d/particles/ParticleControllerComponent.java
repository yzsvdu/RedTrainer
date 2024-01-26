package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.math.Matrix4;
import f.It;
import f.TG0;
import f.bM0;
import f.dB;
import f.eo;
import f.iq0;
import f.sX;
import f.sz0;

public abstract class ParticleControllerComponent implements iq0, dB, ResourceData.Configurable {
  public static final eo TMP_V1 = new eo();
  
  public static final eo TMP_V2 = new eo();
  
  public static final eo TMP_V3 = new eo();
  
  public static final eo TMP_V4 = new eo();
  
  public static final eo TMP_V5 = new eo();
  
  public static final eo TMP_V6 = new eo();
  
  public static final TG0 TMP_Q = new TG0();
  
  public static final TG0 TMP_Q2 = new TG0();
  
  public static final sX TMP_M3 = new sX();
  
  public static final Matrix4 TMP_M4 = new Matrix4();
  
  public ParticleController controller;
  
  public void activateParticles(int paramInt1, int paramInt2) {}
  
  public void killParticles(int paramInt1, int paramInt2) {}
  
  public void update() {}
  
  public void init() {}
  
  public void start() {}
  
  public void end() {}
  
  public void dispose() {}
  
  public abstract ParticleControllerComponent copy();
  
  public void allocateChannels() {}
  
  public void set(ParticleController paramParticleController) {
    this.controller = paramParticleController;
  }
  
  public void save(sz0 paramsz0, ResourceData paramResourceData) {}
  
  public void load(sz0 paramsz0, ResourceData paramResourceData) {}
  
  public void write(It paramIt) {}
  
  public void read(It paramIt, bM0 parambM0) {}
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleControllerComponent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */