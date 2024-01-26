/* 1 */ package f;public final class CS extends Wv0 { public final void Yi(qa0[] paramArrayOfqa0) { this(); ArrayList<qa0> arrayList; int i; byte b; for (i = paramArrayOfqa0.length, b = 0; b < i; ) { arrayList.add(paramArrayOfqa0[b]); b++; }  Collections.sort(arrayList, this.aD.KN); if (this.uu == fA0.tk) Collections.reverse(arrayList);  paramArrayOfqa0 = arrayList.<qa0>toArray(new qa0[0]); n0 n01; qa0[] arrayOfQa0; if ((arrayOfQa0 = (n01 = this.ig).pG).length > 
/* 2 */       0)
/* 3 */       in0(arrayOfQa0.length);  this.FD = new Un[paramArrayOfqa0.length]; this.pG = paramArrayOfqa0;
/*   */     
/* 5 */     i2(paramArrayOfqa0.length); }
/*   */ 
/*   */   
/*   */   public At0 aD;
/*   */   public fA0 uu;
/*   */   public n0 ig;
/*   */   public ep Ri0;
/*   */   
/*   */   public CS(ep paramep, boolean paramBoolean) {
/*   */     Ve ve;
/*   */     uL uL;
/*   */     Xc xc;
/*   */     n0 n01;
/*   */     this.aD = At0.zi;
/*   */     F70 f70 = fA0.tk;
/*   */     Xu("/tournament-table");
/*   */     this(this);
/*   */     this.ig = new n0();
/*   */     this.Ri0 = paramep;
/*   */     if (!paramBoolean)
/*   */       xc = fA0.pz; 
/*   */     this.uu = xc;
/*   */     jA(n01);
/*   */     this();
/*   */     ek(Un.class, this);
/*   */     this();
/*   */     ek(Q20.class, this);
/*   */     Gb0(true);
/*   */     zs0();
/*   */     Pb0(0);
/*   */     gb();
/*   */   }
/*   */   
/*   */   public final void Ki(int paramInt) {
/*   */     super.Ki(paramInt);
/*   */   }
/*   */   
/*   */   public final void gb() {
/*   */     int i = this.aD.ordinal();
/*   */     df0(i, this.uu);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */