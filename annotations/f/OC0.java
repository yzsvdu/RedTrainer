/*   1 */ package f;public final class OC0 extends Wr { public final void R60(throws paramthrows) { if (this.Gz + 1000000000L <= System.nanoTime()) { Ip ip; this.Gz = System.nanoTime(); vh0 vh0; if ((vh0 = km.a3) == null) { if ((ip = this.qp)
/*   2 */           .dP)
/*   3 */           wI0(false);  }
/*   4 */       else { KI kI; Jo jo; if ((jo = vh0.Ct) != null && (
/*   5 */           kI = vh0.Jr0()) != null) {
/*   6 */           String str1, str2; DayOfWeek dayOfWeek; Ip ip1; if (!(ip1 = ((OC0)super).qp).dP) ip1
/*   7 */               .wI0(true);  fH0 fH01;
/*   8 */           if ((fH01 = km.u4.Lz) != null) ((OC0)super)
/*   9 */               .Er
/*     */               
/*  11 */               .E1(Ms0.format(fH01.Ii)); 
/*     */           L70 l70;
/*  13 */           int j = (l70 = L70.gq).Rr0();
/*  14 */           int k = L70.gq.Zi0() % 3600 / 60;
/*  15 */           switch (L70.gq.Zi0() % 604800 / 86400) { default:
/*  16 */               dayOfWeek = DayOfWeek.SUNDAY; break;case 6: dayOfWeek = DayOfWeek.SATURDAY; break;case 5: dayOfWeek = DayOfWeek.FRIDAY; break;case 4: dayOfWeek = DayOfWeek.THURSDAY; break;case 3: dayOfWeek = DayOfWeek.WEDNESDAY; break;case 2: dayOfWeek = DayOfWeek.TUESDAY; break;case 1: dayOfWeek = DayOfWeek.MONDAY; break; }  if (j != ((OC0)super)
/*  17 */             .ta || k != ((OC0)super).Ez || dayOfWeek != ((OC0)super).eA0) { Ag ag; ((OC0)super).ta = j; ((OC0)super).Ez = k; ((OC0)super).eA0 = dayOfWeek; this(); if (j < 10) ag
/*  18 */                 .V9("0");  ag
/*     */               
/*  20 */               .V9(String.valueOf(j)); ag.V9(":"); if (k < 10) ag.V9("0");  ag
/*     */               
/*  22 */               .V9(String.valueOf(k));
/*  23 */             arrayOfString[
/*     */ 
/*     */                 
/*  26 */                 0] = dayOfWeek.getDisplayName(TextStyle.FULL, cE.eo0.Dr); String[] arrayOfString; (arrayOfString = new String[2])[1] = ag.toString(); ((OC0)super).hR = Ml0.sB(1155, arrayOfString); }  ((OC0)super)
/*  27 */             .nG0.E1(((OC0)super).hR);
/*     */           int i;
/*  29 */           if ((j = Zk0.yE(i = l70.bV)) != 0) { if (j != 1 && j != 2) { str2 = "label-time-night"; } else { str2 = "label-time-day"; }  } else { str2 = "label-time-morning"; }
/*     */           
/*  31 */           if (!((OC0)super).Yh0.cl.equals(str2))
/*     */           { m7 m71;
/*  33 */             if (!str2.equals((m71 = ((OC0)super).Yh0).cl)) { m71.Xu(str2); m71.cZ(); }  ((OC0)super)
/*  34 */               .Yh0.cZ(); ((OC0)super).Yh0
/*     */               
/*  36 */               .Gq0(Ml0.OH0(qS.MU(i))); ((OC0)super).Yh0
/*  37 */               .jl = 50; }  i = 0;
/*     */           qN qN;
/*  39 */           if ((qN = km.u4.sE) != null && (
/*     */             
/*  41 */             (qN.Pd0 > System.currentTimeMillis() / 1000L))) {
/*  42 */             m7 m71 = ((OC0)super).Qi0[i];
/*     */             String str;
/*  44 */             if (!(str = "label-uptime").equals(m71.cl)) { m71.Xu(str); m71.cZ(); }  ((OC0)super)
/*  45 */               .Qi0[i].wI0(true); ((OC0)super).uh[i].wI0(true); ((OC0)super).uh[i].E1(Ml0.OH0(1150)); ((OC0)super).uh[i]
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  50 */               .Gq0(LF.Ya(km.u4.sE.Pd0 - (int)(System.currentTimeMillis() / 1000L), 2) + " left."); (((OC0)super).uh[i])
/*  51 */               .jl = 500; i = 1;
/*     */           } 
/*     */           short s3;
/*  54 */           if ((s3 = km.u4.Lz.rH0) > 0) {
/*  55 */             m7 m71 = ((OC0)super).Qi0[i];
/*     */             String str;
/*  57 */             if (!(str = "label-repel").equals(m71.cl)) { m71.Xu(str); m71.cZ(); }  ((OC0)super)
/*  58 */               .Qi0[i].wI0(true); ((OC0)super).uh[i].wI0(true); ((OC0)super).uh[i].Gq0(null); ((OC0)super).uh[i].E1(Ml0.Go(1151, s3 + "")); i++;
/*     */           }  fH0 fH02;
/*  60 */           if ((k = (fH02 = km.u4.Lz).fa0) > 0) {
/*     */             int m;
/*  62 */             if ((m = fH02.YN.ordinal()) != 2) { if (m != 3) { m = 16777251; } else { m = 16777277; }  } else { m = 16777253; }  m7 m71 = ((OC0)super).Qi0[i];
/*     */             String str;
/*  64 */             if (!(str = "label-repel").equals(m71.cl)) { m71.Xu(str); m71.cZ(); }  ((OC0)super)
/*  65 */               .Qi0[i].wI0(true); ((OC0)super).uh[i].wI0(true); ((OC0)super).uh[i].Gq0(null); ((OC0)super).uh[i].E1(Ml0.Go(m, k + "")); i++;
/*     */           }  short s2;
/*  67 */           if ((s2 = km.u4.Lz.vv0) > 0) {
/*  68 */             m7 m71 = ((OC0)super).Qi0[i];
/*     */             String str;
/*  70 */             if (!(str = "label-repel").equals(m71.cl)) { m71.Xu(str); m71.cZ(); }  ((OC0)super)
/*  71 */               .Qi0[i].wI0(true); ((OC0)super).uh[i].wI0(true); ((OC0)super).uh[i].Gq0(null); ((OC0)super).uh[i].E1(Ml0.Go(1152, s2 + "")); i++;
/*     */           } 
/*  73 */           j40 j40 = r8.s40(aq0.LI).ky((short)0); R8 r8; Q90 q90; if ((k = (r8 = km.u4).default) > 0 && j40 != null && 
/*     */             
/*  75 */             !(((q90 = j40.Zs).Hq0 < 1) ? 1 : 0) && 
/*  76 */             !q90.YC())
/*  77 */           { String str3; m7 m71 = ((OC0)super).Qi0[i];
/*     */             String str4;
/*  79 */             if (!(str4 = "label-position").equals(m71.cl)) { m71.Xu(str4); m71.cZ(); }  ((OC0)super)
/*  80 */               .Qi0[i].wI0(true); ((OC0)super).uh[i].wI0(true); if (k == 559)
/*     */             
/*  82 */             { str3 = Ml0.Go(k + 211000, Ml0.OH0((j40.rG()).zm0 + 230000)); } else { str3 = Ml0.OH0(k + 211000); }  ((OC0)super).uh[i].Gq0(str3); ((OC0)super).uh[i].E1(Ml0.OH0(k + 210000)); i++; } else { ((OC0)super).uh[i].Gq0(null); }
/*  83 */            short s1; if ((s1 = km.u4.el) > 0)
/*  84 */           { m7 m71 = ((OC0)super).Qi0[i];
/*     */             String str;
/*  86 */             if (!(str = "label-mail").equals(m71.cl)) { m71.Xu(str); m71.cZ(); }  ((OC0)super)
/*  87 */               .Qi0[i].wI0(true); ((OC0)super).uh[i].wI0(true); if (((OC0)super).wi < s1) { (m71 = ((OC0)super).Qi0[i])
/*  88 */                 .wB0 = 500;
/*  89 */               if ((((OC0)super).Qi0[i]).NK0 == null) { I i1; pRn pRn; Ja0 ja0; this((byte)-1, (byte)-1, (byte)-1, (byte)-116);
/*  90 */                 this(m71); this(ja0, pRn);
/*  91 */                 m71.NK0 = i1; }  m71.mQ = true;
/*  92 */               (((OC0)super).Qi0[i])
/*  93 */                 .QH = 12;
/*  94 */               (((OC0)super).Qi0[i]).F = 0;
/*  95 */               km.pm0.bL((byte)2, (short)1631);
/*  96 */               js.vu0
/*     */                 
/*  98 */                 .Pu(-1, Ml0.OH0(5817)); }  ((OC0)super)
/*  99 */               .wi = s1; ((OC0)super).uh[i].E1(Ml0.Go(5825, s1 + "")); i++; }  m7[] arrayOfM7; while (i < (arrayOfM7 = ((OC0)super).Qi0).length) { arrayOfM7[i].wI0(false); ((OC0)super).uh[i].wI0(false); i++; }
/* 100 */            if (km.D70(1)) { ((OC0)super)
/* 101 */               .eD0
/*     */ 
/*     */ 
/*     */               
/* 105 */               .E1(kI.xc0() + " / " + kI.UZ + " Ch. " + (kI.Xw + 1)); ((OC0)super).wm0
/*     */               
/* 107 */               .E1(jo.HW.j2()); Runtime runtime; long l1 = ((runtime = Runtime.getRuntime()).totalMemory() - freeMemory()) / 1048576L, l2 = Runtime.getRuntime().maxMemory() / 1048576L; ((OC0)super).s80
/*     */               
/* 109 */               .E1("" + l1 + " / " + l2 + " MB (" + LF.F6(BufferUtils.Ri0) + " Unsafe)");
/* 110 */             str1 = N.Gl0((new StringBuilder()).append((int)Math.floor(km.wI0.H10 / 3600.0D)).append(" h "), (int)Math.floor((km.wI0.H10 % 3600000.0F) / 1000.0D / 60.0D), " m");
/* 111 */             ((OC0)super).Xy0.E1(this); } else if (kI
/* 112 */             .Xw > -1) { ((OC0)super)
/* 113 */               .eD0
/*     */               
/* 115 */               .E1(kI.xc0() + " Ch. " + (kI.Xw + 1)); } else { ((OC0)super).eD0.E1(kI.xc0()); }
/*     */         
/*     */         }  }
/*     */        }
/*     */      }
/*     */ 
/*     */   
/*     */   public static DecimalFormatSymbols xF = new DecimalFormatSymbols();
/*     */   public static DecimalFormat Ms0 = new DecimalFormat("$###,###.###", xF);
/*     */   public m7 Er;
/*     */   public m7 nG0;
/*     */   public String hR;
/*     */   public int Ez;
/*     */   public int ta;
/*     */   public DayOfWeek eA0;
/*     */   public dQ[] uh;
/*     */   public m7 eD0;
/*     */   public m7 wm0;
/*     */   public m7 s80;
/*     */   public m7 Xy0;
/*     */   public Ip qp;
/*     */   public m7 Yh0;
/*     */   public m7[] Qi0;
/*     */   public int wi;
/*     */   public long Gz;
/*     */   
/*     */   public OC0() {
/*     */     m7 m71;
/*     */     JG0[] arrayOfJG0;
/*     */     m7 m72;
/*     */     m7[] arrayOfM71;
/*     */     Sl sl;
/*     */     dQ[] arrayOfDQ1;
/*     */     m7 m73;
/*     */     dQ[] arrayOfDQ3;
/*     */     m7 m74;
/*     */     this.wi = 0;
/*     */     Xu("trainer-hud");
/*     */     jJ0(false);
/*     */     Zf0(false);
/*     */     EP(1);
/*     */     byte b1 = 6;
/*     */     this.Er = new m7("$0");
/*     */     this.nG0 = new m7("00:00");
/*     */     this.uh = new dQ[b1];
/*     */     dQ[] arrayOfDQ2;
/*     */     for (byte b2 = 0; b2 < (arrayOfDQ2 = this.uh).length; b2++) {
/*     */       m7 m75;
/*     */       this("");
/*     */       arrayOfDQ2[b2] = m75;
/*     */       this.uh[b2].Pb0(150);
/*     */     } 
/*     */     this.eD0 = new m7("");
/*     */     this.wm0 = new m7("");
/*     */     this.s80 = new m7("");
/*     */     this.Xy0 = new m7("");
/*     */     this();
/*     */     (new m7()).Xu("label-money");
/*     */     (this.Yh0 = new m7()).Xu("label-time");
/*     */     this();
/*     */     (new m7()).Xu("label-location");
/*     */     this.Qi0 = new m7[b1];
/*     */     m7[] arrayOfM72;
/*     */     for (byte b3 = 0; b3 < (arrayOfM72 = this.Qi0).length; b3++) {
/*     */       m7 m75;
/*     */       this();
/*     */       arrayOfM72[b3] = m75;
/*     */       this.Qi0[b3].Xu("label-repel");
/*     */     } 
/*     */     this();
/*     */     (new Sl()).Xu("label-position");
/*     */     this();
/*     */     (new m7()).Xu("label-ram");
/*     */     this();
/*     */     (new m7()).Xu("label-uptime");
/*     */     (this.qp = new Ip()).Xu("content");
/*     */     this.qp.Zf0(false);
/*     */     if (km.XU()) {
/*     */       arrayOfJG03[0] = m72;
/*     */       arrayOfJG03[1] = m71;
/*     */       arrayOfJG03[2] = this.Yh0;
/*     */       JG0[] arrayOfJG03;
/*     */       (arrayOfJG03 = new JG0[4])[3] = this.Qi0[0];
/*     */       arrayOfU902[0] = this.qp.AUX(new JG0[4]);
/*     */       arrayOfJG03[0] = this.eD0;
/*     */       arrayOfJG03[1] = this.Er;
/*     */       arrayOfJG03[2] = this.nG0;
/*     */       (arrayOfJG03 = new JG0[4])[3] = this.uh[0];
/*     */       arrayOfU902[1] = this.qp.AUX(new JG0[4]);
/*     */       arrayOfJG03[0] = arrayOfM7[1];
/*     */       arrayOfJG03[1] = arrayOfM7[2];
/*     */       arrayOfJG03[2] = arrayOfM7[3];
/*     */       m7[] arrayOfM7;
/*     */       (arrayOfJG03 = new JG0[4])[3] = (arrayOfM7 = this.Qi0)[4];
/*     */       arrayOfU902[2] = this.qp.AUX(new JG0[4]);
/*     */       arrayOfJG03[0] = arrayOfDQ3[1];
/*     */       arrayOfJG03[1] = arrayOfDQ3[2];
/*     */       arrayOfJG03[2] = arrayOfDQ3[3];
/*     */       (arrayOfJG03 = new JG0[4])[3] = (arrayOfDQ3 = this.uh)[4];
/*     */       U90[] arrayOfU902;
/*     */       (arrayOfU902 = new U90[4])[3] = this.qp.AUX(new JG0[4]);
/*     */       this.qp.rK0(this.qp.d7().cOM8(new U90[4]));
/*     */       arrayOfJG02[0] = m72;
/*     */       arrayOfJG02[1] = this.eD0;
/*     */       arrayOfJG02[2] = this.Qi0[1];
/*     */       JG0[] arrayOfJG02;
/*     */       (arrayOfJG02 = new JG0[4])[3] = this.uh[1];
/*     */       arrayOfU901[0] = this.qp.AUX(new JG0[4]);
/*     */       arrayOfJG01[0] = m71;
/*     */       arrayOfJG01[1] = this.Er;
/*     */       arrayOfJG01[2] = this.Qi0[2];
/*     */       JG0[] arrayOfJG01;
/*     */       (arrayOfJG01 = new JG0[4])[3] = this.uh[2];
/*     */       arrayOfU901[1] = this.qp.AUX(new JG0[4]);
/*     */       arrayOfJG0[0] = this.Yh0;
/*     */       arrayOfJG0[1] = this.nG0;
/*     */       arrayOfJG0[2] = this.Qi0[3];
/*     */       (arrayOfJG0 = new JG0[4])[3] = this.uh[3];
/*     */       arrayOfU901[2] = this.qp.AUX(new JG0[4]);
/*     */       arrayOfJG0[0] = (arrayOfM71 = this.Qi0)[0];
/*     */       arrayOfJG0[1] = arrayOfDQ1[0];
/*     */       arrayOfJG0[2] = arrayOfM71[4];
/*     */       (arrayOfJG0 = new JG0[4])[3] = (arrayOfDQ1 = this.uh)[4];
/*     */       U90[] arrayOfU901;
/*     */       (arrayOfU901 = new U90[4])[3] = this.qp.AUX(new JG0[4]);
/*     */       this.qp.WN(this.qp.d7().cOM8(new U90[4]));
/*     */     } else if (km.a40()) {
/*     */       arrayOfJG01[0] = (JG0)arrayOfM71;
/*     */       arrayOfJG01[1] = (JG0)arrayOfJG0;
/*     */       arrayOfJG01[2] = this.Yh0;
/*     */       arrayOfJG01[3] = arrayOfM7[0];
/*     */       arrayOfJG01[4] = arrayOfM7[1];
/*     */       arrayOfJG01[5] = arrayOfM7[2];
/*     */       arrayOfJG01[6] = arrayOfM7[3];
/*     */       arrayOfJG01[7] = arrayOfM7[4];
/*     */       JG0[] arrayOfJG01;
/*     */       m7[] arrayOfM7;
/*     */       (arrayOfJG01 = new JG0[12])[8] = (arrayOfM7 = this.Qi0)[5];
/*     */       (new U90[2])[0] = this.qp.AUX(new JG0[] { 
/*     */             null, null, null, null, null, null, null, null, null, (JG0)arrayOfDQ1, 
/*     */             (JG0)arrayOfDQ3, m74 });
/*     */       arrayOfJG01[0] = this.eD0;
/*     */       arrayOfJG01[1] = this.Er;
/*     */       arrayOfJG01[2] = this.nG0;
/*     */       arrayOfJG01[3] = arrayOfDQ[0];
/*     */       arrayOfJG01[4] = arrayOfDQ[1];
/*     */       arrayOfJG01[5] = arrayOfDQ[2];
/*     */       arrayOfJG01[6] = arrayOfDQ[3];
/*     */       arrayOfJG01[7] = arrayOfDQ[4];
/*     */       dQ[] arrayOfDQ;
/*     */       arrayOfJG01[8] = (arrayOfDQ = this.uh)[5];
/*     */       arrayOfJG01[9] = this.wm0;
/*     */       arrayOfJG01[10] = this.s80;
/*     */       (arrayOfJG01 = new JG0[12])[11] = this.Xy0;
/*     */       this.qp.rK0(this.qp.d7().cOM8(new U90[] { null, this.qp.AUX(new JG0[12]) }));
/*     */       arrayOfU90[0] = this.qp.AUX(new JG0[] { (JG0)arrayOfM71, this.eD0 });
/*     */       arrayOfU90[1] = this.qp.AUX(new JG0[] { (JG0)arrayOfJG0, this.Er });
/*     */       arrayOfU90[2] = this.qp.AUX(new JG0[] { this.Yh0, this.nG0 });
/*     */       arrayOfU90[3] = this.qp.AUX(new JG0[] { this.Qi0[0], this.uh[0] });
/*     */       arrayOfU90[4] = this.qp.AUX(new JG0[] { this.Qi0[1], this.uh[1] });
/*     */       arrayOfU90[5] = this.qp.AUX(new JG0[] { this.Qi0[2], this.uh[2] });
/*     */       arrayOfU90[6] = this.qp.AUX(new JG0[] { this.Qi0[3], this.uh[3] });
/*     */       arrayOfU90[7] = this.qp.AUX(new JG0[] { this.Qi0[4], this.uh[4] });
/*     */       arrayOfU90[8] = this.qp.AUX(new JG0[] { this.Qi0[5], this.uh[5] });
/*     */       arrayOfU90[9] = this.qp.AUX(new JG0[] { (JG0)arrayOfDQ1, this.wm0 });
/*     */       arrayOfU90[10] = this.qp.AUX(new JG0[] { (JG0)arrayOfDQ3, this.s80 });
/*     */       U90[] arrayOfU90;
/*     */       (arrayOfU90 = new U90[12])[11] = this.qp.AUX(new JG0[] { m74, this.Xy0 });
/*     */       this.qp.WN(this.qp.d7().cOM8(new U90[12]));
/*     */     } else {
/*     */       arrayOfJG01[0] = (JG0)arrayOfM71;
/*     */       arrayOfJG01[1] = (JG0)arrayOfJG0;
/*     */       arrayOfJG01[2] = this.Yh0;
/*     */       arrayOfJG01[3] = arrayOfM7[0];
/*     */       arrayOfJG01[4] = arrayOfM7[1];
/*     */       arrayOfJG01[5] = arrayOfM7[2];
/*     */       arrayOfJG01[6] = arrayOfM7[3];
/*     */       arrayOfJG01[7] = arrayOfM7[4];
/*     */       JG0[] arrayOfJG01;
/*     */       m7[] arrayOfM7;
/*     */       (arrayOfJG01 = new JG0[9])[8] = (arrayOfM7 = this.Qi0)[5];
/*     */       (new U90[2])[0] = this.qp.AUX(new JG0[9]);
/*     */       arrayOfJG01[0] = this.eD0;
/*     */       arrayOfJG01[1] = this.Er;
/*     */       arrayOfJG01[2] = this.nG0;
/*     */       arrayOfJG01[3] = arrayOfDQ[0];
/*     */       arrayOfJG01[4] = arrayOfDQ[1];
/*     */       arrayOfJG01[5] = arrayOfDQ[2];
/*     */       arrayOfJG01[6] = arrayOfDQ[3];
/*     */       arrayOfJG01[7] = arrayOfDQ[4];
/*     */       dQ[] arrayOfDQ;
/*     */       (arrayOfJG01 = new JG0[9])[8] = (arrayOfDQ = this.uh)[5];
/*     */       this.qp.rK0(this.qp.d7().cOM8(new U90[] { null, this.qp.AUX(new JG0[9]) }));
/*     */       arrayOfU90[0] = this.qp.AUX(new JG0[] { (JG0)arrayOfM71, this.eD0 });
/*     */       arrayOfU90[1] = this.qp.AUX(new JG0[] { (JG0)arrayOfJG0, this.Er });
/*     */       arrayOfU90[2] = this.qp.AUX(new JG0[] { this.Yh0, this.nG0 });
/*     */       arrayOfU90[3] = this.qp.AUX(new JG0[] { this.Qi0[0], this.uh[0] });
/*     */       arrayOfU90[4] = this.qp.AUX(new JG0[] { this.Qi0[1], this.uh[1] });
/*     */       arrayOfU90[5] = this.qp.AUX(new JG0[] { this.Qi0[2], this.uh[2] });
/*     */       arrayOfU90[6] = this.qp.AUX(new JG0[] { this.Qi0[3], this.uh[3] });
/*     */       arrayOfU90[7] = this.qp.AUX(new JG0[] { this.Qi0[4], this.uh[4] });
/*     */       U90[] arrayOfU90;
/*     */       (arrayOfU90 = new U90[9])[8] = this.qp.AUX(new JG0[] { this.Qi0[5], this.uh[5] });
/*     */       this.qp.WN(this.qp.d7().cOM8(new U90[9]));
/*     */     } 
/*     */     this.qp.wI0(false);
/*     */     J8(this.qp);
/*     */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */