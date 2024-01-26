/* 1 */ package f;public final class B80 extends Fp { public long QY; public B80() { YA0 yA0; Dn dn; vF0 vF0; this
/* 2 */       .k2 = new e2(500); Xu("notification"); this(); this.QY = System.currentTimeMillis(); this(this); this.Zn0 = new Dn(); (new YA0()).Dv0.S7(dn).fa0(5.0F).Yv(Integer.valueOf(2)).R7().zm0(); this(32, 32); (new YA0()).Dv0.S7(new vF0()); (new YA0()).Dv0.S7(new Of0(this, Ml0.Go(6731, uj.toString()))); vF0.ZH0().qt(new U70[] { wm0.y8().switch((short)5016) }); vF0.ZH0().zy0(); vF0.ZH0().h(true); Zf0(true); J8(yA0); } public Dn Zn0; public e2 k2; public static void wy() { km.u4.e20.W3(new M3()); } public static void mZ() { js.vu0.uh(new h70(Ml0.OH0(6730), B80::wy, null)); } public final boolean i2(oa0 paramoa0) { if (B8.Pg(paramoa0.cz0) && paramoa0
/* 3 */       .vl == 0)
/* 4 */     { mZ(); return true; }  return super.i2(paramoa0); }
/*   */ 
/*   */   
/*   */   public final void J00(throws paramthrows) {
/*   */     if (this.k2.Po0()) {
/*   */       int i = (int)((System.currentTimeMillis() - this.QY) / 1000L) % 60, j = (int)((System.currentTimeMillis() - this.QY) / 1000L) / 60;
/*   */       arrayOfObject[0] = Integer.valueOf(j);
/*   */       Object[] arrayOfObject;
/*   */       (arrayOfObject = new Object[2])[1] = Integer.valueOf(i);
/*   */       this.Zn0.E1(String.format(Locale.ENGLISH, "%02d:%02d", arrayOfObject));
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/B80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */