/*   */ package f;public final class J80 { public final String GB0() {
/* 2 */     return Ml0.OH0(this.WV.iz);
/*   */   }
/*   */   
/*   */   public WD WV;
/*   */   
/*   */   public byte V7;
/*   */   public KM oL0;
/*   */   public LPT3 Gj0;
/*   */   public int eP;
/*   */   public String UF0;
/*   */   public Q20 uo0;
/*   */   public Q20 rE;
/*   */   public String Bm0;
/*   */   public String Er0;
/*   */   public String hB;
/*   */   
/*   */   public J80(short paramShort, byte paramByte, KM paramKM, LPT3 paramLPT3) {
/*   */     String str;
/*   */     this.UF0 = null;
/*   */     WD wD = yk0.cw().mP(paramShort);
/*   */     this.V7 = paramByte;
/*   */     this.oL0 = paramKM;
/*   */     this.Gj0 = paramLPT3;
/*   */     if (wD.Xw() == 0) {
/*   */       str = "-";
/*   */     } else {
/*   */       str = this.WV.Xw() + "";
/*   */     } 
/*   */     this.Bm0 = str;
/*   */     this.Er0 = this.WV.Ot() + "";
/*   */     if (this.WV.eg0() == 0 || this.WV.eg0() == 101) {
/*   */       str = "100";
/*   */     } else {
/*   */       str = this.WV.eg0() + "";
/*   */     } 
/*   */     this.hB = str;
/*   */     if (paramLPT3 != null && paramLPT3.bj())
/*   */       try {
/*   */         this.eP = Integer.parseInt(paramLPT3.getName().replaceAll("\\D+", ""));
/*   */       } catch (NumberFormatException numberFormatException) {
/*   */         this.eP = 0;
/*   */       }  
/*   */   }
/*   */   
/*   */   public final int ZK() {
/*   */     LPT3 lPT3;
/*   */     if ((lPT3 = this.Gj0) != null)
/*   */       return lPT3.bj() ? (this.eP + 1001) : 1000; 
/*   */     KM kM;
/*   */     if ((kM = this.oL0) != null) {
/*   */       switch (ordinal()) {
/*   */         default:
/*   */           return 1000;
/*   */         case 2:
/*   */           return 6000;
/*   */         case 5:
/*   */           return 5000;
/*   */         case 0:
/*   */           return 4000;
/*   */         case 3:
/*   */           return 3000;
/*   */         case 1:
/*   */           return 2000;
/*   */         case 4:
/*   */           return 1002;
/*   */         case 6:
/*   */           break;
/*   */       } 
/*   */       return -4;
/*   */     } 
/*   */     return -3;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/J80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */