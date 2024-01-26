/*  1 */ package f;public class c extends eF0 implements I90 { public static final NC0 z9 = new NC0(); public final d10 sl0; public final jm0 cZ; public final Matrix4 or0; public final Matrix4 Ug() { jm0 jm01 = this.cZ; float f1 = this.bs + 0.0F, f2 = this.kl + 0.0F; f1 = this.kq; f2 = this.DG; jm01.Gr0 = f1; jm01
/*  2 */       .Fq0 = f2; float f3; if ((f3 = this.Bz) == 0.0F) { jm01.My = f1; jm01.nu0 = 0.0F; jm01.z20 = 0.0F; jm01.t50 = f2; } else { f3 = nx0.nH(f3); jm01.My = f * f1; jm01.nu0 = -f3 * f2; jm01.z20 = f3 * f1; float f; jm01.t50 = (f = nx0.Tu0(f3)) * f2; }
/*  3 */      c c1; for (c1 = this.rK0; c1 != null && !c1.wj0; c1 = c1.rK0); if (c1 != null) {
/*  4 */       jm0 jm02; float f5 = (f2 = (jm02 = c1.cZ).My) * (f3 = jm01.My); f5 = f6 * (f2 = jm01.z20) + f5; float f6, f7 = f2 * (f6 = jm01.nu0); float f8; f7 = f6 * (f8 = jm01.t50) + f7; float f9, f10 = f2 * (f9 = jm01.Gr0); float f11; f10 = (f6 = c1.cZ.nu0) * (f11 = jm01.Fq0) + f10 + jm02.Gr0; float f12; f3 = (f12 = c1.cZ.z20) * f3; float f13 = c1.cZ.t50; f2 = f13 * f2 + f3; f3 = f12 * f6; f3 = f13 * f8 + f3; f5 = f12 * f9; float f4 = f13 * f11 + f5 + jm02.Fq0; jm01.My = f5; jm01.nu0 = f7; jm01.Gr0 = f10; jm01.z20 = f2; jm01.t50 = f3; jm01.Fq0 = f4;
/*    */     } 
/*  6 */     this[
/*  7 */         0] = jm01.My; this[1] = jm01.z20; this[2] = 0.0F; this[3] = 0.0F; this[4] = jm01.nu0; this[5] = jm01.t50; this[6] = 0.0F; this[7] = 0.0F; this[8] = 0.0F; this[9] = 0.0F; this[10] = 1.0F; this[11] = 0.0F; this[12] = jm01.Gr0; float[] arrayOfFloat; (arrayOfFloat = this.or0.Z0)[13] = jm01.Fq0; this.or0.Z0[14] = 0.0F; this.or0.Z0[15] = 1.0F; return this.or0; } public final Matrix4 g0; public boolean wj0; public cx0 U40; public c() { d10 d101; jm0 jm01; Matrix4 matrix4; this(true, 4, eF0.class); this.sl0 = this; this(); this.cZ = this; this(); this.or0 = this; this(); this.g0 = this; this.wj0 = true; } public void La(float paramFloat) { super.La(paramFloat); eF0[] arrayOfEF0 = (eF0[])this.sl0.Jv0(); byte b = 0; int i = this.sl0.Z8; while (b < i) { arrayOfEF0[b].La(paramFloat); b++; }  this.sl0.At0(); } public eF0 QI0(float paramFloat1, float paramFloat2, boolean paramBoolean) { if (paramBoolean && this.iG0 == i80.pA) return null;  if (!this.Yo0) return null;  NC0 nC0; eF0[] arrayOfEF0; int i; for (nC0 = z9, arrayOfEF0 = (eF0[])this.sl0.Uq0, i = this.sl0.Z8 - 1; i >= 0; ) { nC0.x = paramFloat1; nC0.y = paramFloat2; eF02.XD(nC0); float f = nC0.x; eF0 eF01, eF02; if ((eF01 = (eF02 = arrayOfEF0[i]).QI0(f, nC0.y, paramBoolean)) != null) return eF01;  i--; }  return super.QI0(paramFloat1, paramFloat2, paramBoolean); } public void rd0() {} public void gx0(eF0 parameF0) { c c1; if ((c1 = parameF0.rK0) != null) { if (c1 == this) return;  c1.Td(parameF0, false); }  this.sl0.Com3(parameF0); parameF0.rK0 = this; parameF0.Vs(this.ih0); rd0(); } public boolean Td(eF0 parameF0, boolean paramBoolean) { int i; if ((i = this.sl0.JF0(parameF0, true)) == -1) return false;  PA(i, paramBoolean); return true; } public void cD(JX paramJX, float paramFloat) { if (this.wj0) { Matrix4 matrix41 = Ug(); Matrix4 matrix42 = paramJX.q0; this.g0.getClass(); this.g0.Qw(matrix42.Z0); if (paramJX.V10) paramJX.ot();  paramJX.q0.getClass(); paramJX.q0.Qw(matrix41.Z0);
/*  8 */       if (paramJX.V10) paramJX.A6();  }
/*  9 */      Oi(paramJX, paramFloat); if (this.wj0) {
/* 10 */       Matrix4 matrix4 = this.g0;
/* 11 */       if (paramJX.V10) paramJX
/* 12 */           .ot();  paramJX.q0.getClass(); paramJX.q0
/* 13 */         .Qw(this.Z0);
/* 14 */       if (paramJX.V10) paramJX.A6(); 
/*    */     }  }
/*    */ 
/*    */   
/*    */   public eF0 PA(int paramInt, boolean paramBoolean) {
/*    */     eF0 eF01 = (eF0)this.sl0.Hc(paramInt);
/*    */     Zy zy;
/*    */     if (paramBoolean && (zy = this.ih0) != null)
/*    */       zy.fL0(eF01); 
/*    */     eF01.rK0 = null;
/*    */     eF01.Vs(null);
/*    */     rd0();
/*    */     return eF01;
/*    */   }
/*    */   
/*    */   public final void Vs(Zy paramZy) {
/*    */     this.ih0 = paramZy;
/*    */     eF0[] arrayOfEF0;
/*    */     byte b;
/*    */     int i;
/*    */     for (arrayOfEF0 = (eF0[])this.sl0.Uq0, b = 0, i = this.sl0.Z8; b < i; ) {
/*    */       this[b].Vs(paramZy);
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     VM(new StringBuilder(128), 1);
/*    */     (new StringBuilder(128)).setLength((new StringBuilder(128)).length() - 1);
/*    */     return (new StringBuilder(128)).toString();
/*    */   }
/*    */   
/*    */   public final void VM(StringBuilder paramStringBuilder, int paramInt) {
/*    */     paramStringBuilder.append(super.toString());
/*    */     paramStringBuilder.append('\n');
/*    */     eF0[] arrayOfEF0 = (eF0[])this.sl0.Jv0();
/*    */     byte b = 0;
/*    */     int i = this.sl0.Z8;
/*    */     while (b < i) {
/*    */       for (byte b1 = 0; b1 < paramInt; b1++)
/*    */         paramStringBuilder.append("|  "); 
/*    */       eF0 eF01;
/*    */       if (eF01 = arrayOfEF0[b] instanceof c) {
/*    */         ((c)eF01).VM(paramStringBuilder, paramInt + 1);
/*    */       } else {
/*    */         paramStringBuilder.append(eF01);
/*    */         paramStringBuilder.append('\n');
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     this.sl0.At0();
/*    */   }
/*    */   
/*    */   public final void Oi(JX paramJX, float paramFloat) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: fload_2
/*    */     //   3: aload_0
/*    */     //   4: getfield As0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   7: getfield a : F
/*    */     //   10: fmul
/*    */     //   11: fstore_2
/*    */     //   12: getfield sl0 : Lf/d10;
/*    */     //   15: dup
/*    */     //   16: astore_3
/*    */     //   17: invokevirtual Jv0 : ()[Ljava/lang/Object;
/*    */     //   20: checkcast [Lf/eF0;
/*    */     //   23: astore #4
/*    */     //   25: getfield U40 : Lf/cx0;
/*    */     //   28: dup
/*    */     //   29: astore #5
/*    */     //   31: ifnull -> 345
/*    */     //   34: aload_0
/*    */     //   35: aload #5
/*    */     //   37: dup
/*    */     //   38: getfield dA : F
/*    */     //   41: dup
/*    */     //   42: fstore #6
/*    */     //   44: aload #5
/*    */     //   46: getfield af : F
/*    */     //   49: fadd
/*    */     //   50: fstore #7
/*    */     //   52: getfield zA0 : F
/*    */     //   55: dup
/*    */     //   56: fstore #8
/*    */     //   58: aload #5
/*    */     //   60: getfield sf0 : F
/*    */     //   63: fadd
/*    */     //   64: fstore #5
/*    */     //   66: getfield wj0 : Z
/*    */     //   69: ifeq -> 172
/*    */     //   72: aload_3
/*    */     //   73: iconst_0
/*    */     //   74: istore_0
/*    */     //   75: getfield Z8 : I
/*    */     //   78: istore #9
/*    */     //   80: iload_0
/*    */     //   81: iload #9
/*    */     //   83: if_icmpge -> 517
/*    */     //   86: aload #4
/*    */     //   88: iload_0
/*    */     //   89: aaload
/*    */     //   90: dup
/*    */     //   91: astore #10
/*    */     //   93: getfield Yo0 : Z
/*    */     //   96: ifne -> 102
/*    */     //   99: goto -> 166
/*    */     //   102: aload #10
/*    */     //   104: getfield bs : F
/*    */     //   107: dup
/*    */     //   108: fstore #11
/*    */     //   110: fload #7
/*    */     //   112: aload #10
/*    */     //   114: getfield kl : F
/*    */     //   117: fstore #12
/*    */     //   119: fcmpg
/*    */     //   120: ifgt -> 166
/*    */     //   123: fload #12
/*    */     //   125: fload #5
/*    */     //   127: fcmpg
/*    */     //   128: ifgt -> 166
/*    */     //   131: fload #11
/*    */     //   133: aload #10
/*    */     //   135: getfield ZP : F
/*    */     //   138: fadd
/*    */     //   139: fload #6
/*    */     //   141: fcmpl
/*    */     //   142: iflt -> 166
/*    */     //   145: fload #12
/*    */     //   147: aload #10
/*    */     //   149: getfield xr0 : F
/*    */     //   152: fadd
/*    */     //   153: fload #8
/*    */     //   155: fcmpl
/*    */     //   156: iflt -> 166
/*    */     //   159: aload #10
/*    */     //   161: aload_1
/*    */     //   162: fload_2
/*    */     //   163: invokevirtual cD : (Lf/JX;F)V
/*    */     //   166: iinc #0, 1
/*    */     //   169: goto -> 80
/*    */     //   172: aload_3
/*    */     //   173: aload_0
/*    */     //   174: dup
/*    */     //   175: dup2
/*    */     //   176: getfield bs : F
/*    */     //   179: fstore #9
/*    */     //   181: getfield kl : F
/*    */     //   184: fstore #10
/*    */     //   186: fconst_0
/*    */     //   187: putfield bs : F
/*    */     //   190: fconst_0
/*    */     //   191: putfield kl : F
/*    */     //   194: iconst_0
/*    */     //   195: istore #11
/*    */     //   197: getfield Z8 : I
/*    */     //   200: istore #12
/*    */     //   202: iload #11
/*    */     //   204: iload #12
/*    */     //   206: if_icmpge -> 330
/*    */     //   209: aload #4
/*    */     //   211: iload #11
/*    */     //   213: aaload
/*    */     //   214: dup
/*    */     //   215: astore #13
/*    */     //   217: getfield Yo0 : Z
/*    */     //   220: ifne -> 226
/*    */     //   223: goto -> 324
/*    */     //   226: aload #13
/*    */     //   228: getfield bs : F
/*    */     //   231: dup
/*    */     //   232: fstore #14
/*    */     //   234: fload #7
/*    */     //   236: aload #13
/*    */     //   238: getfield kl : F
/*    */     //   241: fstore #15
/*    */     //   243: fcmpg
/*    */     //   244: ifgt -> 324
/*    */     //   247: fload #15
/*    */     //   249: fload #5
/*    */     //   251: fcmpg
/*    */     //   252: ifgt -> 324
/*    */     //   255: fload #14
/*    */     //   257: aload #13
/*    */     //   259: getfield ZP : F
/*    */     //   262: fadd
/*    */     //   263: fload #6
/*    */     //   265: fcmpl
/*    */     //   266: iflt -> 324
/*    */     //   269: fload #15
/*    */     //   271: aload #13
/*    */     //   273: getfield xr0 : F
/*    */     //   276: fadd
/*    */     //   277: fload #8
/*    */     //   279: fcmpl
/*    */     //   280: iflt -> 324
/*    */     //   283: aload #13
/*    */     //   285: fload #15
/*    */     //   287: aload #13
/*    */     //   289: fload #14
/*    */     //   291: aload #13
/*    */     //   293: aload_1
/*    */     //   294: aload #13
/*    */     //   296: fload #15
/*    */     //   298: fload #10
/*    */     //   300: aload #13
/*    */     //   302: fload #14
/*    */     //   304: fload #9
/*    */     //   306: fadd
/*    */     //   307: putfield bs : F
/*    */     //   310: fadd
/*    */     //   311: putfield kl : F
/*    */     //   314: fload_2
/*    */     //   315: invokevirtual cD : (Lf/JX;F)V
/*    */     //   318: putfield bs : F
/*    */     //   321: putfield kl : F
/*    */     //   324: iinc #11, 1
/*    */     //   327: goto -> 202
/*    */     //   330: aload_0
/*    */     //   331: dup
/*    */     //   332: fload #9
/*    */     //   334: putfield bs : F
/*    */     //   337: fload #10
/*    */     //   339: putfield kl : F
/*    */     //   342: goto -> 517
/*    */     //   345: aload_0
/*    */     //   346: getfield wj0 : Z
/*    */     //   349: ifeq -> 395
/*    */     //   352: aload_3
/*    */     //   353: iconst_0
/*    */     //   354: istore_0
/*    */     //   355: getfield Z8 : I
/*    */     //   358: istore #5
/*    */     //   360: iload_0
/*    */     //   361: iload #5
/*    */     //   363: if_icmpge -> 517
/*    */     //   366: aload #4
/*    */     //   368: iload_0
/*    */     //   369: aaload
/*    */     //   370: dup
/*    */     //   371: astore #6
/*    */     //   373: getfield Yo0 : Z
/*    */     //   376: ifne -> 382
/*    */     //   379: goto -> 389
/*    */     //   382: aload #6
/*    */     //   384: aload_1
/*    */     //   385: fload_2
/*    */     //   386: invokevirtual cD : (Lf/JX;F)V
/*    */     //   389: iinc #0, 1
/*    */     //   392: goto -> 360
/*    */     //   395: aload_3
/*    */     //   396: aload_0
/*    */     //   397: dup
/*    */     //   398: dup2
/*    */     //   399: getfield bs : F
/*    */     //   402: fstore #5
/*    */     //   404: getfield kl : F
/*    */     //   407: fstore #6
/*    */     //   409: fconst_0
/*    */     //   410: putfield bs : F
/*    */     //   413: fconst_0
/*    */     //   414: putfield kl : F
/*    */     //   417: iconst_0
/*    */     //   418: istore #7
/*    */     //   420: getfield Z8 : I
/*    */     //   423: istore #8
/*    */     //   425: iload #7
/*    */     //   427: iload #8
/*    */     //   429: if_icmpge -> 505
/*    */     //   432: aload #4
/*    */     //   434: iload #7
/*    */     //   436: aaload
/*    */     //   437: dup
/*    */     //   438: astore #9
/*    */     //   440: getfield Yo0 : Z
/*    */     //   443: ifne -> 449
/*    */     //   446: goto -> 499
/*    */     //   449: aload #9
/*    */     //   451: dup
/*    */     //   452: dup
/*    */     //   453: aload_1
/*    */     //   454: aload #9
/*    */     //   456: dup
/*    */     //   457: dup
/*    */     //   458: getfield bs : F
/*    */     //   461: fstore #10
/*    */     //   463: getfield kl : F
/*    */     //   466: dup
/*    */     //   467: fstore #11
/*    */     //   469: fload #6
/*    */     //   471: aload #9
/*    */     //   473: fload #10
/*    */     //   475: fload #5
/*    */     //   477: fadd
/*    */     //   478: putfield bs : F
/*    */     //   481: fadd
/*    */     //   482: putfield kl : F
/*    */     //   485: fload_2
/*    */     //   486: invokevirtual cD : (Lf/JX;F)V
/*    */     //   489: fload #10
/*    */     //   491: putfield bs : F
/*    */     //   494: fload #11
/*    */     //   496: putfield kl : F
/*    */     //   499: iinc #7, 1
/*    */     //   502: goto -> 425
/*    */     //   505: aload_0
/*    */     //   506: dup
/*    */     //   507: fload #5
/*    */     //   509: putfield bs : F
/*    */     //   512: fload #6
/*    */     //   514: putfield kl : F
/*    */     //   517: aload_3
/*    */     //   518: invokevirtual At0 : ()V
/*    */     //   521: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 93
/*    */     //   #2	-> 104
/*    */     //   #3	-> 217
/*    */     //   #4	-> 228
/*    */     //   #5	-> 373
/*    */     //   #6	-> 386
/*    */     //   #7	-> 440
/*    */     //   #8	-> 458
/*    */   }
/*    */   
/*    */   public final void MJ0() {
/*    */     this.wj0 = false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */