/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public abstract class ColorInfluencerExt extends Influencer { public ParallelArray.FloatChannel colorChannel; public void allocateChannels() { this.colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color); } public static class RandomColor extends ColorInfluencer { public ParallelArray.FloatChannel alphaInterpolationChannel; public ParallelArray.FloatChannel lifeChannel; public ParallelArray.IntChannel pathChannel; public fQ alphaValues; public fQ colorValues; public void activateParticles(int param1Int1, int param1Int2) { int i; int j; int k; for (param1Int2 = param1Int1 * (param1Int1 = ((ParallelArray.Channel)this.colorChannel).strideSize), i = param1Int1 * ((ParallelArray.Channel)this.alphaInterpolationChannel).strideSize, j = param1Int1 * ((ParallelArray.Channel)this.lifeChannel).strideSize + 2, k = param1Int1 * ((ParallelArray.Channel)this.pathChannel).strideSize, param1Int1 = param1Int2 * param1Int1 + param1Int2; param1Int2 < param1Int1; ) { int n = nx0.cOM9(this.colorValues.Z8 - 1); ScaledNumericValue scaledNumericValue; float f1 = (scaledNumericValue = (ScaledNumericValue)this.alphaValues.get(n)).newLowValue(), f2 = ((ScaledNumericValue)this.alphaValues.get(n)).newHighValue() - f1; this.pathChannel.data[k] = n; ((GradientColorValue)this.colorValues.get(n)).getColor(0.0F, this.colorChannel.data, param1Int2); param1Int2 += 3; this.colorChannel.data[param1Int2] = oh.Zn(scaledNumericValue, this.lifeChannel.data[j], f2, f1); ParallelArray.FloatChannel floatChannel;
/* 2 */         (floatChannel = this.alphaInterpolationChannel).data[i + 0] = f1; (floatChannel = this.alphaInterpolationChannel).data[i + 1] = f2; i = param1Int2 + ((ParallelArray.Channel)this.colorChannel).strideSize; int m = i + ((ParallelArray.Channel)floatChannel).strideSize; j += ((ParallelArray.Channel)this.lifeChannel).strideSize; k += ((ParallelArray.Channel)this.pathChannel).strideSize; m = i = m; }  } public RandomColor() { fQ fQ1; this(); this.colorValues = this; this(); this.alphaValues = this; add(); } public RandomColor(RandomColor param1RandomColor) { fQ fQ1; this(); this.colorValues = this; this(); this.alphaValues = this; set(param1RandomColor); } public final void add() { this.colorValues.Com3(new GradientColorValue()); this(); ScaledNumericValue scaledNumericValue; (new ScaledNumericValue()).setHigh(1.0F); this.alphaValues.Com3(this); } public final void remove(int param1Int) { if (param1Int <= 0) return;  this.colorValues.Hc(param1Int); this.alphaValues.Hc(param1Int); } public final void set(RandomColor param1RandomColor) { Hc0 hc02 = param1RandomColor.colorValues.r30(); while (hc02.hasNext()) { GradientColorValue gradientColorValue1 = (GradientColorValue)hc02.next(); this(); GradientColorValue gradientColorValue2; (gradientColorValue2 = new GradientColorValue()).load(gradientColorValue1); this.colorValues.Com3(gradientColorValue2); }  Hc0 hc01 = param1RandomColor.alphaValues.r30(); while (hc01.hasNext()) { ScaledNumericValue scaledNumericValue1 = (ScaledNumericValue)hc01.next(); this(); ScaledNumericValue scaledNumericValue2; (scaledNumericValue2 = new ScaledNumericValue()).load(scaledNumericValue1); this.alphaValues.Com3(scaledNumericValue2); }  } public void allocateChannels() { super.allocateChannels(); ParallelArray.ChannelDescriptor channelDescriptor; (channelDescriptor = ParticleChannels.Interpolation).id = this.controller.particleChannels.newId(); this.alphaInterpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(channelDescriptor); this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life); this.pathChannel = (ParallelArray.IntChannel)this.controller.particles.addChannel(ParticleChannelsExt.PathId); } public void update() { int i; byte b1; byte b2; int j; int k; for (i = 0, b1 = 0, b2 = 2, j = this.controller.particles.size * ((ParallelArray.Channel)this.colorChannel).strideSize + i, k = ((ParallelArray.Channel)this.pathChannel).strideSize * i; i < j; ) { float f2 = this.lifeChannel.data[b2]; int i1; fQ fQ1; if ((i1 = this.pathChannel.data[k]) >= (fQ1 = this.alphaValues).Z8) i1 = 0;  ScaledNumericValue scaledNumericValue = (ScaledNumericValue)fQ1.get(i1); ((GradientColorValue)this.colorValues.get(i1)).getColor(f2, this.colorChannel.data, i); i += 3; float f1 = this.alphaInterpolationChannel.data[b1 + 0]; this.colorChannel.data[i] = oh.Zn(scaledNumericValue, f2, this.alphaInterpolationChannel.data[b1 + 1], f1); i += ((ParallelArray.Channel)this.colorChannel).strideSize; int m = b1 + ((ParallelArray.Channel)this.alphaInterpolationChannel).strideSize, n = b2 + ((ParallelArray.Channel)this.lifeChannel).strideSize; k += ((ParallelArray.Channel)this.pathChannel).strideSize; }  } public RandomColor copy() { return new RandomColor(this); } public void write(It param1It) { param1It.Jv0(this.alphaValues, "alpha"); param1It.Jv0(this.colorValues, "color"); } public void read(It param1It, bM0 param1bM0) { this.alphaValues = (fQ)COm9.aD0(param1It, param1bM0, "alpha", fQ.class, null);
/* 3 */       bM0 bM01 = param1bM0.Jb("color");
/* 4 */       this.colorValues = (fQ)param1It.Uj0(fQ.class, null, this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static class AlphaOnly extends ColorInfluencer {
/*   */     public ParallelArray.FloatChannel alphaInterpolationChannel;
/*   */     public ParallelArray.FloatChannel lifeChannel;
/*   */     public ScaledNumericValue alphaValue;
/*   */     
/*   */     public AlphaOnly() {
/*   */       this();
/*   */       this.alphaValue = scaledNumericValue;
/*   */       ScaledNumericValue scaledNumericValue;
/*   */       (scaledNumericValue = new ScaledNumericValue()).setHigh(1.0F);
/*   */     }
/*   */     
/*   */     public AlphaOnly(AlphaOnly param1AlphaOnly) {
/*   */       this();
/*   */       set(param1AlphaOnly);
/*   */     }
/*   */     
/*   */     public void set(AlphaOnly param1AlphaOnly) {
/*   */       this.alphaValue.load(param1AlphaOnly.alphaValue);
/*   */     }
/*   */     
/*   */     public void allocateChannels() {
/*   */       super.allocateChannels();
/*   */       ParallelArray.ChannelDescriptor channelDescriptor;
/*   */       (channelDescriptor = ParticleChannels.Interpolation).id = this.controller.particleChannels.newId();
/*   */       this.alphaInterpolationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(channelDescriptor);
/*   */       this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
/*   */     }
/*   */     
/*   */     public void activateParticles(int param1Int1, int param1Int2) {
/*   */       int i;
/*   */       int j;
/*   */       for (param1Int2 = param1Int1 * (param1Int1 = ((ParallelArray.Channel)this.colorChannel).strideSize), i = param1Int1 * ((ParallelArray.Channel)this.alphaInterpolationChannel).strideSize, j = param1Int1 * ((ParallelArray.Channel)this.lifeChannel).strideSize + 2, param1Int1 = param1Int2 * param1Int1 + param1Int2; param1Int2 < param1Int1; ) {
/*   */         float f1 = this.alphaValue.newLowValue(), f2 = this.alphaValue.newHighValue() - f1;
/*   */         this.colorChannel.data[param1Int2 + 3] = oh.Zn(this.alphaValue, this.lifeChannel.data[j], f2, f1);
/*   */         ParallelArray.FloatChannel floatChannel;
/*   */         (floatChannel = this.alphaInterpolationChannel).data[i + 0] = f1;
/*   */         (floatChannel = this.alphaInterpolationChannel).data[i + 1] = f2;
/*   */         i = param1Int2 + ((ParallelArray.Channel)this.colorChannel).strideSize;
/*   */         int k = i + ((ParallelArray.Channel)floatChannel).strideSize;
/*   */         j += ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*   */         k = i = k;
/*   */       } 
/*   */     }
/*   */     
/*   */     public void update() {
/*   */       byte b1;
/*   */       byte b2;
/*   */       byte b3;
/*   */       int i;
/*   */       for (b1 = 0, b2 = 0, b3 = 2, i = this.controller.particles.size * ((ParallelArray.Channel)this.colorChannel).strideSize + b1; b1 < i; ) {
/*   */         float f3 = this.lifeChannel.data[b3], f1 = this.alphaInterpolationChannel.data[b2 + 0], f2 = this.alphaInterpolationChannel.data[b2 + 1];
/*   */         this.colorChannel.data[b1 + 3] = oh.Zn(this.alphaValue, f3, f2, f1);
/*   */         int j = b1 + ((ParallelArray.Channel)this.colorChannel).strideSize, k = b2 + ((ParallelArray.Channel)this.alphaInterpolationChannel).strideSize, m = b3 + ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*   */       } 
/*   */     }
/*   */     
/*   */     public AlphaOnly copy() {
/*   */       return new AlphaOnly(this);
/*   */     }
/*   */     
/*   */     public void write(It param1It) {
/*   */       param1It.Jv0(this.alphaValue, "alpha");
/*   */     }
/*   */     
/*   */     public void read(It param1It, bM0 param1bM0) {
/*   */       this.alphaValue = (ScaledNumericValue)COm9.aD0(param1It, param1bM0, "alpha", ScaledNumericValue.class, null);
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/ColorInfluencerExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */