/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public class ParticleValue implements dB { public void read(It paramIt, bM0 parambM0) { this
/* 2 */       .active = ((Boolean)COm9.aD0(paramIt, parambM0, "active", Boolean.class, null)).booleanValue(); }
/*   */ 
/*   */   
/*   */   public boolean active;
/*   */   
/*   */   public ParticleValue() {}
/*   */   
/*   */   public ParticleValue(ParticleValue paramParticleValue) {
/*   */     this.active = paramParticleValue.active;
/*   */   }
/*   */   
/*   */   public boolean isActive() {
/*   */     return this.active;
/*   */   }
/*   */   
/*   */   public void setActive(boolean paramBoolean) {
/*   */     this.active = paramBoolean;
/*   */   }
/*   */   
/*   */   public void load(ParticleValue paramParticleValue) {
/*   */     this.active = paramParticleValue.active;
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     paramIt.Jv0(Boolean.valueOf(this.active), "active");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/ParticleValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */