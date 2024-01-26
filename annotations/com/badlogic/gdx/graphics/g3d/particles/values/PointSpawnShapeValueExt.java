/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class PointSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt { public void spawnAux(eo parameo, float paramFloat) { float f1 = this.spawnWidth, f2 = this.spawnWidthDiff; parameo
/* 2 */       .x = l30.COn(this.spawnWidthValue, paramFloat, f2, f1); f1 = this.spawnHeight; f2 = this.spawnHeightDiff;
/*   */     
/* 4 */     parameo.y = l30.COn(this.spawnHeightValue, paramFloat, f2, f1); f1 = this.spawnDepth; f2 = this.spawnDepthDiff;
/*   */     
/* 6 */     parameo.z = l30.COn(this.spawnDepthValue, paramFloat, f2, f1); }
/*   */ 
/*   */   
/*   */   public PointSpawnShapeValueExt(PointSpawnShapeValueExt paramPointSpawnShapeValueExt) {
/*   */     super(paramPointSpawnShapeValueExt);
/*   */     load(paramPointSpawnShapeValueExt);
/*   */   }
/*   */   
/*   */   public PointSpawnShapeValueExt() {}
/*   */   
/*   */   public void setDimensions(float paramFloat) {
/*   */     this.spawnWidthValue.setHigh(paramFloat);
/*   */     this.spawnHeightValue.setHigh(paramFloat);
/*   */   }
/*   */   
/*   */   public SpawnShapeValueExt copy() {
/*   */     return new PointSpawnShapeValueExt(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/PointSpawnShapeValueExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */