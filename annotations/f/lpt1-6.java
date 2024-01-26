/*  1 */ package f;public class lpt1 extends Tb { public static final ik ek0 = C00.gd(lpt1.class); public final eo Iz0 = new eo(); public rf f2; public String Zl0; public int AW; public float fv0; public final eo SO = new eo(); public final eo xa = new eo(); public float k = 1.0F; public Eb Of = new Eb(); public Eb AN = new Eb(); public fQ lz = new fQ(); public HashMap Cv0; public HashMap hI; public HashMap Eo; public NE uU; public xQ a5; public NY Qv0; public pe0 WJ0; public float Zr0 = 0.0F; public float OU = 0.0F; public float gE0 = 0.0F; public Ew Cx0; public final void kg0() { if (this.Of == null) { Eb eb1; this(); this.Of = eb1; this(); this.AN = eb1; }  Eb eb; (eb = this.Of).Te0(); int i; byte b;
/*  2 */     for (i = this.vC0.Z8, b = 0; b < i; ) { ((zP)this.vC0.get(b)).dn(eb); b++; }
/*  3 */      eb = this.Of; this.SO
/*    */       
/*  5 */       .JL(eb.sD);
/*  6 */     eb = this.Of; this.xa
/*    */       
/*  8 */       .JL(eb.LW);
/*  9 */     this.xa.Ab0(); this.AN.rD0(this.Of); }
/*    */   public boolean A60 = false; public boolean yY = false; public boolean zd0 = false; public int w4; public Color H8; public Color hY; public qo ps0; public qo f6; public So ej0; public boolean l00 = true; public boolean Yr0 = true; public e2 Qp0 = new e2(4000); public short sU = -1; public lpt1 ky; public int jx = -1; public int YZ = -1; public boolean bv = true; public fn NT = null; public lpt1(cf0 paramcf0, String paramString, float paramFloat, Ew paramEw) { super(paramcf0); this.Zl0 = paramString; this.YZ = paramString.hashCode(); this.fv0 = paramFloat; this.Cx0 = paramEw; O80 o80; if ((o80 = (O80)((T0)this.xl0.get(0)).ct0(O80.Jg0)) != null) { this((Texture)o80.cv0.ze); this.WJ0 = pe01; float f2 = o80.QG; paramFloat = o80.Ry; float f1 = o80.za + f2; f2 = o80.yh0 + paramFloat; pe0 pe01; (pe01 = new pe0()).Nj0(f2, paramFloat, f1, f2); }  U2(); if (this.fv0 != 64.0F) ((zP)this.vC0.get(0)).nH.uu(this.fv0 / 64.0F);  o6(); } public lpt1(lpt1 paramlpt1) { this(); Matrix4 matrix4; super(paramlpt1, this); this.Iz0 = new eo(); this.SO = new eo(); this.xa = new eo(); this.k = 1.0F; this.Of = new Eb(); this.AN = new Eb(); this.lz = new fQ(); this.Zr0 = 0.0F; this.OU = 0.0F; this.gE0 = 0.0F; this.A60 = false; this.yY = false; this.zd0 = false; this.l00 = true; this.Yr0 = true; this.Qp0 = new e2(4000); this.sU = -1; this.jx = -1; this.YZ = -1; this.bv = true; this.NT = null; this.Zl0 = paramlpt1.Zl0; this.fv0 = paramlpt1.fv0; this.Cv0 = paramlpt1.Cv0; this.Eo = paramlpt1.Eo; this.hI = paramlpt1.hI; this.Cx0 = paramlpt1.Cx0; this.Of.rD0(paramlpt1.AN); this.AN.rD0(paramlpt1.AN); this.WJ0 = paramlpt1.WJ0; U2(); this.lz.clear(); this.lz.OG0(paramlpt1.lz); Jx0(true); this.jx = paramlpt1.jx; this.bv = paramlpt1.bv; this.NT = paramlpt1.NT; } public final void U2() { if (this.qY.cs.Z8 > 0) { (this.f2 = new rf(this)).Mq = true; Hc0 hc0 = this.qY.cs.r30(); while (hc0.hasNext()) { d4 d4 = (d4)hc0.next(); this.lz.Com3(d4.Ge); }  }  } public final void Kg0(int paramInt, byte paramByte) { String[] arrayOfString1; String[] arrayOfString2; if (paramByte == 2) { db0("window"); db0("c6window"); db0("mado"); db0("h_mado"); db0("h_mado_1"); db0("h_mado_lm1"); db0("h_mado_lm2"); db0("h_mado_lm3"); }  if (paramByte == 3) { if (this.Zl0.equalsIgnoreCase("gym00")) { Mz("lambert5"); } else { db0("h_mado"); db0("h_mado_lm1"); db0("h_mado_lm2"); db0("h_mado_lm4"); db0("light"); Mz("light_a"); Mz("light2"); Mz("pc_door"); (arrayOfString2 = new String[1])[0] = "gate_3"; z8(arrayOfString2); (arrayOfString2 = new String[1])[0] = "gym_door00"; z8(arrayOfString2); (arrayOfString2 = new String[1])[0] = "c5_door_s"; z8(arrayOfString2); (arrayOfString2 = new String[1])[0] = "c1_fun2"; z8(arrayOfString2); }  if (paramInt == 6) { db0("c1_s01_c"); db0("c1_b03_3_lm4"); db0("c1_b01_4_lm3"); db0("c1_b01_4_lm1"); (arrayOfString1 = new String[1])[0] = "c1_s03_c_lm14"; z8(this); db0("h_mado_lm5"); (arrayOfString1 = new String[1])[0] = "c1_s02_4"; z8(this); } else if (paramInt == 9) { if (((lpt1)super).Zl0.equalsIgnoreCase("c1_b02c") || ((lpt1)super).Zl0.equalsIgnoreCase("c1_b02a")) super.db0("c1_b01_4_lm3");  if (((lpt1)super).Zl0.equalsIgnoreCase("c4_s01")) { (arrayOfString1 = new String[1])[0] = "c4_mado"; super.z8(this); }  } else if (paramInt == 11 && ((lpt1)super).Zl0.equalsIgnoreCase("c06_s01")) { (arrayOfString1 = new String[1])[0] = "lambert9"; super.z8(this); } else if (paramInt == 12) { if (((lpt1)super).Zl0.equalsIgnoreCase("c7_s01")) { (arrayOfString1 = new String[3])[0] = "lambert7"; (new String[3])[1] = "lambert4"; (new String[3])[2] = "lambert8"; super.z8(this); super.db0("lambert3"); } else if (((lpt1)super).Zl0.equalsIgnoreCase("c7_s02a") || ((lpt1)super).Zl0.equalsIgnoreCase("c7_s02b")) { super.db0("lambert4"); }  } else if (paramInt == 13) { if (((lpt1)super).Zl0.equalsIgnoreCase("c8_s02")) super.db0("lambert4");  } else if (paramInt == 15) { if (((lpt1)super).Zl0.equalsIgnoreCase("c10_s01")) { (arrayOfString1 = new String[1])[0] = "lambert3"; super.z8(this); }  } else if (paramInt == 25) { if (((lpt1)super).Zl0.equalsIgnoreCase("r210h02")) { (arrayOfString1 = new String[1])[0] = "r210h02_c"; super.z8(this); }  } else if (paramInt == 28) { if (((lpt1)super).Zl0.equalsIgnoreCase("r213s01") || ((lpt1)super).Zl0.equalsIgnoreCase("l2_s02a")) super.db0("lambert4");  } else if (paramInt == 36) { if (((lpt1)super).Zl0.equalsIgnoreCase("r221s01")) { super.db0("lambert11"); (arrayOfString1 = new String[1])[0] = "lambert12"; super.z8(this); }  } else if (paramInt == 73) { if (((lpt1)super).Zl0.equalsIgnoreCase("l2_s01")) { super.db0("lambert7"); (arrayOfString1 = new String[1])[0] = "lambert5"; super.z8(this); } else if (((lpt1)super).Zl0.equalsIgnoreCase("l2_s02a")) { super.db0("lambert4"); }  } else if (paramInt == 83 && ((lpt1)super).Zl0.equalsIgnoreCase("t7_s01")) { super.db0("lambert9"); (arrayOfString1 = new String[1])[0] = "lambert11"; super.z8(this); }  }  if (arrayOfString2 == 4) { super.db0("h_mado"); super.db0("h_mado_lm1"); super.db0("h_mado_lm5"); switch (((lpt1)super).jx) { default: return;case 315: case 316: case 317: super.db0("mado");case 134: super.db0("_mado");case 132: super.db0("lambert6");case 118: super.db0("h_mado_lm8");case 116: super.db0("tn_photo_01w");case 109: super.db0("h_mado_lm7");case 102: case 105: super.db0("_mado");case 104: super.db0("_h_mado");case 47: super.db0("h_mado_lm4");case 21: break; }  super.db0("wk_labo_c"); }  } public final void ng(short paramShort) { this.sU = paramShort; } public final void Jx0(boolean paramBoolean) { this.A60 = paramBoolean; } public final void C50() { this.Of.pp0.JL(this.AN.pp0); this.Of.s60.JL(this.AN.s60); this.Of.Uc(this.mh); } public final void Q1(float paramFloat1, float paramFloat2, float paramFloat3) { this.AN.pp0.uD(paramFloat1, paramFloat2, paramFloat3); this.AN.s60.Tz(paramFloat1, paramFloat2, paramFloat3); C50(); } public final void rq(String paramString1, String paramString2, float paramFloat, pe0[] paramArrayOfpe0, boolean paramBoolean) { if (else(paramString2) == null) { ek0.info("Cant find material " + paramString2 + " for texture uv animation = " + paramString1); return; }  if (this.Cv0 == null) { HashMap<Object, Object> hashMap; this(); this.Cv0 = hashMap; }  if (paramArrayOfpe0 == null) return;  this(paramString2, paramFloat, paramArrayOfpe0); EV eV; if (this.Cv0.get(paramString1) == null) { NE nE; this(); this.Cv0.put(paramString1, nE); this.lz.Com3(paramString1); }  ((NE)this.Cv0.get(paramString1)).IA.Com3(eV); if ((paramBoolean || paramString1.equalsIgnoreCase("machine01") || paramString1.equalsIgnoreCase("machine02") || paramString1.equalsIgnoreCase("c1_school_01")) && !paramString1.equalsIgnoreCase("pcmachine01") && !paramString1.equalsIgnoreCase("mball01")) XT(paramString1, true);  } public final void dA(String paramString1, String paramString2, float paramFloat, Z30[] paramArrayOfZ30, boolean paramBoolean) { if (this.Zl0.contains("pl_lite") && paramString2.contains("out32_han2")) paramString2 = "out32_han2_1";  if (else(paramString2) == null) return;  if (this.Eo == null) { HashMap<Object, Object> hashMap; this(); this.Eo = hashMap; }  this(paramString2, paramFloat, paramArrayOfZ30); X6 x6; if (this.Eo.get(paramString1) == null) { xQ xQ1; this(); this.Eo.put(paramString1, xQ1); this.lz.Com3(paramString1); }  ((xQ)this.Eo.get(paramString1)).pz0.Com3(x6); if (paramBoolean) nl(paramString1, true);  } public final KI0 rd(int paramInt, boolean paramBoolean, J3 paramJ3) { fQ fQ1; return (paramInt >= (fQ1 = this.lz).Z8) ? null : co0((String)fQ1.get(paramInt), paramBoolean, paramJ3); } public final KI0 co0(String paramString, boolean paramBoolean, J3 paramJ3) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aconst_null
/*    */     //   2: astore #4
/*    */     //   4: getfield f2 : Lf/rf;
/*    */     //   7: ifnull -> 225
/*    */     //   10: aload_0
/*    */     //   11: getfield Ly : Lf/fQ;
/*    */     //   14: getfield Z8 : I
/*    */     //   17: istore #5
/*    */     //   19: iconst_0
/*    */     //   20: istore #6
/*    */     //   22: iload #6
/*    */     //   24: iload #5
/*    */     //   26: if_icmpge -> 63
/*    */     //   29: aload_0
/*    */     //   30: getfield Ly : Lf/fQ;
/*    */     //   33: iload #6
/*    */     //   35: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   38: checkcast f/d4
/*    */     //   41: dup
/*    */     //   42: astore #7
/*    */     //   44: getfield Ge : Ljava/lang/String;
/*    */     //   47: aload_1
/*    */     //   48: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   51: ifeq -> 57
/*    */     //   54: goto -> 66
/*    */     //   57: iinc #6, 1
/*    */     //   60: goto -> 22
/*    */     //   63: aconst_null
/*    */     //   64: astore #7
/*    */     //   66: aload #7
/*    */     //   68: ifnull -> 225
/*    */     //   71: iload_2
/*    */     //   72: aload_0
/*    */     //   73: getfield f2 : Lf/rf;
/*    */     //   76: astore #4
/*    */     //   78: ifeq -> 89
/*    */     //   81: ldc_w 2147483647
/*    */     //   84: istore #5
/*    */     //   86: goto -> 92
/*    */     //   89: iconst_1
/*    */     //   90: istore #5
/*    */     //   92: aload #4
/*    */     //   94: dup
/*    */     //   95: aload_1
/*    */     //   96: iload #5
/*    */     //   98: fconst_1
/*    */     //   99: aload_3
/*    */     //   100: invokevirtual lY : (Ljava/lang/String;IFLf/J3;)Lf/KI0;
/*    */     //   103: astore_3
/*    */     //   104: getfield hm : Lf/KI0;
/*    */     //   107: dup
/*    */     //   108: astore #5
/*    */     //   110: ifnonnull -> 122
/*    */     //   113: aload #4
/*    */     //   115: aload_3
/*    */     //   116: putfield hm : Lf/KI0;
/*    */     //   119: goto -> 216
/*    */     //   122: aload #4
/*    */     //   124: getfield Mq : Z
/*    */     //   127: ifne -> 158
/*    */     //   130: aload_3
/*    */     //   131: ifnull -> 158
/*    */     //   134: aload #5
/*    */     //   136: getfield fu0 : Lf/d4;
/*    */     //   139: aload_3
/*    */     //   140: getfield fu0 : Lf/d4;
/*    */     //   143: if_acmpne -> 158
/*    */     //   146: aload_3
/*    */     //   147: aload #5
/*    */     //   149: getfield lk : F
/*    */     //   152: putfield lk : F
/*    */     //   155: goto -> 197
/*    */     //   158: aload #5
/*    */     //   160: getfield fu0 : Lf/d4;
/*    */     //   163: getfield Jg : Lf/fQ;
/*    */     //   166: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   169: astore #5
/*    */     //   171: aload #5
/*    */     //   173: invokevirtual hasNext : ()Z
/*    */     //   176: ifeq -> 197
/*    */     //   179: aload #5
/*    */     //   181: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   184: checkcast f/Kj0
/*    */     //   187: getfield WW : Lf/zP;
/*    */     //   190: iconst_0
/*    */     //   191: putfield L : Z
/*    */     //   194: goto -> 171
/*    */     //   197: aload #4
/*    */     //   199: aload_3
/*    */     //   200: aload #4
/*    */     //   202: getfield EI0 : Lf/Pd;
/*    */     //   205: aload #4
/*    */     //   207: getfield hm : Lf/KI0;
/*    */     //   210: invokevirtual free : (Ljava/lang/Object;)V
/*    */     //   213: putfield hm : Lf/KI0;
/*    */     //   216: aload #4
/*    */     //   218: iconst_1
/*    */     //   219: putfield Xu0 : Z
/*    */     //   222: aload_3
/*    */     //   223: astore #4
/*    */     //   225: aload_0
/*    */     //   226: dup
/*    */     //   227: dup
/*    */     //   228: aload_1
/*    */     //   229: iload_2
/*    */     //   230: invokevirtual nl : (Ljava/lang/String;Z)V
/*    */     //   233: aload_1
/*    */     //   234: iload_2
/*    */     //   235: invokevirtual XT : (Ljava/lang/String;Z)V
/*    */     //   238: getfield hI : Ljava/util/HashMap;
/*    */     //   241: dup
/*    */     //   242: astore_3
/*    */     //   243: ifnonnull -> 249
/*    */     //   246: goto -> 280
/*    */     //   249: aload_3
/*    */     //   250: aload_1
/*    */     //   251: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   254: checkcast f/NY
/*    */     //   257: dup
/*    */     //   258: astore_1
/*    */     //   259: ifnonnull -> 265
/*    */     //   262: goto -> 280
/*    */     //   265: aload_0
/*    */     //   266: dup
/*    */     //   267: aload_1
/*    */     //   268: iload_2
/*    */     //   269: putfield lp0 : Z
/*    */     //   272: aload_1
/*    */     //   273: putfield Qv0 : Lf/NY;
/*    */     //   276: fconst_0
/*    */     //   277: putfield gE0 : F
/*    */     //   280: aload #4
/*    */     //   282: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 11
/*    */     //   #2	-> 73
/*    */     //   #3	-> 100
/*    */     //   #4	-> 104
/*    */     //   #5	-> 163
/*    */     //   #6	-> 202
/*    */     //   #7	-> 230
/* 10 */     //   #8	-> 238 } public final void XT(String paramString, boolean paramBoolean) { HashMap hashMap; if ((hashMap = this.Cv0) == null) return;  NE nE; if ((nE = (NE)hashMap.get(paramString)) == null) return;  nE.lI = paramBoolean; this.uU = nE; this.Zr0 = 0.0F; } public final void nl(String paramString, boolean paramBoolean) { HashMap hashMap; if ((hashMap = this.Eo) == null) return;  xQ xQ1; if ((xQ1 = (xQ)hashMap.get(paramString)) == null) return;  xQ1.Tl0 = paramBoolean; this.a5 = xQ1; this.OU = 0.0F; } public final void uq() { rf rf1; KI0 kI0; if ((rf1 = this.f2) != null && (kI0 = rf1.hm) != null) kI0.nS = 0.0F;  this.a5 = null; this.uU = null; NY nY; if ((nY = this.Qv0) != null) for (Hc0 hc0 = nY.x7.r30(); hc0.hasNext(); ) { Yf0 yf0 = (Yf0)((xX)hc0.next()).ka(2.14748365E9F, false); T0 t0; if ((t0 = else(((xX)hc0.next()).D60)) == null) continue;  t0.Tz0(new zc(yf0.Wb / 31.0F)); qo qo2; int j; if ((qo2 = (qo)t0.cOM1(qo.A80)) != null && (j = yf0.R7) != -1) qo2.vF0.set(j);  if ((qo2 = (qo)t0.cOM1(qo.J9)) != null && (j = yf0.LPT9) != -1) qo2.vF0.set(j);  if ((qo2 = (qo)t0.cOM1(qo.cu0)) != null && (j = yf0.Q1) != -1) qo2.vF0.set(j);  int i; qo qo1; if ((qo1 = (qo)t0.cOM1(qo.bh0)) != null && (i = yf0.FM) != -1) qo1.vF0.set(i);  }   this.Qv0 = null; } public final Ew GQ() { return this.Cx0; } public void Ud0(float paramFloat1, float paramFloat2) { if (!this.l00) return;  rf rf1; if ((rf1 = this.f2) != null) rf1.xH(paramFloat2 * this.k);  NE nE; if ((nE = this.uU) != null) { if (this.Zr0 == 0.0F && this.k < 1.0E8F) this.Zr0 = paramFloat1;  for (Hc0 hc0 = nE.IA.r30(); hc0.hasNext();) { if ((pe01 = (pe0)(eV = (EV)hc0.next()).ka((paramFloat1 - this.Zr0) * this.k, this.uU.lI)) != null) ((O80)else(eV.bm).cOM1(O80.Jg0)).ID(pe01);  }  }  NY nY; if ((nY = this.Qv0) != null) { if (this.gE0 == 0.0F) this.gE0 = paramFloat1;  for (Hc0 hc0 = nY.x7.r30(); hc0.hasNext(); ) { Yf0 yf0 = (Yf0)((xX)hc0.next()).ka((paramFloat1 - this.gE0) * this.k, this.Qv0.lp0); T0 t0; if ((t0 = else(((xX)hc0.next()).D60)) == null) continue;  zc zc; int j; if ((zc = (zc)t0.cOM1(zc.U7)) != null && (j = yf0.Wb) != -1) zc.yg0 = j / 31.0F;  qo qo2; if ((qo2 = (qo)t0.cOM1(qo.A80)) != null && (j = yf0.R7) != -1) qo2.vF0.set(j);  if ((qo2 = (qo)t0.cOM1(qo.J9)) != null && (j = yf0.LPT9) != -1) qo2.vF0.set(j);  if ((qo2 = (qo)t0.cOM1(qo.cu0)) != null && (j = yf0.Q1) != -1) qo2.vF0.set(j);  int i;
/*    */         qo qo1;
/* 12 */         if ((qo1 = (qo)t0.cOM1(qo.bh0)) != null && (i = yf0.FM) != -1) qo1.vF0.set(i);  }  }  xQ xQ1; if ((xQ1 = this.a5) != null) { if (this.OU == 0.0F && this.k < 1.0E8F) this.OU = paramFloat1;  for (Hc0 hc0 = xQ1.pz0.r30(); hc0.hasNext();) { if ((z30 = (Z30)(x6 = (X6)hc0.next()).ka((paramFloat1 - this.OU) * this.k, this.a5.Tl0)) != null) {
/*    */ 
/*    */           
/* 15 */           O80 o80 = (O80)else(x6.z40).cOM1(O80.Jg0); float f2; if ((f2 = z30.Com2) != 65535.0F) o80.QG = -f2;  if ((f2 = z30.Lz0) != 65535.0F) o80.Ry = f2;  if ((f2 = z30.QP) != 65535.0F) o80.za = f2;  float f1; if ((f1 = z30.Nl) != 65535.0F) o80.yh0 = f1;  if (o80.za == 0.0F && o80.yh0 == 0.0F) { o80.QG = 0.05F; o80.Ry = 0.05F; o80.za = 0.1F; o80.yh0 = 0.1F; }
/*    */         
/*    */         }  }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public void Ea0() {
/*    */     this.yY = true;
/*    */     this.qY.dispose();
/*    */     Ew ew;
/*    */     if (!this.A60 && !this.yY && (ew = this.Cx0) != null && !this.V10)
/*    */       dispose(); 
/*    */   }
/*    */   
/*    */   public lpt1 ro0() {
/*    */     (new lpt1(this)).A60 = true;
/*    */     return new lpt1(this);
/*    */   }
/*    */   
/*    */   public final void db0(String paramString) {
/*    */     T0 t0;
/*    */     if ((t0 = else(paramString)) != null) {
/*    */       if (this.ps0 == null) {
/*    */         qo qo1;
/*    */         Color color;
/*    */         long l = qo.iu0;
/*    */         this(-1);
/*    */         this.H8 = color;
/*    */         this(l, color);
/*    */         this.ps0 = qo1;
/*    */       } 
/*    */       t0.Tz0(this.ps0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Mz(String paramString) {
/*    */     T0 t0;
/*    */     if ((t0 = else(paramString)) != null) {
/*    */       if (this.f6 == null) {
/*    */         qo qo1;
/*    */         Color color;
/*    */         long l = qo.iu0;
/*    */         this(-1);
/*    */         this.hY = color;
/*    */         this(l, color);
/*    */         this.f6 = qo1;
/*    */       } 
/*    */       t0.Tz0(this.f6);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void z8(String... paramVarArgs) {
/*    */     long l = qo.iu0;
/*    */     this(-1);
/*    */     qo qo1;
/*    */     Color color;
/*    */     this(l, color);
/*    */     int i = paramVarArgs.length;
/*    */     for (byte b = 0; b < i; b++) {
/*    */       T0 t0;
/*    */       if ((t0 = else(paramVarArgs[b])) != null)
/*    */         t0.Tz0(qo1); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void wP(float paramFloat) {
/*    */     j10(paramFloat, null);
/*    */   }
/*    */   
/*    */   public void M70(eo parameo) {}
/*    */   
/*    */   public final void j10(float paramFloat, lw paramlw) {
/*    */     So so;
/*    */     if ((so = this.ej0) != null && so.DD())
/*    */       this.ej0 = null; 
/*    */     if (this.sU > 0 && this.Qp0.Po0()) {
/*    */       Jo jo;
/*    */       vh0 vh0;
/*    */       if ((vh0 = km.a3) == null || (jo = vh0.Ct) == null) {
/*    */         f = 99999.0F;
/*    */       } else {
/*    */         this.mh.on0(this.Iz0);
/*    */         f = f.J.lpt8.u50(this.Iz0);
/*    */       } 
/*    */       float f;
/*    */       if (f < 4.0F && (f = (4.0F - f) / 4.0F * 1.0F) > 0.0F)
/*    */         km.pm0.dv((byte)2, this.sU, false, 0.0F, f, 0); 
/*    */     } 
/*    */     Vv0(paramlw, false);
/*    */     Ud0(paramFloat, UB0.M60.Qy);
/*    */   }
/*    */   
/*    */   public final void Vv0(lw paramlw, boolean paramBoolean) {
/*    */     if (this.zd0 || this.ps0 != null || this.f6 != null) {
/*    */       int j;
/*    */       if ((j = L70.gq.Rr0()) >= 6 && j < 17) {
/*    */         j = 2;
/*    */       } else {
/*    */         j = 4;
/*    */       } 
/*    */       Color color;
/*    */       if ((color = this.H8) != null && paramlw != null) {
/*    */         if (paramBoolean) {
/*    */           color.set(paramlw.GB0);
/*    */           Color color1;
/*    */           if ((color1 = this.hY) != null)
/*    */             color1.set(paramlw.vX); 
/*    */         } else {
/*    */           qo qo2;
/*    */           if (this.ej0 == null && (!paramlw.GB0.equals(this.ps0.vF0) || ((qo2 = this.f6) != null && !paramlw.vX.equals(qo2.vF0)))) {
/*    */             this.ej0 = So.k60().L5();
/*    */             if (!paramlw.GB0.equals(this.ps0.vF0)) {
/*    */               arrayOfFloat[0] = color.r;
/*    */               arrayOfFloat[1] = color.g;
/*    */               arrayOfFloat[2] = color.b;
/*    */               float[] arrayOfFloat;
/*    */               (arrayOfFloat = new float[4])[3] = (color = paramlw.GB0).a;
/*    */               this.ej0.PL(Wz0.gq(this.H8, 0, 60.0F).qY(new float[4]));
/*    */             } 
/*    */             if ((qo2 = this.f6) != null && !paramlw.vX.equals(qo2.vF0)) {
/*    */               arrayOfFloat[0] = color1.r;
/*    */               arrayOfFloat[1] = color1.g;
/*    */               arrayOfFloat[2] = color1.b;
/*    */               Color color1;
/*    */               float[] arrayOfFloat;
/*    */               (arrayOfFloat = new float[4])[3] = (color1 = paramlw.vX).a;
/*    */               this.ej0.PL(Wz0.gq(this.hY, 0, 60.0F).qY(new float[4]));
/*    */             } 
/*    */             this.ej0.Kr().mg(km.wI0.pB0);
/*    */           } 
/*    */         } 
/*    */         qo qo1;
/*    */         if ((qo1 = this.ps0) != null)
/*    */           qo1.vF0.set(this.H8); 
/*    */         if ((qo1 = this.f6) != null)
/*    */           qo1.vF0.set(this.hY); 
/*    */       } 
/*    */       int i;
/*    */       if (this.w4 != j && this.zd0 && (i = this.lz.Z8) > 0) {
/*    */         if (j != 2) {
/*    */           i--;
/*    */           paramBoolean = true;
/*    */         } else {
/*    */           i = 0;
/*    */           paramBoolean = false;
/*    */         } 
/*    */         rd(i, paramBoolean, null);
/*    */         this.w4 = j;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean Re(ny paramny) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Yr0 : Z
/*    */     //   4: ifne -> 14
/*    */     //   7: aload_0
/*    */     //   8: iconst_1
/*    */     //   9: putfield l00 : Z
/*    */     //   12: iconst_1
/*    */     //   13: ireturn
/*    */     //   14: aload_0
/*    */     //   15: aload_1
/*    */     //   16: getfield dR : Lf/ZQ;
/*    */     //   19: astore_1
/*    */     //   20: getfield Of : Lf/Eb;
/*    */     //   23: astore_2
/*    */     //   24: aload_1
/*    */     //   25: iconst_0
/*    */     //   26: istore_3
/*    */     //   27: getfield LF : [Lf/Q0;
/*    */     //   30: arraylength
/*    */     //   31: istore #4
/*    */     //   33: iload_3
/*    */     //   34: iload #4
/*    */     //   36: if_icmpge -> 457
/*    */     //   39: aload_1
/*    */     //   40: getfield LF : [Lf/Q0;
/*    */     //   43: iload_3
/*    */     //   44: aaload
/*    */     //   45: getstatic f/ZQ.case : Lf/eo;
/*    */     //   48: dup
/*    */     //   49: astore #5
/*    */     //   51: aload_2
/*    */     //   52: getfield pp0 : Lf/eo;
/*    */     //   55: dup
/*    */     //   56: dup
/*    */     //   57: getfield x : F
/*    */     //   60: fstore #6
/*    */     //   62: getfield y : F
/*    */     //   65: fstore #7
/*    */     //   67: getfield z : F
/*    */     //   70: fstore #8
/*    */     //   72: fload #6
/*    */     //   74: fload #7
/*    */     //   76: fload #8
/*    */     //   78: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   81: invokevirtual bE0 : (Lf/eo;)Lf/Ov;
/*    */     //   84: getstatic f/Ov.RJ : Lf/Ov;
/*    */     //   87: dup
/*    */     //   88: astore #6
/*    */     //   90: if_acmpeq -> 96
/*    */     //   93: goto -> 446
/*    */     //   96: aload_1
/*    */     //   97: getfield LF : [Lf/Q0;
/*    */     //   100: iload_3
/*    */     //   101: aaload
/*    */     //   102: aload #5
/*    */     //   104: aload_2
/*    */     //   105: getfield pp0 : Lf/eo;
/*    */     //   108: dup
/*    */     //   109: getfield x : F
/*    */     //   112: fstore #7
/*    */     //   114: getfield y : F
/*    */     //   117: fstore #8
/*    */     //   119: fload #7
/*    */     //   121: aload_2
/*    */     //   122: getfield s60 : Lf/eo;
/*    */     //   125: getfield z : F
/*    */     //   128: fload #8
/*    */     //   130: swap
/*    */     //   131: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   134: invokevirtual bE0 : (Lf/eo;)Lf/Ov;
/*    */     //   137: aload #6
/*    */     //   139: if_acmpeq -> 145
/*    */     //   142: goto -> 446
/*    */     //   145: aload_1
/*    */     //   146: getfield LF : [Lf/Q0;
/*    */     //   149: iload_3
/*    */     //   150: aaload
/*    */     //   151: aload #5
/*    */     //   153: aload_2
/*    */     //   154: getfield pp0 : Lf/eo;
/*    */     //   157: dup
/*    */     //   158: aload_2
/*    */     //   159: swap
/*    */     //   160: getfield x : F
/*    */     //   163: fstore #7
/*    */     //   165: getfield s60 : Lf/eo;
/*    */     //   168: getfield y : F
/*    */     //   171: fstore #8
/*    */     //   173: getfield z : F
/*    */     //   176: fstore #9
/*    */     //   178: fload #7
/*    */     //   180: fload #8
/*    */     //   182: fload #9
/*    */     //   184: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   187: invokevirtual bE0 : (Lf/eo;)Lf/Ov;
/*    */     //   190: aload #6
/*    */     //   192: if_acmpeq -> 198
/*    */     //   195: goto -> 446
/*    */     //   198: aload_1
/*    */     //   199: getfield LF : [Lf/Q0;
/*    */     //   202: iload_3
/*    */     //   203: aaload
/*    */     //   204: aload #5
/*    */     //   206: aload_2
/*    */     //   207: dup
/*    */     //   208: getfield pp0 : Lf/eo;
/*    */     //   211: getfield x : F
/*    */     //   214: fstore #7
/*    */     //   216: getfield s60 : Lf/eo;
/*    */     //   219: fload #7
/*    */     //   221: swap
/*    */     //   222: dup
/*    */     //   223: getfield y : F
/*    */     //   226: fstore #7
/*    */     //   228: getfield z : F
/*    */     //   231: fload #7
/*    */     //   233: swap
/*    */     //   234: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   237: invokevirtual bE0 : (Lf/eo;)Lf/Ov;
/*    */     //   240: aload #6
/*    */     //   242: if_acmpeq -> 248
/*    */     //   245: goto -> 446
/*    */     //   248: aload_1
/*    */     //   249: getfield LF : [Lf/Q0;
/*    */     //   252: iload_3
/*    */     //   253: aaload
/*    */     //   254: aload #5
/*    */     //   256: aload_2
/*    */     //   257: dup
/*    */     //   258: getfield s60 : Lf/eo;
/*    */     //   261: getfield x : F
/*    */     //   264: fstore #7
/*    */     //   266: getfield pp0 : Lf/eo;
/*    */     //   269: fload #7
/*    */     //   271: swap
/*    */     //   272: dup
/*    */     //   273: getfield y : F
/*    */     //   276: fstore #7
/*    */     //   278: getfield z : F
/*    */     //   281: fload #7
/*    */     //   283: swap
/*    */     //   284: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   287: invokevirtual bE0 : (Lf/eo;)Lf/Ov;
/*    */     //   290: aload #6
/*    */     //   292: if_acmpeq -> 298
/*    */     //   295: goto -> 446
/*    */     //   298: aload_1
/*    */     //   299: getfield LF : [Lf/Q0;
/*    */     //   302: iload_3
/*    */     //   303: aaload
/*    */     //   304: aload #5
/*    */     //   306: aload_2
/*    */     //   307: getfield s60 : Lf/eo;
/*    */     //   310: dup
/*    */     //   311: aload_2
/*    */     //   312: swap
/*    */     //   313: getfield x : F
/*    */     //   316: fstore #7
/*    */     //   318: getfield pp0 : Lf/eo;
/*    */     //   321: getfield y : F
/*    */     //   324: fstore #8
/*    */     //   326: getfield z : F
/*    */     //   329: fstore #9
/*    */     //   331: fload #7
/*    */     //   333: fload #8
/*    */     //   335: fload #9
/*    */     //   337: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   340: invokevirtual bE0 : (Lf/eo;)Lf/Ov;
/*    */     //   343: aload #6
/*    */     //   345: if_acmpeq -> 351
/*    */     //   348: goto -> 446
/*    */     //   351: aload_1
/*    */     //   352: getfield LF : [Lf/Q0;
/*    */     //   355: iload_3
/*    */     //   356: aaload
/*    */     //   357: aload #5
/*    */     //   359: aload_2
/*    */     //   360: getfield s60 : Lf/eo;
/*    */     //   363: dup
/*    */     //   364: getfield x : F
/*    */     //   367: fstore #7
/*    */     //   369: getfield y : F
/*    */     //   372: fstore #8
/*    */     //   374: fload #7
/*    */     //   376: aload_2
/*    */     //   377: getfield pp0 : Lf/eo;
/*    */     //   380: getfield z : F
/*    */     //   383: fload #8
/*    */     //   385: swap
/*    */     //   386: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   389: invokevirtual bE0 : (Lf/eo;)Lf/Ov;
/*    */     //   392: aload #6
/*    */     //   394: if_acmpeq -> 400
/*    */     //   397: goto -> 446
/*    */     //   400: aload_1
/*    */     //   401: getfield LF : [Lf/Q0;
/*    */     //   404: iload_3
/*    */     //   405: aaload
/*    */     //   406: aload #5
/*    */     //   408: aload_2
/*    */     //   409: getfield s60 : Lf/eo;
/*    */     //   412: dup
/*    */     //   413: dup
/*    */     //   414: getfield x : F
/*    */     //   417: fstore #5
/*    */     //   419: getfield y : F
/*    */     //   422: fstore #7
/*    */     //   424: getfield z : F
/*    */     //   427: fstore #8
/*    */     //   429: fload #5
/*    */     //   431: fload #7
/*    */     //   433: fload #8
/*    */     //   435: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   438: invokevirtual bE0 : (Lf/eo;)Lf/Ov;
/*    */     //   441: aload #6
/*    */     //   443: if_acmpeq -> 452
/*    */     //   446: iinc #3, 1
/*    */     //   449: goto -> 33
/*    */     //   452: iconst_0
/*    */     //   453: istore_1
/*    */     //   454: goto -> 459
/*    */     //   457: iconst_1
/*    */     //   458: istore_1
/*    */     //   459: iload_1
/*    */     //   460: aload_0
/*    */     //   461: iload_1
/*    */     //   462: putfield l00 : Z
/*    */     //   465: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 27
/*    */     //   #2	-> 30
/*    */     //   #3	-> 52
/*    */     //   #4	-> 57
/*    */     //   #5	-> 81
/*    */     //   #6	-> 105
/*    */     //   #7	-> 134
/*    */     //   #8	-> 154
/*    */     //   #9	-> 187
/*    */     //   #10	-> 208
/*    */     //   #11	-> 237
/*    */     //   #12	-> 258
/*    */     //   #13	-> 287
/*    */     //   #14	-> 307
/*    */     //   #15	-> 340
/*    */     //   #16	-> 360
/*    */     //   #17	-> 389
/*    */     //   #18	-> 409
/*    */     //   #19	-> 438
/*    */     //   #20	-> 462
/*    */   }
/*    */   
/*    */   public final void ml0(int paramInt, boolean paramBoolean) {
/*    */     rd(paramInt, paramBoolean, null);
/*    */   }
/*    */   
/*    */   public final void yQ() {
/*    */     co0("r04_w", true, null);
/*    */   }
/*    */   
/*    */   public final void gM() {
/*    */     this.Yr0 = false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lpt1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */