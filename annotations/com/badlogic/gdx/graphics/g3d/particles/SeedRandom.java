package com.badlogic.gdx.graphics.g3d.particles;

import f.NUL;
import java.util.Random;

public class SeedRandom {
  public static int random(Random paramRandom, int paramInt) {
    return paramRandom.nextInt(paramInt + 1);
  }
  
  public static float random(Random paramRandom, float paramFloat1, float paramFloat2) {
    return NUL.df(paramFloat2, paramFloat1, paramRandom.nextFloat(), paramFloat1);
  }
  
  public static float random(Random paramRandom, float paramFloat) {
    return paramRandom.nextFloat() * paramFloat;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/SeedRandom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */