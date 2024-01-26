/*    */ package f;public final class ia0 extends Ip implements Bf { public static final Hu0 tt0 = Hu0.cD0[0]; public static LPT3 Ga0; public final kf vJ0; public final rS os0; public final Ip Ym0; public final dQ l30; public final vF0 BJ; public Hu0 c70; public Un Qh; public final dQ ft; public final Un QI0; public final Un NL0; public iG0[] public; public int kt0; public Dk K90; public ex cB; public int coM7; public int Ds0; public int Kc; public int gA0; public yM WR; public EnumMap cm0;
/*    */   public final boolean sU() { return true; }
/*  3 */   public final void Ae0() { arrayOfJG0[0] = this.QI0; arrayOfJG0[1] = this.ft; JG0[] arrayOfJG0; (arrayOfJG0 = new JG0[3])[2] = this.NL0; WN((new g0(this)).ee0((new cr0(this)).ee0(AUX(new JG0[3])).Ya(this.os0)).Ya(this.Ym0)); if (km.Nr())
/*    */     
/*    */     { 
/*    */       
/*  7 */       dQ dQ1 = this.ft; et et; rK0((new cr0(this)).ee0((new g0(this)).ee0((new cr0(this)).lW(et.c5, this.QI0).lW(et = et.Lp, dQ1).lW(et.COM2, this.NL0)).lW(et, this.os0)).lW(et, this.Ym0).Em0()); }
/*    */     
/*    */     else
/*    */     
/* 11 */     { rS rS1 = this.os0; et et; rK0((new cr0(this)).ee0((new g0(this)).ee0((new cr0(this)).lW(et.c5, this.QI0).Em0().lW(et.Wi0, this.ft).Em0().lW(et.COM2, this.NL0)).lW(et = et.Lp, rS1)).lW(et, this.Ym0).Em0().Em0()); }  } public final void wI0(boolean paramBoolean) { super.wI0(paramBoolean); this.K90 = null; this.cB = null; gx(); Ae0(); if (paramBoolean) { Hu0 hu0; HashSet hashSet; zr0 zr0 = km.u4.gN(this.WR); this(Arrays.asList((E[])zr0.ro0())); for (Iterator<List> iterator = this.cm0.values().iterator(); iterator.hasNext(); ((List)iterator.next()).removeIf(hashSet::BE0)); LPT3 lPT3; if ((lPT3 = Ga0) == null) { hu0 = tt0; } else { hu0 = ((LPT3)hu0).Y8; }  CoM2(hu0); }  }
/* 12 */   public final void b(oa0 paramoa0) { Un un; ex ex1; if ((ex1 = this.cB) != null) { ex1.rn(paramoa0); return; }  Dk dk; if ((dk = this.K90) != null) { dk.tH0(paramoa0); return; }  if (h1.J20(paramoa0.GG0, BM.Oq)) { if ((un = this.QI0).kN) hm.Fz0(this.TG0.oh0);  } else if (h1.J20(paramoa0.GG0, BM.M8)) { if ((un = ((ia0)super).NL0).kN) hm.Fz0(this.TG0.oh0);  }
/*    */     else
/* 14 */     { iG0[] arrayOfIG0; int i; if (h1.J20(paramoa0.GG0, BM.ni)) { if ((i = ((ia0)super).kt0) > 0) ((ia0)super).kt0 = i - 1;
/*    */          }
/* 16 */       else if (h1.J20(i.GG0, BM.N70)) { if ((i = ((ia0)super).kt0 + 1) < ((ia0)super).public.length) ((ia0)super).kt0 = i;  }
/*    */       else
/* 18 */       { if (h1.J20(i.GG0, BM.bC)) { Un un1; if ((un1 = ((ia0)super).Qh) != null) {
/*    */ 
/*    */             
/* 21 */             hm.Fz0(un1.TG0.oh0); return;
/* 22 */           }  int j; if ((j = ((ia0)super).kt0) >= (arrayOfIG0 = ((ia0)super).public).length) {
/*    */             return;
/*    */           }
/* 25 */           hm.Fz0((this[j]).TG0.oh0); }  return; }  super.J30(); }  } private void vI0() { Y y; LPT3 lPT3; Dk dk; int i; iG0[] arrayOfIG0; if ((i = this.kt0) < 0 || i >= (arrayOfIG0 = this.public).length) return;  s00 s00; (s00 = (arrayOfIG0[i]).pP).getClass(); if (km.MR != null) { Xj0 xj0; this(); sw[] arrayOfSw; int j; byte b; for (j = (arrayOfSw = km.MR.tr0).length, b = 0; b < j; ) { Y y1; sw sw; if ((sw = arrayOfSw[b]) != null && sw.xR == Ue0.Dd0 && (y1 = sw.LK) != null) xj0.Lh0(y1.Lh.Wy);  b++; }  for (Iterator<Y> iterator = s00.ig.iterator(); iterator.hasNext(); ) { Y y1; if (xj0.xC((y1 = iterator.next()).Lh.Wy) >= y1.Lh.Sf0) continue;  s00.ah = y1; }  }  switch (s00.c0.default(true).ordinal()) { default: return;case 2: case 3: case 5: case 6: y = s00.ah; if ((dk = this.K90) != null) { jf0(dk); this.K90 = null; }  gx(); lPT3 = y.Bp0; this(this, lPT3, y.Lh.Wy, false); this.K90 = new Dk(); VA0.c90(dk.y()); WN(vo0(new JG0[] { this.K90 })); rK0(AUX(new JG0[] { this.K90 }));
/*    */       
/*    */       case 1:
/*    */         break; }
/*    */ 
/*    */     
/* 31 */     ZN(((s00)lPT3).c0.bj0, ((s00)lPT3).ah.Lh.Wy, 0, (short)1, (byte)-1); }
/*    */ 
/*    */   
/*    */   public final void J30() {
/*    */     int i;
/*    */     iG0[] arrayOfIG0;
/*    */     if ((i = this.kt0) >= (arrayOfIG0 = this.public).length) {
/*    */       this.l30.E1("");
/*    */       this.BJ.TS.H();
/*    */       return;
/*    */     } 
/*    */     VA0.c90(arrayOfIG0[i]);
/*    */     this.os0.ai(this.public[this.kt0]);
/*    */   }
/*    */   
/*    */   public final void CoM2(Hu0 paramHu0) {
/*    */     if (paramHu0 == null)
/*    */       return; 
/*    */     this.c70 = paramHu0;
/*    */     this.ft.E1(Ml0.OH0(paramHu0.jC0));
/*    */     Un un2 = this.QI0;
/*    */     int j;
/*    */     Hu0[] arrayOfHu0;
/*    */     if ((j = paramHu0.rr - 1) < 0 || j >= (arrayOfHu0 = Hu0.cD0).length) {
/*    */       hu02 = null;
/*    */     } else {
/*    */       hu02 = arrayOfHu0[hu02];
/*    */     } 
/*    */     if (hu02 != null) {
/*    */       i = 1;
/*    */     } else {
/*    */       i = 0;
/*    */     } 
/*    */     un2.sk0(i);
/*    */     un2 = this.NL0;
/*    */     int i;
/*    */     if ((i = paramHu0.rr + 1) < 0 || i >= (arrayOfHu0 = Hu0.cD0).length) {
/*    */       hu01 = null;
/*    */     } else {
/*    */       hu01 = arrayOfHu0[hu01];
/*    */     } 
/*    */     if (hu01 != null) {
/*    */       bool2 = true;
/*    */     } else {
/*    */       bool2 = false;
/*    */     } 
/*    */     un2.sk0(bool2);
/*    */     this();
/*    */     Ip ip;
/*    */     Hu0 hu02, hu01;
/*    */     boolean bool2;
/*    */     cr0 cr0;
/*    */     g0 g0;
/*    */     Xj0 xj0;
/*    */     ArrayList<s00> arrayList;
/*    */     this(ip);
/*    */     this(ip);
/*    */     this();
/*    */     sw[] arrayOfSw;
/*    */     int k;
/*    */     byte b2;
/*    */     for (k = (arrayOfSw = km.MR.tr0).length, b2 = 0; b2 < k; ) {
/*    */       sw sw;
/*    */       Y y;
/*    */       if ((sw = arrayOfSw[b2]) != null && sw.xR == Ue0.Dd0 && (y = sw.LK) != null)
/*    */         xj0.Lh0(y.Lh.Wy); 
/*    */       b2++;
/*    */     } 
/*    */     this();
/*    */     for (Iterator<s00> iterator = ((List)this.cm0.get(paramHu0)).iterator(); iterator.hasNext(); ) {
/*    */       s00 s00;
/*    */       if (xj0.xC((s00 = iterator.next()).ah.Lh.Wy) >= s00.fD0)
/*    */         continue; 
/*    */       arrayList.add(s00);
/*    */     } 
/*    */     byte b1;
/*    */     iG0[] arrayOfIG0;
/*    */     for (this.public = new iG0[arrayList.size()], b1 = 0; b1 < (arrayOfIG0 = this.public).length; ) {
/*    */       arrayOfIG0[b1] = new iG0(this, arrayList.get(b1), b1);
/*    */       b1++;
/*    */     } 
/*    */     Un un1;
/*    */     if ((un1 = this.Qh) != null)
/*    */       un1.wI0(arrayList.isEmpty() ^ true); 
/*    */     cr0.Mg((JG0[])this.public);
/*    */     g0.Mg((JG0[])this.public);
/*    */     ip.WN(cr0);
/*    */     ip.rK0(g0);
/*    */     this.os0.Gz0(ip);
/*    */     boolean bool1 = false;
/*    */     if (Ga0 != null) {
/*    */       iG0[] arrayOfIG01;
/*    */       for (byte b = 0; b < (arrayOfIG01 = this.public).length; ) {
/*    */         iG0 iG01;
/*    */         if ((iG01 = arrayOfIG01[b]) != null && iG01.pP.c0 == Ga0) {
/*    */           VA0.c90(iG01);
/*    */           this.os0.ai(iG01);
/*    */           this.kt0 = b;
/*    */           bool1 = true;
/*    */           break;
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     if (!bool1) {
/*    */       this.kt0 = 0;
/*    */       Ga0 = null;
/*    */     } 
/*    */     J30();
/*    */     d40();
/*    */   }
/*    */   
/*    */   public final void ZN(short paramShort1, int paramInt1, int paramInt2, short paramShort2, byte paramByte) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/km.u4 : Lf/R8;
/*    */     //   3: aload_0
/*    */     //   4: getfield WR : Lf/yM;
/*    */     //   7: invokevirtual gN : (Lf/yM;)Lf/zr0;
/*    */     //   10: dup
/*    */     //   11: astore #4
/*    */     //   13: ifnonnull -> 17
/*    */     //   16: return
/*    */     //   17: aload #4
/*    */     //   19: iload_2
/*    */     //   20: invokevirtual u60 : (I)Lf/Y;
/*    */     //   23: dup
/*    */     //   24: astore_2
/*    */     //   25: ifnonnull -> 29
/*    */     //   28: return
/*    */     //   29: iload_1
/*    */     //   30: invokestatic l90 : (S)S
/*    */     //   33: dup
/*    */     //   34: istore #4
/*    */     //   36: iconst_1
/*    */     //   37: if_icmpeq -> 112
/*    */     //   40: iload #4
/*    */     //   42: sipush #5001
/*    */     //   45: if_icmpeq -> 112
/*    */     //   48: iload #4
/*    */     //   50: sipush #5016
/*    */     //   53: if_icmpeq -> 112
/*    */     //   56: iload #4
/*    */     //   58: sipush #5044
/*    */     //   61: if_icmpeq -> 112
/*    */     //   64: aload_0
/*    */     //   65: getfield vJ0 : Lf/kf;
/*    */     //   68: dup
/*    */     //   69: astore_0
/*    */     //   70: getfield n00 : Lf/ia0;
/*    */     //   73: getfield dP : Z
/*    */     //   76: ifne -> 82
/*    */     //   79: goto -> 180
/*    */     //   82: aload_0
/*    */     //   83: new f/sw
/*    */     //   86: dup
/*    */     //   87: astore_1
/*    */     //   88: aload_0
/*    */     //   89: getfield lv : Lf/mJ;
/*    */     //   92: astore_0
/*    */     //   93: getstatic f/Ue0.ag : Lf/Ue0;
/*    */     //   96: pop
/*    */     //   97: aload_0
/*    */     //   98: aload_2
/*    */     //   99: iload_3
/*    */     //   100: iload #5
/*    */     //   102: invokespecial <init> : (Lf/mJ;Lf/Y;IB)V
/*    */     //   105: aload_1
/*    */     //   106: invokevirtual B5 : (Lf/sw;)V
/*    */     //   109: goto -> 180
/*    */     //   112: aload_0
/*    */     //   113: getfield vJ0 : Lf/kf;
/*    */     //   116: ldc_w f/h70
/*    */     //   119: invokestatic I8 : (Lf/JG0;Ljava/lang/Class;)Z
/*    */     //   122: ifeq -> 126
/*    */     //   125: return
/*    */     //   126: getstatic f/Of.eH : Lf/Of;
/*    */     //   129: iload_1
/*    */     //   130: invokevirtual On0 : (S)Lf/LPT3;
/*    */     //   133: astore_1
/*    */     //   134: getstatic f/js.vu0 : Lf/js;
/*    */     //   137: new f/h70
/*    */     //   140: dup
/*    */     //   141: dup
/*    */     //   142: aload_0
/*    */     //   143: aload_2
/*    */     //   144: aload_1
/*    */     //   145: getfield Iu : I
/*    */     //   148: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   151: sipush #1435
/*    */     //   154: swap
/*    */     //   155: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   158: astore_1
/*    */     //   159: iload_3
/*    */     //   160: iload #5
/*    */     //   162: <illegal opcode> run : (Lf/ia0;Lf/Y;IB)Ljava/lang/Runnable;
/*    */     //   167: aload_1
/*    */     //   168: swap
/*    */     //   169: aload_0
/*    */     //   170: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Lf/JG0;)V
/*    */     //   173: iconst_1
/*    */     //   174: putfield sD0 : Z
/*    */     //   177: invokevirtual uh : (Lf/h70;)V
/*    */     //   180: aload_2
/*    */     //   181: getfield Bp0 : Lf/LPT3;
/*    */     //   184: putstatic f/ia0.Ga0 : Lf/LPT3;
/*    */     //   187: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 70
/*    */     //   #2	-> 73
/*    */     //   #3	-> 83
/*    */     //   #4	-> 113
/*    */     //   #5	-> 126
/*    */     //   #6	-> 130
/*    */     //   #7	-> 134
/*    */     //   #8	-> 137
/*    */     //   #9	-> 145
/*    */     //   #10	-> 155
/*    */     //   #11	-> 174
/*    */     //   #12	-> 177
/*    */     //   #13	-> 181
/*    */     //   #14	-> 184
/*    */   }
/*    */   
/*    */   public final void yL0(LPT3 paramLPT3, int paramInt, j40 paramj40) {
/*    */     ex ex2;
/*    */     if ((ex2 = this.cB) != null) {
/*    */       jf0(ex2);
/*    */       this.cB = null;
/*    */     } 
/*    */     gx();
/*    */     this(this, paramLPT3, paramInt, paramj40);
/*    */     this.cB = new ex();
/*    */     WN(vo0(new JG0[] { ex2 }));
/*    */     rK0(AUX(new JG0[] { this.cB }));
/*    */     ex ex1;
/*    */     Un[] arrayOfUn;
/*    */     int i;
/*    */     if ((i = (ex1 = this.cB).aJ) >= 0 && i < (arrayOfUn = this.Tn).length)
/*    */       VA0.c90(this[i]); 
/*    */   }
/*    */   
/*    */   public final void kJ() {}
/*    */   
/*    */   public final void uV(short paramShort, Q90 paramQ90) {}
/*    */   
/*    */   public ia0(kf paramkf) {
/*    */     Un un2;
/*    */     dQ dQ1;
/*    */     HashMap<Object, Object> hashMap;
/*    */     this.kt0 = 0;
/*    */     this.cm0 = new EnumMap<>(Hu0.class);
/*    */     this.vJ0 = paramkf;
/*    */     if (km.XU()) {
/*    */       Xu("battle-panel");
/*    */     } else {
/*    */       Xu("battle-item-usage-panel");
/*    */     } 
/*    */     this.ft = new dQ();
/*    */     this("≪");
/*    */     this.QI0 = new Un();
/*    */     this("≫");
/*    */     this.NL0 = un3;
/*    */     un2.tW(this::PY);
/*    */     Un un3;
/*    */     (un3 = new Un()).tW(this::D90);
/*    */     this.WR = km.u4.Uo0();
/*    */     (this.os0 = new rS()).zG0(2);
/*    */     this.Ym0 = new Ip();
/*    */     this("");
/*    */     this.l30 = new dQ();
/*    */     this();
/*    */     rS rS1;
/*    */     (rS1 = new rS()).Gz0(dQ1);
/*    */     (new rS()).zG0(2);
/*    */     (this.BJ = new vF0(64, 64)).ZH0().zT(6, 6);
/*    */     (new vF0(64, 64)).Xu("battle-item-pic");
/*    */     this(Ml0.OH0(1410));
/*    */     this.Qh = un1;
/*    */     Un un1;
/*    */     (un1 = new Un()).tW(this::vI0);
/*    */     this();
/*    */     Y[] arrayOfY;
/*    */     int i = (arrayOfY = km.u4.gN(this.WR).ro0()).length;
/*    */     byte b;
/*    */     for (b = 0; b < i; b++) {
/*    */       Y y;
/*    */       if ((y = arrayOfY[b]).Ng().default(true) != dv.wS)
/*    */         ((s00)hashMap.computeIfAbsent(y.Ng(), s00::new)).V1(y); 
/*    */     } 
/*    */     Hu0[] arrayOfHu0;
/*    */     i = (arrayOfHu0 = Hu0.It).length;
/*    */     for (b = 0; b < i; b++) {
/*    */       ArrayList arrayList;
/*    */       Hu0 hu0 = arrayOfHu0[b];
/*    */       this();
/*    */       this.cm0.put(hu0, arrayList);
/*    */     } 
/*    */     for (s00 s00 : hashMap.values())
/*    */       ((List<s00>)this.cm0.get(s00.c0.ws0())).add(s00); 
/*    */     Iterator<List> iterator = this.cm0.values().iterator();
/*    */     while (iterator.hasNext()) {
/*    */       List<?> list;
/*    */       Iterator<?> iterator1 = (list = iterator.next()).iterator();
/*    */       while (iterator1.hasNext())
/*    */         ((s00)iterator1.next()).Tn(); 
/*    */       Collections.sort(list);
/*    */     } 
/*    */     if (km.Nr()) {
/*    */       this.Qh.s6(Ml0.OH0(5029));
/*    */       this.Qh.Xu("battle-button-confirm");
/*    */       vF0 vF01 = this.BJ;
/*    */       et et;
/*    */       this.Ym0.WN(this.Ym0.d7().ee0(this.Ym0.mE0().lW(et = et.Wi0, vF01).lW(et, rS1)).Em0().lW(et.F30, this.Qh));
/*    */       this.Ym0.rK0(this.Ym0.vo0(new JG0[] { this.BJ }).ee0(this.Ym0.AUX(new JG0[] { rS1 }).lW(et.c5, this.Qh)));
/*    */     } else {
/*    */       vF0 vF01 = this.BJ;
/*    */       et et;
/*    */       this.Ym0.WN(this.Ym0.d7().ee0(this.Ym0.mE0().lW(et = et.Wi0, vF01).lW(et, rS1)).Em0().lW(et.F30, this.Qh));
/*    */       this.Ym0.rK0(this.Ym0.mE0().ee0(this.Ym0.vo0(new JG0[] { this.BJ, rS1 })).lW(et.Lp, this.Qh));
/*    */     } 
/*    */     WN(mE0().Mg(new JG0[] { this.os0, this.Ym0 }));
/*    */     rK0(d7().Mg(new JG0[] { this.os0, this.Ym0 }));
/*    */     this.l30.Xu("label-black");
/*    */     this.ft.Xu("label-black");
/*    */     Ae0();
/*    */   }
/*    */   
/*    */   private void Qe(Y paramY, int paramInt, byte paramByte) {
/*    */     kf kf1;
/*    */     if ((kf1 = this.vJ0).n00.dP) {
/*    */       sw sw;
/*    */       mJ mJ = this.lv;
/*    */       this(this, paramY, paramInt, paramByte);
/*    */       B5(sw);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void D90() {
/*    */     Hu0 hu0;
/*    */     int i;
/*    */     Hu0[] arrayOfHu0;
/*    */     if ((i = this.c70.rr + 1) < 0 || i >= (arrayOfHu0 = Hu0.cD0).length) {
/*    */       hu0 = null;
/*    */     } else {
/*    */       hu0 = arrayOfHu0[hu0];
/*    */     } 
/*    */     CoM2(hu0);
/*    */   }
/*    */   
/*    */   private void PY() {
/*    */     Hu0 hu0;
/*    */     int i;
/*    */     Hu0[] arrayOfHu0;
/*    */     if ((i = this.c70.rr - 1) < 0 || i >= (arrayOfHu0 = Hu0.cD0).length) {
/*    */       hu0 = null;
/*    */     } else {
/*    */       hu0 = arrayOfHu0[hu0];
/*    */     } 
/*    */     CoM2(hu0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ia0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */