/*   1 */ package f;public final class x10 implements Runnable { public x10(Wx paramWx) {} public static void ja0() { is is; x6 x6; int i; if ((is = km.SE0) != null && (x6 = is.rQ) != null && ((i = is.qf0) == 15 || i == 16)) { mR mR; String str1 = is.nf0, str2 = is.V80; boolean bool = is.Pz0; nt nt = is.GA; this(str1, str2, true, bool, nt); x6.Ab0(mR); }  } private void Jq() { is is; int i; byte[] arrayOfByte; if ((is = km.SE0) != null && (((i = is.zL0) > 0 && (
/*   2 */       arrayOfByte = is.EM) != null && arrayOfByte.length > 0)))
/*     */     
/*   4 */     { byte[] arrayOfByte1 = is.EM;
/*     */       
/*   6 */       this.Dv0.DM(is.il0, i, this); }  } private void C2() { is is1, is2; (is2 = km.SE0).getClass(); P10 p10 = is2.mp0; int i = is2.Ge; byte[] arrayOfByte = is2.Sj; (new R8(p10, i, arrayOfByte)).YG0 = this.Dv0.Ja; if (!sh0.Ep0(km.u4 = new R8(p10, i, arrayOfByte)) || km.u4
/*   7 */       .e20 == null)
/*     */     
/*     */     { 
/*  10 */       byte[] arrayOfByte1 = new byte[0]; byte b = -1; final final = final.dy; km.SE0
/*     */         
/*  12 */         .Ge = b; km.SE0.Sj = arrayOfByte1; if (km.SE0.qf0 == 11) if (final == final.st0) { this.qf0 = 12; ni0(); } else { this.qf0 = 13; }   int j; if (((j = this.qf0) == 12 || j == 14) && final != final.st0) this.qf0 = 13;  return; }  Wx wx; (wx = ((x10)super).Dv0).Ja.jf0(wx); km.u4.YG0 = ((x10)super).Dv0.Ja; km.SE0.ni0(); km.SE0 = null; UB0.Kg0.fN(this::hM); } public final void run() { SP sP; int i; is is; if ((is = km.SE0) == null) { i = 1; } else { i = i.qf0; }  Wx wx2; if ((wx2 = this.Dv0).UF != i) { vl vl; String str1; final final1; A1 a1; Wx wx; int j; is is1; boolean bool; Runnable runnable; is is3; int k; LI lI; is is2; P10[] arrayOfP10; final final2; dQ dQ1; Un un1; String str2; dQ dQ2; int m; String str3; dQ dQ3; byte b; String str4; Ip ip; U90 u901; cr0 cr0; U90 u902, u903, u904; wx2.UF = i; switch (Zk0.yE(i)) { case 16:
/*  13 */           this.Dv0.Q70.CQ(false); this.Dv0.bd0.CQ(false); this.Dv0.hh.wI0(false); if (!(vl = this.Dv0.c).dP) { vl.ID.Be0("", false); vl.ID.sk0(true); vl.yn0.sk0(true); is is4; if ((is4 = km.SE0) != null) { vl.Wj.Be0(is4.q5, false); byte b1; if ((b1 = km.SE0.Ta) == 0) { vl.X9.E1(Ml0.OH0(1034)); } else if (b1 == 2) { vl.X9.E1(Ml0.OH0(1038)); } else { vl.PN.gx(); U90 u905 = vl.PN.AUX(new JG0[] { vl.jo }), u906 = vl.PN.AUX(new JG0[] { vl.Wj }); vl.PN.rK0(Mr.X60(vl.PN, vl.PN).ee0(vl.PN.vo0(new JG0[] { vl.X9 })).ee0(vl.PN.Gs(new U90[] { u905, u906 })).ee0(vl.PN.vo0(new JG0[] { vl.WG }))); vl.PN
/*     */                   
/*  15 */                   .WN(V2.Ur(vl.PN, vl.PN).ee0(vl.PN.AUX(new JG0[] { vl.X9 })).tA(20, 20, 20).ee0(vl.PN.AUX(new JG0[] { vl.jo, vl.Wj })).ee0(vl.PN.AUX(new JG0[] { vl.WG }))); vl.X9.E1(Ml0.OH0(1037)); }  }
/*  16 */              this.Dv0.c.wI0(true); }  break;case 14: km.SE0
/*  17 */             .qf0 = 16;
/*  18 */           str1 = Ml0.OH0(2020); runnable = this::Jq; this.Dv0.Ja.uh((new h70(str1, runnable, this.Dv0.HB)).Id(x10::ja0)); break;case 12: this.Dv0.Ja.So0(false);
/*  19 */           A1.L7
/*  20 */             .ac0(() -> this.Dv0.M5(true), 3000L); this.Dv0.HB.s6(Ml0.OH0(1000)); this.Dv0.Q70.CQ(false);
/*  21 */           final1 = km.SE0.G9;
/*  22 */           km.SE0.ni0(); km.SE0 = null; this.Dv0.Ja
/*     */ 
/*     */             
/*  25 */             .Pu(-1, Ml0.OH0(final1.HD0)); break;
/*  26 */         case 11: this.Dv0.Q70.CQ(false); this.Dv0.Ja.So0(true); km.SE0
/*  27 */             .qf0 = 14;
/*  28 */           a1 = A1.L7;
/*  29 */           a1
/*  30 */             .nc
/*  31 */             .execute(this::C2); break;
/*  32 */         case 9: wx = this.Dv0;
/*     */           
/*  34 */           k = is3.Kt0;
/*  35 */           wx.Sd0
/*  36 */             .gx(); str2 = Ml0.OH0(1010);
/*  37 */           this(); (new dQ()).E1(str2);
/*  38 */           str3 = Ml0.OH0(1011);
/*  39 */           this(); (new dQ()).E1(str3);
/*  40 */           str4 = Ml0.OH0(1012);
/*  41 */           this(); (new dQ()).E1(str4);
/*  42 */           (ip = wx.Sd0).getClass();
/*     */           
/*  44 */           u901 = (new cr0(ip)).Em0();
/*     */ 
/*     */ 
/*     */           
/*  48 */           u902 = Mr.X60(wx.Sd0, wx.Sd0).Mg(new JG0[] { dQ1 });
/*     */           
/*  50 */           u903 = Mr.X60(wx.Sd0, wx.Sd0).Mg(new JG0[] { dQ2 });
/*     */           
/*  52 */           u904 = Mr.X60(wx.Sd0, wx.Sd0).Mg(new JG0[] { dQ3 }); (cr0 = V2.Ur(wx.Sd0, wx.Sd0)).ee0(wx.Sd0.AUX(new JG0[] { dQ1, dQ2, dQ3 })); for (dQ1 = null, m = (arrayOfP10 = (is3 = km.SE0).N30).length, b = 0; b < m; )
/*     */           { P10 p10;
/*  54 */             if (!"PTS".equalsIgnoreCase((p10 = arrayOfP10[b]).gw0)) { Un un2; dQ dQ4; String str6; this(Ml0.OH0(1000));
/*  55 */               String str5 = p10.gw0;
/*  56 */               this(); (new dQ()).E1(str5);
/*  57 */               dQ dQ5 = new dQ();
/*  58 */               if (!p10.hj0) { str6 = Ml0.OH0(1021); }
/*  59 */               else { int n; int i1; if ((n = p10.Lq) > (
/*  60 */                   i1 = p10.rt0) * 0.5D)
/*  61 */                 { str6 = Ml0.OH0(1022); } else if (str6 >= i1) { str6 = Ml0.OH0(1023); } else { str6 = Ml0.OH0(1020); }  }
/*  62 */                this(); dQ5.E1(str6);
/*  63 */               u902.Ya(dQ4); u903.Ya(dQ5); u904.Ya(un2); cr0.ee0(wx.Sd0.AUX(new JG0[] { dQ4, dQ5, un2 })); un2.tW(new vm0(wx, p10));
/*  64 */               if (p10.FJ0 == k) un1 = un2;  }  b++; }  u901
/*  65 */             .ee0(u902).ee0(u903).ee0(u904); u901.Em0(); wx.Sd0.rK0(u901); wx.Sd0.WN(cr0);
/*  66 */           this.Dv0.Q70.wI0(true); this.Dv0.hh.wI0(false); this.Dv0.bd0.CQ(false); this.Dv0.c.CQ(false); j = this.Dv0.Ja.e3(); k = this.Dv0.Ja.Hy(); this.Dv0.Q70
/*     */ 
/*     */ 
/*     */             
/*  70 */             .ME(km.wI0.dG(), JO.Se0(k, this.Dv0.Q70.HC, 2, j)); if (un1 != null)
/*  71 */           { VA0.c90(un1); if (Fl0.NM)
/*     */             {
/*     */               
/*  74 */               hm.Fz0(un1.TG0.oh0); }  }  break;
/*  75 */         case 8: this.Dv0.Q70.CQ(false); this.Dv0.bd0.CQ(false); this.Dv0.hh.wI0(false); this.Dv0.c.CQ(false); break;case 7: if ((is1 = km.SE0) == null || is1
/*  76 */             .qC < 1)
/*     */           
/*     */           { 
/*     */ 
/*     */             
/*  81 */             this(); js.vu0.DJ("Error loading ToS.\n\nPlease seek support.", this); return; }  ((x10)super).Dv0.bc.Oh(is1.X40); ((x10)super).Dv0.Q70.CQ(false); ((x10)super).Dv0.bd0.CQ(false); ((x10)super).Dv0.hh.wI0(true); ((x10)super).Dv0.c.CQ(false); break;case 2: ((x10)super).Dv0.M5(false); ((x10)super).Dv0.HB.s6(Ml0.OH0(1003)); break;case 1: case 6: bool = false;
/*  82 */           if ((lI = km.SE0.N2) != null) {
/*  83 */             int n; if ((n = lI.ey().ordinal()) != 1) { if (n == 2) { StringBuilder stringBuilder; this(); ((x10)super).Dv0.Ja
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*  88 */                   .DJ(pv.X9(2013, stringBuilder, " (").append(final.bd0.AK).append(")").toString(), null); boolean bool1 = true; }
/*     */                }
/*  90 */             else { wQ wQ; if ((wQ = Ml0.y0(lI.A60)) == wQ.Dh0) { ((x10)super).Dv0.Ja
/*     */ 
/*     */                   
/*  93 */                   .DJ(Ml0.OH0(wQ.e80), null); bool = true; }
/*     */               else
/*  95 */               { js js; V00 v00; if ((v00 = (js = ((x10)super).Dv0.Ja).tj) != null) v00
/*  96 */                     .ra0();  this(js, lI, bool); js.tj = new V00(); js
/*  97 */                   .si(v00, js.Ub());
/*  98 */                 js.Af(js.tj); bool = true; }  }
/*     */           
/* 100 */           }  final2 = (is2 = km.SE0).G9; if (!bool) if (i == 7)
/*     */             
/* 102 */             { String str = LF.Ya(is2.pf, 2);
/* 103 */               ((x10)super).Dv0.Ja
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 109 */                 .Pu(-1, Ml0.Go(final2.HD0, str) + " (" + km.SE0.G9.AK + ")"); }
/* 110 */             else if (km.E == null) { ((x10)super).Dv0.Ja
/*     */ 
/*     */                 
/* 113 */                 .Pu(-1, Ml0.OH0(final.To.HD0)); }
/* 114 */             else { ((x10)super).Dv0.Ja
/*     */ 
/*     */                 
/* 117 */                 .Pu(-1, Ml0.OH0(final.const.HD0)); }   if (final2 == 
/* 118 */             final.IF)
/* 119 */           { A1.L7
/* 120 */               .ac0(() -> this.Dv0.M5(true), 3000L); } else { ((x10)super).Dv0.M5(true); }  ((x10)super).Dv0.HB.s6(Ml0.OH0(1000)); if (!bool) { Wx wx3; (wx3 = ((x10)super).Dv0).getClass();
/* 121 */             if (km.XU() || wx3.GE0) { VA0.c90(wx3.HB); } else { VA0.c90(wx3.sB0); }  }
/* 122 */            km.SE0.ni0(); km.SE0 = null; ((x10)super).Dv0.Q70.CQ(false); ((x10)super).Dv0.c.CQ(false); ((x10)super).Dv0.hh.wI0(false); break;case 0: ((x10)super).Dv0.bd0.wI0(true); ((x10)super).Dv0.c.CQ(false); fl0.jg0(); break; }  }  Ja ja; Wx wx1; Un un; if (i == 8 && 
/* 123 */       !(un = (wx1 = ((x10)super).Dv0).xU).kN && 
/*     */       
/* 125 */       (ja = this.ZV.PB)
/* 126 */       .Ny0 == this
/* 127 */       .sy) un
/* 128 */         .sk0(true);  }
/*     */ 
/*     */   
/*     */   private void hM() {
/*     */     this.Dv0.sB0.Be0("", false);
/*     */     this.Dv0.nI0.Be0("", false);
/*     */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/x10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */