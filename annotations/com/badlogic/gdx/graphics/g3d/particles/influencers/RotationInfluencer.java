/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public class RotationInfluencer extends SimpleInfluencer { public void activateParticles(int paramInt1, int paramInt2) { if (this.value.isRelative()) { int i; for (paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.valueChannel).strideSize), i = paramInt1 * ((ParallelArray.Channel)this.interpolationChannel).strideSize, paramInt1 = paramInt2 * paramInt1 + paramInt2; paramInt2 < paramInt1; ) { float f1 = this.valueX.newLowValue() * this.controller.scale.x, f2 = this.valueX.newHighValue() * this.controller.scale.x, f3 = this.valueY.newLowValue() * this.controller.scale.x, f4 = this.valueY.newHighValue() * this.controller.scale.x; this.interpolationChannel.data[i + 0] = f1; this.interpolationChannel.data[i + 1] = f2; this.valueChannel.data[paramInt2 + 0] = l30.COn(this.valueX, 0.0F, f2, f1);
/* 2 */         this.valueChannel.data[paramInt2 + 1] = 
/* 3 */           l30.COn(this.valueY, 0.0F, f4, f3);
/* 4 */         paramInt2 += ((ParallelArray.Channel)this.valueChannel).strideSize; i += ((ParallelArray.Channel)this.interpolationChannel).strideSize; }  } else { int i; for (paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.valueChannel).strideSize), i = paramInt1 * ((ParallelArray.Channel)this.interpolationChannel).strideSize, paramInt1 = paramInt2 * paramInt1 + paramInt2; paramInt2 < paramInt1; ) { float f1 = this.valueX.newLowValue() * this.controller.scale.x, f2 = this.valueX.newHighValue() * this.controller.scale.x - f1, f3 = this.valueY.newLowValue() * this.controller.scale.y, f4 = this.valueY.newHighValue() * this.controller.scale.y - f3; arrayOfFloat[i + 0] = f1; arrayOfFloat[i + 1] = f2; arrayOfFloat[i + 2] = f3; float[] arrayOfFloat; (arrayOfFloat = this.interpolationChannel.data)[i + 3] = f4; this.valueChannel.data[paramInt2 + 0] = 
/* 5 */           l30.COn(this.valueX, 0.0F, f2, f1);
/* 6 */         this.valueChannel.data[paramInt2 + 1] = 
/* 7 */           l30.COn(this.valueY, 0.0F, f4, f3);
/* 8 */         paramInt2 += ((ParallelArray.Channel)this.valueChannel).strideSize; i += ((ParallelArray.Channel)this.interpolationChannel).strideSize; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public ScaledNumericValueExt valueX;
/*   */   public ScaledNumericValueExt valueY;
/*   */   
/*   */   public RotationInfluencer() {
/*   */     (this.valueX = new ScaledNumericValueExt()).setHigh(1.0F);
/*   */     (this.valueY = new ScaledNumericValueExt()).setHigh(1.0F);
/*   */     this.valueChannelDescriptor = ParticleChannelsExt.ScaleXY;
/*   */   }
/*   */   
/*   */   public RotationInfluencer(RotationInfluencer paramRotationInfluencer) {
/*   */     this();
/*   */     set(paramRotationInfluencer);
/*   */   }
/*   */   
/*   */   private void set(RotationInfluencer paramRotationInfluencer) {
/*   */     this.valueX.load((ScaledNumericValue)paramRotationInfluencer.valueX);
/*   */     this.valueY.load((ScaledNumericValue)paramRotationInfluencer.valueY);
/*   */     this.valueChannelDescriptor = paramRotationInfluencer.valueChannelDescriptor;
/*   */   }
/*   */   
/*   */   public void allocateChannels() {
/*   */     super.allocateChannels();
/*   */     ParallelArray.ChannelDescriptor channelDescriptor;
/*   */     (channelDescriptor = ParticleChannels.Interpolation4).id = this.controller.particleChannels.newId();
/*   */     this.interpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(channelDescriptor);
/*   */   }
/*   */   
/*   */   public void update() {
/*   */     byte b1;
/*   */     byte b2;
/*   */     int i;
/*   */     int j;
/*   */     for (b1 = 0, b2 = 0, i = 2, j = this.controller.particles.size * ((ParallelArray.Channel)this.valueChannel).strideSize + b1; b1 < j; ) {
/*   */       float f3 = this.interpolationChannel.data[b2 + 0], f4 = this.interpolationChannel.data[b2 + 1];
/*   */       this.valueChannel.data[b1 + 0] = l30.COn(this.valueX, this.lifeChannel.data[i], f4, f3);
/*   */       float f1 = this.interpolationChannel.data[b2 + 2], f2 = this.interpolationChannel.data[b2 + 3];
/*   */       this.valueChannel.data[b1 + 1] = l30.COn(this.valueY, this.lifeChannel.data[i], f2, f1);
/*   */       int k = b1 + ((ParallelArray.Channel)this.valueChannel).strideSize, m = b2 + ((ParallelArray.Channel)this.interpolationChannel).strideSize;
/*   */       i += ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*   */     } 
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     paramIt.Jv0(this.valueX, "valuex");
/*   */     paramIt.Jv0(this.valueY, "valuey");
/*   */   }
/*   */   
/*   */   public void read(It paramIt, bM0 parambM0) {
/*   */     this.valueX = (ScaledNumericValueExt)COm9.aD0(paramIt, parambM0, "valuex", ScaledNumericValueExt.class, null);
/*   */     bM0 bM01 = parambM0.Jb("valuey");
/*   */     this.valueY = (ScaledNumericValueExt)paramIt.Uj0(ScaledNumericValueExt.class, null, this);
/*   */   }
/*   */   
/*   */   public ParticleControllerComponent copy() {
/*   */     return new RotationInfluencer(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/RotationInfluencer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */