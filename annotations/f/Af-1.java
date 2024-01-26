/* 1 */ package f;public final class Af extends kR { public final pB0 nk(String paramString) { this(); A10 a10; sL sL; f7 f7; RD0 rD0 = resolve(paramString); this.n2 = this.cr0.g(rD0); this(); for (Hc0 hc0 = kY(rD0).r30(); hc0.hasNext(); ) { this(rD01, false); cu0 cu0 = sL.Sp; Texture texture; (texture = new Texture()).setFilter(cu0, sL.j1); RD0 rD01; f7.X00((rD01 = (RD0)hc0.next()).rw(), texture); }  this(f7); (PRn(rD0, sL, this))
/* 2 */       .Kn = f7.mw0().nA0();
/*   */     return PRn(rD0, sL, this); }
/*   */ 
/*   */   
/*   */   public Af() {
/*   */     this();
/*   */     ax ax;
/*   */     super(this);
/*   */   }
/*   */   
/*   */   public Af(Xt0 paramXt0) {
/*   */     super(paramXt0);
/*   */   }
/*   */   
/*   */   public final fQ Hf0(RD0 paramRD0, kd0 paramkd0) {
/*   */     this();
/*   */     fQ fQ;
/*   */     Hc0 hc0 = kY(paramRD0).r30();
/*   */     while (hc0.hasNext()) {
/*   */       RD0 rD0 = (RD0)hc0.next();
/*   */       Com3(new bs(rD0, Texture.class, paramkd0));
/*   */     } 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final fQ kY(RD0 paramRD0) {
/*   */     this();
/*   */     fQ fQ;
/*   */     Hc0 hc02 = this.n2.LG0("tileset").r30();
/*   */     while (hc02.hasNext()) {
/*   */       RD0 rD0;
/*   */       Jp0 jp0;
/*   */       String str;
/*   */       if ((str = (jp0 = (Jp0)hc02.next()).Wu("source", null)) != null) {
/*   */         rD0 = kR.Te0(paramRD0, str);
/*   */         Jp0 jp01;
/*   */         if ((jp01 = this.cr0.g(rD0)).cE("image") != null) {
/*   */           fQ.Com3(kR.Te0(rD0, jp01.cE("image").UI0("source")));
/*   */           continue;
/*   */         } 
/*   */         Hc0 hc03 = jp01.LG0("tile").r30();
/*   */         while (hc03.hasNext())
/*   */           fQ.Com3(kR.Te0(rD0, ((Jp0)hc03.next()).cE("image").UI0("source"))); 
/*   */         continue;
/*   */       } 
/*   */       if (rD0.cE("image") != null) {
/*   */         fQ.Com3(kR.Te0(paramRD0, rD0.cE("image").UI0("source")));
/*   */         continue;
/*   */       } 
/*   */       Hc0 hc0 = rD0.LG0("tile").r30();
/*   */       while (hc0.hasNext())
/*   */         fQ.Com3(kR.Te0(paramRD0, ((Jp0)hc0.next()).cE("image").UI0("source"))); 
/*   */     } 
/*   */     Hc0 hc01 = this.n2.LG0("imagelayer").r30();
/*   */     while (hasNext()) {
/*   */       String str;
/*   */       if ((str = ((Jp0)next()).cE("image").Wu("source", null)) != null)
/*   */         fQ.Com3(kR.Te0(paramRD0, str)); 
/*   */     } 
/*   */     return fQ;
/*   */   }
/*   */   
/*   */   public final void Ne0(RD0 paramRD01, np paramnp, tv paramtv, fQ paramfQ, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString1, int paramInt6, int paramInt7, String paramString2, int paramInt8, int paramInt9, RD0 paramRD02) {
/*   */     // Byte code:
/*   */     //   0: aload #16
/*   */     //   2: aload_3
/*   */     //   3: getfield wo0 : Lf/y9;
/*   */     //   6: astore #17
/*   */     //   8: ifnull -> 305
/*   */     //   11: iload #8
/*   */     //   13: aload #17
/*   */     //   15: iload #9
/*   */     //   17: aload #17
/*   */     //   19: iload #7
/*   */     //   21: aload #17
/*   */     //   23: iload #6
/*   */     //   25: aload #17
/*   */     //   27: iload #15
/*   */     //   29: aload #17
/*   */     //   31: iload #14
/*   */     //   33: aload #17
/*   */     //   35: aload_2
/*   */     //   36: aload #16
/*   */     //   38: invokevirtual rw : ()Ljava/lang/String;
/*   */     //   41: invokeinterface l70 : (Ljava/lang/String;)Lf/pe0;
/*   */     //   46: astore_1
/*   */     //   47: getfield un : Lf/f7;
/*   */     //   50: ldc 'imagesource'
/*   */     //   52: aload #13
/*   */     //   54: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   57: pop
/*   */     //   58: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   61: astore_2
/*   */     //   62: getfield un : Lf/f7;
/*   */     //   65: ldc 'imagewidth'
/*   */     //   67: aload_2
/*   */     //   68: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   71: pop
/*   */     //   72: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   75: astore_2
/*   */     //   76: getfield un : Lf/f7;
/*   */     //   79: ldc 'imageheight'
/*   */     //   81: aload_2
/*   */     //   82: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   85: pop
/*   */     //   86: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   89: astore_2
/*   */     //   90: getfield un : Lf/f7;
/*   */     //   93: ldc 'tilewidth'
/*   */     //   95: aload_2
/*   */     //   96: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   99: pop
/*   */     //   100: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   103: astore_2
/*   */     //   104: getfield un : Lf/f7;
/*   */     //   107: ldc 'tileheight'
/*   */     //   109: aload_2
/*   */     //   110: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   113: pop
/*   */     //   114: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   117: astore_2
/*   */     //   118: getfield un : Lf/f7;
/*   */     //   121: ldc 'margin'
/*   */     //   123: aload_2
/*   */     //   124: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   127: pop
/*   */     //   128: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   131: astore_2
/*   */     //   132: aload_1
/*   */     //   133: dup
/*   */     //   134: aload #17
/*   */     //   136: getfield un : Lf/f7;
/*   */     //   139: ldc 'spacing'
/*   */     //   141: aload_2
/*   */     //   142: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   145: pop
/*   */     //   146: getfield H0 : I
/*   */     //   149: iload #6
/*   */     //   151: isub
/*   */     //   152: istore_2
/*   */     //   153: getfield Vn0 : I
/*   */     //   156: iload #7
/*   */     //   158: isub
/*   */     //   159: istore #4
/*   */     //   161: iload #9
/*   */     //   163: istore #10
/*   */     //   165: iload #10
/*   */     //   167: iload #4
/*   */     //   169: if_icmpgt -> 484
/*   */     //   172: iload #9
/*   */     //   174: istore #13
/*   */     //   176: iload #13
/*   */     //   178: iload_2
/*   */     //   179: if_icmpgt -> 292
/*   */     //   182: aload_0
/*   */     //   183: iload #12
/*   */     //   185: iload #11
/*   */     //   187: new f/pe0
/*   */     //   190: dup
/*   */     //   191: astore #14
/*   */     //   193: aload_1
/*   */     //   194: iload #13
/*   */     //   196: iload #10
/*   */     //   198: iload #6
/*   */     //   200: iload #7
/*   */     //   202: invokespecial <init> : (Lf/pe0;IIII)V
/*   */     //   205: iload #5
/*   */     //   207: iconst_1
/*   */     //   208: iadd
/*   */     //   209: istore #15
/*   */     //   211: i2f
/*   */     //   212: fstore #16
/*   */     //   214: i2f
/*   */     //   215: fstore #17
/*   */     //   217: new f/pc
/*   */     //   220: dup
/*   */     //   221: astore #18
/*   */     //   223: fload #16
/*   */     //   225: aload #18
/*   */     //   227: iload #5
/*   */     //   229: aload #18
/*   */     //   231: aload #14
/*   */     //   233: invokespecial <init> : (Lf/pe0;)V
/*   */     //   236: putfield Qh0 : I
/*   */     //   239: putfield Z4 : F
/*   */     //   242: getfield c5 : Z
/*   */     //   245: ifeq -> 253
/*   */     //   248: fload #17
/*   */     //   250: fneg
/*   */     //   251: fstore #17
/*   */     //   253: iload #6
/*   */     //   255: iload #8
/*   */     //   257: aload_3
/*   */     //   258: aload #18
/*   */     //   260: fload #17
/*   */     //   262: putfield ex0 : F
/*   */     //   265: getfield m0 : Lf/y10;
/*   */     //   268: iload #5
/*   */     //   270: aload #18
/*   */     //   272: invokevirtual tD0 : (ILjava/lang/Object;)V
/*   */     //   275: iadd
/*   */     //   276: iload #13
/*   */     //   278: iadd
/*   */     //   279: istore #5
/*   */     //   281: iload #5
/*   */     //   283: iload #15
/*   */     //   285: istore #5
/*   */     //   287: istore #13
/*   */     //   289: goto -> 176
/*   */     //   292: iload #7
/*   */     //   294: iload #8
/*   */     //   296: iadd
/*   */     //   297: iload #10
/*   */     //   299: iadd
/*   */     //   300: istore #10
/*   */     //   302: goto -> 165
/*   */     //   305: aload #4
/*   */     //   307: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   310: astore #4
/*   */     //   312: aload #4
/*   */     //   314: invokevirtual hasNext : ()Z
/*   */     //   317: ifeq -> 484
/*   */     //   320: aload #4
/*   */     //   322: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   325: checkcast f/Jp0
/*   */     //   328: dup
/*   */     //   329: astore #6
/*   */     //   331: ldc 'image'
/*   */     //   333: invokevirtual cE : (Ljava/lang/String;)Lf/Jp0;
/*   */     //   336: dup
/*   */     //   337: astore #7
/*   */     //   339: ifnull -> 388
/*   */     //   342: aload #10
/*   */     //   344: aload #7
/*   */     //   346: ldc 'source'
/*   */     //   348: invokevirtual UI0 : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   351: astore #7
/*   */     //   353: ifnull -> 376
/*   */     //   356: aload_1
/*   */     //   357: aload #10
/*   */     //   359: invokestatic Te0 : (Lf/RD0;Ljava/lang/String;)Lf/RD0;
/*   */     //   362: aload #7
/*   */     //   364: invokestatic Te0 : (Lf/RD0;Ljava/lang/String;)Lf/RD0;
/*   */     //   367: astore #7
/*   */     //   369: aload #7
/*   */     //   371: astore #16
/*   */     //   373: goto -> 388
/*   */     //   376: aload_1
/*   */     //   377: aload #7
/*   */     //   379: invokestatic Te0 : (Lf/RD0;Ljava/lang/String;)Lf/RD0;
/*   */     //   382: astore #7
/*   */     //   384: aload #7
/*   */     //   386: astore #16
/*   */     //   388: aload_0
/*   */     //   389: iload #12
/*   */     //   391: iload #11
/*   */     //   393: aload #6
/*   */     //   395: aload_2
/*   */     //   396: aload #16
/*   */     //   398: invokevirtual rw : ()Ljava/lang/String;
/*   */     //   401: invokeinterface l70 : (Ljava/lang/String;)Lf/pe0;
/*   */     //   406: astore #6
/*   */     //   408: ldc 'id'
/*   */     //   410: invokevirtual UI0 : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   413: invokestatic parseInt : (Ljava/lang/String;)I
/*   */     //   416: iload #5
/*   */     //   418: iadd
/*   */     //   419: istore #7
/*   */     //   421: i2f
/*   */     //   422: fstore #8
/*   */     //   424: i2f
/*   */     //   425: fstore #9
/*   */     //   427: new f/pc
/*   */     //   430: dup
/*   */     //   431: astore #13
/*   */     //   433: fload #8
/*   */     //   435: aload #13
/*   */     //   437: iload #7
/*   */     //   439: aload #13
/*   */     //   441: aload #6
/*   */     //   443: invokespecial <init> : (Lf/pe0;)V
/*   */     //   446: putfield Qh0 : I
/*   */     //   449: putfield Z4 : F
/*   */     //   452: getfield c5 : Z
/*   */     //   455: ifeq -> 463
/*   */     //   458: fload #9
/*   */     //   460: fneg
/*   */     //   461: fstore #9
/*   */     //   463: aload_3
/*   */     //   464: aload #13
/*   */     //   466: fload #9
/*   */     //   468: putfield ex0 : F
/*   */     //   471: getfield m0 : Lf/y10;
/*   */     //   474: iload #7
/*   */     //   476: aload #13
/*   */     //   478: invokevirtual tD0 : (ILjava/lang/Object;)V
/*   */     //   481: goto -> 312
/*   */     //   484: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 3
/*   */     //   #2	-> 38
/*   */     //   #3	-> 47
/*   */     //   #4	-> 50
/*   */     //   #5	-> 58
/*   */     //   #6	-> 62
/*   */     //   #7	-> 72
/*   */     //   #8	-> 76
/*   */     //   #9	-> 86
/*   */     //   #10	-> 90
/*   */     //   #11	-> 100
/*   */     //   #12	-> 104
/*   */     //   #13	-> 114
/*   */     //   #14	-> 118
/*   */     //   #15	-> 128
/*   */     //   #16	-> 136
/*   */     //   #17	-> 146
/*   */     //   #18	-> 153
/*   */     //   #19	-> 187
/*   */     //   #20	-> 217
/*   */     //   #21	-> 236
/*   */     //   #22	-> 239
/*   */     //   #23	-> 242
/*   */     //   #24	-> 262
/*   */     //   #25	-> 265
/*   */     //   #26	-> 272
/*   */     //   #27	-> 307
/*   */     //   #28	-> 408
/*   */     //   #29	-> 427
/*   */     //   #30	-> 446
/*   */     //   #31	-> 449
/*   */     //   #32	-> 452
/*   */     //   #33	-> 468
/*   */     //   #34	-> 471
/*   */     //   #35	-> 478
/*   */   }
/*   */   
/*   */   public final Object loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) {
/*   */     (sL)paramwP;
/*   */     return this.L2;
/*   */   }
/*   */   
/*   */   public final void loadAsync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) {
/*   */     sL sL = (sL)paramwP;
/*   */     this(paramsz0);
/*   */     Yq yq;
/*   */     this.L2 = PRn(paramRD0, this, yq);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Af.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */