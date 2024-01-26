/*  1 */ package f;public final class CT implements mX, VK0 { public final mX gU; public final uE0 mi; public final uE0 rA; public final int f80; public final int Vb() { uE0 uE01; int i; if ((i = this.f80) >= 0) return i;  if (this.rA != null)
/*  2 */       return this.gU.Vb() + (uE01 = this.rA).ie + this.oN; 
/*  3 */     return ((CT)super).gU.Vb(); } public final int nj0; public final boolean QJ0; public final Nm0 VK0; public CT(mX parammX, uE0 paramuE01, uE0 paramuE02, int paramInt1, int paramInt2, boolean paramBoolean, Nm0 paramNm0) { this.gU = parammX; this.mi = paramuE01; this.rA = paramuE02; this.f80 = paramInt1; this.nj0 = paramInt2; this.QJ0 = paramBoolean; this.VK0 = paramNm0; } public final int wu0() { uE0 uE01; int i; if ((i = this.nj0) >= 0) return i;  if (this.rA != null) return this.gU.wu0() + (uE01 = this.rA).M7 + this.nG0;  return ((CT)super).gU.wu0(); } public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { Nm0 nm0; if ((nm0 = this.VK0) == null || nm0.aU(paramfB0)) { int i; uE0 uE01; if ((uE01 = this.rA) != null)
/*  4 */       { paramInt2 = paramInt1 + (paramInt1 = uE01.ie); paramInt3 = paramInt2 + uE01.M7; paramInt1 = Math.max(0, paramInt3 - paramInt1 - uE01.oN);
/*    */         
/*    */         uE0 uE02;
/*  7 */         i = Math.max(0, paramInt4 - (uE02 = this.rA).M7 - uE02.nG0); paramInt3 = paramInt1 = paramInt2 = paramInt3; }  if (this.QJ0) { paramInt3 = Math.min(paramInt3, this.gU.Vb()); i = Math.min(i, this.gU.wu0());
/*  8 */         paramInt1 = JO.Se0(paramInt3, paramInt3, 2, paramInt1);
/*  9 */         paramInt2 = JO.Se0(i, i, 2, paramInt2); }  this
/* 10 */         .gU.W8(paramfB0, paramInt1, paramInt2, paramInt3, i); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void Gt0(uP paramuP, int paramInt1, int paramInt2) {
/*    */     int i = this.gU.Vb();
/*    */     int j = this.gU.wu0();
/*    */     W8(paramuP, paramInt1, paramInt2, i, j);
/*    */   }
/*    */   
/*    */   public final uE0 mJ0() {
/*    */     return this.mi;
/*    */   }
/*    */   
/*    */   public final mX rv0(pRn parampRn) {
/*    */     mX mX1 = this.gU.rv0(parampRn);
/*    */     uE0 uE01 = this.mi;
/*    */     uE0 uE02 = this.rA;
/*    */     int i = this.f80;
/*    */     int j = this.nj0;
/*    */     boolean bool = this.QJ0;
/*    */     Nm0 nm0 = this.VK0;
/*    */     return new CT(this, uE01, uE02, i, j, bool, nm0);
/*    */   }
/*    */   
/*    */   public final pe0 LPT8() {
/*    */     return null;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */