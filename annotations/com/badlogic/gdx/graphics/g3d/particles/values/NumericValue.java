/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public class NumericValue extends ParticleValue { public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); this
/* 2 */       .value = ((Float)COm9.aD0(paramIt, parambM0, "value", float.class, null)).floatValue(); }
/*   */ 
/*   */   
/*   */   private float value;
/*   */   
/*   */   public float getValue() {
/*   */     return this.value;
/*   */   }
/*   */   
/*   */   public void setValue(float paramFloat) {
/*   */     this.value = paramFloat;
/*   */   }
/*   */   
/*   */   public void load(NumericValue paramNumericValue) {
/*   */     load(paramNumericValue);
/*   */     this.value = paramNumericValue.value;
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     super.write(paramIt);
/*   */     paramIt.Jv0(Float.valueOf(this.value), "value");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/NumericValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */