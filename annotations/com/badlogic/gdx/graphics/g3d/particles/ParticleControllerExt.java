/*  1 */ package com.badlogic.gdx.graphics.g3d.particles;public class ParticleControllerExt extends ParticleController { public void read(It paramIt, bM0 parambM0) { if (parambM0.Ua("type")) this
/*  2 */         .type = (APSType)COm9.aD0(paramIt, parambM0, "type", APSType.class, null);  this
/*    */       
/*  4 */       .aps_id = ((Integer)COm9.aD0(paramIt, parambM0, "aps", Integer.class, null)).intValue();
/*  5 */     bM0 bM01 = parambM0.Jb("aps_texture_range");
/*  6 */     this.aps_texture_range = (RangedNumericValue)paramIt.Uj0(RangedNumericValue.class, null, bM01); if (parambM0.Ua("repeat_x"))
/*  7 */     { bM01 = parambM0.Jb("repeat_x");
/*  8 */       this.repeat_x = ((Boolean)paramIt.Uj0(Boolean.class, null, bM01)).booleanValue(); }  if (parambM0.Ua("repeat_y"))
/*  9 */     { bM01 = parambM0.Jb("repeat_y");
/* 10 */       this.repeat_y = ((Boolean)paramIt.Uj0(Boolean.class, null, bM01)).booleanValue(); }  if (parambM0.Ua("flip_x"))
/* 11 */     { bM01 = parambM0.Jb("flip_x");
/* 12 */       this.flip_x = ((Boolean)paramIt.Uj0(Boolean.class, null, bM01)).booleanValue(); }  if (parambM0.Ua("flip_y"))
/* 13 */     { bM01 = parambM0.Jb("flip_y");
/* 14 */       this.flip_y = ((Boolean)paramIt.Uj0(Boolean.class, null, bM01)).booleanValue(); }  if (parambM0.Ua("mix"))
/* 15 */     { bM01 = parambM0.Jb("mix");
/* 16 */       this.mix = ((Boolean)paramIt.Uj0(Boolean.class, null, bM01)).booleanValue(); }  if (parambM0.Ua("avg"))
/* 17 */     { bM01 = parambM0.Jb("avg");
/* 18 */       this.avg = ((Boolean)paramIt.Uj0(Boolean.class, null, bM01)).booleanValue(); }  if (parambM0.Ua("trailController"))
/* 19 */     { bM01 = parambM0.Jb("trailController");
/* 20 */       this.trailController = ((Integer)paramIt.Uj0(Integer.class, null, bM01)).intValue(); }  super.read(paramIt, parambM0); }
/*    */ 
/*    */   
/*    */   public RangedNumericValue aps_texture_range = new RangedNumericValue();
/*    */   public APSType type = APSType.DEFAULT;
/*    */   public int aps_id = 5;
/*    */   public boolean repeat_x = false;
/*    */   public boolean repeat_y = false;
/*    */   public boolean flip_x = false;
/*    */   public boolean flip_y = false;
/*    */   public boolean mix = false;
/*    */   public boolean avg = false;
/*    */   public int trailController = -1;
/*    */   private boolean isChild = false;
/*    */   private ParticleControllerExt child;
/*    */   
/*    */   public ParticleControllerExt() {
/*    */     this.mix = false;
/*    */     this.avg = false;
/*    */     this.trailController = -1;
/*    */   }
/*    */   
/*    */   public ParticleControllerExt(String paramString, Emitter paramEmitter, ParticleControllerRenderer paramParticleControllerRenderer, Influencer... paramVarArgs) {
/*    */     super(paramString, paramEmitter, paramParticleControllerRenderer, paramVarArgs);
/*    */     this.mix = false;
/*    */     this.avg = false;
/*    */     this.trailController = -1;
/*    */   }
/*    */   
/*    */   private void setTimeStep(float paramFloat) {
/*    */     this.deltaTime = paramFloat;
/*    */     this.deltaTimeSqr = paramFloat * paramFloat;
/*    */   }
/*    */   
/*    */   public void update(float paramFloat) {
/*    */     setTimeStep(paramFloat);
/*    */     this.emitter.update();
/*    */     Hc0 hc0 = this.influencers.r30();
/*    */     while (hasNext())
/*    */       ((Influencer)next()).update(); 
/*    */   }
/*    */   
/*    */   public void updateTrailController(ParticleControllerExt paramParticleControllerExt) {
/*    */     this.child = paramParticleControllerExt;
/*    */   }
/*    */   
/*    */   public void start() {
/*    */     super.start();
/*    */     if (this.child != null) {
/*    */       Hc0 hc0 = this.influencers.r30();
/*    */       while (hc0.hasNext()) {
/*    */         Influencer influencer;
/*    */         Emitter emitter;
/*    */         if (influencer = (Influencer)hc0.next() instanceof TrailInfluencer && emitter = this.child.emitter instanceof TrailEmitter)
/*    */           ((TrailInfluencer)influencer).emitter = (TrailEmitter)emitter; 
/*    */       } 
/*    */     } else {
/*    */       Hc0 hc0 = this.influencers.r30();
/*    */       while (hasNext()) {
/*    */         Influencer influencer;
/*    */         if (influencer = (Influencer)next() instanceof TrailInfluencer)
/*    */           ((TrailInfluencer)influencer).emitter = null; 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void write(It paramIt) {
/*    */     paramIt.Jv0(this.type, "type");
/*    */     paramIt.Jv0(Integer.valueOf(this.aps_id), "aps");
/*    */     paramIt.Jv0(this.aps_texture_range, "aps_texture_range");
/*    */     paramIt.Jv0(Boolean.valueOf(this.repeat_x), "repeat_x");
/*    */     paramIt.Jv0(Boolean.valueOf(this.repeat_y), "repeat_y");
/*    */     paramIt.Jv0(Boolean.valueOf(this.flip_x), "flip_x");
/*    */     paramIt.Jv0(Boolean.valueOf(this.flip_y), "flip_y");
/*    */     paramIt.Jv0(Boolean.valueOf(this.mix), "mix");
/*    */     paramIt.Jv0(Boolean.valueOf(this.avg), "avg");
/*    */     paramIt.Jv0(Integer.valueOf(this.trailController), "trailController");
/*    */     super.write(paramIt);
/*    */   }
/*    */   
/*    */   public ParticleControllerExt copy() {
/*    */     Emitter emitter = (Emitter)this.emitter.copy();
/*    */     Influencer[] arrayOfInfluencer = new Influencer[this.influencers.Z8];
/*    */     byte b = 0;
/*    */     Hc0 hc0 = this.influencers.r30();
/*    */     while (hc0.hasNext()) {
/*    */       b++;
/*    */       arrayOfInfluencer[b] = (Influencer)((Influencer)hc0.next()).copy();
/*    */     } 
/*    */     this(this.name, emitter, (ParticleControllerRenderer)this.renderer.copy(), arrayOfInfluencer);
/*    */     particleControllerExt.type = this.type;
/*    */     particleControllerExt.aps_id = this.aps_id;
/*    */     particleControllerExt.aps_texture_range.setLow(this.aps_texture_range.getLowMin(), this.aps_texture_range.getLowMax());
/*    */     particleControllerExt.repeat_x = this.repeat_x;
/*    */     particleControllerExt.repeat_y = this.repeat_y;
/*    */     particleControllerExt.flip_x = this.flip_x;
/*    */     particleControllerExt.flip_y = this.flip_y;
/*    */     particleControllerExt.mix = this.mix;
/*    */     particleControllerExt.avg = this.avg;
/*    */     ParticleControllerExt particleControllerExt;
/*    */     (particleControllerExt = new ParticleControllerExt()).trailController = this.trailController;
/*    */     return new ParticleControllerExt();
/*    */   }
/*    */   
/*    */   public void dispose() {
/*    */     this.renderer.dispose();
/*    */     this.emitter.dispose();
/*    */     Hc0 hc0 = this.influencers.r30();
/*    */     while (hasNext())
/*    */       ((Influencer)next()).dispose(); 
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   public void setRenderer(ParticleControllerRenderer paramParticleControllerRenderer) {
/*    */     this.renderer = paramParticleControllerRenderer;
/*    */   }
/*    */   
/*    */   public BillboardRendererExt getRenderer() {
/*    */     return (BillboardRendererExt)this.renderer;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */