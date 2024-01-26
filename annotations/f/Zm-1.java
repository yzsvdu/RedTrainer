/* 1 */ package f;public final class Zm extends wb { public final void sZ(ParticleController paramParticleController) { Hc0 hc0; for (paramParticleController = null, hc0 = paramParticleController.influencers.r30(); hc0.hasNext();) { if (influencer = (Influencer)hc0.next() instanceof DynamicsInfluencerExt) dynamicsInfluencerExt = (DynamicsInfluencerExt)influencer;  }  if (dynamicsInfluencerExt == null)
/*   */       return; 
/* 3 */     this((DynamicsModifierExt.VectorPathModifier)((DynamicsModifier[])((DynamicsInfluencer)dynamicsInfluencerExt).velocities.Uq0)[0], this.xS.rF0.He0); DynamicsInfluencerExt dynamicsInfluencerExt; zo.initPath(0); DynamicsModifierExt.VectorPathModifier vectorPathModifier; (vectorPathModifier = (DynamicsModifierExt.VectorPathModifier)((DynamicsModifier[])((DynamicsInfluencer)dynamicsInfluencerExt).velocities.Uq0)[0]).finalVectorPath = Arrays.<eo>copyOf(zo.finalVectorPath, zo.finalVectorPath.length); ((DynamicsModifierExt.VectorPathModifier)((DynamicsModifier[])((DynamicsInfluencer)dynamicsInfluencerExt).velocities.Uq0)[0]).pathCache.Ed0(Integer.valueOf(0), new QX((Ou0[])this.finalVectorPath, false)); zo zo; (zo = new zo()).dispose(); }
/*   */ 
/*   */   
/*   */   public final boolean Lf;
/*   */   
/*   */   public Zm(hm0 paramhm0, boolean paramBoolean) {
/*   */     super(paramhm0);
/*   */     this.Lf = paramBoolean;
/*   */   }
/*   */   
/*   */   static {
/*   */     C00.gd(Zm.class);
/*   */   }
/*   */   
/*   */   public final wb O3() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual zc0 : ()Z
/*   */     //   4: ifeq -> 26
/*   */     //   7: aload_0
/*   */     //   8: getfield Lf : Z
/*   */     //   11: ifeq -> 20
/*   */     //   14: ldc 'spawn_10th_anniv_friends_shiny_enemy'
/*   */     //   16: astore_1
/*   */     //   17: goto -> 42
/*   */     //   20: ldc 'spawn_10th_anniv_friends_enemy'
/*   */     //   22: astore_1
/*   */     //   23: goto -> 42
/*   */     //   26: aload_0
/*   */     //   27: getfield Lf : Z
/*   */     //   30: ifeq -> 39
/*   */     //   33: ldc 'spawn_10th_anniv_friends_shiny_friendly'
/*   */     //   35: astore_1
/*   */     //   36: goto -> 42
/*   */     //   39: ldc 'spawn_10th_anniv_friends_friendly'
/*   */     //   41: astore_1
/*   */     //   42: iconst_3
/*   */     //   43: dup
/*   */     //   44: istore_2
/*   */     //   45: newarray short
/*   */     //   47: dup
/*   */     //   48: dup2
/*   */     //   49: astore_3
/*   */     //   50: iconst_0
/*   */     //   51: iconst_1
/*   */     //   52: sastore
/*   */     //   53: iconst_1
/*   */     //   54: iconst_4
/*   */     //   55: sastore
/*   */     //   56: iconst_2
/*   */     //   57: bipush #7
/*   */     //   59: sastore
/*   */     //   60: getstatic f/xi0.vg0 : Lf/kE0;
/*   */     //   63: getfield DW : Ljava/util/Random;
/*   */     //   66: astore #4
/*   */     //   68: iload_2
/*   */     //   69: iconst_1
/*   */     //   70: if_icmple -> 106
/*   */     //   73: aload_3
/*   */     //   74: dup
/*   */     //   75: dup2
/*   */     //   76: aload #4
/*   */     //   78: iload_2
/*   */     //   79: invokevirtual nextInt : (I)I
/*   */     //   82: istore #5
/*   */     //   84: iload_2
/*   */     //   85: iconst_m1
/*   */     //   86: iadd
/*   */     //   87: dup
/*   */     //   88: istore_2
/*   */     //   89: saload
/*   */     //   90: istore #6
/*   */     //   92: iload #5
/*   */     //   94: saload
/*   */     //   95: iload_2
/*   */     //   96: swap
/*   */     //   97: sastore
/*   */     //   98: iload #5
/*   */     //   100: iload #6
/*   */     //   102: sastore
/*   */     //   103: goto -> 68
/*   */     //   106: aload_0
/*   */     //   107: invokevirtual zc0 : ()Z
/*   */     //   110: ifne -> 119
/*   */     //   113: ldc -1.0
/*   */     //   115: fstore_2
/*   */     //   116: goto -> 121
/*   */     //   119: fconst_1
/*   */     //   120: fstore_2
/*   */     //   121: aload_0
/*   */     //   122: dup
/*   */     //   123: fload_2
/*   */     //   124: getstatic f/h1.In0 : F
/*   */     //   127: fmul
/*   */     //   128: fstore_2
/*   */     //   129: invokestatic k60 : ()Lf/So;
/*   */     //   132: invokevirtual L5 : ()Lf/So;
/*   */     //   135: aload_0
/*   */     //   136: aload_1
/*   */     //   137: invokevirtual Ur0 : (Ljava/lang/String;)Lf/Wz0;
/*   */     //   140: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   143: fload_2
/*   */     //   144: <illegal opcode> Do : (F)Lf/hk0;
/*   */     //   149: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   152: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   155: fload_2
/*   */     //   156: <illegal opcode> Do : (F)Lf/hk0;
/*   */     //   161: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   164: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   167: fload_2
/*   */     //   168: <illegal opcode> Do : (F)Lf/hk0;
/*   */     //   173: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   176: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   179: fload_2
/*   */     //   180: <illegal opcode> Do : (F)Lf/hk0;
/*   */     //   185: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   188: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   191: fload_2
/*   */     //   192: <illegal opcode> Do : (F)Lf/hk0;
/*   */     //   197: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   200: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   203: fload_2
/*   */     //   204: <illegal opcode> Do : (F)Lf/hk0;
/*   */     //   209: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   212: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   215: aload_3
/*   */     //   216: fload_2
/*   */     //   217: <illegal opcode> Do : ([SF)Lf/hk0;
/*   */     //   222: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   225: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   228: aload_3
/*   */     //   229: fload_2
/*   */     //   230: <illegal opcode> Do : ([SF)Lf/hk0;
/*   */     //   235: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   238: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   241: aload_3
/*   */     //   242: fload_2
/*   */     //   243: <illegal opcode> Do : ([SF)Lf/hk0;
/*   */     //   248: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*   */     //   251: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*   */     //   254: dup
/*   */     //   255: astore_1
/*   */     //   256: putfield synchronized : Lf/So;
/*   */     //   259: getfield Lf : Z
/*   */     //   262: ifeq -> 315
/*   */     //   265: aload_1
/*   */     //   266: aload_0
/*   */     //   267: dup
/*   */     //   268: getfield xS : Lf/hm0;
/*   */     //   271: astore_1
/*   */     //   272: iconst_2
/*   */     //   273: sipush #1556
/*   */     //   276: iconst_1
/*   */     //   277: bipush #14
/*   */     //   279: ldc 2650.0
/*   */     //   281: ldc 0.7
/*   */     //   283: aload_1
/*   */     //   284: invokevirtual ia0 : (BSIIFFLf/hm0;)Lf/So;
/*   */     //   287: invokevirtual Zo0 : (Lf/So;)Lf/So;
/*   */     //   290: aload_0
/*   */     //   291: dup
/*   */     //   292: getfield xS : Lf/hm0;
/*   */     //   295: astore_1
/*   */     //   296: iconst_2
/*   */     //   297: sipush #1554
/*   */     //   300: iconst_1
/*   */     //   301: bipush #14
/*   */     //   303: ldc 3300.0
/*   */     //   305: ldc 0.7
/*   */     //   307: aload_1
/*   */     //   308: invokevirtual ia0 : (BSIIFFLf/hm0;)Lf/So;
/*   */     //   311: invokevirtual Zo0 : (Lf/So;)Lf/So;
/*   */     //   314: pop
/*   */     //   315: aload_0
/*   */     //   316: dup
/*   */     //   317: dup
/*   */     //   318: dup2
/*   */     //   319: getfield synchronized : Lf/So;
/*   */     //   322: invokevirtual Kr : ()Lf/So;
/*   */     //   325: pop
/*   */     //   326: getfield synchronized : Lf/So;
/*   */     //   329: aload_0
/*   */     //   330: getfield pb : Lf/vH;
/*   */     //   333: getfield dr0 : Lf/G30;
/*   */     //   336: invokevirtual mg : (Lf/G30;)Lf/sh;
/*   */     //   339: pop
/*   */     //   340: getfield pb : Lf/vH;
/*   */     //   343: aload_0
/*   */     //   344: getfield synchronized : Lf/So;
/*   */     //   347: invokevirtual t9 : (Lf/So;)V
/*   */     //   350: invokevirtual tS : ()V
/*   */     //   353: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 60
/*   */     //   #2	-> 63
/*   */     //   #3	-> 79
/*   */     //   #4	-> 107
/*   */     //   #5	-> 284
/*   */     //   #6	-> 287
/*   */     //   #7	-> 308
/*   */     //   #8	-> 311
/*   */     //   #9	-> 330
/*   */     //   #10	-> 333
/*   */     //   #11	-> 336
/*   */     //   #12	-> 350
/*   */   }
/*   */   
/*   */   public final Wz0 Ur0(String paramString) {
/*   */     ParticleEffectExt particleEffectExt;
/*   */     BillboardParticleBatchExt billboardParticleBatchExt1 = (BillboardParticleBatchExt)(particleEffectExt = vR("custom/" + paramString)).getBatches().get(0);
/*   */     BillboardParticleBatchExt billboardParticleBatchExt2 = (BillboardParticleBatchExt)vR("custom/" + paramString).getBatches().get(1);
/*   */     BillboardParticleBatchExt billboardParticleBatchExt3 = (BillboardParticleBatchExt)vR("custom/" + paramString).getBatches().get(2);
/*   */     Hc0 hc0 = vR("custom/" + paramString).getControllers().r30();
/*   */     while (hc0.hasNext()) {
/*   */       ParticleController particleController;
/*   */       String str;
/*   */       (str = (particleController = (ParticleController)hc0.next()).name).getClass();
/*   */       int i = -1;
/*   */       switch ((particleController = (ParticleController)hc0.next()).name.hashCode()) {
/*   */         case 93501972:
/*   */           if (!str.equals("ball3"))
/*   */             break; 
/*   */           i = 5;
/*   */           break;
/*   */         case 93501971:
/*   */           if (!str.equals("ball2"))
/*   */             break; 
/*   */           i = 4;
/*   */           break;
/*   */         case 93501970:
/*   */           if (!str.equals("ball1"))
/*   */             break; 
/*   */           i = 3;
/*   */           break;
/*   */         case -1320644469:
/*   */           if (!str.equals("dummy3"))
/*   */             break; 
/*   */           i = 2;
/*   */           break;
/*   */         case -1320644470:
/*   */           if (!str.equals("dummy2"))
/*   */             break; 
/*   */           i = 1;
/*   */           break;
/*   */         case -1320644471:
/*   */           if (!str.equals("dummy1"))
/*   */             break; 
/*   */           i = 0;
/*   */           break;
/*   */       } 
/*   */       switch (i) {
/*   */         default:
/*   */           continue;
/*   */         case 3:
/*   */         case 4:
/*   */         case 5:
/*   */           sZ(particleController);
/*   */           continue;
/*   */         case 2:
/*   */           bool = this.Lf;
/*   */           i = zc0() ^ true;
/*   */           this(this, billboardParticleBatchExt3, (short)7, bool, i);
/*   */           (bo0 = new Bo0()).set(particleController);
/*   */           (new Bo0()).allocateChannels();
/*   */           particleController.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, (Influencer)bo0);
/*   */           sZ(particleController);
/*   */           continue;
/*   */         case 1:
/*   */           bool = this.Lf;
/*   */           i = zc0() ^ true;
/*   */           this(this, billboardParticleBatchExt2, (short)4, bool, i);
/*   */           (bo0 = new Bo0()).set(bool);
/*   */           (new Bo0()).allocateChannels();
/*   */           bool.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, (Influencer)bo0);
/*   */           sZ(bool);
/*   */           continue;
/*   */         case 0:
/*   */           break;
/*   */       } 
/*   */       boolean bool = this.Lf;
/*   */       i = zc0() ^ true;
/*   */       this(this, billboardParticleBatchExt1, (short)1, bool, i);
/*   */       Bo0 bo0;
/*   */       (bo0 = new Bo0()).set(bool);
/*   */       (new Bo0()).allocateChannels();
/*   */       bool.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, (Influencer)bo0);
/*   */       sZ(bool);
/*   */     } 
/*   */     return Wz0.OC((paramInt, paramsh) -> OJ(paramParticleEffectExt));
/*   */   }
/*   */   
/*   */   public final boolean tF0(boolean paramBoolean) {
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */