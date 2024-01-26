/*   */ package f;
/*   */ public final class Jj { public static final ik V50 = C00.gd(Jj.class); public HI cX; public ig SR; public final Q1 vn0(int paramInt) { 
/* 3 */     try { return Q1.tB(this.SR.zz(paramInt).rb(false)); } catch (Exception exception) { V50.error("failed to load building_id = " + paramInt, this); return null; }  }
/*   */   public ig Pt;
/*   */   public ig l5; public Jj(gD paramgD) { paramgD.getClass(); this.cX = paramgD; this.SR = new ig(paramgD.Vz().B8("/fielddata/build_model/build_model.narc")); this.Pt = new ig(paramgD.Vz().B8("/arc/bm_anime_list.narc")); this.l5 = new ig(paramgD.Vz().B8("/arc/bm_anime.narc")); } public Jj(HI paramHI, VV paramVV) { String str1; String str2; this.cX = paramHI; ig ig2 = new ig(); RD rD2 = paramHI.Vz(); VV vV; if (paramVV == (vV = VV.i60)) { str2 = "/a/0/4/0"; } else { str2 = "/a/1/4/8"; }  this(rD2.B8(str2)); this.SR = ig2; ig ig1 = new ig(); RD rD1 = paramHI.Vz(); if (paramVV == vV) { str1 = "/a/1/0/7"; } else { str1 = "/a/1/0/8"; }
/*   */      this(rD1.B8(str1)); this.Pt = ig1; this.l5 = new ig(paramHI.Vz().B8("/a/1/0/6")); } public final fn jw(int paramInt) { this(this.cX); fn fn; ig ig2; if ((ig2 = this.Pt) == null || this.l5 == null)
/* 7 */       return fn;  ByteBuffer byteBuffer = ig2.zz(paramInt).rb(false); ig ig1 = this.l5; if (get() == 1) { b = 1; } else { b = 0; }  fn.pC0 = b; fn.r1 = get(); getShort(); if (fn.St0.bO() == 4) { fn.oO = get(); get(); get(); get(); }  for (byte b = 0; b < 4; ) { int i; IK0 iK0; if ((i = getInt()) != -1 && (iK0 = IK0.qB0(ig1.zz(i).rb(false))) != null) fn.ok0.Com3(iK0);  b++; }  return fn; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */