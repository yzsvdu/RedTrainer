/* 1 */ package f;public final class LC0 extends GS implements Np0 { private void lpT9(hm0 paramhm0, kf paramkf) { paramhm0.BC = this.Sr; paramkf
/* 2 */       .oD(paramhm0).Eh(); if (this.Sr > 0) {
/*   */       String[] arrayOfString;
/* 4 */       (arrayOfString = new String[2])[0] = paramhm0.fA(); (new String[2])[
/*   */ 
/*   */           
/* 7 */           1] = B40.df("       ").append(Ml0.OH0(this.Sr + 210000)).toString();
/*   */       
/* 9 */       paramkf.lg(paramhm0.FT, Ml0.tG((byte)2, F40.ef0, 15, 103, arrayOfString));
/*   */     }  }
/*   */ 
/*   */   
/*   */   public final short Sr;
/*   */   public final boolean rU;
/*   */   
/*   */   public LC0(short paramShort, boolean paramBoolean) {
/*   */     this.Sr = paramShort;
/*   */     this.rU = paramBoolean;
/*   */   }
/*   */   
/*   */   public final byte YG0() {
/*   */     return 89;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Sr : S
/*   */     //   4: dup
/*   */     //   5: istore_1
/*   */     //   6: iconst_1
/*   */     //   7: if_icmpge -> 171
/*   */     //   10: aload_0
/*   */     //   11: getfield rU : Z
/*   */     //   14: ifeq -> 108
/*   */     //   17: aload #7
/*   */     //   19: dup
/*   */     //   20: aload_0
/*   */     //   21: aload #7
/*   */     //   23: dup
/*   */     //   24: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   27: astore_0
/*   */     //   28: bipush #14
/*   */     //   30: istore_1
/*   */     //   31: getfield AD : Lf/Gp0;
/*   */     //   34: sipush #565
/*   */     //   37: aload_2
/*   */     //   38: invokevirtual ex : (ILf/hm0;)I
/*   */     //   41: istore_3
/*   */     //   42: iconst_1
/*   */     //   43: anewarray java/lang/String
/*   */     //   46: dup
/*   */     //   47: astore #4
/*   */     //   49: aload_2
/*   */     //   50: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   53: iconst_0
/*   */     //   54: swap
/*   */     //   55: aastore
/*   */     //   56: iconst_2
/*   */     //   57: aload_0
/*   */     //   58: iload_1
/*   */     //   59: iload_3
/*   */     //   60: aload #4
/*   */     //   62: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   65: astore_0
/*   */     //   66: aload_2
/*   */     //   67: invokevirtual ty0 : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   70: astore_1
/*   */     //   71: aload_0
/*   */     //   72: ldc ''
/*   */     //   74: aload_1
/*   */     //   75: invokevirtual r00 : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   78: new f/LV
/*   */     //   81: dup
/*   */     //   82: astore_0
/*   */     //   83: new f/as0
/*   */     //   86: dup
/*   */     //   87: astore_1
/*   */     //   88: aload_2
/*   */     //   89: invokespecial <init> : (Lf/hm0;)V
/*   */     //   92: iconst_0
/*   */     //   93: aload_1
/*   */     //   94: invokespecial <init> : (BLf/wb;)V
/*   */     //   97: getfield YP : Ljava/util/LinkedList;
/*   */     //   100: aload_0
/*   */     //   101: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   104: pop
/*   */     //   105: goto -> 303
/*   */     //   108: aload #7
/*   */     //   110: aload_0
/*   */     //   111: aload #7
/*   */     //   113: dup
/*   */     //   114: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   117: astore_0
/*   */     //   118: bipush #14
/*   */     //   120: istore_1
/*   */     //   121: getfield AD : Lf/Gp0;
/*   */     //   124: sipush #565
/*   */     //   127: aload_2
/*   */     //   128: invokevirtual ex : (ILf/hm0;)I
/*   */     //   131: istore_3
/*   */     //   132: iconst_1
/*   */     //   133: anewarray java/lang/String
/*   */     //   136: dup
/*   */     //   137: astore #4
/*   */     //   139: aload_2
/*   */     //   140: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   143: iconst_0
/*   */     //   144: swap
/*   */     //   145: aastore
/*   */     //   146: iconst_2
/*   */     //   147: aload_0
/*   */     //   148: iload_1
/*   */     //   149: iload_3
/*   */     //   150: aload #4
/*   */     //   152: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   155: astore_0
/*   */     //   156: aload_2
/*   */     //   157: invokevirtual ty0 : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   160: astore_1
/*   */     //   161: aload_0
/*   */     //   162: ldc ''
/*   */     //   164: aload_1
/*   */     //   165: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   168: goto -> 303
/*   */     //   171: iload_1
/*   */     //   172: sipush #152
/*   */     //   175: if_icmpne -> 229
/*   */     //   178: aload #7
/*   */     //   180: aload_0
/*   */     //   181: aload #7
/*   */     //   183: dup
/*   */     //   184: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   187: astore_0
/*   */     //   188: bipush #14
/*   */     //   190: istore_1
/*   */     //   191: getfield AD : Lf/Gp0;
/*   */     //   194: sipush #463
/*   */     //   197: aload_2
/*   */     //   198: invokevirtual ex : (ILf/hm0;)I
/*   */     //   201: istore_3
/*   */     //   202: iconst_1
/*   */     //   203: anewarray java/lang/String
/*   */     //   206: dup
/*   */     //   207: astore #4
/*   */     //   209: aload_2
/*   */     //   210: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   213: iconst_0
/*   */     //   214: swap
/*   */     //   215: aastore
/*   */     //   216: iconst_2
/*   */     //   217: aload_0
/*   */     //   218: iload_1
/*   */     //   219: iload_3
/*   */     //   220: aload #4
/*   */     //   222: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   225: astore_0
/*   */     //   226: goto -> 156
/*   */     //   229: aload #7
/*   */     //   231: aload_0
/*   */     //   232: aload #7
/*   */     //   234: aload_2
/*   */     //   235: aload #7
/*   */     //   237: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   240: astore_1
/*   */     //   241: bipush #14
/*   */     //   243: istore_3
/*   */     //   244: getfield AD : Lf/Gp0;
/*   */     //   247: sipush #405
/*   */     //   250: aload_2
/*   */     //   251: invokevirtual ex : (ILf/hm0;)I
/*   */     //   254: istore #4
/*   */     //   256: iconst_2
/*   */     //   257: anewarray java/lang/String
/*   */     //   260: dup
/*   */     //   261: dup
/*   */     //   262: astore #5
/*   */     //   264: aload_2
/*   */     //   265: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   268: iconst_0
/*   */     //   269: swap
/*   */     //   270: aastore
/*   */     //   271: iconst_1
/*   */     //   272: aload_0
/*   */     //   273: ldc 210000
/*   */     //   275: istore_0
/*   */     //   276: getfield Sr : S
/*   */     //   279: iload_0
/*   */     //   280: iadd
/*   */     //   281: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   284: aastore
/*   */     //   285: iconst_2
/*   */     //   286: aload_1
/*   */     //   287: iload_3
/*   */     //   288: iload #4
/*   */     //   290: aload #5
/*   */     //   292: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   295: astore_0
/*   */     //   296: invokevirtual ty0 : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   299: astore_1
/*   */     //   300: goto -> 161
/*   */     //   303: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 11
/*   */     //   #3	-> 31
/*   */     //   #4	-> 38
/*   */     //   #5	-> 62
/*   */     //   #6	-> 67
/*   */     //   #7	-> 72
/*   */     //   #8	-> 78
/*   */     //   #9	-> 97
/*   */     //   #10	-> 114
/*   */     //   #11	-> 121
/*   */     //   #12	-> 128
/*   */     //   #13	-> 152
/*   */     //   #14	-> 157
/*   */     //   #15	-> 162
/*   */     //   #16	-> 184
/*   */     //   #17	-> 191
/*   */     //   #18	-> 198
/*   */     //   #19	-> 222
/*   */     //   #20	-> 237
/*   */     //   #21	-> 244
/*   */     //   #22	-> 251
/*   */     //   #23	-> 276
/*   */     //   #24	-> 281
/*   */     //   #25	-> 292
/*   */     //   #26	-> 296
/*   */   }
/*   */   
/*   */   public final Runnable ty0(kf paramkf, hm0 paramhm0) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_2
/*   */     //   2: aload_1
/*   */     //   3: <illegal opcode> run : (Lf/LC0;Lf/hm0;Lf/kf;)Ljava/lang/Runnable;
/*   */     //   8: areturn
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */