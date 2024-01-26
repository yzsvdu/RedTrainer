/*  1 */ package f;public final class xl extends Kl0 { public int kg; public final void sM() { this
/*  2 */       .kg = this.Ws.getInt();
/*  3 */     byte b1 = this.Ws.get();
/*  4 */     byte b2 = this.Ws.get();
/*  5 */     byte b3 = this.Ws.get();
/*  6 */     short s1 = this.Ws.getShort();
/*  7 */     short s2 = this.Ws.getShort();
/*  8 */     byte b4 = this.Ws.get();
/*  9 */     byte b5 = (byte)(this.Ws.get() & 0x3); if ((this.Ws.get() & 0x8) != 0) { bool = true; } else { bool = false; }
/* 10 */      this(b1, b2, b3, bool, s1, s2, b4, b5); G5 g5; boolean bool; this.GE = this; } public G5 GE; public xl(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { int i = this.kg; G5 g5 = this.GE; tc tc; if ((tc = (r8()).Qa.Xb(i)) != null) { this.pm.Cb0(g5); this.pm.u3(); if (this instanceof Jo && Pf()) { boolean bool; R8 r8; if ((r8 = km.u4).GG0) { r8
/* 11 */             .GG0 = false; bool = true; } else { bool = false; }  if (bool)
/*    */         
/*    */         { 
/* 14 */           km.a3.Ct.J
/* 15 */             .Jg0 = false;
/* 16 */           km.a3.Ct.pm
/* 17 */             .Kk(new nl[] { nl.Dn0 }); }  }
/* 18 */        G5 g51 = zk0.We(this);
/* 19 */       zk0
/* 20 */         .pm
/* 21 */         .Cb0(g51); zk0 zk0; tc tc1; if ((zk0 = this.Ae) != null && (tc1 = U0()) != null) tc1
/* 22 */           .pm
/* 23 */           .Cb0(g51); 
/* 24 */       if (zl()) ((Kr0)this)
/* 25 */           .xY.Ic(g5);  }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */