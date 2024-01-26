/*   */ package f;
/*   */ public final class OE0 { public byte QM; public final H10 Xu; public final H10 PQ; public UX[] tx = new UX[Vp0.Jo.length]; public final short JM(Vp0 paramVp0) { short s;
/* 3 */     if (((s = this.Xu.Hd0[paramVp0.gw0]) == 359 || s == 361) && 
/* 4 */       F00(paramVp0) != UX.km) return (short)(s + 1);  return s; }
/* 5 */   public vd[] ew0 = vd.O5(); public OE0(byte paramByte, H10 paramH10) { this.QM = paramByte; this.Xu = paramH10; this.PQ = new H10(paramH10); } public final H10 OD() { return this.Xu; } public final H10 I1() { return this.PQ; } public final UX F00(Vp0 paramVp0) { byte b; UX arrayOfUX[], uX2; if ((uX2 = (arrayOfUX = this.tx)[b = paramVp0.gw0]) != null) return uX2;  arrayOfUX[b] = this; UX uX1; return uX1 = UX.Er(this.Xu.Kw0[b]); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */