/*   */ package f;public final class Gz extends Wr implements r60 { public final boolean i2(oa0 paramoa0) {
/* 2 */     if (B8.Wm0(paramoa0.cz0) && paramoa0
/* 3 */       .oO())
/*   */     { int i;
/* 5 */       if (h1.J20(i = paramoa0.GG0, BM.Oq)) { this.SG.E00(-1); return true; }  if (h1.J20(i, BM.M8)) { this.SG.E00(1); return true; }  if (h1.J20(i, BM.lc)) { this.us.h(); return true; }  }  return super.i2(paramoa0);
/*   */   }
/*   */   
/*   */   public static final SimpleDateFormat yK = new SimpleDateFormat("dd/MM/yyyy hh:mm a z");
/*   */   public final pA us;
/*   */   public final Vq0 SG;
/*   */   public final Ip oK0;
/*   */   public final Ip[] e00;
/*   */   
/*   */   public Gz(pA parampA, int paramInt, ZC0[] paramArrayOfZC0) {
/*   */     this.us = parampA;
/*   */     Xu("mm-stats-window");
/*   */     Lo("");
/*   */     EP(1);
/*   */     TG0(parampA::h);
/*   */     this();
/*   */     this.SG = vq0;
/*   */     Vq0 vq0;
/*   */     (vq0 = new Vq0()).T1(false);
/*   */     this();
/*   */     this.oK0 = ip;
/*   */     Ip ip;
/*   */     (new Ip()).rK0((ip = new Ip()).mE0().cOM8(new U90[] { ip.d7().Aq(10).Mg(new JG0[] { vq0 }) }));
/*   */     (new Ip()).WN((new Ip()).d7().cOM8(new U90[] { ip.mE0().Mg(new JG0[] { vq0 }) }));
/*   */     this.e00 = new Ip[paramArrayOfZC0.length];
/*   */     for (byte b = 0; b < paramArrayOfZC0.length; b++) {
/*   */       rS rS;
/*   */       dQ dQ1;
/*   */       Ip ip1;
/*   */       Ip ip2;
/*   */       ArrayList arrayList;
/*   */       dQ dQ3;
/*   */       dQ dQ4;
/*   */       dQ dQ5;
/*   */       String str5;
/*   */       this();
/*   */       (new rS()).Xu("stats");
/*   */       this(Ml0.Go(5650, yK.format(Long.valueOf(paramInt * 1000L))));
/*   */       this();
/*   */       this.e00[b] = ip2;
/*   */       this.e00[b].rK0(this.e00[b].AUX(new JG0[] { rS, dQ1 }));
/*   */       this.e00[b].WN(this.e00[b].vo0(new JG0[] { rS, dQ1 }));
/*   */       this();
/*   */       (new Ip()).rK0((new Ip()).mE0());
/*   */       (new Ip()).WN((new Ip()).d7());
/*   */       String str1 = Ml0.OH0(12003);
/*   */       String str2 = null;
/*   */       String str3 = null;
/*   */       boolean bool = false;
/*   */       ZC0 zC0;
/*   */       switch ((zC0 = paramArrayOfZC0[b]).WZ()) {
/*   */         case 16:
/*   */           str1 = Ml0.OH0(12005);
/*   */           str3 = Ml0.OH0(12009);
/*   */           bool = true;
/*   */           break;
/*   */         case 15:
/*   */           str1 = Ml0.OH0(12007);
/*   */           bool = true;
/*   */           break;
/*   */         case 14:
/*   */           str2 = Ml0.OH0(12004);
/*   */           break;
/*   */         case 12:
/*   */           str1 = Ml0.OH0(12008);
/*   */           str3 = Ml0.OH0(12010);
/*   */           break;
/*   */         case 11:
/*   */           bool = true;
/*   */           break;
/*   */       } 
/*   */       String str4 = Ml0.OH0(zC0.JE0() + 5540) + " - " + Ml0.OH0(zC0.cX() + 5571);
/*   */       if (bool)
/*   */         str4 = Ml0.OH0(zC0.cX() + 5571); 
/*   */       if (b == 0 || paramArrayOfZC0.length < 3)
/*   */         str4 = UH0.ce0(zC0.WZ()) + " " + str4; 
/*   */       this(Ml0.OH0(5663));
/*   */       this(Ml0.OH0(9155));
/*   */       this(str1);
/*   */       dQ dQ2 = new dQ();
/*   */       if (str2 == null) {
/*   */         str5 = str3;
/*   */       } else {
/*   */         str5 = str2;
/*   */       } 
/*   */       this(str5);
/*   */       dQ3.Xu("label-title-smallest");
/*   */       dQ4.Xu("label-title");
/*   */       dQ5.Xu("label-turn");
/*   */       dQ2.Xu("label-title-small2");
/*   */       ip1.iJ0().ee0(ip1.d7().Mg(new JG0[] { dQ3, dQ4, dQ5, dQ2 }));
/*   */       ip1.xh().ee0(ip1.mE0().Mg(new JG0[] { dQ3, dQ4, dQ5, dQ2 }));
/*   */       this(Arrays.asList((E[])zC0.Com4()));
/*   */       for (Sm0 sm0 : new ArrayList()) {
/*   */         dQ dQ6;
/*   */         dQ dQ7;
/*   */         this(sm0.I6() + "");
/*   */         this(sm0.Hg0());
/*   */         this(sm0.nD() + "");
/*   */         this("");
/*   */         if (str2 != null)
/*   */           dQ7.E1(sm0.I4() + ""); 
/*   */         if (str3 != null)
/*   */           dQ7.E1(sm0.lc() + ""); 
/*   */         dQ4.Xu("label-value-smallest");
/*   */         dQ5.Xu("label-name-value");
/*   */         dQ6.Xu("label-turn-value");
/*   */         dQ7.Xu("label-value-small2");
/*   */         ip1.iJ0().ee0(ip1.d7().Mg(new JG0[] { dQ4, dQ5, dQ6, dQ7 }));
/*   */         ip1.xh().ee0(ip1.mE0().Mg(new JG0[] { dQ4, dQ5, dQ6, dQ7 }));
/*   */       } 
/*   */       if (arrayList.isEmpty()) {
/*   */         dQ dQ6;
/*   */         dQ dQ7;
/*   */         dQ dQ8;
/*   */         dQ dQ9;
/*   */         this("-");
/*   */         this(Ml0.OH0(77));
/*   */         this("-");
/*   */         this("");
/*   */         if (str2 != null)
/*   */           dQ9.E1("-"); 
/*   */         dQ6.Xu("label-value-smallest");
/*   */         dQ7.Xu("label-name");
/*   */         dQ8.Xu("label-turn-value");
/*   */         dQ9.Xu("label-value-small2");
/*   */         ip1.iJ0().ee0(ip1.d7().Mg(new JG0[] { dQ6, dQ7, dQ8, dQ9 }));
/*   */         ip1.xh().ee0(ip1.mE0().Mg(new JG0[] { dQ6, dQ7, dQ8, dQ9 }));
/*   */       } 
/*   */       rS.Gz0(ip1);
/*   */       this.SG.WS(this.e00[b], str4);
/*   */     } 
/*   */     J8(this.oK0);
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     uh0(670, 500);
/*   */     this.SG.uh0(670, 500);
/*   */     super.d40();
/*   */   }
/*   */   
/*   */   public final void LM(throws paramthrows) {
/*   */     VA0.c90(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */