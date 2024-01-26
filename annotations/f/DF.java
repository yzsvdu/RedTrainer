/* 1 */ package f;public class DF implements xy0, UY { public int ue; public int DV; public db NL0; public xy0 fv0; public final int tj0() { xy0 xy01; if ((xy01 = this.fv0) != null)
/* 2 */       return Math.max(this.NL0.bJ0, xy01.tj0()); 
/* 3 */     return this.NL0.bJ0; } public DF(LL paramLL) { db db1; this(5, 5); this.NL0 = this; paramLL.xL0(); } public final void Xw(nY paramnY) { this.ue = ((q80)paramnY).Km(10, "treeIndent"); db db1 = db.oI; this.NL0 = (db)((q80)paramnY).Yz0("treeButtonSize", true, db.class, this); } public String xp0() { return "TreeLeafCellRenderer"; } public final void lk(Object paramObject) { throw new UnsupportedOperationException("Don't call this method"); } public final int cf0() { xy0 xy01; return ((xy01 = this.fv0) != null) ? cf0() : 1; } public final JG0 Lpt8(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) { xy0 xy01; if ((xy01 = this.fv0) != null) { int i; paramInt1 += i = this.DV * this.ue + this.NL0.PO; i = paramInt3 - i; return xy01.Lpt8(paramInt1, paramInt2, Math.max(0, i), paramInt4, paramBoolean); }  return null; }
/*   */ 
/*   */   
/*   */   public JG0 BL(JG0 paramJG0) {
/*   */     xy0 xy01;
/*   */     return (xy01 = this.fv0 instanceof UY) ? ((UY)this).BL(paramJG0) : null;
/*   */   }
/*   */   
/*   */   public void pe0(JG0 paramJG0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     xy0 xy01;
/*   */     if (xy01 = this.fv0 instanceof UY) {
/*   */       int i;
/*   */       int j = paramInt1 + (i = this.DV * this.ue);
/*   */       i = Math.max(0, paramInt3 - i);
/*   */       ((UY)xy01).pe0(paramJG0, j, paramInt2, i, paramInt4);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */