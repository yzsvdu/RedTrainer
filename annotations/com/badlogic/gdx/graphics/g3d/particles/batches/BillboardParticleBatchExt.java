/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.batches;public class BillboardParticleBatchExt extends BufferedParticleBatch implements iq0 { public Xw0 allocRenderable() { (new Xw0()).L90.lm = 4; (new Xw0()).L90.xI0 = 0; arrayOfDj[0] = (dj)this.blendingAttribute; arrayOfDj[1] = (dj)this.depthTestAttribute; Texture texture = this.texture; this(O80.Jg0, texture); StringBuilder stringBuilder; O80 o80; dj[] arrayOfDj; (arrayOfDj = new dj[3])[2] = (dj)o80; (new Xw0())
/* 2 */       .bL = new T0(new dj[3]); this(); (new Xw0()).bL
/*   */       
/* 4 */       .Xy0 = UQ.Vr0(stringBuilder, (new Xw0()).bL.Xy0, "_vfx"); (new Xw0()).bL.Tz0((dj)new Ra(Ra.SG0, 6)); Ao ao = this.currentAttributes; (new Xw0()).L90.u90 = new re0(false, 1000, 1500, ao); (new Xw0()).L90.u90.cOM9(this.indices); (new Xw0()).Yc = this.shader;
/*   */     return new Xw0(); }
/*   */ 
/*   */   
/*   */   public static final eo TMP_V1 = new eo();
/*   */   public static final int sizeAndRotationUsage = 512;
/*   */   public static final int directionUsage = 1024;
/*   */   private static final Ao GPU_ATTRIBUTES;
/*   */   private static final int GPU_POSITION_OFFSET;
/*   */   private static final int GPU_UV_OFFSET;
/*   */   private static final int GPU_SIZE_ROTATION_OFFSET;
/*   */   private static final int GPU_COLOR_OFFSET;
/*   */   private static final int GPU_VERTEX_SIZE;
/*   */   private static final int MAX_PARTICLES_PER_MESH = 250;
/*   */   private static final int MAX_VERTICES_PER_MESH = 1000;
/*   */   private final RenderablePool renderablePool;
/*   */   private final fQ renderables;
/*   */   private float[] vertices;
/*   */   private short[] indices;
/*   */   private int currentVertexSize = 0;
/*   */   private Ao currentAttributes;
/*   */   public ParticleShaderExt.AlignMode mode = ParticleShaderExt.AlignMode.Screen;
/*   */   public ParticleShaderExt.OriginPosition origin = ParticleShaderExt.OriginPosition.Middle;
/*   */   public Texture texture;
/*   */   public zc blendingAttribute;
/*   */   public IF depthTestAttribute;
/*   */   private final Xa0 shaderProvider;
/*   */   public R40 shader;
/*   */   
/*   */   public BillboardParticleBatchExt(Xa0 paramXa0, ParticleShaderExt.AlignMode paramAlignMode, int paramInt, zc paramzc, IF paramIF) {
/*   */     super(BillboardControllerRenderData.class);
/*   */     this.shaderProvider = paramXa0;
/*   */     this.renderables = new fQ();
/*   */     this.renderablePool = new RenderablePool();
/*   */     this.blendingAttribute = paramzc;
/*   */     this.depthTestAttribute = paramIF;
/*   */     if (paramzc == null) {
/*   */       zc zc1;
/*   */       this(770, 771, 1.0F);
/*   */       this.blendingAttribute = zc1;
/*   */     } 
/*   */     if (this.depthTestAttribute == null) {
/*   */       IF iF;
/*   */       this(515, false);
/*   */       this.depthTestAttribute = iF;
/*   */     } 
/*   */     allocIndices();
/*   */     initRenderData();
/*   */     ensureCapacity(paramInt);
/*   */     allocRenderables(this.bufferedParticlesCount);
/*   */     setAlignMode(paramAlignMode);
/*   */   }
/*   */   
/*   */   public BillboardParticleBatchExt(Xa0 paramXa0, ParticleShaderExt.AlignMode paramAlignMode, int paramInt) {
/*   */     this(paramXa0, paramAlignMode, paramInt, null, null);
/*   */   }
/*   */   
/*   */   public BillboardParticleBatchExt(Xa0 paramXa0) {
/*   */     this(paramXa0, ParticleShaderExt.AlignMode.Screen, 100);
/*   */   }
/*   */   
/*   */   public BillboardParticleBatchExt(Xa0 paramXa0, int paramInt) {
/*   */     this(paramXa0, ParticleShaderExt.AlignMode.Screen, paramInt);
/*   */   }
/*   */   
/*   */   private void allocIndices() {
/*   */     char c;
/*   */     this.indices = new short[c = 'ל'];
/*   */     byte b1 = 0;
/*   */     for (byte b2 = 0; b1 < c; b2 += 4) {
/*   */       short s1 = (short)b2;
/*   */       int i = b1 + 1;
/*   */       arrayOfShort[i] = (short)(b2 + 1);
/*   */       i = b1 + 2;
/*   */       short s2 = (short)(b2 + 2);
/*   */       arrayOfShort[i] = s2;
/*   */       arrayOfShort[b1 + 3] = s2;
/*   */       i = b1 + 4;
/*   */       arrayOfShort[i] = (short)(b2 + 3);
/*   */       short[] arrayOfShort;
/*   */       (arrayOfShort = this.indices)[b1 + 5] = s1;
/*   */       b1 += 6;
/*   */     } 
/*   */   }
/*   */   
/*   */   private void allocRenderables(int paramInt) {
/*   */     double d = (paramInt / 250.0F);
/*   */     paramInt = 16384 - (int)(16384.0D - d);
/*   */     int i;
/*   */     if ((i = this.renderablePool.getFree()) < paramInt) {
/*   */       paramInt = 0;
/*   */       i = paramInt - i;
/*   */       while (paramInt < i) {
/*   */         this.renderablePool.free(this.renderablePool.newObject());
/*   */         paramInt++;
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   private R40 getShader(Xw0 paramXw0) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: aload_0
/*   */     //   2: getfield shaderProvider : Lf/Xa0;
/*   */     //   5: dup
/*   */     //   6: astore_2
/*   */     //   7: aload_0
/*   */     //   8: dup
/*   */     //   9: getfield mode : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$AlignMode;
/*   */     //   12: astore_0
/*   */     //   13: getfield origin : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$OriginPosition;
/*   */     //   16: astore_3
/*   */     //   17: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   20: pop
/*   */     //   21: getfield Yc : Lf/R40;
/*   */     //   24: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt
/*   */     //   27: dup
/*   */     //   28: astore #4
/*   */     //   30: ifnull -> 47
/*   */     //   33: aload #4
/*   */     //   35: aload_1
/*   */     //   36: aload_0
/*   */     //   37: aload_3
/*   */     //   38: invokevirtual canRender : (Lf/Xw0;Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$AlignMode;Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$OriginPosition;)Z
/*   */     //   41: ifeq -> 47
/*   */     //   44: goto -> 125
/*   */     //   47: aload_2
/*   */     //   48: getfield MJ : Lf/fQ;
/*   */     //   51: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   54: astore #4
/*   */     //   56: aload #4
/*   */     //   58: invokevirtual hasNext : ()Z
/*   */     //   61: ifeq -> 91
/*   */     //   64: aload #4
/*   */     //   66: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   69: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt
/*   */     //   72: dup
/*   */     //   73: astore #5
/*   */     //   75: aload_1
/*   */     //   76: aload_0
/*   */     //   77: aload_3
/*   */     //   78: invokevirtual canRender : (Lf/Xw0;Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$AlignMode;Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$OriginPosition;)Z
/*   */     //   81: ifeq -> 56
/*   */     //   84: aload #5
/*   */     //   86: astore #4
/*   */     //   88: goto -> 125
/*   */     //   91: aload_2
/*   */     //   92: new com/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt
/*   */     //   95: dup
/*   */     //   96: dup
/*   */     //   97: astore #4
/*   */     //   99: aload_1
/*   */     //   100: new com/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$Config
/*   */     //   103: dup
/*   */     //   104: astore_1
/*   */     //   105: aload_0
/*   */     //   106: aload_3
/*   */     //   107: invokespecial <init> : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$AlignMode;Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$OriginPosition;)V
/*   */     //   110: aload_1
/*   */     //   111: invokespecial <init> : (Lf/Xw0;Lcom/badlogic/gdx/graphics/g3d/particles/ParticleShaderExt$Config;)V
/*   */     //   114: invokevirtual init : ()V
/*   */     //   117: getfield MJ : Lf/fQ;
/*   */     //   120: aload #4
/*   */     //   122: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   125: aload #4
/*   */     //   127: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 21
/*   */     //   #2	-> 92
/*   */     //   #3	-> 114
/*   */   }
/*   */   
/*   */   private void allocShader() {
/*   */     Xw0 xw0;
/*   */     R40 r40 = getShader(xw0);
/*   */     this.shader = this;
/*   */     this.renderablePool.free(xw0);
/*   */   }
/*   */   
/*   */   private void clearRenderablesPool() {
/*   */     this.renderablePool.freeAll(this.renderables);
/*   */     byte b = 0;
/*   */     int i = this.renderablePool.getFree();
/*   */     while (b < i) {
/*   */       ((Xw0)this.renderablePool.obtain()).L90.u90.dispose();
/*   */       b++;
/*   */     } 
/*   */     this.renderables.clear();
/*   */   }
/*   */   
/*   */   private void initRenderData() {
/*   */     setVertexData();
/*   */     clearRenderablesPool();
/*   */     allocShader();
/*   */     resetCapacity();
/*   */   }
/*   */   
/*   */   private static void putVertex(float[] paramArrayOffloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13) {
/*   */     int i;
/*   */     paramArrayOffloat[paramInt + (i = GPU_POSITION_OFFSET)] = paramFloat1;
/*   */     paramArrayOffloat[paramInt + i + 1] = paramFloat2;
/*   */     paramArrayOffloat[paramInt + i + 2] = paramFloat3;
/*   */     paramArrayOffloat[paramInt + (i = GPU_UV_OFFSET)] = paramFloat4;
/*   */     paramArrayOffloat[paramInt + i + 1] = paramFloat5;
/*   */     paramArrayOffloat[paramInt + (i = GPU_SIZE_ROTATION_OFFSET)] = paramFloat6;
/*   */     paramArrayOffloat[paramInt + i + 1] = paramFloat7;
/*   */     paramArrayOffloat[paramInt + i + 2] = paramFloat8;
/*   */     paramArrayOffloat[paramInt + i + 3] = paramFloat9;
/*   */     paramArrayOffloat[paramInt + (i = GPU_COLOR_OFFSET)] = paramFloat10;
/*   */     paramArrayOffloat[paramInt + i + 1] = paramFloat11;
/*   */     paramArrayOffloat[paramInt + i + 2] = paramFloat12;
/*   */     paramArrayOffloat[paramInt + i + 3] = paramFloat13;
/*   */   }
/*   */   
/*   */   private void fillVerticesGPU(int[] paramArrayOfint) {
/*   */     byte b = 0;
/*   */     Hc0 hc0 = this.renderData.r30();
/*   */     while (hc0.hasNext()) {
/*   */       ParallelArray.FloatChannel floatChannel1 = ((ParticleControllerRenderData)hc0.next()).scaleChannel;
/*   */       ParallelArray.FloatChannel floatChannel2 = ((ParticleControllerRenderData)hc0.next()).regionChannel;
/*   */       ParallelArray.FloatChannel floatChannel3 = ((ParticleControllerRenderData)hc0.next()).positionChannel;
/*   */       ParallelArray.FloatChannel floatChannel4 = ((ParticleControllerRenderData)hc0.next()).colorChannel;
/*   */       ParallelArray.FloatChannel floatChannel5 = ((ParticleControllerRenderData)hc0.next()).rotationChannel;
/*   */       byte b1 = 0;
/*   */       int i = ((ParticleControllerRenderData)hc0.next()).controller.particles.size;
/*   */       while (b1 < i) {
/*   */         int k;
/*   */         float f3 = floatChannel1.data[b1 * (k = ((ParallelArray.Channel)floatChannel1).strideSize) + 0];
/*   */         float f2 = floatChannel1.data[b1 * k + 1];
/*   */         int n = b1 * ((ParallelArray.Channel)floatChannel2).strideSize;
/*   */         int i1 = b1 * ((ParallelArray.Channel)floatChannel3).strideSize;
/*   */         int i2 = b1 * ((ParallelArray.Channel)floatChannel4).strideSize;
/*   */         int i3 = b1 * ((ParallelArray.Channel)floatChannel5).strideSize;
/*   */         float f5 = arrayOfFloat1[i1 + 0];
/*   */         float f8 = arrayOfFloat1[i1 + 1];
/*   */         float[] arrayOfFloat1;
/*   */         float f9 = (arrayOfFloat1 = floatChannel3.data)[i1 + 2];
/*   */         float f4 = arrayOfFloat2[n + 0];
/*   */         float f10 = arrayOfFloat2[n + 1];
/*   */         float f11 = arrayOfFloat2[n + 2];
/*   */         float f12 = arrayOfFloat2[n + 3];
/*   */         f3 = arrayOfFloat2[n + 4] * f3;
/*   */         float[] arrayOfFloat2;
/*   */         f2 = (arrayOfFloat2 = floatChannel2.data)[n + 5] * f2;
/*   */         float f6 = arrayOfFloat3[i2 + 0];
/*   */         float f13 = arrayOfFloat3[i2 + 1];
/*   */         float f14 = arrayOfFloat3[i2 + 2];
/*   */         float[] arrayOfFloat3;
/*   */         float f15 = (arrayOfFloat3 = floatChannel4.data)[i2 + 3];
/*   */         float f7 = floatChannel5.data[i3 + 0];
/*   */         float f16 = floatChannel5.data[i3 + 1];
/*   */         float f1 = -f3;
/*   */         float f17 = -f2;
/*   */         putVertex(this.vertices, j, f5, f8, f9, f4, f12, f1, f17, f7, f16, f6, f13, f14, f15);
/*   */         putVertex(this.vertices, i5, f5, f8, f9, f11, f12, f3, f17, f7, f16, f6, f13, f14, f15);
/*   */         putVertex(this.vertices, i4, f5, f8, f9, f11, f10, f3, f2, f7, f16, f6, f13, f14, f15);
/*   */         int j;
/*   */         int i4;
/*   */         int i5;
/*   */         int m = (i4 = (i5 = (j = paramArrayOfint[b] * this.currentVertexSize * 4) + this.currentVertexSize) + this.currentVertexSize) + this.currentVertexSize;
/*   */         putVertex(this.vertices, m, f5, f8, f9, f4, f10, f1, f2, f7, f16, f6, f13, f14, f15);
/*   */         b1++;
/*   */         b++;
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   static {
/*   */     this(1, 3, "a_position");
/*   */     lw0 lw0;
/*   */     (new lw0[4])[0] = lw0;
/*   */     this(16, 2, "a_texCoord0");
/*   */     (new lw0[4])[1] = lw0;
/*   */     this(2, 4, "a_color");
/*   */     (new lw0[4])[2] = lw0;
/*   */     this(512, 4, "a_sizeAndRotation");
/*   */     GPU_POSITION_OFFSET = (short)(((GPU_ATTRIBUTES = new Ao(new lw0[] { null, null, null, lw0 })).kA(1)).TZ / 4);
/*   */     GPU_UV_OFFSET = (short)(((new Ao(new lw0[] { null, null, null, lw0 })).kA(16)).TZ / 4);
/*   */     GPU_SIZE_ROTATION_OFFSET = (short)(((new Ao(new lw0[] { null, null, null, lw0 })).kA(512)).TZ / 4);
/*   */     GPU_COLOR_OFFSET = (short)(((new Ao(new lw0[] { null, null, null, lw0 })).kA(2)).TZ / 4);
/*   */     GPU_VERTEX_SIZE = (new Ao(new lw0[] { null, null, null, lw0 })).Nb / 4;
/*   */   }
/*   */   
/*   */   public void allocParticlesData(int paramInt) {
/*   */     this.vertices = new float[this.currentVertexSize * 4 * paramInt];
/*   */     allocRenderables(paramInt);
/*   */   }
/*   */   
/*   */   public void setVertexData() {
/*   */     this.currentAttributes = GPU_ATTRIBUTES;
/*   */     this.currentVertexSize = GPU_VERTEX_SIZE;
/*   */   }
/*   */   
/*   */   public void setOriginPosition(ParticleShaderExt.OriginPosition paramOriginPosition) {
/*   */     if (paramOriginPosition != this.origin) {
/*   */       this.origin = paramOriginPosition;
/*   */       initRenderData();
/*   */       allocRenderables(this.bufferedParticlesCount);
/*   */     } 
/*   */   }
/*   */   
/*   */   public ParticleShaderExt.OriginPosition getOriginPosition() {
/*   */     return this.origin;
/*   */   }
/*   */   
/*   */   public void setAlignMode(ParticleShaderExt.AlignMode paramAlignMode) {
/*   */     if (paramAlignMode != this.mode) {
/*   */       this.mode = paramAlignMode;
/*   */       initRenderData();
/*   */       allocRenderables(this.bufferedParticlesCount);
/*   */     } 
/*   */   }
/*   */   
/*   */   public ParticleShaderExt.AlignMode getAlignMode() {
/*   */     return this.mode;
/*   */   }
/*   */   
/*   */   public void setTexture(Texture paramTexture) {
/*   */     this.renderablePool.freeAll(this.renderables);
/*   */     this.renderables.clear();
/*   */     byte b = 0;
/*   */     int i = this.renderablePool.getFree();
/*   */     while (b < i) {
/*   */       Xw0 xw0;
/*   */       ((O80)(xw0 = (Xw0)this.renderablePool.obtain()).bL.cOM1(O80.Jg0)).cv0.ze = (zp)paramTexture;
/*   */       this.renderables.Com3(xw0);
/*   */       b++;
/*   */     } 
/*   */     this.renderablePool.freeAll(this.renderables);
/*   */     this.renderables.clear();
/*   */     this.texture = paramTexture;
/*   */   }
/*   */   
/*   */   public Texture getTexture() {
/*   */     return this.texture;
/*   */   }
/*   */   
/*   */   public void begin() {
/*   */     super.begin();
/*   */     this.renderablePool.freeAll(this.renderables);
/*   */     this.renderables.clear();
/*   */   }
/*   */   
/*   */   public void flush(int[] paramArrayOfint) {
/*   */     fillVerticesGPU(paramArrayOfint);
/*   */     for (int i = this.bufferedParticlesCount * 4, j = 0; j < i; ) {
/*   */       int k = Math.min(i - j, 1000);
/*   */       Xw0 xw0;
/*   */       (xw0 = (Xw0)this.renderablePool.obtain()).L90.Dr = k / 4 * 6;
/*   */       re0 re0 = (xw0 = (Xw0)this.renderablePool.obtain()).L90.u90;
/*   */       float[] arrayOfFloat = this.vertices;
/*   */       int m = this.currentVertexSize;
/*   */       j = m * j;
/*   */       k = m * k;
/*   */       re0.Dt0.Dc(j, k, arrayOfFloat);
/*   */       xw0.L90.H90();
/*   */       this.renderables.Com3(xw0);
/*   */       j += k;
/*   */     } 
/*   */   }
/*   */   
/*   */   public void getRenderables(fQ paramfQ, Lc paramLc) {
/*   */     Hc0 hc0 = this.renderables.r30();
/*   */     while (hasNext()) {
/*   */       Xw0 xw0 = (Xw0)next();
/*   */       paramfQ.Com3(((Xw0)paramLc.obtain()).wz(xw0));
/*   */     } 
/*   */   }
/*   */   
/*   */   public void save(ResourceData.SaveData paramSaveData, sz0 paramsz0) {
/*   */     ParticleShaderExt.AlignMode alignMode = this.mode;
/*   */     this(this, this.origin);
/*   */     Config config;
/*   */     paramSaveData.save("cfg", config);
/*   */   }
/*   */   
/*   */   public void load(ResourceData.SaveData paramSaveData) {
/*   */     if (paramSaveData != null) {
/*   */       Config config = (Config)paramSaveData.load("cfg");
/*   */       initRenderData();
/*   */       allocRenderables(this.bufferedParticlesCount);
/*   */       setAlignMode(this.mode);
/*   */       setOriginPosition(this.origin);
/*   */     } 
/*   */   }
/*   */   
/*   */   public void save(sz0 paramsz0, ResourceData paramResourceData) {}
/*   */   
/*   */   public void load(sz0 paramsz0, ResourceData paramResourceData) {
/*   */     ResourceData.SaveData saveData;
/*   */     if ((saveData = paramResourceData.getSaveData("billboardBatchExt")) != null) {
/*   */       Config config = (Config)saveData.load("cfg");
/*   */       initRenderData();
/*   */       allocRenderables(this.bufferedParticlesCount);
/*   */       setAlignMode(this.mode);
/*   */       setOriginPosition(this.origin);
/*   */     } 
/*   */   }
/*   */   
/*   */   public void dispose() {
/*   */     clearRenderablesPool();
/*   */   }
/*   */   
/*   */   public ny getCamera() {
/*   */     return this.camera;
/*   */   }
/*   */   
/*   */   public static class Config {
/*   */     public ParticleShaderExt.AlignMode mode;
/*   */     public ParticleShaderExt.OriginPosition origin;
/*   */     public boolean useGPU;
/*   */     
/*   */     public Config() {}
/*   */     
/*   */     public Config(ParticleShaderExt.AlignMode param1AlignMode, ParticleShaderExt.OriginPosition param1OriginPosition) {
/*   */       this.mode = param1AlignMode;
/*   */       this.origin = param1OriginPosition;
/*   */     }
/*   */   }
/*   */   
/*   */   private class RenderablePool extends Lc {
/*   */     public Xw0 newObject() {
/*   */       return BillboardParticleBatchExt.this.allocRenderable();
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatchExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */