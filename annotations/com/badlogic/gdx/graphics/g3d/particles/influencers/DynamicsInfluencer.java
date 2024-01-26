/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public class DynamicsInfluencer extends Influencer { public void update() { if (this.hasAcceleration) { ParallelArray.FloatChannel floatChannel; Arrays.fill((floatChannel = this.accellerationChannel).data, 0, this.controller.particles.size * ((ParallelArray.Channel)floatChannel).strideSize, 0.0F); }  if (this.has2dAngularVelocity || this.has3dAngularVelocity) { ParallelArray.FloatChannel floatChannel; Arrays.fill((floatChannel = this.angularVelocityChannel).data, 0, this.controller.particles.size * ((ParallelArray.Channel)floatChannel).strideSize, 0.0F); }  byte b; fQ fQ1; for (b = 0; b < (fQ1 = this.velocities).Z8; ) { ((DynamicsModifier[])fQ1.Uq0)[b].update(); b++; }  if (this.hasAcceleration) { int i; ParticleController particleController; for (b = 0, i = 0; b < (particleController = this.controller).particles.size; ) { int m; float f5 = arrayOfFloat1[m = i + 1], f6 = arrayOfFloat1[i += 2]; float[] arrayOfFloat1; int k; float f4, f7 = (f4 = (arrayOfFloat1 = this.positionChannel.data)[k = i + 0]) * 2.0F; f4 = f7 - arrayOfFloat3[k]; float f2; arrayOfFloat1[k] = arrayOfFloat2[k] * (f2 = particleController.deltaTimeSqr) + f4; float f3 = f5 * 2.0F - arrayOfFloat3[m]; arrayOfFloat1[m] = arrayOfFloat2[m] * f2 + f3; float f1 = f6 * 2.0F - arrayOfFloat3[i]; float[] arrayOfFloat2; arrayOfFloat1[i] = (arrayOfFloat2 = this.accellerationChannel.data)[i] * f2 + f1; arrayOfFloat3[k] = f4; arrayOfFloat3[m] = f5; float[] arrayOfFloat3; (arrayOfFloat3 = this.previousPositionChannel.data)[i] = f6; b++; int j = i + ((ParallelArray.Channel)this.positionChannel).strideSize; }  }  if (this.has2dAngularVelocity) { int i; ParticleController particleController; for (b = 0, i = 0; b < (particleController = this.controller).particles.size; ) { float f; if ((f = this.angularVelocityChannel.data[b] * particleController.deltaTime) != 0.0F) { f = nx0.Tu0(f); float f1 = nx0.nH(f); float[] arrayOfFloat; int k; float f3 = (arrayOfFloat = this.rotationChannel.data)[k = i + 0]; f = f3 * f - f2 * f1; int j; float f2; f1 = (f2 = arrayOfFloat[j = i + 1]) * f; f1 = f3 * f1 + f1; this.rotationChannel.data[k] = f; this.rotationChannel.data[j] = f1; }  b++; i += ((ParallelArray.Channel)this.rotationChannel).strideSize; }  } else if (this.has3dAngularVelocity) { int i; byte b1; for (b = 0, i = 0, b1 = 0; b < this.controller.particles.size; ) { float f1 = arrayOfFloat2[b1 + 0], f2 = arrayOfFloat2[b1 + 1]; float arrayOfFloat2[], f3 = (arrayOfFloat2 = this.angularVelocityChannel.data)[b1 + 2]; int k; float f4 = this.rotationChannel.data[k = i + 0]; int m; float f5 = this.rotationChannel.data[m = i + 1]; int n; float f6 = this.rotationChannel.data[n = i + 2], f7 = this.rotationChannel.data[i += 3]; f2 = this.controller.deltaTime * 0.5F; TG0 tG01, tG02; f3 = (tG01 = (tG02 = ParticleControllerComponent.TMP_Q).vp0(f1, f2, f3, 0.0F).pb(f4, f5, f6, f7)).D80 * f2; float f8 = ((tG02 = ParticleControllerComponent.TMP_Q).vp0(f1, f2, f3, 0.0F).pb(f4, f5, f6, f7)).tb0 * f2, f9 = ((tG02 = ParticleControllerComponent.TMP_Q).vp0(f1, f2, f3, 0.0F).pb(f4, f5, f6, f7)).z60 * f2; tG01
/* 2 */           .D80 = f3 + f4; tG01.tb0 = f8 + f5; tG01.z60 = f9 + f6; ((tG02 = ParticleControllerComponent.TMP_Q).vp0(f1, f2, f3, 0.0F).pb(f4, f5, f6, f7)).AD = ((tG02 = ParticleControllerComponent.TMP_Q).vp0(f1, f2, f3, 0.0F).pb(f4, f5, f6, f7)).AD * f2 + f7;
/* 3 */         (tG02 = ParticleControllerComponent.TMP_Q).vp0(f1, f2, f3, 0.0F).pb(f4, f5, f6, f7).v7(); arrayOfFloat1[k] = tG02.D80; arrayOfFloat1[m] = tG02.tb0; arrayOfFloat1[n] = tG02.z60; float[] arrayOfFloat1; (arrayOfFloat1 = this.rotationChannel.data)[i] = tG02.AD; b++; i += ((ParallelArray.Channel)this.rotationChannel).strideSize; int j = b1 + ((ParallelArray.Channel)this.angularVelocityChannel).strideSize; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public fQ velocities;
/*   */   private ParallelArray.FloatChannel accellerationChannel;
/*   */   private ParallelArray.FloatChannel positionChannel;
/*   */   private ParallelArray.FloatChannel previousPositionChannel;
/*   */   private ParallelArray.FloatChannel rotationChannel;
/*   */   private ParallelArray.FloatChannel angularVelocityChannel;
/*   */   public boolean hasAcceleration;
/*   */   public boolean has2dAngularVelocity;
/*   */   public boolean has3dAngularVelocity;
/*   */   
/*   */   public DynamicsInfluencer() {
/*   */     fQ fQ1;
/*   */     this(true, 3, DynamicsModifier.class);
/*   */     this.velocities = this;
/*   */   }
/*   */   
/*   */   public DynamicsInfluencer(DynamicsModifier... paramVarArgs) {
/*   */     fQ fQ1;
/*   */     this(true, paramVarArgs.length, DynamicsModifier.class);
/*   */     this.velocities = fQ1;
/*   */     int i = paramVarArgs.length;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       DynamicsModifier dynamicsModifier = paramVarArgs[b];
/*   */       this.velocities.Com3(dynamicsModifier.copy());
/*   */     } 
/*   */   }
/*   */   
/*   */   public DynamicsInfluencer(DynamicsInfluencer paramDynamicsInfluencer) {
/*   */     this((DynamicsModifier[])paramDynamicsInfluencer.velocities.Ib(DynamicsModifier.class));
/*   */   }
/*   */   
/*   */   public void allocateChannels() {
/*   */     byte b;
/*   */     fQ fQ1;
/*   */     for (b = 0; b < (fQ1 = this.velocities).Z8; b++)
/*   */       ((DynamicsModifier[])fQ1.Uq0)[b].allocateChannels(); 
/*   */     if ((this.accellerationChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.Acceleration)) != null) {
/*   */       b = 1;
/*   */     } else {
/*   */       b = 0;
/*   */     } 
/*   */     this.hasAcceleration = b;
/*   */     if (b != 0) {
/*   */       this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
/*   */       this.previousPositionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
/*   */     } 
/*   */     if ((this.angularVelocityChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.AngularVelocity2D)) != null) {
/*   */       b = 1;
/*   */     } else {
/*   */       b = 0;
/*   */     } 
/*   */     this.has2dAngularVelocity = b;
/*   */     if (b != 0) {
/*   */       this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D);
/*   */       this.has3dAngularVelocity = false;
/*   */     } else {
/*   */       if ((this.angularVelocityChannel = (ParallelArray.FloatChannel)this.controller.particles.getChannel(ParticleChannels.AngularVelocity3D)) != null) {
/*   */         b = 1;
/*   */       } else {
/*   */         b = 0;
/*   */       } 
/*   */       this.has3dAngularVelocity = b;
/*   */       if (b != 0)
/*   */         this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation3D); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public void set(ParticleController paramParticleController) {
/*   */     super.set(paramParticleController);
/*   */     fQ fQ1;
/*   */     for (byte b = 0; b < (fQ1 = this.velocities).Z8; b++)
/*   */       ((DynamicsModifier[])fQ1.Uq0)[b].set(paramParticleController); 
/*   */   }
/*   */   
/*   */   public void init() {
/*   */     fQ fQ1;
/*   */     for (byte b = 0; b < (fQ1 = this.velocities).Z8; b++)
/*   */       ((DynamicsModifier[])fQ1.Uq0)[b].init(); 
/*   */   }
/*   */   
/*   */   public void activateParticles(int paramInt1, int paramInt2) {
/*   */     if (this.hasAcceleration) {
/*   */       int i;
/*   */       int j = paramInt1 * (i = ((ParallelArray.Channel)this.positionChannel).strideSize);
/*   */       i = paramInt2 * i + j;
/*   */       while (j < i) {
/*   */         int m = j + 0;
/*   */         arrayOfFloat1[m] = arrayOfFloat2[m];
/*   */         int k;
/*   */         arrayOfFloat1[k] = arrayOfFloat2[k = j + 1];
/*   */         float[] arrayOfFloat1;
/*   */         ParallelArray.FloatChannel floatChannel;
/*   */         float[] arrayOfFloat2;
/*   */         (arrayOfFloat1 = this.previousPositionChannel.data)[j] = (arrayOfFloat2 = (floatChannel = this.positionChannel).data)[j += 2];
/*   */         j += ((ParallelArray.Channel)floatChannel).strideSize;
/*   */       } 
/*   */     } 
/*   */     if (this.has2dAngularVelocity) {
/*   */       int i;
/*   */       int j = paramInt1 * (i = ((ParallelArray.Channel)this.rotationChannel).strideSize);
/*   */       i = paramInt2 * i + j;
/*   */       while (j < i) {
/*   */         this.rotationChannel.data[j + 0] = 1.0F;
/*   */         this.rotationChannel.data[j + 1] = 0.0F;
/*   */         j += ((ParallelArray.Channel)this.rotationChannel).strideSize;
/*   */       } 
/*   */     } else if (this.has3dAngularVelocity) {
/*   */       int i;
/*   */       int j = paramInt1 * (i = ((ParallelArray.Channel)this.rotationChannel).strideSize);
/*   */       i = paramInt2 * i + j;
/*   */       while (j < i) {
/*   */         arrayOfFloat[j + 0] = 0.0F;
/*   */         arrayOfFloat[j + 1] = 0.0F;
/*   */         arrayOfFloat[j + 2] = 0.0F;
/*   */         float[] arrayOfFloat;
/*   */         (arrayOfFloat = this.rotationChannel.data)[j + 3] = 1.0F;
/*   */         j += ((ParallelArray.Channel)this.rotationChannel).strideSize;
/*   */       } 
/*   */     } 
/*   */     fQ fQ1;
/*   */     for (byte b = 0; b < (fQ1 = this.velocities).Z8; b++)
/*   */       ((DynamicsModifier[])fQ1.Uq0)[b].activateParticles(paramInt1, paramInt2); 
/*   */   }
/*   */   
/*   */   public DynamicsInfluencer copy() {
/*   */     return new DynamicsInfluencer(this);
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     paramIt.Vp0("velocities", this.velocities, fQ.class, DynamicsModifier.class);
/*   */   }
/*   */   
/*   */   public void read(It paramIt, bM0 parambM0) {
/*   */     this.velocities.OG0((fQ)COm9.aD0(paramIt, parambM0, "velocities", fQ.class, DynamicsModifier.class));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/DynamicsInfluencer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */