/* 1 */ package f;public final class Pi { public final boolean Ic0(Q90 paramQ90, short paramShort, List paramList1, List paramList2) { short s; if ((s = this.PQ) > 0 && paramQ90.Cw0 != s) return false; 
/* 2 */     if ((s = this.ed) > 0 && !paramQ90.Xj(s)) return false;  if ((s = this.protected) > 0 && paramShort != s) return false;  if (this.ew > 0 && dx.l90(paramQ90.p10()) != dx.l90(this.ew)) return false;  CC0 cC0; if ((cC0 = this.ai) != null && !paramList1.contains(cC0)) return false;  if (this.U9 != null && !paramList2.isEmpty()) { DO dO; cC0 = null; for (DO dO1 : paramList2) { if (cC0 == null || ((DO)cC0)
/* 3 */           .y1 > dO1
/* 4 */           .y1) dO = dO1;  }  if (dO != this
/* 5 */         .U9) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public byte Gk0;
/*   */   public short PQ;
/*   */   public short ed;
/*   */   public short protected;
/*   */   public short ew;
/*   */   public CC0 ai;
/*   */   public DO U9;
/*   */   
/*   */   public Pi(byte paramByte, short paramShort1, short paramShort2, short paramShort3, short paramShort4, CC0 paramCC0, DO paramDO) {
/*   */     this.Gk0 = paramByte;
/*   */     this.PQ = paramShort1;
/*   */     this.ed = paramShort2;
/*   */     this.protected = paramShort3;
/*   */     this.ew = paramShort4;
/*   */     this.ai = paramCC0;
/*   */     this.U9 = paramDO;
/*   */     lb0();
/*   */   }
/*   */   
/*   */   static {
/*   */     Arrays.asList(DO.LM);
/*   */   }
/*   */   
/*   */   public final void lb0() {
/*   */     byte b;
/*   */     if ((b = this.Gk0) != 0 && b != 1 && b != 2)
/*   */       this.Gk0 = 0; 
/*   */     if (this.PQ < 0)
/*   */       this.PQ = 0; 
/*   */     if (this.ed < 0)
/*   */       this.ed = 0; 
/*   */     if (this.protected < 0)
/*   */       this.protected = 0; 
/*   */     if (this.ew < 0)
/*   */       this.ew = 0; 
/*   */   }
/*   */   
/*   */   public final byte Rv0() {
/*   */     return this.Gk0;
/*   */   }
/*   */   
/*   */   public final short G20() {
/*   */     return this.PQ;
/*   */   }
/*   */   
/*   */   public final short FO() {
/*   */     return this.ed;
/*   */   }
/*   */   
/*   */   public final short Nu() {
/*   */     return this.protected;
/*   */   }
/*   */   
/*   */   public final short vW() {
/*   */     return this.ew;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (!(paramObject instanceof Pi))
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.Gk0 != ((Pi)paramObject).Gk0) ? false : ((this.PQ != ((Pi)paramObject).PQ) ? false : ((this.ed != ((Pi)paramObject).ed) ? false : ((this.protected != ((Pi)paramObject).protected) ? false : ((this.ew != ((Pi)paramObject).ew) ? false : ((this.ai != ((Pi)paramObject).ai) ? false : (!(this.U9 != ((Pi)paramObject).U9)))))));
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return Pi.class.getSimpleName() + "[" + this.Gk0 + " " + this.PQ + ", " + this.ed + ", " + this.protected + ", " + this.ew + ", " + this.ai + ", " + this.U9 + "]";
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */