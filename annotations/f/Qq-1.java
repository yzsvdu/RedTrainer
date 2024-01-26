/*  1 */ package f;public final class Qq extends Kl0 { public boolean Id; public int pr0; public HH[] h7; public Qq(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { if (R00() == 1) { b = 1; } else { b = 0; }  this.Id = b; if (!b) return;  byte b; for (this
/*  2 */       .pr0 = this.Ws.getInt(), this.h7 = new HH[R00()], b = 0; b < this.h7.length; )
/*  3 */     { HH hH; int i = this.Ws.getInt();
/*  4 */       FV fV = k60(); byte b1; SG0[] arrayOfSG0;
/*    */       byte b2;
/*  6 */       for (arrayOfSG0 = new SG0[b1 = this.Ws.get()], b2 = 0; b2 < b1; ) { arrayOfSG0[b2] = new SG0(this
/*  7 */             .Ws.getInt(), this
/*  8 */             .Ws.getShort());
/*  9 */         b2++; }  this(i, fV, arrayOfSG0); this.h7[b] = hH; b++; }  } public final void Cx() { Yp0 yp0 = null; if (this.Id) { this(this.pr0); HH[] arrayOfHH; int i; byte b; for (i = (arrayOfHH = this.h7).length, b = 0; b < i; ) { HH hH = arrayOfHH[b]; yp0.nt0.A3(hH.Ia0, hH); b++; }  }  (r8()).Tr0 = yp0; Bk0 bk0; (bk0 = ((R8)r8()).YG0.MH0.FL).gx();
/* 10 */     ((R8)r8()).YG0.MH0.FL.DF0.clear(); if (yp0 != null) { bk0
/*    */         
/* 12 */         .GX = yp0.K;
/*    */       Ut0 ut0;
/*    */       int i;
/* 15 */       HH[] arrayOfHH = new HH[i = (ut0 = yp0.nt0).ir0]; byte[] arrayOfByte; Object[] arrayOfObject; int j, k;
/* 16 */       for (arrayOfByte = ut0.JO, j = (arrayOfObject = yp0.nt0.ND).length, k = 0; j-- > 0;) { if (arrayOfByte[j] == 1) { int m = k + 1; arrayOfHH[k] = (HH)arrayOfObject[j]; k = m; }  }  for (byte b = 0; b < i; ) { bk0
/* 17 */           .nq(arrayOfHH[b]); b++; }  }
/* 18 */      r8().ng(); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */