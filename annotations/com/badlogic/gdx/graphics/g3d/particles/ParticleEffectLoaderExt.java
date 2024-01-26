/* 1 */ package com.badlogic.gdx.graphics.g3d.particles;public class ParticleEffectLoaderExt extends Ar0 { public fQ items; private Object find(fQ paramfQ, Class paramClass) { for (Hc0 hc0 = paramfQ.r30(); hasNext();) { if (paramClass.isAssignableFrom((object = next()).getClass())) return object;  }  return null; } public ParticleEffectLoaderExt(Xt0 paramXt0) { super(paramXt0); fQ fQ1; this(); this.items = this; } public void loadAsync(sz0 paramsz0, String paramString, RD0 paramRD0, ParticleEffectLoadParameterExt paramParticleEffectLoadParameterExt) {} public fQ getDependencies(String paramString, RD0 paramRD0, ParticleEffectLoadParameterExt paramParticleEffectLoadParameterExt) { ResourceData.AssetData assetData; ResourceData resourceData = (ResourceData)(new It()).VL0(paramRD0, ResourceData.class); fQ fQ1 = this.items; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */ try { fQ fQ2; this(); yO.Lb = paramString; yO yO; (yO = new yO()).mm = resourceData; this.items.Com3(yO); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
/* 2 */       return fQ2; } finally { this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=InnerObjectType{ObjectType{com/badlogic/gdx/graphics/g3d/particles/ResourceData}.Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$AssetData;}, name=null} */ }
/*   */      }
/*   */ 
/*   */   
/*   */   public void save(ParticleEffect paramParticleEffect, ParticleEffectSaveParameter paramParticleEffectSaveParameter) {
/*   */     this(paramParticleEffect);
/*   */     ResourceData resourceData;
/*   */     paramParticleEffect.save(paramParticleEffectSaveParameter.manager, this);
/*   */     int i = (paramParticleEffect.getControllers()).Z8;
/*   */     fQ fQ1;
/*   */     if ((fQ1 = paramParticleEffectSaveParameter.batches) != null) {
/*   */       byte b = 0;
/*   */       Hc0 hc0 = fQ1.r30();
/*   */       while (hc0.hasNext()) {
/*   */         ParticleBatch particleBatch = (ParticleBatch)hc0.next();
/*   */         if (b >= i) {
/*   */           System.out.println("Found too many batches. Trimming.");
/*   */           continue;
/*   */         } 
/*   */         ResourceData.SaveData saveData = createSaveData("billboardBatchExt" + b);
/*   */         b++;
/*   */         boolean bool = false;
/*   */         Hc0 hc01 = paramParticleEffect.getControllers().r30();
/*   */         while (hc01.hasNext()) {
/*   */           if (((ParticleController)hc01.next()).renderer.isCompatible(particleBatch)) {
/*   */             bool = true;
/*   */             break;
/*   */           } 
/*   */         } 
/*   */         if (bool && particleBatch instanceof BillboardParticleBatchExt) {
/*   */           ((BillboardParticleBatchExt)particleBatch).save(saveData, paramParticleEffectSaveParameter.manager);
/*   */           continue;
/*   */         } 
/*   */         if (bool)
/*   */           particleBatch.save(paramParticleEffectSaveParameter.manager, this); 
/*   */       } 
/*   */     } 
/*   */     (new It()).mt0(this, paramParticleEffectSaveParameter.file);
/*   */   }
/*   */   
/*   */   public ParticleEffect loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, ParticleEffectLoadParameterExt paramParticleEffectLoadParameterExt) {
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
/*   */     //   99: ifnull -> 340
/*   */     //   102: aload #4
/*   */     //   104: getfield batches : Lf/fQ;
/*   */     //   107: ifnull -> 340
/*   */     //   110: aload_3
/*   */     //   111: ldc 'billboardBatchExt'
/*   */     //   113: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   116: ifnull -> 170
/*   */     //   119: aload #4
/*   */     //   121: getfield batches : Lf/fQ;
/*   */     //   124: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   127: astore_0
/*   */     //   128: aload_0
/*   */     //   129: invokevirtual hasNext : ()Z
/*   */     //   132: ifeq -> 152
/*   */     //   135: aload_0
/*   */     //   136: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   139: checkcast com/badlogic/gdx/graphics/g3d/particles/batches/ParticleBatch
/*   */     //   142: aload_1
/*   */     //   143: aload_3
/*   */     //   144: invokeinterface load : (Lf/sz0;Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData;)V
/*   */     //   149: goto -> 128
/*   */     //   152: aload_3
/*   */     //   153: getfield resource : Ljava/lang/Object;
/*   */     //   156: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   159: aload #4
/*   */     //   161: getfield batches : Lf/fQ;
/*   */     //   164: invokevirtual setBatch : (Lf/fQ;)V
/*   */     //   167: goto -> 340
/*   */     //   170: aload_3
/*   */     //   171: aload #4
/*   */     //   173: getfield batches : Lf/fQ;
/*   */     //   176: iconst_0
/*   */     //   177: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   180: checkcast com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatchExt
/*   */     //   183: astore_0
/*   */     //   184: iconst_0
/*   */     //   185: istore_1
/*   */     //   186: new java/lang/StringBuilder
/*   */     //   189: dup
/*   */     //   190: invokespecial <init> : ()V
/*   */     //   193: ldc 'billboardBatchExt'
/*   */     //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   198: iload_1
/*   */     //   199: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   202: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   205: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   208: astore_2
/*   */     //   209: aload_2
/*   */     //   210: ifnull -> 284
/*   */     //   213: iload_1
/*   */     //   214: ifle -> 248
/*   */     //   217: aload #4
/*   */     //   219: new com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatchExt
/*   */     //   222: dup
/*   */     //   223: astore_0
/*   */     //   224: aload #4
/*   */     //   226: aload_0
/*   */     //   227: aload #4
/*   */     //   229: getfield shaderProvider : Lf/Xa0;
/*   */     //   232: invokespecial <init> : (Lf/Xa0;)V
/*   */     //   235: getfield camera : Lf/ny;
/*   */     //   238: invokevirtual setCamera : (Lf/ny;)V
/*   */     //   241: getfield batches : Lf/fQ;
/*   */     //   244: aload_0
/*   */     //   245: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   248: aload_3
/*   */     //   249: aload_0
/*   */     //   250: aload_2
/*   */     //   251: invokevirtual load : (Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;)V
/*   */     //   254: new java/lang/StringBuilder
/*   */     //   257: dup
/*   */     //   258: invokespecial <init> : ()V
/*   */     //   261: ldc 'billboardBatchExt'
/*   */     //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   266: iload_1
/*   */     //   267: iconst_1
/*   */     //   268: iadd
/*   */     //   269: dup
/*   */     //   270: istore_1
/*   */     //   271: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   274: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   277: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   280: astore_2
/*   */     //   281: goto -> 209
/*   */     //   284: aload_3
/*   */     //   285: iconst_0
/*   */     //   286: istore_0
/*   */     //   287: getfield resource : Ljava/lang/Object;
/*   */     //   290: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   293: invokevirtual getControllers : ()Lf/fQ;
/*   */     //   296: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   299: astore_1
/*   */     //   300: aload_1
/*   */     //   301: invokevirtual hasNext : ()Z
/*   */     //   304: ifeq -> 340
/*   */     //   307: aload_1
/*   */     //   308: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   311: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleController
/*   */     //   314: getfield renderer : Lcom/badlogic/gdx/graphics/g3d/particles/renderers/ParticleControllerRenderer;
/*   */     //   317: aload #4
/*   */     //   319: getfield batches : Lf/fQ;
/*   */     //   322: iload_0
/*   */     //   323: dup
/*   */     //   324: iconst_1
/*   */     //   325: iadd
/*   */     //   326: istore_0
/*   */     //   327: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   330: checkcast com/badlogic/gdx/graphics/g3d/particles/batches/ParticleBatch
/*   */     //   333: invokevirtual setBatch : (Lcom/badlogic/gdx/graphics/g3d/particles/batches/ParticleBatch;)Z
/*   */     //   336: pop
/*   */     //   337: goto -> 300
/*   */     //   340: aload_3
/*   */     //   341: getfield resource : Ljava/lang/Object;
/*   */     //   344: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffect
/*   */     //   347: areturn
/*   */     //   348: aload #5
/*   */     //   350: monitorexit
/*   */     //   351: athrow
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   13	19	348	finally
/*   */     //   22	25	348	finally
/*   */     //   28	38	348	finally
/*   */     //   41	51	348	finally
/*   */     //   54	63	348	finally
/*   */     //   64	72	348	finally
/*   */     //   82	88	348	finally
/*   */     //   348	351	348	finally
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
/*   */   public static class ParticleEffectLoadParameterExt extends wP {
/*   */     public fQ batches;
/*   */     public ny camera;
/*   */     public Xa0 shaderProvider;
/*   */     
/*   */     public ParticleEffectLoadParameterExt(fQ param1fQ, ny param1ny, Xa0 param1Xa0) {
/*   */       this.batches = param1fQ;
/*   */       this.camera = param1ny;
/*   */       this.shaderProvider = param1Xa0;
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleEffectLoaderExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */