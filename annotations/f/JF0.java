/* 1 */ package f;public final class JF0 extends Wv0 { public r1 h6; public fA0 ox0; public u throws; public final void Ki(int paramInt) { fA0 fA01; super.Ki(paramInt); r1[] arrayOfR1; if ((arrayOfR1 = r1.it0).length <= paramInt) return;  r1 r11 = arrayOfR1[paramInt]; r1 r12; if ((r12 = this.h6) == r11) { if ((fA01 = this.ox0.xs0()) != null) { if (this.ox0 != fA01) { this.ox0 = fA01;
/* 2 */           Mh0(); h2(); }  }
/* 3 */       else { throw new NullPointerException("order"); }  } else { if (fA01 != null) { if (r12 != fA01) { this
/* 4 */             .h6 = (r1)fA01;
/* 5 */           Mh0(); h2(); }  return; }
/* 6 */        throw new NullPointerException("column"); }  } public gk0 Q2; public mG catch; public JF0(mG parammG, wv paramwv) { gk0 gk01; Ve ve; uL uL; this.h6 = r1.x40; this.ox0 = fA0.tk; this.throws = new u(); this.catch = parammG; this(parammG, paramwv); this.Q2 = new gk0(); jA(this); this(); ek(Un.class, this); this(); ek(Q20.class, this); Xu("/member-table"); Gb0(true); zs0(); Pb0(0); Mh0(); } public final void h2() { this(); ArrayList<ON> arrayList; ON[] arrayOfON2; int i; byte b; for (i = (arrayOfON2 = this.catch.DQ()).length, b = 0; b < i; ) { ON oN = arrayOfON2[b]; u u1; if ((u1 = this.throws) == null || u1.g30(oN)) arrayList.add(oN);  b++; }  Collections.sort(arrayList, this.h6.Xy); if (this.ox0 == fA0.tk) Collections.reverse(arrayList);  ON[] arrayOfON1 = arrayList.<ON>toArray(new ON[0]); gk0 gk01; (gk01 = this.Q2).getClass(); this.Q2.dt = new Q20[arrayOfON1.length]; ON[] arrayOfON3; if ((arrayOfON3 = this.Q2.Iw).length > 0) gk01.in0(arrayOfON3.length);  gk01.Iw = arrayOfON1; gk01.i2(arrayOfON1.length); this.Q2.getClass(); d40(); }
/*   */ 
/*   */   
/*   */   public final void t8(String paramString, boolean paramBoolean) {
/*   */     this.throws.fb = paramBoolean;
/*   */     this.throws.Yi0 = paramString;
/*   */     h2();
/*   */   }
/*   */   
/*   */   public final void Mh0() {
/*   */     int i = this.h6.ordinal();
/*   */     df0(i, this.ox0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */