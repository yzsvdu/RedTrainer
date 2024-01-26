/*  1 */ package f;public final class bB0 extends Nr { public static String tJ; public static String E40; public static int wy = 1029; public static int cO = 515; public static final long dn0 = Xf0.xZ | IF.kA0; public static final b70 SD = new b70(); public final int qd; public final int St0; public final int ny; public final int LPT9; public final int ql; public final int XI0; public final int Mo0; public final int CoM6; public final int oe; public final int Qk; public final int nR; public final int HX; public final int Qj; public final int COm6; public final int oo0; public final int sx0; public final int Oa0; public final int YJ; public final int IV; public final int up; public final int yw; public final int rA; public final int cd; public final int mi; public final int Yi0; public int iG0; public int WF; public int Ed0; public int Kr0; public int Uf; public int T60; public int nm; public int Qg; public int Jw; public int ol0; public int j00; public int Sm0; public int ME; public int ae0; public int U60; public int fy0; public int HG0; public final boolean ee0; public final boolean yj; public final vm[] ZF; public final rN[] io0; public final d80[] Qi0; public Xw0 UV; public final long ct0; public final long ie; public final ej0 tj0; public float B70; public boolean n30; public static String getDefaultVertexShader() { if (tJ == null)
/*  2 */       tJ = UB0.vj0.aP("data/shaders/battle.vertex.glsl").QM(null);  return tJ; } public static String getDefaultFragmentShader() { if (E40 == null) E40 = UB0.vj0.aP("data/shaders/battle.fragment.glsl").QM(null);  return E40; } public bB0(Xw0 paramXw0, ej0 paramej0, String paramString) { this(paramXw0, paramej0, paramString, this, str2); }
/*  3 */   public bB0(Xw0 paramXw0, ej0 paramej0, String paramString1, String paramString2, String paramString3) { this(paramString1, m0.tF0(paramString1, paramString3)); Rm0 rm0; this(paramXw0, paramej0, this); } public bB0(Xw0 paramXw0, ej0 paramej0, Rm0 paramRm0) { boolean bool1; boolean bool2; this.nR = register(new vK("u_dirLights[0].color")); this.HX = register(new vK("u_dirLights[0].direction")); this.Qj = register(new vK("u_dirLights[1].color")); this.COm6 = register(new vK("u_pointLights[0].color")); this.oo0 = register(new vK("u_pointLights[0].position")); this.sx0 = register(new vK("u_pointLights[0].intensity")); this.Oa0 = register(new vK("u_pointLights[1].color")); this.YJ = register(new vK("u_spotLights[0].color")); this.IV = register(new vK("u_spotLights[0].position")); this.up = register(new vK("u_spotLights[0].intensity")); this.yw = register(new vK("u_spotLights[0].direction")); this.rA = register(new vK("u_spotLights[0].cutoffAngle")); this.cd = register(new vK("u_spotLights[0].exponent")); this.mi = register(new vK("u_spotLights[1].color")); this.Yi0 = register(new vK("u_fogColor")); register(new vK("u_shadowMapProjViewTrans")); register(new vK("u_shadowTexture")); register(new vK("u_shadowPCFOffset")); b70 b701 = NE(paramXw0); this.tj0 = paramej0; this.program = paramRm0; if (paramXw0.kw != null) { bool1 = true; } else { bool1 = false; }  this.ee0 = bool1; long l; if (b701.gV(l = ED0.AH) || (bool1 && b701.gV(l))) { bool2 = true; } else { bool2 = false; }  this.yj = bool2; if (bool1) paramXw0.kw.getClass();  this.UV = paramXw0; this.ct0 = b701.XG() | dn0; this.ie = paramXw0.L90.u90.n8().Ep(); paramej0.getClass(); this.ZF = new vm[bool1 ? 2 : 0]; byte b; vm[] arrayOfVm; for (b = 0; b < (arrayOfVm = this.ZF).length; b++) { vm vm1; this(); arrayOfVm[b] = vm1; }  paramej0.getClass(); this.io0 = new rN[this.ee0 ? 5 : 0]; rN[] arrayOfRN; for (b = 0; b < (arrayOfRN = this.io0).length; b++) { rN rN1; this(); arrayOfRN[b] = rN1; }  if (this.ee0) paramej0.getClass();  this.Qi0 = new d80[0]; d80[] arrayOfD80; for (b = 0; b < (arrayOfD80 = this.Qi0).length; b++) { d80 d801; this(); arrayOfD80[b] = d801; }  paramej0.getClass(); register(up.rp, Qw.Jx); register(up.rv0, Qw.XC0); register(up.CB0, Qw.dI0); register(up.Lg, Qw.qU); register(up.Dq, Qw.GL); register(up.aN, Qw.Jf0); register(up.hg0, Qw.Hh); this.qd = register(new vK("u_time")); register(up.o1, Qw.Ou); register(up.o4, Qw.iB); register(up.ax, Qw.KC); register(up.xc, Qw.th0); if (paramXw0.Et != null) { R20 r20; vK vK = up.be0; this(); register(vK, r20); }  register(up.Je, Qw.wu); this.St0 = register(up.oF); register(up.wD0, Qw.tq0); register(up.EI, Qw.C5); register(up.YA0, Qw.o1); register(up.Z1, Qw.vt0); register(up.vm, Qw.me); register(up.v00, Qw.Za); register(up.vb, Qw.IF0); register(up.wk, Qw.zE); register(up.Pw, Qw.QC0); register(up.uB, Qw.hi0); register(up.A, Qw.lpt9); register(up.MX, Qw.BK0); register(up.Yg0, Qw.v10); register(up.Co0, Qw.we); register(up.EL0, Qw.cg); register(up.fv0, Qw.vE0); this.ny = register(up.Jn); register(up.uw0, Qw.oq); this.Mo0 = register(up.rr); this.LPT9 = register(up.N8); this.ql = register(up.Sj0); this.XI0 = register(up.Zv0); this.oe = register(up.dM); this.CoM6 = register(up.n80); this.Qk = register(up.QP); if (this.ee0) { iH0 iH0; vK vK = up.RM; this(); register(vK, iH0); }  if (this.yj) register(up.pa0, Qw.S4);  } public static final b70 NE(Xw0 paramXw0) { b70 b701; (b701 = SD).Qr = 0L; SD.ra0.clear(); fo0 fo0; if ((fo0 = paramXw0.kw) != null) b701.ir(fo0);  T0 t0; if ((t0 = paramXw0.bL) != null) b701.ir(t0);  return b701; }
/*    */   public static final boolean lpt7(long paramLong1, long paramLong2) { return ((paramLong1 & paramLong2) == paramLong2); } public static String TG0(Xw0 paramXw0, ej0 paramej0) { String str = ""; b70 b701; long l1 = (b701 = NE(paramXw0)).Qr; long l3;
/*  5 */     if (lpt7(l3 = paramXw0.L90.u90.Dt0.getAttributes().Ep(), 1L))
/*  6 */       str = m0.tF0(str, "#define positionFlag\n");  if (((l3 & 0x6L) != 0L))
/*  7 */       str = m0.tF0(str, "#define colorFlag\n"); 
/*  8 */     if (lpt7(l3, 256L))
/*  9 */       str = m0.tF0(str, "#define binormalFlag\n"); 
/* 10 */     if (lpt7(l3, 128L))
/* 11 */       str = m0.tF0(str, "#define tangentFlag\n"); 
/* 12 */     if (lpt7(l3, 8L))
/* 13 */       str = m0.tF0(str, "#define normalFlag\n"); 
/* 14 */     if ((lpt7(l3, 8L) || lpt7(l3, 384L)) && paramXw0.kw != null) {
/*    */       
/* 16 */       str = m0.tF0(m0.tF0(str, "#define lightingFlag\n"), "#define ambientCubemapFlag\n");
/* 17 */       paramej0.getClass(); str = str + "#define numDirectionalLights " + '\002' + "\n"; str = str + "#define numPointLights " + '\005' + "\n"; str = str + "#define numSpotLights " + Character.MIN_VALUE + "\n"; if (b701.gV(qo.Ml))
/* 18 */         str = m0.tF0(str, "#define fogFlag\n");  paramXw0
/* 19 */         .kw.getClass(); if (b701.gV(ED0.AH)) {
/* 20 */         str = m0.tF0(str, "#define environmentCubemapFlag\n");
/*    */       }
/*    */     } 
/*    */     int i;
/*    */     byte b;
/* 25 */     for (i = (paramXw0.L90.u90.Dt0.getAttributes()).rJ0.length, b = 0; b < i; )
/*    */     { lw0 lw0;
/*    */ 
/*    */       
/*    */       int j;
/*    */       
/* 31 */       if ((j = (lw0 = (paramXw0.L90.u90.Dt0.getAttributes()).rJ0[b]).s00) == 64)
/*    */       
/*    */       { 
/* 34 */         str = N.Gl0(zw.vz(str, "#define boneWeight"), lw0.ed, "Flag\n"); } else if (j == 16)
/*    */       
/*    */       { 
/* 37 */         str = N.Gl0(zw.vz(str, "#define texCoord"), lw0.ed, "Flag\n"); }  b++; }  long l2; if ((l1 & (
/* 38 */       l2 = zc.U7)) == l2)
/* 39 */       str = m0.tF0(str, "#define blendedFlag\n");  if ((l1 & (
/* 40 */       l2 = O80.Jg0)) == l2)
/*    */     {
/* 42 */       str = m0.tF0(m0.tF0(str, "#define diffuseTextureFlag\n"), "#define diffuseTextureCoord texCoord0\n"); }  if ((l1 & (
/* 43 */       l2 = O80.D8)) == l2)
/*    */     {
/* 45 */       str = m0.tF0(m0.tF0(str, "#define specularTextureFlag\n"), "#define specularTextureCoord texCoord0\n"); }  if ((l1 & (
/* 46 */       l2 = O80.tM)) == l2)
/*    */     {
/* 48 */       str = m0.tF0(m0.tF0(str, "#define normalTextureFlag\n"), "#define normalTextureCoord texCoord0\n"); }  if ((l1 & (
/* 49 */       l2 = O80.fS)) == l2)
/*    */     {
/* 51 */       str = m0.tF0(m0.tF0(str, "#define emissiveTextureFlag\n"), "#define emissiveTextureCoord texCoord0\n"); }  if ((l1 & (
/* 52 */       l2 = O80.La)) == l2)
/*    */     {
/* 54 */       str = m0.tF0(m0.tF0(str, "#define reflectionTextureFlag\n"), "#define reflectionTextureCoord texCoord0\n"); }  if ((l1 & (
/* 55 */       l2 = O80.Mc0)) == l2)
/*    */     {
/* 57 */       str = m0.tF0(m0.tF0(str, "#define ambientTextureFlag\n"), "#define ambientTextureCoord texCoord0\n"); }  if ((l1 & (
/* 58 */       l2 = qo.A80)) == l2)
/* 59 */       str = m0.tF0(str, "#define diffuseColorFlag\n");  if ((l1 & (
/* 60 */       l2 = s5.DR)) == l2)
/* 61 */       str = m0.tF0(str, "#define overlayColorFlag\n");  if ((l1 & (
/* 62 */       l2 = F4.Qr0)) == l2)
/* 63 */       str = m0.tF0(str, "#define glowFlag\n");  if ((l1 & (
/* 64 */       l2 = qo.J9)) == l2)
/* 65 */       str = m0.tF0(str, "#define specularColorFlag\n");  if ((l1 & (
/* 66 */       l2 = qo.cu0)) == l2)
/* 67 */       str = m0.tF0(str, "#define emissiveColorFlag\n");  if ((l1 & (
/* 68 */       l2 = qo.Ib)) == l2)
/* 69 */       str = m0.tF0(str, "#define reflectionColorFlag\n");  if ((l1 & (
/* 70 */       l2 = LPT9.ft0)) == l2)
/* 71 */       str = m0.tF0(str, "#define shininessFlag\n");  if ((l1 & (
/* 72 */       l1 = LPT9.It0)) == l1)
/* 73 */       str = m0.tF0(str, "#define alphaTestFlag\n");  if (paramXw0
/* 74 */       .Et != null) { paramej0.getClass(); str = str + "#define numBones " + '\f' + "\n"; }  return str; }
/*    */ 
/*    */   
/*    */   public final void init() {
/*    */     int i;
/*    */     Rm0 rm0 = this.program;
/*    */     this.program = null;
/*    */     init(rm0, this.UV);
/*    */     this.UV = null;
/*    */     this.iG0 = loc(this.nR);
/*    */     this.WF = loc(this.nR) - this.iG0;
/*    */     this.Ed0 = loc(this.HX) - this.iG0;
/*    */     if ((this.Kr0 = loc(this.Qj) - this.iG0) < 0)
/*    */       this.Kr0 = 0; 
/*    */     this.Uf = loc(this.COm6);
/*    */     this.T60 = loc(this.COm6) - this.Uf;
/*    */     this.nm = loc(this.oo0) - this.Uf;
/*    */     if (has(this.sx0)) {
/*    */       i = loc(this.sx0) - this.Uf;
/*    */     } else {
/*    */       i = -1;
/*    */     } 
/*    */     this.Qg = i;
/*    */     if ((this.Jw = loc(this.Oa0) - this.Uf) < 0)
/*    */       this.Jw = 0; 
/*    */     this.ol0 = loc(this.YJ);
/*    */     this.j00 = loc(this.YJ) - this.ol0;
/*    */     this.Sm0 = loc(this.IV) - this.ol0;
/*    */     this.ME = loc(this.yw) - this.ol0;
/*    */     if (has(this.up)) {
/*    */       i = loc(this.up) - this.ol0;
/*    */     } else {
/*    */       i = -1;
/*    */     } 
/*    */     this.ae0 = i;
/*    */     this.U60 = loc(this.rA) - this.ol0;
/*    */     this.fy0 = loc(this.cd) - this.ol0;
/*    */     if ((this.HG0 = loc(this.mi) - this.ol0) < 0)
/*    */       this.HG0 = 0; 
/*    */   }
/*    */   
/*    */   public final boolean canRender(Xw0 paramXw0) {
/*    */     long l = 0L;
/*    */     fo0 fo0;
/*    */     if ((fo0 = paramXw0.kw) != null)
/*    */       l = fo0.Qr | l; 
/*    */     T0 t0;
/*    */     if ((t0 = paramXw0.bL) != null)
/*    */       l |= t0.Qr; 
/*    */     return (this.ct0 == (l | dn0) && this.ie == paramXw0.L90.u90.Dt0.getAttributes().Ep() && ((paramXw0.kw != null)) == this.ee0);
/*    */   }
/*    */   
/*    */   public final boolean equals(Object paramObject) {
/*    */     boolean bool;
/*    */     if (paramObject instanceof bB0 && (bB0)paramObject == this) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     return bool;
/*    */   }
/*    */   
/*    */   public final void begin(ny paramny, l2 paraml2) {
/*    */     super.begin(paramny, paraml2);
/*    */     vm[] arrayOfVm;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfVm = this.ZF).length, b = 0; b < i; ) {
/*    */       (arrayOfVm[b]).sL0.set(0.0F, 0.0F, 0.0F, 1.0F);
/*    */       (arrayOfVm[b]).wd.TG0(0.0F, -1.0F, 0.0F).WC0();
/*    */       b++;
/*    */     } 
/*    */     rN[] arrayOfRN;
/*    */     for (i = (arrayOfRN = this.io0).length, b = 0; b < i; ) {
/*    */       (arrayOfRN[b]).sL0.set(0.0F, 0.0F, 0.0F, 1.0F);
/*    */       (arrayOfRN[b]).BN.TG0(0.0F, 0.0F, 0.0F);
/*    */       (arrayOfRN[b]).Mx0 = 0.0F;
/*    */       b++;
/*    */     } 
/*    */     d80[] arrayOfD80;
/*    */     for (i = (arrayOfD80 = this.Qi0).length, b = 0; b < i; ) {
/*    */       (arrayOfD80[b]).sL0.set(0.0F, 0.0F, 0.0F, 1.0F);
/*    */       (arrayOfD80[b]).A20.TG0(0.0F, 0.0F, 0.0F);
/*    */       (arrayOfD80[b]).En0.TG0(0.0F, -1.0F, 0.0F).WC0();
/*    */       (arrayOfD80[b]).bs0 = 0.0F;
/*    */       (arrayOfD80[b]).a5 = 1.0F;
/*    */       (arrayOfD80[b]).Xo = 0.0F;
/*    */       b++;
/*    */     } 
/*    */     this.n30 = false;
/*    */     if (has(this.qd)) {
/*    */       int j = this.qd;
/*    */       float f = this.B70 + UB0.M60.Qy;
/*    */       set(j, f);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void render(Xw0 paramXw0, b70 paramb70) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: getstatic f/zc.U7 : J
/*    */     //   4: invokevirtual gV : (J)Z
/*    */     //   7: ifne -> 24
/*    */     //   10: aload_0
/*    */     //   11: getfield context : Lf/l2;
/*    */     //   14: sipush #770
/*    */     //   17: sipush #771
/*    */     //   20: iconst_0
/*    */     //   21: invokevirtual Mg : (IIZ)V
/*    */     //   24: aload_2
/*    */     //   25: aload_0
/*    */     //   26: dup
/*    */     //   27: getfield tj0 : Lf/ej0;
/*    */     //   30: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   33: pop
/*    */     //   34: getstatic f/bB0.wy : I
/*    */     //   37: istore_3
/*    */     //   38: getfield tj0 : Lf/ej0;
/*    */     //   41: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   44: pop
/*    */     //   45: getstatic f/bB0.cO : I
/*    */     //   48: istore #4
/*    */     //   50: fconst_0
/*    */     //   51: fstore #5
/*    */     //   53: fconst_1
/*    */     //   54: fstore #6
/*    */     //   56: iconst_1
/*    */     //   57: istore #7
/*    */     //   59: getfield ra0 : Lf/fQ;
/*    */     //   62: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   65: astore #8
/*    */     //   67: aload #8
/*    */     //   69: invokevirtual hasNext : ()Z
/*    */     //   72: ifeq -> 525
/*    */     //   75: aload #8
/*    */     //   77: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   80: checkcast f/dj
/*    */     //   83: dup
/*    */     //   84: astore #9
/*    */     //   86: getfield tL : J
/*    */     //   89: dup2
/*    */     //   90: lstore #10
/*    */     //   92: getstatic f/zc.U7 : J
/*    */     //   95: land
/*    */     //   96: lload #10
/*    */     //   98: lcmp
/*    */     //   99: ifne -> 108
/*    */     //   102: iconst_1
/*    */     //   103: istore #12
/*    */     //   105: goto -> 111
/*    */     //   108: iconst_0
/*    */     //   109: istore #12
/*    */     //   111: iload #12
/*    */     //   113: ifeq -> 170
/*    */     //   116: aload_0
/*    */     //   117: aload #9
/*    */     //   119: aload_0
/*    */     //   120: getfield context : Lf/l2;
/*    */     //   123: astore #9
/*    */     //   125: checkcast f/zc
/*    */     //   128: dup
/*    */     //   129: astore #10
/*    */     //   131: aload_0
/*    */     //   132: aload #9
/*    */     //   134: aload #10
/*    */     //   136: dup
/*    */     //   137: getfield fi : I
/*    */     //   140: istore #9
/*    */     //   142: getfield Wy : I
/*    */     //   145: iload #9
/*    */     //   147: swap
/*    */     //   148: iconst_1
/*    */     //   149: invokevirtual Mg : (IIZ)V
/*    */     //   152: getfield St0 : I
/*    */     //   155: istore #9
/*    */     //   157: getfield yg0 : F
/*    */     //   160: iload #9
/*    */     //   162: swap
/*    */     //   163: invokevirtual set : (IF)Z
/*    */     //   166: pop
/*    */     //   167: goto -> 67
/*    */     //   170: lload #10
/*    */     //   172: getstatic f/Xf0.xZ : J
/*    */     //   175: dup2
/*    */     //   176: lstore #12
/*    */     //   178: land
/*    */     //   179: lload #12
/*    */     //   181: lcmp
/*    */     //   182: ifne -> 197
/*    */     //   185: aload #9
/*    */     //   187: checkcast f/Xf0
/*    */     //   190: getfield S90 : I
/*    */     //   193: istore_3
/*    */     //   194: goto -> 67
/*    */     //   197: lload #10
/*    */     //   199: getstatic f/LPT9.It0 : J
/*    */     //   202: dup2
/*    */     //   203: lstore #12
/*    */     //   205: land
/*    */     //   206: lload #12
/*    */     //   208: lcmp
/*    */     //   209: ifne -> 232
/*    */     //   212: aload_0
/*    */     //   213: dup
/*    */     //   214: getfield ny : I
/*    */     //   217: aload #9
/*    */     //   219: checkcast f/LPT9
/*    */     //   222: getfield dy0 : F
/*    */     //   225: invokevirtual set : (IF)Z
/*    */     //   228: pop
/*    */     //   229: goto -> 67
/*    */     //   232: lload #10
/*    */     //   234: invokestatic tc0 : (J)Z
/*    */     //   237: ifeq -> 469
/*    */     //   240: aload_2
/*    */     //   241: aload #9
/*    */     //   243: checkcast f/F4
/*    */     //   246: astore #9
/*    */     //   248: getstatic f/O80.Jg0 : J
/*    */     //   251: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   254: checkcast f/O80
/*    */     //   257: getfield cv0 : Lf/IX;
/*    */     //   260: getfield ze : Lf/zp;
/*    */     //   263: checkcast com/badlogic/gdx/graphics/Texture
/*    */     //   266: dup
/*    */     //   267: astore #10
/*    */     //   269: ifnull -> 67
/*    */     //   272: aload_0
/*    */     //   273: aload #9
/*    */     //   275: aload_0
/*    */     //   276: dup
/*    */     //   277: aload #9
/*    */     //   279: aload_0
/*    */     //   280: dup
/*    */     //   281: aload #9
/*    */     //   283: aload_0
/*    */     //   284: dup
/*    */     //   285: aload #9
/*    */     //   287: aload_0
/*    */     //   288: dup
/*    */     //   289: dup
/*    */     //   290: dup2
/*    */     //   291: getfield oe : I
/*    */     //   294: aload #10
/*    */     //   296: dup
/*    */     //   297: invokevirtual getWidth : ()I
/*    */     //   300: i2f
/*    */     //   301: fstore #9
/*    */     //   303: invokevirtual getHeight : ()I
/*    */     //   306: i2f
/*    */     //   307: fload #9
/*    */     //   309: swap
/*    */     //   310: invokevirtual set : (IFF)Z
/*    */     //   313: pop
/*    */     //   314: getfield CoM6 : I
/*    */     //   317: aload #10
/*    */     //   319: dup
/*    */     //   320: invokevirtual getWidth : ()I
/*    */     //   323: iconst_1
/*    */     //   324: isub
/*    */     //   325: i2f
/*    */     //   326: fconst_1
/*    */     //   327: swap
/*    */     //   328: fdiv
/*    */     //   329: fstore #9
/*    */     //   331: invokevirtual getHeight : ()I
/*    */     //   334: iconst_1
/*    */     //   335: isub
/*    */     //   336: i2f
/*    */     //   337: fstore #10
/*    */     //   339: fload #9
/*    */     //   341: fconst_1
/*    */     //   342: fload #10
/*    */     //   344: fdiv
/*    */     //   345: invokevirtual set : (IFF)Z
/*    */     //   348: pop
/*    */     //   349: getfield Mo0 : I
/*    */     //   352: istore #9
/*    */     //   354: getfield Nx0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   357: iload #9
/*    */     //   359: swap
/*    */     //   360: dup
/*    */     //   361: dup
/*    */     //   362: getfield r : F
/*    */     //   365: fstore #9
/*    */     //   367: getfield g : F
/*    */     //   370: fstore #10
/*    */     //   372: getfield b : F
/*    */     //   375: fstore #11
/*    */     //   377: fload #9
/*    */     //   379: fload #10
/*    */     //   381: fload #11
/*    */     //   383: invokevirtual set : (IFFF)Z
/*    */     //   386: pop
/*    */     //   387: getfield ql : I
/*    */     //   390: istore #9
/*    */     //   392: getfield hV : F
/*    */     //   395: iload #9
/*    */     //   397: swap
/*    */     //   398: invokevirtual set : (IF)Z
/*    */     //   401: pop
/*    */     //   402: getfield XI0 : I
/*    */     //   405: istore #9
/*    */     //   407: getfield A8 : F
/*    */     //   410: iload #9
/*    */     //   412: swap
/*    */     //   413: invokevirtual set : (IF)Z
/*    */     //   416: pop
/*    */     //   417: getfield LPT9 : I
/*    */     //   420: istore #9
/*    */     //   422: getfield nj0 : F
/*    */     //   425: iload #9
/*    */     //   427: swap
/*    */     //   428: invokevirtual set : (IF)Z
/*    */     //   431: pop
/*    */     //   432: getstatic f/h1.YJ : I
/*    */     //   435: iconst_1
/*    */     //   436: if_icmpne -> 454
/*    */     //   439: aload_0
/*    */     //   440: dup
/*    */     //   441: getfield Qk : I
/*    */     //   444: ldc_w 9.0
/*    */     //   447: invokevirtual set : (IF)Z
/*    */     //   450: pop
/*    */     //   451: goto -> 67
/*    */     //   454: aload_0
/*    */     //   455: dup
/*    */     //   456: getfield Qk : I
/*    */     //   459: ldc_w 3.0
/*    */     //   462: invokevirtual set : (IF)Z
/*    */     //   465: pop
/*    */     //   466: goto -> 67
/*    */     //   469: lload #10
/*    */     //   471: getstatic f/IF.kA0 : J
/*    */     //   474: dup2
/*    */     //   475: lstore #10
/*    */     //   477: land
/*    */     //   478: lload #10
/*    */     //   480: lcmp
/*    */     //   481: ifne -> 514
/*    */     //   484: aload #9
/*    */     //   486: checkcast f/IF
/*    */     //   489: dup
/*    */     //   490: dup2
/*    */     //   491: getfield Q5 : I
/*    */     //   494: istore #4
/*    */     //   496: getfield bW : F
/*    */     //   499: fstore #5
/*    */     //   501: getfield d30 : F
/*    */     //   504: fstore #6
/*    */     //   506: getfield OP : Z
/*    */     //   509: istore #7
/*    */     //   511: goto -> 67
/*    */     //   514: aload_0
/*    */     //   515: getfield tj0 : Lf/ej0;
/*    */     //   518: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   521: pop
/*    */     //   522: goto -> 67
/*    */     //   525: aload_0
/*    */     //   526: dup
/*    */     //   527: dup
/*    */     //   528: getfield context : Lf/l2;
/*    */     //   531: iload_3
/*    */     //   532: invokevirtual W60 : (I)V
/*    */     //   535: getfield context : Lf/l2;
/*    */     //   538: iload #4
/*    */     //   540: fload #5
/*    */     //   542: fload #6
/*    */     //   544: invokevirtual N4 : (IFF)V
/*    */     //   547: getfield context : Lf/l2;
/*    */     //   550: dup
/*    */     //   551: astore_3
/*    */     //   552: getfield lp : Z
/*    */     //   555: iload #7
/*    */     //   557: if_icmpeq -> 576
/*    */     //   560: getstatic f/UB0.go : Lf/hj0;
/*    */     //   563: iload #7
/*    */     //   565: aload_3
/*    */     //   566: iload #7
/*    */     //   568: putfield lp : Z
/*    */     //   571: invokeinterface glDepthMask : (Z)V
/*    */     //   576: aload_0
/*    */     //   577: getfield ee0 : Z
/*    */     //   580: ifeq -> 2174
/*    */     //   583: aload_2
/*    */     //   584: aload_1
/*    */     //   585: getfield kw : Lf/fo0;
/*    */     //   588: pop
/*    */     //   589: getstatic f/uu.N1 : J
/*    */     //   592: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   595: checkcast f/uu
/*    */     //   598: dup
/*    */     //   599: astore_3
/*    */     //   600: ifnonnull -> 608
/*    */     //   603: aconst_null
/*    */     //   604: astore_3
/*    */     //   605: goto -> 613
/*    */     //   608: aload_3
/*    */     //   609: getfield GE : Lf/fQ;
/*    */     //   612: astore_3
/*    */     //   613: aload_2
/*    */     //   614: getstatic f/H60.JM : J
/*    */     //   617: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   620: checkcast f/H60
/*    */     //   623: dup
/*    */     //   624: astore #4
/*    */     //   626: ifnonnull -> 635
/*    */     //   629: aconst_null
/*    */     //   630: astore #4
/*    */     //   632: goto -> 642
/*    */     //   635: aload #4
/*    */     //   637: getfield O1 : Lf/fQ;
/*    */     //   640: astore #4
/*    */     //   642: aload_2
/*    */     //   643: getstatic f/yJ.YQ : J
/*    */     //   646: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   649: checkcast f/yJ
/*    */     //   652: dup
/*    */     //   653: astore #5
/*    */     //   655: ifnonnull -> 664
/*    */     //   658: aconst_null
/*    */     //   659: astore #5
/*    */     //   661: goto -> 671
/*    */     //   664: aload #5
/*    */     //   666: getfield qG : Lf/fQ;
/*    */     //   669: astore #5
/*    */     //   671: aload_0
/*    */     //   672: getfield iG0 : I
/*    */     //   675: iflt -> 1102
/*    */     //   678: iconst_0
/*    */     //   679: istore #6
/*    */     //   681: iload #6
/*    */     //   683: aload_0
/*    */     //   684: getfield ZF : [Lf/vm;
/*    */     //   687: dup
/*    */     //   688: astore #7
/*    */     //   690: arraylength
/*    */     //   691: if_icmpge -> 1102
/*    */     //   694: aload_3
/*    */     //   695: ifnull -> 909
/*    */     //   698: iload #6
/*    */     //   700: aload_3
/*    */     //   701: getfield Z8 : I
/*    */     //   704: if_icmplt -> 710
/*    */     //   707: goto -> 909
/*    */     //   710: aload_0
/*    */     //   711: getfield n30 : Z
/*    */     //   714: ifeq -> 801
/*    */     //   717: aload_3
/*    */     //   718: iload #6
/*    */     //   720: aload #7
/*    */     //   722: iload #6
/*    */     //   724: aaload
/*    */     //   725: astore #7
/*    */     //   727: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   730: checkcast f/vm
/*    */     //   733: dup
/*    */     //   734: astore #8
/*    */     //   736: aload #7
/*    */     //   738: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   741: pop
/*    */     //   742: ifnull -> 790
/*    */     //   745: aload #8
/*    */     //   747: aload #7
/*    */     //   749: if_acmpeq -> 784
/*    */     //   752: aload #7
/*    */     //   754: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   757: aload #8
/*    */     //   759: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   762: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   765: ifeq -> 790
/*    */     //   768: aload #7
/*    */     //   770: getfield wd : Lf/eo;
/*    */     //   773: aload #8
/*    */     //   775: getfield wd : Lf/eo;
/*    */     //   778: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   781: ifeq -> 790
/*    */     //   784: iconst_1
/*    */     //   785: istore #7
/*    */     //   787: goto -> 793
/*    */     //   790: iconst_0
/*    */     //   791: istore #7
/*    */     //   793: iload #7
/*    */     //   795: ifeq -> 801
/*    */     //   798: goto -> 1096
/*    */     //   801: aload_3
/*    */     //   802: iload #6
/*    */     //   804: aload_0
/*    */     //   805: getfield ZF : [Lf/vm;
/*    */     //   808: iload #6
/*    */     //   810: aaload
/*    */     //   811: astore #7
/*    */     //   813: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   816: checkcast f/vm
/*    */     //   819: dup
/*    */     //   820: astore #8
/*    */     //   822: aload #7
/*    */     //   824: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   827: pop
/*    */     //   828: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   831: dup
/*    */     //   832: astore #9
/*    */     //   834: aload #8
/*    */     //   836: getfield wd : Lf/eo;
/*    */     //   839: astore #8
/*    */     //   841: ifnull -> 855
/*    */     //   844: aload #7
/*    */     //   846: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   849: aload #9
/*    */     //   851: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   854: pop
/*    */     //   855: aload #8
/*    */     //   857: ifnull -> 974
/*    */     //   860: aload #7
/*    */     //   862: getfield wd : Lf/eo;
/*    */     //   865: dup
/*    */     //   866: astore #7
/*    */     //   868: aload #8
/*    */     //   870: dup
/*    */     //   871: dup
/*    */     //   872: aload #7
/*    */     //   874: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   877: pop
/*    */     //   878: getfield x : F
/*    */     //   881: fstore #7
/*    */     //   883: getfield y : F
/*    */     //   886: fstore #8
/*    */     //   888: getfield z : F
/*    */     //   891: fstore #9
/*    */     //   893: fload #7
/*    */     //   895: fload #8
/*    */     //   897: fload #9
/*    */     //   899: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   902: invokevirtual WC0 : ()Lf/eo;
/*    */     //   905: pop
/*    */     //   906: goto -> 974
/*    */     //   909: aload_0
/*    */     //   910: getfield n30 : Z
/*    */     //   913: ifeq -> 958
/*    */     //   916: aload #7
/*    */     //   918: iload #6
/*    */     //   920: aaload
/*    */     //   921: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   924: dup
/*    */     //   925: astore #8
/*    */     //   927: getfield r : F
/*    */     //   930: fconst_0
/*    */     //   931: fcmpl
/*    */     //   932: ifne -> 958
/*    */     //   935: aload #8
/*    */     //   937: getfield g : F
/*    */     //   940: fconst_0
/*    */     //   941: fcmpl
/*    */     //   942: ifne -> 958
/*    */     //   945: aload #8
/*    */     //   947: getfield b : F
/*    */     //   950: fconst_0
/*    */     //   951: fcmpl
/*    */     //   952: ifne -> 958
/*    */     //   955: goto -> 1096
/*    */     //   958: aload #7
/*    */     //   960: iload #6
/*    */     //   962: aaload
/*    */     //   963: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   966: fconst_0
/*    */     //   967: fconst_0
/*    */     //   968: fconst_0
/*    */     //   969: fconst_1
/*    */     //   970: invokevirtual set : (FFFF)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   973: pop
/*    */     //   974: aload_0
/*    */     //   975: dup
/*    */     //   976: dup
/*    */     //   977: iload #6
/*    */     //   979: aload_0
/*    */     //   980: dup
/*    */     //   981: getfield iG0 : I
/*    */     //   984: istore #7
/*    */     //   986: getfield Kr0 : I
/*    */     //   989: imul
/*    */     //   990: iload #7
/*    */     //   992: iadd
/*    */     //   993: istore #7
/*    */     //   995: getfield program : Lf/Rm0;
/*    */     //   998: iload #7
/*    */     //   1000: aload_0
/*    */     //   1001: getfield WF : I
/*    */     //   1004: iadd
/*    */     //   1005: aload_0
/*    */     //   1006: getfield ZF : [Lf/vm;
/*    */     //   1009: iload #6
/*    */     //   1011: aaload
/*    */     //   1012: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1015: dup
/*    */     //   1016: dup
/*    */     //   1017: getfield r : F
/*    */     //   1020: fstore #8
/*    */     //   1022: getfield g : F
/*    */     //   1025: fstore #9
/*    */     //   1027: getfield b : F
/*    */     //   1030: fstore #10
/*    */     //   1032: fload #8
/*    */     //   1034: fload #9
/*    */     //   1036: fload #10
/*    */     //   1038: invokevirtual IB : (IFFF)V
/*    */     //   1041: getfield program : Lf/Rm0;
/*    */     //   1044: iload #7
/*    */     //   1046: aload_0
/*    */     //   1047: getfield Ed0 : I
/*    */     //   1050: iadd
/*    */     //   1051: aload_0
/*    */     //   1052: getfield ZF : [Lf/vm;
/*    */     //   1055: iload #6
/*    */     //   1057: aaload
/*    */     //   1058: getfield wd : Lf/eo;
/*    */     //   1061: dup
/*    */     //   1062: dup
/*    */     //   1063: getfield x : F
/*    */     //   1066: fstore #7
/*    */     //   1068: getfield y : F
/*    */     //   1071: fstore #8
/*    */     //   1073: getfield z : F
/*    */     //   1076: fstore #9
/*    */     //   1078: fload #7
/*    */     //   1080: fload #8
/*    */     //   1082: fload #9
/*    */     //   1084: invokevirtual IB : (IFFF)V
/*    */     //   1087: getfield Kr0 : I
/*    */     //   1090: ifgt -> 1096
/*    */     //   1093: goto -> 1102
/*    */     //   1096: iinc #6, 1
/*    */     //   1099: goto -> 681
/*    */     //   1102: aload_0
/*    */     //   1103: getfield Uf : I
/*    */     //   1106: iflt -> 1507
/*    */     //   1109: iconst_0
/*    */     //   1110: istore_3
/*    */     //   1111: iload_3
/*    */     //   1112: aload_0
/*    */     //   1113: getfield io0 : [Lf/rN;
/*    */     //   1116: dup
/*    */     //   1117: astore #6
/*    */     //   1119: arraylength
/*    */     //   1120: if_icmpge -> 1507
/*    */     //   1123: aload #4
/*    */     //   1125: ifnull -> 1286
/*    */     //   1128: iload_3
/*    */     //   1129: aload #4
/*    */     //   1131: getfield Z8 : I
/*    */     //   1134: if_icmplt -> 1140
/*    */     //   1137: goto -> 1286
/*    */     //   1140: aload_0
/*    */     //   1141: getfield n30 : Z
/*    */     //   1144: ifeq -> 1169
/*    */     //   1147: aload #6
/*    */     //   1149: iload_3
/*    */     //   1150: aaload
/*    */     //   1151: aload #4
/*    */     //   1153: iload_3
/*    */     //   1154: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   1157: checkcast f/rN
/*    */     //   1160: invokevirtual fa0 : (Lf/rN;)Z
/*    */     //   1163: ifeq -> 1169
/*    */     //   1166: goto -> 1501
/*    */     //   1169: aload #4
/*    */     //   1171: iload_3
/*    */     //   1172: aload_0
/*    */     //   1173: getfield io0 : [Lf/rN;
/*    */     //   1176: iload_3
/*    */     //   1177: aaload
/*    */     //   1178: astore #6
/*    */     //   1180: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   1183: checkcast f/rN
/*    */     //   1186: dup
/*    */     //   1187: astore #7
/*    */     //   1189: aload #6
/*    */     //   1191: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1194: pop
/*    */     //   1195: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1198: dup
/*    */     //   1199: astore #8
/*    */     //   1201: aload #7
/*    */     //   1203: dup
/*    */     //   1204: getfield BN : Lf/eo;
/*    */     //   1207: astore #7
/*    */     //   1209: getfield Mx0 : F
/*    */     //   1212: fstore #9
/*    */     //   1214: ifnull -> 1228
/*    */     //   1217: aload #6
/*    */     //   1219: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1222: aload #8
/*    */     //   1224: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1227: pop
/*    */     //   1228: aload #7
/*    */     //   1230: ifnull -> 1276
/*    */     //   1233: aload #6
/*    */     //   1235: getfield BN : Lf/eo;
/*    */     //   1238: dup
/*    */     //   1239: astore #8
/*    */     //   1241: aload #7
/*    */     //   1243: dup
/*    */     //   1244: dup
/*    */     //   1245: aload #8
/*    */     //   1247: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1250: pop
/*    */     //   1251: getfield x : F
/*    */     //   1254: fstore #7
/*    */     //   1256: getfield y : F
/*    */     //   1259: fstore #8
/*    */     //   1261: getfield z : F
/*    */     //   1264: fstore #10
/*    */     //   1266: fload #7
/*    */     //   1268: fload #8
/*    */     //   1270: fload #10
/*    */     //   1272: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1275: pop
/*    */     //   1276: aload #6
/*    */     //   1278: fload #9
/*    */     //   1280: putfield Mx0 : F
/*    */     //   1283: goto -> 1316
/*    */     //   1286: aload_0
/*    */     //   1287: getfield n30 : Z
/*    */     //   1290: ifeq -> 1308
/*    */     //   1293: aload #6
/*    */     //   1295: iload_3
/*    */     //   1296: aaload
/*    */     //   1297: getfield Mx0 : F
/*    */     //   1300: fconst_0
/*    */     //   1301: fcmpl
/*    */     //   1302: ifne -> 1308
/*    */     //   1305: goto -> 1501
/*    */     //   1308: aload #6
/*    */     //   1310: iload_3
/*    */     //   1311: aaload
/*    */     //   1312: fconst_0
/*    */     //   1313: putfield Mx0 : F
/*    */     //   1316: aload_0
/*    */     //   1317: dup
/*    */     //   1318: dup
/*    */     //   1319: iload_3
/*    */     //   1320: aload_0
/*    */     //   1321: dup
/*    */     //   1322: getfield Uf : I
/*    */     //   1325: istore #6
/*    */     //   1327: getfield Jw : I
/*    */     //   1330: imul
/*    */     //   1331: iload #6
/*    */     //   1333: iadd
/*    */     //   1334: istore #6
/*    */     //   1336: getfield program : Lf/Rm0;
/*    */     //   1339: iload #6
/*    */     //   1341: aload_0
/*    */     //   1342: getfield T60 : I
/*    */     //   1345: iadd
/*    */     //   1346: aload_0
/*    */     //   1347: getfield io0 : [Lf/rN;
/*    */     //   1350: iload_3
/*    */     //   1351: aaload
/*    */     //   1352: dup
/*    */     //   1353: astore #7
/*    */     //   1355: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1358: dup
/*    */     //   1359: dup
/*    */     //   1360: getfield r : F
/*    */     //   1363: aload #7
/*    */     //   1365: getfield Mx0 : F
/*    */     //   1368: dup
/*    */     //   1369: fstore #7
/*    */     //   1371: fmul
/*    */     //   1372: fstore #8
/*    */     //   1374: getfield g : F
/*    */     //   1377: fload #7
/*    */     //   1379: fmul
/*    */     //   1380: fstore #9
/*    */     //   1382: getfield b : F
/*    */     //   1385: fload #7
/*    */     //   1387: fmul
/*    */     //   1388: fstore #7
/*    */     //   1390: fload #8
/*    */     //   1392: fload #9
/*    */     //   1394: fload #7
/*    */     //   1396: invokevirtual IB : (IFFF)V
/*    */     //   1399: getfield program : Lf/Rm0;
/*    */     //   1402: iload #6
/*    */     //   1404: aload_0
/*    */     //   1405: getfield nm : I
/*    */     //   1408: iadd
/*    */     //   1409: aload_0
/*    */     //   1410: getfield io0 : [Lf/rN;
/*    */     //   1413: iload_3
/*    */     //   1414: aaload
/*    */     //   1415: getfield BN : Lf/eo;
/*    */     //   1418: dup
/*    */     //   1419: dup
/*    */     //   1420: getfield x : F
/*    */     //   1423: fstore #7
/*    */     //   1425: getfield y : F
/*    */     //   1428: fstore #8
/*    */     //   1430: getfield z : F
/*    */     //   1433: fstore #9
/*    */     //   1435: fload #7
/*    */     //   1437: fload #8
/*    */     //   1439: fload #9
/*    */     //   1441: invokevirtual IB : (IFFF)V
/*    */     //   1444: getfield Qg : I
/*    */     //   1447: dup
/*    */     //   1448: istore #7
/*    */     //   1450: iflt -> 1491
/*    */     //   1453: aload_0
/*    */     //   1454: getfield program : Lf/Rm0;
/*    */     //   1457: aload_0
/*    */     //   1458: iload #6
/*    */     //   1460: iload #7
/*    */     //   1462: iadd
/*    */     //   1463: istore #6
/*    */     //   1465: getfield io0 : [Lf/rN;
/*    */     //   1468: iload_3
/*    */     //   1469: aaload
/*    */     //   1470: getfield Mx0 : F
/*    */     //   1473: fstore #7
/*    */     //   1475: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1478: pop
/*    */     //   1479: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   1482: iload #6
/*    */     //   1484: fload #7
/*    */     //   1486: invokeinterface glUniform1f : (IF)V
/*    */     //   1491: aload_0
/*    */     //   1492: getfield Jw : I
/*    */     //   1495: ifgt -> 1501
/*    */     //   1498: goto -> 1507
/*    */     //   1501: iinc #3, 1
/*    */     //   1504: goto -> 1111
/*    */     //   1507: aload_0
/*    */     //   1508: getfield ol0 : I
/*    */     //   1511: iflt -> 2134
/*    */     //   1514: iconst_0
/*    */     //   1515: istore_3
/*    */     //   1516: iload_3
/*    */     //   1517: aload_0
/*    */     //   1518: getfield Qi0 : [Lf/d80;
/*    */     //   1521: dup
/*    */     //   1522: astore #4
/*    */     //   1524: arraylength
/*    */     //   1525: if_icmpge -> 2134
/*    */     //   1528: aload #5
/*    */     //   1530: ifnull -> 1771
/*    */     //   1533: iload_3
/*    */     //   1534: aload #5
/*    */     //   1536: getfield Z8 : I
/*    */     //   1539: if_icmplt -> 1545
/*    */     //   1542: goto -> 1771
/*    */     //   1545: aload_0
/*    */     //   1546: getfield n30 : Z
/*    */     //   1549: ifeq -> 1574
/*    */     //   1552: aload #4
/*    */     //   1554: iload_3
/*    */     //   1555: aaload
/*    */     //   1556: aload #5
/*    */     //   1558: iload_3
/*    */     //   1559: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   1562: checkcast f/d80
/*    */     //   1565: invokevirtual lE : (Lf/d80;)Z
/*    */     //   1568: ifeq -> 1574
/*    */     //   1571: goto -> 2128
/*    */     //   1574: aload #5
/*    */     //   1576: iload_3
/*    */     //   1577: aload_0
/*    */     //   1578: getfield Qi0 : [Lf/d80;
/*    */     //   1581: iload_3
/*    */     //   1582: aaload
/*    */     //   1583: astore #4
/*    */     //   1585: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   1588: checkcast f/d80
/*    */     //   1591: dup
/*    */     //   1592: astore #6
/*    */     //   1594: aload #4
/*    */     //   1596: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1599: pop
/*    */     //   1600: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1603: dup
/*    */     //   1604: astore #7
/*    */     //   1606: aload #6
/*    */     //   1608: dup
/*    */     //   1609: dup
/*    */     //   1610: dup2
/*    */     //   1611: getfield A20 : Lf/eo;
/*    */     //   1614: astore #6
/*    */     //   1616: getfield En0 : Lf/eo;
/*    */     //   1619: astore #8
/*    */     //   1621: getfield bs0 : F
/*    */     //   1624: fstore #9
/*    */     //   1626: getfield a5 : F
/*    */     //   1629: fstore #10
/*    */     //   1631: getfield Xo : F
/*    */     //   1634: fstore #11
/*    */     //   1636: ifnull -> 1650
/*    */     //   1639: aload #4
/*    */     //   1641: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1644: aload #7
/*    */     //   1646: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1649: pop
/*    */     //   1650: aload #6
/*    */     //   1652: ifnull -> 1698
/*    */     //   1655: aload #4
/*    */     //   1657: getfield A20 : Lf/eo;
/*    */     //   1660: dup
/*    */     //   1661: astore #7
/*    */     //   1663: aload #6
/*    */     //   1665: dup
/*    */     //   1666: dup
/*    */     //   1667: aload #7
/*    */     //   1669: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1672: pop
/*    */     //   1673: getfield x : F
/*    */     //   1676: fstore #6
/*    */     //   1678: getfield y : F
/*    */     //   1681: fstore #7
/*    */     //   1683: getfield z : F
/*    */     //   1686: fstore #12
/*    */     //   1688: fload #6
/*    */     //   1690: fload #7
/*    */     //   1692: fload #12
/*    */     //   1694: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1697: pop
/*    */     //   1698: aload #8
/*    */     //   1700: ifnull -> 1749
/*    */     //   1703: aload #4
/*    */     //   1705: getfield En0 : Lf/eo;
/*    */     //   1708: dup
/*    */     //   1709: astore #6
/*    */     //   1711: aload #8
/*    */     //   1713: dup
/*    */     //   1714: dup
/*    */     //   1715: aload #6
/*    */     //   1717: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1720: pop
/*    */     //   1721: getfield x : F
/*    */     //   1724: fstore #6
/*    */     //   1726: getfield y : F
/*    */     //   1729: fstore #7
/*    */     //   1731: getfield z : F
/*    */     //   1734: fstore #8
/*    */     //   1736: fload #6
/*    */     //   1738: fload #7
/*    */     //   1740: fload #8
/*    */     //   1742: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1745: invokevirtual WC0 : ()Lf/eo;
/*    */     //   1748: pop
/*    */     //   1749: aload #4
/*    */     //   1751: dup
/*    */     //   1752: dup
/*    */     //   1753: fload #9
/*    */     //   1755: putfield bs0 : F
/*    */     //   1758: fload #10
/*    */     //   1760: putfield a5 : F
/*    */     //   1763: fload #11
/*    */     //   1765: putfield Xo : F
/*    */     //   1768: goto -> 1801
/*    */     //   1771: aload_0
/*    */     //   1772: getfield n30 : Z
/*    */     //   1775: ifeq -> 1793
/*    */     //   1778: aload #4
/*    */     //   1780: iload_3
/*    */     //   1781: aaload
/*    */     //   1782: getfield bs0 : F
/*    */     //   1785: fconst_0
/*    */     //   1786: fcmpl
/*    */     //   1787: ifne -> 1793
/*    */     //   1790: goto -> 2128
/*    */     //   1793: aload #4
/*    */     //   1795: iload_3
/*    */     //   1796: aaload
/*    */     //   1797: fconst_0
/*    */     //   1798: putfield bs0 : F
/*    */     //   1801: aload_0
/*    */     //   1802: dup
/*    */     //   1803: dup2
/*    */     //   1804: dup2
/*    */     //   1805: iload_3
/*    */     //   1806: aload_0
/*    */     //   1807: dup
/*    */     //   1808: getfield ol0 : I
/*    */     //   1811: istore #4
/*    */     //   1813: getfield HG0 : I
/*    */     //   1816: imul
/*    */     //   1817: iload #4
/*    */     //   1819: iadd
/*    */     //   1820: istore #4
/*    */     //   1822: getfield program : Lf/Rm0;
/*    */     //   1825: iload #4
/*    */     //   1827: aload_0
/*    */     //   1828: getfield j00 : I
/*    */     //   1831: iadd
/*    */     //   1832: aload_0
/*    */     //   1833: getfield Qi0 : [Lf/d80;
/*    */     //   1836: iload_3
/*    */     //   1837: aaload
/*    */     //   1838: dup
/*    */     //   1839: astore #6
/*    */     //   1841: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1844: dup
/*    */     //   1845: dup
/*    */     //   1846: getfield r : F
/*    */     //   1849: aload #6
/*    */     //   1851: getfield bs0 : F
/*    */     //   1854: dup
/*    */     //   1855: fstore #6
/*    */     //   1857: fmul
/*    */     //   1858: fstore #7
/*    */     //   1860: getfield g : F
/*    */     //   1863: fload #6
/*    */     //   1865: fmul
/*    */     //   1866: fstore #8
/*    */     //   1868: getfield b : F
/*    */     //   1871: fload #6
/*    */     //   1873: fmul
/*    */     //   1874: fstore #6
/*    */     //   1876: fload #7
/*    */     //   1878: fload #8
/*    */     //   1880: fload #6
/*    */     //   1882: invokevirtual IB : (IFFF)V
/*    */     //   1885: getfield program : Lf/Rm0;
/*    */     //   1888: dup
/*    */     //   1889: astore #6
/*    */     //   1891: iload #4
/*    */     //   1893: aload_0
/*    */     //   1894: getfield Sm0 : I
/*    */     //   1897: iadd
/*    */     //   1898: aload_0
/*    */     //   1899: getfield Qi0 : [Lf/d80;
/*    */     //   1902: iload_3
/*    */     //   1903: aaload
/*    */     //   1904: getfield A20 : Lf/eo;
/*    */     //   1907: dup
/*    */     //   1908: dup
/*    */     //   1909: aload #6
/*    */     //   1911: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1914: pop
/*    */     //   1915: getfield x : F
/*    */     //   1918: fstore #6
/*    */     //   1920: getfield y : F
/*    */     //   1923: fstore #7
/*    */     //   1925: getfield z : F
/*    */     //   1928: fstore #8
/*    */     //   1930: fload #6
/*    */     //   1932: fload #7
/*    */     //   1934: fload #8
/*    */     //   1936: invokevirtual IB : (IFFF)V
/*    */     //   1939: getfield program : Lf/Rm0;
/*    */     //   1942: dup
/*    */     //   1943: astore #6
/*    */     //   1945: iload #4
/*    */     //   1947: aload_0
/*    */     //   1948: getfield ME : I
/*    */     //   1951: iadd
/*    */     //   1952: aload_0
/*    */     //   1953: getfield Qi0 : [Lf/d80;
/*    */     //   1956: iload_3
/*    */     //   1957: aaload
/*    */     //   1958: getfield En0 : Lf/eo;
/*    */     //   1961: dup
/*    */     //   1962: dup
/*    */     //   1963: aload #6
/*    */     //   1965: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1968: pop
/*    */     //   1969: getfield x : F
/*    */     //   1972: fstore #6
/*    */     //   1974: getfield y : F
/*    */     //   1977: fstore #7
/*    */     //   1979: getfield z : F
/*    */     //   1982: fstore #8
/*    */     //   1984: fload #6
/*    */     //   1986: fload #7
/*    */     //   1988: fload #8
/*    */     //   1990: invokevirtual IB : (IFFF)V
/*    */     //   1993: getfield program : Lf/Rm0;
/*    */     //   1996: aload_0
/*    */     //   1997: iload #4
/*    */     //   1999: aload_0
/*    */     //   2000: getfield U60 : I
/*    */     //   2003: iadd
/*    */     //   2004: istore #6
/*    */     //   2006: getfield Qi0 : [Lf/d80;
/*    */     //   2009: iload_3
/*    */     //   2010: aaload
/*    */     //   2011: getfield a5 : F
/*    */     //   2014: fstore #7
/*    */     //   2016: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   2019: pop
/*    */     //   2020: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   2023: iload #6
/*    */     //   2025: fload #7
/*    */     //   2027: invokeinterface glUniform1f : (IF)V
/*    */     //   2032: getfield program : Lf/Rm0;
/*    */     //   2035: aload_0
/*    */     //   2036: iload #4
/*    */     //   2038: aload_0
/*    */     //   2039: getfield fy0 : I
/*    */     //   2042: iadd
/*    */     //   2043: istore #6
/*    */     //   2045: getfield Qi0 : [Lf/d80;
/*    */     //   2048: iload_3
/*    */     //   2049: aaload
/*    */     //   2050: getfield Xo : F
/*    */     //   2053: fstore #7
/*    */     //   2055: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   2058: pop
/*    */     //   2059: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   2062: iload #6
/*    */     //   2064: fload #7
/*    */     //   2066: invokeinterface glUniform1f : (IF)V
/*    */     //   2071: getfield ae0 : I
/*    */     //   2074: dup
/*    */     //   2075: istore #6
/*    */     //   2077: iflt -> 2118
/*    */     //   2080: aload_0
/*    */     //   2081: getfield program : Lf/Rm0;
/*    */     //   2084: aload_0
/*    */     //   2085: iload #4
/*    */     //   2087: iload #6
/*    */     //   2089: iadd
/*    */     //   2090: istore #4
/*    */     //   2092: getfield Qi0 : [Lf/d80;
/*    */     //   2095: iload_3
/*    */     //   2096: aaload
/*    */     //   2097: getfield bs0 : F
/*    */     //   2100: fstore #6
/*    */     //   2102: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   2105: pop
/*    */     //   2106: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   2109: iload #4
/*    */     //   2111: fload #6
/*    */     //   2113: invokeinterface glUniform1f : (IF)V
/*    */     //   2118: aload_0
/*    */     //   2119: getfield HG0 : I
/*    */     //   2122: ifgt -> 2128
/*    */     //   2125: goto -> 2134
/*    */     //   2128: iinc #3, 1
/*    */     //   2131: goto -> 1516
/*    */     //   2134: aload_2
/*    */     //   2135: getstatic f/qo.Ml : J
/*    */     //   2138: dup2
/*    */     //   2139: lstore_3
/*    */     //   2140: invokevirtual gV : (J)Z
/*    */     //   2143: ifeq -> 2169
/*    */     //   2146: aload_0
/*    */     //   2147: aload_2
/*    */     //   2148: lload_3
/*    */     //   2149: aload_0
/*    */     //   2150: getfield Yi0 : I
/*    */     //   2153: istore_3
/*    */     //   2154: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   2157: checkcast f/qo
/*    */     //   2160: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   2163: iload_3
/*    */     //   2164: swap
/*    */     //   2165: invokevirtual set : (ILcom/badlogic/gdx/graphics/Color;)Z
/*    */     //   2168: pop
/*    */     //   2169: aload_0
/*    */     //   2170: iconst_1
/*    */     //   2171: putfield n30 : Z
/*    */     //   2174: aload_0
/*    */     //   2175: aload_1
/*    */     //   2176: aload_2
/*    */     //   2177: invokespecial render : (Lf/Xw0;Lf/b70;)V
/*    */     //   2180: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 27
/*    */     //   #2	-> 59
/*    */     //   #3	-> 62
/*    */     //   #4	-> 69
/*    */     //   #5	-> 92
/*    */     //   #6	-> 120
/*    */     //   #7	-> 251
/*    */     //   #8	-> 254
/*    */     //   #9	-> 552
/*    */     //   #10	-> 560
/*    */     //   #11	-> 577
/*    */     //   #12	-> 585
/*    */     //   #13	-> 592
/*    */     //   #14	-> 595
/*    */     //   #15	-> 617
/*    */     //   #16	-> 620
/*    */     //   #17	-> 646
/*    */     //   #18	-> 649
/*    */     //   #19	-> 754
/*    */     //   #20	-> 805
/*    */     //   #21	-> 828
/*    */     //   #22	-> 846
/*    */     //   #23	-> 878
/*    */     //   #24	-> 902
/*    */     //   #25	-> 910
/*    */     //   #26	-> 1195
/*    */     //   #27	-> 1219
/*    */     //   #28	-> 1251
/*    */     //   #29	-> 1280
/*    */     //   #30	-> 1287
/*    */     //   #31	-> 1479
/*    */     //   #32	-> 1492
/*    */     //   #33	-> 1600
/*    */     //   #34	-> 1641
/*    */     //   #35	-> 1673
/*    */     //   #36	-> 1705
/*    */     //   #37	-> 1721
/*    */     //   #38	-> 1745
/*    */     //   #39	-> 1772
/*    */     //   #40	-> 1915
/*    */     //   #41	-> 1939
/*    */     //   #42	-> 1969
/*    */     //   #43	-> 1993
/*    */     //   #44	-> 2020
/*    */     //   #45	-> 2032
/*    */     //   #46	-> 2059
/*    */     //   #47	-> 2071
/*    */     //   #48	-> 2106
/*    */     //   #49	-> 2119
/*    */     //   #50	-> 2177
/*    */   }
/*    */   
/*    */   public final void end() {
/*    */     super.end();
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     this.program.dispose();
/*    */     super.dispose();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bB0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */