/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.batches;public class BillboardParticleBatch extends BufferedParticleBatch { public static final eo TMP_V1 = new eo(); public static final eo TMP_V2 = new eo(); public static final eo TMP_V3 = new eo(); public static final eo TMP_V4 = new eo(); public static final eo TMP_V5 = new eo(); public static final eo TMP_V6 = new eo(); public static final sX TMP_M3 = new sX(); public static final int sizeAndRotationUsage = 512; public static final int directionUsage = 1024; private static final Ao GPU_ATTRIBUTES = new Ao(); private static final Ao CPU_ATTRIBUTES; private static final int GPU_POSITION_OFFSET; private static final int GPU_UV_OFFSET; private static final int GPU_SIZE_ROTATION_OFFSET; private static final int GPU_COLOR_OFFSET; private static final int GPU_VERTEX_SIZE; private static final int CPU_POSITION_OFFSET; private static final int CPU_UV_OFFSET = (short)(((new Ao()).kA(16)).TZ / 4); private static final int CPU_COLOR_OFFSET = (short)(((new Ao()).kA(2)).TZ / 4); private static final int CPU_VERTEX_SIZE = (new Ao()).Nb / 4; private static final int MAX_PARTICLES_PER_MESH = 8191; private static final int MAX_VERTICES_PER_MESH = 32764; private RenderablePool renderablePool = new RenderablePool(); private void fillVerticesToViewPointCPU(int[] paramArrayOfint) { byte b; Hc0 hc0; for (b = 0, hc0 = this.renderData.r30(); hc0.hasNext();) { for (floatChannel1 = ((ParticleControllerRenderData)hc0.next()).scaleChannel, floatChannel2 = ((ParticleControllerRenderData)hc0.next()).regionChannel, floatChannel3 = ((ParticleControllerRenderData)hc0.next()).positionChannel, floatChannel4 = ((ParticleControllerRenderData)hc0.next()).colorChannel, floatChannel5 = ((ParticleControllerRenderData)hc0.next()).rotationChannel, b1 = 0, i = ((ParticleControllerRenderData)hc0.next()).controller.particles.size; b1 < i; ) { float f1; int j = paramArrayOfint[b] * this.currentVertexSize * 4; float f2 = floatChannel1.data[b1 * ((ParallelArray.Channel)floatChannel1).strideSize]; int k = b1 * ((ParallelArray.Channel)floatChannel2).strideSize, m = b1 * ((ParallelArray.Channel)floatChannel3).strideSize, n = b1 * ((ParallelArray.Channel)floatChannel4).strideSize, i1 = b1 * ((ParallelArray.Channel)floatChannel5).strideSize; float f4 = arrayOfFloat1[m + 0], f7 = arrayOfFloat1[m + 1]; float arrayOfFloat1[], f8 = (arrayOfFloat1 = floatChannel3.data)[m + 2], f3 = arrayOfFloat2[k + 0], f9 = arrayOfFloat2[k + 1], f10 = arrayOfFloat2[k + 2], f11 = arrayOfFloat2[k + 3], f12 = arrayOfFloat2[k + 4] * f2; float[] arrayOfFloat2; f2 = (arrayOfFloat2 = floatChannel2.data)[k + 5] * f2; float f5 = arrayOfFloat3[n + 0], f13 = arrayOfFloat3[n + 1], f14 = arrayOfFloat3[n + 2]; float arrayOfFloat3[], f15 = (arrayOfFloat3 = floatChannel4.data)[n + 3], f6 = arrayOfFloat4[i1 + 1]; eo eo1 = TMP_V3.JL(this.camera.H).uD(f4, f7, f8).WC0(); eo eo2, eo3 = (eo2 = TMP_V1).JL(this.camera.nj0).Nz(eo1).WC0(); eo4.getClass(); float f17 = eo1.x, f18 = eo1.y, f19 = eo1.z;
/* 2 */         eo3.uu(f12); eo eo4; (eo4 = TMP_V2).TG0(f17, f18, f19).Nz(eo3).uu(f2); float arrayOfFloat4[], f16; if ((f16 = (arrayOfFloat4 = floatChannel5.data)[i1 + 0]) != 1.0F) { sX sX1; (sX1 = TMP_M3).rt(eo1, f16, f6); f6 = -eo2.y - eo4.y; eo eo5; putVertex(this.vertices, j, (eo5 = TMP_V6).TG0(-eo2.x - eo4.x, f6, -eo2.z - eo4.z).DT(sX1).Tz(f4, f7, f8), f3, f11, f5, f13, f14, f15); float f21 = eo2.y - eo4.y; putVertex(this.vertices, i4, eo5.TG0(eo2.x - eo4.x, f21, eo2.z - eo4.z).DT(sX1).Tz(f4, f7, f8), f10, f11, f5, f13, f14, f15); float f20 = eo2.y + eo4.y; putVertex(this.vertices, i3, eo5.TG0(eo2.x + eo4.x, f20, eo2.z + eo4.z).DT(sX1).Tz(f4, f7, f8), f10, f9, f5, f13, f14, f15); int i4, i3, i2 = (i3 = (i4 = j + this.currentVertexSize) + this.currentVertexSize) + this.currentVertexSize; f1 = -eo2.y + eo4.y; putVertex(this.vertices, i2, eo5.TG0(-eo2.x + eo4.x, f1, -eo2.z + eo4.z).DT(sX1).Tz(f4, f7, f8), f3, f9, f5, f13, f14, f15); } else { f2 = -eo2.y - eo4.y + f7; eo eo5; putVertex(this.vertices, f1, (eo5 = TMP_V6).TG0(-eo2.x - eo4.x + f4, f2, -eo2.z - eo4.z + f8), f3, f11, f5, f13, f14, f15); float f22 = eo2.y - eo4.y + f7; putVertex(this.vertices, i4, eo5.TG0(eo2.x - eo4.x + f4, f22, eo2.z - eo4.z + f8), f10, f11, f5, f13, f14, f15); float f21 = eo2.y + eo4.y + f7; putVertex(this.vertices, i3, eo5.TG0(eo2.x + eo4.x + f4, f21, eo2.z + eo4.z + f8), f10, f9, f5, f13, f14, f15); int i4, i3, i2 = (i3 = (i4 = f1 + this.currentVertexSize) + this.currentVertexSize) + this.currentVertexSize; float f20 = -eo2.y + eo4.y + f7; putVertex(this.vertices, i2, eo5.TG0(-eo2.x + eo4.x + f4, f20, -eo2.z + eo4.z + f8), f3, f9, f5, f13, f14, f15); }  b1++; b++; }  }  } private fQ renderables = new fQ(); private float[] vertices; private short[] indices; private int currentVertexSize = 0; private Ao currentAttributes; public boolean useGPU = false; public ParticleShader.AlignMode mode = ParticleShader.AlignMode.Screen; public Texture texture; public zc blendingAttribute; public IF depthTestAttribute; public R40 shader; public BillboardParticleBatch(ParticleShader.AlignMode paramAlignMode, boolean paramBoolean, int paramInt, zc paramzc, IF paramIF) { super(BillboardControllerRenderData.class); this.blendingAttribute = paramzc; this.depthTestAttribute = paramIF; if (paramzc == null) { this(1, 771, 1.0F); this.blendingAttribute = paramzc; }  if (this.depthTestAttribute == null) { IF iF; this(515, false); this.depthTestAttribute = iF; }  allocIndices(); initRenderData(); ensureCapacity(paramInt); setUseGpu(paramBoolean); setAlignMode(paramAlignMode); } public BillboardParticleBatch(ParticleShader.AlignMode paramAlignMode, boolean paramBoolean, int paramInt) { this(paramAlignMode, paramBoolean, paramInt, null, null); } public BillboardParticleBatch() { this(ParticleShader.AlignMode.Screen, false, 100); } public BillboardParticleBatch(int paramInt) { this(ParticleShader.AlignMode.Screen, false, paramInt); } private void allocIndices() { char c; this.indices = new short[c = '뿺']; byte b1 = 0; for (byte b2 = 0; b1 < c; b2 += 4) { short s1 = (short)b2; int i = b1 + 1; arrayOfShort[i] = (short)(b2 + 1); i = b1 + 2; short s2 = (short)(b2 + 2); arrayOfShort[i] = s2; arrayOfShort[b1 + 3] = s2; i = b1 + 4; arrayOfShort[i] = (short)(b2 + 3); short[] arrayOfShort; (arrayOfShort = this.indices)[b1 + 5] = s1; b1 += 6; }  } private void allocRenderables(int paramInt) { double d = (paramInt / 8191); paramInt = 16384 - (int)(16384.0D - d); int i; if ((i = this.renderablePool.getFree()) < paramInt) { paramInt = 0; i = paramInt - i; while (paramInt < i) { this.renderablePool.free(this.renderablePool.newObject()); paramInt++; }  }  } private void allocShader() { Xw0 xw0; R40 r40 = getShader(xw0); this.shader = this; this.renderablePool.free(xw0); } private void clearRenderablesPool() { this.renderablePool.freeAll(this.renderables); byte b = 0; int i = this.renderablePool.getFree(); while (b < i) { ((Xw0)this.renderablePool.obtain()).L90.u90.dispose(); b++; }  this.renderables.clear(); } private void initRenderData() { setVertexData(); clearRenderablesPool(); allocShader(); resetCapacity(); } private static void putVertex(float[] paramArrayOffloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13) { int i; paramArrayOffloat[paramInt + (i = GPU_POSITION_OFFSET)] = paramFloat1; paramArrayOffloat[paramInt + i + 1] = paramFloat2; paramArrayOffloat[paramInt + i + 2] = paramFloat3; paramArrayOffloat[paramInt + (i = GPU_UV_OFFSET)] = paramFloat4; paramArrayOffloat[paramInt + i + 1] = paramFloat5; paramArrayOffloat[paramInt + (i = GPU_SIZE_ROTATION_OFFSET)] = paramFloat6; paramArrayOffloat[paramInt + i + 1] = paramFloat7; paramArrayOffloat[paramInt + i + 2] = paramFloat8; paramArrayOffloat[paramInt + i + 3] = paramFloat9; paramArrayOffloat[paramInt + (i = GPU_COLOR_OFFSET)] = paramFloat10; paramArrayOffloat[paramInt + i + 1] = paramFloat11; paramArrayOffloat[paramInt + i + 2] = paramFloat12; paramArrayOffloat[paramInt + i + 3] = paramFloat13; } private static void putVertex(float[] paramArrayOffloat, int paramInt, eo parameo, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) { int i; paramInt += i = CPU_POSITION_OFFSET; paramArrayOffloat[paramInt] = parameo.x; paramInt = paramInt + i + 1; paramArrayOffloat[paramInt] = parameo.y; i = paramInt + i + 2; paramArrayOffloat[i] = parameo.z; paramArrayOffloat[paramInt + (i = CPU_UV_OFFSET)] = paramFloat1; paramArrayOffloat[paramInt + i + 1] = paramFloat2; paramArrayOffloat[paramInt + (i = CPU_COLOR_OFFSET)] = paramFloat3; paramArrayOffloat[paramInt + i + 1] = paramFloat4; paramArrayOffloat[paramInt + i + 2] = paramFloat5; paramArrayOffloat[paramInt + i + 3] = paramFloat6; } private void fillVerticesGPU(int[] paramArrayOfint) { byte b = 0; Hc0 hc0 = this.renderData.r30(); while (hc0.hasNext()) { ParallelArray.FloatChannel floatChannel1 = ((ParticleControllerRenderData)hc0.next()).scaleChannel; ParallelArray.FloatChannel floatChannel2 = ((ParticleControllerRenderData)hc0.next()).regionChannel; ParallelArray.FloatChannel floatChannel3 = ((ParticleControllerRenderData)hc0.next()).positionChannel; ParallelArray.FloatChannel floatChannel4 = ((ParticleControllerRenderData)hc0.next()).colorChannel; ParallelArray.FloatChannel floatChannel5 = ((ParticleControllerRenderData)hc0.next()).rotationChannel; byte b1 = 0; int i = ((ParticleControllerRenderData)hc0.next()).controller.particles.size; while (b1 < i) { float f2 = floatChannel1.data[b1 * ((ParallelArray.Channel)floatChannel1).strideSize]; int k = b1 * ((ParallelArray.Channel)floatChannel2).strideSize; int m = b1 * ((ParallelArray.Channel)floatChannel3).strideSize; int n = b1 * ((ParallelArray.Channel)floatChannel4).strideSize; int i1 = b1 * ((ParallelArray.Channel)floatChannel5).strideSize; float f4 = arrayOfFloat1[m + 0]; float f7 = arrayOfFloat1[m + 1]; float[] arrayOfFloat1; float f8 = (arrayOfFloat1 = floatChannel3.data)[m + 2]; float f3 = arrayOfFloat2[k + 0]; float f9 = arrayOfFloat2[k + 1]; float f10 = arrayOfFloat2[k + 2]; float f11 = arrayOfFloat2[k + 3]; float f12 = arrayOfFloat2[k + 4] * f2; float[] arrayOfFloat2; f2 = (arrayOfFloat2 = floatChannel2.data)[k + 5] * f2; float f5 = arrayOfFloat3[n + 0]; float f13 = arrayOfFloat3[n + 1]; float f14 = arrayOfFloat3[n + 2]; float[] arrayOfFloat3; float f15 = (arrayOfFloat3 = floatChannel4.data)[n + 3]; float f6 = floatChannel5.data[i1 + 0]; float f16 = floatChannel5.data[i1 + 1]; float f1 = -f12; float f17 = -f2; putVertex(this.vertices, j, f4, f7, f8, f3, f11, f1, f17, f6, f16, f5, f13, f14, f15); putVertex(this.vertices, i4, f4, f7, f8, f10, f11, f12, f17, f6, f16, f5, f13, f14, f15); putVertex(this.vertices, i3, f4, f7, f8, f10, f9, f12, f2, f6, f16, f5, f13, f14, f15); int j; int i3; int i4; int i2 = (i3 = (i4 = (j = paramArrayOfint[b] * this.currentVertexSize * 4) + this.currentVertexSize) + this.currentVertexSize) + this.currentVertexSize; putVertex(this.vertices, i2, f4, f7, f8, f3, f9, f1, f2, f6, f16, f5, f13, f14, f15); b1++; b++; }  }  } private void fillVerticesToScreenCPU(int[] paramArrayOfint) { eo eo1; eo eo2; eo eo3; byte b; Hc0 hc0; for (eo1 = TMP_V3.JL(this.camera.yF).uu(-1.0F), eo2 = TMP_V4.JL(this.camera.nj0).Nz(eo1).WC0(), eo3 = this.camera.nj0, b = 0, hc0 = this.renderData.r30(); hc0.hasNext();) { for (floatChannel1 = ((ParticleControllerRenderData)hc0.next()).scaleChannel, floatChannel2 = ((ParticleControllerRenderData)hc0.next()).regionChannel, floatChannel3 = ((ParticleControllerRenderData)hc0.next()).positionChannel, floatChannel4 = ((ParticleControllerRenderData)hc0.next()).colorChannel, floatChannel5 = ((ParticleControllerRenderData)hc0.next()).rotationChannel, b1 = 0, i = ((ParticleControllerRenderData)hc0.next()).controller.particles.size; b1 < i; ) { float f1; int j = paramArrayOfint[b] * this.currentVertexSize * 4; float f2 = floatChannel1.data[b1 * ((ParallelArray.Channel)floatChannel1).strideSize]; int k = b1 * ((ParallelArray.Channel)floatChannel2).strideSize, m = b1 * ((ParallelArray.Channel)floatChannel3).strideSize, n = b1 * ((ParallelArray.Channel)floatChannel4).strideSize, i1 = b1 * ((ParallelArray.Channel)floatChannel5).strideSize; float f4 = arrayOfFloat1[m + 0], f7 = arrayOfFloat1[m + 1]; float arrayOfFloat1[], f8 = (arrayOfFloat1 = floatChannel3.data)[m + 2], f3 = arrayOfFloat2[k + 0], f9 = arrayOfFloat2[k + 1], f10 = arrayOfFloat2[k + 2], f11 = arrayOfFloat2[k + 3], f12 = arrayOfFloat2[k + 4] * f2; float[] arrayOfFloat2; f2 = (arrayOfFloat2 = floatChannel2.data)[k + 5] * f2; float f5 = arrayOfFloat3[n + 0], f13 = arrayOfFloat3[n + 1], f14 = arrayOfFloat3[n + 2]; float arrayOfFloat3[], f15 = (arrayOfFloat3 = floatChannel4.data)[n + 3], f6 = arrayOfFloat4[i1 + 1]; eo5.getClass(); float f17 = eo2.x, f18 = eo2.y, f19 = eo2.z; eo eo5; (eo5 = TMP_V1).TG0(f17, f18, f19).uu(f12); eo eo4; (eo4 = TMP_V2).JL(eo3).uu(f2); float arrayOfFloat4[], f16; if ((f16 = (arrayOfFloat4 = floatChannel5.data)[i1 + 0]) != 1.0F) { sX sX1; (sX1 = TMP_M3).rt(eo1, f16, f6); f6 = -eo5.y - eo4.y; eo eo6; putVertex(this.vertices, j, (eo6 = TMP_V6).TG0(-eo5.x - eo4.x, f6, -eo5.z - eo4.z).DT(sX1).Tz(f4, f7, f8), f3, f11, f5, f13, f14, f15); float f21 = eo5.y - eo4.y; putVertex(this.vertices, i4, eo6.TG0(eo5.x - eo4.x, f21, eo5.z - eo4.z).DT(sX1).Tz(f4, f7, f8), f10, f11, f5, f13, f14, f15); float f20 = eo5.y + eo4.y; putVertex(this.vertices, i3, eo6.TG0(eo5.x + eo4.x, f20, eo5.z + eo4.z).DT(sX1).Tz(f4, f7, f8), f10, f9, f5, f13, f14, f15); int i4, i3, i2 = (i3 = (i4 = j + this.currentVertexSize) + this.currentVertexSize) + this.currentVertexSize; f1 = -eo5.y + eo4.y; putVertex(this.vertices, i2, eo6.TG0(-eo5.x + eo4.x, f1, -eo5.z + eo4.z).DT(sX1).Tz(f4, f7, f8), f3, f9, f5, f13, f14, f15); } else { f2 = -eo5.y - eo4.y + f7; eo eo6; putVertex(this.vertices, f1, (eo6 = TMP_V6).TG0(-eo5.x - eo4.x + f4, f2, -eo5.z - eo4.z + f8), f3, f11, f5, f13, f14, f15); float f22 = eo5.y - eo4.y + f7; putVertex(this.vertices, i4, eo6.TG0(eo5.x - eo4.x + f4, f22, eo5.z - eo4.z + f8), f10, f11, f5, f13, f14, f15); float f21 = eo5.y + eo4.y + f7; putVertex(this.vertices, i3, eo6.TG0(eo5.x + eo4.x + f4, f21, eo5.z + eo4.z + f8), f10, f9, f5, f13, f14, f15); int i4, i3, i2 = (i3 = (i4 = f1 + this.currentVertexSize) + this.currentVertexSize) + this.currentVertexSize; float f20 = -eo5.y + eo4.y + f7; putVertex(this.vertices, i2, eo6.TG0(-eo5.x + eo4.x + f4, f20, -eo5.z + eo4.z + f8), f3, f9, f5, f13, f14, f15); }  b1++; b++; }  }  } public void allocParticlesData(int paramInt) { this.vertices = new float[this.currentVertexSize * 4 * paramInt]; allocRenderables(paramInt); } public Xw0 allocRenderable() { (new Xw0()).L90.lm = 4; (new Xw0()).L90.xI0 = 0; arrayOfDj[0] = (dj)this.blendingAttribute; arrayOfDj[1] = (dj)this.depthTestAttribute; Texture texture = this.texture; this(O80.Jg0, texture); O80 o80; dj[] arrayOfDj; (arrayOfDj = new dj[3])[2] = (dj)o80; (new Xw0()).bL = new T0(new dj[3]); Ao ao = this.currentAttributes; (new Xw0()).L90.u90 = new re0(false, 32764, 49146, ao); (new Xw0()).L90.u90.cOM9(this.indices); (new Xw0()).Yc = this.shader; return new Xw0(); } public R40 getShader(Xw0 paramXw0) { ParticleShader.Config config; bG bG; if (this.useGPU) { ParticleShader particleShader; this(this.mode); this(paramXw0, config); } else { this((Xw0)config); }  bG.init(); return (R40)bG; } public void setVertexData() { if (this.useGPU) { this.currentAttributes = GPU_ATTRIBUTES; this.currentVertexSize = GPU_VERTEX_SIZE; } else { this.currentAttributes = CPU_ATTRIBUTES; this.currentVertexSize = CPU_VERTEX_SIZE; }  } public void setAlignMode(ParticleShader.AlignMode paramAlignMode) { this.mode = paramAlignMode; if (paramAlignMode != this.mode && this.useGPU) { initRenderData(); allocRenderables(this.bufferedParticlesCount); }  } public ParticleShader.AlignMode getAlignMode() { return this.mode; } public void setUseGpu(boolean paramBoolean) { if (this.useGPU != paramBoolean) { this.useGPU = paramBoolean; initRenderData(); allocRenderables(this.bufferedParticlesCount); }  } public boolean isUseGPU() { return this.useGPU; } public void setTexture(Texture paramTexture) { this.renderablePool.freeAll(this.renderables); this.renderables.clear(); byte b = 0; int i = this.renderablePool.getFree(); while (b < i) { ((O80)((Xw0)this.renderablePool.obtain()).bL.cOM1(O80.Jg0)).cv0.ze = (zp)paramTexture; b++; }  this.texture = paramTexture; } public Texture getTexture() { return this.texture; } public zc getBlendingAttribute() { return this.blendingAttribute; } public void begin() { super.begin(); this.renderablePool.freeAll(this.renderables); this.renderables.clear(); } public void flush(int[] paramArrayOfint) { if (this.useGPU) { fillVerticesGPU(paramArrayOfint); } else { ParticleShader.AlignMode alignMode; if ((alignMode = this.mode) == ParticleShader.AlignMode.Screen) { fillVerticesToScreenCPU(paramArrayOfint); } else if (alignMode == ParticleShader.AlignMode.ViewPoint) { fillVerticesToViewPointCPU(paramArrayOfint); }  }  for (int i = this.bufferedParticlesCount * 4, j = 0; j < i; ) { int k = Math.min(i - j, 32764); Xw0 xw0; (xw0 = (Xw0)this.renderablePool.obtain()).L90.Dr = k / 4 * 6; re0 re0 = (xw0 = (Xw0)this.renderablePool.obtain()).L90.u90; float[] arrayOfFloat = this.vertices; int m = this.currentVertexSize; j = m * j; k = m * k; re0.Dt0.Dc(j, k, arrayOfFloat);
/* 3 */       xw0.L90.H90(); this.renderables.Com3(xw0);
/*   */       j += k; }
/*   */      }
/*   */ 
/*   */   
/*   */   public void getRenderables(fQ paramfQ, Lc paramLc) {
/*   */     Hc0 hc0 = this.renderables.r30();
/*   */     while (hasNext()) {
/*   */       Xw0 xw0 = (Xw0)next();
/*   */       paramfQ.Com3(((Xw0)paramLc.obtain()).wz(xw0));
/*   */     } 
/*   */   }
/*   */   
/*   */   public void save(sz0 paramsz0, ResourceData paramResourceData) {
/*   */     boolean bool = this.useGPU;
/*   */     this(bool, this.mode);
/*   */     Config config;
/*   */     saveData.save("cfg", config);
/*   */     ResourceData.SaveData saveData;
/*   */     (saveData = paramResourceData.createSaveData("billboardBatch")).saveAsset(paramsz0.kF((iq0)this.texture), Texture.class);
/*   */   }
/*   */   
/*   */   public void load(sz0 paramsz0, ResourceData paramResourceData) {
/*   */     // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: ldc_w 'billboardBatch'
/*   */     //   4: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   7: dup
/*   */     //   8: astore_2
/*   */     //   9: ifnull -> 75
/*   */     //   12: aload_0
/*   */     //   13: dup
/*   */     //   14: aload_2
/*   */     //   15: aload_0
/*   */     //   16: aload_1
/*   */     //   17: dup
/*   */     //   18: aload_2
/*   */     //   19: invokevirtual loadAsset : ()Lf/bs;
/*   */     //   22: dup
/*   */     //   23: aload_1
/*   */     //   24: monitorenter
/*   */     //   25: getfield bz : Ljava/lang/String;
/*   */     //   28: astore_0
/*   */     //   29: getfield RA0 : Ljava/lang/Class;
/*   */     //   32: aload_0
/*   */     //   33: invokevirtual Yo : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*   */     //   36: astore_0
/*   */     //   37: monitorexit
/*   */     //   38: aload_0
/*   */     //   39: checkcast com/badlogic/gdx/graphics/Texture
/*   */     //   42: invokevirtual setTexture : (Lcom/badlogic/gdx/graphics/Texture;)V
/*   */     //   45: ldc_w 'cfg'
/*   */     //   48: invokevirtual load : (Ljava/lang/String;)Ljava/lang/Object;
/*   */     //   51: checkcast com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatch$Config
/*   */     //   54: dup
/*   */     //   55: astore_0
/*   */     //   56: getfield useGPU : Z
/*   */     //   59: invokevirtual setUseGpu : (Z)V
/*   */     //   62: aload_0
/*   */     //   63: getfield mode : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShader$AlignMode;
/*   */     //   66: invokevirtual setAlignMode : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShader$AlignMode;)V
/*   */     //   69: goto -> 75
/*   */     //   72: aload_1
/*   */     //   73: monitorexit
/*   */     //   74: athrow
/*   */     //   75: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 25
/*   */     //   #2	-> 39
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   25	28	72	finally
/*   */     //   29	36	72	finally
/*   */   }
/*   */   
/*   */   static {
/*   */     this(1, 3, "a_position");
/*   */     Ao ao1;
/*   */     lw0 lw01;
/*   */     lw0 lw02;
/*   */     (new lw0[4])[0] = lw02;
/*   */     this(16, 2, "a_texCoord0");
/*   */     (new lw0[4])[1] = lw02;
/*   */     this(2, 4, "a_color");
/*   */     (new lw0[4])[2] = lw02;
/*   */     this(512, 4, "a_sizeAndRotation");
/*   */     this(new lw0[] { null, null, null, lw02 });
/*   */   }
/*   */   
/*   */   static {
/*   */     this(1, 3, "a_position");
/*   */     (new lw0[3])[0] = lw01;
/*   */     this(16, 2, "a_texCoord0");
/*   */     (new lw0[3])[1] = lw01;
/*   */     this(2, 4, "a_color");
/*   */     this(new lw0[] { null, null, lw01 });
/*   */     CPU_ATTRIBUTES = ao2;
/*   */     GPU_POSITION_OFFSET = (short)((ao1.kA(1)).TZ / 4);
/*   */     GPU_UV_OFFSET = (short)((ao1.kA(16)).TZ / 4);
/*   */     GPU_SIZE_ROTATION_OFFSET = (short)((ao1.kA(512)).TZ / 4);
/*   */     GPU_COLOR_OFFSET = (short)((ao1.kA(2)).TZ / 4);
/*   */     GPU_VERTEX_SIZE = ao1.Nb / 4;
/*   */     Ao ao2;
/*   */     CPU_POSITION_OFFSET = (short)(((ao2 = new Ao()).kA(1)).TZ / 4);
/*   */   }
/*   */   
/*   */   public static class Config {
/*   */     public boolean useGPU;
/*   */     public ParticleShader.AlignMode mode;
/*   */     
/*   */     public Config() {}
/*   */     
/*   */     public Config(boolean param1Boolean, ParticleShader.AlignMode param1AlignMode) {
/*   */       this.useGPU = param1Boolean;
/*   */       this.mode = param1AlignMode;
/*   */     }
/*   */   }
/*   */   
/*   */   private class RenderablePool extends Lc {
/*   */     public Xw0 newObject() {
/*   */       return BillboardParticleBatch.this.allocRenderable();
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatch.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */