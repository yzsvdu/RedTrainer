/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.emitters;public class TrailEmitter extends RegularEmitter { public void spawn(eo parameo, ParallelArray.FloatChannel paramFloatChannel1, int paramInt1, ParallelArray.FloatChannel paramFloatChannel2, int paramInt2, ParallelArray.FloatChannel paramFloatChannel3, int paramInt3) { ParticleController particleController; int i = (int)((particleController = this.controller).deltaTime * 1000.0F); this.emissionDelta = i = this.emissionDelta + i; if (i >= this.delay) { this.emissionDelta = 0; int j; if ((j = Math.min(this.emissionDiff, this.maxParticleCount - particleController.particles.size)) <= 0) return;  for (Hc0 hc0 = this.controller.influencers.r30(); hc0.hasNext(); ) { float f; Influencer influencer; if (influencer = (Influencer)hc0.next() instanceof TrailSpawnInfluencerExt) { eo1.getClass(); f = parameo.x; float f1 = parameo.y, f2 = parameo.z; eo eo1; (eo1 = ((TrailSpawnInfluencerExt)influencer).spawnPosition).TG0(f, f1, f2); ((TrailSpawnInfluencerExt)influencer)
/* 2 */             .positionChannelParent = null; ((TrailSpawnInfluencerExt)influencer).parentColor = paramFloatChannel2; ((TrailSpawnInfluencerExt)influencer).parentColorOffset = paramInt2; ((TrailSpawnInfluencerExt)influencer).parentRotation = paramFloatChannel3; ((TrailSpawnInfluencerExt)influencer).parentRotationOffset = paramInt3; continue; }  if (f instanceof ScaleXYInfluencer) { ((ScaleXYInfluencer)f).parentScale = paramFloatChannel1; ((ScaleXYInfluencer)f).parentScaleOffset = paramInt1; }  }  this.controller.activateParticles(this.controller.particles.size, j); this.controller.particles.size += j;
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public TrailEmitter() {
/*   */     setEmissionMode(RegularEmitter.EmissionMode.Disabled);
/*   */   }
/*   */   
/*   */   public TrailEmitter(RegularEmitter paramRegularEmitter) {
/*   */     super(paramRegularEmitter);
/*   */     setEmissionMode(RegularEmitter.EmissionMode.Disabled);
/*   */   }
/*   */   
/*   */   public void init() {
/*   */     super.init();
/*   */     this.emissionDelta = (int)this.delay;
/*   */   }
/*   */   
/*   */   public void activate(ParallelArray.FloatChannel paramFloatChannel1, ParallelArray.FloatChannel paramFloatChannel2, int paramInt1, int paramInt2) {
/*   */     this.controller.activateParticles(paramInt1, paramInt2);
/*   */     this.controller.particles.size += paramInt2;
/*   */     Hc0 hc0 = this.controller.influencers.r30();
/*   */     while (hasNext()) {
/*   */       Influencer influencer;
/*   */       if (influencer = (Influencer)next() instanceof TrailSpawnInfluencerExt) {
/*   */         ((TrailSpawnInfluencerExt)influencer).positionChannelParent = paramFloatChannel1;
/*   */         continue;
/*   */       } 
/*   */       if (influencer instanceof ScaleXYInfluencer)
/*   */         ((ScaleXYInfluencer)influencer).parentScale = paramFloatChannel2; 
/*   */     } 
/*   */   }
/*   */   
/*   */   public ParticleController getController() {
/*   */     return this.controller;
/*   */   }
/*   */   
/*   */   public ParticleControllerComponent copy() {
/*   */     return new TrailEmitter(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/emitters/TrailEmitter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */