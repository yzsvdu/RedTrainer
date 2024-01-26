/* 1 */ package f;public final class VG0 extends q60 { public final void T80() { if (!QF0()) return;  if (this.y0 % 3 != 0) return;  if (this.EH.lS(this.Tj0) >= 1.0F) { this.EH.f80(this.gQ); super.T80(); } else { if (this.on0)
/* 2 */       { NC0 nC02, nC01; (nC01 = this.d3).getClass();
/* 3 */         this(nC01);
/* 4 */         this.EH = nC02; }  super.T80(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public NC0 d3;
/*   */   public NC0 EH;
/*   */   public NC0 Tj0;
/*   */   public NC0 gQ;
/*   */   
/*   */   public VG0(C30 paramC30, NC0 paramNC01, NC0 paramNC02) {
/*   */     super(paramC30, i, (int)paramNC01.y);
/*   */     this.d3 = paramNC01.ne();
/*   */     this.EH = paramNC01;
/*   */     this.Tj0 = paramNC02;
/*   */     i = (int)Math.floor(Math.abs(paramNC01.lS(paramNC02) / 4.0F));
/*   */     float f;
/*   */     this.gQ = new NC0((paramNC02.x - paramNC01.x) / (f = i), (paramNC02.y - paramNC01.y) / f);
/*   */   }
/*   */   
/*   */   public final int YS() {
/*   */     return (int)this.EH.x;
/*   */   }
/*   */   
/*   */   public final int Jk0() {
/*   */     return (int)this.EH.y;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/VG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */