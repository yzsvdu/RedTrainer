/* 1 */ package com.badlogic.gdx.graphics.g3d.particles;public class ParticleEffectLoader extends Ar0 { public fQ items; private Object find(fQ paramfQ, Class paramClass) { for (Hc0 hc0 = paramfQ.r30(); hasNext();) { if (paramClass.isAssignableFrom((object = next()).getClass())) return object;  }  return null; } public ParticleEffectLoader(Xt0 paramXt0) { super(paramXt0); fQ fQ1; this(); this.items = this; } public void loadAsync(sz0 paramsz0, String paramString, RD0 paramRD0, ParticleEffectLoadParameter paramParticleEffectLoadParameter) {} public fQ getDependencies(String paramString, RD0 paramRD0, ParticleEffectLoadParameter paramParticleEffectLoadParameter) { ResourceData.AssetData assetData; ResourceData resourceData = (ResourceData)(new It()).VL0(paramRD0, ResourceData.class); fQ fQ1 = this.items; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */ try { fQ fQ2; this(); yO.Lb = paramString; yO yO; (yO = new yO()).mm = resourceData; this.items.Com3(yO); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
/* 2 */       return fQ2; } finally { this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=InnerObjectType{ObjectType{com/badlogic/gdx/graphics/g3d/particles/ResourceData}.Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$AssetData;}, name=null} */ }
/*   */      }
/*   */ 
/*   */   
/*   */   public void save(ParticleEffect paramParticleEffect, ParticleEffectSaveParameter paramParticleEffectSaveParameter) {
/*   */     this(paramParticleEffect);
/*   */     ResourceData resourceData;
/*   */     paramParticleEffect.save(paramParticleEffectSaveParameter.manager, this);
/*   */     fQ fQ1;
/*   */     if ((fQ1 = paramParticleEffectSaveParameter.batches) != null) {
/*   */       Hc0 hc0 = fQ1.r30();
/*   */       while (hc0.hasNext()) {
/*   */         ParticleBatch particleBatch = (ParticleBatch)hc0.next();
/*   */         boolean bool = false;
/*   */         Hc0 hc01 = paramParticleEffect.getControllers().r30();
/*   */         while (hc01.hasNext()) {
/*   */           if (((ParticleController)hc01.next()).renderer.isCompatible(particleBatch)) {
/*   */             bool = true;
/*   */             break;
/*   */           } 
/*   */         } 
/*   */         if (bool)
/*   */           particleBatch.save(paramParticleEffectSaveParameter.manager, this); 
/*   */       } 
/*   */     } 
/*   */     (new It()).mt0(this, paramParticleEffectSaveParameter.file);
/*   */   }
/*   */   
/*   */   public ParticleEffect loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, ParticleEffectLoadParameter paramParticleEffectLoadParameter) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aconst_null
/*   */     //   2: astore_3
/*   */     //   3: getfield items : Lf/fQ;
/*   */     //   6: dup
/*   */     //   7: astore #5
/*   */     //   9: monitorenter
/*   */     //   10: iconst_0
/*   */     //   11: istore #6
/*   */     //   13: iload #6
/*   */     //   15: aload_0
/*   */     //   16: getfield items : Lf/fQ;
/*   */     //   19: dup
/*   */     //   20: astore #7
/*   */     //   22: getfield Z8 : I
/*   */     //   25: if_icmpge -> 82
/*   */     //   28: aload #7
/*   */     //   30: iload #6
/*   */     //   32: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   35: checkcast f/yO
/*   */     //   38: dup
/*   */     //   39: astore #7
/*   */     //   41: getfield Lb : Ljava/lang/Object;
/*   */     //   44: checkcast java/lang/String
/*   */     //   47: aload_2
/*   */     //   48: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   51: ifeq -> 76
/*   */     //   54: aload_0
/*   */     //   55: aload #7
/*   */     //   57: getfield mm : Ljava/lang/Object;
/*   */     //   60: checkcast com/badlogic/gdx/graphics/g3d/particles/ResourceData
/*   */     //   63: astore_3
/*   */     //   64: getfield items : Lf/fQ;
/*   */     //   67: iload #6
/*   */     //   69: invokevirtual Hc : (I)Ljava/lang/Object;
/*   */     //   72: pop
/*   */     //   73: goto -> 82
/*   */     //   76: iinc #6, 1
/*   */     //   79: goto -> 13
/*   */     //   82: aload #4
/*   */     //   84: aload_3
/*   */     //   85: aload #5
/*   */     //   87: monitorexit
/*   */     //   88: getfield resource : Ljava/lang/Object;
/*   */     //   91: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   94: aload_1
/*   */     //   95: aload_3
/*   */     //   96: invokevirtual load : (Lf/sz0;Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData;)V
/*   */     //   99: ifnull -> 156
/*   */     //   102: aload #4
/*   */     //   104: getfield batches : Lf/fQ;
/*   */     //   107: dup
/*   */     //   108: astore_0
/*   */     //   109: ifnull -> 141
/*   */     //   112: aload_0
/*   */     //   113: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   116: astore_0
/*   */     //   117: aload_0
/*   */     //   118: invokevirtual hasNext : ()Z
/*   */     //   121: ifeq -> 141
/*   */     //   124: aload_0
/*   */     //   125: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   128: checkcast com/badlogic/gdx/graphics/g3d/particles/batches/ParticleBatch
/*   */     //   131: aload_1
/*   */     //   132: aload_3
/*   */     //   133: invokeinterface load : (Lf/sz0;Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData;)V
/*   */     //   138: goto -> 117
/*   */     //   141: aload_3
/*   */     //   142: getfield resource : Ljava/lang/Object;
/*   */     //   145: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   148: aload #4
/*   */     //   150: getfield batches : Lf/fQ;
/*   */     //   153: invokevirtual setBatch : (Lf/fQ;)V
/*   */     //   156: aload_3
/*   */     //   157: getfield resource : Ljava/lang/Object;
/*   */     //   160: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   163: areturn
/*   */     //   164: aload #5
/*   */     //   166: monitorexit
/*   */     //   167: athrow
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   13	19	164	finally
/*   */     //   22	25	164	finally
/*   */     //   28	38	164	finally
/*   */     //   41	51	164	finally
/*   */     //   54	63	164	finally
/*   */     //   64	72	164	finally
/*   */     //   82	88	164	finally
/*   */     //   164	167	164	finally
/*   */   }
/*   */   
/*   */   public static class ParticleEffectSaveParameter extends wP {
/*   */     public fQ batches;
/*   */     public RD0 file;
/*   */     public sz0 manager;
/*   */     
/*   */     public ParticleEffectSaveParameter(RD0 param1RD0, sz0 param1sz0, fQ param1fQ) {
/*   */       this.batches = param1fQ;
/*   */       this.file = param1RD0;
/*   */       this.manager = param1sz0;
/*   */     }
/*   */   }
/*   */   
/*   */   public static class ParticleEffectLoadParameter extends wP {
/*   */     public fQ batches;
/*   */     
/*   */     public ParticleEffectLoadParameter(fQ param1fQ) {
/*   */       this.batches = param1fQ;
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleEffectLoader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */