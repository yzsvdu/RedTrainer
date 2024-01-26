/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class PointSpawnShapeValue extends PrimitiveSpawnShapeValue { public void spawnAux(eo parameo, float paramFloat) { float f1 = this.spawnWidth, f2 = this.spawnWidthDiff; parameo
/* 2 */       .x = oh.Zn(this.spawnWidthValue, paramFloat, f2, f1); f1 = this.spawnHeight; f2 = this.spawnHeightDiff;
/*   */     
/* 4 */     parameo.y = oh.Zn(this.spawnHeightValue, paramFloat, f2, f1); f1 = this.spawnDepth; f2 = this.spawnDepthDiff;
/*   */     
/* 6 */     parameo.z = oh.Zn(this.spawnDepthValue, paramFloat, f2, f1); }
/*   */ 
/*   */   
/*   */   public PointSpawnShapeValue(PointSpawnShapeValue paramPointSpawnShapeValue) {
/*   */     super(paramPointSpawnShapeValue);
/*   */     load(paramPointSpawnShapeValue);
/*   */   }
/*   */   
/*   */   public PointSpawnShapeValue() {}
/*   */   
/*   */   public SpawnShapeValue copy() {
/*   */     return new PointSpawnShapeValue(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/PointSpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */