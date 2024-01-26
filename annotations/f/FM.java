/*  1 */ package f;public final class FM extends Tw { public T7 kt; public short[] Pd; public final ZH VC0(vJ paramvJ, ek0 paramek0) { if (paramek0.jA == 1) paramek0.jA = 2;  this.WF0 = paramek0.WF0; this.Gw = i; this.jA = paramek0.jA; int i = paramek0.m80; int j; i = (j = paramek0.Gw * (i = paramek0.Gw)) * i / 8; byte[] arrayOfByte2 = new byte[this.Pd.length * j]; int k = 0; byte b; short[] arrayOfShort; for (this
/*  2 */       .yn0 = new byte[this.Pd.length * j], b = 0; b < (arrayOfShort = this.Pd).length; ) { byte[] arrayOfByte; int m; short s1, s2 = (short)((s1 = arrayOfShort[b]) & 0x3FF); s1 = (byte)(s1 >> 11 & 0x1); byte b1 = (byte)(s1 >> 12 & 0xF); if ((byte)(arrayOfShort[b] >> 10 & 0x1) != 0) { m = 1; } else { m = 0; }  if (s1 != 0) { s1 = 1; } else { s1 = 0; }  int n; for (n = 0; n < j; ) { this.yn0[b * j + n] = b1; n++; }  if (m || s1 != 0)
/*    */       
/*    */       { 
/*  5 */         arrayOfByte = Arrays.copyOfRange(paramek0.v3, s2 * i, s2 * i + i); if (m)
/*  6 */         { int i2; byte[] arrayOfByte3; int i3; byte b2; for (arrayOfByte3 = new byte[arrayOfByte.length], i3 = (i2 = this.Gw) * (m = this.m80) / 8, b2 = 0; b2 < i2; ) { for (byte b3 = 0; b3 < i3 / 2; ) { int i4, i5; byte b4 = arrayOfByte[i5 = i3 - 1 - b3 + (i4 = b2 * i3)]; i4 = b3 + i4; boolean bool1 = false; if (m == 4) { b4 = (byte)((b4 & 0xF) << 4 | (b4 & 0xF0) >> 4); } else if (m != 8) { b4 = bool1; }  arrayOfByte3[i4] = b4; i4 = arrayOfByte[i4]; b4 = 0; if (m == 4) { i4 = (byte)((i4 & 0xF) << 4 | (i4 & 0xF0) >> 4); } else if (m != 8) { i4 = b4; }  arrayOfByte3[i5] = i4; b3++; }  b2++; }  arrayOfByte = arrayOfByte3; }  if (s1 != 0) {
/*    */           int i2; byte[] arrayOfByte3;
/*  8 */           for (arrayOfByte3 = new byte[arrayOfByte.length], m = (i2 = this.Gw) * this.m80 / 8, n = 0; n < i2 / 2; ) { for (byte b2 = 0; b2 < m; ) { int i3 = n * m + b2; int i4; arrayOfByte3[i3] = arrayOfByte[i4 = (i2 - 1 - n) * m + b2]; arrayOfByte3[i4] = arrayOfByte[i3]; b2++; }  n++; }  arrayOfByte = arrayOfByte3;
/*  9 */         }  b1 = 0; int i1; if ((m = k + (i1 = arrayOfByte.length)) > arrayOfByte2.length) {
/* 10 */           arrayOfByte2 = new byte[Math.max(arrayOfByte2.length << 1, m)]; n = arrayOfByte2.length; System.arraycopy(arrayOfByte2, 0, arrayOfByte2, 0, n);
/* 11 */         }  System.arraycopy(arrayOfByte, b1, arrayOfByte2, k, i1); k = m; } else { byte[] arrayOfByte3 = paramek0.v3; int i1 = arrayOfByte * i; int i2; if ((i2 = k + i) > arrayOfByte2.length) { arrayOfByte2 = new byte[Math.max(arrayOfByte2.length << 1, i2)]; m = arrayOfByte2.length; System.arraycopy(arrayOfByte2, 0, arrayOfByte2, 0, m); }  System.arraycopy(arrayOfByte3, i1, arrayOfByte2, k, i); k = i2; }  b++; }  boolean bool = false;
/* 12 */     byte[] arrayOfByte1 = new byte[k]; if (k != 0) { if (k > 0) {
/* 13 */         System.arraycopy(arrayOfByte2, bool, arrayOfByte1, 0, k); this
/* 14 */           .v3 = arrayOfByte1; return H4(paramvJ);
/* 15 */       }  throw new ArrayIndexOutOfBoundsException(bool); }
/*    */     
/*    */     this.v3 = arrayOfByte1;
/*    */     return H4(paramvJ); }
/*    */ 
/*    */   
/*    */   public boolean uA;
/*    */   
/*    */   public FM(T7 paramT7) {
/*    */     this(paramT7, false);
/*    */   }
/*    */   
/*    */   public FM(T7 paramT7, boolean paramBoolean) {
/*    */     this.kt = paramT7;
/*    */     this.uA = paramBoolean;
/*    */     LD();
/*    */   }
/*    */   
/*    */   public final void LD() {
/*    */     short[] arrayOfShort;
/*    */     byteBuffer.getShort();
/*    */     byteBuffer.getShort();
/*    */     byteBuffer.getInt();
/*    */     byteBuffer.getShort();
/*    */     byteBuffer.getShort();
/*    */     ByteBuffer byteBuffer;
/*    */     int i, j;
/*    */     if ((i = (byteBuffer = this.kt.rb(this.uA)).getInt()) == (j = 1314079570)) {
/*    */       if ((i = byteBuffer.getInt()) == 1396920910) {
/*    */         byteBuffer.getInt();
/*    */         this.Sw0 = byteBuffer.getShort();
/*    */         this.ve0 = byteBuffer.getShort();
/*    */         byteBuffer.getInt();
/*    */         for (this.Pd = new short[byteBuffer.getInt() / 2], i = 0; i < (arrayOfShort = this.Pd).length; ) {
/*    */           arrayOfShort[i] = byteBuffer.getShort();
/*    */           i++;
/*    */         } 
/*    */         return;
/*    */       } 
/*    */       throw new RuntimeException(XD0.SD0("Wrong section: ", i));
/*    */     } 
/*    */     throw new RuntimeException(RH0.KK("Header magic mismatch = ", i, " vs expected ", arrayOfShort));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */