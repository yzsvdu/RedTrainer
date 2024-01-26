/*  1 */ package f;public final class ND extends ct0 { public final boolean xZ(int paramInt, String paramString) { LPT3 lPT3; if ((lPT3 = this.td0).bj0 == paramInt || 
/*    */ 
/*    */       
/*  4 */       LF.qS(Ml0.OH0(this.Iu), paramString)) return true;  }
/*    */   
/*    */   public ND(LPT3 paramLPT3) {}
/*    */   public final void wb(SA paramSA) {
/*  8 */     (new vF0(24, 24, 0)).TS.qt(new U70[] { wm0.y0.SJ0(this.td0.bj0, false) });
/*  9 */     (new vF0(24, 24, 0)).TS
/* 10 */       .tL(24, 24); paramSA.S7(new vF0(24, 24, 0)); byte b;
/* 11 */     if ((b = this.td0.ux0) >= 0 && b < 10) { paramSA
/* 12 */         .mv0(b + 250000); } else if (b == 10) { paramSA.IR("Custom"); } else { paramSA.IR("-"); }  paramSA
/*    */       
/* 14 */       .IR(String.valueOf(this.td0.bj0)); (new Un(
/*    */         
/* 16 */         Ml0.OH0(this.td0.Iu)))
/* 17 */       .tW(this); paramSA.S7(new Un(Ml0.OH0(this.td0.Iu)))
/* 18 */       .Kw(); paramSA.S7(new Un(Ml0.OH0(this.td0.Iu))).x70();
/*    */   }
/*    */   
/*    */   public final void run() {
/*    */     km.u4.lF(B40.df("//createitem ").append(km.u4.Lz.tu).append(" ").append(this.td0.bj0).append(" 1").toString());
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ND.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */