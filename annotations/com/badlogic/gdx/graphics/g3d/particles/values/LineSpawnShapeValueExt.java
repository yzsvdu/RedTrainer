/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class LineSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt { public void spawnAux(eo parameo, float paramFloat) { float f1 = this.spawnWidth, f2 = this.spawnWidthDiff; f1 = l30.COn(this.spawnWidthValue, paramFloat, f2, f1);
/* 2 */     f2 = this.spawnHeight; float f3 = this.spawnHeightDiff;
/* 3 */     f2 = l30.COn(this.spawnHeightValue, paramFloat, f3, f2);
/* 4 */     f3 = this.spawnDepth; float f4 = this.spawnDepthDiff;
/* 5 */     paramFloat = l30.COn(this.spawnDepthValue, paramFloat, f4, f3);
/* 6 */     parameo.x = f3 * f1; parameo.y = f3 * f2; parameo.z = (f3 = random.nextFloat()) * paramFloat; }
/*   */ 
/*   */   
/*   */   private static final Random random = (Random)new W60();
/*   */   
/*   */   public LineSpawnShapeValueExt(LineSpawnShapeValueExt paramLineSpawnShapeValueExt) {
/*   */     super(paramLineSpawnShapeValueExt);
/*   */     load(paramLineSpawnShapeValueExt);
/*   */   }
/*   */   
/*   */   public LineSpawnShapeValueExt() {}
/*   */   
/*   */   public void reSeed() {
/*   */     super.reSeed();
/*   */     if (this.seed.isActive())
/*   */       random.setSeed(this.seed.getValue()); 
/*   */   }
/*   */   
/*   */   public SpawnShapeValueExt copy() {
/*   */     return new LineSpawnShapeValueExt(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/LineSpawnShapeValueExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */