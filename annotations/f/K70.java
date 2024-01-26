/* 1 */ package f;public class K70 implements iq0 { public ny Zc0; public final wf0 wy; public final fQ for; public final l2 Dn0; public final boolean instanceof; public final synchronized xH; public final KG sg0; public K70(l2 paraml2, synchronized paramsynchronized, KG paramKG) { boolean bool; wf0 wf01; fQ fQ1; this(); this.wy = wf01; this(); this.for = fQ1; if (paramKG == null) super();  this.sg0 = paramKG; if (paraml2 == null) { bool = true; } else { bool = false; }  this.instanceof = bool; if (paraml2 == null) { c00 c00; this(1, 1); this(c00); }  this.Dn0 = paraml2; if (paramsynchronized == null) super();  this.xH = paramsynchronized; } public void mx0(ny paramny) { if (this.Zc0 == null) { this.Zc0 = paramny; if (this.instanceof) { this.Dn0.getClass(); UB0.go.glDisable(2929); this.Dn0.wJ = 0; UB0.go.glDepthMask(true); this.Dn0.lp = true; UB0.go.glDisable(3042); this.Dn0.in = false; UB0.go.glDisable(2884); this.Dn0.XF = 0; this.Dn0.Sq0 = 0; this.Dn0.Bt = 0; c00 c00 = (c00)this.Dn0.fe; byte b = 0; while (b < this
/* 2 */           .VG) { this
/* 3 */             .yB0[b] = null; int[] arrayOfInt; if ((arrayOfInt = this.EG) != null) arrayOfInt[b] = b;  b++; }  }  return; }
/* 4 */      throw new JU("Call end() first."); } public K70(l2 paraml2, synchronized paramsynchronized) { this(paraml2, paramsynchronized, null); } public K70(l2 paraml2, KG paramKG) { this(paraml2, null, paramKG); } public K70(l2 paraml2) { this(paraml2, null, null); } public K70(synchronized paramsynchronized, KG paramKG) { this(null, paramsynchronized, paramKG); } public K70(KG paramKG) { this(null, null, paramKG); } public K70(synchronized paramsynchronized) { this(null, paramsynchronized, null); } public K70(RD0 paramRD01, RD0 paramRD02) { this(paramRD01, paramRD02); X3 x3; this(null, this, null); } public K70(String paramString1, String paramString2) { this(paramString1, paramString2); X3 x3; this(null, this, null); } public K70() { this(null, null, null); } public final void Ly0() { R40 r40; ny ny1 = this.Zc0; this.sg0.nN(ny1, this.for); ny1 = null; fQ fQ1; for (byte b = 0; b < (fQ1 = this.for).Z8; b++) { Xw0 xw0; if (ny1 != (xw0 = (Xw0)fQ1.get(b)).Yc) { if (ny1 != null) ny1.end();  ny ny2 = this.Zc0; (r40 = xw0.Yc).begin(ny2, this.Dn0); }  r40.render(xw0); }  if (r40 != null) r40.end();  this.wy.cF0(); this.for.clear(); } public void end() { Ly0(); if (this.instanceof) { l2 l21; if ((l21 = this.Dn0).wJ != 0) UB0.go.glDisable(2929);  if (!l21.lp) UB0.go.glDepthMask(true);  if (l21.in) UB0.go.glDisable(3042);  if (l21.Bt > 0) UB0.go.glDisable(2884);  ((c00)l21.fe).getClass(); UB0.go.glActiveTexture(33984); }  this.Zc0 = null; }
/*   */ 
/*   */   
/*   */   public final void tx0(tk paramtk) {
/*   */     fQ fQ1;
/*   */     int i = (fQ1 = this.for).Z8;
/*   */     paramtk.getRenderables(fQ1, this.wy);
/*   */     label23: while (i < (fQ1 = this.for).Z8) {
/*   */       Kt kt;
/*   */       (kt = (Kt)this.xH).getClass();
/*   */       Xw0 xw0;
/*   */       R40 r40;
/*   */       if ((r40 = (xw0 = (Xw0)fQ1.get(i)).Yc) == null || !r40.canRender(xw0)) {
/*   */         for (Hc0 hc0 = kt.aH0.r30(); hc0.hasNext();) {
/*   */           if ((r401 = (R40)hc0.next()).canRender(xw0)) {
/*   */             R40 r402 = r401;
/*   */             continue label23;
/*   */           } 
/*   */         } 
/*   */         if ((r40 = kt.xj(xw0)).canRender(xw0)) {
/*   */           r40.init();
/*   */           kt.aH0.Com3(r40);
/*   */         } else {
/*   */           throw new JU("unable to provide a shader for this renderable");
/*   */         } 
/*   */       } 
/*   */       xw0.Yc = r40;
/*   */       i++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public void q10(tk paramtk, fo0 paramfo0) {
/*   */     fQ fQ1;
/*   */     int i = (fQ1 = this.for).Z8;
/*   */     paramtk.getRenderables(fQ1, this.wy);
/*   */     label23: while (i < (fQ1 = this.for).Z8) {
/*   */       xw0.kw = paramfo0;
/*   */       Kt kt;
/*   */       (kt = (Kt)this.xH).getClass();
/*   */       Xw0 xw0;
/*   */       R40 r40;
/*   */       if ((r40 = (xw0 = (Xw0)fQ1.get(i)).Yc) == null || !r40.canRender(xw0)) {
/*   */         for (Hc0 hc0 = kt.aH0.r30(); hc0.hasNext();) {
/*   */           if ((r401 = (R40)hc0.next()).canRender(xw0)) {
/*   */             R40 r402 = r401;
/*   */             continue label23;
/*   */           } 
/*   */         } 
/*   */         if ((r40 = kt.xj(xw0)).canRender(xw0)) {
/*   */           r40.init();
/*   */           kt.aH0.Com3(r40);
/*   */         } else {
/*   */           throw new JU("unable to provide a shader for this renderable");
/*   */         } 
/*   */       } 
/*   */       xw0.Yc = r40;
/*   */       i++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void QJ0(fQ paramfQ, fo0 paramfo0) {
/*   */     Hc0 hc0 = paramfQ.r30();
/*   */     for (; hc0.hasNext(); q10((tk)hc0.next(), paramfo0));
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     ((Kt)this.xH).dispose();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K70.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */