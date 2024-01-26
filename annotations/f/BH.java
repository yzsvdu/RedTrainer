/*  1 */ package f;public final class BH extends Ij implements r60 { public F7 gh; public Y kF0; public dQ Nf; public wW Tw; public wW fc0; private void Ar0() { if (this.fc0.p3()) { B3 b3; ArrayList<Y> arrayList; this(); this(); Y[] arrayOfY; int i;
/*    */       byte b;
/*  3 */       for (i = (arrayOfY = km.u4.Fe[1].ro0()).length, b = 0; b < i; ) { Y y; if ((y = arrayOfY[b])
/*  4 */           .Bp0
/*  5 */           .lF0() && 
/*  6 */           y.Lh
/*  7 */           .p1 != 1446) arrayList
/*  8 */             .add(y);  b++; }  Collections.sort(arrayList); for (Y y : arrayList)
/*    */       { vi vi;
/*    */         
/* 11 */         String str = y.Lh.Sf0 + "x " + y.JG0();
/*    */ 
/*    */         
/* 14 */         U70 u70 = wm0.y0.HR(y.Bp0, false);
/* 15 */         Runnable runnable = () -> this.fc0.Tm0(paramY);
/* 16 */         this(str, u70, 3, 3, 24, 24, runnable, false);
/* 17 */         b3.aV.add(vi); }  if (b3
/* 18 */         .aV.size() < 1) b3
/* 19 */           .mD(Ml0.OH0(6007), null);  this.gh = F7.Yo(b3, this.fc0); }
/*    */      }
/*    */   public Ip I;
/*    */   public Un GB; public Un M20; public int Fa; public BH(Y paramY, int paramInt) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup
/*    */     //   3: invokespecial <init> : ()V
/*    */     //   6: <illegal opcode> run : (Lf/BH;)Ljava/lang/Runnable;
/*    */     //   11: invokevirtual TG0 : (Ljava/lang/Runnable;)V
/*    */     //   14: invokestatic XU : ()Z
/*    */     //   17: ifeq -> 29
/*    */     //   20: aload_0
/*    */     //   21: ldc 'multi-use-item'
/*    */     //   23: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   26: goto -> 43
/*    */     //   29: aload_0
/*    */     //   30: aload_1
/*    */     //   31: aload_0
/*    */     //   32: ldc 'seed-plant-dialog'
/*    */     //   34: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   37: invokevirtual JG0 : ()Ljava/lang/String;
/*    */     //   40: invokevirtual Lo : (Ljava/lang/String;)V
/*    */     //   43: aload_0
/*    */     //   44: dup
/*    */     //   45: dup2
/*    */     //   46: dup2
/*    */     //   47: dup2
/*    */     //   48: dup2
/*    */     //   49: dup2
/*    */     //   50: dup2
/*    */     //   51: dup2
/*    */     //   52: dup2
/*    */     //   53: iload_2
/*    */     //   54: aload_0
/*    */     //   55: aload_1
/*    */     //   56: putfield kF0 : Lf/Y;
/*    */     //   59: putfield Fa : I
/*    */     //   62: new f/Ip
/*    */     //   65: dup
/*    */     //   66: invokespecial <init> : ()V
/*    */     //   69: putfield I : Lf/Ip;
/*    */     //   72: new f/Un
/*    */     //   75: dup
/*    */     //   76: sipush #8551
/*    */     //   79: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   82: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   85: putfield GB : Lf/Un;
/*    */     //   88: new f/Un
/*    */     //   91: dup
/*    */     //   92: bipush #53
/*    */     //   94: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   97: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   100: putfield M20 : Lf/Un;
/*    */     //   103: getfield GB : Lf/Un;
/*    */     //   106: sipush #8551
/*    */     //   109: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   112: invokevirtual s6 : (Ljava/lang/String;)V
/*    */     //   115: getfield GB : Lf/Un;
/*    */     //   118: aload_0
/*    */     //   119: aload_1
/*    */     //   120: <illegal opcode> run : (Lf/BH;Lf/Y;)Ljava/lang/Runnable;
/*    */     //   125: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   128: getfield M20 : Lf/Un;
/*    */     //   131: aload_0
/*    */     //   132: <illegal opcode> run : (Lf/BH;)Ljava/lang/Runnable;
/*    */     //   137: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   140: new f/wW
/*    */     //   143: dup
/*    */     //   144: astore_2
/*    */     //   145: aload_1
/*    */     //   146: dup
/*    */     //   147: aload_0
/*    */     //   148: aload_2
/*    */     //   149: dup
/*    */     //   150: aload_0
/*    */     //   151: invokespecial <init> : (Lf/BH;)V
/*    */     //   154: putfield Tw : Lf/wW;
/*    */     //   157: invokevirtual r00 : ()S
/*    */     //   160: istore_1
/*    */     //   161: invokevirtual oD0 : ()S
/*    */     //   164: istore_2
/*    */     //   165: iconst_0
/*    */     //   166: iload_1
/*    */     //   167: iload_2
/*    */     //   168: invokevirtual LPt2 : (BSS)V
/*    */     //   171: getfield Tw : Lf/wW;
/*    */     //   174: invokevirtual Zt0 : ()V
/*    */     //   177: getfield Tw : Lf/wW;
/*    */     //   180: iconst_0
/*    */     //   181: invokevirtual Zf0 : (Z)V
/*    */     //   184: new f/dQ
/*    */     //   187: dup
/*    */     //   188: sipush #8550
/*    */     //   191: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   194: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   197: putfield Nf : Lf/dQ;
/*    */     //   200: new f/wW
/*    */     //   203: dup
/*    */     //   204: aload_0
/*    */     //   205: invokespecial <init> : (Lf/BH;)V
/*    */     //   208: putfield fc0 : Lf/wW;
/*    */     //   211: <illegal opcode> run : (Lf/BH;)Ljava/lang/Runnable;
/*    */     //   216: astore_1
/*    */     //   217: getfield fc0 : Lf/wW;
/*    */     //   220: aload_1
/*    */     //   221: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   224: getfield fc0 : Lf/wW;
/*    */     //   227: aload_1
/*    */     //   228: invokevirtual bm0 : (Ljava/lang/Runnable;)V
/*    */     //   231: getfield I : Lf/Ip;
/*    */     //   234: dup
/*    */     //   235: aload_0
/*    */     //   236: swap
/*    */     //   237: invokevirtual d7 : ()Lf/cr0;
/*    */     //   240: bipush #15
/*    */     //   242: invokevirtual Aq : (I)Lf/U90;
/*    */     //   245: aload_0
/*    */     //   246: getfield Nf : Lf/dQ;
/*    */     //   249: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   252: bipush #15
/*    */     //   254: invokevirtual Aq : (I)Lf/U90;
/*    */     //   257: astore_1
/*    */     //   258: getfield I : Lf/Ip;
/*    */     //   261: invokevirtual mE0 : ()Lf/g0;
/*    */     //   264: iconst_2
/*    */     //   265: anewarray f/JG0
/*    */     //   268: dup
/*    */     //   269: dup
/*    */     //   270: aload_0
/*    */     //   271: swap
/*    */     //   272: aload_0
/*    */     //   273: getfield Tw : Lf/wW;
/*    */     //   276: iconst_0
/*    */     //   277: swap
/*    */     //   278: aastore
/*    */     //   279: getfield fc0 : Lf/wW;
/*    */     //   282: iconst_1
/*    */     //   283: swap
/*    */     //   284: aastore
/*    */     //   285: aload_1
/*    */     //   286: bipush #15
/*    */     //   288: invokestatic aj0 : (Lf/g0;[Lf/JG0;Lf/U90;I)Lf/U90;
/*    */     //   291: aload_0
/*    */     //   292: getfield I : Lf/Ip;
/*    */     //   295: invokevirtual d7 : ()Lf/cr0;
/*    */     //   298: iconst_2
/*    */     //   299: anewarray f/JG0
/*    */     //   302: dup
/*    */     //   303: dup
/*    */     //   304: aload_0
/*    */     //   305: swap
/*    */     //   306: aload_0
/*    */     //   307: getfield GB : Lf/Un;
/*    */     //   310: iconst_0
/*    */     //   311: swap
/*    */     //   312: aastore
/*    */     //   313: getfield M20 : Lf/Un;
/*    */     //   316: iconst_1
/*    */     //   317: swap
/*    */     //   318: aastore
/*    */     //   319: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   322: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   325: invokevirtual Em0 : ()Lf/U90;
/*    */     //   328: invokevirtual WN : (Lf/U90;)V
/*    */     //   331: getfield I : Lf/Ip;
/*    */     //   334: dup
/*    */     //   335: invokevirtual mE0 : ()Lf/g0;
/*    */     //   338: aload_0
/*    */     //   339: getfield Nf : Lf/dQ;
/*    */     //   342: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   345: aload_0
/*    */     //   346: getfield I : Lf/Ip;
/*    */     //   349: invokevirtual d7 : ()Lf/cr0;
/*    */     //   352: invokevirtual Em0 : ()Lf/U90;
/*    */     //   355: aload_0
/*    */     //   356: getfield Tw : Lf/wW;
/*    */     //   359: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   362: invokevirtual Em0 : ()Lf/U90;
/*    */     //   365: aload_0
/*    */     //   366: getfield fc0 : Lf/wW;
/*    */     //   369: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   372: invokevirtual Em0 : ()Lf/U90;
/*    */     //   375: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   378: aload_0
/*    */     //   379: getfield I : Lf/Ip;
/*    */     //   382: invokevirtual mE0 : ()Lf/g0;
/*    */     //   385: aload_0
/*    */     //   386: getfield GB : Lf/Un;
/*    */     //   389: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   392: aload_0
/*    */     //   393: getfield M20 : Lf/Un;
/*    */     //   396: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   399: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   402: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   405: getfield I : Lf/Ip;
/*    */     //   408: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   411: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 288
/*    */     //   #2	-> 292 } private void Oh() { close(); wg0 wg0; if ((wg0 = pA.Dg0.iA0) != null)
/*    */       aj();  } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) { BM bM; if (h1.J20(paramoa0.GG0, bM = BM.bC) && this.fc0.p3()) {
/*    */         hm.Fz0(this.fc0.TG0.oh0); return true;
/*    */       }  if (h1.J20(paramoa0.GG0, bM) && this.GB.p3()) {
/*    */         hm.Fz0(this.GB.TG0.oh0); return true;
/*    */       }  if (h1.J20(paramoa0.GG0, BM.lc) || (h1.J20(paramoa0.GG0, bM) && this.M20.p3()))
/* 28 */       { hm.Fz0(this.M20.TG0.oh0); return true; }  if (h1.J20(paramoa0.GG0, BM.ni) || h1.J20(paramoa0.GG0, BM.Oq)) { q0(); return true; }  if (h1.J20(paramoa0.GG0, BM.N70) || h1.J20(paramoa0.GG0, BM.M8)) { oZ(); return true; }  }
/* 29 */      return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   private void bD0(Y paramY) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield fc0 : Lf/wW;
/*    */     //   4: getfield hC0 : S
/*    */     //   7: iconst_1
/*    */     //   8: if_icmpge -> 24
/*    */     //   11: getstatic f/km.u4 : Lf/R8;
/*    */     //   14: sipush #8557
/*    */     //   17: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   20: invokevirtual Pq : (Ljava/lang/String;)V
/*    */     //   23: return
/*    */     //   24: aload_0
/*    */     //   25: getstatic f/js.vu0 : Lf/js;
/*    */     //   28: astore_2
/*    */     //   29: new f/h70
/*    */     //   32: astore_3
/*    */     //   33: sipush #8552
/*    */     //   36: istore #4
/*    */     //   38: iconst_2
/*    */     //   39: anewarray java/lang/String
/*    */     //   42: dup
/*    */     //   43: astore #5
/*    */     //   45: new java/lang/StringBuilder
/*    */     //   48: dup
/*    */     //   49: aload_0
/*    */     //   50: swap
/*    */     //   51: invokespecial <init> : ()V
/*    */     //   54: getfield fc0 : Lf/wW;
/*    */     //   57: getfield op0 : S
/*    */     //   60: ldc_w ''
/*    */     //   63: invokestatic Gl0 : (Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
/*    */     //   66: iconst_0
/*    */     //   67: swap
/*    */     //   68: aastore
/*    */     //   69: getfield fc0 : Lf/wW;
/*    */     //   72: getfield hC0 : S
/*    */     //   75: dup
/*    */     //   76: istore #6
/*    */     //   78: iconst_1
/*    */     //   79: if_icmpge -> 90
/*    */     //   82: ldc_w '???'
/*    */     //   85: astore #6
/*    */     //   87: goto -> 106
/*    */     //   90: getstatic f/Of.eH : Lf/Of;
/*    */     //   93: iload #6
/*    */     //   95: invokevirtual On0 : (S)Lf/LPT3;
/*    */     //   98: getfield Iu : I
/*    */     //   101: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   104: astore #6
/*    */     //   106: aload_2
/*    */     //   107: aload_3
/*    */     //   108: aload_0
/*    */     //   109: iload #4
/*    */     //   111: aload #5
/*    */     //   113: iconst_1
/*    */     //   114: aload #6
/*    */     //   116: aastore
/*    */     //   117: aload #5
/*    */     //   119: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*    */     //   122: astore_2
/*    */     //   123: aload_1
/*    */     //   124: <illegal opcode> run : (Lf/BH;Lf/Y;)Ljava/lang/Runnable;
/*    */     //   129: aload_2
/*    */     //   130: swap
/*    */     //   131: aload_0
/*    */     //   132: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Lf/JG0;)V
/*    */     //   135: aload_3
/*    */     //   136: invokevirtual uh : (Lf/h70;)V
/*    */     //   139: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 4
/*    */     //   #2	-> 11
/*    */     //   #3	-> 25
/*    */     //   #4	-> 29
/*    */     //   #5	-> 57
/*    */     //   #6	-> 60
/*    */     //   #7	-> 68
/*    */     //   #8	-> 72
/*    */     //   #9	-> 82
/*    */     //   #10	-> 90
/*    */     //   #11	-> 95
/*    */     //   #12	-> 98
/*    */     //   #13	-> 116
/*    */   }
/*    */   
/*    */   private void xI0(Y paramY) {
/*    */     short s1 = paramY.Lh.p1;
/*    */     int j = paramY.Lh.Wy;
/*    */     int i = this.fc0.I6;
/*    */     short s2 = this.fc0.op0;
/*    */     km.u4.tq0(s1, j, i, s2, (byte)-1);
/*    */     close();
/*    */   }
/*    */   
/*    */   public final void IG0() {
/*    */     this.fc0.Tm0(y);
/*    */     int i;
/*    */     Y y;
/*    */     if ((i = this.Fa) > 0 && (y = km.u4.Fe[1].u60(i)) != null && y.Bp0.lF0() && y.Lh.p1 != 1446 && y.Lh.Sf0 > 1)
/*    */       return; 
/*    */     VA0.c90(this.fc0);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (km.XU()) {
/*    */       QI();
/*    */       this.I.js0(et.Wi0);
/*    */       this.I.Tm(500, 325);
/*    */     } else {
/*    */       super.d40();
/*    */       mM();
/*    */       qB0(et.Wi0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void close() {
/*    */     pA pA;
/*    */     BH bH;
/*    */     if ((bH = (pA = pA.Dg0).fw) != null) {
/*    */       bH.ra0();
/*    */       this.fw = null;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/BH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */