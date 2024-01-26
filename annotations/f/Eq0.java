/* 1 */ package f;public final class Eq0 extends ct0 { public final void wb(SA paramSA) { (new vF0(24, 24, 0))
/* 2 */       .TS
/* 3 */       .qt(new U70[] { this.Oj0 });
/* 4 */     (new vF0(24, 24, 0)).TS
/* 5 */       .tL(24, 24); paramSA.S7(new vF0(24, 24, 0)); byte b; if ((b = this.Sf.fA0) >= 0 && b < 10) { paramSA.mv0(b + 250000); } else if (b == 10) { paramSA.IR("Custom"); } else { paramSA.IR("-"); }  int i = this.Sf.CoN; paramSA.IR((this.Sf.fA0 * 50 + i) + "." + this.Sf.N0); (new Un(this.Sf.iL0())).tW(this); paramSA.S7(new Un(this.Sf.iL0()))
/* 6 */       .Kw(); paramSA.S7(new Un(this.Sf.iL0())).x70(); }
/*   */ 
/*   */   
/*   */   public Eq0(MZ paramMZ, U70 paramU70) {}
/*   */   
/*   */   public final boolean xZ(int paramInt, String paramString) {
/*   */     return LF.qS(this.Sf.iL0(), paramString);
/*   */   }
/*   */   
/*   */   public final void run() {
/*   */     byte b;
/*   */     R8 r8 = km.u4;
/*   */     StringBuilder stringBuilder = B40.df("//moveto ").append(this.Sf.fA0).append(" ");
/*   */     int i = this.Sf.CoN;
/*   */     if (this.Sf.fA0 == 1) {
/*   */       b = 50;
/*   */     } else {
/*   */       b = 0;
/*   */     } 
/*   */     r8.lF(stringBuilder.append(i + b).append(" ").append(this.Sf.N0).append(" 0 0").toString());
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Eq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */