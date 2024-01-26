/* 1 */ package f;public abstract class hO extends JG0 implements r60 { public byte xc; public Aq pe; public int P80 = -1; public Ku0 XK0 = null; public boolean Vd0 = false; public void C40(byte paramByte) { R8 r8; if ((r8 = km.u4) == null) return;  if (this.Vd0) return;  this.Vd0 = true; Ku0 ku0; if ((ku0 = this.XK0) != null) { ku0.S00(paramByte); } else if (!this.pe.gs0) { r8
/* 2 */         .lx0(this.xc, paramByte); }  if (this.pe
/* 3 */       .Q20)
/* 4 */     { dm(); } else { EE0(); }  } public boolean Yv0 = false; public hO(byte paramByte, Aq paramAq) { this.xc = paramByte; this.pe = paramAq; } public abstract boolean RW(int paramInt); public abstract boolean Cs0(); public abstract boolean Eq(); public abstract void SB0(int paramInt1, int paramInt2); public void dm() {} public final void EE0() { if (this.Yv0) return;  this.Yv0 = true; int i; if ((i = this.P80) != -1) { My my; if ((my = km.si0).l3.return(i)) my.l3.remove(i);  js.vu0
/* 5 */         .jf0(this); }  ra0(); }
/*   */ 
/*   */   
/*   */   public void Lf0(zB0 paramzB0) {
/*   */     throw new UnsupportedOperationException();
/*   */   }
/*   */   
/*   */   public boolean bm() {
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */