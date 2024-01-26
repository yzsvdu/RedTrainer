/*  1 */ package f;public final class Io extends O0 { public final void LPt2(byte paramByte, short paramShort1, short paramShort2) { super.LPt2(paramByte, paramShort1, paramShort2); sC0 sC01; if (this != (sC01 = this.wT).Fy) { short s; paramByte = 0; int[] arrayOfInt = new int[5];
/*  2 */       short[] arrayOfShort1 = new short[10]; int i = 0; byte b2 = 0; Io[] arrayOfIo;
/*    */       byte b;
/*  4 */       for (int j = (arrayOfIo = this.lpT2).length; b < j; )
/*  5 */       { short s1; if ((s1 = (arrayOfIo[b]).hC0) >= 1) { if (s1 == 1446) b2++;  paramByte++; int k; if ((k = i + 1) > arrayOfShort1.length)
/*  6 */           { arrayOfShort1 = new short[Math.max(arrayOfShort1.length << 1, k)]; int m = arrayOfShort1.length; System.arraycopy(arrayOfShort1, 0, arrayOfShort1, 0, m); }  arrayOfShort1[i] = s1;
/*  7 */           i = k; }  b++; }  boolean bool = false;
/*  8 */       short[] arrayOfShort2 = new short[i]; if (i != 0) if (i > 0) {
/*  9 */           System.arraycopy(arrayOfShort1, bool, arrayOfShort2, 0, i);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*    */         }
/*    */         else {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 32 */           throw new ArrayIndexOutOfBoundsException(bool);
/*    */         }  
/*    */       for (byte b1 = 0; b1 < i; ) {
/*    */         LPT3 lPT31;
/*    */         if ((b = (lPT31 = Of.eH.On0(arrayOfShort2[b1])).rU) >= 0)
/*    */           arrayOfInt[b] = arrayOfInt[b] + lPT31.yE0; 
/*    */         b1++;
/*    */       } 
/*    */       LPT3 lPT3 = null;
/*    */       if (b2 > 0) {
/*    */         if (b2 == 3)
/*    */           lPT3 = Of.eH.On0((short)1446); 
/*    */       } else if (paramByte > 1) {
/*    */         Iterator<LPT3> iterator;
/*    */         label70: for (iterator = Of.eH.cOm7.values().iterator(); iterator.hasNext();) {
/*    */           if ((lPT31 = iterator.next()).lF0()) {
/*    */             if (lPT31.YB > 0) {
/*    */               b2 = 1;
/*    */             } else {
/*    */               b2 = 0;
/*    */             } 
/*    */             if (b2 != 0)
/*    */               continue; 
/*    */             for (b2 = 0; b2 < 5; ) {
/*    */               if (arrayOfInt[b2] < lPT31.iI0[b2])
/*    */                 continue label70; 
/*    */               b2++;
/*    */             } 
/*    */             if (lPT3 == null || lPT3.kU < lPT31.kU)
/*    */               lPT3 = lPT31; 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */       if (lPT3 == null) {
/*    */         paramByte = 0;
/*    */       } else {
/*    */         s = lPT3.bj0;
/*    */       } 
/*    */       if (s < 1) {
/*    */         this.Fy.wI0(false);
/*    */         this.CC0.wI0(false);
/*    */       } else {
/*    */         LPT3 lPT31 = Of.eH.On0(s);
/*    */         this.Fy.LPt2((byte)0, s, (short)-1);
/*    */         this.CC0.E1(rG0.LJ(this, false).trim());
/*    */         this.Fy.wI0(true);
/*    */         this.CC0.wI0(true);
/*    */       }  }
/*    */      }
/*    */ 
/*    */   
/*    */   public Io(sC0 paramsC0) {
/*    */     super((short)0, 0, (short)0, (short)0, true);
/*    */     this.gc = 12;
/*    */     this.x80 = 6;
/*    */     Xu("item-slot");
/*    */   }
/*    */   
/*    */   public final void lE(int paramInt1, int paramInt2) {
/*    */     this.gc = 12;
/*    */     this.x80 = 10;
/*    */   }
/*    */   
/*    */   public final void Tm0(Y paramY) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getfield wT : Lf/sC0;
/*    */     //   5: dup
/*    */     //   6: astore_2
/*    */     //   7: getfield Fy : Lf/Io;
/*    */     //   10: if_acmpne -> 14
/*    */     //   13: return
/*    */     //   14: aload_1
/*    */     //   15: ifnull -> 157
/*    */     //   18: aload_1
/*    */     //   19: getfield Bp0 : Lf/LPT3;
/*    */     //   22: ifnonnull -> 26
/*    */     //   25: return
/*    */     //   26: aload_1
/*    */     //   27: getfield Lh : Lf/nH0;
/*    */     //   30: getfield p1 : S
/*    */     //   33: dup
/*    */     //   34: istore_3
/*    */     //   35: sipush #7030
/*    */     //   38: if_icmplt -> 51
/*    */     //   41: iload_3
/*    */     //   42: sipush #7039
/*    */     //   45: if_icmpgt -> 51
/*    */     //   48: goto -> 75
/*    */     //   51: iload_3
/*    */     //   52: sipush #1030
/*    */     //   55: if_icmplt -> 68
/*    */     //   58: iload_3
/*    */     //   59: sipush #1039
/*    */     //   62: if_icmpgt -> 68
/*    */     //   65: goto -> 75
/*    */     //   68: iload_3
/*    */     //   69: sipush #1446
/*    */     //   72: if_icmpne -> 81
/*    */     //   75: iconst_1
/*    */     //   76: istore #4
/*    */     //   78: goto -> 84
/*    */     //   81: iconst_0
/*    */     //   82: istore #4
/*    */     //   84: iload #4
/*    */     //   86: ifne -> 102
/*    */     //   89: getstatic f/km.u4 : Lf/R8;
/*    */     //   92: sipush #8555
/*    */     //   95: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   98: invokevirtual Pq : (Ljava/lang/String;)V
/*    */     //   101: return
/*    */     //   102: aload_2
/*    */     //   103: iload_3
/*    */     //   104: invokevirtual h50 : (S)Z
/*    */     //   107: ifne -> 128
/*    */     //   110: getstatic f/km.u4 : Lf/R8;
/*    */     //   113: aload_1
/*    */     //   114: invokevirtual JG0 : ()Ljava/lang/String;
/*    */     //   117: sipush #6074
/*    */     //   120: swap
/*    */     //   121: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   124: invokevirtual Pq : (Ljava/lang/String;)V
/*    */     //   127: return
/*    */     //   128: aload_1
/*    */     //   129: aload_0
/*    */     //   130: aload_1
/*    */     //   131: getfield Lh : Lf/nH0;
/*    */     //   134: dup
/*    */     //   135: getfield p1 : S
/*    */     //   138: istore_0
/*    */     //   139: getfield Nj : B
/*    */     //   142: iload_0
/*    */     //   143: iconst_1
/*    */     //   144: invokevirtual LPt2 : (BSS)V
/*    */     //   147: getfield Lh : Lf/nH0;
/*    */     //   150: getfield Wy : I
/*    */     //   153: pop
/*    */     //   154: goto -> 164
/*    */     //   157: aload_0
/*    */     //   158: iconst_0
/*    */     //   159: iconst_0
/*    */     //   160: iconst_0
/*    */     //   161: invokevirtual LPt2 : (BSS)V
/*    */     //   164: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 19
/*    */     //   #2	-> 27
/*    */     //   #3	-> 30
/*    */     //   #4	-> 89
/*    */     //   #5	-> 131
/*    */     //   #6	-> 135
/*    */     //   #7	-> 139
/*    */     //   #8	-> 144
/*    */     //   #9	-> 147
/*    */     //   #10	-> 150
/*    */     //   #11	-> 161
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


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Io.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */