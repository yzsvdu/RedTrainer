/*  1 */ package f;public class Dn0 { public byte Dv; public int Dd; public Jo Lr; public FV lpT2; public byte rh; public lPT9 Ng0; public Vp0 wh0; public boolean LI0; public short[] com8; public byte[] QL0; public int Uq; public static pRn op0(byte paramByte) { UX uX = UX.Er(paramByte);
/*    */ 
/*    */     
/*  4 */     byte b1 = (byte)uX.S1.Mv();
/*    */     
/*  6 */     byte b2 = (byte)uX.S1.jz();
/*  7 */     byte b3 = (byte)(uX.PH0 * 2); return new pRn((byte)uX.S1.k90(), b1, b2, b3); }
/*    */   public int Z1;
/*    */   public int ah;
/*    */   public JG0 ff0;
/*    */   public final V6 ov;
/*    */   public vd[] Mk0; public long gk; public e2 Hf; public Dn0(JG0 paramJG0, Jo paramJo) { Jo jo; this.Dv = 1; this.Dd = 3; this.rh = 0; this.Ng0 = lPT9.U4; this.wh0 = null; this.LI0 = false; Vp0[] arrayOfVp0; this.com8 = new short[(arrayOfVp0 = Vp0.Jo).length]; this.QL0 = new byte[arrayOfVp0.length]; this.Uq = 0; this.Z1 = 0; this.ah = 0; this.ov = new V6(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(19), Integer.valueOf(23), Integer.valueOf(24) })); this.Mk0 = vd.O5(); this.gk = -1L; this.Hf = new e2(1000); if (paramJo == null) { vh0 vh0; if ((vh0 = km.a3) == null) return;  jo = vh0.wQ(); }  this.ff0 = paramJG0; this.Lr = jo; if (jo == null) return;  this.rh = jo.cM().OD().bo0(); int i = arrayOfVp0.length; for (byte b = 0; b < i; b++) { Vp0 vp0 = arrayOfVp0[b]; this.com8[vp0.CoM8()] = (short)-1; this.QL0[vp0.CoM8()] = -1; }  } public Dn0(JG0 paramJG0, FV paramFV) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: aload_0
/*    */     //   2: aload_2
/*    */     //   3: aload_0
/*    */     //   4: aload_1
/*    */     //   5: aload_0
/*    */     //   6: dup
/*    */     //   7: dup2
/*    */     //   8: dup2
/*    */     //   9: dup2
/*    */     //   10: dup2
/*    */     //   11: dup2
/*    */     //   12: dup2
/*    */     //   13: dup2
/*    */     //   14: invokespecial <init> : ()V
/*    */     //   17: iconst_1
/*    */     //   18: putfield Dv : B
/*    */     //   21: iconst_3
/*    */     //   22: putfield Dd : I
/*    */     //   25: iconst_0
/*    */     //   26: putfield rh : B
/*    */     //   29: getstatic f/lPT9.U4 : Lf/lPT9;
/*    */     //   32: putfield Ng0 : Lf/lPT9;
/*    */     //   35: aconst_null
/*    */     //   36: putfield wh0 : Lf/Vp0;
/*    */     //   39: iconst_0
/*    */     //   40: putfield LI0 : Z
/*    */     //   43: getstatic f/Vp0.Jo : [Lf/Vp0;
/*    */     //   46: dup
/*    */     //   47: astore_1
/*    */     //   48: arraylength
/*    */     //   49: newarray short
/*    */     //   51: putfield com8 : [S
/*    */     //   54: aload_1
/*    */     //   55: arraylength
/*    */     //   56: newarray byte
/*    */     //   58: putfield QL0 : [B
/*    */     //   61: iconst_0
/*    */     //   62: putfield Uq : I
/*    */     //   65: iconst_0
/*    */     //   66: putfield Z1 : I
/*    */     //   69: iconst_0
/*    */     //   70: putfield ah : I
/*    */     //   73: new f/V6
/*    */     //   76: dup
/*    */     //   77: bipush #9
/*    */     //   79: anewarray java/lang/Integer
/*    */     //   82: dup
/*    */     //   83: dup2
/*    */     //   84: dup2
/*    */     //   85: dup2
/*    */     //   86: dup2
/*    */     //   87: iconst_1
/*    */     //   88: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   91: iconst_0
/*    */     //   92: swap
/*    */     //   93: aastore
/*    */     //   94: iconst_5
/*    */     //   95: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   98: iconst_1
/*    */     //   99: swap
/*    */     //   100: aastore
/*    */     //   101: bipush #6
/*    */     //   103: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   106: iconst_2
/*    */     //   107: swap
/*    */     //   108: aastore
/*    */     //   109: bipush #12
/*    */     //   111: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   114: iconst_3
/*    */     //   115: swap
/*    */     //   116: aastore
/*    */     //   117: bipush #13
/*    */     //   119: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   122: iconst_4
/*    */     //   123: swap
/*    */     //   124: aastore
/*    */     //   125: bipush #14
/*    */     //   127: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   130: iconst_5
/*    */     //   131: swap
/*    */     //   132: aastore
/*    */     //   133: bipush #19
/*    */     //   135: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   138: bipush #6
/*    */     //   140: swap
/*    */     //   141: aastore
/*    */     //   142: bipush #23
/*    */     //   144: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   147: bipush #7
/*    */     //   149: swap
/*    */     //   150: aastore
/*    */     //   151: bipush #24
/*    */     //   153: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   156: bipush #8
/*    */     //   158: swap
/*    */     //   159: aastore
/*    */     //   160: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   163: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   166: putfield ov : Lf/V6;
/*    */     //   169: invokestatic O5 : ()[Lf/vd;
/*    */     //   172: putfield Mk0 : [Lf/vd;
/*    */     //   175: ldc2_w -1
/*    */     //   178: putfield gk : J
/*    */     //   181: new f/e2
/*    */     //   184: dup
/*    */     //   185: sipush #1000
/*    */     //   188: invokespecial <init> : (I)V
/*    */     //   191: putfield Hf : Lf/e2;
/*    */     //   194: putfield ff0 : Lf/JG0;
/*    */     //   197: putfield lpT2 : Lf/FV;
/*    */     //   200: ifnonnull -> 243
/*    */     //   203: getstatic f/km.a3 : Lf/vh0;
/*    */     //   206: invokevirtual wQ : ()Lf/Jo;
/*    */     //   209: dup
/*    */     //   210: astore_2
/*    */     //   211: aload_0
/*    */     //   212: aload_2
/*    */     //   213: putfield Lr : Lf/Jo;
/*    */     //   216: ifnonnull -> 224
/*    */     //   219: iconst_0
/*    */     //   220: istore_2
/*    */     //   221: goto -> 235
/*    */     //   224: aload_2
/*    */     //   225: invokevirtual cM : ()Lf/OE0;
/*    */     //   228: invokevirtual OD : ()Lf/H10;
/*    */     //   231: invokevirtual bo0 : ()B
/*    */     //   234: istore_2
/*    */     //   235: aload_0
/*    */     //   236: iload_2
/*    */     //   237: putfield rh : B
/*    */     //   240: goto -> 256
/*    */     //   243: aload_0
/*    */     //   244: dup
/*    */     //   245: aload_2
/*    */     //   246: invokevirtual xe : ()B
/*    */     //   249: putfield rh : B
/*    */     //   252: aconst_null
/*    */     //   253: putfield Lr : Lf/Jo;
/*    */     //   256: aload_1
/*    */     //   257: arraylength
/*    */     //   258: istore_2
/*    */     //   259: iconst_0
/*    */     //   260: istore_3
/*    */     //   261: iload_3
/*    */     //   262: iload_2
/*    */     //   263: if_icmpge -> 300
/*    */     //   266: aload_0
/*    */     //   267: dup
/*    */     //   268: aload_1
/*    */     //   269: iload_3
/*    */     //   270: aaload
/*    */     //   271: astore #4
/*    */     //   273: getfield com8 : [S
/*    */     //   276: aload #4
/*    */     //   278: invokevirtual CoM8 : ()B
/*    */     //   281: iconst_m1
/*    */     //   282: i2s
/*    */     //   283: sastore
/*    */     //   284: getfield QL0 : [B
/*    */     //   287: aload #4
/*    */     //   289: invokevirtual CoM8 : ()B
/*    */     //   292: iconst_m1
/*    */     //   293: bastore
/*    */     //   294: iinc #3, 1
/*    */     //   297: goto -> 261
/* 12 */     //   300: return } public Dn0(JG0 paramJG0, byte paramByte) { this.Dv = 1; this.Dd = 3; this.rh = 0; this.Ng0 = lPT9.U4; this.wh0 = null; this.LI0 = false; this.com8 = new short[arrayOfVp0.length]; this.QL0 = new byte[arrayOfVp0.length]; this.Uq = 0; this.Z1 = 0; this.ah = 0; this.ov = new V6(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(19), Integer.valueOf(23), Integer.valueOf(24) })); this.Mk0 = vd.O5(); this.gk = -1L; this.Hf = new e2(1000); this.ff0 = paramJG0; this.rh = paramByte; Vp0[] arrayOfVp0; int i = (arrayOfVp0 = Vp0.Jo).length; for (paramByte = 0; paramByte < i; paramByte++) { Vp0 vp0 = arrayOfVp0[paramByte]; this.com8[vp0.CoM8()] = (short)-1; this.QL0[vp0.CoM8()] = -1; }  } public Dn0(JG0 paramJG0) { this.Dv = 1; this.Dd = 3; this.rh = 0; this.Ng0 = lPT9.U4; this.wh0 = null; this.LI0 = false; this.com8 = new short[arrayOfVp0.length]; this.QL0 = new byte[arrayOfVp0.length]; this.Uq = 0; this.Z1 = 0; this.ah = 0; this.ov = new V6(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(19), Integer.valueOf(23), Integer.valueOf(24) })); this.Mk0 = vd.O5(); this.gk = -1L; this.Hf = new e2(1000); this.ff0 = paramJG0; Vp0[] arrayOfVp0; int i = (arrayOfVp0 = Vp0.Jo).length; for (byte b = 0; b < i; b++) { Vp0 vp0 = arrayOfVp0[b]; this.com8[vp0.CoM8()] = (short)-1; this.QL0[vp0.CoM8()] = -1; }  } public Dn0(so0 paramso0, Jo paramJo, Vp0 paramVp0, short paramShort) { this(paramso0, paramJo); this.wh0 = paramVp0; if (paramVp0 != null) this.com8[paramVp0.CoM8()] = paramShort;  } public final void Xe0(Vp0 paramVp0, byte paramByte, int paramInt1, int paramInt2, int paramInt3) { lPT9 lPT91; short s; Vp0 vp0; if (paramVp0 != (vp0 = Vp0.bG)) { paramInt3 = c70.Pj0(paramInt3, (byte)0); lPT9 lPT92 = this.Ng0; short s1 = xR(paramVp0); Rf(paramVp0, km.q00.hI(lPT92, paramVp0, s1, paramByte, paramInt3, true, null), paramInt1, paramInt2, paramInt3); paramInt3 = c70.Pj0(paramInt3, (byte)2); lPT92 = this.Ng0; s1 = xR(paramVp0); Rf(paramVp0, km.q00.hI(lPT92, paramVp0, s1, paramByte, paramInt3, true, null), paramInt1, paramInt2, paramInt3); paramInt3 = c70.Pj0(paramInt3, (byte)1); lPT91 = this.Ng0; s = xR(paramVp0); Rf(paramVp0, km.q00.hI(this, paramVp0, s, paramByte, paramInt3, true, null), paramInt1, paramInt2, paramInt3); } else { short s1 = super.xR(paramVp0 = Vp0.MP), s2 = super.xR(s); if (((Dn0)super).LI0 || s2 == -1) { super.Xe0(paramVp0, paramByte, paramInt1, paramInt2, paramInt3); return; }  paramInt3 = c70.Pj0(paramInt3, (byte)0); byte b1 = c70.Pj0(paramInt3, (byte)2), b2 = c70.Pj0(paramInt3, (byte)1); vd vd2 = ((Dn0)super).Mk0[s.gw0]; vd vd3 = ((Dn0)super).Mk0[s.gw0]; pe0[] arrayOfPe03 = km.q00.WJ(((Dn0)super).Ng0, s1, s2, paramByte, b1, true, vd3); vd vd1 = ((Dn0)super).Mk0[s.gw0]; pe0[] arrayOfPe01 = km.q00.WJ(((Dn0)super).Ng0, s1, s2, paramByte, b2, true, vd1); pe0 pe02, arrayOfPe02[]; if ((arrayOfPe02 = km.q00.WJ(((Dn0)super).Ng0, s1, s2, paramByte, paramInt3, true, vd2)) != null && (pe02 = arrayOfPe02[0]) != null) super.Rf(paramVp0, pe02, paramInt1, paramInt2, paramInt3);  if (arrayOfPe03 != null && (pe02 = arrayOfPe03[0]) != null) super.Rf(paramVp0, pe02, paramInt1, paramInt2, b1);  if (arrayOfPe01 != null && (pe02 = arrayOfPe01[0]) != null) super.Rf(paramVp0, pe02, paramInt1, paramInt2, b2);  pe0 pe01; if (arrayOfPe02 != null && (pe01 = arrayOfPe02[1]) != null) super.Rf(s, pe01, paramInt1, paramInt2, paramInt3);  if (arrayOfPe03 != null && (pe01 = arrayOfPe03[1]) != null) super.Rf(s, pe01, paramInt1, paramInt2, b1);  if (arrayOfPe01 != null && (pe01 = arrayOfPe01[1]) != null) super.Rf(s, pe01, paramInt1, paramInt2, b2);  }  } public final void f1(Vp0 paramVp0, short paramShort, byte paramByte, int paramInt1, int paramInt2, boolean paramBoolean) { byte b1, b2; boolean bool = true; switch (paramByte) { case 18: case 20: case 21: case 22: case 25: case 26: bool = false; break; }  short s = 0; if (paramShort != 17) { s = ih0.com5[(int)(zm0.u20 / 200L % 4L)]; } else { switch ((int)(zm0.u20 / 200L % 4L)) { case 2: paramShort = 20; s = 25; break;case 1: case 3: paramShort = 19; s = 24; break;case 0: paramShort = 18; s = 23; break; }  }  if (!paramBoolean && bool == paramBoolean) Rf(paramVp0, km.q00.hI(this.Ng0, paramVp0, s, paramByte, (byte)0, true, null), paramInt1, paramInt2, (byte)0);  Hk hk = km.q00; lPT9 lPT91 = this.Ng0; if (paramBoolean) { b2 = 0; } else { b2 = 2; }  pe0 pe0 = hk.hI(lPT91, paramVp0, paramShort, paramByte, b2, true, null); if (paramBoolean) { b1 = 0; } else { b1 = 2; }  Rf(paramVp0, pe0, paramInt1, paramInt2, b1); if (paramBoolean && bool == paramBoolean) Rf(paramVp0, km.q00.hI(this.Ng0, paramVp0, s, paramByte, (byte)0, true, null), paramInt1, paramInt2, (byte)0);  } public final void Rf(Vp0 paramVp0, pe0 parampe0, int paramInt1, int paramInt2, byte paramByte) { if (parampe0 == null) return;  int i = jG0.Kd + paramInt1; int j = jG0.er0 + paramInt2; int k, m = pE.sl * (k = this.Dd); k = pE.N5 * k; pE pE; JG0 jG0; (pE = d90.LC(parampe0)).W8((jG0 = this.ff0).O, i, j, m, k); if (paramByte != 2 && paramByte != 5) { mX mX; pRn pRn; if ((pRn = eo(paramVp0)) != pRn.WHITE) mX = pE.rv0(pRn);  Sa0 sa0 = this.ff0.O; int i1 = this.ff0.Kd + paramInt1; paramInt1 = this.ff0.er0 + paramInt2;
/*    */       
/*    */       int n;
/* 15 */       paramInt2 = ((wj0)mX).sl * (n = this.Dd);
/* 16 */       n = ((wj0)mX).N5 * n;
/* 17 */       ((pE)mX).W8(sa0, i1, paramInt1, paramInt2, n); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void AB() {
/*    */     if (this.gk == zm0.u20)
/*    */       return; 
/*    */     Vp0 vp01;
/*    */     Vp0 vp02;
/*    */     if ((vp01 = this.wh0) == (vp02 = Vp0.bG))
/*    */       switch (this.com8[vp01.gw0]) {
/*    */         case 360:
/*    */         case 362:
/*    */           if (this.Hf.By0()) {
/*    */             byte b1;
/*    */             this.com8[b1] = (short)(this.com8[b1 = vp02.gw0] - 1);
/*    */           } 
/*    */           break;
/*    */         case 359:
/*    */         case 361:
/*    */           if (this.Hf.By0()) {
/*    */             byte b1;
/*    */             this.com8[b1] = (short)(this.com8[b1 = vp02.gw0] + 1);
/*    */           } 
/*    */           break;
/*    */       }  
/*    */     vd[] arrayOfVd;
/*    */     int i;
/*    */     byte b;
/*    */     for (this.gk = zm0.u20, i = (arrayOfVd = this.Mk0).length, b = 0; b < i; ) {
/*    */       (this[b]).iD0 = (int)((this[b]).iD0 + zm0.O20);
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void gT(int paramInt) {
/*    */     this.Dd = paramInt;
/*    */   }
/*    */   
/*    */   public final void Ul(boolean paramBoolean) {
/*    */     this.LI0 = paramBoolean;
/*    */   }
/*    */   
/*    */   public final void PQ(byte paramByte) {
/*    */     op0(paramByte);
/*    */     Vp0 vp0;
/*    */     if ((vp0 = this.wh0) == null)
/*    */       return; 
/*    */     this.QL0[vp0.gw0] = paramByte;
/*    */   }
/*    */   
/*    */   public short xR(Vp0 paramVp0) {
/*    */     short s;
/*    */     if ((s = this.com8[paramVp0.gw0]) != -1)
/*    */       return s; 
/*    */     Jo jo;
/*    */     if ((jo = this.Lr) != null)
/*    */       return jo.lB0.JM(paramVp0); 
/*    */     FV fV;
/*    */     if ((fV = this.lpT2) != null) {
/*    */       boolean bool;
/*    */       byte b;
/*    */       if ((b = paramVp0.TH0) > -1) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       return !bool ? -1 : this.zi[b];
/*    */     } 
/*    */     return (short)-1;
/*    */   }
/*    */   
/*    */   public pRn eo(Vp0 paramVp0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield rh : B
/*    */     //   4: iconst_m1
/*    */     //   5: if_icmpne -> 12
/*    */     //   8: getstatic f/pRn.BLACK : Lf/pRn;
/*    */     //   11: areturn
/*    */     //   12: aload_1
/*    */     //   13: aload_0
/*    */     //   14: aload_1
/*    */     //   15: invokevirtual xR : (Lf/Vp0;)S
/*    */     //   18: invokevirtual Ko : (S)Z
/*    */     //   21: ifne -> 28
/*    */     //   24: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   27: areturn
/*    */     //   28: aload_0
/*    */     //   29: getfield QL0 : [B
/*    */     //   32: aload_1
/*    */     //   33: getfield gw0 : B
/*    */     //   36: baload
/*    */     //   37: dup
/*    */     //   38: istore_2
/*    */     //   39: bipush #-2
/*    */     //   41: if_icmpne -> 69
/*    */     //   44: getstatic f/UX.BJ : [Lf/UX;
/*    */     //   47: dup
/*    */     //   48: astore_0
/*    */     //   49: invokestatic currentTimeMillis : ()J
/*    */     //   52: ldc2_w 150
/*    */     //   55: ldiv
/*    */     //   56: aload_0
/*    */     //   57: arraylength
/*    */     //   58: i2l
/*    */     //   59: lrem
/*    */     //   60: l2i
/*    */     //   61: aaload
/*    */     //   62: getfield Ii : B
/*    */     //   65: invokestatic op0 : (B)Lf/pRn;
/*    */     //   68: areturn
/*    */     //   69: iload_2
/*    */     //   70: iconst_m1
/*    */     //   71: if_icmpeq -> 79
/*    */     //   74: iload_2
/*    */     //   75: invokestatic op0 : (B)Lf/pRn;
/*    */     //   78: areturn
/*    */     //   79: aload_0
/*    */     //   80: getfield Lr : Lf/Jo;
/*    */     //   83: dup
/*    */     //   84: astore_2
/*    */     //   85: ifnull -> 142
/*    */     //   88: aload_2
/*    */     //   89: getfield lB0 : Lf/OE0;
/*    */     //   92: aload_1
/*    */     //   93: invokevirtual F00 : (Lf/Vp0;)Lf/UX;
/*    */     //   96: astore_0
/*    */     //   97: new f/pRn
/*    */     //   100: dup
/*    */     //   101: aload_0
/*    */     //   102: getfield S1 : Lf/ao;
/*    */     //   105: invokevirtual k90 : ()I
/*    */     //   108: i2b
/*    */     //   109: aload_0
/*    */     //   110: dup
/*    */     //   111: dup
/*    */     //   112: getfield S1 : Lf/ao;
/*    */     //   115: invokevirtual Mv : ()I
/*    */     //   118: i2b
/*    */     //   119: istore_0
/*    */     //   120: getfield S1 : Lf/ao;
/*    */     //   123: invokevirtual jz : ()I
/*    */     //   126: i2b
/*    */     //   127: istore_1
/*    */     //   128: getfield PH0 : I
/*    */     //   131: iconst_2
/*    */     //   132: imul
/*    */     //   133: i2b
/*    */     //   134: istore_2
/*    */     //   135: iload_0
/*    */     //   136: iload_1
/*    */     //   137: iload_2
/*    */     //   138: invokespecial <init> : (BBBB)V
/*    */     //   141: areturn
/*    */     //   142: aload_0
/*    */     //   143: getfield lpT2 : Lf/FV;
/*    */     //   146: dup
/*    */     //   147: astore_0
/*    */     //   148: ifnull -> 186
/*    */     //   151: aload_1
/*    */     //   152: getfield TH0 : B
/*    */     //   155: dup
/*    */     //   156: istore_1
/*    */     //   157: iconst_m1
/*    */     //   158: if_icmple -> 166
/*    */     //   161: iconst_1
/*    */     //   162: istore_2
/*    */     //   163: goto -> 168
/*    */     //   166: iconst_0
/*    */     //   167: istore_2
/*    */     //   168: iload_2
/*    */     //   169: ifne -> 176
/*    */     //   172: iconst_m1
/*    */     //   173: goto -> 182
/*    */     //   176: aload_0
/*    */     //   177: getfield hL : [B
/*    */     //   180: iload_1
/*    */     //   181: baload
/*    */     //   182: invokestatic op0 : (B)Lf/pRn;
/*    */     //   185: areturn
/*    */     //   186: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   189: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 33
/*    */     //   #2	-> 36
/*    */     //   #3	-> 62
/*    */     //   #4	-> 65
/*    */     //   #5	-> 89
/*    */     //   #6	-> 93
/*    */     //   #7	-> 102
/*    */     //   #8	-> 105
/*    */     //   #9	-> 112
/*    */     //   #10	-> 115
/*    */     //   #11	-> 120
/*    */     //   #12	-> 123
/*    */     //   #13	-> 128
/*    */     //   #14	-> 138
/*    */     //   #15	-> 143
/*    */     //   #16	-> 152
/*    */     //   #17	-> 177
/*    */     //   #18	-> 181
/*    */     //   #19	-> 182
/*    */   }
/*    */   
/*    */   public final void nUl() {
/*    */     int i = this.Uq, j = this.Z1;
/*    */     if (this.Ng0 == lPT9.fh0) {
/*    */       FD0(Rg.vs0[Rg.uj0.Nn0()], i, j);
/*    */       return;
/*    */     } 
/*    */     for (byte b = 0; b < 3; ) {
/*    */       byte b1;
/*    */       if (this.Dv == 1) {
/*    */         i = this.Uq;
/*    */         i = b * 84 + i;
/*    */       } else {
/*    */         j = this.Z1;
/*    */         j = b * 84 + j;
/*    */       } 
/*    */       if (this.wh0 == Vp0.c6 && this.ah == 0) {
/*    */         b1 = (byte)(b + 6);
/*    */       } else {
/*    */         b1 = b;
/*    */       } 
/*    */       int k;
/*    */       if ((k = this.ah) == 3) {
/*    */         b1 = Rg.Gf[b1][Rg.S5.Nn0()];
/*    */       } else if (k == 4) {
/*    */         b1 = Rg.iX[b1][Rg.nA.Nn0()];
/*    */       } else {
/*    */         b1 = Rg.Za[k * 3 + b1][Rg.VE.Nn0()];
/*    */       } 
/*    */       FD0(b1, i, j);
/*    */       b = (byte)(b + 1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void FD0(byte paramByte, int paramInt1, int paramInt2) {
/*    */     boolean bool;
/*    */     byte b1;
/*    */     byte b;
/*    */     AB();
/*    */     Vp0 vp01;
/*    */     short s1 = xR(vp01 = Vp0.CR);
/*    */     Vp0 vp02;
/*    */     short s2 = xR(vp02 = Vp0.c6);
/*    */     lPT9 lPT91;
/*    */     if (this.Ng0 == (lPT91 = lPT9.U4) && s1 != -1 && vp01.O5(s1) && this.ov.return(paramByte)) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     if (this.Ng0 == lPT91 && s2 != -1 && vp02.O5(s2) && this.ov.return(paramByte)) {
/*    */       s1 = 1;
/*    */     } else {
/*    */       s1 = 0;
/*    */     } 
/*    */     if (s2 != 2 && s2 != 12 && s2 != 17) {
/*    */       b = 0;
/*    */     } else {
/*    */       b = 1;
/*    */     } 
/*    */     if (b && paramByte >= 18 && paramByte <= 26) {
/*    */       switch (paramByte) {
/*    */         default:
/*    */           b = 20;
/*    */           break;
/*    */         case 19:
/*    */         case 23:
/*    */         case 24:
/*    */           b = 19;
/*    */           break;
/*    */         case 18:
/*    */         case 21:
/*    */         case 22:
/*    */           b = 18;
/*    */           break;
/*    */       } 
/*    */       if (ih0.o7(s2))
/*    */         f1(vp02, s2, b, paramInt1, paramInt2, false); 
/*    */     } else {
/*    */       b = paramByte;
/*    */     } 
/*    */     if (this.Ng0 == lPT9.fh0) {
/*    */       b1 = 3;
/*    */     } else {
/*    */       b1 = 2;
/*    */     } 
/*    */     for (byte b2 = 0; b2 < b1; ) {
/*    */       boolean bool1;
/*    */       lPT9 lPT92 = this.Ng0;
/*    */       pE pE;
/*    */       if (b2 == 1 && (pE = d90.LC(km.q00.zK0(lPT92, this.rh, b))) != null) {
/*    */         mX mX;
/*    */         if (this.rh == -1)
/*    */           mX = pE.rv0(pRn.BLACK); 
/*    */         Sa0 sa0 = this.ff0.O;
/*    */         int i = this.ff0.Kd + paramInt1;
/*    */         bool1 = this.ff0.er0 + paramInt2;
/*    */         int j, k = ((wj0)mX).sl * (j = this.Dd);
/*    */         j = ((wj0)mX).N5 * j;
/*    */         ((pE)mX).W8(sa0, i, bool1, k, j);
/*    */       } 
/*    */       Xe0(Vp0.Rj, b, paramInt1, paramInt2, b2);
/*    */       if (s1 == 0 && !ih0.o7(s2))
/*    */         Xe0(Vp0.c6, paramByte, paramInt1, paramInt2, b2); 
/*    */       Vp0 vp03;
/*    */       if ((vp03 = Vp0.Sz0).G6(xR(vp03)))
/*    */         Xe0(Vp0.sg0, b, paramInt1, paramInt2, b2); 
/*    */       if (vp03.Jz0(xR(vp03)))
/*    */         Xe0(Vp0.M9, b, paramInt1, paramInt2, b2); 
/*    */       Vp0 vp04;
/*    */       if (xR(vp04 = Vp0.rK) != 1) {
/*    */         bool1 = true;
/*    */       } else {
/*    */         bool1 = false;
/*    */       } 
/*    */       if (!bool1)
/*    */         Xe0(vp04, b, paramInt1, paramInt2, b2); 
/*    */       Xe0(vp03, b, paramInt1, paramInt2, b2);
/*    */       if (!bool)
/*    */         Xe0(Vp0.CR, b, paramInt1, paramInt2, b2); 
/*    */       Xe0(Vp0.Pa0, b, paramInt1, paramInt2, b2);
/*    */       Xe0(Vp0.K7, b, paramInt1, paramInt2, b2);
/*    */       Xe0(Vp0.bG, b, paramInt1, paramInt2, b2);
/*    */       if (bool1)
/*    */         Xe0(vp04, b, paramInt1, paramInt2, b2); 
/*    */       if (bool)
/*    */         Xe0(Vp0.CR, b, paramInt1, paramInt2, b2); 
/*    */       if (s1 != 0 && !ih0.o7(s2))
/*    */         Xe0(Vp0.c6, paramByte, paramInt1, paramInt2, b2); 
/*    */       b2++;
/*    */     } 
/*    */     if (ih0.o7(s2) && b >= 18 && b <= 26)
/*    */       f1(Vp0.c6, s2, b, paramInt1, paramInt2, true); 
/*    */   }
/*    */   
/*    */   public final void gy(int paramInt1, int paramInt2) {
/*    */     AB();
/*    */     Vp0 vp0;
/*    */     Xe0(vp0 = Vp0.bG, (byte)0, paramInt1, paramInt2, 0);
/*    */     lPT9 lPT91 = lPT9.U4;
/*    */     pE pE;
/*    */     if ((pE = d90.LC(km.q00.zK0(lPT91, this.rh, 51))) != null) {
/*    */       mX mX;
/*    */       if (this.rh == -1)
/*    */         mX = pE.rv0(pRn.BLACK); 
/*    */       Sa0 sa0 = this.ff0.O;
/*    */       int i = this.ff0.Kd + paramInt1;
/*    */       int j = this.ff0.er0 + paramInt2;
/*    */       int k, m = ((wj0)mX).sl * (k = this.Dd);
/*    */       k = ((wj0)mX).N5 * k;
/*    */       ((pE)mX).W8(sa0, i, j, m, k);
/*    */     } 
/*    */     Xe0(Vp0.Pa0, (byte)0, paramInt1, paramInt2, 1);
/*    */     Xe0(Vp0.K7, (byte)0, paramInt1, paramInt2, 1);
/*    */     Xe0(vp0, (byte)0, paramInt1, paramInt2, 1);
/*    */   }
/*    */   
/*    */   public final void X7(byte paramByte, Vp0 paramVp0, short paramShort) {
/*    */     byte b;
/*    */     this.com8[b = paramVp0.gw0] = paramShort;
/*    */     this.QL0[b] = paramByte;
/*    */     this.wh0 = paramVp0;
/*    */   }
/*    */   
/*    */   public final void rY() {
/*    */     this.Ng0 = lPT9.jR;
/*    */   }
/*    */   
/*    */   public final void NF() {
/*    */     this.ah = 2;
/*    */   }
/*    */   
/*    */   public final void G0() {
/*    */     this.Uq = -17;
/*    */     this.Z1 = -14;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dn0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */