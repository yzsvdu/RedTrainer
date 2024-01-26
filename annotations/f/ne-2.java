/*  1 */ package f;public final class ne extends Bi { public ne() { super(32); } public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { Lpt2 lpt2; long l = System.currentTimeMillis(); JP jP; (jP = km.Lpt1).Nf0 = 0; km.Lpt1
/*  2 */       .Va0 = 0.0D; byte b;
/*  3 */     int arrayOfInt[] = new int[b = 10], i = 0; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Lpt2}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/Lpt2}, expression=FieldReferenceExpression{lastType=ObjectType{f/JP}, expression=ObjectTypeReferenceExpression{ObjectType{f/km}}, name=Lpt1, descriptor=Lf/JP;}, name=e9, descriptor=Lf/Lpt2;}} */ 
/*  4 */     try { Lpt2 lpt21; (lpt21 = km.Lpt1.e9).getClass();
/*  5 */       int j = km.Lpt1.e9.size(), k = km.Lpt1.e9.FH(); while (j == lpt21
/*  6 */         .ir0)
/*  7 */       { byte[] arrayOfByte1; long[] arrayOfLong; int i2, i5; for (byte[] arrayOfByte4 = lpt21.JO; i5-- > 0 && arrayOfByte4[i5] != 1;); if (i5 >= 0) { i4 = 1; } else { i4 = 0; }  if (i4) {
/*  8 */           long l1 = System.currentTimeMillis();
/*  9 */           if (j == lpt21.ir0) {
/* 10 */             for (byte[] arrayOfByte = lpt21.JO; k-- > 0 && arrayOfByte[k] != 1;); if (k >= 0) { if (l1 - lpt21
/* 11 */                 .hh[k] > 180000L) { if (j == lpt21
/* 12 */                   .ir0) { try { lpt21
/* 13 */                       .IC = true;
/* 14 */                     lpt21.Id(k); }
/* 15 */                   finally { jP = null; lpt21.IC = false; }  continue; }
/* 16 */                  throw new ConcurrentModificationException(); }  continue; }
/* 17 */              throw new NoSuchElementException();
/* 18 */           }  throw new ConcurrentModificationException();
/*    */         } 
/* 20 */         if ((j = (lpt21 = this.e9).ir0) > 150)
/* 21 */         { byte[] arrayOfByte; long[] arrayOfLong1; for (arrayOfLong = new long[j], arrayOfByte = lpt21.JO, i4 = (arrayOfLong1 = lpt21.hh).length, i5 = 0; i4-- > 0;) { if (arrayOfByte[i4] == 1) { int i6 = i5 + 1; long l2 = arrayOfLong1[i4]; arrayOfLong[i5] = l2; i5 = i6; }  }
/* 22 */            Arrays.sort(arrayOfLong); for (long l1 = 0L; l1 < 150L; )
/* 23 */           { Lpt2 lpt22; if ((i5 = (lpt22 = this.e9).wI(arrayOfLong[(int)((j - 1) - l1)])) < 0) {  } else {  }
/* 24 */              i2 = lpt22.ng0[i5]; if ((i5 = i + 1) > arrayOfInt.length)
/* 25 */             { arrayOfInt = new int[Math.max(arrayOfInt.length << 1, i5)]; int i6 = arrayOfInt.length; System.arraycopy(arrayOfInt, 0, arrayOfInt, 0, i6); }  arrayOfInt[i] = i2; l1++;
/* 26 */             i = i5; }  }
/* 27 */         else { byte[] arrayOfByte; int arrayOfInt4[], arrayOfInt5[], i7; for (arrayOfInt4 = new int[j], arrayOfByte = i2.JO, i5 = (arrayOfInt5 = i2.ng0).length, i7 = 0; i5-- > 0;) { if (arrayOfByte[i5] == 1) { int i8 = i7 + 1; arrayOfInt4[i7] = arrayOfInt5[i5]; i7 = i8; }  }  boolean bool1 = false; int i6; if ((i6 = i + j) > arrayOfLong) {
/* 28 */             arrayOfInt = new int[Math.max(20, i6)]; System.arraycopy(arrayOfInt, 0, arrayOfInt, 0, arrayOfLong);
/* 29 */           }  System.arraycopy(arrayOfInt4, bool1, arrayOfInt, i, j); i = i6; }
/* 30 */          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Lpt2}, name=null} */ boolean bool = false;
/* 31 */         int[] arrayOfInt1 = new int[i]; if (i != 0) if (i > 0)
/* 32 */           { System.arraycopy(arrayOfInt, bool, arrayOfInt1, 0, i);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/*    */              }
/*    */           
/*    */           else
/*    */           
/*    */           { 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 71 */             throw new ArrayIndexOutOfBoundsException(bool); }   this(); V6 v6; (v6 = new V6()).Be(arrayOfInt1); this.Va0 = i1; int i1, arrayOfInt2[], arrayOfInt3[]; byte[] arrayOfByte3; int i4; for (arrayOfInt2 = new int[i1 = (new V6()).ir0], arrayOfInt3 = (new V6()).n20, i4 = (arrayOfByte3 = (new V6()).JO).length, i5 = 0; i4-- > 0;) { if (arrayOfByte3[i4] == 1) { int i6 = i5 + 1; arrayOfInt2[i5] = arrayOfInt3[i4]; i5 = i6; }  }  int i3; for (i3 = 0; i3 < i1; ) { int i6 = arrayOfInt2[i3]; this.Nf0 += i6; i3++; }  int n; if ((n = v6.ir0) > 0 && (i1 = this.Nf0) > 0) this.Nf0 = i1 / n;  this.nQ = 0; this.Nf0 = n; this.nQ = n; if ((n = this.Nf0) > 150 && (n /= 15) > 100) this.nQ = 100;  this.Ky = i; if (i < 30) { this.Zc = -1; this.ud0 = -1; this.oc0 = -1; this.Cl = -1; } else { double d1, d2 = this.Va0 / (d1 = i) * 100.0D; if ((this.Zc = (byte)(int)(100.0D - d2)) < 10) this.Zc = (byte)(int)Math.min(d1 * 0.1D, 10.0D);  this.ud0 = (byte)(int)(this.dk0 / (d1 = this.An) * 100.0D); this.oc0 = (byte)(int)(this.Yj / d1 * 100.0D); if (this.nQ < 1) { this.Cl = this.Zc; } else { byte b1; for (d1 = 0.0D, b1 = 0; b1 < i; ) { byte b2; for (i3 = arrayOfInt1[b1], b2 = 0, i4 = 0; i4 < i; ) { int i6; if (i3 == (i5 = arrayOfInt1[i4]) || (i5 < i3 + (i6 = this.nQ) && i5 > i3 - i6)) b2++;  i4++; }  double d; if ((d = b2) > d1) d1 = d;  b1++; }  this.Cl = (byte)(int)(d1 / this.Ky * 100.0D); }  }  this.An = 0; this.Yj = 0; this.dk0 = 0; arrayOfByte2[0] = this.Zc; arrayOfByte2[1] = this.ud0; arrayOfByte2[2] = this.oc0; byte[] arrayOfByte2; (arrayOfByte2 = new byte[4])[3] = this.Cl; km.iE0.getClass(); int m = 0; if (Uf.JJ() != 1116) m = Integer.MIN_VALUE;  R8 r8; if ((r8 = km.u4) != null && r8.p10) m |= 0x40000000;  if (Pw.RM) m |= 0x100000;  if (!q00.No) { if (Uf.TJ()) m |= 0x10000;  if (Uf.Qd()) m |= 0x20000;  if (Uf.SH()) m |= 0x80000;  if (Uf.jb())
/* 72 */             m |= 0x40000;  }  paramByteBuffer.putInt(m); paramByteBuffer.put(arrayOfByte2[0]); paramByteBuffer.put(arrayOfByte2[1]); paramByteBuffer.put(arrayOfByte2[2]); paramByteBuffer.put(arrayOfByte2[3]); paramByteBuffer.putShort((short)Math.min(km.Lpt1.Ky, 32767)); paramByteBuffer.putLong(l); paramByteBuffer.putLong(System.nanoTime()); Socket socket; if ((socket = paramc4.Vn0.socket()) == null || isClosed()) { arrayOfByte1 = LF.Jv(null); } else { arrayOfByte1 = LF.Jv(paramc4.Vn0.socket().getLocalAddress()); }  paramByteBuffer.put(this); return; }  } finally {} throw new ConcurrentModificationException(); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ne.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */