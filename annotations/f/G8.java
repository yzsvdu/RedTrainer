/* 1 */ package f;public final class G8 extends Thread implements iq0 { public G8() { this.m0 = new ArrayList(); this.Hs = new Object(); this.wj = false; this.F50 = new ByteBuffer[11]; setName("soundmuxer"); setDaemon(true); setPriority(6); BufferUtils.clear(BufferUtils.xz(Math.max(100, eE.kk0 * 2 * 2)), (this.el = BufferUtils.xz(Math.max(100, eE.kk0 * 2 * 2))).limit()); this.BC = this.el.asShortBuffer(); int i; this.BE = new short[(i = eE.kk0) * 2]; if (KE0 == null) { KE0 = new byte[32]; ByteBuffer byteBuffer = this.el; eA0 = (byte)Sseqj.generateSamples(0L, byteBuffer, i); this.el.get(KE0); this.el.position(0); }  HI[] arrayOfHI; int j; byte b; for (j = (arrayOfHI = km.mI0.i8()).length, b = 0; b < j; ) { ByteBuffer byteBuffer = hI.gL0().R80(); this.F50[hI.bO()] = byteBuffer; HI hI; if (Sseqj.loadSDAT((hI = arrayOfHI[b]).bO(), byteBuffer, byteBuffer.limit()) != 0) { b++; continue; }  throw new RuntimeException("Unable to allocate nds sdat"); }  s40[] arrayOfS40; for (j = (arrayOfS40 = km.mI0.YL()).length, b = 0; b < j; ) { ByteBuffer byteBuffer = s40.pr(); this.F50[s40.in()] = byteBuffer; s40 s40; if (Agbplayj.loadRom((s40 = arrayOfS40[b]).in(), byteBuffer, byteBuffer.limit()) != 0) { b++; continue; }  throw new RuntimeException("Unable to allocate gba sdat"); }  OL oL; if ((oL = UB0.L90) != null) try { this.Uf0 = oL.rF(eE.iU); } catch (Exception exception) { this.Uf0 = null; xt0.error("Error creating new audio device", exception); }   if (this.Uf0 == null) { Mk0 = false; xt0.error("Unable to create newAudioDevice."); }  xt0
/* 2 */       .info(B40.df("Native Audio frame count per buffer size: ").append(eE.kk0).toString()); }
/*   */ 
/*   */   
/*   */   public static final ik xt0 = C00.gd(G8.class);
/*   */   public static G8 Ny;
/*   */   public static boolean Mk0 = true;
/*   */   public static volatile boolean q9 = false;
/*   */   public static byte eA0;
/*   */   public static byte[] KE0;
/*   */   public ByteBuffer el;
/*   */   public ShortBuffer BC;
/*   */   public cw0 Uf0;
/*   */   public ArrayList m0;
/*   */   public short[] BE;
/*   */   public Object Hs;
/*   */   public boolean wj;
/*   */   public ByteBuffer[] F50;
/*   */   
/*   */   public static void init() {
/*   */     if (Ny == null)
/*   */       try {
/*   */         (new q00()).fG("sseqj");
/*   */         int i;
/*   */         if ((i = Sseqj.getApiLevel()) == 182 || i <= 0) {
/*   */           (new q00()).fG("agbplayj");
/*   */           if ((i = Agbplayj.getApiLevel()) == 182 || i <= 0) {
/*   */             (Ny = new G8()).start();
/*   */             return;
/*   */           } 
/*   */           throw new RuntimeException("Mismatched Agbplayj api level. Please repair your client.");
/*   */         } 
/*   */         throw new RuntimeException("Mismatched Sseqj api level. Please repair your client.");
/*   */       } catch (Cm0 cm0) {
/*   */         xt0.error("Sound Initialize error", cm0);
/*   */         Ny = null;
/*   */         Mk0 = false;
/*   */         throw cm0;
/*   */       } catch (Exception exception) {
/*   */         xt0.error("Sound Initialize error", exception);
/*   */         Ny = null;
/*   */         Mk0 = false;
/*   */       } catch (Error error) {
/*   */         xt0.error("Sound Initialize error", error);
/*   */         Ny = null;
/*   */         Mk0 = false;
/*   */       }  
/*   */   }
/*   */   
/*   */   public final void run() {
/*   */     try {
/*   */       while (Mk0 && !q9 && this.Uf0 != null)
/*   */         jc0(); 
/*   */       return;
/*   */     } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
/*   */       if (q9)
/*   */         return; 
/*   */       throw this;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void jc0() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: getfield Hs : Ljava/lang/Object;
/*   */     //   5: dup
/*   */     //   6: astore_1
/*   */     //   7: monitorenter
/*   */     //   8: getfield m0 : Ljava/util/ArrayList;
/*   */     //   11: invokevirtual isEmpty : ()Z
/*   */     //   14: aload_1
/*   */     //   15: monitorexit
/*   */     //   16: ifne -> 416
/*   */     //   19: aload_0
/*   */     //   20: getfield wj : Z
/*   */     //   23: ifeq -> 40
/*   */     //   26: aload_0
/*   */     //   27: dup
/*   */     //   28: getfield Uf0 : Lf/cw0;
/*   */     //   31: invokeinterface resume : ()V
/*   */     //   36: iconst_0
/*   */     //   37: putfield wj : Z
/*   */     //   40: aload_0
/*   */     //   41: dup
/*   */     //   42: dup
/*   */     //   43: getfield Hs : Ljava/lang/Object;
/*   */     //   46: dup
/*   */     //   47: astore_1
/*   */     //   48: monitorenter
/*   */     //   49: getfield el : Ljava/nio/ByteBuffer;
/*   */     //   52: getstatic f/eE.kk0 : I
/*   */     //   55: iconst_2
/*   */     //   56: imul
/*   */     //   57: iconst_2
/*   */     //   58: imul
/*   */     //   59: invokestatic clear : (Ljava/nio/ByteBuffer;I)V
/*   */     //   62: new java/util/ArrayList
/*   */     //   65: dup
/*   */     //   66: astore_2
/*   */     //   67: invokespecial <init> : ()V
/*   */     //   70: getfield m0 : Ljava/util/ArrayList;
/*   */     //   73: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   76: astore_3
/*   */     //   77: aload_3
/*   */     //   78: invokeinterface hasNext : ()Z
/*   */     //   83: ifeq -> 303
/*   */     //   86: aload_3
/*   */     //   87: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   92: checkcast f/eE
/*   */     //   95: dup
/*   */     //   96: astore #4
/*   */     //   98: getfield D2 : Z
/*   */     //   101: ifeq -> 107
/*   */     //   104: goto -> 77
/*   */     //   107: aload #4
/*   */     //   109: getfield BA : Z
/*   */     //   112: ifne -> 118
/*   */     //   115: goto -> 186
/*   */     //   118: aload #4
/*   */     //   120: getfield Ft : F
/*   */     //   123: aload #4
/*   */     //   125: getfield LpT4 : J
/*   */     //   128: aload #4
/*   */     //   130: getfield BK0 : J
/*   */     //   133: lsub
/*   */     //   134: l2f
/*   */     //   135: invokestatic currentTimeMillis : ()J
/*   */     //   138: aload #4
/*   */     //   140: getfield BK0 : J
/*   */     //   143: lsub
/*   */     //   144: l2f
/*   */     //   145: swap
/*   */     //   146: fdiv
/*   */     //   147: fconst_1
/*   */     //   148: swap
/*   */     //   149: fsub
/*   */     //   150: dup
/*   */     //   151: fstore #5
/*   */     //   153: fmul
/*   */     //   154: dup
/*   */     //   155: fstore #6
/*   */     //   157: fconst_0
/*   */     //   158: fcmpg
/*   */     //   159: ifge -> 165
/*   */     //   162: fconst_0
/*   */     //   163: fstore #6
/*   */     //   165: fload #5
/*   */     //   167: aload #4
/*   */     //   169: fload #6
/*   */     //   171: invokevirtual vf0 : (F)V
/*   */     //   174: f2d
/*   */     //   175: ldc2_w -0.1
/*   */     //   178: dcmpg
/*   */     //   179: ifge -> 186
/*   */     //   182: iconst_1
/*   */     //   183: goto -> 187
/*   */     //   186: iconst_0
/*   */     //   187: ifeq -> 225
/*   */     //   190: aload #4
/*   */     //   192: aload_2
/*   */     //   193: aload #4
/*   */     //   195: iconst_0
/*   */     //   196: invokevirtual Wi0 : (Z)V
/*   */     //   199: aload #4
/*   */     //   201: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   204: pop
/*   */     //   205: getfield Ve0 : Ljava/lang/Runnable;
/*   */     //   208: dup
/*   */     //   209: astore #4
/*   */     //   211: ifnull -> 77
/*   */     //   214: getstatic f/UB0.Kg0 : Lf/Q50;
/*   */     //   217: aload #4
/*   */     //   219: invokevirtual fN : (Ljava/lang/Runnable;)V
/*   */     //   222: goto -> 77
/*   */     //   225: aload #4
/*   */     //   227: getfield ex0 : Z
/*   */     //   230: ifeq -> 243
/*   */     //   233: aload_2
/*   */     //   234: aload #4
/*   */     //   236: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   239: pop
/*   */     //   240: goto -> 77
/*   */     //   243: aload #4
/*   */     //   245: aload_0
/*   */     //   246: getfield el : Ljava/nio/ByteBuffer;
/*   */     //   249: getstatic f/eE.kk0 : I
/*   */     //   252: invokevirtual zk0 : (Ljava/nio/ByteBuffer;I)I
/*   */     //   255: ifne -> 276
/*   */     //   258: aload_1
/*   */     //   259: getstatic f/G8.xt0 : Lf/ik;
/*   */     //   262: ldc_w 'generateSamples failed, disabling NativeSoundPlayer'
/*   */     //   265: invokeinterface info : (Ljava/lang/String;)V
/*   */     //   270: iconst_0
/*   */     //   271: putstatic f/G8.Mk0 : Z
/*   */     //   274: monitorexit
/*   */     //   275: return
/*   */     //   276: aload #4
/*   */     //   278: invokevirtual Kt : ()Z
/*   */     //   281: ifeq -> 77
/*   */     //   284: aload_2
/*   */     //   285: aload #4
/*   */     //   287: iconst_0
/*   */     //   288: invokevirtual Wi0 : (Z)V
/*   */     //   291: aload #4
/*   */     //   293: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   296: goto -> 239
/*   */     //   299: astore_0
/*   */     //   300: goto -> 412
/*   */     //   303: aload_2
/*   */     //   304: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   307: astore_2
/*   */     //   308: aload_2
/*   */     //   309: invokeinterface hasNext : ()Z
/*   */     //   314: ifeq -> 362
/*   */     //   317: aload_2
/*   */     //   318: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   323: checkcast f/eE
/*   */     //   326: dup
/*   */     //   327: astore_3
/*   */     //   328: aload_0
/*   */     //   329: getfield Hs : Ljava/lang/Object;
/*   */     //   332: dup
/*   */     //   333: astore #4
/*   */     //   335: aload_0
/*   */     //   336: aload #4
/*   */     //   338: monitorenter
/*   */     //   339: getfield m0 : Ljava/util/ArrayList;
/*   */     //   342: aload_3
/*   */     //   343: invokevirtual remove : (Ljava/lang/Object;)Z
/*   */     //   346: pop
/*   */     //   347: monitorexit
/*   */     //   348: invokeinterface dispose : ()V
/*   */     //   353: goto -> 308
/*   */     //   356: astore_0
/*   */     //   357: aload_0
/*   */     //   358: aload #4
/*   */     //   360: monitorexit
/*   */     //   361: athrow
/*   */     //   362: aload_1
/*   */     //   363: monitorexit
/*   */     //   364: getstatic f/G8.q9 : Z
/*   */     //   367: ifeq -> 371
/*   */     //   370: return
/*   */     //   371: aload_0
/*   */     //   372: dup
/*   */     //   373: dup
/*   */     //   374: getfield BC : Ljava/nio/ShortBuffer;
/*   */     //   377: iconst_0
/*   */     //   378: invokevirtual position : (I)Ljava/nio/Buffer;
/*   */     //   381: pop
/*   */     //   382: getfield BC : Ljava/nio/ShortBuffer;
/*   */     //   385: aload_0
/*   */     //   386: getfield BE : [S
/*   */     //   389: invokevirtual get : ([S)Ljava/nio/ShortBuffer;
/*   */     //   392: pop
/*   */     //   393: getfield Uf0 : Lf/cw0;
/*   */     //   396: aload_0
/*   */     //   397: getfield BE : [S
/*   */     //   400: getstatic f/eE.kk0 : I
/*   */     //   403: iconst_2
/*   */     //   404: imul
/*   */     //   405: swap
/*   */     //   406: invokeinterface gk0 : (I[S)V
/*   */     //   411: return
/*   */     //   412: aload_0
/*   */     //   413: aload_1
/*   */     //   414: monitorexit
/*   */     //   415: athrow
/*   */     //   416: aload_0
/*   */     //   417: getfield wj : Z
/*   */     //   420: ifne -> 437
/*   */     //   423: aload_0
/*   */     //   424: dup
/*   */     //   425: getfield Uf0 : Lf/cw0;
/*   */     //   428: invokeinterface oC0 : ()V
/*   */     //   433: iconst_1
/*   */     //   434: putfield wj : Z
/*   */     //   437: getstatic f/G8.q9 : Z
/*   */     //   440: ifeq -> 444
/*   */     //   443: return
/*   */     //   444: ldc2_w 30
/*   */     //   447: invokestatic sleep : (J)V
/*   */     //   450: goto -> 454
/*   */     //   453: pop
/*   */     //   454: return
/*   */     //   455: astore_0
/*   */     //   456: aload_0
/*   */     //   457: aload_1
/*   */     //   458: monitorexit
/*   */     //   459: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 98
/*   */     //   #2	-> 109
/*   */     //   #3	-> 196
/*   */     //   #4	-> 205
/*   */     //   #5	-> 214
/*   */     //   #6	-> 227
/*   */     //   #7	-> 236
/*   */     //   #8	-> 329
/*   */     //   #9	-> 348
/*   */     //   #10	-> 360
/*   */     //   #11	-> 363
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   8	16	455	finally
/*   */     //   49	55	299	finally
/*   */     //   59	65	299	finally
/*   */     //   67	76	299	finally
/*   */     //   77	83	299	finally
/*   */     //   86	95	299	finally
/*   */     //   98	101	299	finally
/*   */     //   107	112	299	finally
/*   */     //   118	133	299	finally
/*   */     //   135	143	299	finally
/*   */     //   165	174	299	finally
/*   */     //   190	204	299	finally
/*   */     //   205	208	299	finally
/*   */     //   214	230	299	finally
/*   */     //   233	239	299	finally
/*   */     //   243	255	299	finally
/*   */     //   258	275	299	finally
/*   */     //   276	281	299	finally
/*   */     //   284	299	299	finally
/*   */     //   303	307	299	finally
/*   */     //   308	314	299	finally
/*   */     //   317	326	299	finally
/*   */     //   328	332	299	finally
/*   */     //   335	339	299	finally
/*   */     //   339	346	356	finally
/*   */     //   347	348	356	finally
/*   */     //   348	356	299	finally
/*   */     //   357	361	356	finally
/*   */     //   361	364	299	finally
/*   */     //   412	415	299	finally
/*   */     //   437	440	453	java/lang/InterruptedException
/*   */     //   444	453	453	java/lang/InterruptedException
/*   */     //   456	459	455	finally
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     BufferUtils.lf(this.el);
/*   */     cw0 cw01;
/*   */     if ((cw01 = this.Uf0) != null) {
/*   */       cw01.dispose();
/*   */       this.Uf0 = null;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */