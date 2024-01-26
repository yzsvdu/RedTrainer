/*  1 */ package f;public final class K3 extends Kl0 { public final void sM() { Te te; this
/*  2 */       .zw0 = this.Ws.get(); int j; if ((j = R00()) == 0)
/*  3 */     { te = Te.QK0; } else if (te == true) { te = Te.Qu; } else if (te == 2) { te = Te.EE; }
/*  4 */     else { te = null; }  this.wl0 = te; this
/*    */       
/*  6 */       .Q0 = this.Ws.getShort(); int i;
/*    */     fv0[] arrayOfFv0;
/*  8 */     for (this.fj0 = this.Ws.getInt(), this.wp0 = new fv0[R00()], i = 0; i < (arrayOfFv0 = this.wp0).length; ) { short s; Te te1; if (this.wl0 == (te1 = Te.EE)) { s = 1; } else { s = 0; }
/*  9 */        fv0 fv01 = new fv0();
/* 10 */       int k = this.Ws.getInt(); int m;
/* 11 */       if ((m = R00()) == 0)
/* 12 */       { te1 = Te.QK0; } else if (m == 1) { te1 = Te.Qu; } else if (m != 2) { te1 = null; }
/* 13 */        this(k, te1);
/*    */       
/* 15 */       fv01.B90 = this.Ws.getInt();
/*    */       
/* 17 */       fv01.vA = this.Ws.getInt();
/*    */       
/* 19 */       fv01.Lg0 = this.Ws.getInt();
/*    */       
/* 21 */       fv01.gh = this.Ws.getShort(); if (s) { fv01
/*    */           
/* 23 */           .kF0 = this.Ws.get();
/*    */         
/* 25 */         fv01.CoM9 = this.Ws.getShort(); }  if (s || fv01
/* 26 */         .Z6 == 
/* 27 */         Te.Qu) { fv01
/*    */           
/* 29 */           .bn = this.Ws.getShort();
/*    */         
/* 31 */         fv01.nj0 = this.Ws.get(); }  if (fv01
/* 32 */         .Z6 == 
/* 33 */         Te.QK0 && R00() == 1) { byte b; for (fv01
/* 34 */           .mm0 = vy0(), b = 0; b < 6; )
/* 35 */         { s = this.Ws.getShort();
/* 36 */           fv01.aQ[b] = s; b = (byte)(b + 1); }  }  arrayOfFv0[i] = fv01;
/* 37 */       i++; }  if (this.wl0 == Te.Qu) { Qr qr; i = R00(); this(); byte b; for (this.si = qr, b = 0; b < i; ) {
/* 38 */         short s = this.Ws.getShort();
/*    */         
/* 40 */         this.si.RD(this.Ws.getInt(), s); b++;
/*    */       }  }
/*    */      }
/*    */ 
/*    */   
/*    */   public byte zw0;
/*    */   public Te wl0;
/*    */   public short Q0;
/*    */   public int fj0;
/*    */   public fv0[] wp0;
/*    */   public Qr si;
/*    */   
/*    */   public K3(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     ro ro = r8();
/*    */     byte b = this.zw0;
/*    */     Te te = this.wl0;
/*    */     short s = this.Q0;
/*    */     int i = this.fj0;
/*    */     fv0[] arrayOfFv0 = this.wp0;
/*    */     Qr qr = this.si;
/*    */     A a;
/*    */     pA pA;
/*    */     if ((pA = ((R8)this).YG0.MH0) != null && (a = this.QI0) != null)
/*    */       uZ(b, te, s, i, arrayOfFv0, qr); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */