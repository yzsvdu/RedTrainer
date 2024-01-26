/*  1 */ package f;public final class h2 extends Ks0 implements r60 { public final void No() { if (!this.dP)
/*  2 */     { if (km.D70(1))
/*  3 */         wI0(true);  return; }  if (this.Qr0 + 250000000L > System.nanoTime()) return;  this.Qr0 = System.nanoTime(); vh0 vh0; Jo jo;
/*  4 */     if ((jo = (vh0 = km.a3).Ct) == null)
/*  5 */       return;  KI kI; if ((kI = vh0.Jr0()) == null)
/*    */       return; 
/*  7 */     xr0 xr01 = jo.HW.CJ0();
/*  8 */     if (!this.xM.dP || this
/*  9 */       .zB0 == xr01) return;  this.zB0 = xr01; this(); StringBuilder stringBuilder2, stringBuilder3, stringBuilder4; QD0 qD0; if ((qD0 = km.ZY) != null && qD0
/* 10 */       .Qf) { stringBuilder3
/* 11 */         .append("\n\nProfiler"); stringBuilder3.append("\nCalls: ")
/*    */ 
/*    */         
/* 14 */         .append(km.ZY.zY.MD); stringBuilder3.append("\nDraw Calls: ")
/*    */ 
/*    */         
/* 17 */         .append(km.ZY.zY.w20); stringBuilder3.append("\nShader Switches: ")
/*    */ 
/*    */         
/* 20 */         .append(km.ZY.zY.ZZ); stringBuilder3.append("\nTexture Binds: ")
/*    */ 
/*    */         
/* 23 */         .append(km.ZY.zY.mG); stringBuilder3.append("\nVertex Count: ")
/*    */ 
/*    */         
/* 26 */         .append(km.ZY.zY.eO.COm2).append("\n\n"); }  if (xr01 != null) { stringBuilder3.append("Position: ").append(xr01.Ka()).append(" / ").append(xr01.hA0()).append(" Z: ").append(xr01.bl0()).append("\n"); } else { stringBuilder3.append("Position: ").append(xr01).append("\n"); }
/*    */     
/* 28 */     if (Mk0.sz0(kI.E10))
/*    */     
/* 30 */     { stringBuilder4 = stringBuilder3.append("Map: ").append(kI.UZ).append(" / ").append(kI.Xg0()).append(" Ch. ");
/*    */        }
/*    */     
/*    */     else
/*    */     
/*    */     { 
/* 36 */       stringBuilder4 = stringBuilder3.append("Map: ").append(kI.UZ).append(" / ").append(kI.cA).append(".").append(kI.VZ).append(" Ch. "); }  stringBuilder4
/*    */       
/* 38 */       .append(kI.Xw + 1).append("\nName: ").append(kI.xc0()).append(" \n\n"); if (xr01 instanceof NZ) { String str1; Short short_; NZ nZ = (NZ)xr01; stringBuilder3.append("Coordinate Height: ").append(nZ.i00()).append("\n"); stringBuilder3.append("Terrain: ").append(Aq0.Qu0(nZ.rv0(), false)).append("\n"); stringBuilder3.append("HeightRaw: ").append(Aq0.Qu0(nZ.RW(), false)).append("\n"); stringBuilder3.append("Behavior ID: ").append(Aq0.Qu0(nZ.pq(), false)).append("\n"); stringBuilder2 = stringBuilder3.append("Movement Perms: ");
/*    */       String str2;
/* 40 */       if ((str2 = Integer.toHexString((byte)nZ.EC0).toUpperCase()).length() == 8 && str2.startsWith("FFFFFF")) str2 = str2.substring(6);  while (str2.length() < 2)
/* 41 */         str2 = m0.tF0("0", str2);  stringBuilder2
/*    */         
/* 43 */         .append("0x" + str2).append("\n\n"); stringBuilder2 = stringBuilder3.append("Footer ID: "); za0 za0;
/* 44 */       if ((za0 = nZ.xm0) == null)
/* 45 */       { str1 = "null"; }
/*    */       else
/* 47 */       { short_ = Short.valueOf(((Bs)str1).MV); }  stringBuilder2.append(short_).append("\n"); stringBuilder3.append("Footer X: ")
/*    */         
/* 49 */         .append(nZ.si0).append(" Y: ")
/*    */         
/* 51 */         .append(nZ.k80).append("\n"); } else if (stringBuilder2 instanceof xW) { a4 a4; if ((a4 = stringBuilder2.jH()) != null) for (byte b = 0; b < 2; ) { byte b3 = 0; uI0[] arrayOfUI0; int i;
/*    */           byte b4;
/* 53 */           for (i = (arrayOfUI0 = a4.Lh[b]).length, b4 = 0; b4 < i; ) { uI0 uI0; if ((uI0 = arrayOfUI0[b4]) != null) { stringBuilder3.append("tileBlock[" + b + "][" + b3 + "] " + uI0.Eu0() + " " + uI0.EL0() + "\n"); b3++; }  b4++; }  b++; }   if (a4 != null)
/*    */       { boolean bool;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 61 */         StringBuilder stringBuilder = stringBuilder3.append("MapTile\n________________\nBG1 = ").append(a4.No).append("\nBG2 = ").append(a4.Ht).append("\nBeh1 = ").append(a4.jY).append("\nBeh2 = ").append(a4.Ii).append("\nApp= ").append(stringBuilder2.Ij()).append("\nHeight= ").append(stringBuilder2.bl0()).append("\n").append("\nHeight= ").append(stringBuilder2.bl0()).append("\nHas Doors= ");
/* 62 */         if (a4.pn0 != null) { bool = true; } else { bool = false; }  stringBuilder
/* 63 */           .append(bool).append("\n"); } else { stringBuilder3.append("MapTile\n________________\nBG1 = NULL\nBG2 = NULL\nBeh1 = NULL\nBeh2 = NULL\n"); }  }  stringBuilder3
/*    */       
/* 65 */       .append(km.wI0.iJ0.XX());
/*    */     
/* 67 */     stringBuilder3.append("\nManaged Resources: " + Bb0.fA.size()); StringBuilder stringBuilder1 = (new StringBuilder()).append("\n");
/* 68 */     this(); (new StringBuilder()).append("Managed meshes/app: { "); Iterator<t90> iterator; for (iterator = re0.fg.keySet().iterator(); iterator.hasNext(); ) { stringBuilder2.append(((fQ)re0.fg.get((x)iterator.next())).Z8); stringBuilder2.append(" "); }  stringBuilder2.append("}"); stringBuilder3
/* 69 */       .append(stringBuilder1.append(stringBuilder2.toString()).toString()); stringBuilder3.append("\n" + Texture.getManagedStatus());
/*    */     
/* 71 */     stringBuilder3.append("\n\nAllocated Unsafe Bytes: " + LF.F6(BufferUtils.Ri0)); byte b1 = 0, b2 = 0;
/*    */ 
/*    */     
/* 74 */     for (iterator = km.wI0.Iv.cOm1.values().iterator(); iterator.hasNext(); ) { if (((t90)iterator.next()).isCopy()) { b2++; continue; }  b1++; }  stringBuilder3.append("\n\nFont Count Distinct: " + b1 + "\nFont Count Copies: " + b2); this.xM.E1(stringBuilder3.toString()); }
/*    */ 
/*    */   
/*    */   public static h2 nL0;
/*    */   public ge0 Bi0;
/*    */   public ge0 Kt0;
/*    */   public ge0 E70;
/*    */   public ge0 VQ;
/*    */   public ge0 JJ;
/*    */   public ge0 Db0;
/*    */   public Un HC0;
/*    */   public yb0 Ku0;
/*    */   public Vs0 b0;
/*    */   public Ht M4;
/*    */   public Ld jv0;
/*    */   public TL wM;
/*    */   public gH he0;
/*    */   public c1 qn0;
/*    */   public kK0 VX;
/*    */   public n4 CO;
/*    */   public dQ xM;
/*    */   public N1 SW;
/*    */   public YE GL;
/*    */   public lO fk;
/*    */   public fQ Xr = new fQ();
/*    */   public long Qr0;
/*    */   public xr0 zB0 = null;
/*    */   
/*    */   public h2() {
/*    */     Xu("gmpanel");
/*    */     (this.xM = new dQ("")).Xu("label-bg");
/*    */     J8(this.xM);
/*    */     (this.Bi0 = new ge0("")).Gq0("GM Menu");
/*    */     this.Bi0.Pb0(50);
/*    */     this.Bi0.tW(new Pl0(this));
/*    */     this.Xr.Com3(this.Bi0);
/*    */     (this.Kt0 = new ge0("")).Gq0("Player Search");
/*    */     this.Kt0.Pb0(50);
/*    */     this.Kt0.tW(new z50(this));
/*    */     this.Xr.Com3(this.Kt0);
/*    */     (this.E70 = new ge0("")).Gq0("Teleport");
/*    */     this.E70.Pb0(50);
/*    */     this.E70.tW(new Tk(this));
/*    */     this.Xr.Com3(this.E70);
/*    */     (this.VQ = new ge0("")).Gq0("Search");
/*    */     this.VQ.Pb0(50);
/*    */     this.VQ.tW(new nI(this));
/*    */     this.Xr.Com3(this.VQ);
/*    */     (this.JJ = new ge0("")).Gq0("Mute/Unmute");
/*    */     this.JJ.Pb0(50);
/*    */     this.JJ.tW(new CB(this));
/*    */     this.Xr.Com3(this.JJ);
/*    */     (this.Db0 = new ge0("")).Gq0("Australia Mode");
/*    */     this.Db0.Pb0(50);
/*    */     this.Db0.tW(new xJ(this));
/*    */     this.Xr.Com3(this.Db0);
/*    */     (this.HC0 = new Un("")).Gq0("Client GC");
/*    */     this.HC0.Pb0(50);
/*    */     this.HC0.tW(System::gc);
/*    */     this.Xr.Com3(this.HC0);
/*    */     this.Bi0.Xu("button-tools");
/*    */     this.Kt0.Xu("button-player");
/*    */     this.E70.Xu("button-move");
/*    */     this.VQ.Xu("button-search");
/*    */     this.JJ.Xu("button-sound");
/*    */     this.Db0.Xu("button-ping");
/*    */     this.HC0.Xu("button-gc");
/*    */     Hc0 hc0 = this.Xr.r30();
/*    */     while (hc0.hasNext())
/*    */       J8((Un)hc0.next()); 
/*    */     wI0(false);
/*    */     this.xM.wI0(false);
/*    */     nL0 = this;
/*    */   }
/*    */   
/*    */   public final void J8(JG0 paramJG0) {
/*    */     si(paramJG0, Ub());
/*    */     if (paramJG0 instanceof lO)
/*    */       this.fk = (lO)paramJG0; 
/*    */     paramJG0.mM();
/*    */     int i = this.xY / 2 - paramJG0.xY / 2, j = e3();
/*    */     paramJG0.Ol0(i, (Hy() - paramJG0.HC) / 2 + j);
/*    */   }
/*    */   
/*    */   public final boolean jf0(JG0 paramJG0) {
/*    */     if (paramJG0 == this.Ku0) {
/*    */       this.Ku0 = null;
/*    */     } else if (paramJG0 == this.jv0) {
/*    */       this.jv0 = null;
/*    */     } else if (paramJG0 == this.b0) {
/*    */       this.b0 = null;
/*    */     } else if (paramJG0 == this.wM) {
/*    */       this.wM = null;
/*    */     } else if (paramJG0 != null) {
/*    */       if (paramJG0 == this.VX) {
/*    */         this.VX = null;
/*    */       } else if (paramJG0 == this.CO) {
/*    */         this.CO = null;
/*    */       } else if (paramJG0 != null && paramJG0 != null) {
/*    */         if (paramJG0 == this.he0) {
/*    */           this.he0 = null;
/*    */         } else if (paramJG0 == this.fk) {
/*    */           this.fk = null;
/*    */         } else if (paramJG0 == this.GL) {
/*    */           this.GL = null;
/*    */         } else if (paramJG0 == this.qn0) {
/*    */           this.qn0 = null;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     if (super.jf0(paramJG0)) {
/*    */       xI0();
/*    */       return true;
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     byte b;
/*    */     Tm(km.wI0.dG(), km.wI0.k1());
/*    */     this.xM.C70(et.Em);
/*    */     this.xM.ME(km.wI0.dG() - Math.max(200, this.xM.Td0()) + 60, 60);
/*    */     int i = pA.Dg0.fe.HC;
/*    */     if (km.XU()) {
/*    */       b = 65;
/*    */     } else {
/*    */       b = 5;
/*    */     } 
/*    */     if (km.Nr()) {
/*    */       fQ fQ1;
/*    */       for (byte b1 = 0; b1 < (fQ1 = this.Xr).Z8; ) {
/*    */         un.mM();
/*    */         Un un;
/*    */         (un = (Un)fQ1.get(b1)).ME(b, b1 * un.HC + i);
/*    */         b1++;
/*    */       } 
/*    */     } else {
/*    */       i = 0;
/*    */       fQ fQ1;
/*    */       while (i < (fQ1 = this.Xr).Z8) {
/*    */         Un un;
/*    */         (un = (Un)fQ1.get(i)).uh0(64, 64);
/*    */         ((Un)fQ1.get(i)).Tm(64, 64);
/*    */         ((Un)fQ1.get(i)).mM();
/*    */         byte b1 = 0;
/*    */         if (pA.Dg0.Od0 != null)
/*    */           b1 = 100; 
/*    */         et et = et.kL0;
/*    */         int k = this.Xr.Z8 / 2;
/*    */         int m = un.xY, j = -(k * m);
/*    */         un.QJ0(et, m * i + j - b1, 0);
/*    */         i++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Pn() {
/*    */     if (this.M4 != null)
/*    */       return; 
/*    */     boolean bool = true;
/*    */     this.E70.TG0.Fx0(bool);
/*    */     this(this);
/*    */     Ht ht;
/*    */     this.M4 = new Ht();
/*    */     pA.Dg0.J8(ht);
/*    */   }
/*    */   
/*    */   public final void cH0() {
/*    */     Ht ht;
/*    */     if ((ht = this.M4) == null)
/*    */       return; 
/*    */     pA.Dg0.jf0(ht);
/*    */     boolean bool = false;
/*    */     this.E70.TG0.Fx0(bool);
/*    */     this.M4 = null;
/*    */   }
/*    */   
/*    */   public final void aJ() {
/*    */     if (this.qn0 != null)
/*    */       return; 
/*    */     this(this);
/*    */     c1 c11;
/*    */     this.qn0 = c11;
/*    */     J8(c11);
/*    */   }
/*    */   
/*    */   public final void ax() {
/*    */     c1 c11;
/*    */     if ((c11 = this.qn0) == null)
/*    */       return; 
/*    */     jf0(c11);
/*    */   }
/*    */   
/*    */   public final void dw0() {
/*    */     if (this.b0 != null)
/*    */       return; 
/*    */     this(this);
/*    */     Vs0 vs0;
/*    */     this.b0 = vs0;
/*    */     J8(vs0);
/*    */   }
/*    */   
/*    */   public final void jx() {
/*    */     if (this.wM != null)
/*    */       return; 
/*    */     this(this);
/*    */     TL tL;
/*    */     this.wM = tL;
/*    */     J8(tL);
/*    */   }
/*    */   
/*    */   public final void N10() {
/*    */     if (this.he0 != null)
/*    */       return; 
/*    */     this(this);
/*    */     gH gH1;
/*    */     this.he0 = gH1;
/*    */     J8(gH1);
/*    */   }
/*    */   
/*    */   public final void O30() {
/*    */     if (this.jv0 != null)
/*    */       return; 
/*    */     this(this);
/*    */     Ld ld;
/*    */     this.jv0 = ld;
/*    */     J8(ld);
/*    */   }
/*    */   
/*    */   public final void cOn() {
/*    */     if (this.CO == null) {
/*    */       n4 n41;
/*    */       this(this);
/*    */       this.CO = new n4();
/*    */       J8(n41);
/*    */       VA0.c90(this.CO);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void kB() {
/*    */     String str = "";
/*    */     YE yE;
/*    */     if ((yE = this.GL) != null) {
/*    */       yE.coM6.Be0(str, false);
/*    */     } else {
/*    */       this(this);
/*    */       this.GL = new YE();
/*    */       yE.coM6.Be0(str, false);
/*    */       J8(this.GL);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean p3() {
/*    */     N1 n1;
/*    */     return ((n1 = this.SW) != null && n1.p3()) ? true : super.p3();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/h2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */