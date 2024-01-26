/*  1 */ package f;public class bG extends Nr { public static String PC0; public static String DT; public static long Fe0 = zc.U7 | O80.Jg0 | qo.A80 | qo.J9 | LPT9.ft0; public static int Da = 1029; public static int RD = 515; public static final long S5 = Xf0.xZ | IF.kA0; public static final b70 e80 = new b70(); public final int f10; public final int XF0; public final int qL0; public final int ll; public final int qr; public final int J60; public final int Jy; public final int qJ; public final int xv0; public final int O50; public final int PC; public final int Jj; public final int DQ; public final int iJ0; public final int N0; public final int to; public final int Pg; public final int kU; public int VI; public int FY; public int nX; public int na0; public int ym0; public int U6; public int qv0; public int ma0; public int sl0; public int rt; public int vt0; public int COm6; public int Fg0; public int PI0; public int wf0; public int AE0; public int Au0; public final boolean I4; public final boolean o30; public final vm[] COM8; public final rN[] N40; public final d80[] Ir; public Xw0 Vr0; public final long QB; public final long MO; public final Ql Gz; public float og0; public boolean y20; public static String getDefaultVertexShader() { if (PC0 == null)
/*  2 */       PC0 = UB0.vj0.cw("com/badlogic/gdx/graphics/g3d/shaders/default.vertex.glsl").QM(null);  return PC0; } public static String getDefaultFragmentShader() { if (DT == null) DT = UB0.vj0.cw("com/badlogic/gdx/graphics/g3d/shaders/default.fragment.glsl").QM(null);  return DT; } public bG(Xw0 paramXw0, Ql paramQl, Rm0 paramRm0) { boolean bool1, bool2; this.ll = register(new vK("u_dirLights[0].color")); this.qr = register(new vK("u_dirLights[0].direction")); this.J60 = register(new vK("u_dirLights[1].color")); this.Jy = register(new vK("u_pointLights[0].color")); this.qJ = register(new vK("u_pointLights[0].position")); this.xv0 = register(new vK("u_pointLights[0].intensity")); this.O50 = register(new vK("u_pointLights[1].color")); this.PC = register(new vK("u_spotLights[0].color")); this.Jj = register(new vK("u_spotLights[0].position")); this.DQ = register(new vK("u_spotLights[0].intensity")); this.iJ0 = register(new vK("u_spotLights[0].direction")); this.N0 = register(new vK("u_spotLights[0].cutoffAngle")); this.to = register(new vK("u_spotLights[0].exponent")); this.Pg = register(new vK("u_spotLights[1].color")); this.kU = register(new vK("u_fogColor")); register(new vK("u_shadowMapProjViewTrans")); register(new vK("u_shadowTexture")); register(new vK("u_shadowPCFOffset")); b70 b701 = sM(paramXw0); this.Gz = paramQl; this.program = paramRm0; if (paramXw0.kw != null) { bool1 = true; } else { bool1 = false; }  this.I4 = bool1; long l2; if (b701.gV(l2 = ED0.AH) || (bool1 && b701.gV(l2))) { bool2 = true; } else { bool2 = false; }  this.o30 = bool2; if (bool1) paramXw0.kw.getClass();  this.Vr0 = paramXw0; this.QB = b701.XG() | S5; this.MO = paramXw0.L90.u90.n8().qV(); int i; if (!bool1 || (i = paramQl.Ug0) <= 0) i = 0;  vm[] arrayOfVm; for (this.COM8 = new vm[i], i = 0; i < (arrayOfVm = this.COM8).length; ) { vm vm1; this(); arrayOfVm[i] = vm1; i++; }  if (!this.I4 || (i = paramQl.hX) <= 0) i = 0;  rN[] arrayOfRN; for (this.N40 = new rN[i], i = 0; i < (arrayOfRN = this.N40).length; ) { rN rN1; this(); arrayOfRN[i] = rN1; i++; }  if (this.I4) paramQl.getClass();  d80[] arrayOfD80; for (this.Ir = new d80[0], i = 0; i < (arrayOfD80 = this.Ir).length; ) { d80 d801; this(); arrayOfD80[i] = d801; i++; }  long l1; if (paramQl.Te || (Fe0 & (l1 = this.QB)) == l1) { vK vK; int j; Matrix4[] arrayOfMatrix4; if ((arrayOfMatrix4 = paramXw0.Et) == null || arrayOfMatrix4.length <= paramQl.xu)
/*    */       
/*  4 */       { register(Qm0.bF0, i4.ez); register(Qm0.EH0, i4.jo0); register(Qm0.rH0, i4.o4); register(Qm0.LN, i4.gX); register(Qm0.switch, i4.b70); register(Qm0.Xx, i4.Lx); register(Qm0.Z60, i4.Du); this.f10 = register(new vK("u_time")); register(Qm0.Sz, i4.zj0); register(Qm0.FI, i4.o9); register(Qm0.nE, i4.Ih); register(Qm0.g7, i4.qZ); if (paramXw0.Et != null && paramQl.xu > 0) register(Qm0.vD, new Ss0(paramQl.xu));  register(Qm0.Nr, i4.at0); this.XF0 = register(Qm0.e60); register(Qm0.cs, i4.cz0); register(Qm0.fk0, i4.l0); register(Qm0.w20, i4.Dx); register(Qm0.Sg0, i4.zn); register(Qm0.uH0, i4.WK0); register(Qm0.fD, i4.on0); register(Qm0.M80, i4.Jz); register(Qm0.k70, i4.XQ); register(Qm0.NI0, i4.no0); register(Qm0.qy, i4.l2); register(Qm0.AN, i4.VG); register(Qm0.ix0, i4.L80); register(Qm0.ya0, i4.MH); register(Qm0.hD, i4.d0); register(Qm0.ru, i4.PB); register(Qm0.sw0, i4.import); this.qL0 = register(Qm0.fa0); if (this.I4) { VY vY; vK = Qm0.mv0; j = paramQl.Ug0; this(j, paramQl.hX); register(vK, vY); }  if (this.o30) register(Qm0.JJ, i4.Le0);  return; }  throw new JU(B40.df("too many bones: ").append(vK.Et.length).append(", max configured: ").append(j.xu).toString()); }  throw new JU(B40.df("Some attributes not implemented yet (").append(this.QB).append(")").toString()); }
/*  5 */   public static final b70 sM(Xw0 paramXw0) { b70 b701; (b701 = e80).Qr = 0L; e80.ra0.clear(); fo0 fo0; if ((fo0 = paramXw0.kw) != null) b701.ir(fo0);  T0 t0; if ((t0 = paramXw0.bL) != null) b701.ir(t0);  return b701; } public static String c80(Xw0 paramXw0, Ql paramQl) { String str = ""; b70 b701; long l1 = (b701 = sM(paramXw0)).Qr; long l3; if (l10(l3 = paramXw0.L90.u90.Dt0.getAttributes().Ep(), 1L))
/*  6 */       str = m0.tF0(str, "#define positionFlag\n");  if (((l3 & 0x6L) != 0L))
/*  7 */       str = m0.tF0(str, "#define colorFlag\n"); 
/*  8 */     if (l10(l3, 256L))
/*  9 */       str = m0.tF0(str, "#define binormalFlag\n"); 
/* 10 */     if (l10(l3, 128L))
/* 11 */       str = m0.tF0(str, "#define tangentFlag\n"); 
/* 12 */     if (l10(l3, 8L))
/* 13 */       str = m0.tF0(str, "#define normalFlag\n"); 
/* 14 */     if ((l10(l3, 8L) || l10(l3, 384L)) && paramXw0.kw != null) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       str = N.Gl0(zw.vz(N.Gl0(zw.vz(m0.tF0(m0.tF0(str, "#define lightingFlag\n"), "#define ambientCubemapFlag\n"), "#define numDirectionalLights "), paramQl.Ug0, "\n"), "#define numPointLights "), paramQl.hX, "\n");
/* 23 */       str = str + "#define numSpotLights " + Character.MIN_VALUE + "\n"; if (b701.gV(qo.Ml))
/* 24 */         str = m0.tF0(str, "#define fogFlag\n");  paramXw0
/* 25 */         .kw.getClass(); if (b701.gV(ED0.AH)) {
/* 26 */         str = m0.tF0(str, "#define environmentCubemapFlag\n");
/*    */       }
/*    */     } 
/*    */     int i;
/*    */     byte b;
/* 31 */     for (i = (paramXw0.L90.u90.Dt0.getAttributes()).rJ0.length, b = 0; b < i; )
/*    */     { lw0 lw0;
/*    */ 
/*    */       
/*    */       int j;
/*    */       
/* 37 */       if ((j = (lw0 = (paramXw0.L90.u90.Dt0.getAttributes()).rJ0[b]).s00) == 64)
/*    */       
/*    */       { 
/* 40 */         str = N.Gl0(zw.vz(str, "#define boneWeight"), lw0.ed, "Flag\n"); } else if (j == 16)
/*    */       
/*    */       { 
/* 43 */         str = N.Gl0(zw.vz(str, "#define texCoord"), lw0.ed, "Flag\n"); }  b++; }  long l2; if ((l1 & (
/* 44 */       l2 = zc.U7)) == l2)
/* 45 */       str = m0.tF0(str, "#define blendedFlag\n");  if ((l1 & (
/* 46 */       l2 = O80.Jg0)) == l2)
/*    */     {
/* 48 */       str = m0.tF0(m0.tF0(str, "#define diffuseTextureFlag\n"), "#define diffuseTextureCoord texCoord0\n"); }  if ((l1 & (
/* 49 */       l2 = O80.D8)) == l2)
/*    */     {
/* 51 */       str = m0.tF0(m0.tF0(str, "#define specularTextureFlag\n"), "#define specularTextureCoord texCoord0\n"); }  if ((l1 & (
/* 52 */       l2 = O80.tM)) == l2)
/*    */     {
/* 54 */       str = m0.tF0(m0.tF0(str, "#define normalTextureFlag\n"), "#define normalTextureCoord texCoord0\n"); }  if ((l1 & (
/* 55 */       l2 = O80.fS)) == l2)
/*    */     {
/* 57 */       str = m0.tF0(m0.tF0(str, "#define emissiveTextureFlag\n"), "#define emissiveTextureCoord texCoord0\n"); }  if ((l1 & (
/* 58 */       l2 = O80.La)) == l2)
/*    */     {
/* 60 */       str = m0.tF0(m0.tF0(str, "#define reflectionTextureFlag\n"), "#define reflectionTextureCoord texCoord0\n"); }  if ((l1 & (
/* 61 */       l2 = O80.Mc0)) == l2)
/*    */     {
/* 63 */       str = m0.tF0(m0.tF0(str, "#define ambientTextureFlag\n"), "#define ambientTextureCoord texCoord0\n"); }  if ((l1 & (
/* 64 */       l2 = qo.A80)) == l2)
/* 65 */       str = m0.tF0(str, "#define diffuseColorFlag\n");  if ((l1 & (
/* 66 */       l2 = qo.J9)) == l2)
/* 67 */       str = m0.tF0(str, "#define specularColorFlag\n");  if ((l1 & (
/* 68 */       l2 = qo.cu0)) == l2)
/* 69 */       str = m0.tF0(str, "#define emissiveColorFlag\n");  if ((l1 & (
/* 70 */       l2 = qo.Ib)) == l2)
/* 71 */       str = m0.tF0(str, "#define reflectionColorFlag\n");  if ((l1 & (
/* 72 */       l2 = LPT9.ft0)) == l2)
/* 73 */       str = m0.tF0(str, "#define shininessFlag\n");  if ((l1 & (
/* 74 */       l1 = LPT9.It0)) == l1)
/* 75 */       str = m0.tF0(str, "#define alphaTestFlag\n");  if (paramXw0
/* 76 */       .Et != null && paramQl.xu > 0)
/*    */     {
/*    */       
/* 79 */       str = N.Gl0(zw.vz(str, "#define numBones "), paramQl.xu, "\n"); }  return str; }
/*    */ 
/*    */   
/*    */   public final boolean canRender(Xw0 paramXw0) {
/*    */     Matrix4[] arrayOfMatrix4;
/*    */     if ((arrayOfMatrix4 = paramXw0.Et) != null && arrayOfMatrix4.length > this.Gz.xu)
/*    */       return false; 
/*    */     long l = 0L;
/*    */     fo0 fo0;
/*    */     if ((fo0 = paramXw0.kw) != null)
/*    */       l = fo0.Qr | l; 
/*    */     T0 t0;
/*    */     if ((t0 = paramXw0.bL) != null)
/*    */       l |= t0.Qr; 
/*    */     return (this.QB == (l | S5) && this.MO == paramXw0.L90.u90.Dt0.getAttributes().qV() && ((paramXw0.kw != null)) == this.I4);
/*    */   }
/*    */   
/*    */   public final void begin(ny paramny, l2 paraml2) {
/*    */     super.begin(paramny, paraml2);
/*    */     vm[] arrayOfVm;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfVm = this.COM8).length, b = 0; b < i; ) {
/*    */       (arrayOfVm[b]).sL0.set(0.0F, 0.0F, 0.0F, 1.0F);
/*    */       (arrayOfVm[b]).wd.TG0(0.0F, -1.0F, 0.0F).WC0();
/*    */       b++;
/*    */     } 
/*    */     rN[] arrayOfRN;
/*    */     for (i = (arrayOfRN = this.N40).length, b = 0; b < i; ) {
/*    */       (arrayOfRN[b]).sL0.set(0.0F, 0.0F, 0.0F, 1.0F);
/*    */       (arrayOfRN[b]).BN.TG0(0.0F, 0.0F, 0.0F);
/*    */       (arrayOfRN[b]).Mx0 = 0.0F;
/*    */       b++;
/*    */     } 
/*    */     d80[] arrayOfD80;
/*    */     for (i = (arrayOfD80 = this.Ir).length, b = 0; b < i; ) {
/*    */       (arrayOfD80[b]).sL0.set(0.0F, 0.0F, 0.0F, 1.0F);
/*    */       (arrayOfD80[b]).A20.TG0(0.0F, 0.0F, 0.0F);
/*    */       (arrayOfD80[b]).En0.TG0(0.0F, -1.0F, 0.0F).WC0();
/*    */       (arrayOfD80[b]).bs0 = 0.0F;
/*    */       (arrayOfD80[b]).a5 = 1.0F;
/*    */       (arrayOfD80[b]).Xo = 0.0F;
/*    */       b++;
/*    */     } 
/*    */     this.y20 = false;
/*    */     if (has(this.f10)) {
/*    */       int j = this.f10;
/*    */       float f = this.og0 + UB0.M60.Qy;
/*    */       set(j, f);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void WQ(b70 paramb70) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Gz : Lf/Ql;
/*    */     //   4: dup
/*    */     //   5: astore_2
/*    */     //   6: getfield uQ : I
/*    */     //   9: dup
/*    */     //   10: istore_3
/*    */     //   11: iconst_m1
/*    */     //   12: if_icmpne -> 19
/*    */     //   15: getstatic f/bG.Da : I
/*    */     //   18: istore_3
/*    */     //   19: aload_2
/*    */     //   20: getfield Fv0 : I
/*    */     //   23: dup
/*    */     //   24: istore_2
/*    */     //   25: iconst_m1
/*    */     //   26: if_icmpne -> 33
/*    */     //   29: getstatic f/bG.RD : I
/*    */     //   32: istore_2
/*    */     //   33: aload_1
/*    */     //   34: fconst_0
/*    */     //   35: fstore_1
/*    */     //   36: fconst_1
/*    */     //   37: fstore #4
/*    */     //   39: iconst_1
/*    */     //   40: istore #5
/*    */     //   42: getfield ra0 : Lf/fQ;
/*    */     //   45: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: invokevirtual hasNext : ()Z
/*    */     //   55: ifeq -> 290
/*    */     //   58: aload #6
/*    */     //   60: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   63: checkcast f/dj
/*    */     //   66: dup
/*    */     //   67: astore #7
/*    */     //   69: getfield tL : J
/*    */     //   72: dup2
/*    */     //   73: lstore #8
/*    */     //   75: getstatic f/zc.U7 : J
/*    */     //   78: land
/*    */     //   79: lload #8
/*    */     //   81: lcmp
/*    */     //   82: ifne -> 89
/*    */     //   85: iconst_1
/*    */     //   86: goto -> 90
/*    */     //   89: iconst_0
/*    */     //   90: ifeq -> 147
/*    */     //   93: aload_0
/*    */     //   94: aload #7
/*    */     //   96: aload_0
/*    */     //   97: getfield context : Lf/l2;
/*    */     //   100: astore #7
/*    */     //   102: checkcast f/zc
/*    */     //   105: dup
/*    */     //   106: astore #8
/*    */     //   108: aload_0
/*    */     //   109: aload #7
/*    */     //   111: aload #8
/*    */     //   113: dup
/*    */     //   114: getfield fi : I
/*    */     //   117: istore #7
/*    */     //   119: getfield Wy : I
/*    */     //   122: iload #7
/*    */     //   124: swap
/*    */     //   125: iconst_1
/*    */     //   126: invokevirtual Mg : (IIZ)V
/*    */     //   129: getfield XF0 : I
/*    */     //   132: istore #7
/*    */     //   134: getfield yg0 : F
/*    */     //   137: iload #7
/*    */     //   139: swap
/*    */     //   140: invokevirtual set : (IF)Z
/*    */     //   143: pop
/*    */     //   144: goto -> 50
/*    */     //   147: lload #8
/*    */     //   149: getstatic f/Xf0.xZ : J
/*    */     //   152: dup2
/*    */     //   153: lstore #10
/*    */     //   155: land
/*    */     //   156: lload #10
/*    */     //   158: lcmp
/*    */     //   159: ifne -> 174
/*    */     //   162: aload #7
/*    */     //   164: checkcast f/Xf0
/*    */     //   167: getfield S90 : I
/*    */     //   170: istore_3
/*    */     //   171: goto -> 50
/*    */     //   174: lload #8
/*    */     //   176: getstatic f/LPT9.It0 : J
/*    */     //   179: dup2
/*    */     //   180: lstore #10
/*    */     //   182: land
/*    */     //   183: lload #10
/*    */     //   185: lcmp
/*    */     //   186: ifne -> 209
/*    */     //   189: aload_0
/*    */     //   190: dup
/*    */     //   191: getfield qL0 : I
/*    */     //   194: aload #7
/*    */     //   196: checkcast f/LPT9
/*    */     //   199: getfield dy0 : F
/*    */     //   202: invokevirtual set : (IF)Z
/*    */     //   205: pop
/*    */     //   206: goto -> 50
/*    */     //   209: lload #8
/*    */     //   211: getstatic f/IF.kA0 : J
/*    */     //   214: dup2
/*    */     //   215: lstore #8
/*    */     //   217: land
/*    */     //   218: lload #8
/*    */     //   220: lcmp
/*    */     //   221: ifne -> 252
/*    */     //   224: aload #7
/*    */     //   226: checkcast f/IF
/*    */     //   229: dup
/*    */     //   230: dup2
/*    */     //   231: getfield Q5 : I
/*    */     //   234: istore_2
/*    */     //   235: getfield bW : F
/*    */     //   238: fstore_1
/*    */     //   239: getfield d30 : F
/*    */     //   242: fstore #4
/*    */     //   244: getfield OP : Z
/*    */     //   247: istore #5
/*    */     //   249: goto -> 50
/*    */     //   252: aload_0
/*    */     //   253: getfield Gz : Lf/Ql;
/*    */     //   256: getfield Te : Z
/*    */     //   259: ifeq -> 265
/*    */     //   262: goto -> 50
/*    */     //   265: new f/JU
/*    */     //   268: dup
/*    */     //   269: ldc_w 'Unknown material attribute: '
/*    */     //   272: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   275: aload #7
/*    */     //   277: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   283: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   286: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   289: athrow
/*    */     //   290: aload_0
/*    */     //   291: dup
/*    */     //   292: dup
/*    */     //   293: getfield context : Lf/l2;
/*    */     //   296: iload_3
/*    */     //   297: invokevirtual W60 : (I)V
/*    */     //   300: getfield context : Lf/l2;
/*    */     //   303: iload_2
/*    */     //   304: fload_1
/*    */     //   305: fload #4
/*    */     //   307: invokevirtual N4 : (IFF)V
/*    */     //   310: getfield context : Lf/l2;
/*    */     //   313: dup
/*    */     //   314: astore_0
/*    */     //   315: getfield lp : Z
/*    */     //   318: iload #5
/*    */     //   320: if_icmpeq -> 339
/*    */     //   323: getstatic f/UB0.go : Lf/hj0;
/*    */     //   326: iload #5
/*    */     //   328: aload_0
/*    */     //   329: iload #5
/*    */     //   331: putfield lp : Z
/*    */     //   334: invokeinterface glDepthMask : (Z)V
/*    */     //   339: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 42
/*    */     //   #2	-> 45
/*    */     //   #3	-> 52
/*    */     //   #4	-> 75
/*    */     //   #5	-> 97
/*    */     //   #6	-> 269
/*    */     //   #7	-> 277
/*    */     //   #8	-> 315
/*    */     //   #9	-> 323
/*    */   }
/*    */   
/*    */   public void iH(Xw0 paramXw0, b70 paramb70) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: aload_1
/*    */     //   2: getfield kw : Lf/fo0;
/*    */     //   5: pop
/*    */     //   6: getstatic f/uu.N1 : J
/*    */     //   9: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   12: checkcast f/uu
/*    */     //   15: dup
/*    */     //   16: astore_1
/*    */     //   17: ifnonnull -> 25
/*    */     //   20: aconst_null
/*    */     //   21: astore_1
/*    */     //   22: goto -> 30
/*    */     //   25: aload_1
/*    */     //   26: getfield GE : Lf/fQ;
/*    */     //   29: astore_1
/*    */     //   30: aload_2
/*    */     //   31: getstatic f/H60.JM : J
/*    */     //   34: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   37: checkcast f/H60
/*    */     //   40: dup
/*    */     //   41: astore_3
/*    */     //   42: ifnonnull -> 50
/*    */     //   45: aconst_null
/*    */     //   46: astore_3
/*    */     //   47: goto -> 55
/*    */     //   50: aload_3
/*    */     //   51: getfield O1 : Lf/fQ;
/*    */     //   54: astore_3
/*    */     //   55: aload_2
/*    */     //   56: getstatic f/yJ.YQ : J
/*    */     //   59: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   62: checkcast f/yJ
/*    */     //   65: dup
/*    */     //   66: astore #4
/*    */     //   68: ifnonnull -> 77
/*    */     //   71: aconst_null
/*    */     //   72: astore #4
/*    */     //   74: goto -> 84
/*    */     //   77: aload #4
/*    */     //   79: getfield qG : Lf/fQ;
/*    */     //   82: astore #4
/*    */     //   84: aload_0
/*    */     //   85: getfield VI : I
/*    */     //   88: iflt -> 515
/*    */     //   91: iconst_0
/*    */     //   92: istore #5
/*    */     //   94: iload #5
/*    */     //   96: aload_0
/*    */     //   97: getfield COM8 : [Lf/vm;
/*    */     //   100: dup
/*    */     //   101: astore #6
/*    */     //   103: arraylength
/*    */     //   104: if_icmpge -> 515
/*    */     //   107: aload_1
/*    */     //   108: ifnull -> 322
/*    */     //   111: iload #5
/*    */     //   113: aload_1
/*    */     //   114: getfield Z8 : I
/*    */     //   117: if_icmplt -> 123
/*    */     //   120: goto -> 322
/*    */     //   123: aload_0
/*    */     //   124: getfield y20 : Z
/*    */     //   127: ifeq -> 214
/*    */     //   130: aload_1
/*    */     //   131: iload #5
/*    */     //   133: aload #6
/*    */     //   135: iload #5
/*    */     //   137: aaload
/*    */     //   138: astore #6
/*    */     //   140: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   143: checkcast f/vm
/*    */     //   146: dup
/*    */     //   147: astore #7
/*    */     //   149: aload #6
/*    */     //   151: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   154: pop
/*    */     //   155: ifnull -> 203
/*    */     //   158: aload #7
/*    */     //   160: aload #6
/*    */     //   162: if_acmpeq -> 197
/*    */     //   165: aload #6
/*    */     //   167: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   170: aload #7
/*    */     //   172: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   175: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   178: ifeq -> 203
/*    */     //   181: aload #6
/*    */     //   183: getfield wd : Lf/eo;
/*    */     //   186: aload #7
/*    */     //   188: getfield wd : Lf/eo;
/*    */     //   191: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   194: ifeq -> 203
/*    */     //   197: iconst_1
/*    */     //   198: istore #6
/*    */     //   200: goto -> 206
/*    */     //   203: iconst_0
/*    */     //   204: istore #6
/*    */     //   206: iload #6
/*    */     //   208: ifeq -> 214
/*    */     //   211: goto -> 509
/*    */     //   214: aload_1
/*    */     //   215: iload #5
/*    */     //   217: aload_0
/*    */     //   218: getfield COM8 : [Lf/vm;
/*    */     //   221: iload #5
/*    */     //   223: aaload
/*    */     //   224: astore #6
/*    */     //   226: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   229: checkcast f/vm
/*    */     //   232: dup
/*    */     //   233: astore #7
/*    */     //   235: aload #6
/*    */     //   237: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   240: pop
/*    */     //   241: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   244: dup
/*    */     //   245: astore #8
/*    */     //   247: aload #7
/*    */     //   249: getfield wd : Lf/eo;
/*    */     //   252: astore #7
/*    */     //   254: ifnull -> 268
/*    */     //   257: aload #6
/*    */     //   259: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   262: aload #8
/*    */     //   264: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   267: pop
/*    */     //   268: aload #7
/*    */     //   270: ifnull -> 387
/*    */     //   273: aload #6
/*    */     //   275: getfield wd : Lf/eo;
/*    */     //   278: dup
/*    */     //   279: astore #6
/*    */     //   281: aload #7
/*    */     //   283: dup
/*    */     //   284: dup
/*    */     //   285: aload #6
/*    */     //   287: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   290: pop
/*    */     //   291: getfield x : F
/*    */     //   294: fstore #6
/*    */     //   296: getfield y : F
/*    */     //   299: fstore #7
/*    */     //   301: getfield z : F
/*    */     //   304: fstore #8
/*    */     //   306: fload #6
/*    */     //   308: fload #7
/*    */     //   310: fload #8
/*    */     //   312: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   315: invokevirtual WC0 : ()Lf/eo;
/*    */     //   318: pop
/*    */     //   319: goto -> 387
/*    */     //   322: aload_0
/*    */     //   323: getfield y20 : Z
/*    */     //   326: ifeq -> 371
/*    */     //   329: aload #6
/*    */     //   331: iload #5
/*    */     //   333: aaload
/*    */     //   334: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   337: dup
/*    */     //   338: astore #7
/*    */     //   340: getfield r : F
/*    */     //   343: fconst_0
/*    */     //   344: fcmpl
/*    */     //   345: ifne -> 371
/*    */     //   348: aload #7
/*    */     //   350: getfield g : F
/*    */     //   353: fconst_0
/*    */     //   354: fcmpl
/*    */     //   355: ifne -> 371
/*    */     //   358: aload #7
/*    */     //   360: getfield b : F
/*    */     //   363: fconst_0
/*    */     //   364: fcmpl
/*    */     //   365: ifne -> 371
/*    */     //   368: goto -> 509
/*    */     //   371: aload #6
/*    */     //   373: iload #5
/*    */     //   375: aaload
/*    */     //   376: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   379: fconst_0
/*    */     //   380: fconst_0
/*    */     //   381: fconst_0
/*    */     //   382: fconst_1
/*    */     //   383: invokevirtual set : (FFFF)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   386: pop
/*    */     //   387: aload_0
/*    */     //   388: dup
/*    */     //   389: dup
/*    */     //   390: iload #5
/*    */     //   392: aload_0
/*    */     //   393: dup
/*    */     //   394: getfield VI : I
/*    */     //   397: istore #6
/*    */     //   399: getfield na0 : I
/*    */     //   402: imul
/*    */     //   403: iload #6
/*    */     //   405: iadd
/*    */     //   406: istore #6
/*    */     //   408: getfield program : Lf/Rm0;
/*    */     //   411: iload #6
/*    */     //   413: aload_0
/*    */     //   414: getfield FY : I
/*    */     //   417: iadd
/*    */     //   418: aload_0
/*    */     //   419: getfield COM8 : [Lf/vm;
/*    */     //   422: iload #5
/*    */     //   424: aaload
/*    */     //   425: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   428: dup
/*    */     //   429: dup
/*    */     //   430: getfield r : F
/*    */     //   433: fstore #7
/*    */     //   435: getfield g : F
/*    */     //   438: fstore #8
/*    */     //   440: getfield b : F
/*    */     //   443: fstore #9
/*    */     //   445: fload #7
/*    */     //   447: fload #8
/*    */     //   449: fload #9
/*    */     //   451: invokevirtual IB : (IFFF)V
/*    */     //   454: getfield program : Lf/Rm0;
/*    */     //   457: iload #6
/*    */     //   459: aload_0
/*    */     //   460: getfield nX : I
/*    */     //   463: iadd
/*    */     //   464: aload_0
/*    */     //   465: getfield COM8 : [Lf/vm;
/*    */     //   468: iload #5
/*    */     //   470: aaload
/*    */     //   471: getfield wd : Lf/eo;
/*    */     //   474: dup
/*    */     //   475: dup
/*    */     //   476: getfield x : F
/*    */     //   479: fstore #6
/*    */     //   481: getfield y : F
/*    */     //   484: fstore #7
/*    */     //   486: getfield z : F
/*    */     //   489: fstore #8
/*    */     //   491: fload #6
/*    */     //   493: fload #7
/*    */     //   495: fload #8
/*    */     //   497: invokevirtual IB : (IFFF)V
/*    */     //   500: getfield na0 : I
/*    */     //   503: ifgt -> 509
/*    */     //   506: goto -> 515
/*    */     //   509: iinc #5, 1
/*    */     //   512: goto -> 94
/*    */     //   515: aload_0
/*    */     //   516: getfield ym0 : I
/*    */     //   519: iflt -> 916
/*    */     //   522: iconst_0
/*    */     //   523: istore_1
/*    */     //   524: iload_1
/*    */     //   525: aload_0
/*    */     //   526: getfield N40 : [Lf/rN;
/*    */     //   529: dup
/*    */     //   530: astore #5
/*    */     //   532: arraylength
/*    */     //   533: if_icmpge -> 916
/*    */     //   536: aload_3
/*    */     //   537: ifnull -> 695
/*    */     //   540: iload_1
/*    */     //   541: aload_3
/*    */     //   542: getfield Z8 : I
/*    */     //   545: if_icmplt -> 551
/*    */     //   548: goto -> 695
/*    */     //   551: aload_0
/*    */     //   552: getfield y20 : Z
/*    */     //   555: ifeq -> 579
/*    */     //   558: aload #5
/*    */     //   560: iload_1
/*    */     //   561: aaload
/*    */     //   562: aload_3
/*    */     //   563: iload_1
/*    */     //   564: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   567: checkcast f/rN
/*    */     //   570: invokevirtual fa0 : (Lf/rN;)Z
/*    */     //   573: ifeq -> 579
/*    */     //   576: goto -> 910
/*    */     //   579: aload_3
/*    */     //   580: iload_1
/*    */     //   581: aload_0
/*    */     //   582: getfield N40 : [Lf/rN;
/*    */     //   585: iload_1
/*    */     //   586: aaload
/*    */     //   587: astore #5
/*    */     //   589: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   592: checkcast f/rN
/*    */     //   595: dup
/*    */     //   596: astore #6
/*    */     //   598: aload #5
/*    */     //   600: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   603: pop
/*    */     //   604: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   607: dup
/*    */     //   608: astore #7
/*    */     //   610: aload #6
/*    */     //   612: dup
/*    */     //   613: getfield BN : Lf/eo;
/*    */     //   616: astore #6
/*    */     //   618: getfield Mx0 : F
/*    */     //   621: fstore #8
/*    */     //   623: ifnull -> 637
/*    */     //   626: aload #5
/*    */     //   628: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   631: aload #7
/*    */     //   633: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   636: pop
/*    */     //   637: aload #6
/*    */     //   639: ifnull -> 685
/*    */     //   642: aload #5
/*    */     //   644: getfield BN : Lf/eo;
/*    */     //   647: dup
/*    */     //   648: astore #7
/*    */     //   650: aload #6
/*    */     //   652: dup
/*    */     //   653: dup
/*    */     //   654: aload #7
/*    */     //   656: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   659: pop
/*    */     //   660: getfield x : F
/*    */     //   663: fstore #6
/*    */     //   665: getfield y : F
/*    */     //   668: fstore #7
/*    */     //   670: getfield z : F
/*    */     //   673: fstore #9
/*    */     //   675: fload #6
/*    */     //   677: fload #7
/*    */     //   679: fload #9
/*    */     //   681: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   684: pop
/*    */     //   685: aload #5
/*    */     //   687: fload #8
/*    */     //   689: putfield Mx0 : F
/*    */     //   692: goto -> 725
/*    */     //   695: aload_0
/*    */     //   696: getfield y20 : Z
/*    */     //   699: ifeq -> 717
/*    */     //   702: aload #5
/*    */     //   704: iload_1
/*    */     //   705: aaload
/*    */     //   706: getfield Mx0 : F
/*    */     //   709: fconst_0
/*    */     //   710: fcmpl
/*    */     //   711: ifne -> 717
/*    */     //   714: goto -> 910
/*    */     //   717: aload #5
/*    */     //   719: iload_1
/*    */     //   720: aaload
/*    */     //   721: fconst_0
/*    */     //   722: putfield Mx0 : F
/*    */     //   725: aload_0
/*    */     //   726: dup
/*    */     //   727: dup
/*    */     //   728: iload_1
/*    */     //   729: aload_0
/*    */     //   730: dup
/*    */     //   731: getfield ym0 : I
/*    */     //   734: istore #5
/*    */     //   736: getfield sl0 : I
/*    */     //   739: imul
/*    */     //   740: iload #5
/*    */     //   742: iadd
/*    */     //   743: istore #5
/*    */     //   745: getfield program : Lf/Rm0;
/*    */     //   748: iload #5
/*    */     //   750: aload_0
/*    */     //   751: getfield U6 : I
/*    */     //   754: iadd
/*    */     //   755: aload_0
/*    */     //   756: getfield N40 : [Lf/rN;
/*    */     //   759: iload_1
/*    */     //   760: aaload
/*    */     //   761: dup
/*    */     //   762: astore #6
/*    */     //   764: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   767: dup
/*    */     //   768: dup
/*    */     //   769: getfield r : F
/*    */     //   772: aload #6
/*    */     //   774: getfield Mx0 : F
/*    */     //   777: dup
/*    */     //   778: fstore #6
/*    */     //   780: fmul
/*    */     //   781: fstore #7
/*    */     //   783: getfield g : F
/*    */     //   786: fload #6
/*    */     //   788: fmul
/*    */     //   789: fstore #8
/*    */     //   791: getfield b : F
/*    */     //   794: fload #6
/*    */     //   796: fmul
/*    */     //   797: fstore #6
/*    */     //   799: fload #7
/*    */     //   801: fload #8
/*    */     //   803: fload #6
/*    */     //   805: invokevirtual IB : (IFFF)V
/*    */     //   808: getfield program : Lf/Rm0;
/*    */     //   811: iload #5
/*    */     //   813: aload_0
/*    */     //   814: getfield qv0 : I
/*    */     //   817: iadd
/*    */     //   818: aload_0
/*    */     //   819: getfield N40 : [Lf/rN;
/*    */     //   822: iload_1
/*    */     //   823: aaload
/*    */     //   824: getfield BN : Lf/eo;
/*    */     //   827: dup
/*    */     //   828: dup
/*    */     //   829: getfield x : F
/*    */     //   832: fstore #6
/*    */     //   834: getfield y : F
/*    */     //   837: fstore #7
/*    */     //   839: getfield z : F
/*    */     //   842: fstore #8
/*    */     //   844: fload #6
/*    */     //   846: fload #7
/*    */     //   848: fload #8
/*    */     //   850: invokevirtual IB : (IFFF)V
/*    */     //   853: getfield ma0 : I
/*    */     //   856: dup
/*    */     //   857: istore #6
/*    */     //   859: iflt -> 900
/*    */     //   862: aload_0
/*    */     //   863: getfield program : Lf/Rm0;
/*    */     //   866: aload_0
/*    */     //   867: iload #5
/*    */     //   869: iload #6
/*    */     //   871: iadd
/*    */     //   872: istore #5
/*    */     //   874: getfield N40 : [Lf/rN;
/*    */     //   877: iload_1
/*    */     //   878: aaload
/*    */     //   879: getfield Mx0 : F
/*    */     //   882: fstore #6
/*    */     //   884: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   887: pop
/*    */     //   888: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   891: iload #5
/*    */     //   893: fload #6
/*    */     //   895: invokeinterface glUniform1f : (IF)V
/*    */     //   900: aload_0
/*    */     //   901: getfield sl0 : I
/*    */     //   904: ifgt -> 910
/*    */     //   907: goto -> 916
/*    */     //   910: iinc #1, 1
/*    */     //   913: goto -> 524
/*    */     //   916: aload_0
/*    */     //   917: getfield rt : I
/*    */     //   920: iflt -> 1522
/*    */     //   923: iconst_0
/*    */     //   924: istore_1
/*    */     //   925: iload_1
/*    */     //   926: aload_0
/*    */     //   927: getfield Ir : [Lf/d80;
/*    */     //   930: dup
/*    */     //   931: astore_3
/*    */     //   932: arraylength
/*    */     //   933: if_icmpge -> 1522
/*    */     //   936: aload #4
/*    */     //   938: ifnull -> 1172
/*    */     //   941: iload_1
/*    */     //   942: aload #4
/*    */     //   944: getfield Z8 : I
/*    */     //   947: if_icmplt -> 953
/*    */     //   950: goto -> 1172
/*    */     //   953: aload_0
/*    */     //   954: getfield y20 : Z
/*    */     //   957: ifeq -> 981
/*    */     //   960: aload_3
/*    */     //   961: iload_1
/*    */     //   962: aaload
/*    */     //   963: aload #4
/*    */     //   965: iload_1
/*    */     //   966: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   969: checkcast f/d80
/*    */     //   972: invokevirtual lE : (Lf/d80;)Z
/*    */     //   975: ifeq -> 981
/*    */     //   978: goto -> 1516
/*    */     //   981: aload #4
/*    */     //   983: iload_1
/*    */     //   984: aload_0
/*    */     //   985: getfield Ir : [Lf/d80;
/*    */     //   988: iload_1
/*    */     //   989: aaload
/*    */     //   990: astore_3
/*    */     //   991: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   994: checkcast f/d80
/*    */     //   997: dup
/*    */     //   998: astore #5
/*    */     //   1000: aload_3
/*    */     //   1001: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1004: pop
/*    */     //   1005: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1008: dup
/*    */     //   1009: astore #6
/*    */     //   1011: aload #5
/*    */     //   1013: dup
/*    */     //   1014: dup
/*    */     //   1015: dup2
/*    */     //   1016: getfield A20 : Lf/eo;
/*    */     //   1019: astore #5
/*    */     //   1021: getfield En0 : Lf/eo;
/*    */     //   1024: astore #7
/*    */     //   1026: getfield bs0 : F
/*    */     //   1029: fstore #8
/*    */     //   1031: getfield a5 : F
/*    */     //   1034: fstore #9
/*    */     //   1036: getfield Xo : F
/*    */     //   1039: fstore #10
/*    */     //   1041: ifnull -> 1054
/*    */     //   1044: aload_3
/*    */     //   1045: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1048: aload #6
/*    */     //   1050: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1053: pop
/*    */     //   1054: aload #5
/*    */     //   1056: ifnull -> 1101
/*    */     //   1059: aload_3
/*    */     //   1060: getfield A20 : Lf/eo;
/*    */     //   1063: dup
/*    */     //   1064: astore #6
/*    */     //   1066: aload #5
/*    */     //   1068: dup
/*    */     //   1069: dup
/*    */     //   1070: aload #6
/*    */     //   1072: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1075: pop
/*    */     //   1076: getfield x : F
/*    */     //   1079: fstore #5
/*    */     //   1081: getfield y : F
/*    */     //   1084: fstore #6
/*    */     //   1086: getfield z : F
/*    */     //   1089: fstore #11
/*    */     //   1091: fload #5
/*    */     //   1093: fload #6
/*    */     //   1095: fload #11
/*    */     //   1097: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1100: pop
/*    */     //   1101: aload #7
/*    */     //   1103: ifnull -> 1151
/*    */     //   1106: aload_3
/*    */     //   1107: getfield En0 : Lf/eo;
/*    */     //   1110: dup
/*    */     //   1111: astore #5
/*    */     //   1113: aload #7
/*    */     //   1115: dup
/*    */     //   1116: dup
/*    */     //   1117: aload #5
/*    */     //   1119: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1122: pop
/*    */     //   1123: getfield x : F
/*    */     //   1126: fstore #5
/*    */     //   1128: getfield y : F
/*    */     //   1131: fstore #6
/*    */     //   1133: getfield z : F
/*    */     //   1136: fstore #7
/*    */     //   1138: fload #5
/*    */     //   1140: fload #6
/*    */     //   1142: fload #7
/*    */     //   1144: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1147: invokevirtual WC0 : ()Lf/eo;
/*    */     //   1150: pop
/*    */     //   1151: aload_3
/*    */     //   1152: dup
/*    */     //   1153: dup
/*    */     //   1154: fload #8
/*    */     //   1156: putfield bs0 : F
/*    */     //   1159: fload #9
/*    */     //   1161: putfield a5 : F
/*    */     //   1164: fload #10
/*    */     //   1166: putfield Xo : F
/*    */     //   1169: goto -> 1200
/*    */     //   1172: aload_0
/*    */     //   1173: getfield y20 : Z
/*    */     //   1176: ifeq -> 1193
/*    */     //   1179: aload_3
/*    */     //   1180: iload_1
/*    */     //   1181: aaload
/*    */     //   1182: getfield bs0 : F
/*    */     //   1185: fconst_0
/*    */     //   1186: fcmpl
/*    */     //   1187: ifne -> 1193
/*    */     //   1190: goto -> 1516
/*    */     //   1193: aload_3
/*    */     //   1194: iload_1
/*    */     //   1195: aaload
/*    */     //   1196: fconst_0
/*    */     //   1197: putfield bs0 : F
/*    */     //   1200: aload_0
/*    */     //   1201: dup
/*    */     //   1202: dup2
/*    */     //   1203: dup2
/*    */     //   1204: iload_1
/*    */     //   1205: aload_0
/*    */     //   1206: dup
/*    */     //   1207: getfield rt : I
/*    */     //   1210: istore_3
/*    */     //   1211: getfield Au0 : I
/*    */     //   1214: imul
/*    */     //   1215: iload_3
/*    */     //   1216: iadd
/*    */     //   1217: istore_3
/*    */     //   1218: getfield program : Lf/Rm0;
/*    */     //   1221: iload_3
/*    */     //   1222: aload_0
/*    */     //   1223: getfield vt0 : I
/*    */     //   1226: iadd
/*    */     //   1227: aload_0
/*    */     //   1228: getfield Ir : [Lf/d80;
/*    */     //   1231: iload_1
/*    */     //   1232: aaload
/*    */     //   1233: dup
/*    */     //   1234: astore #5
/*    */     //   1236: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1239: dup
/*    */     //   1240: dup
/*    */     //   1241: getfield r : F
/*    */     //   1244: aload #5
/*    */     //   1246: getfield bs0 : F
/*    */     //   1249: dup
/*    */     //   1250: fstore #5
/*    */     //   1252: fmul
/*    */     //   1253: fstore #6
/*    */     //   1255: getfield g : F
/*    */     //   1258: fload #5
/*    */     //   1260: fmul
/*    */     //   1261: fstore #7
/*    */     //   1263: getfield b : F
/*    */     //   1266: fload #5
/*    */     //   1268: fmul
/*    */     //   1269: fstore #5
/*    */     //   1271: fload #6
/*    */     //   1273: fload #7
/*    */     //   1275: fload #5
/*    */     //   1277: invokevirtual IB : (IFFF)V
/*    */     //   1280: getfield program : Lf/Rm0;
/*    */     //   1283: dup
/*    */     //   1284: astore #5
/*    */     //   1286: iload_3
/*    */     //   1287: aload_0
/*    */     //   1288: getfield COm6 : I
/*    */     //   1291: iadd
/*    */     //   1292: aload_0
/*    */     //   1293: getfield Ir : [Lf/d80;
/*    */     //   1296: iload_1
/*    */     //   1297: aaload
/*    */     //   1298: getfield A20 : Lf/eo;
/*    */     //   1301: dup
/*    */     //   1302: dup
/*    */     //   1303: aload #5
/*    */     //   1305: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1308: pop
/*    */     //   1309: getfield x : F
/*    */     //   1312: fstore #5
/*    */     //   1314: getfield y : F
/*    */     //   1317: fstore #6
/*    */     //   1319: getfield z : F
/*    */     //   1322: fstore #7
/*    */     //   1324: fload #5
/*    */     //   1326: fload #6
/*    */     //   1328: fload #7
/*    */     //   1330: invokevirtual IB : (IFFF)V
/*    */     //   1333: getfield program : Lf/Rm0;
/*    */     //   1336: dup
/*    */     //   1337: astore #5
/*    */     //   1339: iload_3
/*    */     //   1340: aload_0
/*    */     //   1341: getfield Fg0 : I
/*    */     //   1344: iadd
/*    */     //   1345: aload_0
/*    */     //   1346: getfield Ir : [Lf/d80;
/*    */     //   1349: iload_1
/*    */     //   1350: aaload
/*    */     //   1351: getfield En0 : Lf/eo;
/*    */     //   1354: dup
/*    */     //   1355: dup
/*    */     //   1356: aload #5
/*    */     //   1358: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1361: pop
/*    */     //   1362: getfield x : F
/*    */     //   1365: fstore #5
/*    */     //   1367: getfield y : F
/*    */     //   1370: fstore #6
/*    */     //   1372: getfield z : F
/*    */     //   1375: fstore #7
/*    */     //   1377: fload #5
/*    */     //   1379: fload #6
/*    */     //   1381: fload #7
/*    */     //   1383: invokevirtual IB : (IFFF)V
/*    */     //   1386: getfield program : Lf/Rm0;
/*    */     //   1389: aload_0
/*    */     //   1390: iload_3
/*    */     //   1391: aload_0
/*    */     //   1392: getfield wf0 : I
/*    */     //   1395: iadd
/*    */     //   1396: istore #5
/*    */     //   1398: getfield Ir : [Lf/d80;
/*    */     //   1401: iload_1
/*    */     //   1402: aaload
/*    */     //   1403: getfield a5 : F
/*    */     //   1406: fstore #6
/*    */     //   1408: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1411: pop
/*    */     //   1412: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   1415: iload #5
/*    */     //   1417: fload #6
/*    */     //   1419: invokeinterface glUniform1f : (IF)V
/*    */     //   1424: getfield program : Lf/Rm0;
/*    */     //   1427: aload_0
/*    */     //   1428: iload_3
/*    */     //   1429: aload_0
/*    */     //   1430: getfield AE0 : I
/*    */     //   1433: iadd
/*    */     //   1434: istore #5
/*    */     //   1436: getfield Ir : [Lf/d80;
/*    */     //   1439: iload_1
/*    */     //   1440: aaload
/*    */     //   1441: getfield Xo : F
/*    */     //   1444: fstore #6
/*    */     //   1446: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1449: pop
/*    */     //   1450: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   1453: iload #5
/*    */     //   1455: fload #6
/*    */     //   1457: invokeinterface glUniform1f : (IF)V
/*    */     //   1462: getfield PI0 : I
/*    */     //   1465: dup
/*    */     //   1466: istore #5
/*    */     //   1468: iflt -> 1506
/*    */     //   1471: aload_0
/*    */     //   1472: getfield program : Lf/Rm0;
/*    */     //   1475: aload_0
/*    */     //   1476: iload_3
/*    */     //   1477: iload #5
/*    */     //   1479: iadd
/*    */     //   1480: istore_3
/*    */     //   1481: getfield Ir : [Lf/d80;
/*    */     //   1484: iload_1
/*    */     //   1485: aaload
/*    */     //   1486: getfield bs0 : F
/*    */     //   1489: fstore #5
/*    */     //   1491: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1494: pop
/*    */     //   1495: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   1498: iload_3
/*    */     //   1499: fload #5
/*    */     //   1501: invokeinterface glUniform1f : (IF)V
/*    */     //   1506: aload_0
/*    */     //   1507: getfield Au0 : I
/*    */     //   1510: ifgt -> 1516
/*    */     //   1513: goto -> 1522
/*    */     //   1516: iinc #1, 1
/*    */     //   1519: goto -> 925
/*    */     //   1522: aload_2
/*    */     //   1523: getstatic f/qo.Ml : J
/*    */     //   1526: dup2
/*    */     //   1527: lstore_3
/*    */     //   1528: invokevirtual gV : (J)Z
/*    */     //   1531: ifeq -> 1557
/*    */     //   1534: aload_0
/*    */     //   1535: aload_2
/*    */     //   1536: lload_3
/*    */     //   1537: aload_0
/*    */     //   1538: getfield kU : I
/*    */     //   1541: istore_1
/*    */     //   1542: invokevirtual cOM1 : (J)Lf/dj;
/*    */     //   1545: checkcast f/qo
/*    */     //   1548: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1551: iload_1
/*    */     //   1552: swap
/*    */     //   1553: invokevirtual set : (ILcom/badlogic/gdx/graphics/Color;)Z
/*    */     //   1556: pop
/*    */     //   1557: aload_0
/*    */     //   1558: iconst_1
/*    */     //   1559: putfield y20 : Z
/*    */     //   1562: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 9
/*    */     //   #2	-> 12
/*    */     //   #3	-> 34
/*    */     //   #4	-> 37
/*    */     //   #5	-> 59
/*    */     //   #6	-> 62
/*    */     //   #7	-> 167
/*    */     //   #8	-> 218
/*    */     //   #9	-> 241
/*    */     //   #10	-> 259
/*    */     //   #11	-> 291
/*    */     //   #12	-> 315
/*    */     //   #13	-> 323
/*    */     //   #14	-> 604
/*    */     //   #15	-> 628
/*    */     //   #16	-> 660
/*    */     //   #17	-> 689
/*    */     //   #18	-> 696
/*    */     //   #19	-> 888
/*    */     //   #20	-> 901
/*    */     //   #21	-> 1005
/*    */     //   #22	-> 1045
/*    */     //   #23	-> 1076
/*    */     //   #24	-> 1107
/*    */     //   #25	-> 1123
/*    */     //   #26	-> 1147
/*    */     //   #27	-> 1173
/*    */     //   #28	-> 1309
/*    */     //   #29	-> 1333
/*    */     //   #30	-> 1362
/*    */     //   #31	-> 1386
/*    */     //   #32	-> 1412
/*    */     //   #33	-> 1424
/*    */     //   #34	-> 1450
/*    */     //   #35	-> 1462
/*    */     //   #36	-> 1495
/*    */     //   #37	-> 1507
/*    */   }
/*    */   
/*    */   public bG(Xw0 paramXw0, Ql paramQl, String paramString1, String paramString2, String paramString3) {
/*    */     this(paramString1, m0.tF0(paramString1, paramString3));
/*    */     Rm0 rm0;
/*    */     this(paramXw0, paramQl, this);
/*    */   }
/*    */   
/*    */   public bG(Xw0 paramXw0) {
/*    */     this();
/*    */     Ql ql;
/*    */     this(paramXw0, this);
/*    */   }
/*    */   
/*    */   public bG(Xw0 paramXw0, Ql paramQl) {
/*    */     this(paramXw0, paramQl, this);
/*    */   }
/*    */   
/*    */   public bG(Xw0 paramXw0, Ql paramQl, String paramString) {
/*    */     this(paramXw0, paramQl, paramString, str1, str2);
/*    */   }
/*    */   
/*    */   public static final boolean l10(long paramLong1, long paramLong2) {
/*    */     return ((paramLong1 & paramLong2) == paramLong2);
/*    */   }
/*    */   
/*    */   public final void init() {
/*    */     int i;
/*    */     Rm0 rm0 = this.program;
/*    */     this.program = null;
/*    */     init(rm0, this.Vr0);
/*    */     this.Vr0 = null;
/*    */     this.VI = loc(this.ll);
/*    */     this.FY = loc(this.ll) - this.VI;
/*    */     this.nX = loc(this.qr) - this.VI;
/*    */     if ((this.na0 = loc(this.J60) - this.VI) < 0)
/*    */       this.na0 = 0; 
/*    */     this.ym0 = loc(this.Jy);
/*    */     this.U6 = loc(this.Jy) - this.ym0;
/*    */     this.qv0 = loc(this.qJ) - this.ym0;
/*    */     if (has(this.xv0)) {
/*    */       i = loc(this.xv0) - this.ym0;
/*    */     } else {
/*    */       i = -1;
/*    */     } 
/*    */     this.ma0 = i;
/*    */     if ((this.sl0 = loc(this.O50) - this.ym0) < 0)
/*    */       this.sl0 = 0; 
/*    */     this.rt = loc(this.PC);
/*    */     this.vt0 = loc(this.PC) - this.rt;
/*    */     this.COm6 = loc(this.Jj) - this.rt;
/*    */     this.Fg0 = loc(this.iJ0) - this.rt;
/*    */     if (has(this.DQ)) {
/*    */       i = loc(this.DQ) - this.rt;
/*    */     } else {
/*    */       i = -1;
/*    */     } 
/*    */     this.PI0 = i;
/*    */     this.wf0 = loc(this.N0) - this.rt;
/*    */     this.AE0 = loc(this.to) - this.rt;
/*    */     if ((this.Au0 = loc(this.Pg) - this.rt) < 0)
/*    */       this.Au0 = 0; 
/*    */   }
/*    */   
/*    */   public final boolean equals(Object paramObject) {
/*    */     if (paramObject instanceof bG) {
/*    */       boolean bool;
/*    */       if ((bG)paramObject == this) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void render(Xw0 paramXw0, b70 paramb70) {
/*    */     if (!paramb70.gV(zc.U7))
/*    */       this.context.Mg(770, 771, false); 
/*    */     WQ(paramb70);
/*    */     if (this.I4)
/*    */       iH(paramXw0, paramb70); 
/*    */     super.render(paramXw0, paramb70);
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


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */