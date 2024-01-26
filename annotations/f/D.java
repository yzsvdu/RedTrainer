/*    */ package f;public final class D extends JG0 { public static D N2; public Oe0 vt; public Wr prn; public YA0 Q50; public fQ hp; public ga0 l00; public YA0 Mn; public JG0 ni; public D() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup
/*    */     //   3: invokespecial <init> : ()V
/*    */     //   6: new f/fQ
/*    */     //   9: dup
/*    */     //   10: iconst_4
/*    */     //   11: invokespecial <init> : (I)V
/*    */     //   14: putfield hp : Lf/fQ;
/*    */     //   17: ldc 'debugui'
/*    */     //   19: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   22: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   25: invokevirtual Kh : ()Lf/Xi;
/*    */     //   28: dup
/*    */     //   29: astore_1
/*    */     //   30: ifnonnull -> 34
/*    */     //   33: return
/*    */     //   34: aload_0
/*    */     //   35: dup
/*    */     //   36: dup2
/*    */     //   37: dup2
/*    */     //   38: dup2
/*    */     //   39: dup2
/*    */     //   40: dup2
/*    */     //   41: dup2
/*    */     //   42: dup2
/*    */     //   43: dup2
/*    */     //   44: dup2
/*    */     //   45: dup2
/*    */     //   46: aload_1
/*    */     //   47: invokevirtual AP : ()V
/*    */     //   50: new f/Oe0
/*    */     //   53: dup
/*    */     //   54: invokespecial <init> : ()V
/*    */     //   57: putfield vt : Lf/Oe0;
/*    */     //   60: new f/Wr
/*    */     //   63: dup
/*    */     //   64: invokespecial <init> : ()V
/*    */     //   67: putfield prn : Lf/Wr;
/*    */     //   70: iconst_0
/*    */     //   71: invokevirtual Zf0 : (Z)V
/*    */     //   74: new f/YA0
/*    */     //   77: dup
/*    */     //   78: aload_0
/*    */     //   79: swap
/*    */     //   80: dup
/*    */     //   81: invokespecial <init> : ()V
/*    */     //   84: putfield Mn : Lf/YA0;
/*    */     //   87: ldc 'topmenu'
/*    */     //   89: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   92: new f/Un
/*    */     //   95: dup
/*    */     //   96: astore_1
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: dup
/*    */     //   100: ldc 'View'
/*    */     //   102: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   105: <illegal opcode> run : (Lf/D;Lf/Un;)Ljava/lang/Runnable;
/*    */     //   110: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   113: getfield Mn : Lf/YA0;
/*    */     //   116: aload_1
/*    */     //   117: invokevirtual try : (Lf/JG0;)Lf/nJ0;
/*    */     //   120: invokevirtual fu : ()Lf/nJ0;
/*    */     //   123: pop
/*    */     //   124: getfield Mn : Lf/YA0;
/*    */     //   127: astore_1
/*    */     //   128: new f/Un
/*    */     //   131: dup
/*    */     //   132: astore_2
/*    */     //   133: aload_0
/*    */     //   134: aload_2
/*    */     //   135: aload_1
/*    */     //   136: aload_2
/*    */     //   137: dup
/*    */     //   138: ldc 'Debug Options'
/*    */     //   140: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   143: invokevirtual try : (Lf/JG0;)Lf/nJ0;
/*    */     //   146: invokevirtual fu : ()Lf/nJ0;
/*    */     //   149: pop
/*    */     //   150: <illegal opcode> run : (Lf/D;Lf/Un;)Ljava/lang/Runnable;
/*    */     //   155: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   158: getfield Mn : Lf/YA0;
/*    */     //   161: new f/Un
/*    */     //   164: dup
/*    */     //   165: ldc 'Camera Options'
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   170: invokevirtual try : (Lf/JG0;)Lf/nJ0;
/*    */     //   173: invokevirtual fu : ()Lf/nJ0;
/*    */     //   176: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   179: pop
/*    */     //   180: new f/Un
/*    */     //   183: dup
/*    */     //   184: astore_1
/*    */     //   185: aload_0
/*    */     //   186: aload_1
/*    */     //   187: dup
/*    */     //   188: ldc 'Debug Tools'
/*    */     //   190: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   193: <illegal opcode> run : (Lf/D;Lf/Un;)Ljava/lang/Runnable;
/*    */     //   198: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   201: getfield Mn : Lf/YA0;
/*    */     //   204: aload_1
/*    */     //   205: invokevirtual try : (Lf/JG0;)Lf/nJ0;
/*    */     //   208: invokevirtual fu : ()Lf/nJ0;
/*    */     //   211: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   214: pop
/*    */     //   215: getfield vt : Lf/Oe0;
/*    */     //   218: ldc ''
/*    */     //   220: invokevirtual Lo : (Ljava/lang/String;)V
/*    */     //   223: getfield prn : Lf/Wr;
/*    */     //   226: ldc ''
/*    */     //   228: invokevirtual Lo : (Ljava/lang/String;)V
/*    */     //   231: getfield vt : Lf/Oe0;
/*    */     //   234: ldc 'left-panel'
/*    */     //   236: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   239: getfield prn : Lf/Wr;
/*    */     //   242: ldc 'right-panel'
/*    */     //   244: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   247: new f/YA0
/*    */     //   250: dup
/*    */     //   251: invokespecial <init> : ()V
/*    */     //   254: putfield Q50 : Lf/YA0;
/*    */     //   257: new f/rS
/*    */     //   260: dup
/*    */     //   261: dup2
/*    */     //   262: astore_1
/*    */     //   263: aload_0
/*    */     //   264: getfield Q50 : Lf/YA0;
/*    */     //   267: invokespecial <init> : (Lf/JG0;)V
/*    */     //   270: invokevirtual Yl : ()V
/*    */     //   273: iconst_2
/*    */     //   274: invokevirtual zG0 : (I)V
/*    */     //   277: getfield prn : Lf/Wr;
/*    */     //   280: aload_1
/*    */     //   281: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   284: getfield vt : Lf/Oe0;
/*    */     //   287: iconst_2
/*    */     //   288: invokevirtual EP : (I)V
/*    */     //   291: getfield prn : Lf/Wr;
/*    */     //   294: iconst_2
/*    */     //   295: invokevirtual EP : (I)V
/*    */     //   298: getfield Mn : Lf/YA0;
/*    */     //   301: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   304: getfield vt : Lf/Oe0;
/*    */     //   307: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   310: getfield prn : Lf/Wr;
/*    */     //   313: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   316: putstatic f/D.N2 : Lf/D;
/*  1 */     //   319: return } public static boolean hS() { return (N2 != null); } public static void C50() { if (Ah.YP) { Ah.YP = false; }
/*    */     else
/*    */     
/*  4 */     { Ah.YP = true; }
/*  5 */      js.vu0.Pu(-1, 
/*  6 */         "OW Animation Load disabled"); } public static void Wv0() { if (Ah.ai0) { Ah.ai0 = false; } else { Ah.ai0 = true; }  js.vu0.Pu(-1, "Frustum rendering disabled"); } private void ld() { this(); Mc mc; si(this, Ub()); } private void j60() { Xi xi; if (xi = km.wI0.iJ0 instanceof jp0) { sK0 sK0; jp0 jp0 = (jp0)xi; this(this.ff0.sL0); si(sK0, Ub()); }  } private void Q1(Un paramUn) { this(); this("Permission Settings"); hu2.aV.add(hu1); hu1.mD("Disable", this::fg); hu1.mD("View", () -> nP(0)); hu hu1; (hu1 = new hu()).mD("View All Permissions", () -> nP(1)); hu hu2; F7.Gp0(hu2 = new hu(), paramUn); } public final void Gi() { for (Hc0 hc0 = km.wI0.iJ0.wN.r30(); hasNext(); ) { lpt1 lpt1 = ((Ah)next()).K9; boolean bool = true; byte b = 0; while (b < lpt1.lz.Z8) { lpt1
/*  7 */           .rd(b, bool, null); b++; }  }  } public final void HS() { this(); sK0 sK0; si(this, Ub()); } public final void wA0() { for (Hc0 hc0 = km.wI0.iJ0.wN.r30(); hasNext();) ((Ah)next()).K9.uq();  } public final void nP(int paramInt) { Oe0 oe0; fQ fQ1; if ((fQ1 = (oe0 = this.vt).z10).Z8 > 0) { for (Hc0 hc0 = fQ1.r30(); hc0.hasNext(); ) { K0 k0 = (K0)hc0.next(); this.hi0.jf0(k0.cC); }  this.z10.clear(); js.vu0.jf0(this.hi0); }  (this.hi0 = new JG0()).Xu("permContainer");
/*    */     
/*  9 */     JG0 jG0 = this.hi0;
/*    */     
/* 11 */     js.vu0.si(jG0, js.vu0.Ub());
/* 12 */     if (km.a3.Jr0() instanceof Cy) { Cy cy = (Cy)km.a3.Jr0();
/*    */ 
/*    */       
/*    */       eo eo;
/*    */       
/*    */       lF0 lF0;
/*    */       
/*    */       int k;
/*    */       
/* 21 */       for (int i = (int)((eo.y - lF0.km0) / cy.ey), j = (k = (int)(((eo = km.a3.Ct.pm.cOm3).x - (lF0 = cy.xk0).ju) / cy.et0)) - 1; j <= k + 1; ) { for (int m = i - 1; m <= i + 1; )
/* 22 */         { QJ qJ; if ((qJ = cy.C20(j, m)) != null && (qJ.Nb0()).length >= 1) { int n = (qJ.Nb0()).length;
/* 23 */             int i1 = ((Bs)qJ).ar0; byte b;
/* 24 */             for (int i2 = ((Bs)qJ).Rc0; b < n; ) { short s; for (s = 0; s < i1; ) { short s1; for (s1 = 0; s1 < i2; )
/* 25 */                 { il il; if ((il = qJ.p9(b, s, s1)) != null && !il.f() && il.OB0() != 0 && (paramInt != 0 || il.i00() != -10.0F)) { K0 k0; this(this, il); this.z10.Com3(k0); dQ dQ = k0.cC; this.hi0
/*    */                       
/* 27 */                       .si(dQ, this.hi0.Ub());
/* 28 */                     k0.cC.mM(); }  s1 = (short)(s1 + 1); }  s = (short)(s + 1); }  b = (byte)(b + 1); }  }  m++; }  j++; }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void fg() {
/*    */     Oe0 oe0;
/*    */     for (Hc0 hc0 = (oe0 = this.vt).z10.r30(); hc0.hasNext(); ) {
/*    */       K0 k0 = (K0)hc0.next();
/*    */       this.hi0.jf0(k0.cC);
/*    */     } 
/*    */     this.z10.clear();
/*    */     js.vu0.jf0(this.hi0);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     d10 d10;
/*    */     int i;
/*    */     if (B8.Pg(paramoa0.cz0) && ((i = paramoa0.vl) == 0 || i == 1) && paramoa0.aK > this.vt.Xq() && paramoa0.aK < this.prn.Kd && (d10 = this.Li0) != null)
/*    */       for (Hc0 hc0 = d10.r30(); hc0.hasNext();) {
/*    */         if ((jG0 = (JG0)hc0.next()).p3())
/*    */           jG0.xI0(); 
/*    */       }  
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void kx0(T0 paramT0, lpt1 paramlpt1, int paramInt1, int paramInt2, int paramInt3) {
/*    */     if (this.l00 != null) {
/*    */       JG0 jG0;
/*    */       if ((jG0 = this.ni) != null)
/*    */         this.hp.Ct(jG0, true); 
/*    */       this.ni = null;
/*    */       du0();
/*    */       this.l00.xm.Ng0(qo.A80);
/*    */       this.l00.dispose();
/*    */       this.hp.Ct(this.l00, true);
/*    */     } 
/*    */     this(paramT0, paramlpt1, paramInt1, paramInt2, paramInt3);
/*    */     ga0 ga01;
/*    */     this.l00 = new ga0();
/*    */     this.hp.Com3(this);
/*    */     du0();
/*    */   }
/*    */   
/*    */   public final void du0() {
/*    */     this.Q50.Dv0.kp0();
/*    */     ((YA0)this.Q50.Dv0.Vs).MJ0();
/*    */     for (Hc0 hc0 = this.hp.r30(); hc0.hasNext(); ) {
/*    */       JG0 jG0 = (JG0)hc0.next();
/*    */       (this.Q50.Dv0.S7(jG0).Xs0().fu().x70().Kw()).Ox.wP();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     QI();
/*    */     this.Mn.uW();
/*    */     this.Mn.mM();
/*    */     et et;
/*    */     this.Mn.js0(et = et.Em);
/*    */     this.vt.uh0(535, UB0.M60.dL() - this.Mn.yR());
/*    */     this.vt.RI(700, UB0.M60.dL() - this.Mn.yR());
/*    */     this.prn.uh0(340, UB0.M60.dL() - this.Mn.yR());
/*    */     this.prn.RI(700, UB0.M60.dL() - this.Mn.yR());
/*    */     this.vt.mM();
/*    */     this.prn.mM();
/*    */     this.vt.QJ0(et, 0, this.Mn.yR());
/*    */     this.prn.QJ0(et.t9, 0, this.Mn.yR());
/*    */   }
/*    */   
/*    */   public final int vL0() {
/*    */     return this.vt.xY + this.prn.xY;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */