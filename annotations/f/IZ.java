/* 1 */ package f;public abstract class IZ { public IZ(int paramInt, byte paramByte) { this.g4 = false; this.QK = false; this.wm0 = null; this.xt0 = paramByte; this.Dr0 = paramInt; hZ hZ1 = UB0.vj0.N0("cache/region-models-" + paramByte + ".bin"); if ((!h1.Pm || h1.A0) && hZ1.L0()) { Uq
/* 2 */         .info(B40.df("Deleting model cache ").append(this.Pu.bo().getAbsolutePath()).toString()); this.Pu.La0(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final ik Uq = C00.gd(IZ.class);
/*   */   public final byte xt0;
/*   */   public final int Dr0;
/*   */   public boolean g4;
/*   */   public boolean QK;
/*   */   public ByteBuffer ec0;
/*   */   public hZ Pu;
/*   */   public fw0 wm0;
/*   */   
/*   */   public abstract lpt1 VE0(int paramInt, Ew paramEw);
/*   */   
/*   */   public lpt1 yd0(VV paramVV, int paramInt1, int paramInt2, Iq paramIq) {
/*   */     return null;
/*   */   }
/*   */   
/*   */   public lpt1 TA(int paramInt, Iq paramIq) {
/*   */     return null;
/*   */   }
/*   */   
/*   */   public lpt1 oL0(VV paramVV, int paramInt, Iq paramIq) {
/*   */     return null;
/*   */   }
/*   */   
/*   */   public final boolean ad() {
/*   */     if (!zl0())
/*   */       R7(); 
/*   */     return R7();
/*   */   }
/*   */   
/*   */   public abstract boolean zl0();
/*   */   
/*   */   public final boolean R7() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield QK : Z
/*   */     //   4: ifne -> 132
/*   */     //   7: aload_0
/*   */     //   8: getfield g4 : Z
/*   */     //   11: ifeq -> 17
/*   */     //   14: goto -> 132
/*   */     //   17: aload_0
/*   */     //   18: getfield wm0 : Lf/fw0;
/*   */     //   21: dup
/*   */     //   22: astore_1
/*   */     //   23: ifnonnull -> 87
/*   */     //   26: aload_0
/*   */     //   27: getstatic f/IZ.Uq : Lf/ik;
/*   */     //   30: new java/lang/StringBuilder
/*   */     //   33: dup
/*   */     //   34: invokespecial <init> : ()V
/*   */     //   37: ldc 'Starting cache write for region '
/*   */     //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   42: aload_0
/*   */     //   43: getfield xt0 : B
/*   */     //   46: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   49: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   52: invokeinterface info : (Ljava/lang/String;)V
/*   */     //   57: new f/fw0
/*   */     //   60: dup
/*   */     //   61: aload_0
/*   */     //   62: dup
/*   */     //   63: dup
/*   */     //   64: getfield xt0 : B
/*   */     //   67: istore_1
/*   */     //   68: getfield Pu : Lf/hZ;
/*   */     //   71: astore_2
/*   */     //   72: getfield Dr0 : I
/*   */     //   75: istore_3
/*   */     //   76: iload_1
/*   */     //   77: aload_2
/*   */     //   78: iload_3
/*   */     //   79: invokespecial <init> : (BLf/hZ;I)V
/*   */     //   82: putfield wm0 : Lf/fw0;
/*   */     //   85: iconst_0
/*   */     //   86: ireturn
/*   */     //   87: aload_1
/*   */     //   88: invokevirtual Qm : ()Z
/*   */     //   91: ifeq -> 130
/*   */     //   94: aload_0
/*   */     //   95: dup
/*   */     //   96: aconst_null
/*   */     //   97: putfield wm0 : Lf/fw0;
/*   */     //   100: invokevirtual zl0 : ()Z
/*   */     //   103: ifeq -> 108
/*   */     //   106: iconst_1
/*   */     //   107: ireturn
/*   */     //   108: aload_0
/*   */     //   109: dup
/*   */     //   110: iconst_1
/*   */     //   111: putfield g4 : Z
/*   */     //   114: aconst_null
/*   */     //   115: putfield wm0 : Lf/fw0;
/*   */     //   118: getstatic f/IZ.Uq : Lf/ik;
/*   */     //   121: ldc 'Could not load cache'
/*   */     //   123: invokeinterface error : (Ljava/lang/String;)V
/*   */     //   128: iconst_0
/*   */     //   129: ireturn
/*   */     //   130: iconst_0
/*   */     //   131: ireturn
/*   */     //   132: iconst_1
/*   */     //   133: ireturn
/*   */     //   134: astore_1
/*   */     //   135: aload_0
/*   */     //   136: dup
/*   */     //   137: iconst_1
/*   */     //   138: putfield g4 : Z
/*   */     //   141: aconst_null
/*   */     //   142: putfield wm0 : Lf/fw0;
/*   */     //   145: getstatic f/IZ.Uq : Lf/ik;
/*   */     //   148: ldc 'Could not create cache'
/*   */     //   150: aload_1
/*   */     //   151: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   156: getstatic f/js.vu0 : Lf/js;
/*   */     //   159: dup
/*   */     //   160: astore_1
/*   */     //   161: ifnull -> 202
/*   */     //   164: aload_1
/*   */     //   165: new java/lang/StringBuilder
/*   */     //   168: dup
/*   */     //   169: astore_1
/*   */     //   170: invokespecial <init> : ()V
/*   */     //   173: sipush #926
/*   */     //   176: aload_1
/*   */     //   177: ldc '\\n('
/*   */     //   179: invokestatic X9 : (ILjava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   182: aload_0
/*   */     //   183: getfield xt0 : B
/*   */     //   186: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   189: ldc ')'
/*   */     //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   194: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   197: iconst_m1
/*   */     //   198: swap
/*   */     //   199: invokevirtual Pu : (ILjava/lang/String;)V
/*   */     //   202: iconst_1
/*   */     //   203: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 156
/*   */     //   #2	-> 165
/*   */     //   #3	-> 177
/*   */     //   #4	-> 183
/*   */     //   #5	-> 199
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   0	4	134	java/lang/Exception
/*   */     //   7	11	134	java/lang/Exception
/*   */     //   17	21	134	java/lang/Exception
/*   */     //   26	67	134	java/lang/Exception
/*   */     //   68	71	134	java/lang/Exception
/*   */     //   72	75	134	java/lang/Exception
/*   */     //   76	85	134	java/lang/Exception
/*   */     //   87	91	134	java/lang/Exception
/*   */     //   94	103	134	java/lang/Exception
/*   */     //   108	128	134	java/lang/Exception
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */