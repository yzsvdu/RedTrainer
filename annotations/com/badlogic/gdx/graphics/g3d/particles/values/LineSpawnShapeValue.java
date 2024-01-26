/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class LineSpawnShapeValue extends PrimitiveSpawnShapeValue { public void spawnAux(eo parameo, float paramFloat) { float f1 = this.spawnWidth, f2 = this.spawnWidthDiff; f1 = oh.Zn(this.spawnWidthValue, paramFloat, f2, f1);
/* 2 */     f2 = this.spawnHeight; float f3 = this.spawnHeightDiff;
/* 3 */     f2 = oh.Zn(this.spawnHeightValue, paramFloat, f3, f2);
/* 4 */     f3 = this.spawnDepth; float f4 = this.spawnDepthDiff;
/* 5 */     paramFloat = oh.Zn(this.spawnDepthValue, paramFloat, f4, f3);
/* 6 */     parameo
/* 7 */       .x = f3 * f1; parameo.y = f3 * f2; parameo.z = (f3 = nx0.Mc0.nextFloat()) * paramFloat; }
/*   */ 
/*   */   
/*   */   public LineSpawnShapeValue(LineSpawnShapeValue paramLineSpawnShapeValue) {
/*   */     super(paramLineSpawnShapeValue);
/*   */     load(paramLineSpawnShapeValue);
/*   */   }
/*   */   
/*   */   public LineSpawnShapeValue() {}
/*   */   
/*   */   public SpawnShapeValue copy() {
/*   */     return new LineSpawnShapeValue(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/LineSpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */