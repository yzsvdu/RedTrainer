/*  1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public abstract class DynamicsModifier extends Influencer { public static final eo TMP_V1 = new eo(); public static final eo TMP_V2 = new eo(); public static final eo TMP_V3 = new eo(); public static final TG0 TMP_Q = new TG0(); public boolean isGlobal = false; public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); this
/*  2 */       .isGlobal = ((Boolean)COm9.aD0(paramIt, parambM0, "isGlobal", boolean.class, null)).booleanValue(); } public ParallelArray.FloatChannel lifeChannel; public DynamicsModifier() {} public DynamicsModifier(DynamicsModifier paramDynamicsModifier) { this.isGlobal = paramDynamicsModifier.isGlobal; } public void allocateChannels() { this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life); } public void write(It paramIt) { super.write(paramIt); paramIt.Jv0(Boolean.valueOf(this.isGlobal), "isGlobal"); } public static class BrownianAcceleration extends Strength { public ParallelArray.FloatChannel accelerationChannel; public BrownianAcceleration() {} public BrownianAcceleration(BrownianAcceleration param1BrownianAcceleration) { super(param1BrownianAcceleration); } public void allocateChannels() { super.allocateChannels(); this.accelerationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Acceleration); } public void update() { byte b1; byte b2; int i; byte b3; int j; for (b1 = 2, b2 = 0, i = 0, b3 = 0, j = this.controller.particles.size; b3 < j; ) { float f1 = this.strengthChannel.data[b2 + 0], f2 = this.strengthChannel.data[b2 + 1]; eo eo; (eo = DynamicsModifier.TMP_V3)
/*    */           
/*  4 */           .TG0(nx0.Mc0.nextFloat() * 2.0F + -1.0F, nx0.Mc0.nextFloat() * 2.0F + -1.0F, nx0.Mc0.nextFloat() * 2.0F + -1.0F).WC0().uu(oh.Zn(this.strengthValue, this.lifeChannel.data[b1], f2, f1)); ParallelArray.FloatChannel floatChannel; int n; (floatChannel = this.accelerationChannel).data[n] = (floatChannel = this.accelerationChannel).data[n = i + 0] + eo.x; (floatChannel = this.accelerationChannel).data[n] = (floatChannel = this.accelerationChannel).data[n = i + 1] + eo.y; (floatChannel = this.accelerationChannel).data[i] = (floatChannel = this.accelerationChannel).data[i += 2] + eo.z; b3++; int k = b2 + ((ParallelArray.Channel)this.strengthChannel).strideSize; i += ((ParallelArray.Channel)floatChannel).strideSize; int m = b1 + ((ParallelArray.Channel)this.lifeChannel).strideSize; k = m = k; }  } public BrownianAcceleration copy() { return new BrownianAcceleration(this); } } public static class TangentialAcceleration extends Angular { public ParallelArray.FloatChannel directionalVelocityChannel; public ParallelArray.FloatChannel positionChannel; public TangentialAcceleration() {} public TangentialAcceleration(TangentialAcceleration param1TangentialAcceleration) { super(param1TangentialAcceleration); } public void allocateChannels() { super.allocateChannels(); this.directionalVelocityChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Acceleration); this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position); } public void update() { int i; byte b; int j; int k; int m; int n; for (i = 0, b = 2, j = 0, k = 0, m = 0, n = this.controller.particles.size * ((ParallelArray.Channel)this.directionalVelocityChannel).strideSize + i; i < n; ) { float f1 = this.lifeChannel.data[b], f2 = this.strengthChannel.data[j + 0], f4 = this.strengthChannel.data[j + 1]; f2 = oh.Zn(this.strengthValue, f1, f4, f2); f4 = this.angularChannel.data[k + 2]; float f5 = this.angularChannel.data[k + 3]; f4 = this.angularChannel.data[k + 0]; f5 = this.angularChannel.data[k + 1];
/*    */         
/*  6 */         f1 = nx0.Tu0(oh.Zn(this.thetaValue, f1, f5, f4)); f4 = nx0.nH(oh.Zn(this.thetaValue, f1, f5, f4)); f5 = nx0.Tu0(oh.Zn(this.phiValue, f1, f5, f4)); float f6 = nx0.nH(oh.Zn(this.phiValue, f1, f5, f4)); f1 *= f6; f4 *= f6; eo eo2; (eo2 = DynamicsModifier.TMP_V3).TG0(f1, f5, f4); float f3 = arrayOfFloat[m + 0]; f5 = arrayOfFloat[m + 1]; float[] arrayOfFloat; f6 = (arrayOfFloat = this.positionChannel.data)[m + 2]; eo eo1; (eo1 = DynamicsModifier.TMP_V1).TG0(f3, f5, f6); if (!this.isGlobal) { Matrix4 matrix42 = this.controller.transform; matrix42.on0(DynamicsModifier.TMP_V2);
/*  7 */           float f = DynamicsModifier.TMP_V2.x; f5 = DynamicsModifier.TMP_V2.y; f6 = DynamicsModifier.TMP_V2.z; eo1.uD(f, f5, f6);
/*  8 */           Matrix4 matrix41 = this.controller.transform; matrix41.getClass(); DynamicsModifier.TMP_Q
/*  9 */             .dJ(true, matrix41);
/* 10 */           eo2.WO(DynamicsModifier.TMP_Q); }  eo2.Nz(eo1).WC0().uu(f2); ParallelArray.FloatChannel floatChannel; (floatChannel = this.directionalVelocityChannel).data[j] = (floatChannel = this.directionalVelocityChannel).data[j = i + 0] + eo2.x; (floatChannel = this.directionalVelocityChannel).data[j] = (floatChannel = this.directionalVelocityChannel).data[j = i + 1] + eo2.y; (floatChannel = this.directionalVelocityChannel).data[i] = (floatChannel = this.directionalVelocityChannel).data[i += 2] + eo2.z; j += ((ParallelArray.Channel)this.strengthChannel).strideSize; i += ((ParallelArray.Channel)floatChannel).strideSize; k += ((ParallelArray.Channel)this.angularChannel).strideSize; int i1 = b + ((ParallelArray.Channel)this.lifeChannel).strideSize; m += ((ParallelArray.Channel)this.positionChannel).strideSize; }
/*    */        }
/*    */ 
/*    */     
/*    */     public TangentialAcceleration copy() {
/*    */       return new TangentialAcceleration(this);
/*    */     } }
/*    */ 
/*    */   
/*    */   public static class PolarAcceleration extends Angular {
/*    */     public ParallelArray.FloatChannel directionalVelocityChannel;
/*    */     
/*    */     public PolarAcceleration() {}
/*    */     
/*    */     public PolarAcceleration(PolarAcceleration param1PolarAcceleration) {
/*    */       super(param1PolarAcceleration);
/*    */     }
/*    */     
/*    */     public void allocateChannels() {
/*    */       super.allocateChannels();
/*    */       this.directionalVelocityChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Acceleration);
/*    */     }
/*    */     
/*    */     public void update() {
/*    */       int i;
/*    */       byte b;
/*    */       int j;
/*    */       int k;
/*    */       int m;
/*    */       for (i = 0, b = 2, j = 0, k = 0, m = this.controller.particles.size * ((ParallelArray.Channel)this.directionalVelocityChannel).strideSize + i; i < m; ) {
/*    */         float f1 = this.lifeChannel.data[b], f2 = this.strengthChannel.data[j + 0], f3 = this.strengthChannel.data[j + 1];
/*    */         f2 = oh.Zn(this.strengthValue, f1, f3, f2);
/*    */         f3 = this.angularChannel.data[k + 2];
/*    */         float f4 = this.angularChannel.data[k + 3];
/*    */         f3 = this.angularChannel.data[k + 0];
/*    */         f4 = this.angularChannel.data[k + 1];
/*    */         f1 = nx0.Tu0(oh.Zn(this.thetaValue, f1, f4, f3));
/*    */         f3 = nx0.nH(oh.Zn(this.thetaValue, f1, f4, f3));
/*    */         f4 = nx0.Tu0(oh.Zn(this.phiValue, f1, f4, f3));
/*    */         float f5 = nx0.nH(oh.Zn(this.phiValue, f1, f4, f3));
/*    */         f1 *= f5;
/*    */         f3 *= f5;
/*    */         eo eo;
/*    */         (eo = DynamicsModifier.TMP_V3).TG0(f1, f4, f3).WC0().uu(f2);
/*    */         if (!this.isGlobal) {
/*    */           Matrix4 matrix4 = this.controller.transform;
/*    */           matrix4.getClass();
/*    */           DynamicsModifier.TMP_Q.dJ(true, matrix4);
/*    */           eo.WO(DynamicsModifier.TMP_Q);
/*    */         } 
/*    */         ParallelArray.FloatChannel floatChannel;
/*    */         (floatChannel = this.directionalVelocityChannel).data[j] = (floatChannel = this.directionalVelocityChannel).data[j = i + 0] + eo.x;
/*    */         (floatChannel = this.directionalVelocityChannel).data[j] = (floatChannel = this.directionalVelocityChannel).data[j = i + 1] + eo.y;
/*    */         (floatChannel = this.directionalVelocityChannel).data[i] = (floatChannel = this.directionalVelocityChannel).data[i += 2] + eo.z;
/*    */         j += ((ParallelArray.Channel)this.strengthChannel).strideSize;
/*    */         i += ((ParallelArray.Channel)floatChannel).strideSize;
/*    */         k += ((ParallelArray.Channel)this.angularChannel).strideSize;
/*    */         int n = b + ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public PolarAcceleration copy() {
/*    */       return new PolarAcceleration(this);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class CentripetalAcceleration extends Strength {
/*    */     public ParallelArray.FloatChannel accelerationChannel;
/*    */     public ParallelArray.FloatChannel positionChannel;
/*    */     
/*    */     public CentripetalAcceleration() {}
/*    */     
/*    */     public CentripetalAcceleration(CentripetalAcceleration param1CentripetalAcceleration) {
/*    */       super(param1CentripetalAcceleration);
/*    */     }
/*    */     
/*    */     public void allocateChannels() {
/*    */       super.allocateChannels();
/*    */       this.accelerationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Acceleration);
/*    */       this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
/*    */     }
/*    */     
/*    */     public void update() {
/*    */       float f1 = 0.0F, f2 = 0.0F, f3 = 0.0F;
/*    */       if (!this.isGlobal) {
/*    */         f1 = this.controller.transform.Z0[12];
/*    */         f2 = this.controller.transform.Z0[13];
/*    */         f3 = this.controller.transform.Z0[14];
/*    */       } 
/*    */       byte b1, b2, b3;
/*    */       int i;
/*    */       byte b4;
/*    */       int j;
/*    */       for (b1 = 2, b2 = 0, b3 = 0, i = 0, b4 = 0, j = this.controller.particles.size; b4 < j; ) {
/*    */         float f5 = this.strengthChannel.data[b2 + 0], f7 = this.strengthChannel.data[b2 + 1];
/*    */         float f4 = arrayOfFloat[b3 + 0] - f1, f6 = arrayOfFloat[b3 + 1] - f2;
/*    */         float[] arrayOfFloat;
/*    */         f7 = (arrayOfFloat = this.positionChannel.data)[b3 + 2] - f3;
/*    */         eo eo;
/*    */         (eo = DynamicsModifier.TMP_V3).TG0(f4, f6, f7).WC0().uu(oh.Zn(this.strengthValue, this.lifeChannel.data[b1], f7, f5));
/*    */         ParallelArray.FloatChannel floatChannel;
/*    */         int n;
/*    */         (floatChannel = this.accelerationChannel).data[n] = (floatChannel = this.accelerationChannel).data[n = i + 0] + eo.x;
/*    */         (floatChannel = this.accelerationChannel).data[n] = (floatChannel = this.accelerationChannel).data[n = i + 1] + eo.y;
/*    */         (floatChannel = this.accelerationChannel).data[n] = (floatChannel = this.accelerationChannel).data[n = i + 2] + eo.z;
/*    */         b4++;
/*    */         n = b3 + ((ParallelArray.Channel)this.positionChannel).strideSize;
/*    */         int k = b2 + ((ParallelArray.Channel)this.strengthChannel).strideSize;
/*    */         i += ((ParallelArray.Channel)floatChannel).strideSize;
/*    */         int m = b1 + ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*    */         k = m = k;
/*    */       } 
/*    */     }
/*    */     
/*    */     public CentripetalAcceleration copy() {
/*    */       return new CentripetalAcceleration(this);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Rotational3D extends Angular {
/*    */     public ParallelArray.FloatChannel rotationChannel;
/*    */     public ParallelArray.FloatChannel rotationalForceChannel;
/*    */     
/*    */     public Rotational3D() {}
/*    */     
/*    */     public Rotational3D(Rotational3D param1Rotational3D) {
/*    */       super(param1Rotational3D);
/*    */     }
/*    */     
/*    */     public void allocateChannels() {
/*    */       super.allocateChannels();
/*    */       this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation3D);
/*    */       this.rotationalForceChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.AngularVelocity3D);
/*    */     }
/*    */     
/*    */     public void update() {
/*    */       int i;
/*    */       byte b1;
/*    */       byte b2;
/*    */       byte b3;
/*    */       int j;
/*    */       for (i = 0, b1 = 2, b2 = 0, b3 = 0, j = this.controller.particles.size * ((ParallelArray.Channel)this.rotationalForceChannel).strideSize; i < j; ) {
/*    */         float f1 = this.lifeChannel.data[b1], f2 = this.strengthChannel.data[b2 + 0], f4 = this.strengthChannel.data[b2 + 1];
/*    */         f2 = oh.Zn(this.strengthValue, f1, f4, f2);
/*    */         f4 = this.angularChannel.data[b3 + 2];
/*    */         float f5 = this.angularChannel.data[b3 + 3];
/*    */         float f3 = this.angularChannel.data[b3 + 0];
/*    */         f4 = this.angularChannel.data[b3 + 1];
/*    */         f1 = nx0.Tu0(oh.Zn(this.thetaValue, f1, f4, f3));
/*    */         f3 = nx0.nH(oh.Zn(this.thetaValue, f1, f4, f3));
/*    */         f4 = nx0.Tu0(oh.Zn(this.phiValue, f1, f5, f4));
/*    */         f5 = nx0.nH(oh.Zn(this.phiValue, f1, f5, f4));
/*    */         f1 *= f5;
/*    */         f2 = f3 * f5;
/*    */         eo.TG0(f1, f4, f2);
/*    */         eo eo;
/*    */         (eo = DynamicsModifier.TMP_V3).uu(f2 * 0.017453292F);
/*    */         ParallelArray.FloatChannel floatChannel;
/*    */         int m;
/*    */         (floatChannel = this.rotationalForceChannel).data[m] = (floatChannel = this.rotationalForceChannel).data[m = i + 0] + eo.x;
/*    */         (floatChannel = this.rotationalForceChannel).data[m] = (floatChannel = this.rotationalForceChannel).data[m = i + 1] + eo.y;
/*    */         (floatChannel = this.rotationalForceChannel).data[i] = (floatChannel = this.rotationalForceChannel).data[i += 2] + eo.z;
/*    */         m = b2 + ((ParallelArray.Channel)this.strengthChannel).strideSize;
/*    */         i += ((ParallelArray.Channel)floatChannel).strideSize;
/*    */         int n = b3 + ((ParallelArray.Channel)this.angularChannel).strideSize, k = b1 + ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public Rotational3D copy() {
/*    */       return new Rotational3D(this);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Rotational2D extends Strength {
/*    */     public ParallelArray.FloatChannel rotationalVelocity2dChannel;
/*    */     
/*    */     public Rotational2D() {}
/*    */     
/*    */     public Rotational2D(Rotational2D param1Rotational2D) {
/*    */       super(param1Rotational2D);
/*    */     }
/*    */     
/*    */     public void allocateChannels() {
/*    */       super.allocateChannels();
/*    */       this.rotationalVelocity2dChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.AngularVelocity2D);
/*    */     }
/*    */     
/*    */     public void update() {
/*    */       byte b1 = 0;
/*    */       int i = 2;
/*    */       byte b2 = 0;
/*    */       int j = this.controller.particles.size * ((ParallelArray.Channel)this.rotationalVelocity2dChannel).strideSize + b1;
/*    */       while (b1 < j) {
/*    */         float f1 = arrayOfFloat[b1];
/*    */         float f2 = this.strengthChannel.data[b2 + 0];
/*    */         float f3 = this.strengthChannel.data[b2 + 1];
/*    */         float[] arrayOfFloat;
/*    */         (arrayOfFloat = this.rotationalVelocity2dChannel.data)[b1] = this.strengthValue.getScale(this.lifeChannel.data[i]) * f3 + f2 + f1;
/*    */         int m = b2 + ((ParallelArray.Channel)this.strengthChannel).strideSize;
/*    */         int k = b1 + ((ParallelArray.Channel)this.rotationalVelocity2dChannel).strideSize;
/*    */         i += ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public Rotational2D copy() {
/*    */       return new Rotational2D(this);
/*    */     }
/*    */   }
/*    */   
/*    */   public static abstract class Angular extends Strength {
/*    */     public ParallelArray.FloatChannel angularChannel;
/*    */     public ScaledNumericValue thetaValue;
/*    */     public ScaledNumericValue phiValue;
/*    */     
/*    */     public Angular() {
/*    */       ScaledNumericValue scaledNumericValue;
/*    */       this();
/*    */       this.thetaValue = this;
/*    */       this();
/*    */       this.phiValue = this;
/*    */     }
/*    */     
/*    */     public Angular(Angular param1Angular) {
/*    */       super(param1Angular);
/*    */       this.thetaValue = new ScaledNumericValue();
/*    */       this.phiValue = new ScaledNumericValue();
/*    */       this.thetaValue.load(param1Angular.thetaValue);
/*    */       this.phiValue.load(param1Angular.phiValue);
/*    */     }
/*    */     
/*    */     public void allocateChannels() {
/*    */       super.allocateChannels();
/*    */       ParallelArray.ChannelDescriptor channelDescriptor;
/*    */       (channelDescriptor = ParticleChannels.Interpolation4).id = this.controller.particleChannels.newId();
/*    */       this.angularChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(channelDescriptor);
/*    */     }
/*    */     
/*    */     public void activateParticles(int param1Int1, int param1Int2) {
/*    */       super.activateParticles(param1Int1, param1Int2);
/*    */       param1Int2 = param1Int1 * (param1Int1 = ((ParallelArray.Channel)this.angularChannel).strideSize);
/*    */       param1Int1 = param1Int2 * param1Int1 + param1Int2;
/*    */       while (param1Int2 < param1Int1) {
/*    */         float f1 = this.thetaValue.newLowValue();
/*    */         float f2 = this.thetaValue.newHighValue();
/*    */         if (!this.thetaValue.isRelative())
/*    */           f2 -= f1; 
/*    */         this.angularChannel.data[param1Int2 + 0] = f1;
/*    */         this.angularChannel.data[param1Int2 + 1] = f2;
/*    */         f1 = this.phiValue.newLowValue();
/*    */         f2 = this.phiValue.newHighValue();
/*    */         if (!this.phiValue.isRelative())
/*    */           f2 -= f1; 
/*    */         this.angularChannel.data[param1Int2 + 2] = f1;
/*    */         this.angularChannel.data[param1Int2 + 3] = f2;
/*    */         param1Int2 += ((ParallelArray.Channel)this.angularChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public void write(It param1It) {
/*    */       super.write(param1It);
/*    */       param1It.Jv0(this.thetaValue, "thetaValue");
/*    */       param1It.Jv0(this.phiValue, "phiValue");
/*    */     }
/*    */     
/*    */     public void read(It param1It, bM0 param1bM0) {
/*    */       super.read(param1It, param1bM0);
/*    */       this.thetaValue = (ScaledNumericValue)COm9.aD0(param1It, param1bM0, "thetaValue", ScaledNumericValue.class, null);
/*    */       bM0 bM01 = param1bM0.Jb("phiValue");
/*    */       this.phiValue = (ScaledNumericValue)param1It.Uj0(ScaledNumericValue.class, null, this);
/*    */     }
/*    */   }
/*    */   
/*    */   public static abstract class Strength extends DynamicsModifier {
/*    */     public ParallelArray.FloatChannel strengthChannel;
/*    */     public ScaledNumericValue strengthValue;
/*    */     
/*    */     public Strength() {
/*    */       ScaledNumericValue scaledNumericValue;
/*    */       this();
/*    */       this.strengthValue = this;
/*    */     }
/*    */     
/*    */     public Strength(Strength param1Strength) {
/*    */       super(param1Strength);
/*    */       this();
/*    */       this.strengthValue = scaledNumericValue;
/*    */       ScaledNumericValue scaledNumericValue;
/*    */       (scaledNumericValue = new ScaledNumericValue()).load(param1Strength.strengthValue);
/*    */     }
/*    */     
/*    */     public void allocateChannels() {
/*    */       super.allocateChannels();
/*    */       ParallelArray.ChannelDescriptor channelDescriptor;
/*    */       (channelDescriptor = ParticleChannels.Interpolation).id = this.controller.particleChannels.newId();
/*    */       this.strengthChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(channelDescriptor);
/*    */     }
/*    */     
/*    */     public void activateParticles(int param1Int1, int param1Int2) {
/*    */       param1Int2 = param1Int1 * (param1Int1 = ((ParallelArray.Channel)this.strengthChannel).strideSize);
/*    */       param1Int1 = param1Int2 * param1Int1 + param1Int2;
/*    */       while (param1Int2 < param1Int1) {
/*    */         float f1 = this.strengthValue.newLowValue();
/*    */         float f2 = this.strengthValue.newHighValue();
/*    */         if (!this.strengthValue.isRelative())
/*    */           f2 -= f1; 
/*    */         this.strengthChannel.data[param1Int2 + 0] = f1;
/*    */         this.strengthChannel.data[param1Int2 + 1] = f2;
/*    */         param1Int2 += ((ParallelArray.Channel)this.strengthChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public void write(It param1It) {
/*    */       super.write(param1It);
/*    */       param1It.Jv0(this.strengthValue, "strengthValue");
/*    */     }
/*    */     
/*    */     public void read(It param1It, bM0 param1bM0) {
/*    */       super.read(param1It, param1bM0);
/*    */       this.strengthValue = (ScaledNumericValue)COm9.aD0(param1It, param1bM0, "strengthValue", ScaledNumericValue.class, null);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class FaceDirection extends DynamicsModifier {
/*    */     public ParallelArray.FloatChannel rotationChannel;
/*    */     public ParallelArray.FloatChannel accellerationChannel;
/*    */     
/*    */     public FaceDirection() {}
/*    */     
/*    */     public FaceDirection(FaceDirection param1FaceDirection) {
/*    */       super(param1FaceDirection);
/*    */     }
/*    */     
/*    */     public void allocateChannels() {
/*    */       this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation3D);
/*    */       this.accellerationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Acceleration);
/*    */     }
/*    */     
/*    */     public void update() {
/*    */       int i;
/*    */       byte b;
/*    */       int j;
/*    */       for (i = 0, b = 0, j = this.controller.particles.size * ((ParallelArray.Channel)this.rotationChannel).strideSize + i; i < j; ) {
/*    */         float f2 = arrayOfFloat2[b + 0], f6 = arrayOfFloat2[b + 1];
/*    */         float arrayOfFloat2[], f7 = (arrayOfFloat2 = this.accellerationChannel.data)[b + 2];
/*    */         eo eo2, eo1 = (eo2 = DynamicsModifier.TMP_V1).TG0(f2, f6, f7).WC0();
/*    */         eo2 = DynamicsModifier.TMP_V2.JL(eo2).Nz(eo.Y).WC0().Nz(eo2).WC0();
/*    */         eo4.getClass();
/*    */         float f5 = eo2.x;
/*    */         f7 = eo2.y;
/*    */         float f8 = eo2.z;
/*    */         eo eo4, eo3 = (eo4 = DynamicsModifier.TMP_V3).TG0(f5, f7, f8).Nz(eo1).WC0();
/*    */         float f1 = eo3.x, f3 = eo2.x, f4 = eo1.x;
/*    */         f8 = eo3.y;
/*    */         float f9 = eo2.y, f10 = eo1.y, f11 = eo3.z, f12 = eo2.z, f13 = eo1.z;
/*    */         TG0 tG0;
/*    */         (tG0 = DynamicsModifier.TMP_Q).hE0(false, f1, f3, f4, f8, f9, f10, f11, f12, f13);
/*    */         int k = i + 0;
/*    */         arrayOfFloat1[k] = tG0.D80;
/*    */         k = i + 1;
/*    */         arrayOfFloat1[k] = tG0.tb0;
/*    */         k = i + 2;
/*    */         arrayOfFloat1[k] = tG0.z60;
/*    */         i += 3;
/*    */         float[] arrayOfFloat1;
/*    */         (arrayOfFloat1 = this.rotationChannel.data)[i] = tG0.AD;
/*    */         i += ((ParallelArray.Channel)this.rotationChannel).strideSize;
/*    */         k = b + ((ParallelArray.Channel)this.accellerationChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public ParticleControllerComponent copy() {
/*    */       return new FaceDirection(this);
/*    */     }
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/DynamicsModifier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */