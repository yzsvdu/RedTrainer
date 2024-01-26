/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.emitters;public abstract class Emitter extends ParticleControllerComponent { public void read(It paramIt, bM0 parambM0) { Class<int> clazz = int.class; this
/* 2 */       .minParticleCount = ((Integer)COm9.aD0(paramIt, parambM0, "minParticleCount", this, null)).intValue();
/* 3 */     bM0 bM01 = parambM0.Jb("maxParticleCount");
/* 4 */     this.maxParticleCount = ((Integer)paramIt.Uj0(this, null, bM01)).intValue(); }
/*   */ 
/*   */   
/*   */   public int minParticleCount;
/*   */   public int maxParticleCount = 4;
/*   */   public float percent;
/*   */   
/*   */   public Emitter(Emitter paramEmitter) {
/*   */     set(paramEmitter);
/*   */   }
/*   */   
/*   */   public Emitter() {}
/*   */   
/*   */   public void init() {
/*   */     this.controller.particles.size = 0;
/*   */   }
/*   */   
/*   */   public void end() {
/*   */     this.controller.particles.size = 0;
/*   */   }
/*   */   
/*   */   public boolean isComplete() {
/*   */     return (this.percent >= 1.0F);
/*   */   }
/*   */   
/*   */   public int getMinParticleCount() {
/*   */     return this.minParticleCount;
/*   */   }
/*   */   
/*   */   public void setMinParticleCount(int paramInt) {
/*   */     this.minParticleCount = paramInt;
/*   */   }
/*   */   
/*   */   public int getMaxParticleCount() {
/*   */     return this.maxParticleCount;
/*   */   }
/*   */   
/*   */   public void setMaxParticleCount(int paramInt) {
/*   */     this.maxParticleCount = paramInt;
/*   */   }
/*   */   
/*   */   public void setParticleCount(int paramInt1, int paramInt2) {
/*   */     setMinParticleCount(paramInt1);
/*   */     setMaxParticleCount(paramInt2);
/*   */   }
/*   */   
/*   */   public void set(Emitter paramEmitter) {
/*   */     this.minParticleCount = paramEmitter.minParticleCount;
/*   */     this.maxParticleCount = paramEmitter.maxParticleCount;
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     paramIt.Jv0(Integer.valueOf(this.minParticleCount), "minParticleCount");
/*   */     paramIt.Jv0(Integer.valueOf(this.maxParticleCount), "maxParticleCount");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/emitters/Emitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */