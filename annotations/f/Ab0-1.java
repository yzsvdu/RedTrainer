/*  1 */ package f;public class Ab0 { public static final f7 Da = new f7(); public static final AL xl = new AL(); public final Ua0 Lpt4; public static final AL DC(Kj0 paramKj0, float paramFloat) { AL aL; eo eo2 = (aL = xl).gp; fQ fQ; if ((fQ = paramKj0.gc) == null) { eo2.JL(paramKj0.WW.z7); } else if (fQ.Z8 == 1) { eo2.JL((eo)((w6)fQ.get(0)).YJ); } else { int i = Xp0(paramFloat, fQ); w6 w6; eo2.JL((eo)(w6 = (w6)paramKj0.gc.get(i)).YJ); fQ fQ1; if (++i < (fQ1 = paramKj0.gc).Z8) { w6 w61 = (w6)fQ1.get(i); float f; eo2.x50((eo)w61.YJ, (paramFloat - (f = w6.GY)) / (w61.GY - f)); }  }
/*  2 */      TG0 tG0 = aL.Ca0;
/*  3 */     if ((fQ = paramKj0.I9) == null) { tG0.XL(paramKj0.WW.Nq0); } else if (fQ.Z8 == 1) { tG0.XL((TG0)((w6)fQ.get(0)).YJ); } else { int i = Xp0(paramFloat, fQ); w6 w6; tG0.XL((TG0)(w6 = (w6)paramKj0.I9.get(i)).YJ); fQ fQ1; if (++i < (fQ1 = paramKj0.I9).Z8) { w6 w61 = (w6)fQ1.get(i); float f; tG0.wd((TG0)w61.YJ, (paramFloat - (f = w6.GY)) / (w61.GY - f)); }  }
/*  4 */      eo eo1 = aL.fc;
/*  5 */     if ((fQ = paramKj0.lp) == null) { eo1.JL(paramKj0.WW.nH); } else if (fQ.Z8 == 1) { eo1.JL((eo)((w6)fQ.get(0)).YJ); } else { int i = Xp0(paramFloat, fQ); w6 w6; eo1.JL((eo)(w6 = (w6)paramKj0.lp.get(i)).YJ); fQ fQ1; if (++i < (fQ1 = paramKj0.lp).Z8) { w6 w61 = (w6)fQ1.get(i); eo1.x50((eo)w61.YJ, (paramFloat - (paramFloat = w6.GY)) / (w61.GY - paramFloat)); }  }  return aL; } public boolean rC; public final Tb e7; public Ab0(Tb paramTb) { Ua0 ua0; this(); this.Lpt4 = this; this.rC = false; this.e7 = paramTb; } public static final int Xp0(float paramFloat, fQ paramfQ) { int i; if ((i = paramfQ.Z8 - 1) <= 0 || paramFloat < ((w6)paramfQ.get(0)).GY || paramFloat > ((w6)paramfQ.get(i)).GY) return 0;  int j = 0; while (j < i) { int k; int m; if (paramFloat > ((w6)paramfQ.get(m = (k = (j + i) / 2) + 1)).GY) { j = m; continue; }  if (paramFloat < ((w6)paramfQ.get(k)).GY) { i = k - 1; continue; }  return k; }  return j; } public static void Dl(f7 paramf7, Ua0 paramUa0, float paramFloat1, d4 paramd4, float paramFloat2) { Hc0 hc0; eo eo1; TG0 tG0; eo eo2; if (paramf7 == null) { for (hc0 = paramd4.Jg.r30(); hc0.hasNext(); ) { zP zP; (zP = ((Kj0)hc0.next()).WW).L = true; eo1 = (DC((Kj0)hc0.next(), paramFloat2)).gp; tG0 = (DC((Kj0)hc0.next(), paramFloat2)).Ca0; eo2 = (DC((Kj0)hc0.next(), paramFloat2)).fc; zP.Bf0.mT(eo1, tG0, eo2); }  } else { Q70 q70; (q70 = hc0.W5()).getClass(); for (; q70.hasNext(); ((zP)q70.next()).L = false); for (Hc0 hc01 = ((d4)eo2).Jg.r30(); hc01.hasNext(); ) { eo eo; TG0 tG01; AL aL1; zP zP; (zP = ((Kj0)hc01.next()).WW).L = true; AL aL2 = DC((Kj0)hc01.next(), paramFloat2); Object object = null; int i; if ((i = hc0.gP(zP)) >= 0) object = ((f7)hc0).RG[i]; 
/*  6 */         if ((object = object) != null) { if (tG0 > 0.999999F) {
/*  7 */             eo eo3 = aL2.gp; tG01 = aL2.Ca0; object = aL2.fc; object.to0(eo3, tG01, (eo)object); continue;
/*  8 */           }  eo = ((AL)tG01).gp; tG01 = ((AL)tG01).Ca0; object = ((AL)tG01).fc;
/*  9 */           ((AL)object).gp.x50(eo, tG0); ((AL)object).Ca0.wd(tG01, tG0); ((AL)object).fc.x50((eo)object, tG0); continue; }  if (tG0 > 0.999999F)
/* 10 */         { object.getClass();
/* 11 */           eo eo3 = ((AL)tG01).gp; object = ((AL)tG01).Ca0; eo eo4 = ((AL)tG01).fc; aL1 = (object = eo1.obtain()).to0(eo3, (TG0)object, eo4); }
/* 12 */         else { eo eo3 = ((zP)eo).z7; object = ((zP)eo).Nq0; eo eo4 = ((zP)eo).nH; aL1 = ((AL)eo1.obtain()).to0(eo3, (TG0)object, eo4);
/* 13 */           object = aL1.gp; TG0 tG02 = aL1.Ca0; aL1
/* 14 */             .gp.x50((eo)object, tG0); aL1.Ca0.wd(tG02, tG0); aL1.fc.x50(aL1.fc, tG0); }  hc0
/* 15 */           .X00(eo, aL1); }
/* 16 */        oc oc; (oc = hc0.sh()).getClass(); while (oc.hasNext()) { yO yO; zP zP; if (!(zP = (zP)(yO = oc.next()).Lb).L) { zP.L = true; AL aL = (AL)yO.mm; eo eo = zP.z7; TG0 tG01 = zP.Nq0; aL
/* 17 */             .gp
/* 18 */             .x50(eo, tG0); aL.Ca0.wd(tG01, tG0); aL.fc.x50(zP.nH, tG0); }
/*    */          }
/*    */        }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ab0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */