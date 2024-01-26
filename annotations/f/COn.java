/* 1 */ package f;public final class COn { public final void Xv() { if (this.P80) return;  this.BG = new ib0(1024); int i = 0; float f = 1.6F; if (this.Ml == 4) switch (this.cC0) { case 109: case 110: case 111: case 112: f = 1.4F; break; }   zs0[] arrayOfZs02; int k; byte b; for (k = (arrayOfZs02 = this.CoM5).length, b = 0; b < k; ) { zs0 zs01; aJ0 aJ01; short s1; short s2; int m; int n; short s; for (m = (zs01 = arrayOfZs02[b]).Yi.Vi0 - (s2 = (aJ01 = zs01.tu).Vi0), n = (zs01 = arrayOfZs02[b]).Yi.U20 - (s1 = aJ01.U20), s2 += 16, s1 += 16, s = s2; s < s2 + m; ) { if (s >= 0) { if (s >= 32) break;  for (short s3 = s1; s3 < s1 + n; ) { if (s3 >= 0) { if (s3 >= 32) break;  float f1 = (s - 15); f1 = zs01.tm(f1, (s3 - 15)); boolean bool = false; int i1, i2 = (i1 = s3 * 32) + 0 + s; while (true) { if (this.BG.v0(i2)) { OA oA; float f2; boolean bool1; ib0 ib01; int i3; if ((i3 = (ib01 = this.BG).u10(i2)) < 0)
/* 2 */                   { f2 = ib01.Mn0; } else { f2 = f2.BX[i3]; }
/*   */                   
/* 4 */                   if (Math.abs(f2 - f1) <= f) { bool1 = true; } else { bool1 = false; }  if (bool1)
/*   */                   
/*   */                   { 
/* 7 */                     if (!(((oA = zs01.eF0).Vd == 0 && oA.hZ == 0) ? 1 : 0)) break;  } else { int i4; if ((i4 = oA + 1) > i) i = i4;  i2 = i4 * 32 * 32 + i1 + s; continue; }  }  this
/* 8 */                   .BG.ma0(i2, f1); break; }  }  s3++; }  }  s++; }  b++; }  zs0[] arrayOfZs01; for (int j = (arrayOfZs01 = this.CoM5).length; k < j; ) { zs0 zs01; aJ0 aJ01; aJ0 aJ02; if ((aJ01 = (zs01 = arrayOfZs01[k]).tu).Ur != 0 || aJ01.bA != 0 || (aJ02 = zs01.Yi).Ur != 0 || aJ02.bA != 0) { int i4; for (int m = Math.abs(aJ01.Vi0 - (aJ01 = zs01.Yi).Vi0 + ((aJ01.Ur | -aJ01.Ur) >>> -1)), n = Math.abs(zs01.tu.U20 - (aJ02 = zs01.Yi).U20 + ((aJ02.bA | -aJ02.bA) >>> -1)), i1 = zs01.tu.Vi0 + 16, i2 = zs01.tu.U20 + 16, i3 = i1; i3 < (i4 = i1 + m); ) { if (i3 >= 0) { if (i3 >= 32) break;  int i6; for (int i5 = i2; i5 < (i6 = i2 + n); ) { if (i5 >= 0) { if (i5 >= 32) break;  float f1 = (i3 - 15); f1 = zs01.tm(f1, (i5 - 15)); int i7 = i5 * 32 + i3; if ((i5 == i2 || i5 == i6 - 1 || i3 == i1 || i3 == i4 - 1) && !this.BG.v0(i7)) this.BG.ma0(i7, f1);  }  i5++; }  }  i3++; }  }  k++; }  this.j8 = Math.min(4, i + 1); this.P80 = true; }
/*   */ 
/*   */   
/*   */   public final byte Ml;
/*   */   public final short cC0;
/*   */   public aJ0[] Dj0;
/*   */   public OA[] Yk;
/*   */   public nt0[] Yx;
/*   */   public zs0[] CoM5;
/*   */   public ha[] hg;
/*   */   public bD0[] Ca0;
/*   */   public ib0 BG;
/*   */   public int j8;
/*   */   public boolean P80;
/*   */   
/*   */   public static boolean tm0(ByteBuffer paramByteBuffer) {
/*   */     return (paramByteBuffer.getInt(paramByteBuffer.position()) == 1128809538);
/*   */   }
/*   */   
/*   */   public COn(byte paramByte, ByteBuffer paramByteBuffer, short paramShort) {
/*   */     ib0 ib01;
/*   */     this.j8 = 1;
/*   */     this.P80 = false;
/*   */     this.Ml = paramByte;
/*   */     this.cC0 = paramShort;
/*   */     if (!tm0(paramByteBuffer)) {
/*   */       this(1);
/*   */       this.BG = this;
/*   */       return;
/*   */     } 
/*   */     paramByteBuffer.getInt();
/*   */     ((COn)super).Dj0 = new aJ0[paramByteBuffer.getShort()];
/*   */     ((COn)super).Yk = new OA[paramByteBuffer.getShort()];
/*   */     ((COn)super).Yx = new nt0[paramByteBuffer.getShort()];
/*   */     ((COn)super).CoM5 = new zs0[paramByteBuffer.getShort()];
/*   */     ((COn)super).hg = new ha[paramByteBuffer.getShort()];
/*   */     ((COn)super).Ca0 = new bD0[paramByteBuffer.getShort()];
/*   */     paramByte = 0;
/*   */     aJ0[] arrayOfAJ0;
/*   */     while (paramByte < (arrayOfAJ0 = ((COn)super).Dj0).length) {
/*   */       aJ0 aJ01;
/*   */       this(paramByteBuffer);
/*   */       arrayOfAJ0[paramByte] = aJ01;
/*   */       short s = (short)(paramByte + 1);
/*   */     } 
/*   */     paramByte = 0;
/*   */     OA[] arrayOfOA;
/*   */     while (paramByte < (arrayOfOA = ((COn)super).Yk).length) {
/*   */       OA oA;
/*   */       this(paramByteBuffer);
/*   */       arrayOfOA[paramByte] = oA;
/*   */       short s = (short)(paramByte + 1);
/*   */     } 
/*   */     paramByte = 0;
/*   */     nt0[] arrayOfNt0;
/*   */     while (paramByte < (arrayOfNt0 = ((COn)super).Yx).length) {
/*   */       nt0 nt01;
/*   */       this(paramByteBuffer);
/*   */       arrayOfNt0[paramByte] = nt01;
/*   */       short s = (short)(paramByte + 1);
/*   */     } 
/*   */     paramByte = 0;
/*   */     zs0[] arrayOfZs0;
/*   */     while (paramByte < (arrayOfZs0 = ((COn)super).CoM5).length) {
/*   */       zs0 zs01;
/*   */       this((COn)this, paramByteBuffer);
/*   */       arrayOfZs0[paramByte] = zs01;
/*   */       short s = (short)(paramByte + 1);
/*   */     } 
/*   */     paramByte = 0;
/*   */     ha[] arrayOfHa;
/*   */     while (paramByte < (arrayOfHa = ((COn)super).hg).length) {
/*   */       ha ha1;
/*   */       this(paramByteBuffer);
/*   */       arrayOfHa[paramByte] = ha1;
/*   */       short s = (short)(paramByte + 1);
/*   */     } 
/*   */     paramByte = 0;
/*   */     bD0[] arrayOfBD0;
/*   */     while (paramByte < (arrayOfBD0 = ((COn)super).Ca0).length) {
/*   */       bD0 bD01;
/*   */       this(paramByteBuffer);
/*   */       arrayOfBD0[paramByte] = bD01;
/*   */       short s = (short)(paramByte + 1);
/*   */     } 
/*   */     super.Xv();
/*   */   }
/*   */   
/*   */   public final aJ0[] rc() {
/*   */     return this.Dj0;
/*   */   }
/*   */   
/*   */   public final OA[] xI0() {
/*   */     return this.Yk;
/*   */   }
/*   */   
/*   */   public final nt0[] ge0() {
/*   */     return this.Yx;
/*   */   }
/*   */   
/*   */   public final float S20(int paramInt1, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield BG : Lf/ib0;
/*   */     //   4: dup
/*   */     //   5: astore_0
/*   */     //   6: iload_2
/*   */     //   7: bipush #32
/*   */     //   9: imul
/*   */     //   10: iload_1
/*   */     //   11: iadd
/*   */     //   12: invokevirtual u10 : (I)I
/*   */     //   15: dup
/*   */     //   16: istore_1
/*   */     //   17: ifge -> 28
/*   */     //   20: aload_0
/*   */     //   21: getfield Mn0 : F
/*   */     //   24: fstore_0
/*   */     //   25: goto -> 35
/*   */     //   28: aload_0
/*   */     //   29: getfield BX : [F
/*   */     //   32: iload_1
/*   */     //   33: faload
/*   */     //   34: fstore_0
/*   */     //   35: fload_0
/*   */     //   36: freturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 12
/*   */     //   #2	-> 21
/*   */   }
/*   */   
/*   */   public final float Ne(int paramInt1, int paramInt2, int paramInt3) {
/*   */     float f;
/*   */     int i = paramInt1 * 1024;
/*   */     i = paramInt3 * 32 + i + paramInt2;
/*   */     ib0 ib01;
/*   */     if ((i = (ib01 = this.BG).u10(i)) < 0) {
/*   */       f = ib01.Mn0;
/*   */     } else {
/*   */       f = ib01.BX[f];
/*   */     } 
/*   */     return f;
/*   */   }
/*   */   
/*   */   public final void lpT5(int paramInt1, int paramInt2, float paramFloat) {
/*   */     this.BG.ma0(paramInt2 * 32 + paramInt1, paramFloat);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/COn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */