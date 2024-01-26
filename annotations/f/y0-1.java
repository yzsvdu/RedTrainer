/*  1 */ package f;public final class y0 extends Kl0 { public byte ei; public byte Q00; public byte Nk; public short EF; public final void sM() { this
/*  2 */       .ei = this.Ws.get();
/*    */     
/*  4 */     this.Q00 = this.Ws.get();
/*    */     
/*  6 */     this.Nk = this.Ws.get();
/*    */     
/*  8 */     this.EF = this.Ws.getShort();
/*    */     
/* 10 */     this.To = this.Ws.getShort();
/*    */     
/* 12 */     this.fP = this.Ws.getShort();
/*    */     
/* 14 */     this.Lz0 = this.Ws.getShort(); } public short To; public short fP; public short Lz0; public y0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { byte b1 = this.ei, b2 = this.Q00, b3 = this.Nk; KI kI; if ((kI = km.a3.COm8(b1, b2, b3)) == null) return;  short s2 = this.EF; xr0 xr0; if ((xr0 = kI.v50(s2, this.To, 0)) == null) return;  short s1 = this.fP; xr0.z0((byte)this.Lz0, s1); Jo jo; if ((jo = km.a3.Ct) != null && this.HW.mm == xr0.Ka() && this.HW.Yu0 == xr0.hA0() && this.HW.kD0 == (xr0.Q4()).cA && this.HW
/* 15 */       .vu0 == 
/* 16 */       (xr0.Q4())
/* 17 */       .VZ) this
/* 18 */         .pm
/* 19 */         .nUL(xr0); 
/* 20 */     for (Iterator iterator = km.a3.bm(10000).iterator(); hasNext(); ) { Jo jo1; if ((jo1 = (Jo)next()) == null || 
/* 21 */         jo1.HW
/* 22 */         .mm != xr0
/* 23 */         .Ka() || 
/* 24 */         jo1.HW
/* 25 */         .Yu0 != xr0
/* 26 */         .hA0() || 
/* 27 */         jo1.HW
/* 28 */         .kD0 != 
/* 29 */         (xr0.Q4())
/* 30 */         .cA || 
/* 31 */         jo1.HW
/* 32 */         .vu0 != 
/* 33 */         (xr0.Q4())
/* 34 */         .VZ) continue;  jo1
/* 35 */         .pm
/* 36 */         .nUL(xr0); }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/y0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */