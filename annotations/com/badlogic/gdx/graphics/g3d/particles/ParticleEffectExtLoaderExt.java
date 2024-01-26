/* 1 */ package com.badlogic.gdx.graphics.g3d.particles;public class ParticleEffectExtLoaderExt extends Ar0 { private static final ik log = C00.gd(ParticleEffectExtLoaderExt.class); public fQ items; public fQ getDependencies(String paramString, RD0 paramRD0, ParticleEffectLoadParameterExt paramParticleEffectLoadParameterExt) { ResourceData.AssetData assetData; ResourceData resourceData = (ResourceData)(new It()).VL0(paramRD0, ResourceData.class); fQ fQ1 = this.items; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */ try { fQ fQ2; this(); yO.Lb = paramString; yO yO; (yO = new yO()).mm = resourceData; this.items.Com3(yO); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
/* 2 */       return fQ2; } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=InnerObjectType{ObjectType{com/badlogic/gdx/graphics/g3d/particles/ResourceData}.Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$AssetData;}, name=null} */ }  } public ParticleEffectExtLoaderExt(Xt0 paramXt0) { super(paramXt0); fQ fQ1; this(); this.items = this; } public void loadAsync(sz0 paramsz0, String paramString, RD0 paramRD0, ParticleEffectLoadParameterExt paramParticleEffectLoadParameterExt) {} public void save(ParticleEffectExt paramParticleEffectExt, ParticleEffectSaveParameter paramParticleEffectSaveParameter) { ResourceData resourceData = getResourceData(paramParticleEffectExt, paramParticleEffectSaveParameter); (new It()).mt0(this, paramParticleEffectSaveParameter.file); } public String getSaveResults(ResourceData paramResourceData) { this(); It it; StringWriter stringWriter; Class<?> clazz; if (paramResourceData == null) { clazz = null; } else { clazz = paramResourceData.getClass(); }  this(); Class clazz1 = null;
/* 3 */     oS(new StringWriter()); try { d80(paramResourceData, clazz, clazz1);
/* 4 */       return stringWriter.toString(); }
/* 5 */     finally { Ui.JC0((Closeable)this.q1); this.q1 = null; }
/*   */      }
/*   */ 
/*   */   
/*   */   public ResourceData getResourceData(ParticleEffectExt paramParticleEffectExt, ParticleEffectSaveParameter paramParticleEffectSaveParameter) {
/*   */     this(paramParticleEffectExt);
/*   */     ResourceData resourceData;
/*   */     paramParticleEffectExt.save(paramParticleEffectSaveParameter.manager, this);
/*   */     int i = (paramParticleEffectExt.getControllers()).Z8;
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
/*   */         Hc0 hc01 = paramParticleEffectExt.getControllers().r30();
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
/*   */     return this;
/*   */   }
/*   */   
/*   */   public ParticleEffectExt loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, ParticleEffectLoadParameterExt paramParticleEffectLoadParameterExt) {
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
/*   */     //   91: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*   */     //   94: aload_1
/*   */     //   95: aload_3
/*   */     //   96: invokevirtual load : (Lf/sz0;Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData;)V
/*   */     //   99: ifnull -> 396
/*   */     //   102: aload_3
/*   */     //   103: new com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatchExt
/*   */     //   106: dup
/*   */     //   107: astore_0
/*   */     //   108: aload #4
/*   */     //   110: aload_0
/*   */     //   111: aload #4
/*   */     //   113: getfield shaderProvider : Lf/Xa0;
/*   */     //   116: invokespecial <init> : (Lf/Xa0;)V
/*   */     //   119: getfield camera : Lf/ny;
/*   */     //   122: invokevirtual setCamera : (Lf/ny;)V
/*   */     //   125: new f/fQ
/*   */     //   128: dup
/*   */     //   129: astore_2
/*   */     //   130: aload_0
/*   */     //   131: aload_2
/*   */     //   132: invokespecial <init> : ()V
/*   */     //   135: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   138: ldc 'billboardBatchExt'
/*   */     //   140: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   143: ifnull -> 189
/*   */     //   146: aload_2
/*   */     //   147: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   150: astore_0
/*   */     //   151: aload_0
/*   */     //   152: invokevirtual hasNext : ()Z
/*   */     //   155: ifeq -> 175
/*   */     //   158: aload_0
/*   */     //   159: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   162: checkcast com/badlogic/gdx/graphics/g3d/particles/batches/ParticleBatch
/*   */     //   165: aload_1
/*   */     //   166: aload_3
/*   */     //   167: invokeinterface load : (Lf/sz0;Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData;)V
/*   */     //   172: goto -> 151
/*   */     //   175: aload_3
/*   */     //   176: getfield resource : Ljava/lang/Object;
/*   */     //   179: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*   */     //   182: aload_2
/*   */     //   183: invokevirtual setBatch : (Lf/fQ;)V
/*   */     //   186: goto -> 385
/*   */     //   189: aload_3
/*   */     //   190: iconst_0
/*   */     //   191: istore_1
/*   */     //   192: new java/lang/StringBuilder
/*   */     //   195: dup
/*   */     //   196: invokespecial <init> : ()V
/*   */     //   199: ldc 'billboardBatchExt'
/*   */     //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   204: iload_1
/*   */     //   205: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   208: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   211: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   214: astore #5
/*   */     //   216: aload #5
/*   */     //   218: ifnull -> 290
/*   */     //   221: iload_1
/*   */     //   222: ifle -> 252
/*   */     //   225: aload_2
/*   */     //   226: new com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatchExt
/*   */     //   229: dup
/*   */     //   230: dup
/*   */     //   231: astore_0
/*   */     //   232: aload #4
/*   */     //   234: aload_0
/*   */     //   235: aload #4
/*   */     //   237: getfield shaderProvider : Lf/Xa0;
/*   */     //   240: invokespecial <init> : (Lf/Xa0;)V
/*   */     //   243: getfield camera : Lf/ny;
/*   */     //   246: invokevirtual setCamera : (Lf/ny;)V
/*   */     //   249: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   252: aload_3
/*   */     //   253: aload_0
/*   */     //   254: aload #5
/*   */     //   256: invokevirtual load : (Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;)V
/*   */     //   259: new java/lang/StringBuilder
/*   */     //   262: dup
/*   */     //   263: invokespecial <init> : ()V
/*   */     //   266: ldc 'billboardBatchExt'
/*   */     //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   271: iload_1
/*   */     //   272: iconst_1
/*   */     //   273: iadd
/*   */     //   274: dup
/*   */     //   275: istore_1
/*   */     //   276: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   279: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   282: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   285: astore #5
/*   */     //   287: goto -> 216
/*   */     //   290: aload_3
/*   */     //   291: getfield resource : Ljava/lang/Object;
/*   */     //   294: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*   */     //   297: invokevirtual getControllers : ()Lf/fQ;
/*   */     //   300: getfield Z8 : I
/*   */     //   303: aload_2
/*   */     //   304: getfield Z8 : I
/*   */     //   307: if_icmple -> 333
/*   */     //   310: getstatic com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExtLoaderExt.log : Lf/ik;
/*   */     //   313: new f/JU
/*   */     //   316: dup
/*   */     //   317: astore_0
/*   */     //   318: ldc_w ''
/*   */     //   321: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   324: ldc_w 'Controller size may not exceed batch size'
/*   */     //   327: aload_0
/*   */     //   328: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   333: aload_3
/*   */     //   334: iconst_0
/*   */     //   335: istore_0
/*   */     //   336: getfield resource : Ljava/lang/Object;
/*   */     //   339: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*   */     //   342: invokevirtual getControllers : ()Lf/fQ;
/*   */     //   345: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   348: astore_1
/*   */     //   349: aload_1
/*   */     //   350: invokevirtual hasNext : ()Z
/*   */     //   353: ifeq -> 385
/*   */     //   356: aload_1
/*   */     //   357: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   360: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleController
/*   */     //   363: getfield renderer : Lcom/badlogic/gdx/graphics/g3d/particles/renderers/ParticleControllerRenderer;
/*   */     //   366: aload_2
/*   */     //   367: iload_0
/*   */     //   368: dup
/*   */     //   369: iconst_1
/*   */     //   370: iadd
/*   */     //   371: istore_0
/*   */     //   372: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   375: checkcast com/badlogic/gdx/graphics/g3d/particles/batches/ParticleBatch
/*   */     //   378: invokevirtual setBatch : (Lcom/badlogic/gdx/graphics/g3d/particles/batches/ParticleBatch;)Z
/*   */     //   381: pop
/*   */     //   382: goto -> 349
/*   */     //   385: aload_3
/*   */     //   386: getfield resource : Ljava/lang/Object;
/*   */     //   389: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*   */     //   392: aload_2
/*   */     //   393: invokevirtual setBatches : (Lf/fQ;)V
/*   */     //   396: aload_3
/*   */     //   397: getfield resource : Ljava/lang/Object;
/*   */     //   400: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*   */     //   403: areturn
/*   */     //   404: aload #5
/*   */     //   406: monitorexit
/*   */     //   407: athrow
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   13	19	404	finally
/*   */     //   22	25	404	finally
/*   */     //   28	38	404	finally
/*   */     //   41	51	404	finally
/*   */     //   54	63	404	finally
/*   */     //   64	72	404	finally
/*   */     //   82	88	404	finally
/*   */     //   404	407	404	finally
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
/*   */     public ny camera;
/*   */     public Xa0 shaderProvider;
/*   */     
/*   */     public ParticleEffectLoadParameterExt(ny param1ny, Xa0 param1Xa0) {
/*   */       this.camera = param1ny;
/*   */       this.shaderProvider = param1Xa0;
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExtLoaderExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */