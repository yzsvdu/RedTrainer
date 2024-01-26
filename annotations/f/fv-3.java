/*  1 */ package f;public final class fv implements iq0 { public final void Jz0(OutputStream paramOutputStream, ZH paramZH) { H4 h4 = this.Wq; this(h4, this.EA0); DeflaterOutputStream deflaterOutputStream; DataOutputStream dataOutputStream; byte[] arrayOfByte1, arrayOfByte2, arrayOfByte3; boolean bool; this(paramOutputStream); (new DataOutputStream()).write(Xc); this.Wq.writeInt(1229472850); this.Wq
/*    */       
/*  3 */       .writeInt(paramZH.Con.ju); this.Wq
/*    */ 
/*    */       
/*  6 */       .writeInt(paramZH.Con.Og0); this.Wq.writeByte(8); this.Wq.writeByte(6); this.Wq.writeByte(0); this.Wq.writeByte(0); this.Wq.writeByte(0); this.Wq.tf0(dataOutputStream); this.Wq.writeInt(1229209940); this.EA0.reset();
/*    */     
/*  8 */     int i = paramZH.Con.ju * 4; Hx0 hx0;
/*  9 */     if ((hx0 = this.tI0) == null) { this(i); this.tI0 = hx0; arrayOfByte1 = (hx0 = new Hx0()).wX; this(i); this.Dc = hx01; Hx0 hx01; arrayOfByte2 = (hx01 = new Hx0()).wX; this(i); this.EC = hx02; Hx0 hx02; arrayOfByte3 = (hx02 = new Hx0()).wX; } else { byte b1; int m; for (arrayOfByte1 = arrayOfByte1.Vm(i), arrayOfByte2 = this.Dc.Vm(i), arrayOfByte3 = this.EC.Vm(i), b1 = 0, m = this.po0; b1 < m; ) { arrayOfByte3[b1] = 0; b1++; }  }  this.po0 = i; ByteBuffer byteBuffer; int j = (byteBuffer = paramZH.tp0()).position(); if (paramZH.TU() == Uc.xi0) { bool = true; } else { bool = false; }  byte b = 0;
/*    */     
/* 11 */     for (int k = paramZH.Con.Og0; b < k; ) { if (this
/* 12 */         .Ut0) { b1 = k - b - 1; } else { b1 = b; }  if (bool) { byteBuffer.position(b1 * i); byteBuffer.get(arrayOfByte2, 0, i); } else { byte b2 = 0; int m = 0; Gdx2DPixmap gdx2DPixmap; while (b2 < 
/* 13 */           (gdx2DPixmap = paramZH.Con)
/* 14 */           .ju)
/* 15 */         { m++; arrayOfByte2[m] = (byte)(n >> 24 & 0xFF);
/* 16 */           int n = m + 1; arrayOfByte2[m] = (byte)(n >> 16 & 0xFF); m = n + 1; arrayOfByte2[n] = (byte)(n >> 8 & 0xFF); n = m + 1; arrayOfByte2[m] = (byte)((n = gdx2DPixmap.Fl(b2, b1)) & 0xFF); b2++; m = n; }  }  byte b1; for (arrayOfByte1[0] = (byte)(arrayOfByte2[0] - arrayOfByte3[0]), arrayOfByte1[1] = (byte)(arrayOfByte2[1] - arrayOfByte3[1]), arrayOfByte1[2] = (byte)(arrayOfByte2[2] - arrayOfByte3[2]), arrayOfByte1[3] = (byte)(arrayOfByte2[3] - arrayOfByte3[3]), b1 = 4; b1 < i; ) { int m = arrayOfByte3[b1] & 0xFF, i1 = arrayOfByte3[m] & 0xFF; int n, i2, i3; if ((i3 = (i2 = (n = arrayOfByte2[m = b1 - 4] & 0xFF) + m - i1) - n) < 0) i3 = -i3;  int i4; if ((i4 = i2 - m) < 0) i4 = -i4;  if ((i2 -= i1) < 0) i2 = -i2;  if (i3 > i4 || i3 > i2) if (i4 <= i2) { n = m; } else { n = i1; }   arrayOfByte1[b1] = (byte)(arrayOfByte2[b1] - n); b1++; }  deflaterOutputStream.write(4); deflaterOutputStream.write(arrayOfByte1, 0, i); b++; arrayOfByte2 = arrayOfByte3 = arrayOfByte2; }  byteBuffer.position(j); deflaterOutputStream.finish(); this.Wq.tf0(dataOutputStream); this.Wq.writeInt(1229278788); this.Wq.tf0(dataOutputStream); paramOutputStream.flush(); }
/*    */ 
/*    */   
/*    */   public static final byte[] Xc = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
/*    */   public final H4 Wq;
/*    */   public final Deflater EA0;
/*    */   public Hx0 tI0;
/*    */   public Hx0 Dc;
/*    */   public Hx0 EC;
/*    */   public boolean Ut0;
/*    */   public int po0;
/*    */   
/*    */   public fv() {
/*    */     this(16384);
/*    */   }
/*    */   
/*    */   public fv(int paramInt) {
/*    */     H4 h4;
/*    */     Deflater deflater;
/*    */     this.Ut0 = true;
/*    */     this(paramInt);
/*    */     this.Wq = this;
/*    */     this();
/*    */     this.EA0 = this;
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     this.EA0.end();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fv.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */