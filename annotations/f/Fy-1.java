/* 1 */ package f;public final class Fy extends JG0 { public final void d40() { int i = this.lx0; this.YP.Tm(i, this.Gj); this.YP
/*   */       
/* 3 */       .ME((km.wI0.dG() - this.lx0) / 2, (km.wI0.k1() - this.YP.HC) / 3); }
/*   */ 
/*   */   
/*   */   public final Ip YP;
/*   */   public final int lx0;
/*   */   public final int Gj;
/*   */   
/*   */   public Fy(short paramShort) {
/*   */     vF0 vF0;
/*   */     Xu("hudgui");
/*   */     this();
/*   */     this.YP = ip;
/*   */     zh0 zh0 = um0.TK0().H9((byte)0, paramShort, false, false)[0];
/*   */     int k = 2;
/*   */     Ip ip;
/*   */     (ip = new Ip()).Xu("npc-interaction-panel");
/*   */     if (zh0.zN() < 0)
/*   */       zh0.Uu0(); 
/*   */     int i = Math.max(64, zh0.zN()) * k;
/*   */     int j = Math.max(64, zh0.IL()) * k + 16;
/*   */     k = Math.max(64, zh0.IL()) * k;
/*   */     this(i, j);
/*   */     (new vF0()).ZH0().sm(new zh0[] { zh0 });
/*   */     (new vF0()).ZH0().tL(i, k);
/*   */     ip.rK0(ip.AUX(new JG0[] { vF0 }));
/*   */     ip.WN(ip.vo0(new JG0[] { vF0 }));
/*   */     J8(ip);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */