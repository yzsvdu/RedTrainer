/* 1 */ package f;public final class pg0 extends df { public int iH; public byte[] gl0; public final void sM() { this
/* 2 */       .iH = this.Ws.getInt(); this.gl0 = ee0(R00());
/* 3 */     byte b = this.Ws.get();
/* 4 */     String str1 = au(); byte[] arrayOfByte = ee0(R00()); String str2 = au();
/* 5 */     int i = this.Ws.getInt();
/* 6 */     int j = Gc0(), k = Gc0(); if (R00() == 1) { bool = true; } else { bool = false; }  U50[] arrayOfU50 = new U50[0]; if (this
/* 7 */       .LPt4 == 38)
/* 8 */     { int m; U50[] arrayOfU501; byte b1; for (arrayOfU501 = new U50[m = R00()], b1 = 0; b1 < m; ) { arrayOfU501[b1] = eD(); b1++; }  arrayOfU50 = arrayOfU501; }  this(b, str1, arrayOfByte, str2, i, j, k, bool); boolean bool; this.Bx = p10; P10 p10; (p10 = new P10())
/* 9 */       .Yy0 = arrayOfU50; } public P10 Bx; public pg0(ByteBuffer paramByteBuffer, x6 paramx6, int paramInt) { super(paramByteBuffer, paramx6, paramInt); } public final void Cx() { int i = this.iH; byte[] arrayOfByte = this.gl0; P10 p10 = this.Bx; hb0.qf0 = 15; hb0.zL0 = i; hb0.EM = arrayOfByte; hb0.il0 = p10; x6 x6; hb0 hb0; int j, k; if (((k = (hb0 = ((x6)this.d).E50).qf0) == 4 || k == 6 || k == 8 || k == 9) && "PTS".equalsIgnoreCase(p10.gw0) && (x6 = hb0.rQ) != null && ((j = hb0.qf0) == 15 || j == 16)) { mR mR; String str1 = hb0.nf0, str2 = hb0.V80; boolean bool = hb0.Pz0; nt nt = hb0.GA; this(str1, str2, true, bool, nt); Ab0(this); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */