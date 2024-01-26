/*  1 */ package f;public final class Lpt4 extends O0 { public final void LPt2(byte paramByte, short paramShort1, short paramShort2) { super.LPt2(paramByte, paramShort1, paramShort2); XI xI; if (this != (xI = this.lk).ML0) { paramByte = 0; int arrayOfInt[] = new int[paramShort1 = 5], i = 0;
/*  2 */       short[] arrayOfShort1 = new short[10]; int k = 0; byte b = 0; Lpt4[] arrayOfLpt4; while (b < (
/*  3 */         arrayOfLpt4 = this.LpT6).length)
/*    */       { short s;
/*  5 */         if ((s = (arrayOfLpt4[b]).hC0) >= 1) { paramByte++; int n; if ((n = k + 1) > arrayOfShort1.length)
/*  6 */           { arrayOfShort1 = new short[Math.max(arrayOfShort1.length << 1, n)]; int i1 = arrayOfShort1.length; System.arraycopy(arrayOfShort1, 0, arrayOfShort1, 0, i1); }  arrayOfShort1[k] = s;
/*  7 */           k = n; }  b++; }  b = 0; int m = 0;
/*  8 */       short[] arrayOfShort2 = new short[k]; if (k != 0) if (k > 0) {
/*  9 */           System.arraycopy(arrayOfShort1, m, arrayOfShort2, 0, k);
/*    */ 
/*    */ 
/*    */         
/*    */         }
/*    */         else {
/*    */ 
/*    */ 
/*    */           
/* 18 */           throw new ArrayIndexOutOfBoundsException(m);
/*    */         }  
/*    */       int j;
/*    */       for (j = 0; j < k; ) {
/*    */         m = dx.l90(arrayOfShort2[j]);
/*    */         LPT3 lPT3;
/*    */         if ((lPT3 = Of.eH.On0(m)).lF0()) {
/*    */           if (m == 5208 || m == 1175)
/*    */             b = 1; 
/*    */           for (m = 0; m < paramShort1; ) {
/*    */             i = arrayOfInt[m];
/*    */             arrayOfInt[m] = i + arrayOfInt1[m];
/*    */             int[] arrayOfInt1;
/*    */             i += (arrayOfInt1 = lPT3.iI0)[m];
/*    */             m++;
/*    */           } 
/*    */         } 
/*    */         j++;
/*    */       } 
/*    */       if (b != 0) {
/*    */         paramShort1 = 1118;
/*    */       } else {
/*    */         for (j = 0, k = 0, b = 0; b < paramShort1; ) {
/*    */           if ((m = arrayOfInt[b]) > j) {
/*    */             k = b;
/*    */             j = m;
/*    */           } 
/*    */           b++;
/*    */         } 
/*    */         if (j >= 30) {
/*    */           if (j >= 60) {
/*    */             paramShort1 = (short)(k + 1112);
/*    */           } else {
/*    */             paramShort1 = (short)(k + 1106);
/*    */           } 
/*    */         } else if (i >= 80) {
/*    */           paramShort1 = 1117;
/*    */         } else {
/*    */           paramShort1 = 1111;
/*    */         } 
/*    */       } 
/*    */       if (paramByte < 2)
/*    */         paramShort1 = 0; 
/*    */       if (paramShort1 < 1) {
/*    */         this.ML0.wI0(false);
/*    */         this.DW.wI0(false);
/*    */       } else {
/*    */         LPT3 lPT3 = Of.eH.On0(paramShort1);
/*    */         this.ML0.LPt2((byte)0, paramShort1, (short)-1);
/*    */         this.DW.E1(X50());
/*    */         this.ML0.wI0(true);
/*    */         this.DW.wI0(true);
/*    */       }  }
/*    */      }
/*    */ 
/*    */   
/*    */   public Lpt4(XI paramXI) {
/*    */     super((short)0, 0, (short)0, (short)0, true);
/*    */     this.gc = 12;
/*    */     this.x80 = 6;
/*    */     Xu("item-slot");
/*    */   }
/*    */   
/*    */   public final void Tm0(Y paramY) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getfield lk : Lf/XI;
/*    */     //   5: getfield ML0 : Lf/Lpt4;
/*    */     //   8: if_acmpne -> 12
/*    */     //   11: return
/*    */     //   12: aload_1
/*    */     //   13: ifnull -> 309
/*    */     //   16: aload_1
/*    */     //   17: getfield Bp0 : Lf/LPT3;
/*    */     //   20: dup
/*    */     //   21: astore_2
/*    */     //   22: ifnonnull -> 26
/*    */     //   25: return
/*    */     //   26: aload_2
/*    */     //   27: invokevirtual lF0 : ()Z
/*    */     //   30: ifne -> 46
/*    */     //   33: getstatic f/km.u4 : Lf/R8;
/*    */     //   36: sipush #8562
/*    */     //   39: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   42: invokevirtual Pq : (Ljava/lang/String;)V
/*    */     //   45: return
/*    */     //   46: aload_0
/*    */     //   47: getfield lk : Lf/XI;
/*    */     //   50: dup
/*    */     //   51: astore_2
/*    */     //   52: aload_1
/*    */     //   53: getfield Lh : Lf/nH0;
/*    */     //   56: getfield p1 : S
/*    */     //   59: istore_3
/*    */     //   60: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   63: pop
/*    */     //   64: new f/h30
/*    */     //   67: dup
/*    */     //   68: astore #4
/*    */     //   70: invokespecial <init> : ()V
/*    */     //   73: iconst_0
/*    */     //   74: istore #5
/*    */     //   76: iload #5
/*    */     //   78: aload_2
/*    */     //   79: getfield LpT6 : [Lf/Lpt4;
/*    */     //   82: dup
/*    */     //   83: astore #6
/*    */     //   85: arraylength
/*    */     //   86: if_icmpge -> 192
/*    */     //   89: aload #6
/*    */     //   91: iload #5
/*    */     //   93: aaload
/*    */     //   94: getfield hC0 : S
/*    */     //   97: dup
/*    */     //   98: istore #6
/*    */     //   100: iconst_1
/*    */     //   101: if_icmpge -> 107
/*    */     //   104: goto -> 186
/*    */     //   107: aload #4
/*    */     //   109: iload #6
/*    */     //   111: iconst_1
/*    */     //   112: istore #6
/*    */     //   114: iconst_1
/*    */     //   115: istore #7
/*    */     //   117: invokevirtual sq : (S)I
/*    */     //   120: dup
/*    */     //   121: istore #8
/*    */     //   123: ifge -> 154
/*    */     //   126: aload #4
/*    */     //   128: iload #8
/*    */     //   130: ineg
/*    */     //   131: iconst_1
/*    */     //   132: isub
/*    */     //   133: istore #8
/*    */     //   135: getfield Qz0 : [S
/*    */     //   138: dup
/*    */     //   139: iload #8
/*    */     //   141: swap
/*    */     //   142: iload #8
/*    */     //   144: saload
/*    */     //   145: iload #6
/*    */     //   147: iadd
/*    */     //   148: i2s
/*    */     //   149: sastore
/*    */     //   150: iconst_0
/*    */     //   151: goto -> 165
/*    */     //   154: aload #4
/*    */     //   156: getfield Qz0 : [S
/*    */     //   159: iload #8
/*    */     //   161: iload #7
/*    */     //   163: sastore
/*    */     //   164: iconst_1
/*    */     //   165: aload #4
/*    */     //   167: getfield JO : [B
/*    */     //   170: iload #8
/*    */     //   172: baload
/*    */     //   173: pop
/*    */     //   174: ifeq -> 186
/*    */     //   177: aload #4
/*    */     //   179: dup
/*    */     //   180: getfield Mw : Z
/*    */     //   183: invokevirtual xt0 : (Z)V
/*    */     //   186: iinc #5, 1
/*    */     //   189: goto -> 76
/*    */     //   192: aload #4
/*    */     //   194: iload_3
/*    */     //   195: invokevirtual Z90 : (S)S
/*    */     //   198: iconst_1
/*    */     //   199: iadd
/*    */     //   200: i2s
/*    */     //   201: istore_2
/*    */     //   202: getstatic f/km.u4 : Lf/R8;
/*    */     //   205: getstatic f/yM.r4 : Lf/yM;
/*    */     //   208: pop
/*    */     //   209: getfield Fe : [Lf/zr0;
/*    */     //   212: iconst_1
/*    */     //   213: aaload
/*    */     //   214: iconst_m1
/*    */     //   215: iload_3
/*    */     //   216: iload_2
/*    */     //   217: invokevirtual vH0 : (BSS)Z
/*    */     //   220: ifne -> 241
/*    */     //   223: getstatic f/km.u4 : Lf/R8;
/*    */     //   226: aload_1
/*    */     //   227: invokevirtual JG0 : ()Ljava/lang/String;
/*    */     //   230: sipush #6074
/*    */     //   233: swap
/*    */     //   234: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   237: invokevirtual Pq : (Ljava/lang/String;)V
/*    */     //   240: return
/*    */     //   241: aload_1
/*    */     //   242: getfield Lh : Lf/nH0;
/*    */     //   245: dup
/*    */     //   246: astore_2
/*    */     //   247: getfield Sf0 : S
/*    */     //   250: dup
/*    */     //   251: istore_3
/*    */     //   252: iconst_1
/*    */     //   253: dup
/*    */     //   254: istore #4
/*    */     //   256: sipush #9999
/*    */     //   259: istore #5
/*    */     //   261: getstatic f/nx0.Mc0 : Lf/W60;
/*    */     //   264: pop
/*    */     //   265: if_icmpge -> 274
/*    */     //   268: iload #4
/*    */     //   270: istore_3
/*    */     //   271: goto -> 283
/*    */     //   274: iload_3
/*    */     //   275: iload #5
/*    */     //   277: if_icmple -> 283
/*    */     //   280: iload #5
/*    */     //   282: istore_3
/*    */     //   283: aload_1
/*    */     //   284: aload_0
/*    */     //   285: aload_2
/*    */     //   286: dup
/*    */     //   287: getfield p1 : S
/*    */     //   290: istore_0
/*    */     //   291: getfield Nj : B
/*    */     //   294: iload_0
/*    */     //   295: iload_3
/*    */     //   296: invokevirtual LPt2 : (BSS)V
/*    */     //   299: getfield Lh : Lf/nH0;
/*    */     //   302: getfield Wy : I
/*    */     //   305: pop
/*    */     //   306: goto -> 316
/*    */     //   309: aload_0
/*    */     //   310: iconst_0
/*    */     //   311: iconst_0
/*    */     //   312: iconst_0
/*    */     //   313: invokevirtual LPt2 : (BSS)V
/*    */     //   316: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 17
/*    */     //   #2	-> 27
/*    */     //   #3	-> 53
/*    */     //   #4	-> 56
/*    */     //   #5	-> 60
/*    */     //   #6	-> 64
/*    */     //   #7	-> 94
/*    */     //   #8	-> 117
/*    */     //   #9	-> 195
/*    */     //   #10	-> 209
/*    */     //   #11	-> 213
/*    */     //   #12	-> 217
/*    */     //   #13	-> 223
/*    */     //   #14	-> 242
/*    */     //   #15	-> 247
/*    */     //   #16	-> 261
/*    */     //   #17	-> 287
/*    */     //   #18	-> 291
/*    */     //   #19	-> 296
/*    */     //   #20	-> 299
/*    */     //   #21	-> 302
/*    */     //   #22	-> 313
/*    */   }
/*    */   
/*    */   public final void EX(nY paramnY) {
/*    */     d40();
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     uh0(48, 48);
/*    */     RI(48, 48);
/*    */     Tm(48, 48);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lpt4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */