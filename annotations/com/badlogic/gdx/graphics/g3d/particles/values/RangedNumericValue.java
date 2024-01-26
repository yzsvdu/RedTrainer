/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public class RangedNumericValue extends ParticleValue { private float lowMin; public float newLowValue() { float f = this.lowMin; return nx0.Mc0.nextFloat() * (this.lowMax - f) + f; } private float lowMax; public void setLow(float paramFloat) { this.lowMin = paramFloat; this.lowMax = paramFloat; } public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); Class<float> clazz = float.class; this
/* 2 */       .lowMin = ((Float)COm9.aD0(paramIt, parambM0, "lowMin", this, null)).floatValue();
/* 3 */     bM0 bM01 = parambM0.Jb("lowMax");
/* 4 */     this.lowMax = ((Float)paramIt.Uj0(this, null, bM01)).floatValue(); }
/*   */ 
/*   */   
/*   */   public void setLow(float paramFloat1, float paramFloat2) {
/*   */     this.lowMin = paramFloat1;
/*   */     this.lowMax = paramFloat2;
/*   */   }
/*   */   
/*   */   public float getLowMin() {
/*   */     return this.lowMin;
/*   */   }
/*   */   
/*   */   public void setLowMin(float paramFloat) {
/*   */     this.lowMin = paramFloat;
/*   */   }
/*   */   
/*   */   public float getLowMax() {
/*   */     return this.lowMax;
/*   */   }
/*   */   
/*   */   public void setLowMax(float paramFloat) {
/*   */     this.lowMax = paramFloat;
/*   */   }
/*   */   
/*   */   public void load(RangedNumericValue paramRangedNumericValue) {
/*   */     load(paramRangedNumericValue);
/*   */     this.lowMax = paramRangedNumericValue.lowMax;
/*   */     this.lowMin = paramRangedNumericValue.lowMin;
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     super.write(paramIt);
/*   */     paramIt.Jv0(Float.valueOf(this.lowMin), "lowMin");
/*   */     paramIt.Jv0(Float.valueOf(this.lowMax), "lowMax");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/RangedNumericValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */