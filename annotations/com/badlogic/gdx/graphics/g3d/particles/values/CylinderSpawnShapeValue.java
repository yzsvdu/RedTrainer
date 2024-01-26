/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class CylinderSpawnShapeValue extends PrimitiveSpawnShapeValue { public void spawnAux(eo parameo, float paramFloat) { boolean bool1, bool2; float f2 = this.spawnWidth, f3 = this.spawnWidthDiff; f2 = oh.Zn(this.spawnWidthValue, paramFloat, f3, f2);
/* 2 */     f3 = this.spawnHeight; float f4 = this.spawnHeightDiff;
/*   */     
/* 4 */     float f1 = this.spawnDepth; f3 = this.spawnDepthDiff;
/* 5 */     f1 = oh.Zn(this.spawnDepthValue, paramFloat, f3, f1); paramFloat = oh.Zn(this.spawnHeightValue, paramFloat, f4, f3) / 2.0F;
/* 6 */     paramFloat = nx0.pq0(oh.Zn(this.spawnHeightValue, paramFloat, f4, f3)) - paramFloat; if (this.edges) { f1 = f2 / 2.0F; f2 = f1 / 2.0F; } else { f1 = nx0.pq0(f2) / 2.0F; f2 = nx0.pq0(f1) / 2.0F; }  f3 = 0.0F; if (f1 == 0.0F) { bool1 = true; } else { bool1 = false; }  if (f2 == 0.0F) { bool2 = true; } else { bool2 = false; }  if (!bool1 && !bool2) { f3 = nx0.pq0(360.0F); } else if (bool1) { if (nx0.cOM9(1) == 0) { f3 = -90.0F; } else { f3 = 90.0F; }  } else if (bool2) { if (nx0.cOM9(1) == 0) { f3 = 0.0F; } else { f3 = 180.0F; }  }  parameo.TG0(nx0.Tu0(f3) * f1, paramFloat, nx0.nH(f3) * f2); }
/*   */ 
/*   */   
/*   */   public CylinderSpawnShapeValue(CylinderSpawnShapeValue paramCylinderSpawnShapeValue) {
/*   */     super(paramCylinderSpawnShapeValue);
/*   */     load(paramCylinderSpawnShapeValue);
/*   */   }
/*   */   
/*   */   public CylinderSpawnShapeValue() {}
/*   */   
/*   */   public SpawnShapeValue copy() {
/*   */     return new CylinderSpawnShapeValue(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/CylinderSpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */