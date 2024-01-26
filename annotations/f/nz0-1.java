/* 1 */ package f;public final class nz0 extends df { public final void Cx() { LI lI; if ((lI = this.EZ) == null)
/*   */       return; 
/* 3 */     ((x6)this.d).E50
/* 4 */       .N2 = lI; }
/*   */ 
/*   */   
/*   */   public LI EZ;
/*   */   
/*   */   public nz0(x6 paramx6, ByteBuffer paramByteBuffer) {
/*   */     super(paramByteBuffer, paramx6, 0);
/*   */   }
/*   */   
/*   */   public final void sM() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual R00 : ()I
/*   */     //   4: iconst_1
/*   */     //   5: if_icmpne -> 417
/*   */     //   8: aload_0
/*   */     //   9: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   12: invokevirtual get : ()B
/*   */     //   15: dup
/*   */     //   16: istore_1
/*   */     //   17: iflt -> 399
/*   */     //   20: iload_1
/*   */     //   21: getstatic f/iC0.fM : [Lf/iC0;
/*   */     //   24: dup
/*   */     //   25: astore_2
/*   */     //   26: arraylength
/*   */     //   27: if_icmpge -> 403
/*   */     //   30: aload_2
/*   */     //   31: iload_1
/*   */     //   32: aaload
/*   */     //   33: invokevirtual ordinal : ()I
/*   */     //   36: dup
/*   */     //   37: istore_1
/*   */     //   38: iconst_1
/*   */     //   39: if_icmpeq -> 316
/*   */     //   42: iload_1
/*   */     //   43: iconst_2
/*   */     //   44: if_icmpeq -> 138
/*   */     //   47: iload_1
/*   */     //   48: iconst_3
/*   */     //   49: if_icmpeq -> 55
/*   */     //   52: goto -> 417
/*   */     //   55: aload_0
/*   */     //   56: dup
/*   */     //   57: dup
/*   */     //   58: dup2
/*   */     //   59: dup2
/*   */     //   60: new f/bK
/*   */     //   63: astore_1
/*   */     //   64: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   67: invokevirtual getInt : ()I
/*   */     //   70: istore_2
/*   */     //   71: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   74: invokevirtual getInt : ()I
/*   */     //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   80: astore_3
/*   */     //   81: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   84: invokevirtual getInt : ()I
/*   */     //   87: istore #4
/*   */     //   89: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   92: invokevirtual getInt : ()I
/*   */     //   95: istore #5
/*   */     //   97: invokevirtual au : ()Ljava/lang/String;
/*   */     //   100: astore #6
/*   */     //   102: invokevirtual au : ()Ljava/lang/String;
/*   */     //   105: pop
/*   */     //   106: invokevirtual R00 : ()I
/*   */     //   109: ifle -> 118
/*   */     //   112: iconst_1
/*   */     //   113: istore #7
/*   */     //   115: goto -> 121
/*   */     //   118: iconst_0
/*   */     //   119: istore #7
/*   */     //   121: aload_1
/*   */     //   122: iload_2
/*   */     //   123: aload_3
/*   */     //   124: iload #4
/*   */     //   126: iload #5
/*   */     //   128: aload #6
/*   */     //   130: iload #7
/*   */     //   132: invokespecial <init> : (ILjava/lang/Integer;IILjava/lang/String;Z)V
/*   */     //   135: goto -> 419
/*   */     //   138: aload_0
/*   */     //   139: dup
/*   */     //   140: dup
/*   */     //   141: new f/t50
/*   */     //   144: astore_1
/*   */     //   145: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   148: invokevirtual getInt : ()I
/*   */     //   151: istore_2
/*   */     //   152: invokevirtual bI : ()Lf/z5;
/*   */     //   155: astore_3
/*   */     //   156: invokevirtual bI : ()Lf/z5;
/*   */     //   159: astore #4
/*   */     //   161: aload_3
/*   */     //   162: invokeinterface hp : ()I
/*   */     //   167: aload #4
/*   */     //   169: invokeinterface hp : ()I
/*   */     //   174: if_icmpne -> 306
/*   */     //   177: aload_3
/*   */     //   178: invokeinterface hp : ()I
/*   */     //   183: iconst_4
/*   */     //   184: if_icmpne -> 218
/*   */     //   187: aload #4
/*   */     //   189: aload_3
/*   */     //   190: invokeinterface Ue0 : ()Lf/o80;
/*   */     //   195: astore_3
/*   */     //   196: invokeinterface Ue0 : ()Lf/o80;
/*   */     //   201: astore #4
/*   */     //   203: new f/Gi0
/*   */     //   206: dup
/*   */     //   207: astore #5
/*   */     //   209: aload_3
/*   */     //   210: aload #4
/*   */     //   212: invokespecial <init> : (Lf/o80;Lf/o80;)V
/*   */     //   215: goto -> 246
/*   */     //   218: aload #4
/*   */     //   220: aload_3
/*   */     //   221: invokeinterface BD : ()Lf/Eb0;
/*   */     //   226: astore_3
/*   */     //   227: invokeinterface BD : ()Lf/Eb0;
/*   */     //   232: astore #4
/*   */     //   234: new f/Hi
/*   */     //   237: dup
/*   */     //   238: astore #5
/*   */     //   240: aload_3
/*   */     //   241: aload #4
/*   */     //   243: invokespecial <init> : (Lf/Eb0;Lf/Eb0;)V
/*   */     //   246: aload_0
/*   */     //   247: dup
/*   */     //   248: dup
/*   */     //   249: dup2
/*   */     //   250: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   253: invokevirtual getInt : ()I
/*   */     //   256: istore_3
/*   */     //   257: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   260: invokevirtual getInt : ()I
/*   */     //   263: istore #4
/*   */     //   265: invokevirtual au : ()Ljava/lang/String;
/*   */     //   268: astore #6
/*   */     //   270: invokevirtual au : ()Ljava/lang/String;
/*   */     //   273: pop
/*   */     //   274: invokevirtual R00 : ()I
/*   */     //   277: ifle -> 286
/*   */     //   280: iconst_1
/*   */     //   281: istore #7
/*   */     //   283: goto -> 289
/*   */     //   286: iconst_0
/*   */     //   287: istore #7
/*   */     //   289: aload_1
/*   */     //   290: iload_2
/*   */     //   291: aload #5
/*   */     //   293: iload_3
/*   */     //   294: iload #4
/*   */     //   296: aload #6
/*   */     //   298: iload #7
/*   */     //   300: invokespecial <init> : (ILf/Vj;IILjava/lang/String;Z)V
/*   */     //   303: goto -> 419
/*   */     //   306: new java/lang/IllegalArgumentException
/*   */     //   309: dup
/*   */     //   310: ldc 'Version mismatch while creating ip range'
/*   */     //   312: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   315: athrow
/*   */     //   316: aload_0
/*   */     //   317: dup
/*   */     //   318: dup
/*   */     //   319: dup2
/*   */     //   320: dup2
/*   */     //   321: new f/UP
/*   */     //   324: astore_1
/*   */     //   325: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   328: invokevirtual getInt : ()I
/*   */     //   331: istore_2
/*   */     //   332: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   335: invokevirtual getInt : ()I
/*   */     //   338: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   341: astore_3
/*   */     //   342: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   345: invokevirtual getInt : ()I
/*   */     //   348: istore #4
/*   */     //   350: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   353: invokevirtual getInt : ()I
/*   */     //   356: istore #5
/*   */     //   358: invokevirtual au : ()Ljava/lang/String;
/*   */     //   361: astore #6
/*   */     //   363: invokevirtual au : ()Ljava/lang/String;
/*   */     //   366: pop
/*   */     //   367: invokevirtual R00 : ()I
/*   */     //   370: ifle -> 379
/*   */     //   373: iconst_1
/*   */     //   374: istore #7
/*   */     //   376: goto -> 382
/*   */     //   379: iconst_0
/*   */     //   380: istore #7
/*   */     //   382: aload_1
/*   */     //   383: iload_2
/*   */     //   384: aload_3
/*   */     //   385: iload #4
/*   */     //   387: iload #5
/*   */     //   389: aload #6
/*   */     //   391: iload #7
/*   */     //   393: invokespecial <init> : (ILjava/lang/Integer;IILjava/lang/String;Z)V
/*   */     //   396: goto -> 419
/*   */     //   399: getstatic f/iC0.Ky : Lf/iC0;
/*   */     //   402: pop
/*   */     //   403: new java/lang/RuntimeException
/*   */     //   406: dup
/*   */     //   407: ldc 'Could not find '
/*   */     //   409: iload_1
/*   */     //   410: invokestatic SD0 : (Ljava/lang/String;I)Ljava/lang/String;
/*   */     //   413: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   416: athrow
/*   */     //   417: aconst_null
/*   */     //   418: astore_1
/*   */     //   419: aload_0
/*   */     //   420: aload_1
/*   */     //   421: putfield EZ : Lf/LI;
/*   */     //   424: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 9
/*   */     //   #3	-> 21
/*   */     //   #4	-> 33
/*   */     //   #5	-> 64
/*   */     //   #6	-> 77
/*   */     //   #7	-> 81
/*   */     //   #8	-> 97
/*   */     //   #9	-> 145
/*   */     //   #10	-> 152
/*   */     //   #11	-> 162
/*   */     //   #12	-> 203
/*   */     //   #13	-> 221
/*   */     //   #14	-> 234
/*   */     //   #15	-> 250
/*   */     //   #16	-> 265
/*   */     //   #17	-> 306
/*   */     //   #18	-> 321
/*   */     //   #19	-> 325
/*   */     //   #20	-> 338
/*   */     //   #21	-> 342
/*   */     //   #22	-> 358
/*   */     //   #23	-> 403
/*   */     //   #24	-> 407
/*   */     //   #25	-> 413
/*   */     //   #26	-> 421
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */