/*   */ package f;
/* 2 */ public class dQ extends Ap { public boolean bA = true; public JG0 W4; public tC0[] COn; public boolean h4; public dQ() { this(null, 0); } public dQ(Sa0 paramSa0) { this(paramSa0, 0); } public final String Xy() { return this.wL.toString(); }
/* 3 */   public dQ(Sa0 paramSa0, int paramInt) { super(paramSa0, false); } public dQ(String paramString) { this(); E1(paramString); } public String TI() { return "label"; } public final void lPt3(tC0 paramtC0) { this.COn = (tC0[])hm.LpT6((Object[])this.COn, paramtC0, tC0.class); } public final void MB0() { this.bA = false; } public final void UD0(pe parampe) { super.UD0(parampe); if (this.bA) MJ0();  } public void E1(String paramString) { MF.u10(); HC(paramString); if (!(paramString = gd0.It0(paramString)).equals(this.wL.toString()) && this.bA) MJ0();  } public final Object Gq() { JG0 jG0; Object object; if ((object = this.z4) == null && (jG0 = this.W4) != null) return Gq();  return object; } public final void VH(JG0 paramJG0) { if (paramJG0 != this) { this.W4 = paramJG0; return; }  throw new IllegalArgumentException("labelFor == this"); } public void Xw(nY paramnY) { super.Xw(paramnY); q80 q80; String str; if ((str = (String)(q80 = (q80)paramnY).Yz0("text", false, String.class, null)) != null) E1(str); 
/*   */     pe pe;
/* 5 */     if ((pe = (pe)q80.Yz0("font", false, pe.class, null)) != null) UD0(pe);  } public final boolean BA() { JG0 jG0; return ((jG0 = this.W4) != null) ? jG0.BA() : super.BA(); } public int AW() { return Math.max(super.AW(), J50()); } public int HY() { return Math.max(super.HY(), tj0()); } public boolean i2(oa0 paramoa0) { cb(paramoa0); int i; if (B8.Pg(i = paramoa0.cz0)) { if (this.h4) return false;  if (i == 5) { bv bv; if ((i = paramoa0.uC) != 1) { if (i == 2) { bv = bv.Pr; hm.c50(this.COn, this); }  }
/* 6 */         else { bv = bv.Gg;
/* 7 */           hm.c50(((dQ)super).COn, this); }  }  return 
/* 8 */         (paramoa0.cz0 != 8); }  return false; }
/*   */ 
/*   */   
/*   */   public final void l80() {
/*   */     this.h4 = true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */