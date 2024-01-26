/* 1 */ package f;public final class bi0 extends bG { public wI0 sw0; public final int Yt = register(new vK("u_lightTexture")); public final int Kv0 = register(new vK("u_useLightTexture")); public final int P90 = register(new vK("glow_intensity")); public final int T50 = register(new vK("glow_threshold")); public final void WQ(b70 paramb70) { super.WQ(paramb70); Hc0 hc0 = paramb70.ra0.r30(); while (hc0
/* 2 */       .hasNext()) { int i; dj dj; if (F4.tc0((dj = (dj)hc0.next()).tL)) { i = this.xk; set(i, ((F4)dj).Nx0); i = this.P90; set(i, ((F4)dj).nj0); i = this.T50; set(i, ((F4)dj).hV); i = this.Kc0; set(i, ((F4)(dj = dj)).A8); continue; }  if (s5.lL0(i.tL)) { i = this.rO; set(i, ((s5)i).lx); }  }  } public final int Kc0 = register(new vK("glow_size")); public final int xk = register(new vK("glow_color")); public final int rO = register(new vK("u_overlayColor")); public final int fw = register(new vK("u_lightTexturePos")); public final int Pl0 = register(new vK("u_lightTextureScale")); public bi0(Xw0 paramXw0, xh paramxh, String paramString) { super(paramXw0, paramxh, paramString); this.sw0 = paramxh.Ss0; } public final void iH(Xw0 paramXw0, b70 paramb70) { super.iH(paramXw0, paramb70); Texture texture; wI0 wI01; if ((wI01 = this.sw0) != null && (texture = wI01.vF0) != null) { set(this.Yt, (zp)texture);
/*   */       
/* 4 */       set(this.Pl0, this.sw0.Xe0);
/*   */       
/* 6 */       set(this.fw, this.sw0.mE0); set(this.Kv0, 1); } else { set(this.Kv0, 0); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bi0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */