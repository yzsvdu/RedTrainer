/*  1 */ package f;public final class Qf0 extends Kl0 { public byte[] aa; public sM[] kx; public Qf0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { byte b; sM[] arrayOfSM; for (this.aa = ee0(R00()), this.kx = new sM[Gc0()], b = 0; b < (arrayOfSM = this.kx).length; ) { int i = this.Ws.getInt();
/*  2 */       byte b1 = this.Ws.get();
/*  3 */       sM sM1 = new sM();
/*  4 */       short s = this.Ws.get(); ak ak;
/*  5 */       if ((ak = Tx0.F70)
/*  6 */         .db0(s)) {
/*  7 */         Tx0 tx0 = (Tx0)ak.Ha0(s);
/*  8 */         s = this.Ws.getShort();
/*  9 */         int j = this.Ws.getInt(), k = this.Ws.getInt(), m = this.Ws.getInt(), n = this.Ws.getInt(), i1 = this.Ws.getInt();
/* 10 */         byte b2 = this.Ws.get();
/* 11 */         R00(); this(i, tx0, b1, s, j, k, m, n, i1, b2); if (R00() == 1)
/* 12 */         { byte b3 = this.Ws.get(); b1 = this.Ws.get(); s = this.Ws.get();
/*    */           
/* 14 */           sM1.Jc0 = new iQ(this.Ws.get(), b3, b1, s); }  sM1
/*    */           
/* 16 */           .this = this.Ws.getInt(); arrayOfSM[b] = sM1;
/* 17 */         b++; continue;
/* 18 */       }  throw new RuntimeException(
/* 19 */           XD0.SD0("Type ", s)); }  } public final void Cx() { byte[] arrayOfByte = this.aa; sM[] arrayOfSM = this.kx; R8 r8; (r8 = (R8)r8()).XA0 = this; pA pA; if ((pA = ((R8)r8()).YG0.MH0) != null) { XK0 xK0; if ((xK0 = this.Gu0) != null) { fQ fQ; this.Lm = new sM[arrayOfTx0.length][0]; this(sM.class); Tx0[] arrayOfTx0; int i; byte b; for (i = (arrayOfTx0 = Tx0.jb).length, b = 0; b < i; ) { ArrayList<sM> arrayList; Tx0 tx0 = arrayOfTx0[b]; this(); int j; byte b2; for (j = arrayOfSM.length, b2 = 0; b2 < j; ) { arrayList.add(sM1); sM sM1; iQ iQ; if (((iQ = (sM1 = arrayOfSM[b2]).Jc0) == null || iQ.AA0()) && sM1.A8 == tx0 && sM1.this > -1) fQ.Com3(sM1);  b2++; }  byte b1 = tx0.Ri0; this.Lm[b1] = arrayList.<sM>toArray(new sM[0]); b++; }  this.Lm[0] = (sM[])fQ.toArray(); update(); }  gO gO; if ((gO = r8.YG0.MH0.dk0) != null) { int i; byte b; for (this.Sv0 = true, i = arrayOfSM.length, b = 0; b < i; ) { sM sM1; byte b1; if ((b1 = (sM1 = arrayOfSM[b]).pE0) == 1 && sM1.Tk == 1120) { this
/* 20 */               .ob = sM1; } else if (b1 == 1 && sM1
/* 21 */             .Tk == 1194) { this
/* 22 */               .UN = sM1; }  b++; }  vg(); }
/*    */        }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */