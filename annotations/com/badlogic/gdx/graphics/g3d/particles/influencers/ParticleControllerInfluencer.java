/*   */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public abstract class ParticleControllerInfluencer extends Influencer { public fQ templates; public ParallelArray.ObjectChannel particleControllerChannel; public ParticleControllerInfluencer() { fQ fQ1; this(true, 1, ParticleController.class); this.templates = this; } public ParticleControllerInfluencer(ParticleController... paramVarArgs) { fQ fQ1; this((Object[])paramVarArgs); this.templates = this; } public ParticleControllerInfluencer(ParticleControllerInfluencer paramParticleControllerInfluencer) { this((ParticleController[])paramParticleControllerInfluencer.templates.Uq0); } public void allocateChannels() { this.particleControllerChannel = (ParallelArray.ObjectChannel)this.controller.particles.addChannel(ParticleChannels.ParticleController); } public void end() { for (byte b = 0; b < this.controller.particles.size; b++) ((ParticleController[])this.particleControllerChannel.data)[b].end();  } public void dispose() { if (this.controller != null) for (byte b = 0; b < this.controller.particles.size; b++) { ParticleController particleController; if ((particleController = ((ParticleController[])this.particleControllerChannel.data)[b]) != null) { particleController.dispose(); ((ParticleController[])this.particleControllerChannel.data)[b] = null; }  }   } public void save(sz0 paramsz0, ResourceData paramResourceData) { // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: dup
/*   */     //   2: aload_2
/*   */     //   3: invokevirtual createSaveData : ()Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   6: astore_2
/*   */     //   7: ldc com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   9: astore_3
/*   */     //   10: new f/fQ
/*   */     //   13: dup
/*   */     //   14: astore #4
/*   */     //   16: invokespecial <init> : ()V
/*   */     //   19: monitorenter
/*   */     //   20: getfield MO : Lf/f7;
/*   */     //   23: aload_3
/*   */     //   24: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   27: checkcast f/f7
/*   */     //   30: dup
/*   */     //   31: astore_3
/*   */     //   32: ifnull -> 72
/*   */     //   35: aload_3
/*   */     //   36: invokevirtual mw0 : ()Lf/TA;
/*   */     //   39: dup
/*   */     //   40: astore_3
/*   */     //   41: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   44: pop
/*   */     //   45: aload_3
/*   */     //   46: invokevirtual hasNext : ()Z
/*   */     //   49: ifeq -> 72
/*   */     //   52: aload #4
/*   */     //   54: aload_3
/*   */     //   55: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   60: checkcast f/UI
/*   */     //   63: getfield pE0 : Ljava/lang/Object;
/*   */     //   66: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   69: goto -> 45
/*   */     //   72: aload_1
/*   */     //   73: monitorexit
/*   */     //   74: new f/fQ
/*   */     //   77: dup
/*   */     //   78: astore_3
/*   */     //   79: aload_0
/*   */     //   80: getfield templates : Lf/fQ;
/*   */     //   83: invokespecial <init> : (Lf/fQ;)V
/*   */     //   86: new f/fQ
/*   */     //   89: dup
/*   */     //   90: astore_0
/*   */     //   91: invokespecial <init> : ()V
/*   */     //   94: iconst_0
/*   */     //   95: istore #5
/*   */     //   97: iload #5
/*   */     //   99: aload #4
/*   */     //   101: getfield Z8 : I
/*   */     //   104: if_icmpge -> 228
/*   */     //   107: aload_3
/*   */     //   108: getfield Z8 : I
/*   */     //   111: ifle -> 228
/*   */     //   114: aload_3
/*   */     //   115: aload #4
/*   */     //   117: iload #5
/*   */     //   119: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   122: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   125: dup
/*   */     //   126: astore #6
/*   */     //   128: invokevirtual getControllers : ()Lf/fQ;
/*   */     //   131: astore #7
/*   */     //   133: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   136: astore #8
/*   */     //   138: aconst_null
/*   */     //   139: astore #9
/*   */     //   141: aload #8
/*   */     //   143: invokevirtual hasNext : ()Z
/*   */     //   146: ifeq -> 199
/*   */     //   149: aload #7
/*   */     //   151: aload #8
/*   */     //   153: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   156: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleController
/*   */     //   159: iconst_1
/*   */     //   160: invokevirtual JF0 : (Ljava/lang/Object;Z)I
/*   */     //   163: dup
/*   */     //   164: istore #10
/*   */     //   166: iconst_m1
/*   */     //   167: if_icmple -> 141
/*   */     //   170: aload #9
/*   */     //   172: ifnonnull -> 184
/*   */     //   175: new f/o0
/*   */     //   178: dup
/*   */     //   179: astore #9
/*   */     //   181: invokespecial <init> : ()V
/*   */     //   184: aload #9
/*   */     //   186: iload #10
/*   */     //   188: aload #8
/*   */     //   190: invokevirtual remove : ()V
/*   */     //   193: invokevirtual oU : (I)V
/*   */     //   196: goto -> 141
/*   */     //   199: aload #9
/*   */     //   201: ifnull -> 222
/*   */     //   204: aload_0
/*   */     //   205: aload #9
/*   */     //   207: aload_2
/*   */     //   208: aload_1
/*   */     //   209: aload #6
/*   */     //   211: invokevirtual kF : (Lf/iq0;)Ljava/lang/String;
/*   */     //   214: ldc com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   216: invokevirtual saveAsset : (Ljava/lang/String;Ljava/lang/Class;)V
/*   */     //   219: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   222: iinc #5, 1
/*   */     //   225: goto -> 97
/*   */     //   228: aload_2
/*   */     //   229: ldc 'indices'
/*   */     //   231: aload_0
/*   */     //   232: invokevirtual save : (Ljava/lang/String;Ljava/lang/Object;)V
/*   */     //   235: return
/*   */     //   236: aload_1
/*   */     //   237: monitorexit
/*   */     //   238: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 20
/*   */     //   #2	-> 74
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   20	30	236	finally
/*   */     //   35	39	236	finally
/*   */     //   41	44	236	finally
/*   */     //   45	49	236	finally
/*   */     //   52	72	236	finally } public void load(sz0 paramsz0, ResourceData paramResourceData) { // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: invokevirtual getSaveData : ()Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   4: dup
/*   */     //   5: astore_2
/*   */     //   6: ldc 'indices'
/*   */     //   8: invokevirtual load : (Ljava/lang/String;)Ljava/lang/Object;
/*   */     //   11: checkcast f/fQ
/*   */     //   14: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   17: astore_3
/*   */     //   18: aload_2
/*   */     //   19: invokevirtual loadAsset : ()Lf/bs;
/*   */     //   22: dup
/*   */     //   23: astore #4
/*   */     //   25: ifnull -> 128
/*   */     //   28: aload_1
/*   */     //   29: aload #4
/*   */     //   31: dup
/*   */     //   32: aload_1
/*   */     //   33: monitorenter
/*   */     //   34: getfield bz : Ljava/lang/String;
/*   */     //   37: astore #4
/*   */     //   39: getfield RA0 : Ljava/lang/Class;
/*   */     //   42: aload #4
/*   */     //   44: invokevirtual Yo : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*   */     //   47: aload_1
/*   */     //   48: monitorexit
/*   */     //   49: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   52: dup
/*   */     //   53: astore #4
/*   */     //   55: ifnull -> 115
/*   */     //   58: aload_3
/*   */     //   59: aload #4
/*   */     //   61: invokevirtual getControllers : ()Lf/fQ;
/*   */     //   64: astore #4
/*   */     //   66: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   69: checkcast f/o0
/*   */     //   72: dup
/*   */     //   73: astore #5
/*   */     //   75: iconst_0
/*   */     //   76: istore #6
/*   */     //   78: getfield mG0 : I
/*   */     //   81: istore #7
/*   */     //   83: iload #6
/*   */     //   85: iload #7
/*   */     //   87: if_icmpge -> 18
/*   */     //   90: aload_0
/*   */     //   91: getfield templates : Lf/fQ;
/*   */     //   94: aload #4
/*   */     //   96: aload #5
/*   */     //   98: iload #6
/*   */     //   100: invokevirtual Vl : (I)I
/*   */     //   103: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   106: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   109: iinc #6, 1
/*   */     //   112: goto -> 83
/*   */     //   115: new java/lang/RuntimeException
/*   */     //   118: dup
/*   */     //   119: ldc 'Template is null'
/*   */     //   121: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   124: athrow
/*   */     //   125: aload_1
/*   */     //   126: monitorexit
/*   */     //   127: athrow
/*   */     //   128: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 34
/*   */     //   #2	-> 49
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   34	37	125	finally
/* 1 */     //   39	47	125	finally } public static class Random extends ParticleControllerInfluencer { public ParticleControllerPool pool; public Random() { ParticleControllerPool particleControllerPool; this(this); this.pool = particleControllerPool; } public Random(ParticleController... param1VarArgs) { super(param1VarArgs); ParticleControllerPool particleControllerPool; this(this); this.pool = particleControllerPool; } public Random(Random param1Random) { super(param1Random); ParticleControllerPool particleControllerPool; this(this); this.pool = particleControllerPool; } public void init() { this.pool.clear(); for (byte b = 0; b < this.controller.emitter.maxParticleCount; b++) this.pool.free(this.pool.newObject());  } public void dispose() { this.pool.clear(); super.dispose(); } public void activateParticles(int param1Int1, int param1Int2) { param1Int2 = param1Int1 + param1Int2; while (param1Int1 < param1Int2) { ParticleController particleController; (particleController = (ParticleController)this.pool.obtain()).start(); ((ParticleController[])this.particleControllerChannel.data)[param1Int1] = particleController; param1Int1++; }  } public void killParticles(int param1Int1, int param1Int2) { param1Int2 = param1Int1 + param1Int2; while (param1Int1 < param1Int2) { ParticleController particleController; (particleController = ((ParticleController[])this.particleControllerChannel.data)[param1Int1]).end(); this.pool.free(particleController); ((ParticleController[])this.particleControllerChannel.data)[param1Int1] = null; param1Int1++; }  } public Random copy() { return new Random(this); } private class ParticleControllerPool extends Lc { public ParticleController newObject() { Object object; int i; if ((i = (object = ParticleControllerInfluencer.Random.this.templates).Z8) == 0) { object = null; }
/*   */         else
/*   */         
/* 4 */         { object = this.Uq0[nx0.Mc0.nextInt(i - 1 - 0 + 1) + 0]; }  ((ParticleController)this)
/* 5 */           .copy().init(); return ((ParticleController)this).copy(); }
/*   */ 
/*   */       
/*   */       public void clear() {
/*   */         byte b = 0;
/*   */         int i = ParticleControllerInfluencer.Random.this.pool.getFree();
/*   */         while (b < i) {
/*   */           ((ParticleController)ParticleControllerInfluencer.Random.this.pool.obtain()).dispose();
/*   */           b++;
/*   */         } 
/*   */         super.clear();
/*   */       } }
/*   */      }
/*   */ 
/*   */   
/*   */   public static class Single extends ParticleControllerInfluencer {
/*   */     public Single(ParticleController... param1VarArgs) {
/*   */       super(param1VarArgs);
/*   */     }
/*   */     
/*   */     public Single() {}
/*   */     
/*   */     public Single(Single param1Single) {
/*   */       super(param1Single);
/*   */     }
/*   */     
/*   */     public void init() {
/*   */       ParticleController particleController = (ParticleController)this.templates.first();
/*   */       byte b = 0;
/*   */       int i = this.controller.particles.capacity;
/*   */       while (b < i) {
/*   */         ParticleController particleController1;
/*   */         (particleController1 = particleController.copy()).init();
/*   */         ((ParticleController[])this.particleControllerChannel.data)[b] = particleController1;
/*   */         b++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public void activateParticles(int param1Int1, int param1Int2) {
/*   */       param1Int2 = param1Int1 + param1Int2;
/*   */       while (param1Int1 < param1Int2) {
/*   */         ((ParticleController[])this.particleControllerChannel.data)[param1Int1].start();
/*   */         param1Int1++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public void killParticles(int param1Int1, int param1Int2) {
/*   */       param1Int2 = param1Int1 + param1Int2;
/*   */       while (param1Int1 < param1Int2) {
/*   */         ((ParticleController[])this.particleControllerChannel.data)[param1Int1].end();
/*   */         param1Int1++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public Single copy() {
/*   */       return new Single(this);
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/ParticleControllerInfluencer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */