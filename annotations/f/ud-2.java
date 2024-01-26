/* 1 */ package f;public final class ud { public static ud oc; public Mj qu; public Mj sC0; public final void Xk(int paramInt, boolean paramBoolean) { int i = 255; if (paramBoolean)
/*   */     {
/*   */       
/* 4 */       i = Math.max(this.qu.oI, this.sC0.oI); }  this.qu.gz0(i, 0, paramInt); this.sC0
/* 5 */       .oI = 0;
/* 6 */     this.sC0.wB0 = 0; }
/* 7 */   public nm0 wS; public Mj gF; public ud() { Texture texture; Uc uc = Uc.com9; this(1, 1, uc); int k = Color.BLACK.toIntBits(); zH.WB0(0, 0, k); this(zH); this.qu = new Mj(new Ui0(texture)); this.gF = new Mj(new Ui0(texture)); ZH zH; (zH = new ZH()).dispose(); this(1, 1, uc); int j = Color.WHITE.toIntBits(); zH.WB0(0, 0, j); this.sC0 = new Mj(new Ui0(new Texture(zH))); (zH = new ZH()).dispose(); this(1, 1, uc); int i = Color.RED.toIntBits(); zH.WB0(0, 0, i); this.wS = new nm0(new Ui0(new Texture(zH))); (zH = new ZH()).dispose(); } public static ud Bp() { if (oc == null) oc = new ud();  return oc; } public final int yF() { int j = 0; int k; if ((k = this.sC0.oI) > 0) j = k;  if ((k = this.qu.oI) > j) j = k;  if ((k = this.wS.oI) > j) j = k;  int i; if ((i = this.gF.oI) > j) j = i;  return j; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */