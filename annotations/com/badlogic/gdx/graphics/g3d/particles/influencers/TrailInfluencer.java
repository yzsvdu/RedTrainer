/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public class TrailInfluencer extends Influencer { public void read(It paramIt, bM0 parambM0) { if (parambM0.Ua("background")) this
/* 2 */         .isBackSprite = ((Boolean)COm9.aD0(paramIt, parambM0, "background", Boolean.class, null)).booleanValue();  }
/*   */ 
/*   */   
/*   */   private ParallelArray.FloatChannel posChannel;
/*   */   private ParallelArray.FloatChannel scaleChannel;
/*   */   private ParallelArray.FloatChannel colorChannel;
/*   */   private ParallelArray.FloatChannel rotationChannel;
/*   */   public TrailEmitter emitter;
/*   */   public boolean isBackSprite = false;
/*   */   public boolean copyRotation;
/*   */   
/*   */   public TrailInfluencer() {}
/*   */   
/*   */   public TrailInfluencer(TrailInfluencer paramTrailInfluencer) {
/*   */     this.isBackSprite = paramTrailInfluencer.isBackSprite;
/*   */   }
/*   */   
/*   */   public void setEmitter(TrailEmitter paramTrailEmitter) {
/*   */     this.emitter = paramTrailEmitter;
/*   */   }
/*   */   
/*   */   public void init() {
/*   */     super.init();
/*   */   }
/*   */   
/*   */   public void allocateChannels() {
/*   */     super.allocateChannels();
/*   */     this.posChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Position);
/*   */     this.scaleChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannelsExt.ScaleXY);
/*   */     this.colorChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Color);
/*   */     this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Rotation2D);
/*   */   }
/*   */   
/*   */   public void start() {
/*   */     super.start();
/*   */   }
/*   */   
/*   */   public void update() {
/*   */     super.update();
/*   */     if (this.emitter == null)
/*   */       return; 
/*   */     int i = 0;
/*   */     int j = 0;
/*   */     int k = 0;
/*   */     int m = 0;
/*   */     int n = this.controller.particles.size * ((ParallelArray.Channel)this.posChannel).strideSize + i;
/*   */     while (i < n) {
/*   */       float f4;
/*   */       eo eo = ParticleControllerComponent.TMP_V1;
/*   */       float f1 = arrayOfFloat[i + 0];
/*   */       float f2 = arrayOfFloat[i + 1];
/*   */       float[] arrayOfFloat;
/*   */       float f3 = (arrayOfFloat = this.posChannel.data)[i + 2];
/*   */       if (this.isBackSprite) {
/*   */         f4 = 0.0125F;
/*   */       } else {
/*   */         f4 = -0.0125F;
/*   */       } 
/*   */       eo.TG0(f1, f2, f3 + f4);
/*   */       ParallelArray.FloatChannel floatChannel1 = this.scaleChannel;
/*   */       ParallelArray.FloatChannel floatChannel2 = this.colorChannel;
/*   */       ParallelArray.FloatChannel floatChannel3 = this.rotationChannel;
/*   */       this.emitter.spawn(eo, floatChannel1, j, floatChannel2, k, floatChannel3, m);
/*   */       if ((floatChannel1 = this.scaleChannel) != null)
/*   */         j += ((ParallelArray.Channel)floatChannel1).strideSize; 
/*   */       if ((floatChannel1 = this.colorChannel) != null)
/*   */         k += ((ParallelArray.Channel)floatChannel1).strideSize; 
/*   */       if ((floatChannel1 = this.rotationChannel) != null)
/*   */         m += ((ParallelArray.Channel)floatChannel1).strideSize; 
/*   */       i += ((ParallelArray.Channel)this.posChannel).strideSize;
/*   */     } 
/*   */   }
/*   */   
/*   */   public void activateParticles(int paramInt1, int paramInt2) {
/*   */     super.activateParticles(paramInt1, paramInt2);
/*   */   }
/*   */   
/*   */   public TrailInfluencer copy() {
/*   */     return new TrailInfluencer(this);
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     paramIt.Jv0(Boolean.valueOf(this.isBackSprite), "background");
/*   */   }
/*   */   
/*   */   public void save(sz0 paramsz0, ResourceData paramResourceData) {}
/*   */   
/*   */   public void load(sz0 paramsz0, ResourceData paramResourceData) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/TrailInfluencer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */