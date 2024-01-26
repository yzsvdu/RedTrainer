/*     */ package f;public final class gD extends HI { public static String[] o9 = new String[] { "CPU" }; public Fg0 y7; public Jj EI0; public oD Do; public bu0[] K20 = new bu0[0]; public final void dy0() { T7 t7;
/*   2 */     if ((t7 = this.TI.B8("/graphic/trainer_case.narc")) == null) {
/*     */       
/*   4 */       Rc rc = gD::x50;
/*     */       
/*   6 */       iterator = this.TI.Rh.values().iterator(); while (true) { if (iterator.hasNext()) { T7 t71; if (Wx(t71 = iterator.next())) { T7 t72 = t71; break; }  continue; }  iterator = null; break; } 
/*   7 */     }  this((T7)iterator); ig ig; Iterator<T7> iterator;
/*     */     LD lD;
/*   9 */     this(zz(44), false); for (byte b = 0; b < 8; ) { byte b1; if (b != 2) { if (b != 3) { if (b != 4) { b1 = b; } else { b1 = 2; }  } else { b1 = 4; }  } else { b1 = 3; }
/*  10 */        zh0 zh0 = (new U70(new tS(b, lD, this))).Ql0(); byte b2 = 3; (h90.Kw0())
/*  11 */         .WY[b2][
/*  12 */           b1] = zh0; b++; }
/*     */      }
/*  14 */   public h30 fm = new h30(); public qw0 sk = new qw0(); public U70 wU; public U70[][] i0; public U70[] ls; public gD(RD0 paramRD0) { super(paramRD0, false, o9); } public final void BL() { F40 f402; YK0 yK02 = Ft0(f402 = F40.wI); Ml0.gK[3][f401.DX] = yK01; Ml0.gK[3][f402.DX] = yK02; String[] arrayOfString = Ml0.EH0; Ml0.nW.A3(250003, Ml0.tG((byte)3, f401, 435, 6, arrayOfString)); F40 f401; YK0 yK01; Ml0.rW(138000, (yK01 = Ft0(f401 = F40.ef0)).Rv(391)); Ml0.rW(248000, Ft0(f401 = F40.ef0).Rv(392)); Ml0.rW(190360, Ft0(f401 = F40.ef0).Rv(619)); Ml0.rW(143000, Ft0(f401 = F40.ef0).Rv(433)); Ml0.nW.A3(1754, Ml0.mz0(Ml0.OH0(245328), "??", "[0-9０-９,]{2,10}")); Of of; (of = Of.eH).getClass(); E80.Mx0(); int i;
/*     */     HI hI;
/*     */     ByteBuffer byteBuffer;
/*     */     int j;
/*  18 */     if ((i = Fq.cL0(byteBuffer = (hI = (this.TI.B8("/itemtool/itemdata/pl_item_data.narc")).bP).GA0(), t7.XL)) == (j = 1129464142))
/*  19 */     { i = u80.Lx0(byteBuffer);
/*     */       
/*  21 */       int k = wd.TG0(j = byteBuffer.getInt(), 8, byteBuffer.position(), byteBuffer); int m;
/*  22 */       for (k = byteBuffer.position() + k, m = 0; m < j; )
/*  23 */       { LPT3 lPT3; this(); b = (short)(m + 8000); if (m >= 113) b = (short)(b + 22); 
/*  24 */         int n, i1 = byteBuffer.getInt(i + 12 + (n = m * 8));
/*  25 */         n = i1 + k; i1 = Df0.iy0(i + 12, 4, n, byteBuffer) - i1;
/*  26 */         String[] arrayOfString1 = nN.Wj; if (m < 400) { arrayOfString1[m]; } else { Integer.toString(m); }
/*  27 */          ByteBuffer byteBuffer2; (byteBuffer2 = hI.GA0()).position(n); if (i1 > 0)
/*  28 */           V8.Pp0(n, i1, byteBuffer2.limit(), byteBuffer2);  lPT3
/*     */           
/*  30 */           .vy0(b, this, byteBuffer2.slice().order(ByteOrder.LITTLE_ENDIAN)); of.ix
/*     */           
/*  32 */           .put(Short.valueOf(lPT3.bj0), lPT3); of.cOm7
/*     */           
/*  34 */           .put(Short.valueOf(lPT3.bj0), lPT3); m = (short)(m + 1); }  ByteBuffer byteBuffer1 = HB0(); while (true) { if (byteBuffer1.getShort() == 209 && byteBuffer1.getShort() == 210 && byteBuffer1.getShort() == 211 && byteBuffer1.getShort() == 212)
/*     */         { ig ig;
/*  36 */           for (Iterator<LPT3> iterator = of.cOm7.values().iterator(); iterator.hasNext(); ) {
/*  37 */             LPT3 lPT3; short s1; if ((s1 = (lPT3 = iterator.next()).bj0) < 8328 || s1 > 8427) continue;  lPT3
/*     */               
/*  39 */               .kx0 = byteBuffer1.getShort();
/*  40 */           }  wm0 wm0; (wm0 = wm0.y0)
/*  41 */             .getClass();
/*     */ 
/*     */           
/*  44 */           this(this.TI.B8("/itemtool/itemdata/item_icon.narc")); ByteBuffer byteBuffer2 = HB0(); while (true) { LD lD1; T7 t71; ig ig1; c9 c9; Ut0 ut01; ig ig2; Ut0 ut02; if (byteBuffer2.getInt() != 4587577 || byteBuffer2.getInt() != 16318896 || byteBuffer2.getInt() != 28246143)
/*     */               continue; 
/*  46 */             this(ig.zz(1), false);
/*  47 */             this(); this(); for (m = 0; m < 468; ) { U70 u70; short s1 = (short)(m + 8000); byteBuffer2.getShort(); short s3 = byteBuffer2.getShort(); byteBuffer2.getShort(); short s2; int i2; if (ut01
/*  48 */                 .return(i2 = (s2 = byteBuffer2.getShort()) << 16 | s3))
/*  49 */               { u70 = (U70)ut01.Z6(i2); u702 = (U70)ut02.Z6(i2); }
/*  50 */               else { U70 u703; PH pH1; U70 u704; PH pH2; this(ig, u702, false, u70, lD1, (byte)3, null);
/*  51 */                 this(pH1); ut01.A3(i2, u703);
/*  52 */                 this(ig, u702, true, u70, lD1, (byte)3, null);
/*  53 */                 this(pH2); ut02.A3(i2, u704); u702 = u704; u70 = u703; }  wm0.Rv0.Vh0(s1, u70); wm0.ii.Vh0(s1, u702); m++; }
/*  54 */              AD aD; (aD = AD.case)
/*  55 */               .getClass();
/*  56 */             this();
/*     */             
/*  58 */             this(this.TI.B8("/poketool/trgra/trfgra.narc")); int i1; for (i1 = 0; i1 <= 103; ) { U70 u70; this(new yw(ig2, i1)); (new U70())
/*  59 */                 .Gd0 = true;
/*  60 */               c9.Nn0.A3(i1, u70); i1++; }  aD
/*  61 */               .Hm.VF((byte)3, c9);
/*  62 */             Mm0.dw((byte)3);
/*  63 */             this.kO = new A50(this);
/*     */ 
/*     */             
/*  66 */             E80.Mx0();
/*     */             int n;
/*     */             HI hI1;
/*     */             ByteBuffer byteBuffer3;
/*  70 */             if ((n = Fq.cL0(byteBuffer3 = (hI1 = (this.TI.B8("/fielddata/mapmatrix/map_matrix.narc")).bP).GA0(), t71.XL)) == (i1 = 1129464142)) {
/*  71 */               Fg0 fg0; T7 t72; n = u80.Lx0(byteBuffer3);
/*     */               
/*  73 */               i1 = wd.TG0(byteBuffer3.getInt(), 8, byteBuffer3.position(), byteBuffer3);
/*  74 */               i1 = byteBuffer3.position() + i1;
/*  75 */               this.uF = (lF0[])new mF[byteBuffer3.getInt()]; j = 0; while (true) { mF mF; int i3; T7 t73; String str; if (j < this.uF.length) { mF = new mF();
/*  76 */                   i3 = byteBuffer3.getInt(n + 12 + (m = j * 8));
/*  77 */                   m = i3 + i1; i3 = Df0.iy0(n + 12, 4, m, byteBuffer3) - i3;
/*  78 */                   t73 = new T7();
/*  79 */                   String[] arrayOfString1 = nN.Wj; if (j < 400) { str = arrayOfString1[j]; } else { str = Integer.toString(j); }  } else { break; }  short s1 = (short)j;
/*  80 */                 this(hI1, str, m, i3, s1); t73.db = "";
/*  81 */                 this(j, t73); this.uF[j] = mF; switch (j) { case 279: mF.ju = 70; mF.km0 = 30; break;case 278: mF.ju = 0; mF.km0 = 0; break;case 277: mF.ju = 74; mF.km0 = 32; break;case 276: mF.ju = 56; mF.km0 = 38; break;case 273: case 275: mF.ju = 57; mF.km0 = 34; break;case 272: mF.ju = 47; mF.km0 = 21; break;case 271: mF.ju = 15; mF.km0 = 0; break;case 270: mF.ju = 0; mF.km0 = 35; break;case 269: mF.ju = 21; mF.km0 = 10; break; }  j = (short)(j + 1); }  this(this); this.y7 = new Fg0();
/*  82 */               fV fV = fV.Ca; By0[] arrayOfBy0; byte b1; if ((b1 = 3) < (
/*  83 */                 arrayOfBy0 = fV.kg).length) {
/*  84 */                 arrayOfBy0[b1] = fg0;
/*     */               }
/*     */               
/*  87 */               E80.Mx0();
/*     */               int i2;
/*     */               HI hI2;
/*     */               ByteBuffer byteBuffer4;
/*  91 */               if ((i2 = Fq.cL0(byteBuffer4 = (hI2 = (this.TI.B8("/fielddata/land_data/land_data.narc")).bP).GA0(), t72.XL)) == (i1 = 1129464142)) {
/*  92 */                 T7 t73; i2 = u80.Lx0(byteBuffer4);
/*     */                 
/*  94 */                 i1 = wd.TG0(byteBuffer4.getInt(), 8, byteBuffer4.position(), byteBuffer4);
/*  95 */                 i1 = byteBuffer4.position() + i1; Bs[] arrayOfBs;
/*  96 */                 for (this.Vr = (Bs[])new yU[byteBuffer4.getInt()], j = 0; j < (arrayOfBs = this.Vr).length; ) { String str; yU yU = new yU(); int i4;
/*  97 */                   b = byteBuffer4.getInt(i2 + 12 + (i4 = j * 8));
/*  98 */                   i4 = b + i1; b = Df0.iy0(i2 + 12, 4, i4, byteBuffer4) - b;
/*  99 */                   T7 t74 = new T7();
/* 100 */                   String[] arrayOfString1 = nN.Wj; if (j < 400) { str = arrayOfString1[j]; } else { str = Integer.toString(j); }  short s1 = (short)j;
/* 101 */                   this(hI2, str, i4, b, s1); t74.db = "";
/* 102 */                   this(this, j, t74); arrayOfBs[j] = yU; j = (short)(j + 1); }  this.EI0 = new Jj(this);
/*     */                 
/* 104 */                 E80.Mx0();
/*     */                 
/*     */                 int i3;
/*     */                 
/* 108 */                 if ((i3 = Fq.cL0(byteBuffer4 = (hI2 = (this.TI.B8("/poketool/trainer/trdata.narc")).bP).GA0(), t73.XL)) == (i1 = 1129464142)) {
/* 109 */                   T7 t74; i3 = u80.Lx0(byteBuffer4);
/*     */                   
/* 111 */                   j = wd.TG0(i1 = byteBuffer4.getInt(), 8, byteBuffer4.position(), byteBuffer4);
/* 112 */                   j = byteBuffer4.position() + j;
/*     */                   
/* 114 */                   E80.Mx0();
/*     */                   int i4;
/*     */                   HI hI3;
/*     */                   ByteBuffer byteBuffer5;
/* 118 */                   if ((i4 = Fq.cL0(byteBuffer5 = (hI3 = (this.TI.B8("/poketool/trainer/trpoke.narc")).bP).GA0(), t74.XL)) == (b = 1129464142)) {
/* 119 */                     T7 t75; i1 = u80.Lx0(byteBuffer5);
/*     */                     
/* 121 */                     i4 = wd.TG0(byteBuffer5.getInt(), 8, byteBuffer5.position(), byteBuffer5);
/* 122 */                     i4 = byteBuffer5.position() + i4;
/* 123 */                     for (this.K20 = new bu0[i1], b = 0; b < this.K20.length; ) {
/* 124 */                       bu0 bu01; int i7, i8 = byteBuffer4.getInt(i3 + 12 + (i7 = b * 8));
/* 125 */                       i8 += j; int i10 = Df0.iy0(i3 + 12, 4, i7, byteBuffer4) - i8;
/* 126 */                       String[] arrayOfString1 = nN.Wj; if (b < 'Ɛ') { arrayOfString1[b]; } else { Integer.toString(b); }
/* 127 */                        ByteBuffer byteBuffer10; (byteBuffer10 = hI2.GA0()).position(i8); if (i10 > 0)
/* 128 */                         V8.Pp0(i8, i10, byteBuffer10.limit(), byteBuffer10);  ByteOrder byteOrder;
/* 129 */                       ByteBuffer byteBuffer8 = byteBuffer10.slice().order(byteOrder = ByteOrder.LITTLE_ENDIAN);
/* 130 */                       this(b, this, byteBuffer8);
/* 131 */                       int i9 = byteBuffer5.getInt(i1 + 12 + i7);
/* 132 */                       i7 = i9 + i4; i9 = Df0.iy0(i1 + 12, 4, i7, byteBuffer5) - i9; if (b < 'Ɛ') { arrayOfString1[b]; }
/* 133 */                       else { Integer.toString(b); }
/* 134 */                        ByteBuffer byteBuffer9; (byteBuffer9 = hI3.GA0()).position(i7); if (i9 > 0)
/* 135 */                         V8.Pp0(i7, i9, byteBuffer9.limit(), byteBuffer9); 
/* 136 */                       ByteBuffer byteBuffer7 = byteBuffer9.slice().order(byteOrder); byte b2 = 0; K60[] arrayOfK60; while (b2 < (
/* 137 */                         arrayOfK60 = bu01.TK0).length) { K60 k60; this(bu01, byteBuffer7); arrayOfK60[b2] = k60; b2++; }  this
/* 138 */                         .K20[b] = bu01;
/*     */ 
/*     */                       
/* 141 */                       Ry0 ry0 = T30.Qh.lD0[3];
/* 142 */                       ry0
/* 143 */                         .VL
/* 144 */                         .Vh0(bu01.tK, bu01); short s1 = (short)(b + 1);
/* 145 */                     }  ByteBuffer byteBuffer6; LF.Db(byteBuffer6 = Gc0(5).aF0(), 275, 1089, 65535); Gc0(5).aF0().position(Gc0(5).aF0().position() + 4); for (int i6 = 0; i6 != 65535; ) { i6 = byteBuffer6.getInt(); int i7 = byteBuffer6.getInt(); i7 = (short)i6; this.fm.st(i7, (short)i7); }
/*     */                     
/* 147 */                     E80.Mx0();
/*     */                     
/*     */                     int i5;
/*     */                     HI hI4;
/* 151 */                     if ((i5 = Fq.cL0(byteBuffer4 = (hI4 = (this.TI.B8("/data/mmodel/mmodel.narc")).bP).GA0(), t75.XL)) == (i1 = 1129464142)) {
/* 152 */                       i5 = u80.Lx0(byteBuffer4);
/*     */                       
/* 154 */                       i1 = wd.TG0(byteBuffer4.getInt(), 8, byteBuffer4.position(), byteBuffer4);
/* 155 */                       for (i1 = byteBuffer4.position() + i1, j = 0; j < 420; ) {
/* 156 */                         int i7 = byteBuffer4.getInt(i5 + 12 + (i4 = j * 8));
/* 157 */                         i4 = i7 + i1; i7 = Df0.iy0(i5 + 12, 4, i4, byteBuffer4) - i7;
/* 158 */                         String[] arrayOfString1 = nN.Wj; if (j < 400) { arrayOfString1[j]; } else { Integer.toString(j); }
/* 159 */                          c20 = new C20(); ByteBuffer byteBuffer7;
/* 160 */                         (byteBuffer7 = hI4.GA0()).position(i4); if (i7 > 0) {
/* 161 */                           V8.Pp0(i4, i7, byteBuffer7.limit(), byteBuffer7);
/*     */                         }
/* 163 */                         this(byteBuffer7.slice().order(ByteOrder.LITTLE_ENDIAN), true, false); w00 w00;
/* 164 */                         if (((w00 = c20.EV) != null) ? w00.ib : ((Wd)c20.PF0.get(0)).as0)
/*     */                         { int i8;
/*     */ 
/*     */                           
/* 168 */                           for (arrayOfU70 = new U70[i8 = c20.bl.TE.ai0.Z8], b = 0; b < i8; ) { h80 h80; this(c20, b); this(h80); arrayOfU70[b] = u702; b++; }  this.sk.Vh0(j, arrayOfU70); }  j = (short)(j + 1);
/*     */                       } 
/*     */                       
/* 171 */                       this(this.TI.B8("/graphic/tmap_gra.narc")); this.wU = new U70(new XJ(ig1));
/*     */                       
/* 173 */                       this(ig1.zz(8), false);
/*     */                       short s1;
/* 175 */                       for (this.ls = new U70[s1 = (new LD()).ql.RM], i1 = 0; i1 < s1; ) { U70 u70; this(new XB(i1, lD, ig1)); this.ls[i1] = u70; i1++; }
/*     */                       
/* 177 */                       this(ig1.zz(17), false);
/* 178 */                       s1 = (new LD()).ql.RM;
/* 179 */                       for (this.i0 = new U70[2][s1], i1 = 0; i1 < 2; ) { for (j = 0; j < s1; ) { this(new LPt9(ig1, i1, lD, j)); this.i0[i1][j] = u701; j++; }  i1++; }
/* 180 */                        dy0(); return;
/* 181 */                     }  throw new RuntimeException(
/* 182 */                         RH0.KK("Header magic mismatch = ", ig1, " vs expected ", i1));
/*     */                   } 
/* 184 */                   throw new RuntimeException(
/* 185 */                       RH0.KK("Header magic mismatch = ", u701, " vs expected ", b));
/* 186 */                 }  throw new RuntimeException(
/* 187 */                     RH0.KK("Header magic mismatch = ", ig1, " vs expected ", i1));
/*     */               } 
/* 189 */               throw new RuntimeException(
/* 190 */                   RH0.KK("Header magic mismatch = ", ig1, " vs expected ", i1));
/* 191 */             }  throw new RuntimeException(
/* 192 */                 RH0.KK("Header magic mismatch = ", ig1, " vs expected ", i1)); }  break; }  }
/*     */        }
/* 194 */     else { throw new RuntimeException(
/* 195 */           RH0.KK("Header magic mismatch = ", lD, " vs expected ", j)); }
/*     */     
/*     */     short s = (short)j;
/*     */     super((HI)lD, (String)u702, arrayOfU70, c20, s);
/*     */     T7 t7;
/*     */     LD lD;
/*     */     U70 u701, arrayOfU70[];
/*     */     C20 c20;
/*     */     byte b;
/*     */     U70 u702;
/*     */     b.db = "";
/*     */     super(j, b);
/*     */     this.uF[j] = (lF0)u701;
/*     */     switch (j) {
/*     */       case 279:
/*     */         ((lF0)u701).ju = 70;
/*     */         ((lF0)u701).km0 = 30;
/*     */         break;
/*     */       case 278:
/*     */         ((lF0)u701).ju = 0;
/*     */         ((lF0)u701).km0 = 0;
/*     */         break;
/*     */       case 277:
/*     */         ((lF0)u701).ju = 74;
/*     */         ((lF0)u701).km0 = 32;
/*     */         break;
/*     */       case 276:
/*     */         ((lF0)u701).ju = 56;
/*     */         ((lF0)u701).km0 = 38;
/*     */         break;
/*     */       case 273:
/*     */       case 275:
/*     */         ((lF0)u701).ju = 57;
/*     */         ((lF0)u701).km0 = 34;
/*     */         break;
/*     */       case 272:
/*     */         ((lF0)u701).ju = 47;
/*     */         ((lF0)u701).km0 = 21;
/*     */         break;
/*     */       case 271:
/*     */         ((lF0)u701).ju = 15;
/*     */         ((lF0)u701).km0 = 0;
/*     */         break;
/*     */       case 270:
/*     */         ((lF0)u701).ju = 0;
/*     */         ((lF0)u701).km0 = 35;
/*     */         break;
/*     */       case 269:
/*     */         ((lF0)u701).ju = 21;
/*     */         ((lF0)u701).km0 = 10;
/*     */         break;
/*     */     } 
/*     */     j = (short)(j + 1);
/*     */     continue; }
/*     */ 
/*     */   
/*     */   public final String SO() {
/*     */     String str = super.SO();
/*     */     if ("ja".equals(str) && (this.TI.B8("/graphic/pl_font.narc")).zu0 > 500000)
/*     */       return "zh"; 
/*     */     return str;
/*     */   }
/*     */   
/*     */   public final HV Hb(short paramShort) {
/*     */     (new StringBuilder()).append(this.db).append("/");
/*     */     T7 t71;
/*     */     HI hI = (t71 = this.TI.B8("/fielddata/eventdata/zone_event.narc")).Sh0();
/*     */     ByteBuffer byteBuffer;
/*     */     (byteBuffer = this.TI.B8("/fielddata/eventdata/zone_event.narc").Sh0().GA0()).position(this.XL);
/*     */     (new FA0(byteBuffer)).sV(1129464142);
/*     */     this(byteBuffer);
/*     */     E60 e60;
/*     */     String str;
/*     */     this.TI.B8("/fielddata/eventdata/zone_event.narc").Sh0().GA0().getInt();
/*     */     int j = this.TI.B8("/fielddata/eventdata/zone_event.narc").Sh0().GA0().getInt();
/*     */     j = byteBuffer.position() + j;
/*     */     if (paramShort >= this.dh0)
/*     */       return null; 
/*     */     K00 k00 = new K00();
/*     */     int k, m = byteBuffer.getInt(this.Ex + 12 + (k = paramShort * 8));
/*     */     int i = m + j;
/*     */     j = WW.Rq0(this.Ex, 12, 4, k, byteBuffer) - m;
/*     */     T7 t72 = new T7();
/*     */     String[] arrayOfString = nN.Wj;
/*     */     if (paramShort < 400) {
/*     */       str = arrayOfString[paramShort];
/*     */     } else {
/*     */       str = Integer.toString(paramShort);
/*     */     } 
/*     */     short s = (short)paramShort;
/*     */     this(hI, str, i, j, s);
/*     */     t72.db = "";
/*     */     this(t72);
/*     */     return this;
/*     */   }
/*     */   
/*     */   public final iy0 U40(int paramInt) {
/*     */     return (iy0)this.y7.Z6[paramInt];
/*     */   }
/*     */   
/*     */   public final void n4() {
/*     */     this.JN = new E4(this.TI.B8("/data/sound/pl_sound_data.sdat"));
/*     */   }
/*     */   
/*     */   public final byte bO() {
/*     */     return 3;
/*     */   }
/*     */   
/*     */   public final Wd oB(VV paramVV, int paramInt) {
/*     */     T7 t7;
/*     */     String[] arrayOfString;
/*     */     E80.Mx0();
/*     */     int i;
/*     */     HI hI;
/*     */     ByteBuffer byteBuffer;
/*     */     int j;
/*     */     if ((i = Fq.cL0(byteBuffer = (hI = (this.TI.B8("/fielddata/areadata/area_map_tex/map_tex_set.narc")).bP).GA0(), this.XL)) == (j = 1129464142)) {
/*     */       i = wd.TG0(byteBuffer.getInt(), 8, byteBuffer.position(), byteBuffer);
/*     */       i = byteBuffer.position() + i;
/*     */       int m = byteBuffer.getInt(u80.Lx0(byteBuffer) + 12 + (j = paramInt * 8));
/*     */       i = m + i;
/*     */       int k = WW.Rq0(u80.Lx0(byteBuffer), 12, 4, j, byteBuffer) - m;
/*     */       arrayOfString = nN.Wj;
/*     */       if (paramInt < 400) {
/*     */         arrayOfString[paramInt];
/*     */       } else {
/*     */         Integer.toString(paramInt);
/*     */       } 
/*     */       C20 c20 = new C20();
/*     */       ByteBuffer byteBuffer1;
/*     */       (byteBuffer1 = hI.GA0()).position(i);
/*     */       if (k > 0)
/*     */         V8.Pp0(i, k, byteBuffer1.limit(), byteBuffer1); 
/*     */       this(byteBuffer1.slice().order(ByteOrder.LITTLE_ENDIAN));
/*     */       return c20.bl;
/*     */     } 
/*     */     throw new RuntimeException(RH0.KK("Header magic mismatch = ", i, " vs expected ", arrayOfString));
/*     */   }
/*     */   
/*     */   public final void mE0() {
/*     */     F40 f40 = F40.ef0;
/*     */     this(this, this, this.TI.B8("/msgdata/pl_msg.narc"));
/*     */     S40 s40;
/*     */     this.OB = new S40();
/*     */     this.Is = s40;
/*     */   }
/*     */   
/*     */   public final By0 I80() {
/*     */     return this.y7;
/*     */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */