/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public class LongNumericValue extends ParticleValue { public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); this
/* 2 */       .value = ((Long)COm9.aD0(paramIt, parambM0, "value", Long.class, null)).longValue(); }
/*   */ 
/*   */   
/*   */   private long value;
/*   */   
/*   */   public long getValue() {
/*   */     return this.value;
/*   */   }
/*   */   
/*   */   public void setValue(long paramLong) {
/*   */     this.value = paramLong;
/*   */   }
/*   */   
/*   */   public void load(LongNumericValue paramLongNumericValue) {
/*   */     load(paramLongNumericValue);
/*   */     this.value = paramLongNumericValue.value;
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     super.write(paramIt);
/*   */     paramIt.Jv0(Long.valueOf(this.value), "value");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/LongNumericValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */