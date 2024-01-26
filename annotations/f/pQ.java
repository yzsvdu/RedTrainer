/*  1 */ package f;public final class pQ extends so0 { public final void R60(throws paramthrows) { dQ dQ1; int i; Dn0 dn02; byte b; dQ[] arrayOfDQ; if ((arrayOfDQ = this.nl).length > 0) { dQ1 = arrayOfDQ[arrayOfDQ.length - 1]; } else if ((arrayOfDQ = this.JY).length > 0) { dQ1 = arrayOfDQ[arrayOfDQ.length - 1]; } else { dQ1 = this.ks0; }  if (dQ1.fr0 == null)
/*  2 */     { if (km.XU()) { i = 40; } else { i = -10; }  }
/*  3 */     else { int j = i.er0 - this.er0;
/*  4 */       if (i.dP)
/*  5 */       { i = i.HC - 10 + j; } else { i = j; }  }
/*  6 */      if (km.XU()) { if ((dn02 = this.UF)
/*  7 */         .Ng0 == 
/*  8 */         lPT9.U4) { b = 0; } else { b = 80; }  i -= 50; } else { if ((dn02 = this.UF)
/*  9 */         .Ng0 == 
/* 10 */         lPT9.U4) { b = 0; } else { b = 80; }  i -= 10; }  dn02
/* 11 */       .Uq = b;
/* 12 */     dn02.Z1 = i; Dn0 dn01;
/* 13 */     if ((dn01 = this.UF)
/* 14 */       .Ng0 != 
/* 15 */       lPT9.jR) { nUl(); } else { vh0 vh0; if ((vh0 = km.a3) == null)
/* 16 */         return;  Jo jo; if ((jo = vh0.Ct) == null)
/* 17 */         return;  byte b1 = jo.Eh0;
/* 18 */       int j = this.Uq, k = this.Z1;
/* 19 */       FD0(b1, j, k); }
/*    */      }
/*    */ 
/*    */   
/*    */   public static final dQ[] cO = new dQ[0];
/*    */   public final dQ ks0;
/*    */   public vF0[] Xp;
/*    */   public dQ[] JY;
/*    */   public dQ[] nl;
/*    */   
/*    */   public pQ(LPT3 paramLPT3, byte paramByte, boolean paramBoolean1, boolean paramBoolean2, String paramString) {
/*    */     super(paramLPT3.Pd0().bk0(), paramLPT3.Pd0().Zj());
/*    */     Zz0 zz0;
/*    */     dQ dQ1;
/*    */     this.nl = cO;
/*    */     Xu("tooltip-preview-widget");
/*    */     this();
/*    */     this.ms0 = new Zz0();
/*    */     J8(zz0);
/*    */     this(paramLPT3.UQ(paramByte));
/*    */     this.ks0 = new dQ();
/*    */     if (paramBoolean2) {
/*    */       JG0[] arrayOfJG0;
/*    */       (arrayOfJG0 = new JG0[1])[0] = dQ1;
/*    */       zz0.of0(arrayOfJG0);
/*    */     } 
/*    */     dQ1.wI0(paramBoolean2);
/*    */     if (!paramString.isEmpty())
/*    */       dQ1.E1(dQ1.Xy() + paramString); 
/*    */     this.UF.PQ(paramByte);
/*    */     this.Xp = vC0.Tn(paramLPT3);
/*    */     this.JY = vC0.ee0(paramLPT3);
/*    */     vF0[] arrayOfVF0;
/*    */     for (paramByte = 0; paramByte < (arrayOfVF0 = this.Xp).length; paramByte++) {
/*    */       zz0.of0(new JG0[] { arrayOfVF0[paramByte], this.JY[paramByte] });
/*    */       if (!paramBoolean1)
/*    */         this.JY[paramByte].Xu("label-normal"); 
/*    */     } 
/*    */     if (km.D70(9)) {
/*    */       dQ dQ2;
/*    */       this(paramLPT3.Pd0().bk0() + " " + paramLPT3.Pd0().Zj() + "(DEV DEBUG)");
/*    */       (new dQ()).Xu("label-alt");
/*    */       zz0.of0(new JG0[] { dQ2 });
/*    */     } 
/*    */     StringBuilder stringBuilder;
/*    */     if (paramBoolean1 && (stringBuilder = rG0.iw(paramLPT3)).length() > 0) {
/*    */       String[] arrayOfString;
/*    */       this.nl = new dQ[(arrayOfString = stringBuilder.toString().trim().split("\\n")).length];
/*    */       for (paramByte = 0; paramByte < arrayOfString.length; paramByte++) {
/*    */         dQ dQ2;
/*    */         this(arrayOfString[paramByte].trim());
/*    */         this.nl[paramByte] = dQ2;
/*    */         zz0.of0(new JG0[] { this.nl[paramByte] });
/*    */       } 
/*    */     } 
/*    */     zz0.xh().l9(120);
/*    */   }
/*    */   
/*    */   public final void XX(dS paramdS) {
/*    */     super.XX(paramdS);
/*    */     d40();
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     this.ms0.mM();
/*    */     mM();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */