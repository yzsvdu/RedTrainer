/*  1 */ package f;public final class Kc0 { public final int W40(UC0 paramUC0) { byte[] arrayOfByte2 = paramUC0.qV; int n = paramUC0.vt0, i1 = paramUC0.ej0; byte b = 0; int i2 = arrayOfByte1[k + 4] & 0xFF;
/*  2 */     int i3 = arrayOfByte1[k + 5] & 0x1, i4 = arrayOfByte1[k + 5] & 0x2;
/*  3 */     int i5 = arrayOfByte1[k + 5] & 0x4;
/*  4 */     long l = (((((((arrayOfByte1[k + 13] & 0xFF) << 8L | (arrayOfByte1[k + 12] & 0xFF)) << 8L | (arrayOfByte1[k + 11] & 0xFF)) << 8L | (arrayOfByte1[k + 10] & 0xFF)) << 8L | (arrayOfByte1[k + 9] & 0xFF)) << 8L | (arrayOfByte1[k + 8] & 0xFF)) << 8L | (arrayOfByte1[k + 7] & 0xFF)) << 8L | (arrayOfByte1[k + 6] & 0xFF);
/*  5 */     int i6 = paramUC0.Tg(); byte[] arrayOfByte3;
/*  6 */     int i = (arrayOfByte3 = paramUC0.nS)[(i = paramUC0.ZC0) + 18] & 0xFF | (arrayOfByte3[i + 19] & 0xFF) << 8 | (arrayOfByte3[i + 20] & 0xFF) << 16 | (arrayOfByte3[i + 21] & 0xFF) << 24; byte[] arrayOfByte1;
/*  7 */     int k, i7 = (arrayOfByte1 = paramUC0.nS)[(k = paramUC0.ZC0) + 26] & 0xFF, i8 = this.tA; int i9; if ((i9 = this.YF0) != 0) { this.z00 = i10; int i10; if ((i10 = this.z00 - i9) != 0) System.arraycopy(this.et0, i9, this.et0, 0, i10);  this.YF0 = 0; }  if (i8 != 0) { if ((i9 = this.zR - i8) != 0) { System.arraycopy(this.CH, i8, this.CH, 0, i9); int i10 = this.zR - i8; long[] arrayOfLong; System.arraycopy(arrayOfLong = this.GA0, i8, arrayOfLong, 0, i10); }  this.zR -= i8; this.ho -= i8; this.tA = 0; }  if (i6 != this.L4) return -1;  if (i2 > 0) return -1;  i2 = i7 + 1;
/*  8 */     if ((i6 = this.pJ) <= this.zR + i2) { int[] arrayOfInt = new int[this.pJ = i2 + 32 + i6]; i6 = this.CH.length; System.arraycopy(this.CH, 0, arrayOfInt, 0, i6); this.CH = arrayOfInt; long[] arrayOfLong = new long[this.pJ]; i6 = this.GA0.length; System.arraycopy(this.GA0, 0, arrayOfLong, 0, i6); this.GA0 = arrayOfLong; }  if (i != this
/*  9 */       .Qd0) { for (i2 = this.ho; i2 < this.zR; ) { this.z00 -= this.CH[i2] & 0xFF; i2++; }  this.zR = i2 = this.ho; if (this.Qd0 != -1) { this.zR = ++i2; this.CH[i2] = 1024; this.ho = i2; }  if (i3 != 0) for (i4 = 0; b < i7; ) { n += i2; i1 -= i2; if ((i2 = arrayOfByte1[k + 27 + b] & 0xFF) < 255) { b++; break; }  b++; }   }  if (i1 != 0)
/* 10 */     { if ((i2 = this.Cq) <= this.z00 + i1) { byte[] arrayOfByte = new byte[this.Cq = i1 + 1024 + i2]; i3 = this.et0.length; System.arraycopy(this.et0, 0, arrayOfByte, 0, i3); this.et0 = arrayOfByte; }
/* 11 */        arrayOfByte2 = this.et0; System.arraycopy(arrayOfByte2, n, arrayOfByte2, this.z00, i1); this.z00 += i1; }  int m; for (m = -1; b < i7; ) { n = arrayOfByte1[k + 27 + b] & 0xFF; int[] arrayOfInt; (arrayOfInt = this.CH)[i2 = this.zR] = n; this.GA0[i2] = -1L; if (i4 != 0) { arrayOfInt[i2] = n | 0x100; boolean bool = false; }  if (n < 255) m = i2;  this.zR = n = i2 + 1; b++; if (n < 255) this.ho = n;  }  if (m != -1) this.GA0[m] = l;  int j; if (i5 != 0 && (j = this.zR) > 0) this.CH[j] = this.CH[--j] | 0x200;  this.Qd0 = i + 1; return 0; }
/*    */ 
/*    */   
/*    */   public byte[] et0;
/*    */   public int Cq;
/*    */   public int z00;
/*    */   public int YF0;
/*    */   public int[] CH;
/*    */   public long[] GA0;
/*    */   public int pJ;
/*    */   public int zR;
/*    */   public int ho;
/*    */   public int tA;
/*    */   public int L4;
/*    */   public int Qd0;
/*    */   public long x90;
/*    */   
/*    */   public Kc0() {
/*    */     AY();
/*    */   }
/*    */   
/*    */   public final void AY() {
/*    */     this.Cq = 16384;
/*    */     this.et0 = new byte[16384];
/*    */     this.pJ = 1024;
/*    */     this.CH = new int[1024];
/*    */     this.GA0 = new long[1024];
/*    */   }
/*    */   
/*    */   public final int Q80(lc paramlc) {
/*    */     int i = this.tA;
/*    */     if (this.ho <= i)
/*    */       return 0; 
/*    */     int j;
/*    */     if (((j = this.CH[i]) & 0x400) != 0) {
/*    */       this.tA = i + 1;
/*    */       this.x90++;
/*    */       return -1;
/*    */     } 
/*    */     j &= 0xFF;
/*    */     paramlc.ME = this.et0;
/*    */     paramlc.XD0 = this.YF0;
/*    */     paramlc.D60 = j & 0x200;
/*    */     paramlc.Tj = j & 0x100;
/*    */     int k;
/*    */     for (k = j + 0; j == 255; k += j) {
/*    */       j = this.CH[++i] & 0xFF;
/*    */       if ((this.CH[++i] & 0x200) != 0)
/*    */         paramlc.D60 = 512; 
/*    */     } 
/*    */     paramlc.Ky = l;
/*    */     paramlc.tr0 = this.GA0[i];
/*    */     paramlc.W80 = k;
/*    */     this.YF0 += k;
/*    */     this.tA = i + 1;
/*    */     long l;
/*    */     this.x90 = (l = this.x90) + 1L;
/*    */     return 1;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Kc0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */