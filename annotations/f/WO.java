/*   1 */ package f;public final class WO extends Kl0 { public int rD; public int Tp0; public byte wd; public int Vk; public short[] C00; public byte[] TB; public byte qh; public short P20; public byte UJ0; public short sI0; public byte bz; public aq0 QI; public short VL; public HashMap rb; public short[] rQ; public short u80; public short cH0; public int kZ; public int RG0; public byte sd; public byte Sp0; public byte Vh; public short zs; public short Tq; public byte BV; public mA eH0; public mA[] tS = mA.qv0; public long lPt7; public byte p60; public int Bs0; public byte jk0; public short[] ZY; public short[] WF; public byte Lv; public String Fv0 = ""; public nV Fs; public WO(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { this
/*   2 */       .rD = this.Ws.getInt();
/*   3 */     if (((this
/*   4 */       .Tp0 = this.Ws.getInt()) & 0x1) != 0) { this
/*     */         
/*   6 */         .wd = this.Ws.get();
/*     */       
/*   8 */       this.Vk = this.Ws.getInt(); }  if ((this.Tp0 & 0x2) != 0) { HashMap<Object, Object> hashMap; this(); hR[] arrayOfHR; int i; byte b; for (this.rb = hashMap, i = (arrayOfHR = hR.ka).length, b = 0; b < i; ) { hR hR = arrayOfHR[b]; this.rb
/*     */           
/*  10 */           .put(hR, Short.valueOf(this.Ws.getShort())); b++; }  }  if ((this.Tp0 & 0x4) != 0) { byte b; for (this.C00 = new short[4], this.TB = new byte[4], b = 0; b < 4; ) { this.C00[b] = this
/*  11 */           .Ws.getShort();
/*  12 */         this.TB[b] = this
/*  13 */           .Ws.get();
/*  14 */         b++; }  this
/*     */         
/*  16 */         .qh = this.Ws.get(); }  if ((this.Tp0 & 0x8) != 0) this
/*     */         
/*  18 */         .P20 = this.Ws.getShort();  if ((this.Tp0 & 0x10) != 0) this
/*     */         
/*  20 */         .UJ0 = this.Ws.get();  if ((this.Tp0 & 0x20) != 0) { this
/*     */         
/*  22 */         .sI0 = this.Ws.getShort();
/*     */       
/*  24 */       this.bz = this.Ws.get(); }  if ((this.Tp0 & 0x40) != 0) { this
/*     */         
/*  26 */         .QI = aq0.BQ(this.Ws.get());
/*     */       
/*  28 */       this.VL = this.Ws.getShort(); }  if ((this.Tp0 & 0x80) != 0) { hR[] arrayOfHR; int i; byte b; for (this.rQ = new short[arrayOfHR.length], i = (arrayOfHR = hR.ka).length, b = 0; b < i; ) { hR hR = arrayOfHR[b]; this.rQ[hR
/*  29 */             .dL] = this
/*  30 */           .Ws.getShort();
/*  31 */         b++; }  }  if ((this.Tp0 & 0x100) != 0) this
/*     */         
/*  33 */         .u80 = this.Ws.getShort();  if ((this.Tp0 & 0x200) != 0) this
/*     */         
/*  35 */         .cH0 = this.Ws.getShort();  if ((this.Tp0 & 0x400) != 0) { this
/*     */         
/*  37 */         .kZ = this.Ws.getInt();
/*     */       
/*  39 */       this.RG0 = this.Ws.getInt();
/*     */       
/*  41 */       this.sd = this.Ws.get();
/*     */       
/*  43 */       this.Sp0 = this.Ws.get();
/*     */       
/*  45 */       this.Vh = this.Ws.get(); }  if ((this.Tp0 & 0x800) != 0) this
/*     */         
/*  47 */         .zs = this.Ws.getShort();  if ((this.Tp0 & 0x1000) != 0) this
/*     */         
/*  49 */         .Tq = this.Ws.getShort();  if ((this.Tp0 & 0x2000) != 0) this
/*     */         
/*  51 */         .BV = this.Ws.get();  if ((this.Tp0 & 0x4000) != 0) this
/*     */         
/*  53 */         .lPt7 = this.Ws.getLong();  if ((this.Tp0 & 0x200000) != 0) this
/*     */         
/*  55 */         .Bs0 = this.Ws.getInt();  if ((this.Tp0 & 0x8000) != 0) { byte b; for (this.ZY = new short[4], b = 0; b < 4; ) { this.ZY[b] = this
/*  56 */           .Ws.getShort();
/*  57 */         b++; }  this.Fv0 = au(); }  if ((this.Tp0 & 0x10000) != 0) this
/*     */         
/*  59 */         .Fs = nV.Y4(this.Ws.get());  if ((this.Tp0 & 0x20000) != 0) this
/*     */         
/*  61 */         .jk0 = this.Ws.get();  if ((this.Tp0 & 0x40000) != 0) { byte b; short[] arrayOfShort; for (this.WF = new short[DG.yG.length], b = 0; b < (arrayOfShort = this.WF).length; ) { arrayOfShort[b] = this
/*  62 */           .Ws.getShort();
/*  63 */         b++; }  }  if ((this.Tp0 & 0x80000) != 0) this
/*     */         
/*  65 */         .Lv = this.Ws.get();  if ((this.Tp0 & 0x100000) != 0) this
/*     */         
/*  67 */         .p60 = this.Ws.get();  if ((this.Tp0 & 0x400000) != 0) { byte b; mA[] arrayOfMA; for (this
/*     */         
/*  69 */         .tS = new mA[this.Ws.get()], b = 0; b < (arrayOfMA = this.tS).length; ) { arrayOfMA[b] = 
/*     */           
/*  71 */           mA.qq(this.Ws.get()); b++; }  }  if ((this.Tp0 & 0x800000) != 0) this
/*     */         
/*  73 */         .eH0 = mA.qq(this.Ws.get());  } public final void Cx() { Uc0 uc01; j40 j40; aq0[] arrayOfAq0; int k, m; for (uc01 = null, j40 = null, k = (arrayOfAq0 = aq0.SL0).length, m = 0; m < k; ) { aq0 aq03 = arrayOfAq0[m]; Uc0 uc0; if ((uc0 = r8().s40(aq03)) != null && (j40 = uc0.de0(this.rD)) != null) { uc01 = uc0; break; }  m++; }  if (uc01 == null) return;  aq0 aq02 = uc01.Nul; if ((this.Tp0 & 0x40) != 0) { if (this.QI == aq02) { j40.Zs.Tl0 = this.VL; uc01.Ix0(); } else { int n; if ((n = aq02.ordinal()) != 9) { switch (n) { case 2: if ((r8()).Ld != null) { uc01 = (r8()).Ld.ou(); n = j40.Jg; } else { break; }  uc01.eW(n); break;case 0: case 1: case 3: n = j40.Jg; uc01.eW(n); break; }  Uc0 uc0 = r8().s40(aq03); j40.Zs.COm1 = aq03; j40.Zs.Tl0 = this.VL; int i1; aq0 aq03; if ((i1 = (aq03 = this.QI).ordinal()) != 9) { switch (i1) { case 2: (r8()).Ld.ou().ao(j40); break;case 0: case 1: case 3: uc0.ao(j40); break; }  uc01 = uc0; } else {  }  } else {  }  }  if (r8().s40(aq02 = aq0.XJ0) != null) r8().s40(aq02).Ix0();  for (aq0[] arrayOfAq01 = aq0.Yz0; m < k; ) { aq0 aq03 = arrayOfAq01[m]; Uc0 uc0; if ((uc0 = r8().s40(aq03)) != null) uc0.Ix0();  m++; }  if ((r8()).Ld != null) (r8()).Ld.ou().Ix0();  }  if ((this.Tp0 & 0x1) != 0) { Gp0 gp0; if ((gp0 = km.MR) != null && gp0.rx != ky.JH0) { Jb jb; m = this.wd; this(j40, m, this.Vk); Iterator<SI0> iterator = (gp0 = km.MR).W.iterator(); while (true) { if (iterator.hasNext()) { SI0 sI0; if (sI0 = iterator.next() instanceof Jb) { int n; int i1; j40 j401; if ((j401 = ((Jb)(sI0 = sI0)).Ry0) == null) { n = 0; } else { n = n.Jg; }  j40 j402; if ((j402 = jb.Ry0) == null) { i1 = 0; } else { i1 = i1.Jg; }  if (n == i1) { ((Jb)sI0).qH0 = jb.qH0; ((Jb)sI0).Fh0 = jb.Fh0; break; }  }  continue; }  gp0.W.add(jb); break; }  } else { j40.Zs.od = this.wd; j40.Zs.pA = this.Vk; }  }  if ((this.Tp0 & 0x2) != 0) for (Iterator<Map.Entry> iterator = this.rb.entrySet().iterator(); iterator.hasNext(); ) { short s = ((Short)entry.getValue()).shortValue(); jd0.hp0 = s; jd0.pO(); hm0 hm0; Map.Entry<hR, ?> entry; Gp0 gp0; int n; cOm4 cOm4; jd0 jd0; if ((entry = iterator.next()).getKey() == hR.Gg && (gp0 = km.MR) != null && (cOm4 = gp0.f70(n = j40.Jg)) != null && (jd0 = cOm4.gc) != null && (hm0 = gp0.fa(n)) != null) km.wI0.K7.LW.oD(hm0).COM8(hm0, true, hm0.XW());  }   if ((this.Tp0 & 0x4) != 0) { for (byte b = 0; b < 4; ) { k = this.C00[b]; j40.Zs.En0[b] = k; k = (byte)nx0.Uw0(this.TB[b], 0, 100); j40.Zs.rI0[b] = k; b++; }  j40.Zs.j00 = this.qh; }  j40.Zs.ok(this.P20); if ((this.Tp0 & 0x8) != 0 && this.P20 < 1) { boolean bool = false; j40.Zs.u0 = (byte)(j40.Zs.u0 | bool); }  int j; if (((j = this.Tp0) & 0x10) != 0) j40.Zs.u0 = this.UJ0;  if ((j & 0x20) != 0) { j40.Zs.Cw0 = this.sI0; j40.Zs.Vp = this.bz;
/*  74 */       j40.If0(On.v30().lpT3(this.sI0)); }  if ((this.Tp0 & 0x80) != 0) { hR[] arrayOfHR; for (k = (arrayOfHR = hR.Tt0).length, m = 0; m < k; ) {
/*     */         
/*  76 */         short s = 0; Q90 q90; (q90 = j40.Zs)
/*  77 */           .getClass(); hR hR;
/*  78 */         if (!(hR = arrayOfHR[m]).NT && !hR.NT)
/*  79 */         { byte b = hR.dL;
/*  80 */           s = (short)nx0.Uw0(s, 0, 252); if (q90.Ue(b) + s > 510) s = (short)(510 - q90.Ue(b));  short[] arrayOfShort; if ((arrayOfShort = q90.ko0)[b] != s) arrayOfShort[b] = s;  }  m++;
/*  81 */       }  for (k = (arrayOfHR = hR.Tt0).length, m = 0; m < k; ) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  86 */         short s = this.rQ[hR.dL]; Q90 q90; (q90 = j40.Zs).getClass(); hR hR;
/*  87 */         if (!(hR = arrayOfHR[m]).NT && !hR.NT)
/*  88 */         { byte b = hR.dL;
/*  89 */           s = (short)nx0.Uw0(s, 0, 252); if (q90.Ue(b) + s > 510) s = (short)(510 - q90.Ue(b));  short[] arrayOfShort; if ((arrayOfShort = q90.ko0)[b] != s) arrayOfShort[b] = s;  }  m++;
/*     */       }  }
/*  91 */      j40.Zs
/*     */       
/*  93 */       .ld0 = this.u80; aq0 aq01;
/*     */     Uc0 uc02;
/*  95 */     if ((this.Tp0 & 0x100) != 0 && ((k = (aq01 = j40.Zs.COm1).ordinal()) == 0 || k == 1 || k == 4 || k == 9) && (uc02 = r8().s40(aq01)) != null) uc02.Ix0();  if ((this.Tp0 & 0x200) != 0) { j40
/*  96 */         .Zs
/*  97 */         .getClass();
/*  98 */       j40.Zs.Bl0 = (short)nx0.Uw0(this.cH0, 0, 255); }  if ((this
/*  99 */       .Tp0 & 0x400) != 0) {
/*     */       
/* 101 */       int n = this.kZ;
/*     */       
/* 103 */       j40.Zs.k0 = nV.Y4((byte)(int)((n & 0xFFFFFFFFL) % 25L));
/* 104 */       q90
/*     */         
/* 106 */         .Ck = this.RG0;
/*     */       
/* 108 */       q90.YH0 = this.sd;
/*     */       Q90 q90;
/* 110 */       (q90 = j40.Zs).sq0 = this.Sp0;
/* 111 */       if ((k = this.Vh) < 0 || k > 5) k = 0;  q90
/* 112 */         .UK0 = k;
/* 113 */     }  int i; if (((i = this.Tp0) & 0x800) != 0)
/* 114 */       j40.Zs
/*     */         
/* 116 */         .LPt7 = this.zs;  if ((i & 0x1000) != 0 && 
/* 117 */       km.MR == null) { arrayOfString[
/*     */ 
/*     */           
/* 120 */           0] = Ml0.OH0((Of.eH.On0(this.Tq)).Iu); String[] arrayOfString;
/* 121 */       (arrayOfString = new String[2])[1] = j40.m(); r8().Pq(Ml0.sB(6009, arrayOfString)); }  if (((i = this.Tp0) & 0x2000) != 0)
/* 122 */     { Q90 q90 = j40.Zs;
/* 123 */       if ((m = this.BV) < 0 || m > 24) m = 3;  q90
/* 124 */         .qz = m; }  if ((i & 0x4000) != 0)
/* 125 */     { j40.Zs
/*     */         
/* 127 */         .u4 = this.lPt7;
/* 128 */       r8().s40(aq0.LI).Ix0(); }  if (((i = this.Tp0) & 0x200000) != 0)
/* 129 */       j40.Zs
/*     */         
/* 131 */         .Jx0 = this.Bs0;  if ((i & 0x8000) != 0) { i = 0; short[] arrayOfShort; while (i < (
/* 132 */         arrayOfShort = this.ZY).length) {
/* 133 */         Q90 q90 = j40.Zs;
/* 134 */         m = arrayOfShort[i]; q90
/* 135 */           .AY[i] = m;
/* 136 */         i++;
/* 137 */       }  j40.Zs
/*     */         
/* 139 */         .Yq0 = this.Fv0;
/* 140 */       r8().s40(aq0.LI).Ix0(); }  if ((this.Tp0 & 0x10000) != 0)
/* 141 */     { Q90 q90 = j40.Zs;
/* 142 */       q90.getClass(); nV nV1; (nV1 = this.Fs)
/* 143 */         .getClass(); while (q90.k0 != nV1) { q90
/*     */ 
/*     */ 
/*     */           
/* 147 */           .MD0 = m = xi0.vg0.DW.nextInt();
/* 148 */         q90.k0 = nV.Y4((byte)(int)((m & 0xFFFFFFFFL) % 25L)); }  }  if ((this
/* 149 */       .Tp0 & 0x40000) != 0) { DG[] arrayOfDG; for (k = (arrayOfDG = DG.yG).length, m = 0; m < k; ) { DG dG = arrayOfDG[m];
/* 150 */         Q90 q90 = j40.Zs;
/*     */ 
/*     */         
/* 153 */         short s = this.WF[dG.sC]; q90.getClass();
/* 154 */         switch (dG.ordinal()) { case 4: q90.Sf0 = (byte)s; break;case 3: q90.IF0 = (byte)s; break;case 2: q90.Jk = (byte)s; break;case 1: q90.Ij = (byte)s; break;case 0: q90.COm4 = (byte)s; break; }  m++; }  }  if ((this
/* 155 */       .Tp0 & 0x80000) != 0)
/* 156 */     { Q90 q90 = j40.Zs;
/* 157 */       if ((k = this.Lv) < 0) { q90
/* 158 */           .GJ0 = null; } else { q90
/* 159 */           .getClass();
/* 160 */         q90.GJ0 = Ht0.Gt0(k); }  }  if ((this
/* 161 */       .Tp0 & 0x100000) != 0) j40
/* 162 */         .Zs
/* 163 */         .am(this.p60);  if (((i = this.Tp0) & 0x20000) != 0)
/* 164 */     { Q90 q90 = j40.Zs;
/* 165 */       if ((m = this.jk0) < 0 || m > 2) m = 0;  q90
/* 166 */         .cC = m; }  if ((i & 0x400000) != 0)
/* 167 */       j40.Zs
/*     */         
/* 169 */         .wH = this.tS;  if ((i & 0x800000) != 0)
/* 170 */     { Q90 q90 = j40.Zs;
/* 171 */       mA mA1 = this.eH0; if (q90
/* 172 */         .xH != mA1) q90
/* 173 */           .xH = mA1;  }  if (uc01 != null) uc01
/* 174 */         .Ix0();  r8().W0(j40); }
/*     */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */