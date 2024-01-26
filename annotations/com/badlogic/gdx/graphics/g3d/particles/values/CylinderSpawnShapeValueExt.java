/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class CylinderSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt { public void spawnAux(eo parameo, float paramFloat) { boolean bool1, bool2; float f1 = this.spawnWidth, f2 = this.spawnWidthDiff; f1 = l30.COn(this.spawnWidthValue, paramFloat, f2, f1);
/* 2 */     f2 = this.spawnHeight; float f3 = this.spawnHeightDiff;
/*   */     
/* 4 */     f3 = this.spawnDepth; float f4 = this.spawnDepthDiff;
/* 5 */     paramFloat = l30.COn(this.spawnDepthValue, paramFloat, f4, f3); f3 = (f2 = l30.COn(this.spawnHeightValue, paramFloat, f3, f2)) / 2.0F;
/* 6 */     f2 = SeedRandom.random(this.random, f2) - f3; if (this.edges) { paramFloat = f1 / 2.0F; f1 = paramFloat / 2.0F; } else { f1 = SeedRandom.random(this.random, f1) / 2.0F; paramFloat = f1 = paramFloat = SeedRandom.random(this.random, paramFloat) / 2.0F; }  f3 = 0.0F; if (paramFloat == 0.0F) { bool1 = true; } else { bool1 = false; }  if (f1 == 0.0F) { bool2 = true; } else { bool2 = false; }  if (!bool1 && !bool2) { f3 = SeedRandom.random(this.random, 360.0F); } else if (bool1) { if (SeedRandom.random(this.random, 1) == 0) { f3 = -90.0F; } else { f3 = 90.0F; }  } else if (bool2) { if (SeedRandom.random(this.random, 1) == 0) { f3 = 0.0F; } else { f3 = 180.0F; }  }  parameo.TG0(nx0.Tu0(f3) * paramFloat, f2, nx0.nH(f3) * f1); }
/*   */ 
/*   */   
/*   */   private Random random;
/*   */   
/*   */   public CylinderSpawnShapeValueExt(CylinderSpawnShapeValueExt paramCylinderSpawnShapeValueExt) {
/*   */     super(paramCylinderSpawnShapeValueExt);
/*   */     load(paramCylinderSpawnShapeValueExt);
/*   */     this.random = (Random)new W60();
/*   */     if (this.seed.isActive())
/*   */       this.random.setSeed(this.seed.getValue()); 
/*   */   }
/*   */   
/*   */   public CylinderSpawnShapeValueExt() {
/*   */     W60 w60;
/*   */     this();
/*   */     this.random = (Random)this;
/*   */   }
/*   */   
/*   */   public void reSeed() {
/*   */     super.reSeed();
/*   */     if (this.seed.isActive())
/*   */       this.random.setSeed(this.seed.getValue()); 
/*   */   }
/*   */   
/*   */   public SpawnShapeValueExt copy() {
/*   */     return new CylinderSpawnShapeValueExt(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/CylinderSpawnShapeValueExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */