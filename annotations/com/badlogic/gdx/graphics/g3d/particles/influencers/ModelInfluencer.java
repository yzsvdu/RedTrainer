/*   */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public abstract class ModelInfluencer extends Influencer { public fQ models; public ParallelArray.ObjectChannel modelChannel; public ModelInfluencer() { fQ fQ1; this(true, 1, cf0.class); this.models = this; } public ModelInfluencer(cf0... paramVarArgs) { fQ fQ1; this((Object[])paramVarArgs); this.models = this; } public ModelInfluencer(ModelInfluencer paramModelInfluencer) { this((cf0[])paramModelInfluencer.models.Ib(cf0.class)); } public void allocateChannels() { this.modelChannel = (ParallelArray.ObjectChannel)this.controller.particles.addChannel(ParticleChannels.ModelInstance); } public void save(sz0 paramsz0, ResourceData paramResourceData) { ResourceData.SaveData saveData = paramResourceData.createSaveData(); Hc0 hc0 = this.models.r30(); while (hc0.hasNext()) saveAsset(paramsz0.kF((iq0)hc0.next()), cf0.class);  } public void load(sz0 paramsz0, ResourceData paramResourceData) { // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: invokevirtual getSaveData : ()Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   4: astore_2
/*   */     //   5: aload_2
/*   */     //   6: invokevirtual loadAsset : ()Lf/bs;
/*   */     //   9: dup
/*   */     //   10: astore_3
/*   */     //   11: ifnull -> 64
/*   */     //   14: aload_1
/*   */     //   15: aload_3
/*   */     //   16: dup
/*   */     //   17: aload_1
/*   */     //   18: monitorenter
/*   */     //   19: getfield bz : Ljava/lang/String;
/*   */     //   22: astore_3
/*   */     //   23: getfield RA0 : Ljava/lang/Class;
/*   */     //   26: aload_3
/*   */     //   27: invokevirtual Yo : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*   */     //   30: aload_1
/*   */     //   31: monitorexit
/*   */     //   32: checkcast f/cf0
/*   */     //   35: dup
/*   */     //   36: astore_3
/*   */     //   37: ifnull -> 51
/*   */     //   40: aload_0
/*   */     //   41: getfield models : Lf/fQ;
/*   */     //   44: aload_3
/*   */     //   45: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   48: goto -> 5
/*   */     //   51: new java/lang/RuntimeException
/*   */     //   54: dup
/*   */     //   55: ldc 'Model is null'
/*   */     //   57: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   60: athrow
/*   */     //   61: aload_1
/*   */     //   62: monitorexit
/*   */     //   63: athrow
/*   */     //   64: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 19
/*   */     //   #2	-> 32
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   19	22	61	finally
/* 1 */     //   23	30	61	finally } public static class Random extends ModelInfluencer { public ModelInstancePool pool; public Random() { ModelInstancePool modelInstancePool; this(this); this.pool = modelInstancePool; } public Random(Random param1Random) { super(param1Random); ModelInstancePool modelInstancePool; this(this); this.pool = modelInstancePool; } public Random(cf0... param1VarArgs) { super(param1VarArgs); ModelInstancePool modelInstancePool; this(this); this.pool = modelInstancePool; } public void init() { this.pool.clear(); } public void activateParticles(int param1Int1, int param1Int2) { param1Int2 = param1Int1 + param1Int2; while (param1Int1 < param1Int2) { ((Tb[])this.modelChannel.data)[param1Int1] = (Tb)this.pool.obtain(); param1Int1++; }  } public void killParticles(int param1Int1, int param1Int2) { param1Int2 = param1Int1 + param1Int2; while (param1Int1 < param1Int2) { this.pool.free(((Tb[])this.modelChannel.data)[param1Int1]); ((Tb[])this.modelChannel.data)[param1Int1] = null; param1Int1++; }  } public Random copy() { return new Random(this); } private class ModelInstancePool extends Lc { public Tb newObject() { Tb tb = new Tb(); Object object; int i; if ((i = (object = ModelInfluencer.Random.this.models).Z8) == 0) { object = null; }
/*   */         else
/*   */         
/* 4 */         { object = ((fQ)object).Uq0[nx0.Mc0.nextInt(i - 1 - 0 + 1) + 0]; }
/* 5 */          this((cf0)object);
/*   */         return this; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public static class Single extends ModelInfluencer {
/*   */     public Single() {}
/*   */     
/*   */     public Single(Single param1Single) {
/*   */       super(param1Single);
/*   */     }
/*   */     
/*   */     public Single(cf0... param1VarArgs) {
/*   */       super(param1VarArgs);
/*   */     }
/*   */     
/*   */     public void init() {
/*   */       cf0 cf0 = (cf0)this.models.first();
/*   */       byte b = 0;
/*   */       int i = this.controller.emitter.maxParticleCount;
/*   */       while (b < i) {
/*   */         Tb tb;
/*   */         this(cf0);
/*   */         ((Tb[])this.modelChannel.data)[b] = tb;
/*   */         b++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public Single copy() {
/*   */       return new Single(this);
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/ModelInfluencer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */