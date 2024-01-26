/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public abstract class SimpleInfluencer extends Influencer { public void activateParticles(int paramInt1, int paramInt2) { if (!this.value.isRelative()) { int i; for (paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.valueChannel).strideSize), i = paramInt1 * ((ParallelArray.Channel)this.interpolationChannel).strideSize, paramInt1 = paramInt2 * paramInt1 + paramInt2; paramInt2 < paramInt1; ) { float f1 = this.value.newLowValue(), f2 = this.value.newHighValue() - f1; this.interpolationChannel.data[i + 0] = f1; this.interpolationChannel.data[i + 1] = f2; this.valueChannel.data[paramInt2] = oh.Zn(this.value, 0.0F, f2, f1); paramInt2 += 
/* 2 */           ((ParallelArray.Channel)this.valueChannel).strideSize; i += ((ParallelArray.Channel)this.interpolationChannel).strideSize; }  } else { int i; for (paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.valueChannel).strideSize), i = paramInt1 * ((ParallelArray.Channel)this.interpolationChannel).strideSize, paramInt1 = paramInt2 * paramInt1 + paramInt2; paramInt2 < paramInt1; ) { float f1 = this.value.newLowValue(), f2 = this.value.newHighValue(); this.interpolationChannel.data[i + 0] = f1; this.interpolationChannel.data[i + 1] = f2; this.valueChannel.data[paramInt2] = 
/* 3 */           oh.Zn(this.value, 0.0F, f2, f1);
/* 4 */         paramInt2 += ((ParallelArray.Channel)this.valueChannel).strideSize; i += ((ParallelArray.Channel)this.interpolationChannel).strideSize; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public ScaledNumericValue value;
/*   */   public ParallelArray.FloatChannel valueChannel;
/*   */   public ParallelArray.FloatChannel interpolationChannel;
/*   */   public ParallelArray.FloatChannel lifeChannel;
/*   */   public ParallelArray.ChannelDescriptor valueChannelDescriptor;
/*   */   
/*   */   public SimpleInfluencer() {
/*   */     this();
/*   */     this.value = scaledNumericValue;
/*   */     ScaledNumericValue scaledNumericValue;
/*   */     (scaledNumericValue = new ScaledNumericValue()).setHigh(1.0F);
/*   */   }
/*   */   
/*   */   public SimpleInfluencer(SimpleInfluencer paramSimpleInfluencer) {
/*   */     this();
/*   */     set(paramSimpleInfluencer);
/*   */   }
/*   */   
/*   */   private void set(SimpleInfluencer paramSimpleInfluencer) {
/*   */     this.value.load(paramSimpleInfluencer.value);
/*   */     this.valueChannelDescriptor = paramSimpleInfluencer.valueChannelDescriptor;
/*   */   }
/*   */   
/*   */   public void allocateChannels() {
/*   */     this.valueChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(this.valueChannelDescriptor);
/*   */     ParallelArray.ChannelDescriptor channelDescriptor;
/*   */     (channelDescriptor = ParticleChannels.Interpolation).id = this.controller.particleChannels.newId();
/*   */     this.interpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(channelDescriptor);
/*   */     this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
/*   */   }
/*   */   
/*   */   public void update() {
/*   */     byte b1;
/*   */     byte b2;
/*   */     int i;
/*   */     int j;
/*   */     for (b1 = 0, b2 = 0, i = 2, j = this.controller.particles.size * ((ParallelArray.Channel)this.valueChannel).strideSize + b1; b1 < j; ) {
/*   */       float f1 = this.interpolationChannel.data[b2 + 0], f2 = this.interpolationChannel.data[b2 + 1];
/*   */       this.valueChannel.data[b1] = oh.Zn(this.value, this.lifeChannel.data[i], f2, f1);
/*   */       int k = b1 + ((ParallelArray.Channel)this.valueChannel).strideSize, m = b2 + ((ParallelArray.Channel)this.interpolationChannel).strideSize;
/*   */       i += ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*   */     } 
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     paramIt.Jv0(this.value, "value");
/*   */   }
/*   */   
/*   */   public void read(It paramIt, bM0 parambM0) {
/*   */     this.value = (ScaledNumericValue)COm9.aD0(paramIt, parambM0, "value", ScaledNumericValue.class, null);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/SimpleInfluencer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */