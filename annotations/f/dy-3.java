/*  1 */ package f;public final class dy extends ZK0 { public final boolean sM(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) { if (paramByte1 != this.rf0) return false;  if (paramtc != km.a3.Ct) return false; 
/*    */     G5 g5;
/*  3 */     (g5 = paramtc.HW.Ef0())
/*  4 */       .g50 = paramByte1;
/*  5 */     (this.iD.Tj0[this.J1]).k = 1.0F; this.iD.Tj0[this.J1]
/*  6 */       .rd(paramByte1 ^ 0x1, false, null);
/*  7 */     km.u4
/*  8 */       .tN = true; float f1 = 0.5F; if (paramByte1 == 3 || paramByte1 == 2) f1 = 1.0F; 
/*  9 */     this(paramByte1, paramtc); VE vE; e5 e5;
/* 10 */     HC.k6().S(e5, f1);
/* 11 */     this(this, paramByte1, paramtc); float f2 = f1 + 0.6F;
/* 12 */     HC.k6().S(vE, f2);
/* 13 */     this.iD.tk0 = new rg0(this, g5, paramtc, paramByte1); return true; }
/*    */ 
/*    */   
/*    */   public byte J1;
/*    */   public byte rf0;
/*    */   
/*    */   public dy(H6 paramH6, byte paramByte1, byte paramByte2) {
/*    */     this.J1 = paramByte1;
/*    */     this.rf0 = paramByte2;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */