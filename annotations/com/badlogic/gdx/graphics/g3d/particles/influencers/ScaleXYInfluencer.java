/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public class ScaleXYInfluencer extends SimpleInfluencer { public ScaledNumericValueExt valueX; public ScaledNumericValueExt valueY; private ParallelArray.FloatChannel regionChannel; public ParallelArray.FloatChannel parentScale; public void activateParticles(int paramInt1, int paramInt2) { int i; for (paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.valueChannel).strideSize), i = paramInt1 * ((ParallelArray.Channel)this.interpolationChannel).strideSize, paramInt1 = paramInt2 * paramInt1 + paramInt2; paramInt2 < paramInt1; ) { float f1 = this.valueX.newLowValue() * this.controller.scale.x, f2 = this.valueX.newHighValue() * this.controller.scale.x - f1, f3 = this.valueY.newLowValue() * this.controller.scale.y, f4 = this.valueY.newHighValue() * this.controller.scale.y - f3; this.interpolationChannel.data[i + 0] = f1; this.interpolationChannel.data[i + 1] = f2; if (this.valueX.isRelative()) { this.interpolationChannel.data[i + 2] = f1; this.interpolationChannel.data[i + 3] = f2; } else { this.interpolationChannel.data[i + 2] = f3; this.interpolationChannel.data[i + 3] = f4; }  int j; this.valueChannel.data[j = paramInt2 + 0] = l30.COn(this.valueX, 0.0F, f2, f1); if (this
/* 2 */         .valueX.isRelative()) { this.valueChannel.data[paramInt2 + 1] = 
/* 3 */           l30.COn(this.valueX, 0.0F, f2, f1); }
/* 4 */       else { this.valueChannel.data[paramInt2 + 1] = 
/* 5 */           l30.COn(this.valueY, 0.0F, f4, f3); }
/* 6 */        ParallelArray.FloatChannel floatChannel; if ((floatChannel = this.parentScale) != null) { arrayOfFloat2[j] = arrayOfFloat1[m + 0]; int k = paramInt2 + 1; float[] arrayOfFloat1, arrayOfFloat2; int m; (arrayOfFloat2 = this.staticScale.data)[k] = (arrayOfFloat1 = floatChannel.data)[(m = this.parentScaleOffset) + 1]; arrayOfFloat3[j] = arrayOfFloat3[j] * arrayOfFloat1[m + 0]; float[] arrayOfFloat3; (arrayOfFloat3 = this.valueChannel.data)[k] = arrayOfFloat3[k] * arrayOfFloat1[m + 1]; }  paramInt2 += ((ParallelArray.Channel)this.valueChannel).strideSize; i += ((ParallelArray.Channel)this.interpolationChannel).strideSize; }  } private ParallelArray.FloatChannel staticScale; public int parentScaleOffset; public ScaleXYInfluencer() { (this.valueX = new ScaledNumericValueExt()).setHigh(1.0F); (this.valueY = new ScaledNumericValueExt()).setHigh(1.0F); this.valueChannelDescriptor = ParticleChannelsExt.ScaleXY; } public ScaleXYInfluencer(ScaleXYInfluencer paramScaleXYInfluencer) { this(); set(paramScaleXYInfluencer); } private void set(ScaleXYInfluencer paramScaleXYInfluencer) { this.valueX.load((ScaledNumericValue)paramScaleXYInfluencer.valueX); this.valueY.load((ScaledNumericValue)paramScaleXYInfluencer.valueY); this.valueChannelDescriptor = paramScaleXYInfluencer.valueChannelDescriptor; } public void allocateChannels() { super.allocateChannels(); ParallelArray.ChannelDescriptor channelDescriptor; (channelDescriptor = ParticleChannels.Interpolation4).id = this.controller.particleChannels.newId(); this.interpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(channelDescriptor); this.regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion); this.staticScale = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannelsExt.BaseScaleXY); } public void update() { for (int i = 0, j = 0, k = 2, m = this.controller.particles.size * ((ParallelArray.Channel)this.valueChannel).strideSize + i; i < m; ) { int i1; float f1 = this.interpolationChannel.data[i1 = j + 0]; int i2; float f2 = this.interpolationChannel.data[i2 = j + 1]; int n; this.valueChannel.data[n = i + 0] = l30.COn(this.valueX, this.lifeChannel.data[k], f2, f1); if (this.valueX.isRelative()) { float f = this.interpolationChannel.data[i1]; f1 = this.interpolationChannel.data[i2]; this.valueChannel.data[i + 1] = l30.COn(this.valueX, this.lifeChannel.data[k], f1, f); } else { float f = this.interpolationChannel.data[j + 2]; f1 = this.interpolationChannel.data[j + 3]; this.valueChannel.data[i + 1] = l30.COn(this.valueY, this.lifeChannel.data[k], f1, f); }  if (this.parentScale != null) { float[] arrayOfFloat; this.valueChannel.data[n] = this.valueChannel.data[n] * (arrayOfFloat = this.staticScale.data)[n]; this.valueChannel.data[n] = this.valueChannel.data[n = i + 1] * arrayOfFloat[n]; }  i += ((ParallelArray.Channel)this.valueChannel).strideSize; j += ((ParallelArray.Channel)this.interpolationChannel).strideSize; k += ((ParallelArray.Channel)this.lifeChannel).strideSize; }
/*   */      }
/*   */ 
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
/*   */     return new ScaleXYInfluencer(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/ScaleXYInfluencer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */