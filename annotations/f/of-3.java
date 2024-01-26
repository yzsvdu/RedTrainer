/*  1 */ package f;public class of extends JG0 { public static final Ll w1 = Ll.F10("error"); public static final Ll Tl = Ll.F10("readonly"); public static final Ll sB = Ll.F10("hover"); public static final Ll kA = Ll.F10("cursorMoved"); public static throws B = null; public final ak0 F2; public final G1 cj; public VZ sM; public hr T10; public boolean bx; public int lm; public int ju; public int mq; public int r50; public int S; public boolean GE; public boolean bh0; public boolean Td; public int mK0 = 32767; public int rE = 5; public mX tJ; public mX em0; public char Fw; public Object DJ; public boolean VY; public a70[] kc; public hu mi; public boolean h60; public boolean oR; public boolean m2 = true; public boolean y00 = true; public o3 Km; public int Fa = 100; public jo0 Sm; public dQ Dc0; public boolean LPt5 = true; public IntPredicate oo = null; public boolean n00 = false; public of(Sa0 paramSa0) { this(); ak0 ak01; this(paramSa0, this); } public of() { this(null); } public of(Sa0 paramSa0, ak0 paramak0) { super(paramSa0, true); this.F2 = paramak0; this(this, cOm7()); this.cj = g1; this.Fw = '*'; G1 g1; (g1 = new G1()).Xu("renderer"); (new G1()).xL0(); J8(g1); Zf0(true); fk(); L3("cut", this::com1); L3("copy", this::Da0); L3("paste", this::cd); L3("selectAll", this::tP); L3("duplicateLineDown", this::nL0); } public static boolean KQ(char paramChar) { return (paramChar >= 'ᄀ' && paramChar <= 'ᇿ') ? true : ((paramChar >= '㄰' && paramChar <= '㆏') ? true : ((paramChar >= 'ꥠ' && paramChar <= '꥿') ? true : ((paramChar >= '가' && paramChar <= '힯') ? true : ((paramChar >= 'ힰ' && paramChar <= '퟿'))))); } public final void A50(boolean paramBoolean1, boolean paramBoolean2, int paramInt) { ak0 ak01; MF.u10(); G1 g1 = this.cj; VZ vZ; if ((vZ = this.sM) == null) ak01 = this.F2;  g1.HC(ak01); this.cj.getClass(); if (this
/*  2 */       .cj.J50() > this.cj
/*  3 */       .xY) { i = 1; } else { i = 0; }  this
/*  4 */       .h60 = i;
/*  5 */     gj(false);
/*    */     
/*  7 */     int i = this.cj.u00;
/*  8 */     if (this.GE && this.S != i) { this.S = i; MJ0(); }
/*  9 */      a70[] arrayOfA70; if ((arrayOfA70 = this.kc) != null) { int j; byte b; for (j = arrayOfA70.length, b = 0; b < j; ) { arrayOfA70[b].SX(paramInt); b++; }  }
/* 10 */      o3 o31; if ((((o31 = this.Km) != null && (
/* 11 */       (this.fr0 != null))) || paramBoolean1) && this != null)
/* 12 */       VG();  } public final String TI() { return "editfield"; } public final void JD0(a70 parama70) { this.kc = (a70[])hm.LpT6((Object[])this.kc, parama70, a70.class); } public final void lpT2(boolean paramBoolean) { boolean bool; if (this.sM != null) { bool = true; } else { bool = false; }  if (paramBoolean != bool) { boolean bool1; ak0 ak01; if (paramBoolean) { VZ vZ1; ak01 = this.F2; this(ak01, this.Fw); this.sM = vZ1; } else { this.sM = null; }  MF.u10(); G1 g1 = this.cj; VZ vZ; if ((vZ = this.sM) == null) ak01 = this.F2;  g1.HC(ak01); this.cj.getClass(); if (this.cj.J50() > this.cj.xY) { bool1 = true; } else { bool1 = false; }  this.h60 = bool1; gj(false); }  } public void Zh(String paramString) { Be0(paramString, false); } public final void Be0(String paramString, boolean paramBoolean) { int i, j = this.mK0; if (paramString.length() > j) paramString = paramString.substring(0, j);  this.F2.Qs(0, this.F2.PH0.length(), paramString); if (this.GE) { i = 0; } else { i = this.F2.PH0.length(); }  this.lm = i; this.mq = 0; this.r50 = 0; A50(this.m2, paramBoolean, 0); gj(true); } public final boolean jh() { return (this.mq != this.r50); } public final void uh(boolean paramBoolean) { if (this.bx != paramBoolean) { this.bx = paramBoolean; this.mi = null; this.O.gf0(Tl, paramBoolean); lH("readonly", paramBoolean ^ true, paramBoolean); }  } public void gv0(String paramString) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield oo : Ljava/util/function/IntPredicate;
/*    */     //   4: ifnull -> 72
/*    */     //   7: new java/lang/StringBuilder
/*    */     //   10: dup
/*    */     //   11: astore_2
/*    */     //   12: aload_1
/*    */     //   13: aload_2
/*    */     //   14: aload_1
/*    */     //   15: invokevirtual length : ()I
/*    */     //   18: invokespecial <init> : (I)V
/*    */     //   21: invokevirtual length : ()I
/*    */     //   24: iconst_0
/*    */     //   25: swap
/*    */     //   26: invokestatic range : (II)Ljava/util/stream/IntStream;
/*    */     //   29: aload_1
/*    */     //   30: <illegal opcode> applyAsInt : (Ljava/lang/String;)Ljava/util/function/IntUnaryOperator;
/*    */     //   35: invokeinterface map : (Ljava/util/function/IntUnaryOperator;)Ljava/util/stream/IntStream;
/*    */     //   40: aload_0
/*    */     //   41: getfield oo : Ljava/util/function/IntPredicate;
/*    */     //   44: invokeinterface filter : (Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
/*    */     //   49: aload_2
/*    */     //   50: <illegal opcode> accept : (Ljava/lang/StringBuilder;)Ljava/util/function/IntConsumer;
/*    */     //   55: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
/*    */     //   60: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   63: dup
/*    */     //   64: astore_1
/*    */     //   65: invokevirtual isEmpty : ()Z
/*    */     //   68: ifeq -> 72
/*    */     //   71: return
/*    */     //   72: aload_0
/*    */     //   73: getfield bx : Z
/*    */     //   76: ifne -> 275
/*    */     //   79: aload_0
/*    */     //   80: iconst_0
/*    */     //   81: istore_2
/*    */     //   82: invokevirtual jh : ()Z
/*    */     //   85: ifeq -> 94
/*    */     //   88: aload_0
/*    */     //   89: invokevirtual Hn0 : ()V
/*    */     //   92: iconst_1
/*    */     //   93: istore_2
/*    */     //   94: aload_1
/*    */     //   95: invokevirtual length : ()I
/*    */     //   98: aload_0
/*    */     //   99: getfield mK0 : I
/*    */     //   102: aload_0
/*    */     //   103: getfield F2 : Lf/ak0;
/*    */     //   106: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   109: invokevirtual length : ()I
/*    */     //   112: isub
/*    */     //   113: invokestatic min : (II)I
/*    */     //   116: dup
/*    */     //   117: istore_3
/*    */     //   118: ifle -> 264
/*    */     //   121: aload_0
/*    */     //   122: getfield F2 : Lf/ak0;
/*    */     //   125: aload_1
/*    */     //   126: aload_0
/*    */     //   127: getfield lm : I
/*    */     //   130: istore #4
/*    */     //   132: iconst_0
/*    */     //   133: iload_3
/*    */     //   134: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   137: astore_3
/*    */     //   138: iload #4
/*    */     //   140: iconst_0
/*    */     //   141: aload_3
/*    */     //   142: invokevirtual Qs : (IILjava/lang/String;)I
/*    */     //   145: dup
/*    */     //   146: istore_3
/*    */     //   147: ifle -> 264
/*    */     //   150: aload_0
/*    */     //   151: dup
/*    */     //   152: getfield lm : I
/*    */     //   155: iload_3
/*    */     //   156: iadd
/*    */     //   157: putfield lm : I
/*    */     //   160: iconst_1
/*    */     //   161: istore_2
/*    */     //   162: iconst_0
/*    */     //   163: istore_3
/*    */     //   164: iload_3
/*    */     //   165: aload_1
/*    */     //   166: invokevirtual length : ()I
/*    */     //   169: if_icmpge -> 193
/*    */     //   172: aload_1
/*    */     //   173: iload_3
/*    */     //   174: invokevirtual charAt : (I)C
/*    */     //   177: invokestatic KQ : (C)Z
/*    */     //   180: ifeq -> 187
/*    */     //   183: iconst_1
/*    */     //   184: goto -> 194
/*    */     //   187: iinc #3, 1
/*    */     //   190: goto -> 164
/*    */     //   193: iconst_0
/*    */     //   194: ifeq -> 264
/*    */     //   197: aload_0
/*    */     //   198: dup
/*    */     //   199: getfield F2 : Lf/ak0;
/*    */     //   202: dup
/*    */     //   203: aload_0
/*    */     //   204: swap
/*    */     //   205: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   208: invokevirtual length : ()I
/*    */     //   211: istore_1
/*    */     //   212: getfield F2 : Lf/ak0;
/*    */     //   215: getstatic java/text/Normalizer$Form.NFKC : Ljava/text/Normalizer$Form;
/*    */     //   218: invokestatic normalize : (Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;
/*    */     //   221: astore_3
/*    */     //   222: iconst_0
/*    */     //   223: iload_1
/*    */     //   224: aload_3
/*    */     //   225: invokevirtual Qs : (IILjava/lang/String;)I
/*    */     //   228: pop
/*    */     //   229: getfield lm : I
/*    */     //   232: aload_0
/*    */     //   233: getfield F2 : Lf/ak0;
/*    */     //   236: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   239: invokevirtual length : ()I
/*    */     //   242: if_icmplt -> 264
/*    */     //   245: aload_0
/*    */     //   246: dup
/*    */     //   247: getfield F2 : Lf/ak0;
/*    */     //   250: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   253: invokevirtual length : ()I
/*    */     //   256: iconst_0
/*    */     //   257: swap
/*    */     //   258: invokestatic max : (II)I
/*    */     //   261: putfield lm : I
/*    */     //   264: iload_2
/*    */     //   265: ifeq -> 275
/*    */     //   268: aload_0
/*    */     //   269: iconst_1
/*    */     //   270: iconst_0
/*    */     //   271: iconst_0
/*    */     //   272: invokevirtual A50 : (ZZI)V
/*    */     //   275: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 106
/*    */     //   #2	-> 109
/*    */     //   #3	-> 113
/*    */     //   #4	-> 166
/*    */     //   #5	-> 199
/*    */     //   #6	-> 205
/*    */     //   #7	-> 208
/*    */     //   #8	-> 212
/*    */     //   #9	-> 236
/*    */     //   #10	-> 239
/*    */     //   #11	-> 247
/*    */     //   #12	-> 250
/*    */     //   #13	-> 253
/*    */     //   #14	-> 258 } public final void cd() { String str; if (xt()) return;  if (UB0.Kg0.fl0 == null) { str = ""; } else { str = GLFW.glfwGetClipboardString(UB0.M60.AW.ne0); }  if (str == null) str = "";  if (str.contains("﻿")) str = str.replace("﻿", "");  int i; if (!this.GE && (i = str.lastIndexOf('\n')) >= 0) { StringBuilder stringBuilder; this(str); while (true) { if (stringBuilder.charAt(i) == '\n') stringBuilder.deleteCharAt(i);  if (--i < 0) { str = stringBuilder.toString(); break; }  }  }  gv0(str); } public boolean xt() { return false; } public final void Da0() { String str; boolean bool; if (jh()) { ak0 ak01 = this.F2; bool = this.mq; int i = this.r50; str = ak01.PH0.substring(bool, i); } else { str = this.F2.PH0.toString(); }  if (this.sM != null) { bool = true; } else { bool = false; }  if (bool) { char c = this.Fw; int i; char[] arrayOfChar; byte b; for (arrayOfChar = new char[i = str.length()], b = 0; b < i; ) { arrayOfChar[b] = c; b++; }  this(arrayOfChar); }  bF.wG0(str); } public final void com1() { if (!jh()) tP();  ak0 ak01 = this.F2; int i = this.mq, j = this.r50; String str = ak01.PH0.substring(i, j); if (!this.bx) { Hn0(); A50(true, false, 112); }  if (this.sM != null) { i = 1; } else { i = 0; }  if (i != 0) { char c = this.Fw; int k; char[] arrayOfChar; for (arrayOfChar = new char[k = str.length()], j = 0; j < k; ) { arrayOfChar[j] = c; j++; }  this(arrayOfChar); }  bF.wG0(str); } public final void nL0() { if (this.GE && !this.bx) { int k; if (jh()) { j = this.mq; k = this.r50; } else { j = k = this.lm; }  int i = switch(j), j = PW(k); String str = "\n".concat(this.F2.PH0.substring(i, j)); this.F2.Qs(j, 0, this); H20(length() + this.lm); A50(true, false, 0); }  } public final void co(int paramInt) { this.mK0 = paramInt; } public final void LM(throws paramthrows) {} public final void ED0(throws paramthrows) {} public final void Xw(nY paramnY) { super.Xw(paramnY); this.tJ = q80.w2("cursor"); this.em0 = q80.w2("selection"); this.Fa = q80.Km(100, "autocompletion-height"); this.rE = q80.Km(5, "columns"); q80 q80; char c = (char)(q80 = (q80)paramnY).Km(42, "passwordChar"); VZ vZ; if ((vZ = this.sM) != null && vZ.Uk != c) { boolean bool; ak0 ak01; this.sM = new VZ(this.F2, c); MF.u10(); G1 g1 = this.cj; if ((vZ = this.sM) == null) ak01 = this.F2;  g1.HC(ak01); this.cj.getClass(); if (this.cj.J50() > this.cj.xY) { bool = true; } else { bool = false; }  this.h60 = bool; gj(false); }  }
/* 13 */   public final void d40() { int i; S20(this.cj); if (this.cj.J50() > this.cj.xY) { i = 1; } else { i = 0; }  this.h60 = i; if (this.Km != null) { i = yR(); throws throws1; int m; if ((throws1 = this.Bo0) != null && i + this.Fa > throws1.mD() && (m = this.er0 - this.Fa) >= throws1.e3()) i = m;  this.Km.ME(this.Kd, i); i = this.xY;
/* 14 */       this.Km.Tm(i, this.Fa); }
/*    */     
/* 16 */     int j = this.Kd;
/* 17 */     int k = this.xY; jo0 jo01; JG0 jG0;
/* 18 */     if ((jo01 = this.Sm) != null && (jG0 = jo01.fr0) != null)
/*    */     
/*    */     { 
/* 21 */       int m = Math.max(k, JG0.Fr(jo01.AW(), this.Sm.J50(), this.Sm.fu)); k = jG0.m40(); if (j + m > k) j = k - Math.min(m, jG0.qF());  this.Sm.Tm(m, this.Sm.tj0()); this.Sm
/* 22 */         .ME(j, yR()); }  } public final void oi() { if (this.Km != null) { int k = yR(); throws throws1; int m; if ((throws1 = this.Bo0) != null && k + this.Fa > throws1.mD() && (m = this.er0 - this.Fa) >= throws1.e3()) k = m;  this.Km.ME(this.Kd, k); k = this.xY; this.Km.Tm(k, this.Fa); }  int i = this.Kd; int j = this.xY; jo0 jo01; JG0 jG0; if ((jo01 = this.Sm) != null && (jG0 = jo01.fr0) != null) { int k = Math.max(j, JG0.Fr(jo01.AW(), this.Sm.J50(), this.Sm.fu)); j = jG0.m40(); if (i + k > j) i = j - Math.min(k, jG0.qF());  this.Sm.Tm(k, this.Sm.tj0()); this.Sm.ME(i, yR()); }  } public final int AW() { byte b; int i = super.AW(); pe pe; if (this.rE > 0 && (pe = this.cj.Cq) != null) { b = ((t90)pe).computeTextWidth("X") * this.rE; } else { b = 0; }  return Math.max(i, Ho() + b); } public final int HY() { int j, i = super.HY(); pe pe; if ((pe = this.cj.Cq) != null) { j = ((t90)pe).getLineHeight(); } else { j = 0; }  if (this.GE) j *= this.S;  return Math.max(i, Et() + j); } public final int R80() { boolean bool; pe pe; if (this.rE > 0 && (pe = this.cj.Cq) != null) { bool = ((t90)pe).computeTextWidth("X") * this.rE; } else { bool = false; }  return bool; } public final int tJ0() { int i; pe pe; if ((pe = this.cj.Cq) != null) { i = ((t90)pe).getLineHeight(); } else { i = 0; }  if (this.GE) i *= this.S;  return i; } public final Object Gq() { Object object; if ((object = this.DJ) != null) return object;  if ((object = this.z4) == null) { boolean bool; if (this.sM != null) { bool = true; } else { bool = false; }  if (!bool && this.h60 && !p3()) object = this.F2.PH0.toString();  }  return object; } public final void Aw0(CF0 paramCF0) { if (paramCF0 == null) { paramCF0 = null; o3 o31; if ((o31 = this.Km) != null) { throws throws1; if (o31 != null && (throws1 = o31.Bo0) != null) throws1.Ek(o31);  this.Km = (o3)paramCF0; }  } else { o3 o32; this(this); (new o3()).o70 = paramCF0; o3 o31; if ((o31 = this.Km) != o32) { throws throws1; if (o31 != null && (throws1 = o31.Bo0) != null) throws1.Ek(o31);  this.Km = o32; }  }  } public final boolean i2(oa0 paramoa0) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getfield com8 : I
/*    */     //   4: bipush #9
/*    */     //   6: iand
/*    */     //   7: ifeq -> 15
/*    */     //   10: iconst_1
/*    */     //   11: istore_2
/*    */     //   12: goto -> 17
/*    */     //   15: iconst_0
/*    */     //   16: istore_2
/*    */     //   17: aload_1
/*    */     //   18: getfield cz0 : I
/*    */     //   21: dup
/*    */     //   22: istore_3
/*    */     //   23: invokestatic Pg : (I)Z
/*    */     //   26: ifeq -> 71
/*    */     //   29: iload_3
/*    */     //   30: bipush #7
/*    */     //   32: if_icmpeq -> 58
/*    */     //   35: aload_0
/*    */     //   36: aload_1
/*    */     //   37: dup
/*    */     //   38: getfield aK : I
/*    */     //   41: istore_3
/*    */     //   42: getfield gk0 : I
/*    */     //   45: iload_3
/*    */     //   46: swap
/*    */     //   47: invokevirtual mu0 : (II)Z
/*    */     //   50: ifeq -> 58
/*    */     //   53: iconst_1
/*    */     //   54: istore_3
/*    */     //   55: goto -> 60
/*    */     //   58: iconst_0
/*    */     //   59: istore_3
/*    */     //   60: aload_0
/*    */     //   61: getfield O : Lf/Sa0;
/*    */     //   64: getstatic f/of.sB : Lf/Ll;
/*    */     //   67: iload_3
/*    */     //   68: invokevirtual gf0 : (Lf/Ll;Z)V
/*    */     //   71: aload_1
/*    */     //   72: getfield Ua : Z
/*    */     //   75: ifeq -> 119
/*    */     //   78: aload_1
/*    */     //   79: getfield cz0 : I
/*    */     //   82: bipush #6
/*    */     //   84: if_icmpne -> 117
/*    */     //   87: aload_1
/*    */     //   88: getfield com8 : I
/*    */     //   91: bipush #64
/*    */     //   93: iand
/*    */     //   94: ifeq -> 117
/*    */     //   97: aload_0
/*    */     //   98: dup
/*    */     //   99: aload_1
/*    */     //   100: dup
/*    */     //   101: getfield aK : I
/*    */     //   104: istore_0
/*    */     //   105: getfield gk0 : I
/*    */     //   108: iload_0
/*    */     //   109: swap
/*    */     //   110: invokevirtual dw : (II)I
/*    */     //   113: iconst_1
/*    */     //   114: invokevirtual Bk0 : (IZ)V
/*    */     //   117: iconst_1
/*    */     //   118: ireturn
/*    */     //   119: aload_0
/*    */     //   120: aload_1
/*    */     //   121: invokespecial i2 : (Lf/oa0;)Z
/*    */     //   124: ifeq -> 129
/*    */     //   127: iconst_1
/*    */     //   128: ireturn
/*    */     //   129: aload_0
/*    */     //   130: getfield Km : Lf/o3;
/*    */     //   133: dup
/*    */     //   134: astore_3
/*    */     //   135: ifnull -> 148
/*    */     //   138: aload_3
/*    */     //   139: aload_1
/*    */     //   140: invokevirtual i2 : (Lf/oa0;)Z
/*    */     //   143: ifeq -> 148
/*    */     //   146: iconst_1
/*    */     //   147: ireturn
/*    */     //   148: aload_1
/*    */     //   149: getfield cz0 : I
/*    */     //   152: invokestatic yE : (I)I
/*    */     //   155: tableswitch default -> 200, 2 -> 1555, 3 -> 1356, 4 -> 1186, 5 -> 200, 6 -> 200, 7 -> 1184, 8 -> 283, 9 -> 203
/*    */     //   200: goto -> 1612
/*    */     //   203: aload_1
/*    */     //   204: getfield GG0 : I
/*    */     //   207: invokestatic Nk : (I)I
/*    */     //   210: dup
/*    */     //   211: istore_2
/*    */     //   212: iconst_3
/*    */     //   213: if_icmpeq -> 281
/*    */     //   216: iload_2
/*    */     //   217: bipush #123
/*    */     //   219: if_icmpeq -> 281
/*    */     //   222: iload_2
/*    */     //   223: bipush #21
/*    */     //   225: if_icmpeq -> 281
/*    */     //   228: iload_2
/*    */     //   229: bipush #22
/*    */     //   231: if_icmpeq -> 281
/*    */     //   234: iload_2
/*    */     //   235: bipush #66
/*    */     //   237: if_icmpeq -> 281
/*    */     //   240: iload_2
/*    */     //   241: bipush #67
/*    */     //   243: if_icmpeq -> 281
/*    */     //   246: iload_2
/*    */     //   247: bipush #111
/*    */     //   249: if_icmpeq -> 281
/*    */     //   252: iload_2
/*    */     //   253: bipush #112
/*    */     //   255: if_icmpeq -> 281
/*    */     //   258: aload_1
/*    */     //   259: invokevirtual QD : ()Z
/*    */     //   262: ifne -> 279
/*    */     //   265: aload_0
/*    */     //   266: getfield oR : Z
/*    */     //   269: ifeq -> 275
/*    */     //   272: goto -> 279
/*    */     //   275: iconst_0
/*    */     //   276: goto -> 280
/*    */     //   279: iconst_1
/*    */     //   280: ireturn
/*    */     //   281: iconst_1
/*    */     //   282: ireturn
/*    */     //   283: aload_1
/*    */     //   284: getfield GG0 : I
/*    */     //   287: invokestatic Nk : (I)I
/*    */     //   290: dup
/*    */     //   291: istore_3
/*    */     //   292: iconst_3
/*    */     //   293: if_icmpeq -> 1169
/*    */     //   296: iload_3
/*    */     //   297: bipush #61
/*    */     //   299: if_icmpeq -> 1167
/*    */     //   302: iload_3
/*    */     //   303: bipush #123
/*    */     //   305: if_icmpeq -> 1152
/*    */     //   308: iload_3
/*    */     //   309: bipush #66
/*    */     //   311: if_icmpeq -> 1046
/*    */     //   314: iload_3
/*    */     //   315: bipush #67
/*    */     //   317: if_icmpeq -> 928
/*    */     //   320: iload_3
/*    */     //   321: bipush #111
/*    */     //   323: if_icmpeq -> 887
/*    */     //   326: iload_3
/*    */     //   327: bipush #112
/*    */     //   329: if_icmpeq -> 814
/*    */     //   332: iload_3
/*    */     //   333: tableswitch default -> 364, 19 -> 584, 20 -> 411, 21 -> 396, 22 -> 381
/*    */     //   364: aload_1
/*    */     //   365: invokevirtual QD : ()Z
/*    */     //   368: ifeq -> 764
/*    */     //   371: aload_0
/*    */     //   372: aload_1
/*    */     //   373: getfield Z9 : C
/*    */     //   376: invokevirtual jg : (C)V
/*    */     //   379: iconst_1
/*    */     //   380: ireturn
/*    */     //   381: aload_0
/*    */     //   382: dup
/*    */     //   383: iconst_1
/*    */     //   384: istore_0
/*    */     //   385: getfield lm : I
/*    */     //   388: iload_0
/*    */     //   389: iadd
/*    */     //   390: iload_2
/*    */     //   391: invokevirtual Bk0 : (IZ)V
/*    */     //   394: iconst_1
/*    */     //   395: ireturn
/*    */     //   396: aload_0
/*    */     //   397: dup
/*    */     //   398: iconst_m1
/*    */     //   399: istore_0
/*    */     //   400: getfield lm : I
/*    */     //   403: iload_0
/*    */     //   404: iadd
/*    */     //   405: iload_2
/*    */     //   406: invokevirtual Bk0 : (IZ)V
/*    */     //   409: iconst_1
/*    */     //   410: ireturn
/*    */     //   411: aload_0
/*    */     //   412: getfield GE : Z
/*    */     //   415: dup
/*    */     //   416: istore_3
/*    */     //   417: ifeq -> 764
/*    */     //   420: iload_3
/*    */     //   421: ifeq -> 582
/*    */     //   424: iload_3
/*    */     //   425: aload_0
/*    */     //   426: getfield lm : I
/*    */     //   429: istore_1
/*    */     //   430: iconst_0
/*    */     //   431: istore_3
/*    */     //   432: ifeq -> 441
/*    */     //   435: aload_0
/*    */     //   436: iload_1
/*    */     //   437: invokevirtual switch : (I)I
/*    */     //   440: istore_3
/*    */     //   441: aload_0
/*    */     //   442: getfield cj : Lf/G1;
/*    */     //   445: dup
/*    */     //   446: astore #4
/*    */     //   448: getfield Cq : Lf/pe;
/*    */     //   451: dup
/*    */     //   452: astore #5
/*    */     //   454: ifnull -> 485
/*    */     //   457: iload_1
/*    */     //   458: iload_3
/*    */     //   459: if_icmple -> 485
/*    */     //   462: aload #5
/*    */     //   464: aload #4
/*    */     //   466: getfield wL : Ljava/lang/CharSequence;
/*    */     //   469: astore #4
/*    */     //   471: checkcast f/t90
/*    */     //   474: aload #4
/*    */     //   476: iload_3
/*    */     //   477: iload_1
/*    */     //   478: invokevirtual computeTextWidth : (Ljava/lang/CharSequence;II)I
/*    */     //   481: istore_1
/*    */     //   482: goto -> 487
/*    */     //   485: iconst_0
/*    */     //   486: istore_1
/*    */     //   487: aload_0
/*    */     //   488: dup
/*    */     //   489: dup2
/*    */     //   490: getfield lm : I
/*    */     //   493: invokevirtual PW : (I)I
/*    */     //   496: iconst_1
/*    */     //   497: iadd
/*    */     //   498: aload_0
/*    */     //   499: getfield F2 : Lf/ak0;
/*    */     //   502: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   505: invokevirtual length : ()I
/*    */     //   508: invokestatic min : (II)I
/*    */     //   511: dup
/*    */     //   512: istore_3
/*    */     //   513: invokevirtual PW : (I)I
/*    */     //   516: istore #4
/*    */     //   518: getfield cj : Lf/G1;
/*    */     //   521: getfield Cq : Lf/pe;
/*    */     //   524: dup
/*    */     //   525: astore #5
/*    */     //   527: ifnull -> 576
/*    */     //   530: aload_0
/*    */     //   531: getfield sM : Lf/VZ;
/*    */     //   534: dup
/*    */     //   535: astore #6
/*    */     //   537: ifnull -> 543
/*    */     //   540: goto -> 549
/*    */     //   543: aload_0
/*    */     //   544: getfield F2 : Lf/ak0;
/*    */     //   547: astore #6
/*    */     //   549: aload #5
/*    */     //   551: checkcast f/t90
/*    */     //   554: dup
/*    */     //   555: aload #6
/*    */     //   557: swap
/*    */     //   558: invokevirtual getSpaceWidth : ()I
/*    */     //   561: iconst_2
/*    */     //   562: idiv
/*    */     //   563: iload_1
/*    */     //   564: iadd
/*    */     //   565: istore_1
/*    */     //   566: iload_3
/*    */     //   567: iload #4
/*    */     //   569: iload_1
/*    */     //   570: invokevirtual computeVisibleGlpyhs : (Ljava/lang/CharSequence;III)I
/*    */     //   573: iload_3
/*    */     //   574: iadd
/*    */     //   575: istore_3
/*    */     //   576: aload_0
/*    */     //   577: iload_3
/*    */     //   578: iload_2
/*    */     //   579: invokevirtual Bk0 : (IZ)V
/*    */     //   582: iconst_1
/*    */     //   583: ireturn
/*    */     //   584: aload_0
/*    */     //   585: getfield GE : Z
/*    */     //   588: dup
/*    */     //   589: istore_3
/*    */     //   590: ifeq -> 764
/*    */     //   593: iload_3
/*    */     //   594: ifeq -> 762
/*    */     //   597: iload_3
/*    */     //   598: aload_0
/*    */     //   599: getfield lm : I
/*    */     //   602: istore_1
/*    */     //   603: iconst_0
/*    */     //   604: istore_3
/*    */     //   605: ifeq -> 614
/*    */     //   608: aload_0
/*    */     //   609: iload_1
/*    */     //   610: invokevirtual switch : (I)I
/*    */     //   613: istore_3
/*    */     //   614: aload_0
/*    */     //   615: getfield cj : Lf/G1;
/*    */     //   618: dup
/*    */     //   619: astore #4
/*    */     //   621: getfield Cq : Lf/pe;
/*    */     //   624: dup
/*    */     //   625: astore #5
/*    */     //   627: ifnull -> 658
/*    */     //   630: iload_1
/*    */     //   631: iload_3
/*    */     //   632: if_icmple -> 658
/*    */     //   635: aload #5
/*    */     //   637: aload #4
/*    */     //   639: getfield wL : Ljava/lang/CharSequence;
/*    */     //   642: astore #4
/*    */     //   644: checkcast f/t90
/*    */     //   647: aload #4
/*    */     //   649: iload_3
/*    */     //   650: iload_1
/*    */     //   651: invokevirtual computeTextWidth : (Ljava/lang/CharSequence;II)I
/*    */     //   654: istore_1
/*    */     //   655: goto -> 660
/*    */     //   658: iconst_0
/*    */     //   659: istore_1
/*    */     //   660: aload_0
/*    */     //   661: dup
/*    */     //   662: getfield lm : I
/*    */     //   665: invokevirtual switch : (I)I
/*    */     //   668: dup
/*    */     //   669: istore_3
/*    */     //   670: ifne -> 682
/*    */     //   673: aload_0
/*    */     //   674: iconst_0
/*    */     //   675: iload_2
/*    */     //   676: invokevirtual Bk0 : (IZ)V
/*    */     //   679: goto -> 762
/*    */     //   682: aload_0
/*    */     //   683: dup
/*    */     //   684: dup
/*    */     //   685: iload_3
/*    */     //   686: iconst_1
/*    */     //   687: isub
/*    */     //   688: invokevirtual switch : (I)I
/*    */     //   691: dup
/*    */     //   692: istore_3
/*    */     //   693: invokevirtual PW : (I)I
/*    */     //   696: istore #4
/*    */     //   698: getfield cj : Lf/G1;
/*    */     //   701: getfield Cq : Lf/pe;
/*    */     //   704: dup
/*    */     //   705: astore #5
/*    */     //   707: ifnull -> 756
/*    */     //   710: aload_0
/*    */     //   711: getfield sM : Lf/VZ;
/*    */     //   714: dup
/*    */     //   715: astore #6
/*    */     //   717: ifnull -> 723
/*    */     //   720: goto -> 729
/*    */     //   723: aload_0
/*    */     //   724: getfield F2 : Lf/ak0;
/*    */     //   727: astore #6
/*    */     //   729: aload #5
/*    */     //   731: checkcast f/t90
/*    */     //   734: dup
/*    */     //   735: aload #6
/*    */     //   737: swap
/*    */     //   738: invokevirtual getSpaceWidth : ()I
/*    */     //   741: iconst_2
/*    */     //   742: idiv
/*    */     //   743: iload_1
/*    */     //   744: iadd
/*    */     //   745: istore_1
/*    */     //   746: iload_3
/*    */     //   747: iload #4
/*    */     //   749: iload_1
/*    */     //   750: invokevirtual computeVisibleGlpyhs : (Ljava/lang/CharSequence;III)I
/*    */     //   753: iload_3
/*    */     //   754: iadd
/*    */     //   755: istore_3
/*    */     //   756: aload_0
/*    */     //   757: iload_3
/*    */     //   758: iload_2
/*    */     //   759: invokevirtual Bk0 : (IZ)V
/*    */     //   762: iconst_1
/*    */     //   763: ireturn
/*    */     //   764: aload_0
/*    */     //   765: getfield oR : Z
/*    */     //   768: ifeq -> 812
/*    */     //   771: aload_0
/*    */     //   772: aload_1
/*    */     //   773: getfield GG0 : I
/*    */     //   776: istore_0
/*    */     //   777: getfield kc : [Lf/a70;
/*    */     //   780: dup
/*    */     //   781: astore_1
/*    */     //   782: ifnull -> 810
/*    */     //   785: aload_1
/*    */     //   786: arraylength
/*    */     //   787: istore_2
/*    */     //   788: iconst_0
/*    */     //   789: istore_3
/*    */     //   790: iload_3
/*    */     //   791: iload_2
/*    */     //   792: if_icmpge -> 810
/*    */     //   795: aload_1
/*    */     //   796: iload_3
/*    */     //   797: aaload
/*    */     //   798: iload_0
/*    */     //   799: invokeinterface SX : (I)V
/*    */     //   804: iinc #3, 1
/*    */     //   807: goto -> 790
/*    */     //   810: iconst_1
/*    */     //   811: ireturn
/*    */     //   812: iconst_0
/*    */     //   813: ireturn
/*    */     //   814: aload_0
/*    */     //   815: getfield bx : Z
/*    */     //   818: ifne -> 885
/*    */     //   821: aload_0
/*    */     //   822: invokevirtual jh : ()Z
/*    */     //   825: ifeq -> 843
/*    */     //   828: aload_0
/*    */     //   829: dup
/*    */     //   830: invokevirtual Hn0 : ()V
/*    */     //   833: iconst_1
/*    */     //   834: iconst_0
/*    */     //   835: bipush #112
/*    */     //   837: invokevirtual A50 : (ZZI)V
/*    */     //   840: goto -> 885
/*    */     //   843: aload_0
/*    */     //   844: getfield lm : I
/*    */     //   847: aload_0
/*    */     //   848: getfield F2 : Lf/ak0;
/*    */     //   851: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   854: invokevirtual length : ()I
/*    */     //   857: if_icmpge -> 885
/*    */     //   860: aload_0
/*    */     //   861: getfield F2 : Lf/ak0;
/*    */     //   864: aload_0
/*    */     //   865: getfield lm : I
/*    */     //   868: iconst_1
/*    */     //   869: ldc ''
/*    */     //   871: invokevirtual Qs : (IILjava/lang/String;)I
/*    */     //   874: iflt -> 885
/*    */     //   877: aload_0
/*    */     //   878: iconst_1
/*    */     //   879: iconst_0
/*    */     //   880: bipush #112
/*    */     //   882: invokevirtual A50 : (ZZI)V
/*    */     //   885: iconst_1
/*    */     //   886: ireturn
/*    */     //   887: aload_0
/*    */     //   888: aload_1
/*    */     //   889: getfield GG0 : I
/*    */     //   892: istore_0
/*    */     //   893: getfield kc : [Lf/a70;
/*    */     //   896: dup
/*    */     //   897: astore_1
/*    */     //   898: ifnull -> 926
/*    */     //   901: aload_1
/*    */     //   902: arraylength
/*    */     //   903: istore_2
/*    */     //   904: iconst_0
/*    */     //   905: istore_3
/*    */     //   906: iload_3
/*    */     //   907: iload_2
/*    */     //   908: if_icmpge -> 926
/*    */     //   911: aload_1
/*    */     //   912: iload_3
/*    */     //   913: aaload
/*    */     //   914: iload_0
/*    */     //   915: invokeinterface SX : (I)V
/*    */     //   920: iinc #3, 1
/*    */     //   923: goto -> 906
/*    */     //   926: iconst_1
/*    */     //   927: ireturn
/*    */     //   928: aload_0
/*    */     //   929: getfield bx : Z
/*    */     //   932: ifne -> 1044
/*    */     //   935: aload_0
/*    */     //   936: invokevirtual jh : ()Z
/*    */     //   939: ifeq -> 957
/*    */     //   942: aload_0
/*    */     //   943: dup
/*    */     //   944: invokevirtual Hn0 : ()V
/*    */     //   947: iconst_1
/*    */     //   948: iconst_0
/*    */     //   949: bipush #112
/*    */     //   951: invokevirtual A50 : (ZZI)V
/*    */     //   954: goto -> 1044
/*    */     //   957: aload_0
/*    */     //   958: getfield lm : I
/*    */     //   961: dup
/*    */     //   962: istore_1
/*    */     //   963: ifle -> 1044
/*    */     //   966: aload_0
/*    */     //   967: dup
/*    */     //   968: iload_1
/*    */     //   969: iconst_1
/*    */     //   970: isub
/*    */     //   971: putfield lm : I
/*    */     //   974: getfield bx : Z
/*    */     //   977: ifne -> 1044
/*    */     //   980: aload_0
/*    */     //   981: invokevirtual jh : ()Z
/*    */     //   984: ifeq -> 1002
/*    */     //   987: aload_0
/*    */     //   988: dup
/*    */     //   989: invokevirtual Hn0 : ()V
/*    */     //   992: iconst_1
/*    */     //   993: iconst_0
/*    */     //   994: bipush #112
/*    */     //   996: invokevirtual A50 : (ZZI)V
/*    */     //   999: goto -> 1044
/*    */     //   1002: aload_0
/*    */     //   1003: getfield lm : I
/*    */     //   1006: aload_0
/*    */     //   1007: getfield F2 : Lf/ak0;
/*    */     //   1010: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   1013: invokevirtual length : ()I
/*    */     //   1016: if_icmpge -> 1044
/*    */     //   1019: aload_0
/*    */     //   1020: getfield F2 : Lf/ak0;
/*    */     //   1023: aload_0
/*    */     //   1024: getfield lm : I
/*    */     //   1027: iconst_1
/*    */     //   1028: ldc ''
/*    */     //   1030: invokevirtual Qs : (IILjava/lang/String;)I
/*    */     //   1033: iflt -> 1044
/*    */     //   1036: aload_0
/*    */     //   1037: iconst_1
/*    */     //   1038: iconst_0
/*    */     //   1039: bipush #112
/*    */     //   1041: invokevirtual A50 : (ZZI)V
/*    */     //   1044: iconst_1
/*    */     //   1045: ireturn
/*    */     //   1046: aload_0
/*    */     //   1047: getfield GE : Z
/*    */     //   1050: ifne -> 1150
/*    */     //   1053: aload_0
/*    */     //   1054: getfield LPt5 : Z
/*    */     //   1057: ifeq -> 1113
/*    */     //   1060: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   1063: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1066: pop
/*    */     //   1067: getstatic f/Dp0.Ro0 : Lf/Dp0;
/*    */     //   1070: dup
/*    */     //   1071: astore_1
/*    */     //   1072: getstatic f/Dp0.uM : Lf/Dp0;
/*    */     //   1075: if_acmpeq -> 1092
/*    */     //   1078: aload_1
/*    */     //   1079: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   1082: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1085: pop
/*    */     //   1086: getstatic f/Dp0.QG : Lf/Dp0;
/*    */     //   1089: if_acmpne -> 1113
/*    */     //   1092: aload_0
/*    */     //   1093: dup
/*    */     //   1094: getfield Bo0 : Lf/throws;
/*    */     //   1097: aconst_null
/*    */     //   1098: invokevirtual gA0 : (Lf/JG0;)Z
/*    */     //   1101: pop
/*    */     //   1102: getfield Bo0 : Lf/throws;
/*    */     //   1105: aload_0
/*    */     //   1106: getfield fr0 : Lf/JG0;
/*    */     //   1109: invokevirtual gA0 : (Lf/JG0;)Z
/*    */     //   1112: pop
/*    */     //   1113: aload_0
/*    */     //   1114: bipush #66
/*    */     //   1116: istore_0
/*    */     //   1117: getfield kc : [Lf/a70;
/*    */     //   1120: dup
/*    */     //   1121: astore_1
/*    */     //   1122: ifnull -> 1150
/*    */     //   1125: aload_1
/*    */     //   1126: arraylength
/*    */     //   1127: istore_2
/*    */     //   1128: iconst_0
/*    */     //   1129: istore_3
/*    */     //   1130: iload_3
/*    */     //   1131: iload_2
/*    */     //   1132: if_icmpge -> 1150
/*    */     //   1135: aload_1
/*    */     //   1136: iload_3
/*    */     //   1137: aaload
/*    */     //   1138: iload_0
/*    */     //   1139: invokeinterface SX : (I)V
/*    */     //   1144: iinc #3, 1
/*    */     //   1147: goto -> 1130
/*    */     //   1150: iconst_1
/*    */     //   1151: ireturn
/*    */     //   1152: aload_0
/*    */     //   1153: dup
/*    */     //   1154: dup
/*    */     //   1155: getfield lm : I
/*    */     //   1158: invokevirtual PW : (I)I
/*    */     //   1161: iload_2
/*    */     //   1162: invokevirtual Bk0 : (IZ)V
/*    */     //   1165: iconst_1
/*    */     //   1166: ireturn
/*    */     //   1167: iconst_0
/*    */     //   1168: ireturn
/*    */     //   1169: aload_0
/*    */     //   1170: dup
/*    */     //   1171: dup
/*    */     //   1172: getfield lm : I
/*    */     //   1175: invokevirtual switch : (I)I
/*    */     //   1178: iload_2
/*    */     //   1179: invokevirtual Bk0 : (IZ)V
/*    */     //   1182: iconst_1
/*    */     //   1183: ireturn
/*    */     //   1184: iconst_0
/*    */     //   1185: ireturn
/*    */     //   1186: aload_1
/*    */     //   1187: getfield uC : I
/*    */     //   1190: dup
/*    */     //   1191: istore_2
/*    */     //   1192: iconst_2
/*    */     //   1193: if_icmpne -> 1345
/*    */     //   1196: aload_0
/*    */     //   1197: dup
/*    */     //   1198: dup
/*    */     //   1199: aload_1
/*    */     //   1200: dup
/*    */     //   1201: getfield aK : I
/*    */     //   1204: istore_1
/*    */     //   1205: getfield gk0 : I
/*    */     //   1208: iload_1
/*    */     //   1209: swap
/*    */     //   1210: invokevirtual dw : (II)I
/*    */     //   1213: dup
/*    */     //   1214: istore_1
/*    */     //   1215: putfield mq : I
/*    */     //   1218: iload_1
/*    */     //   1219: putfield r50 : I
/*    */     //   1222: aload_0
/*    */     //   1223: getfield mq : I
/*    */     //   1226: dup
/*    */     //   1227: istore_1
/*    */     //   1228: ifle -> 1266
/*    */     //   1231: iload_1
/*    */     //   1232: aload_0
/*    */     //   1233: getfield F2 : Lf/ak0;
/*    */     //   1236: astore_1
/*    */     //   1237: iconst_1
/*    */     //   1238: isub
/*    */     //   1239: aload_1
/*    */     //   1240: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   1243: swap
/*    */     //   1244: invokevirtual charAt : (I)C
/*    */     //   1247: invokestatic isWhitespace : (C)Z
/*    */     //   1250: ifne -> 1266
/*    */     //   1253: aload_0
/*    */     //   1254: dup
/*    */     //   1255: getfield mq : I
/*    */     //   1258: iconst_1
/*    */     //   1259: isub
/*    */     //   1260: putfield mq : I
/*    */     //   1263: goto -> 1222
/*    */     //   1266: aload_0
/*    */     //   1267: getfield r50 : I
/*    */     //   1270: aload_0
/*    */     //   1271: getfield F2 : Lf/ak0;
/*    */     //   1274: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   1277: invokevirtual length : ()I
/*    */     //   1280: if_icmpge -> 1319
/*    */     //   1283: aload_0
/*    */     //   1284: dup
/*    */     //   1285: getfield F2 : Lf/ak0;
/*    */     //   1288: astore_1
/*    */     //   1289: getfield r50 : I
/*    */     //   1292: aload_1
/*    */     //   1293: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   1296: swap
/*    */     //   1297: invokevirtual charAt : (I)C
/*    */     //   1300: invokestatic isWhitespace : (C)Z
/*    */     //   1303: ifne -> 1319
/*    */     //   1306: aload_0
/*    */     //   1307: dup
/*    */     //   1308: getfield r50 : I
/*    */     //   1311: iconst_1
/*    */     //   1312: iadd
/*    */     //   1313: putfield r50 : I
/*    */     //   1316: goto -> 1266
/*    */     //   1319: aload_0
/*    */     //   1320: dup
/*    */     //   1321: dup2
/*    */     //   1322: dup2
/*    */     //   1323: getfield mq : I
/*    */     //   1326: putfield lm : I
/*    */     //   1329: iconst_0
/*    */     //   1330: invokevirtual gj : (Z)V
/*    */     //   1333: getfield r50 : I
/*    */     //   1336: putfield lm : I
/*    */     //   1339: iconst_0
/*    */     //   1340: invokevirtual gj : (Z)V
/*    */     //   1343: iconst_1
/*    */     //   1344: ireturn
/*    */     //   1345: iload_2
/*    */     //   1346: iconst_3
/*    */     //   1347: if_icmpne -> 1612
/*    */     //   1350: aload_0
/*    */     //   1351: invokevirtual tP : ()V
/*    */     //   1354: iconst_1
/*    */     //   1355: ireturn
/*    */     //   1356: aload_1
/*    */     //   1357: getfield vl : I
/*    */     //   1360: iconst_1
/*    */     //   1361: if_icmpne -> 1612
/*    */     //   1364: aload_0
/*    */     //   1365: aload_1
/*    */     //   1366: dup
/*    */     //   1367: getfield aK : I
/*    */     //   1370: istore_2
/*    */     //   1371: getfield gk0 : I
/*    */     //   1374: iload_2
/*    */     //   1375: swap
/*    */     //   1376: invokevirtual mu0 : (II)Z
/*    */     //   1379: ifeq -> 1612
/*    */     //   1382: aload_0
/*    */     //   1383: getfield mi : Lf/hu;
/*    */     //   1386: ifnonnull -> 1528
/*    */     //   1389: aload_0
/*    */     //   1390: new f/hu
/*    */     //   1393: dup
/*    */     //   1394: astore_1
/*    */     //   1395: invokespecial <init> : ()V
/*    */     //   1398: getfield bx : Z
/*    */     //   1401: ifne -> 1422
/*    */     //   1404: aload_1
/*    */     //   1405: new f/mG0
/*    */     //   1408: dup
/*    */     //   1409: astore_2
/*    */     //   1410: aload_0
/*    */     //   1411: ldc 'cut'
/*    */     //   1413: invokespecial <init> : (Lf/JG0;Ljava/lang/String;)V
/*    */     //   1416: ldc 'cut'
/*    */     //   1418: aload_2
/*    */     //   1419: invokevirtual mD : (Ljava/lang/String;Ljava/lang/Runnable;)V
/*    */     //   1422: aload_0
/*    */     //   1423: aload_1
/*    */     //   1424: new f/mG0
/*    */     //   1427: dup
/*    */     //   1428: astore_2
/*    */     //   1429: aload_0
/*    */     //   1430: ldc_w 'copy'
/*    */     //   1433: invokespecial <init> : (Lf/JG0;Ljava/lang/String;)V
/*    */     //   1436: ldc_w 'copy'
/*    */     //   1439: aload_2
/*    */     //   1440: invokevirtual mD : (Ljava/lang/String;Ljava/lang/Runnable;)V
/*    */     //   1443: getfield bx : Z
/*    */     //   1446: ifne -> 1486
/*    */     //   1449: aload_1
/*    */     //   1450: dup
/*    */     //   1451: new f/mG0
/*    */     //   1454: dup
/*    */     //   1455: astore_2
/*    */     //   1456: aload_0
/*    */     //   1457: ldc_w 'paste'
/*    */     //   1460: invokespecial <init> : (Lf/JG0;Ljava/lang/String;)V
/*    */     //   1463: ldc_w 'paste'
/*    */     //   1466: aload_2
/*    */     //   1467: invokevirtual mD : (Ljava/lang/String;Ljava/lang/Runnable;)V
/*    */     //   1470: new f/Hr
/*    */     //   1473: dup
/*    */     //   1474: astore_2
/*    */     //   1475: aload_0
/*    */     //   1476: invokespecial <init> : (Lf/of;)V
/*    */     //   1479: ldc_w 'clear'
/*    */     //   1482: aload_2
/*    */     //   1483: invokevirtual mD : (Ljava/lang/String;Ljava/lang/Runnable;)V
/*    */     //   1486: aload_0
/*    */     //   1487: aload_1
/*    */     //   1488: dup
/*    */     //   1489: dup
/*    */     //   1490: new f/Pu0
/*    */     //   1493: dup
/*    */     //   1494: astore_1
/*    */     //   1495: invokespecial <init> : ()V
/*    */     //   1498: getfield aV : Ljava/util/ArrayList;
/*    */     //   1501: aload_1
/*    */     //   1502: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   1505: pop
/*    */     //   1506: new f/mG0
/*    */     //   1509: dup
/*    */     //   1510: astore_1
/*    */     //   1511: aload_0
/*    */     //   1512: ldc_w 'selectAll'
/*    */     //   1515: invokespecial <init> : (Lf/JG0;Ljava/lang/String;)V
/*    */     //   1518: ldc_w 'select all'
/*    */     //   1521: aload_1
/*    */     //   1522: invokevirtual mD : (Ljava/lang/String;Ljava/lang/Runnable;)V
/*    */     //   1525: putfield mi : Lf/hu;
/*    */     //   1528: aload_0
/*    */     //   1529: getfield mi : Lf/hu;
/*    */     //   1532: dup
/*    */     //   1533: astore_1
/*    */     //   1534: ifnull -> 1553
/*    */     //   1537: new f/io
/*    */     //   1540: dup
/*    */     //   1541: aload_0
/*    */     //   1542: invokespecial <init> : (Lf/JG0;)V
/*    */     //   1545: iconst_0
/*    */     //   1546: aload_1
/*    */     //   1547: aload_0
/*    */     //   1548: iconst_1
/*    */     //   1549: invokevirtual qp : (ILf/hu;Lf/JG0;Z)Lf/JG0;
/*    */     //   1552: pop
/*    */     //   1553: iconst_1
/*    */     //   1554: ireturn
/*    */     //   1555: aload_1
/*    */     //   1556: getfield vl : I
/*    */     //   1559: ifne -> 1612
/*    */     //   1562: aload_0
/*    */     //   1563: aload_1
/*    */     //   1564: dup
/*    */     //   1565: getfield aK : I
/*    */     //   1568: istore_3
/*    */     //   1569: getfield gk0 : I
/*    */     //   1572: iload_3
/*    */     //   1573: swap
/*    */     //   1574: invokevirtual mu0 : (II)Z
/*    */     //   1577: ifeq -> 1612
/*    */     //   1580: aload_0
/*    */     //   1581: dup
/*    */     //   1582: dup2
/*    */     //   1583: aload_1
/*    */     //   1584: dup
/*    */     //   1585: getfield aK : I
/*    */     //   1588: istore_0
/*    */     //   1589: getfield gk0 : I
/*    */     //   1592: iload_0
/*    */     //   1593: swap
/*    */     //   1594: invokevirtual dw : (II)I
/*    */     //   1597: iload_2
/*    */     //   1598: invokevirtual Bk0 : (IZ)V
/*    */     //   1601: getfield cj : Lf/G1;
/*    */     //   1604: getfield bV : I
/*    */     //   1607: putfield ju : I
/*    */     //   1610: iconst_1
/*    */     //   1611: ireturn
/*    */     //   1612: aload_1
/*    */     //   1613: getfield cz0 : I
/*    */     //   1616: invokestatic Pg : (I)Z
/*    */     //   1619: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 18
/*    */     //   #3	-> 38
/*    */     //   #4	-> 42
/*    */     //   #5	-> 47
/*    */     //   #6	-> 61
/*    */     //   #7	-> 64
/*    */     //   #8	-> 72
/*    */     //   #9	-> 79
/*    */     //   #10	-> 88
/*    */     //   #11	-> 101
/*    */     //   #12	-> 105
/*    */     //   #13	-> 110
/*    */     //   #14	-> 149
/*    */     //   #15	-> 152
/*    */     //   #16	-> 204
/*    */     //   #17	-> 207
/*    */     //   #18	-> 284
/*    */     //   #19	-> 287
/*    */     //   #20	-> 373
/*    */     //   #21	-> 376
/*    */     //   #22	-> 385
/*    */     //   #23	-> 400
/*    */     //   #24	-> 412
/*    */     //   #25	-> 426
/*    */     //   #26	-> 437
/*    */     //   #27	-> 448
/*    */     //   #28	-> 466
/*    */     //   #29	-> 490
/*    */     //   #30	-> 502
/*    */     //   #31	-> 505
/*    */     //   #32	-> 508
/*    */     //   #33	-> 513
/*    */     //   #34	-> 518
/*    */     //   #35	-> 521
/*    */     //   #36	-> 531
/*    */     //   #37	-> 579
/*    */     //   #38	-> 585
/*    */     //   #39	-> 599
/*    */     //   #40	-> 610
/*    */     //   #41	-> 621
/*    */     //   #42	-> 639
/*    */     //   #43	-> 662
/*    */     //   #44	-> 693
/*    */     //   #45	-> 698
/*    */     //   #46	-> 701
/*    */     //   #47	-> 711
/*    */     //   #48	-> 759
/*    */     //   #49	-> 765
/*    */     //   #50	-> 773
/*    */     //   #51	-> 777
/*    */     //   #52	-> 815
/*    */     //   #53	-> 851
/*    */     //   #54	-> 854
/*    */     //   #55	-> 861
/*    */     //   #56	-> 889
/*    */     //   #57	-> 893
/*    */     //   #58	-> 929
/*    */     //   #59	-> 974
/*    */     //   #60	-> 1010
/*    */     //   #61	-> 1013
/*    */     //   #62	-> 1020
/*    */     //   #63	-> 1047
/*    */     //   #64	-> 1067
/*    */     //   #65	-> 1072
/*    */     //   #66	-> 1094
/*    */     //   #67	-> 1098
/*    */     //   #68	-> 1102
/*    */     //   #69	-> 1106
/*    */     //   #70	-> 1109
/*    */     //   #71	-> 1117
/*    */     //   #72	-> 1155
/*    */     //   #73	-> 1187
/*    */     //   #74	-> 1201
/*    */     //   #75	-> 1205
/*    */     //   #76	-> 1210
/*    */     //   #77	-> 1215
/*    */     //   #78	-> 1240
/*    */     //   #79	-> 1244
/*    */     //   #80	-> 1247
/*    */     //   #81	-> 1274
/*    */     //   #82	-> 1277
/*    */     //   #83	-> 1285
/*    */     //   #84	-> 1293
/*    */     //   #85	-> 1297
/*    */     //   #86	-> 1300
/*    */     //   #87	-> 1323
/*    */     //   #88	-> 1357
/*    */     //   #89	-> 1367
/*    */     //   #90	-> 1371
/*    */     //   #91	-> 1376
/*    */     //   #92	-> 1383
/*    */     //   #93	-> 1390
/*    */     //   #94	-> 1490
/*    */     //   #95	-> 1498
/*    */     //   #96	-> 1506
/*    */     //   #97	-> 1525
/*    */     //   #98	-> 1537
/*    */     //   #99	-> 1549
/*    */     //   #100	-> 1556
/*    */     //   #101	-> 1565
/*    */     //   #102	-> 1569
/*    */     //   #103	-> 1574
/*    */     //   #104	-> 1585
/*    */     //   #105	-> 1589
/*    */     //   #106	-> 1594
/* 22 */     //   #107	-> 1613 } public final void Bk0(int paramInt, boolean paramBoolean) { paramInt = Math.max(0, Math.min(this.F2.PH0.length(), paramInt)); if (!paramBoolean) { this.mq = paramInt; this.r50 = paramInt; }  if (this.lm != paramInt) { if (paramBoolean) { if (jh()) { if (this.lm == this.mq) { this.mq = paramInt; } else { this.r50 = paramInt; }  } else { this.mq = this.lm; this.r50 = paramInt; }  int i; int j; if ((i = this.mq) > (j = this.r50)) { this.mq = j; this.r50 = i; }  }  if (this.lm != paramInt) this.O.Ym0(kA);  this.lm = paramInt; gj(false); o3 o31; if ((o31 = this.Km) != null) VG();  }  } public final void R60(throws paramthrows) { if (this.tJ != null) { int i; if (p3() || this.q50) { i = 1; } else { i = 0; }  if (i) { boolean bool; i = this.cj.H10; int j = this.lm, k = 0; if (this.GE) k = switch(j);  G1 g1; pe pe1; if ((pe1 = (g1 = this.cj).Cq) != null && j > k) { CharSequence charSequence = g1.wL; j = ((t90)pe1).computeTextWidth(charSequence, k, j); } else { j = 0; }  i = j + i; j = this.cj.J4(); j = ((t90)this.cj.Cq).getBaseLine() / 2 + j - 1; k = this.lm; if (this.GE) { byte b1; pe pe; if ((pe = this.cj.Cq) != null) { b1 = ((t90)pe).getLineHeight(); } else { b1 = 0; }  ak0 ak01; byte b2; for (ak01 = this.F2, bool = false, b2 = 0; b2 < k; ) { if (ak01.PH0.charAt(b2) == '\n') bool++;  b2++; }  k = bool * b1; } else { k = 0; }  j += k; Sa0 sa0 = this.O; mX mX1; int m = (mX1 = this.tJ).Vb(); pe pe2; if ((pe2 = this.cj.Cq) != null)
/* 23 */         { bool = ((t90)pe2).getLineHeight(); } else { bool = false; }  mX1
/* 24 */           .W8(sa0, i, j, m, bool); }  }  super.R60(paramthrows); } public final void H20(int paramInt) { if (paramInt >= 0 && paramInt <= this.F2.PH0.length()) { Bk0(paramInt, false); return; }  throw new IllegalArgumentException("pos"); } public final void tP() { this.mq = 0; this.r50 = this.F2.PH0.length(); } public final void gj(boolean paramBoolean) { int i; if ((i = this.cj.xY - 5) <= 0) { this.bh0 = true; this.Td = paramBoolean; return; }  this.bh0 = false; int j = this.lm, k = 0; if (this.GE) k = switch(j);  G1 g1; pe pe; if ((pe = (g1 = this.cj).Cq) != null && j > k) { CharSequence charSequence = g1.wL; j = ((t90)pe).computeTextWidth(charSequence, k, j); } else { j = 0; }  if (j < (k = this.ju) + 5) { this.ju = Math.max(0, j - 5); } else if (paramBoolean || j - k > i) { this.ju = Math.max(0, j - i); }  rS rS; if (this.GE && (rS = rS.ck(this)) != null) { byte b1; pe pe1; if ((pe1 = this.cj.Cq) != null) { b1 = ((t90)pe1).getLineHeight(); } else { b1 = 0; }  int m = this.lm; ak0 ak01; byte b2; for (ak01 = this.F2, k = 0, b2 = 0; b2 < m; ) { if (ak01.PH0.charAt(b2) == '\n') k++;  b2++; }  m = k * b1; rS.uW(); int n = b1 / 2; rS.Uo0(m, b1, n); }  } public final void x30(IntPredicate paramIntPredicate) { this.oo = paramIntPredicate; } public final void Lpt5(String paramString) { this.oo = Pattern.compile(paramString)::b6; } public void jg(char paramChar) { IntPredicate intPredicate; if (!this.bx && (!Character.isISOControl(paramChar) || (this.GE && paramChar == '\n')) && ((intPredicate = this.oo) == null || intPredicate.test(paramChar))) { boolean bool = false; if (jh()) { Hn0(); bool = true; }  if (this.F2.PH0.length() < this.mK0) { String str; ak0 ak01 = this.F2; int j = ak01.PH0.length(); int i; if ((i = this.lm) >= 0 && i <= j) { if (j - i >= 0) { ak01.PH0.insert(i, paramChar); this.lm++; bool = true; int k = this.F2.PH0.length(); str = Normalizer.normalize(this.F2, Normalizer.Form.NFKC); this.F2.Qs(0, k, str); if (KQ(paramChar) && this.lm >= this.F2.PH0.length()) this.lm = Math.max(0, this.F2.PH0.length());  } else { throw new StringIndexOutOfBoundsException(); }  } else { throw new StringIndexOutOfBoundsException(str); }  }  if (bool) A50(true, false, 0);  }  } public final void Hn0() { if (this.F2.Qs(this.mq, this.r50 - this.mq, "") >= 0) Bk0(this.mq, false);  } public final int switch(int paramInt) { if (!this.GE) return 0;  ak0 ak01; int i; for (ak01 = this.F2, i = paramInt - 1; paramInt > 0 && this.PH0.charAt(i) != '\n';) paramInt--;  return paramInt; } public final int PW(int paramInt) { ak0 ak01; int i = (ak01 = this.F2).PH0.length(); if (!this.GE) return i;  while (paramInt < i && this.PH0.charAt(paramInt) != '\n') paramInt++;  return paramInt; } public final int dw(int paramInt1, int paramInt2) { G1 g1; pe pe; if ((pe = (g1 = this.cj).Cq) != null) { paramInt1 -= g1.H10; int i = 0; int j = this.F2.PH0.length(); if (this.GE) { int k; int m; for (paramInt2 -= this.cj.J4(), k = ((t90)pe).getLineHeight(), m = PW(i); i < j && paramInt2 >= k; ) { paramInt2 = Math.min(m + 1, j); i = paramInt2 = i = paramInt2 - k; }  j = m; }  pe pe1; if ((pe1 = this.cj.Cq) != null) { ak0 ak01; VZ vZ; if ((vZ = this.sM) == null) ak01 = this.F2;  int k = ((t90)pe1).getSpaceWidth() / 2 + paramInt1; i = ((t90)pe1).computeVisibleGlpyhs(ak01, i, j, k) + i; }  return i; }  return 0; } public final void YV(Hf0 paramHf0) {} public final void pm() { UB0.Kg0.getClass(); UB0.Kg0.getClass(); Dp0 dp0; if (((dp0 = Dp0.Ro0) == Dp0.uM || dp0 == Dp0.QG) && this.kN && !this.bx) { gi gi; if (this.Bo0 != null) { boolean bool; Tm tm; float f1 = (tm = (Tm)this.Bo0.ZX).oA * tm.nUl; float f2 = this.Bo0.HC / UB0.M60.dL(); f2 = this.Bo0.HC - false * f2; float f3; if ((f3 = (yR() + 1)) > f2) { bool = (int)(f3 - f2); } else { bool = false; }  tm.H.y = f1 / 2.0F + bool; tm.UX(true); }  this(); if (!this.n00); paramString -> (this.oo == null) ? true : IntStream.range(0, paramString.length()).map(paramString::charAt).allMatch(this.oo); o3 o31; if ((o31 = this.Km) != null) { TW tW; String[] arrayOfString1 = new String[(tW = (TW)o31.o70.Nj0("", 0, null)).FD0.length]; byte b = 0; String[] arrayOfString2; while (b < (arrayOfString2 = tW.FD0).length) { arrayOfString1[b] = arrayOfString2[b];
/* 25 */           b++; }  }  UB0.Kg0.fN(gi::kx);
/*    */       
/* 27 */       B = this.Bo0; }  if (this
/* 28 */       .Bo0 != null) this.Bo0
/* 29 */         .UG
/* 30 */         .getClass();  if (this
/* 31 */       .DJ != null)
/* 32 */     { o3 o31; if ((o31 = this.Km) == null || 
/* 33 */         !((o31.fr0 != null) ? 1 : 0)) { if (this
/* 34 */           .Sm == null) { this(); this.Dc0 = dQ2; dQ dQ2; (dQ2 = new dQ())
/* 35 */             .l0 = true;
/* 36 */           this(this); this.Sm = jo02; jo0 jo02; (jo02 = new jo0()).Xu("editfield-errorinfowindow"); dQ dQ1 = this.Dc0; this.Sm
/*    */             
/* 38 */             .si(dQ1, this.Sm.Ub()); }  this
/* 39 */           .Dc0.E1(this.DJ.toString()); this.Sm.OQ();
/* 40 */         int i = this.Kd;
/* 41 */         int j = this.xY; jo0 jo01;
/*    */         JG0 jG0;
/* 43 */         if ((jG0 = (jo01 = this.Sm).fr0) != null)
/*    */         
/*    */         { 
/* 46 */           j = Math.max(j, JG0.Fr(jo01.AW(), this.Sm.J50(), this.Sm.fu)); int k = jG0.m40(); if (i + j > k) i = k - Math.min(j, jG0.qF());  this.Sm.Tm(j, this.Sm.tj0()); this.Sm
/* 47 */             .ME(i, yR()); }  }  }
/* 48 */     else { o3 o31; if ((o31 = this.Km) != null) VG();  }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void GD() {
/*    */     UB0.Kg0.getClass();
/*    */     UB0.Kg0.getClass();
/*    */     Dp0 dp0;
/*    */     if ((dp0 = Dp0.Ro0) == Dp0.uM || dp0 == Dp0.QG) {
/*    */       throws throws4;
/*    */       if ((throws4 = B) != null) {
/*    */         ((Tm)throws4.ZX).nUl = 1.0F;
/*    */         throws4.ZX.H.TG0(throws4.xY / 2.0F, throws4.HC / 2.0F, 0.0F);
/*    */         ((Tm)throws4.ZX).UX(true);
/*    */       } 
/*    */       UB0.PU.getClass();
/*    */     } 
/*    */     throws throws2;
/*    */     if ((throws2 = this.Bo0) != null)
/*    */       throws2.UG.getClass(); 
/*    */     jo0 jo01;
/*    */     throws throws3;
/*    */     if ((jo01 = this.Sm) != null && (throws3 = jo01.Bo0) != null)
/*    */       throws3.Ek(jo01); 
/*    */     o3 o31;
/*    */     throws throws1;
/*    */     if ((o31 = this.Km) != null && (throws1 = this.Bo0) != null)
/*    */       throws1.Ek(this); 
/*    */   }
/*    */   
/*    */   public final void Ig() {
/*    */     this.oR = true;
/*    */   }
/*    */   
/*    */   public final void vB0() {
/*    */     this.m2 = false;
/*    */   }
/*    */   
/*    */   public final void ZW() {
/*    */     this.GE = true;
/*    */   }
/*    */   
/*    */   public final void IO(String paramString) {
/*    */     boolean bool;
/*    */     this.VY = false;
/*    */     Sa0 sa0 = this.O;
/*    */     Ll ll = w1;
/*    */     if (paramString != null) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     sa0.gf0(ll, bool);
/*    */     if (this.DJ != paramString) {
/*    */       this.DJ = paramString;
/*    */       zn();
/*    */     } 
/*    */     if (paramString != null) {
/*    */       o3 o31;
/*    */       if (p3() && ((o31 = this.Km) == null || !((o31.fr0 != null) ? 1 : 0))) {
/*    */         if (this.Sm == null) {
/*    */           this();
/*    */           this.Dc0 = dQ2;
/*    */           dQ dQ2;
/*    */           (dQ2 = new dQ()).l0 = true;
/*    */           this(this);
/*    */           this.Sm = jo02;
/*    */           jo0 jo02;
/*    */           (jo02 = new jo0()).Xu("editfield-errorinfowindow");
/*    */           dQ dQ1 = this.Dc0;
/*    */           this.Sm.si(dQ1, this.Sm.Ub());
/*    */         } 
/*    */         this.Dc0.E1(this.DJ.toString());
/*    */         this.Sm.OQ();
/*    */         int i = this.Kd;
/*    */         int j = this.xY;
/*    */         jo0 jo01;
/*    */         JG0 jG0;
/*    */         if ((jG0 = (jo01 = this.Sm).fr0) != null) {
/*    */           j = Math.max(j, JG0.Fr(jo01.AW(), this.Sm.J50(), this.Sm.fu));
/*    */           int k = jG0.m40();
/*    */           if (i + j > k)
/*    */             i = k - Math.min(j, jG0.qF()); 
/*    */           this.Sm.Tm(j, this.Sm.tj0());
/*    */           this.Sm.ME(i, yR());
/*    */         } 
/*    */       } 
/*    */     } else {
/*    */       jo0 jo01;
/*    */       throws throws1;
/*    */       if ((jo01 = this.Sm) != null && (throws1 = this.Bo0) != null)
/*    */         throws1.Ek(this); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void cA0() {
/*    */     this.LPt5 = false;
/*    */   }
/*    */   
/*    */   public final void LE() {
/*    */     this.n00 = true;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/of.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */