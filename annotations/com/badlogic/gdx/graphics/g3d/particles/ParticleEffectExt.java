/* 1 */ package com.badlogic.gdx.graphics.g3d.particles;public class ParticleEffectExt extends ParticleEffect implements tk { public void dispose() { super.dispose(); for (Hc0 hc02 = this.disposables.r30(); hc02.hasNext(); ((iq0)hc02.next()).dispose()); if (this.parent != null) { String str = this.managerFileName; synchronized (this.manager) { if ((Class)this.manager.g30.pd0(str) != null) this
/* 2 */             .manager.zu(this.managerFileName);  return; }  }  for (Hc0 hc01 = this.batches.r30(); hasNext();) { if (particleBatch = (ParticleBatch)next() instanceof iq0) ((iq0)particleBatch).dispose();  }
/*   */      }
/*   */ 
/*   */   
/*   */   private boolean initialized;
/*   */   private transient fQ batches;
/*   */   private transient ParticleEffectExt parent;
/*   */   private transient sz0 manager;
/*   */   private transient String managerFileName;
/*   */   private fQ disposables;
/*   */   
/*   */   public ParticleEffectExt() {
/*   */     fQ fQ1;
/*   */     this.initialized = false;
/*   */     this(0);
/*   */     this.batches = this;
/*   */     this.parent = null;
/*   */     this.manager = null;
/*   */     this.managerFileName = null;
/*   */     this();
/*   */     this.disposables = this;
/*   */   }
/*   */   
/*   */   public ParticleEffectExt(ParticleController... paramVarArgs) {
/*   */     super(paramVarArgs);
/*   */     fQ fQ1;
/*   */     this.initialized = false;
/*   */     this(0);
/*   */     this.batches = this;
/*   */     this.parent = null;
/*   */     this.manager = null;
/*   */     this.managerFileName = null;
/*   */     this();
/*   */     this.disposables = this;
/*   */   }
/*   */   
/*   */   public ParticleEffectExt(ParticleEffectExt paramParticleEffectExt) {
/*   */     super(paramParticleEffectExt);
/*   */     this.initialized = false;
/*   */     this.batches = new fQ(0);
/*   */     this.parent = null;
/*   */     this.manager = null;
/*   */     this.managerFileName = null;
/*   */     this.disposables = new fQ();
/*   */     this.parent = paramParticleEffectExt;
/*   */     this.manager = paramParticleEffectExt.manager;
/*   */     this.managerFileName = paramParticleEffectExt.managerFileName;
/*   */     this.batches = paramParticleEffectExt.batches;
/*   */   }
/*   */   
/*   */   public void start() {
/*   */     super.start();
/*   */   }
/*   */   
/*   */   public void init() {
/*   */     if (this.initialized)
/*   */       return; 
/*   */     this.initialized = true;
/*   */     byte b = 0;
/*   */     int i = (getControllers()).Z8;
/*   */     while (b < i) {
/*   */       ParticleControllerExt particleControllerExt;
/*   */       if ((particleControllerExt = (ParticleControllerExt)getControllers().get(b)).trailController < 0) {
/*   */         particleControllerExt.updateTrailController(null);
/*   */       } else {
/*   */         Hc0 hc0 = particleControllerExt.influencers.r30();
/*   */         while (hc0.hasNext()) {
/*   */           if ((Influencer)hc0.next() instanceof com.badlogic.gdx.graphics.g3d.particles.influencers.TrailInfluencer && (getControllers()).Z8 > particleControllerExt.trailController)
/*   */             particleControllerExt.updateTrailController((ParticleControllerExt)getControllers().get(particleControllerExt.trailController)); 
/*   */         } 
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */     super.init();
/*   */   }
/*   */   
/*   */   public ParticleEffectExt copy() {
/*   */     return new ParticleEffectExt(this);
/*   */   }
/*   */   
/*   */   public void begin() {
/*   */     Hc0 hc0 = this.batches.r30();
/*   */     while (hasNext())
/*   */       ((ParticleBatch)next()).begin(); 
/*   */   }
/*   */   
/*   */   public void end() {
/*   */     Hc0 hc0 = this.batches.r30();
/*   */     while (hasNext())
/*   */       ((ParticleBatch)next()).end(); 
/*   */   }
/*   */   
/*   */   public void getRenderables(fQ paramfQ, Lc paramLc) {
/*   */     Hc0 hc0 = this.batches.r30();
/*   */     while (hasNext())
/*   */       ((ParticleBatch)next()).getRenderables(paramfQ, paramLc); 
/*   */   }
/*   */   
/*   */   public ParticleControllerExt findController(String paramString) {
/*   */     byte b = 0;
/*   */     int i = (getControllers()).Z8;
/*   */     while (b < i) {
/*   */       ParticleControllerExt particleControllerExt;
/*   */       if ((particleControllerExt = (ParticleControllerExt)getControllers().get(b)).name.equals(paramString))
/*   */         return particleControllerExt; 
/*   */       b++;
/*   */     } 
/*   */     return null;
/*   */   }
/*   */   
/*   */   public void setBatches(fQ paramfQ) {
/*   */     this.batches = paramfQ;
/*   */   }
/*   */   
/*   */   public fQ getBatches() {
/*   */     return this.batches;
/*   */   }
/*   */   
/*   */   public int getBatchBufferedCount() {
/*   */     int i = 0;
/*   */     Hc0 hc0 = this.batches.r30();
/*   */     while (hc0.hasNext())
/*   */       i = ((BillboardParticleBatchExt)hc0.next()).getBufferedCount() + i; 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public int getBatchSize() {
/*   */     return this.batches.Z8;
/*   */   }
/*   */   
/*   */   public boolean isLoaded() {
/*   */     return (this.manager != null);
/*   */   }
/*   */   
/*   */   public void setLoaded(sz0 paramsz0, String paramString) {
/*   */     this.manager = paramsz0;
/*   */     this.managerFileName = paramString;
/*   */   }
/*   */   
/*   */   public boolean isInitialized() {
/*   */     return this.initialized;
/*   */   }
/*   */   
/*   */   public void addResource(iq0 paramiq0) {
/*   */     this.disposables.Com3(paramiq0);
/*   */   }
/*   */   
/*   */   public String path() {
/*   */     return this.managerFileName;
/*   */   }
/*   */   
/*   */   public String debugInfo() {
/*   */     return this.managerFileName + " parent = " + this.parent + " initialized = " + this.initialized;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */