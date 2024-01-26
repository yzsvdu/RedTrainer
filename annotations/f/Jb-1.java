/*   1 */ package f;public final class Jb extends SI0 { public final void p4(kf paramkf) { byte b2; Gp0 gp0 = paramkf.AD;
/*     */     
/*     */     j40 j402;
/*   4 */     int j = this.Fh0 - (j402 = this.Ry0).Zs.pA, m = 0; MD0 mD0;
/*   5 */     if ((mD0 = this.nl) != null) {
/*   6 */       j = mD0.vE0;
/*   7 */       int i2, i3, i4 = j + mD0.sV + (j = mD0.K0) + (m = mD0.vF0) + (i3 = mD0.RW) + (b2 = mD0.RB) + (i2 = mD0.Qm); byte b3 = 0; if (mD0.sV > 0) b3 = (byte)1;  if (j > 0) b3 = (byte)(b3 | 0x2);  if (m > 0) b3 = (byte)(b3 | 0x4);  if (i3 > 0) b3 = (byte)(b3 | 0x8);  if (b2 > 0) b3 = (byte)(b3 | 0x10);  if (i2 > 0) b3 = (byte)(b3 | 0x20);  if (b3 != 0) { m = j = 1; } else { m = j = 0; }  j = i4;
/*   8 */     }  F40 f40 = F40.ef0; int i1 = 15; if (m != 0) { b2 = 43; } else { b2 = 42; }  arrayOfString[0] = j402.m(); String[] arrayOfString; (arrayOfString = new String[2])[1] = Integer.toString(j); paramkf
/*     */       
/*  10 */       .Kq(Ml0.lz((byte)2, f40, i1, b2, arrayOfString)); if (m != 0) { Ag ag; r6 r6; this(); (new Ag())
/*  11 */         .V9("[#ff8a00]");
/*     */       
/*  13 */       (new Ag()).V9(NumberFormat.getInstance().format(this.nl.vE0)); (new Ag()).V9("[#] ");
/*     */       
/*  15 */       (new Ag()).V9(Ml0.OH0(5050));
/*  16 */       if (this.nl.sV > 0) { ag
/*  17 */           .V9(" +"); ag.V9("[#ff8a00]");
/*     */         
/*  19 */         ag.V9(NumberFormat.getInstance().format(this.nl.sV)); ag.V9("[#] ");
/*     */         
/*  21 */         ag.V9(Ml0.OH0(5051)); }
/*  22 */        if (this.nl.K0 > 0) { ag
/*  23 */           .V9(" +"); ag.V9("[#ff8a00]");
/*     */         
/*  25 */         ag.V9(NumberFormat.getInstance().format(this.nl.K0)); ag.V9("[#] ");
/*     */         
/*  27 */         ag.V9(Ml0.OH0(5052)); }
/*  28 */        if (this.nl.vF0 > 0) { ag
/*  29 */           .V9(" +"); ag.V9("[#ff8a00]");
/*     */         
/*  31 */         ag.V9(NumberFormat.getInstance().format(this.nl.vF0)); ag.V9("[#] ");
/*     */         
/*  33 */         ag.V9(Ml0.OH0(5053)); }
/*  34 */        if (this.nl.Qm > 0) { ag
/*  35 */           .V9(" +"); ag.V9("[#ff8a00]");
/*     */         
/*  37 */         ag.V9(NumberFormat.getInstance().format(this.nl.Qm)); ag.V9("[#] ");
/*     */         
/*  39 */         ag.V9(Ml0.OH0(101652)); }
/*  40 */        if (this.nl.RW > 0) { ag
/*  41 */           .V9(" +"); ag.V9("[#ff8a00]");
/*     */         
/*  43 */         ag.V9(NumberFormat.getInstance().format(this.nl.RW)); ag.V9("[#] ");
/*     */         
/*  45 */         ag.V9(Ml0.OH0(5054)); }
/*  46 */        if (this.nl.RB > 0) { ag
/*  47 */           .V9(" +"); ag.V9("[#ff8a00]");
/*     */         
/*  49 */         ag.V9(NumberFormat.getInstance().format(this.nl.RB)); ag.V9("[#] ");
/*     */         
/*  51 */         ag.V9(Ml0.OH0(5055)); }
/*  52 */        this(ag.toString());
/*  53 */       paramkf.YP.add(r6); }  byte b1 = 0;
/*     */ 
/*     */     
/*  56 */     j = this.Ry0.Zs.od;
/*     */ 
/*     */ 
/*     */     
/*  60 */     int k = this.Ry0.VP.eb.GJ(j);
/*     */     
/*     */     int n;
/*  63 */     i1 = (n = this.Ry0.VP.eb.GJ(++j)) - k; float f2 = (this.Fh0 - k) / i1; while (this.Fh0 > n && this.qH0 >= j) b1++;  if (f2 >= 1.0F) f2 = 0.99F;  for (float f1 = f2 + b1; j < gp0.wI(gp0.hG0()); ) { if (gp0.N0(gp0.hG0(), j) != null && gp0.N0(gp0.hG0(), j).ih() == this.Ry0
/*  64 */         .Jg)
/*  65 */       { os os; this(f1, paramkf.Oh(gp0.hG0(), j));
/*  66 */         paramkf.YP.add(os); }  j = (byte)(j + 1); }
/*     */     
/*  68 */     if (this.Ry0.Zs
/*  69 */       .od != this
/*  70 */       .qH0) { for (byte b3 = 0; b3 < gp0.wI(gp0.hG0()); ) { hm0 hm0; j40 j403; if ((hm0 = gp0.N0(gp0.hG0(), b3)) != null && hm0.ih() == (j403 = this.Ry0)
/*  71 */           .Jg)
/*  72 */         { n = this.qH0;
/*  73 */           hm0.fh = 0;
/*  74 */           hm0.K0.ta
/*  75 */             .od = n;
/*     */ 
/*     */           
/*  78 */           hm0.K0.hp0 = j403.Fq0.Mm(hR.Gg);
/*     */ 
/*     */ 
/*     */           
/*  82 */           hm0.tx(this.Ry0.Zs.Hq0); paramkf.Oh(gp0.hG0(), b3); paramkf.t80(new m5(hm0)); }  b3 = (byte)(b3 + 1); }  String[] arrayOfString1; (arrayOfString1 = new String[2])[0] = this.Ry0.m(); (new String[2])[
/*  83 */           1] = N.Gl0(new StringBuilder(), this.qH0, "");
/*     */ 
/*     */       
/*  86 */       paramkf.Kq(Ml0.lz((byte)2, F40.ef0, 15, 60, arrayOfString1)); }
/*     */      j40 j401; Q90 q90;
/*  88 */     j = (q90 = (j401 = this.Ry0).Zs).pA;
/*  89 */     q90
/*  90 */       .od = b;
/*  91 */     int i = this.Fh0; byte b;
/*  92 */     if ((b = this.qH0) < 100 && i >= 
/*  93 */       j401.VP
/*  94 */       .eb
/*  95 */       .GJ(b + 1) && j < 
/*  96 */       (j401 = this.Ry0).VP
/*  97 */       .eb
/*     */ 
/*     */       
/* 100 */       .GJ(j401.Zs.od + 2)) { String[] arrayOfString1; (arrayOfString1 = new String[2])[0] = this.Ry0.m(); (new String[2])[
/*     */ 
/*     */           
/* 103 */           1] = (this.Ry0.Zs.od + 1) + ""; paramkf.Kq(Ml0.sB(5028, arrayOfString1)); }  km.u4.W0(this.Ry0); }
/*     */ 
/*     */   
/*     */   public j40 Ry0;
/*     */   public byte qH0;
/*     */   public int Fh0;
/*     */   public MD0 nl;
/*     */   
/*     */   public Jb(j40 paramj40, byte paramByte, int paramInt) {
/*     */     MD0 mD0;
/*     */     this();
/*     */     this.nl = this;
/*     */     this.Ry0 = paramj40;
/*     */     this.qH0 = paramByte;
/*     */     this.Fh0 = paramInt;
/*     */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */