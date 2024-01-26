package com.badlogic.gdx.graphics.g3d.particles.values;

import f.W60;
import java.util.Random;

public class RangedNumericValueExt extends RangedNumericValue {
  private static final Random random = (Random)new W60();
  
  public float newLowValue() {
    float f = getLowMin();
    return random.nextFloat() * (getLowMax() - getLowMin()) + f;
  }
  
  public void setSeed(long paramLong) {
    random.setSeed(paramLong);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/RangedNumericValueExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */