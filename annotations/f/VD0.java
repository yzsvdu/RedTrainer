/*  1 */ package f;public final class VD0 { public static final ik Gt0 = C00.gd(VD0.class); public static float PB = 0.001F; public gk Et0; public Ut0 dJ; public lr kR; public ArrayList TD; public boolean rv; public final bd Bj; public VD0() { gk gk1; Ut0 ut0; ArrayList arrayList; bd bd1; this(); this.Et0 = this; this(); this.dJ = this; this.kR = null; this(); this.TD = this; this.rv = false; this(); this.Bj = this; } private void AuX(byte paramByte, short paramShort) { float f; if (h1.VJ0 && !km.wI0.oq0) { f = 0.0F; } else { f = 1.0F; }
/*  2 */      vR vR = vR.eX;
/*  3 */     RO(paramByte, paramShort, (short)-1, vR)
/*  4 */       .vf0(vR.Sq() * f); RO(paramByte, paramShort, (short)-1, vR).Ix0(); lr lr1; if (!(RO(paramByte, paramShort, (short)-1, vR) instanceof eU) && (lr1 = this.kR) != null) oC0();  } private void XG0(boolean paramBoolean) { float f; if (h1.VJ0 && !km.wI0.oq0) { f = 0.0F; } else { f = 1.0F; }  vR vR = vR.aG0; RO((byte)2, (short)1397, (short)-1, vR).Ch0(0.0F); RO((byte)2, (short)1397, (short)-1, vR).vf0(vR.Sq() * f); RO((byte)2, (short)1397, (short)-1, vR).Ix0(); if (paramBoolean) this.rv = false;  } private void r50(byte paramByte, short paramShort) { float f; if (h1.VJ0 && !km.wI0.oq0) { f = 0.0F; } else { f = 1.0F; }  vR vR = vR.Le; RO(paramByte, paramShort, (short)-1, this).vf0(Sq() * f); RO(paramByte, paramShort, (short)-1, this).Ix0(); } private void xB(float paramFloat1, boolean paramBoolean, byte paramByte, short paramShort1, short paramShort2, float paramFloat2, float paramFloat3) { if (h1.VJ0 && !km.wI0.oq0) paramFloat1 = 0.0F;  if (!paramBoolean && Mk0.sz0(paramByte)) for (Iterator<lr> iterator = this.TD.iterator(); iterator.hasNext();) { if (!(lr2 = iterator.next()).Vh() && lr2.jA() == paramByte && lr2.LE() == paramShort1) return;  }   vR vR = vR.aG0; lr1.Ch0(paramFloat2); lr1.vf0(Sq() * paramFloat1); lr lr1; (lr1 = RO(paramByte, paramShort1, paramShort2, this)).vx0(paramFloat3); RO(paramByte, paramShort1, paramShort2, this).Ix0(); uz0(); this.TD.add(lr1); } private void Gc0(boolean paramBoolean, byte paramByte, short paramShort, float paramFloat) { float f; if (h1.VJ0 && !km.wI0.oq0) { f = 0.0F; } else { f = 1.0F; }  if (!paramBoolean && Mk0.sz0(paramByte)) for (Iterator<lr> iterator = this.TD.iterator(); iterator.hasNext();) { if (!(lr2 = iterator.next()).Vh() && lr2.jA() == paramByte && lr2.LE() == paramShort) return;  }   vR vR = vR.aG0; lr1.vf0(Sq() * f); lr lr1; (lr1 = RO(paramByte, paramShort, (short)-1, this)).Ch0(paramFloat); RO(paramByte, paramShort, (short)-1, this).Ix0(); uz0(); this.TD.add(lr1); } private void w10() { MF.KQ(); lr lr1; if ((lr1 = this.kR) != null && !lr1.Vh())
/*    */       this.kR.Ix0();  }
/*    */   public static float xz0(tc paramtc) { vh0 vh0; if ((vh0 = km.a3) == null)
/*    */       return 1.0F;  Jo jo; if ((jo = vh0.Ct) == null)
/*    */       return 1.0F; 
/*    */     if (paramtc == null || paramtc.Jg == jo.Jg)
/* 10 */       return 1.0F;  if (h1.Vy) return 0.0F;  float f = (paramtc.default()).lpt8.u50(jo.J.lpt8); if (Mk0.sz0(paramtc.HW.FB)) { f *= 4.0F; } else { f /= 16.0F; }  return Math.min(1.0F, (17.0F - f) / 15.0F); }
/*    */ 
/*    */   
/*    */   public final void Wk0(byte paramByte, short paramShort) {
/*    */     U00(paramByte, paramShort, true, false);
/*    */   }
/*    */   
/*    */   public final void U00(byte paramByte, short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     G8 g8;
/*    */     if ((g8 = G8.Ny) == null || !g8.isAlive())
/*    */       return; 
/*    */     UB0.Kg0.fN(() -> QE0(paramByte, paramShort, paramBoolean1, paramBoolean2));
/*    */   }
/*    */   
/*    */   public final void QE0(byte paramByte, short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: invokestatic KQ : ()V
/*    */     //   4: ifne -> 79
/*    */     //   7: getstatic f/km.a3 : Lf/vh0;
/*    */     //   10: dup
/*    */     //   11: astore_1
/*    */     //   12: ifnonnull -> 24
/*    */     //   15: iconst_2
/*    */     //   16: istore_1
/*    */     //   17: sipush #1159
/*    */     //   20: istore_2
/*    */     //   21: goto -> 79
/*    */     //   24: getstatic f/km.MR : Lf/Gp0;
/*    */     //   27: dup
/*    */     //   28: astore_2
/*    */     //   29: ifnull -> 59
/*    */     //   32: aload_2
/*    */     //   33: getfield rx : Lf/ky;
/*    */     //   36: getstatic f/ky.JH0 : Lf/ky;
/*    */     //   39: if_acmpeq -> 59
/*    */     //   42: getstatic f/km.MR : Lf/Gp0;
/*    */     //   45: invokevirtual rl0 : ()B
/*    */     //   48: istore_1
/*    */     //   49: getstatic f/km.MR : Lf/Gp0;
/*    */     //   52: invokevirtual Ta : ()S
/*    */     //   55: istore_2
/*    */     //   56: goto -> 79
/*    */     //   59: aload_1
/*    */     //   60: invokevirtual Jr0 : ()Lf/KI;
/*    */     //   63: dup
/*    */     //   64: astore_1
/*    */     //   65: ifnonnull -> 69
/*    */     //   68: return
/*    */     //   69: aload_1
/*    */     //   70: dup
/*    */     //   71: getfield E10 : B
/*    */     //   74: istore_1
/*    */     //   75: invokevirtual zu : ()S
/*    */     //   78: istore_2
/*    */     //   79: aload_0
/*    */     //   80: iconst_0
/*    */     //   81: istore #5
/*    */     //   83: getfield kR : Lf/lr;
/*    */     //   86: dup
/*    */     //   87: astore #6
/*    */     //   89: ifnull -> 156
/*    */     //   92: iload #4
/*    */     //   94: ifne -> 109
/*    */     //   97: aload #6
/*    */     //   99: invokeinterface LE : ()S
/*    */     //   104: iload_2
/*    */     //   105: if_icmpne -> 109
/*    */     //   108: return
/*    */     //   109: aload_0
/*    */     //   110: dup
/*    */     //   111: getfield kR : Lf/lr;
/*    */     //   114: iload_3
/*    */     //   115: invokeinterface Wi0 : (Z)V
/*    */     //   120: getfield kR : Lf/lr;
/*    */     //   123: invokeinterface hE : ()Z
/*    */     //   128: ifeq -> 151
/*    */     //   131: aload_0
/*    */     //   132: getfield kR : Lf/lr;
/*    */     //   135: aload_0
/*    */     //   136: <illegal opcode> run : (Lf/VD0;)Ljava/lang/Runnable;
/*    */     //   141: invokeinterface Ge0 : (Ljava/lang/Runnable;)V
/*    */     //   146: iconst_1
/*    */     //   147: istore_3
/*    */     //   148: iload_3
/*    */     //   149: istore #5
/*    */     //   151: aload_0
/*    */     //   152: aconst_null
/*    */     //   153: putfield kR : Lf/lr;
/*    */     //   156: iload_2
/*    */     //   157: iconst_1
/*    */     //   158: if_icmpge -> 177
/*    */     //   161: aload_0
/*    */     //   162: new f/eU
/*    */     //   165: dup
/*    */     //   166: astore_0
/*    */     //   167: iload_1
/*    */     //   168: iload_2
/*    */     //   169: invokespecial <init> : (BS)V
/*    */     //   172: aload_0
/*    */     //   173: putfield kR : Lf/lr;
/*    */     //   176: return
/*    */     //   177: iload #5
/*    */     //   179: aload_0
/*    */     //   180: dup
/*    */     //   181: getstatic f/vR.XZ : Lf/vR;
/*    */     //   184: astore_0
/*    */     //   185: iload_1
/*    */     //   186: iload_2
/*    */     //   187: iconst_m1
/*    */     //   188: aload_0
/*    */     //   189: invokevirtual RO : (BSSLf/vR;)Lf/lr;
/*    */     //   192: dup
/*    */     //   193: astore_0
/*    */     //   194: putfield kR : Lf/lr;
/*    */     //   197: ifne -> 206
/*    */     //   200: aload_0
/*    */     //   201: invokeinterface Ix0 : ()V
/*    */     //   206: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 33
/*    */     //   #2	-> 36
/*    */     //   #3	-> 71
/*    */     //   #4	-> 75
/*    */     //   #5	-> 189
/*    */     //   #6	-> 194
/*    */   }
/*    */   
/*    */   public final void a7(boolean paramBoolean) {
/*    */     UB0.Kg0.fN(() -> {
/*    */           lr lr1;
/*    */           if ((lr1 = this.kR) != null) {
/*    */             lr1.Wi0(paramBoolean);
/*    */             this.kR = null;
/*    */           } 
/*    */         });
/*    */   }
/*    */   
/*    */   public final void bL(byte paramByte, short paramShort) {
/*    */     bA0(false, paramByte, paramShort, 0.0F);
/*    */   }
/*    */   
/*    */   public final void dv(byte paramByte, short paramShort, boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt) {
/*    */     g8(paramByte, paramShort, (short)-1, paramBoolean, paramFloat1, 1.0F, paramFloat2, paramInt);
/*    */   }
/*    */   
/*    */   public final void g8(byte paramByte, short paramShort1, short paramShort2, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/*    */     Runnable runnable = () -> {
/*    */         // Byte code:
/*    */         //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */         //   3: aload_0
/*    */         //   4: fload_1
/*    */         //   5: iload_2
/*    */         //   6: iload_3
/*    */         //   7: iload #4
/*    */         //   9: iload #5
/*    */         //   11: fload #6
/*    */         //   13: fload #7
/*    */         //   15: <illegal opcode> run : (Lf/VD0;FZBSSFF)Ljava/lang/Runnable;
/*    */         //   20: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */         //   23: return
/*    */       };
/*    */     long l = paramInt;
/*    */     A1.L7.ac0(this, l);
/*    */   }
/*    */   
/*    */   public final void iy() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield rv : Z
/*    */     //   4: ifeq -> 8
/*    */     //   7: return
/*    */     //   8: aload_0
/*    */     //   9: iconst_1
/*    */     //   10: putfield rv : Z
/*    */     //   13: iconst_0
/*    */     //   14: istore_1
/*    */     //   15: iload_1
/*    */     //   16: iconst_4
/*    */     //   17: if_icmpge -> 66
/*    */     //   20: iload_1
/*    */     //   21: iconst_3
/*    */     //   22: if_icmpne -> 30
/*    */     //   25: iconst_1
/*    */     //   26: istore_2
/*    */     //   27: goto -> 32
/*    */     //   30: iconst_0
/*    */     //   31: istore_2
/*    */     //   32: getstatic f/A1.L7 : Lf/A1;
/*    */     //   35: iload_1
/*    */     //   36: aload_0
/*    */     //   37: iload_2
/*    */     //   38: <illegal opcode> run : (Lf/VD0;Z)Ljava/lang/Runnable;
/*    */     //   43: astore_2
/*    */     //   44: sipush #700
/*    */     //   47: imul
/*    */     //   48: sipush #700
/*    */     //   51: iadd
/*    */     //   52: i2l
/*    */     //   53: lstore_3
/*    */     //   54: aload_2
/*    */     //   55: lload_3
/*    */     //   56: invokevirtual ac0 : (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
/*    */     //   59: pop
/*    */     //   60: iinc #1, 1
/*    */     //   63: goto -> 15
/*    */     //   66: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 32
/*    */     //   #2	-> 38
/*    */   }
/*    */   
/*    */   public final void RO(byte paramByte, short paramShort) {
/*    */     UB0.Kg0.fN(() -> {
/*    */           Iterator iterator = this.TD.iterator();
/*    */           while (hasNext()) {
/*    */             lr lr1;
/*    */             if (!(lr1 = (lr)next()).Vh() && lr1.jA() == paramByte && lr1.LE() == paramShort)
/*    */               lr1.Wi0(false); 
/*    */           } 
/*    */         });
/*    */   }
/*    */   
/*    */   public final void Yt0(byte paramByte, short paramShort) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: iload_1
/*    */     //   5: iload_2
/*    */     //   6: <illegal opcode> run : (Lf/VD0;BS)Ljava/lang/Runnable;
/*    */     //   11: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   14: return
/*    */   }
/*    */   
/*    */   public final void Cn0() {
/*    */     UB0.Kg0.fN(() -> {
/*    */           lr lr1;
/*    */           if ((lr1 = this.kR) != null)
/*    */             resume(); 
/*    */         });
/*    */   }
/*    */   
/*    */   public final void NR() {
/*    */     UB0.Kg0.fN(() -> {
/*    */           Iterator<lr> iterator = this.TD.iterator();
/*    */           while (iterator.hasNext()) {
/*    */             lr lr1;
/*    */             if (!(lr1 = iterator.next()).Vh())
/*    */               lr1.Wi0(false); 
/*    */           } 
/*    */           uz0();
/*    */         });
/*    */   }
/*    */   
/*    */   public final void tf() {
/*    */     UB0.Kg0.fN(() -> {
/*    */           Iterator<lr> iterator = this.TD.iterator();
/*    */           while (iterator.hasNext())
/*    */             ((lr)iterator.next()).vf0(0.0F); 
/*    */           uz0();
/*    */         });
/*    */   }
/*    */   
/*    */   public final void HW() {
/*    */     UB0.Kg0.fN(() -> {
/*    */           Iterator<lr> iterator = this.TD.iterator();
/*    */           while (iterator.hasNext())
/*    */             ((lr)iterator.next()).vf0(vR.aG0.Sq()); 
/*    */           uz0();
/*    */         });
/*    */   }
/*    */   
/*    */   public final void uz0() {
/*    */     MF.KQ();
/*    */     this.TD.removeIf(lr::Vh);
/*    */   }
/*    */   
/*    */   public final lr RO(byte paramByte, short paramShort1, short paramShort2, vR paramvR) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: invokevirtual Sq : ()F
/*    */     //   5: dup
/*    */     //   6: fstore #5
/*    */     //   8: getstatic f/VD0.PB : F
/*    */     //   11: fcmpg
/*    */     //   12: ifgt -> 25
/*    */     //   15: new f/eU
/*    */     //   18: dup
/*    */     //   19: iload_1
/*    */     //   20: iload_2
/*    */     //   21: invokespecial <init> : (BS)V
/*    */     //   24: areturn
/*    */     //   25: iload_2
/*    */     //   26: iconst_1
/*    */     //   27: if_icmplt -> 485
/*    */     //   30: iload_1
/*    */     //   31: bipush #10
/*    */     //   33: if_icmpeq -> 46
/*    */     //   36: getstatic f/km.mI0 : Lf/P1;
/*    */     //   39: iload_1
/*    */     //   40: invokevirtual s2 : (B)Z
/*    */     //   43: ifeq -> 485
/*    */     //   46: iload_2
/*    */     //   47: sipush #1999
/*    */     //   50: if_icmpne -> 61
/*    */     //   53: iload_1
/*    */     //   54: iconst_1
/*    */     //   55: if_icmpne -> 61
/*    */     //   58: goto -> 485
/*    */     //   61: aload_0
/*    */     //   62: iload_1
/*    */     //   63: ldc_w 65536
/*    */     //   66: imul
/*    */     //   67: iload_2
/*    */     //   68: iadd
/*    */     //   69: istore #6
/*    */     //   71: getfield dJ : Lf/Ut0;
/*    */     //   74: iload #6
/*    */     //   76: invokevirtual return : (I)Z
/*    */     //   79: ifeq -> 194
/*    */     //   82: aload #4
/*    */     //   84: aload_0
/*    */     //   85: dup
/*    */     //   86: getfield dJ : Lf/Ut0;
/*    */     //   89: iload #6
/*    */     //   91: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   94: checkcast f/RD0
/*    */     //   97: astore_0
/*    */     //   98: getfield Et0 : Lf/gk;
/*    */     //   101: dup
/*    */     //   102: astore #6
/*    */     //   104: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   107: pop
/*    */     //   108: new f/sy0
/*    */     //   111: dup
/*    */     //   112: astore #7
/*    */     //   114: iload_2
/*    */     //   115: aload #7
/*    */     //   117: iload_1
/*    */     //   118: aload #7
/*    */     //   120: aload_0
/*    */     //   121: aload #6
/*    */     //   123: getfield Sp0 : Ljava/util/List;
/*    */     //   126: invokespecial <init> : (Lf/RD0;Ljava/util/List;)V
/*    */     //   129: putfield Re0 : B
/*    */     //   132: putfield J8 : S
/*    */     //   135: getstatic f/vR.XZ : Lf/vR;
/*    */     //   138: if_acmpne -> 146
/*    */     //   141: iconst_1
/*    */     //   142: istore_0
/*    */     //   143: goto -> 148
/*    */     //   146: iconst_0
/*    */     //   147: istore_0
/*    */     //   148: aload #7
/*    */     //   150: dup
/*    */     //   151: fload #5
/*    */     //   153: aload #7
/*    */     //   155: dup
/*    */     //   156: iload_0
/*    */     //   157: putfield YP : Z
/*    */     //   160: getfield up0 : Lf/s70;
/*    */     //   163: iload_0
/*    */     //   164: invokeinterface B9 : (Z)V
/*    */     //   169: invokevirtual vf0 : (F)V
/*    */     //   172: areturn
/*    */     //   173: astore_0
/*    */     //   174: getstatic f/VD0.Gt0 : Lf/ik;
/*    */     //   177: ldc_w 'Unable to load mod for '
/*    */     //   180: iload_1
/*    */     //   181: ldc_w ' '
/*    */     //   184: iload_2
/*    */     //   185: invokestatic KK : (Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
/*    */     //   188: aload_0
/*    */     //   189: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   194: iload_1
/*    */     //   195: invokestatic sz0 : (B)Z
/*    */     //   198: ifeq -> 297
/*    */     //   201: getstatic f/km.mI0 : Lf/P1;
/*    */     //   204: iload_1
/*    */     //   205: invokevirtual LpT7 : (B)Lf/HI;
/*    */     //   208: ifnull -> 297
/*    */     //   211: iload_1
/*    */     //   212: iconst_2
/*    */     //   213: if_icmpne -> 233
/*    */     //   216: iload_2
/*    */     //   217: sipush #1351
/*    */     //   220: if_icmpne -> 233
/*    */     //   223: new f/eU
/*    */     //   226: dup
/*    */     //   227: iload_1
/*    */     //   228: iload_2
/*    */     //   229: invokespecial <init> : (BS)V
/*    */     //   232: areturn
/*    */     //   233: iload_2
/*    */     //   234: getstatic f/km.mI0 : Lf/P1;
/*    */     //   237: iload_1
/*    */     //   238: invokevirtual LpT7 : (B)Lf/HI;
/*    */     //   241: invokevirtual gL0 : ()Lf/E4;
/*    */     //   244: getfield S80 : Lf/uI;
/*    */     //   247: getfield fM0 : [Lf/J;
/*    */     //   250: iconst_0
/*    */     //   251: aaload
/*    */     //   252: getfield Dw : [Lf/lpT3;
/*    */     //   255: dup
/*    */     //   256: astore_0
/*    */     //   257: arraylength
/*    */     //   258: if_icmplt -> 264
/*    */     //   261: goto -> 283
/*    */     //   264: aload_0
/*    */     //   265: iload_2
/*    */     //   266: aaload
/*    */     //   267: checkcast f/t7
/*    */     //   270: getfield eE0 : S
/*    */     //   273: sipush #20041
/*    */     //   276: if_icmpeq -> 283
/*    */     //   279: iconst_1
/*    */     //   280: goto -> 284
/*    */     //   283: iconst_0
/*    */     //   284: ifne -> 297
/*    */     //   287: new f/eU
/*    */     //   290: dup
/*    */     //   291: iload_1
/*    */     //   292: iload_2
/*    */     //   293: invokespecial <init> : (BS)V
/*    */     //   296: areturn
/*    */     //   297: iload_1
/*    */     //   298: ifeq -> 326
/*    */     //   301: iload_1
/*    */     //   302: iconst_1
/*    */     //   303: if_icmpeq -> 309
/*    */     //   306: goto -> 343
/*    */     //   309: iload_2
/*    */     //   310: sipush #609
/*    */     //   313: if_icmple -> 343
/*    */     //   316: new f/eU
/*    */     //   319: dup
/*    */     //   320: iload_1
/*    */     //   321: iload_2
/*    */     //   322: invokespecial <init> : (BS)V
/*    */     //   325: areturn
/*    */     //   326: iload_2
/*    */     //   327: sipush #346
/*    */     //   330: if_icmple -> 343
/*    */     //   333: new f/eU
/*    */     //   336: dup
/*    */     //   337: iload_1
/*    */     //   338: iload_2
/*    */     //   339: invokespecial <init> : (BS)V
/*    */     //   342: areturn
/*    */     //   343: getstatic f/G8.Mk0 : Z
/*    */     //   346: ifne -> 352
/*    */     //   349: goto -> 406
/*    */     //   352: getstatic f/G8.Ny : Lf/G8;
/*    */     //   355: ifnonnull -> 361
/*    */     //   358: invokestatic init : ()V
/*    */     //   361: iload_1
/*    */     //   362: invokestatic sz0 : (B)Z
/*    */     //   365: ifeq -> 384
/*    */     //   368: new f/ov
/*    */     //   371: dup
/*    */     //   372: astore_0
/*    */     //   373: iload_1
/*    */     //   374: iload_2
/*    */     //   375: iload_3
/*    */     //   376: aload #4
/*    */     //   378: invokespecial <init> : (BSSLf/vR;)V
/*    */     //   381: goto -> 463
/*    */     //   384: iload_1
/*    */     //   385: invokestatic n80 : (B)Z
/*    */     //   388: ifeq -> 406
/*    */     //   391: new f/ND0
/*    */     //   394: dup
/*    */     //   395: astore_0
/*    */     //   396: iload_1
/*    */     //   397: iload_2
/*    */     //   398: aload #4
/*    */     //   400: invokespecial <init> : (BSLf/vR;)V
/*    */     //   403: goto -> 463
/*    */     //   406: aconst_null
/*    */     //   407: astore_0
/*    */     //   408: goto -> 463
/*    */     //   411: astore_0
/*    */     //   412: getstatic f/G8.xt0 : Lf/ik;
/*    */     //   415: new java/lang/StringBuilder
/*    */     //   418: dup
/*    */     //   419: invokespecial <init> : ()V
/*    */     //   422: ldc_w 'NativeSoundPlayer['
/*    */     //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   428: iload_1
/*    */     //   429: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   432: ldc_w ','
/*    */     //   435: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   438: iload_2
/*    */     //   439: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   442: ldc_w '] Initialize error'
/*    */     //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   448: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   451: aload_0
/*    */     //   452: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   457: iconst_0
/*    */     //   458: putstatic f/G8.Mk0 : Z
/*    */     //   461: aconst_null
/*    */     //   462: astore_0
/*    */     //   463: aload_0
/*    */     //   464: ifnull -> 475
/*    */     //   467: aload_0
/*    */     //   468: dup
/*    */     //   469: fload #5
/*    */     //   471: invokevirtual vf0 : (F)V
/*    */     //   474: areturn
/*    */     //   475: new f/eU
/*    */     //   478: dup
/*    */     //   479: iload_1
/*    */     //   480: iload_2
/*    */     //   481: invokespecial <init> : (BS)V
/*    */     //   484: areturn
/*    */     //   485: new f/eU
/*    */     //   488: dup
/*    */     //   489: iload_1
/*    */     //   490: iload_2
/*    */     //   491: invokespecial <init> : (BS)V
/*    */     //   494: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 76
/*    */     //   #2	-> 86
/*    */     //   #3	-> 98
/*    */     //   #4	-> 104
/*    */     //   #5	-> 108
/*    */     //   #6	-> 129
/*    */     //   #7	-> 132
/*    */     //   #8	-> 135
/*    */     //   #9	-> 157
/*    */     //   #10	-> 169
/*    */     //   #11	-> 177
/*    */     //   #12	-> 189
/*    */     //   #13	-> 244
/*    */     //   #14	-> 247
/*    */     //   #15	-> 287
/*    */     //   #16	-> 343
/*    */     //   #17	-> 471
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   98	101	173	java/lang/Exception
/*    */     //   104	107	173	java/lang/Exception
/*    */     //   108	111	173	java/lang/Exception
/*    */     //   114	138	173	java/lang/Exception
/*    */     //   148	172	173	java/lang/Exception
/*    */     //   361	365	411	java/lang/Exception
/*    */     //   368	371	411	java/lang/Exception
/*    */     //   373	388	411	java/lang/Exception
/*    */     //   391	394	411	java/lang/Exception
/*    */     //   396	406	411	java/lang/Exception
/*    */   }
/*    */   
/*    */   public final boolean c7() {
/*    */     bd bd1;
/*    */     boolean bool;
/*    */     synchronized (this.Bj) {
/*    */       long l = System.currentTimeMillis();
/*    */       byte b = 0;
/*    */       while (true) {
/*    */         if (b < 10) {
/*    */           long[] arrayOfLong;
/*    */           if ((arrayOfLong = this.RK)[b] < l) {
/*    */             arrayOfLong[b] = l + 900000L;
/*    */             bool = true;
/*    */             /* monitor exit ThisExpression{ObjectType{f/bd}} */
/*    */             break;
/*    */           } 
/*    */           b++;
/*    */           continue;
/*    */         } 
/*    */         bool = false;
/*    */         /* monitor exit ThisExpression{PrimitiveType{primitive=maybe_boolean}} */
/*    */         break;
/*    */       } 
/*    */       return bool;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void bA0(boolean paramBoolean, byte paramByte, short paramShort, float paramFloat) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: iload_1
/*    */     //   5: iload_2
/*    */     //   6: iload_3
/*    */     //   7: fload #4
/*    */     //   9: <illegal opcode> run : (Lf/VD0;ZBSF)Ljava/lang/Runnable;
/*    */     //   14: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   17: return
/*    */   }
/*    */   
/*    */   public final void fy(short paramShort) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: iconst_2
/*    */     //   5: iload_1
/*    */     //   6: <illegal opcode> run : (Lf/VD0;BS)Ljava/lang/Runnable;
/*    */     //   11: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   14: return
/*    */   }
/*    */   
/*    */   public final void TC0(short paramShort) {
/*    */     bA0(true, (byte)2, paramShort, 0.0F);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/VD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */