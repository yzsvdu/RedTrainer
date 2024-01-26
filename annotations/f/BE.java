/*     */ package f;
/*     */ public final class BE extends HI { public static final U70[] nA0 = new U70[0]; public static final String[] Vt = new String[] { "IPG", "IPK" }; public static short[] xm = new short[] { 11, 0, 2, 12, 14, 8, 10, 1, 3, 11 }; public static short[] gO = new short[] { 12, 0, 2, 13, 15, 9, 11, 1, 3, 12 }; public static short[] d80 = new short[] { 2, 0, 4, 2, 3, 0, 1, 4, 5 }; public U70[][] Gc = new U70[65][6]; public h30 xb = new h30(); public qw0 Vl0 = new qw0(); public ak nk; public Fg0 qN; public Jj mA; public Jj y; public bu0[] T00 = new bu0[0]; public U70 pm0; public U70[] cOm4; public BE(RD0 paramRD0) { super(paramRD0, true, Vt); } private boolean Zr(byte paramByte, k8 paramk8) { h30 h301; byte[] arrayOfByte; int i; short[] arrayOfShort1; short[] arrayOfShort2; int j; int k;
/*   3 */     for (arrayOfShort1 = new short[i = (h301 = paramk8.T20).ir0], arrayOfByte = h301.JO, j = (arrayOfShort2 = paramk8.T20.h70).length, k = 0; j-- > 0;) { if (arrayOfByte[j] == 1) { int m = k + 1; arrayOfShort1[k] = arrayOfShort2[j]; k = m; }  }  for (byte b = 0; b < i; )
/*   4 */     { short s = arrayOfShort1[b];
/*   5 */       j = paramk8.T20.Z90(s);
/*   6 */       if (this.Vl0.Fb(j)) { U70[] arrayOfU70 = (U70[])this.Vl0.Z90(j); paramk8
/*   7 */           .hF.Vh0(s, arrayOfU70); }  b++; }  paramk8
/*   8 */       .T20.clear(); paramk8.T20 = null; return true; } public final void ns() { ByteBuffer byteBuffer = Gc0(1).aF0(); short s; int[] arrayOfInt; (arrayOfInt = new int[s = 8])[0] = 289; (new int[s = 8])[1] = 0; (new int[s = 8])[2] = 0; (new int[s = 8])[3] = 0; (new int[s = 8])[4] = 65535; (new int[s = 8])[5] = 0; (new int[s = 8])[6] = 0; (new int[s = 8])[7] = 0; label53: while (byteBuffer.remaining() > 32) { k8 k8; T7 t7; int j; for (j = 0; j < s; ) { if (byteBuffer.getInt() != arrayOfInt[j]) continue label53;  j++; }  for (s = 0; s != -1; ) { s = byteBuffer.getShort(); short s1 = byteBuffer.getShort(); byteBuffer.getShort(); this.xb.st(s, s1); }  this(); (this.nk = new ak(2)).VF((byte)0, k8); this(); this.nk.VF((byte)1, k8); ((k8)this.nk.Ha0((byte)0)).SI((short)60, (short)38); ((k8)this.nk.Ha0((byte)0)).SI((short)14, (short)70); ((k8)this.nk.Ha0((byte)0)).SI((short)15, (short)71); ((k8)this.nk.Ha0((byte)0)).SI((short)16, (short)114); ((k8)this.nk.Ha0((byte)0)).SI((short)17, (short)115); ((k8)this.nk.Ha0((byte)0)).SI((short)21, (short)122); ((k8)this.nk.Ha0((byte)0)).SI((short)22, (short)6); ((k8)this.nk.Ha0((byte)0)).SI((short)18, (short)116); ((k8)this.nk.Ha0((byte)0)).SI((short)23, (short)146); ((k8)this.nk.Ha0((byte)0)).SI((short)31, (short)128); ((k8)this.nk.Ha0((byte)0)).SI((short)19, (short)121); ((k8)this.nk.Ha0((byte)0)).SI((short)24, (short)7); ((k8)this.nk.Ha0((byte)0)).SI((short)20, (short)117); ((k8)this.nk.Ha0((byte)0)).SI((short)27, (short)131); ((k8)this.nk.Ha0((byte)0)).SI((short)30, (short)127); ((k8)this.nk.Ha0((byte)0)).SI((short)28, (short)29); ((k8)this.nk.Ha0((byte)0)).SI((short)32, (short)19); ((k8)this.nk.Ha0((byte)0)).SI((short)47, (short)9); ((k8)this.nk.Ha0((byte)0)).SI((short)48, (short)120); ((k8)this.nk.Ha0((byte)0)).SI((short)29, (short)14); ((k8)this.nk.Ha0((byte)0)).SI((short)59, (short)30); ((k8)this.nk.Ha0((byte)0)).SI((short)33, (short)129); ((k8)this.nk.Ha0((byte)0)).SI((short)35, (short)20); ((k8)this.nk.Ha0((byte)0)).SI((short)39, (short)142); ((k8)this.nk.Ha0((byte)0)).SI((short)40, (short)143); ((k8)this.nk.Ha0((byte)0)).SI((short)41, (short)123); ((k8)this.nk.Ha0((byte)0)).SI((short)42, (short)126); ((k8)this.nk.Ha0((byte)0)).SI((short)52, (short)137); ((k8)this.nk.Ha0((byte)0)).SI((short)58, (short)85); ((k8)this.nk.Ha0((byte)0)).SI((short)50, (short)174); ((k8)this.nk.Ha0((byte)0)).SI((short)43, (short)139); ((k8)this.nk.Ha0((byte)0)).SI((short)44, (short)140); ((k8)this.nk.Ha0((byte)0)).SI((short)45, (short)12); ((k8)this.nk.Ha0((byte)0)).SI((short)46, (short)118); ((k8)this.nk.Ha0((byte)0)).SI((short)54, (short)49); ((k8)this.nk.Ha0((byte)0)).SI((short)55, (short)26); ((k8)this.nk.Ha0((byte)0)).SI((short)61, (short)138); ((k8)this.nk.Ha0((byte)0)).SI((short)62, (short)145); ((k8)this.nk.Ha0((byte)0)).SI((short)63, (short)183); ((k8)this.nk.Ha0((byte)0)).SI((short)57, (short)144); ((k8)this.nk.Ha0((byte)0)).SI((short)90, (short)190); ((k8)this.nk.Ha0((byte)0)).SI((short)37, (short)2); ((k8)this.nk.Ha0((byte)0)).SI((short)36, (short)140); ((k8)this.nk.Ha0((byte)0)).SI((short)38, (short)1); ((k8)this.nk.Ha0((byte)0)).SI((short)56, (short)132); ((k8)this.nk.Ha0((byte)0)).SI((short)53, (short)180); ((k8)this.nk.Ha0((byte)0)).SI((short)91, (short)58); ((k8)this.nk.Ha0((byte)0)).SI((short)64, (short)134); ((k8)this.nk.Ha0((byte)0)).SI((short)67, (short)56); ((k8)this.nk.Ha0((byte)0)).SI((short)92, (short)95); ((k8)this.nk.Ha0((byte)0)).SI((short)71, (short)161); ((k8)this.nk.Ha0((byte)0)).SI((short)25, (short)122); ((k8)this.nk.Ha0((byte)0)).SI((short)26, (short)186); ((k8)this.nk.Ha0((byte)0)).SI((short)78, (short)129); ((k8)this.nk.Ha0((byte)0)).SI((short)79, (short)157); ((k8)this.nk.Ha0((byte)0)).SI((short)34, (short)19); ((k8)this.nk.Ha0((byte)0)).SI((short)68, (short)133); ((k8)this.nk.Ha0((byte)0)).SI((short)69, (short)194); ((k8)this.nk.Ha0((byte)0)).SI((short)70, (short)57); ((k8)this.nk.Ha0((byte)0)).SI((short)65, (short)135); ((k8)this.nk.Ha0((byte)0)).SI((short)66, (short)136); ((k8)this.nk.Ha0((byte)0)).SI((short)96, (short)93); ((k8)this.nk.Ha0((byte)0)).SI((short)97, (short)92); ((k8)this.nk.Ha0((byte)0)).SI((short)69, (short)57); ((k8)this.nk.Ha0((byte)0)).SI((short)49, (short)175); ((k8)this.nk.Ha0((byte)0)).SI((short)89, (short)3); ((k8)this.nk.Ha0((byte)0)).SI((short)75, (short)158); ((k8)this.nk.Ha0((byte)0)).SI((short)80, (short)168); ((k8)this.nk.Ha0((byte)0)).SI((short)81, (short)165); ((k8)this.nk.Ha0((byte)0)).SI((short)82, (short)163); ((k8)this.nk.Ha0((byte)0)).SI((short)83, (short)166); ((k8)this.nk.Ha0((byte)0)).SI((short)84, (short)156); ((k8)this.nk.Ha0((byte)0)).SI((short)87, (short)226); ((k8)this.nk.Ha0((byte)0)).SI((short)86, (short)169); ((k8)this.nk.Ha0((byte)0)).SI((short)85, (short)164); ((k8)this.nk.Ha0((byte)0)).SI((short)73, (short)182); ((k8)this.nk.Ha0((byte)0)).SI((short)76, (short)192); ((k8)this.nk.Ha0((byte)0)).SI((short)74, (short)159); ((k8)this.nk.Ha0((byte)0)).SI((short)72, (short)170); ((k8)this.nk.Ha0((byte)0)).SI((short)95, (short)94); ((k8)this.nk.Ha0((byte)0)).SI((short)51, (short)162); ((k8)this.nk.Ha0((byte)0)).SI((short)109, (short)195); ((k8)this.nk.Ha0((byte)0)).SI((short)107, (short)229); ((k8)this.nk.Ha0((byte)0)).SI((short)110, (short)319); ((k8)this.nk.Ha0((byte)0)).SI((short)118, (short)437); ((k8)this.nk.Ha0((byte)0)).SI((short)119, (short)414); ((k8)this.nk.Ha0((byte)0)).SI((short)121, (short)353); ((k8)this.nk.Ha0((byte)0)).SI((short)122, (short)328); ((k8)this.nk.Ha0((byte)0)).SI((short)123, (short)331); ((k8)this.nk.Ha0((byte)0)).SI((short)124, (short)332); ((k8)this.nk.Ha0((byte)0)).SI((short)125, (short)351); ((k8)this.nk.Ha0((byte)0)).SI((short)126, (short)385); ((k8)this.nk.Ha0((byte)0)).SI((short)127, (short)399); ((k8)this.nk.Ha0((byte)0)).SI((short)128, (short)378); ((k8)this.nk.Ha0((byte)0)).SI((short)129, (short)379); ((k8)this.nk.Ha0((byte)0)).SI((short)130, (short)365); ((k8)this.nk.Ha0((byte)0)).SI((short)131, (short)339); ((k8)this.nk.Ha0((byte)0)).SI((short)132, (short)383); ((k8)this.nk.Ha0((byte)0)).SI((short)133, (short)320); ((k8)this.nk.Ha0((byte)0)).SI((short)135, (short)229); ((k8)this.nk.Ha0((byte)0)).SI((short)136, (short)444); ((k8)this.nk.Ha0((byte)0)).SI((short)137, (short)445); ((k8)this.nk.Ha0((byte)0)).SI((short)138, (short)443); ((k8)this.nk.Ha0((byte)0)).SI((short)148, (short)719); ((k8)this.nk.Ha0((byte)0)).SI((short)149, (short)718); ((k8)this.nk.Ha0((byte)0)).SI((short)150, (short)717); ((k8)this.nk.Ha0((byte)0)).SI((short)139, (short)449); ((k8)this.nk.Ha0((byte)0)).SI((short)140, (short)450); ((k8)this.nk.Ha0((byte)0)).SI((short)141, (short)575); ((k8)this.nk.Ha0((byte)0)).SI((short)143, (short)574); ((k8)this.nk.Ha0((byte)0)).SI((short)142, (short)576); ((k8)this.nk.Ha0((byte)0)).SI((short)144, (short)212); ((k8)this.nk.Ha0((byte)0)).SI((short)145, (short)211); ((k8)this.nk.Ha0((byte)0)).SI((short)146, (short)582); ((k8)this.nk.Ha0((byte)0)).SI((short)111, (short)403); ((k8)this.nk.Ha0((byte)0)).SI((short)134, (short)366); ((k8)this.nk.Ha0((byte)0)).SI((short)147, (short)439); ((k8)this.nk.Ha0((byte)0)).SI((short)112, (short)361); ((k8)this.nk.Ha0((byte)0)).SI((short)114, (short)316); ((k8)this.nk.Ha0((byte)0)).SI((short)117, (short)412); ((k8)this.nk.Ha0((byte)0)).SI((short)120, (short)69); ((k8)this.nk.Ha0((byte)0)).SI((short)115, (short)338); ((k8)this.nk.Ha0((byte)0)).SI((short)116, (short)314); ((k8)this.nk.Ha0((byte)0)).SI((short)113, (short)334); ((k8)this.nk.Ha0((byte)0)).SI((short)88, (short)193); ((k8)this.nk.Ha0((byte)1)).SI((short)5, (short)1); ((k8)this.nk.Ha0((byte)1)).SI((short)6, (short)2); ((k8)this.nk.Ha0((byte)1)).SI((short)7, (short)121); ((k8)this.nk.Ha0((byte)1)).SI((short)8, (short)6); ((k8)this.nk.Ha0((byte)1)).SI((short)9, (short)28); ((k8)this.nk.Ha0((byte)1)).SI((short)10, (short)120); ((k8)this.nk.Ha0((byte)1)).SI((short)11, (short)114); ((k8)this.nk.Ha0((byte)1)).SI((short)12, (short)115); ((k8)this.nk.Ha0((byte)1)).SI((short)13, (short)9); ((k8)this.nk.Ha0((byte)1)).SI((short)14, (short)7); ((k8)this.nk.Ha0((byte)1)).SI((short)15, (short)28); ((k8)this.nk.Ha0((byte)1)).SI((short)16, (short)8); ((k8)this.nk.Ha0((byte)1)).SI((short)17, (short)35); ((k8)this.nk.Ha0((byte)1)).SI((short)18, (short)18); ((k8)this.nk.Ha0((byte)1)).SI((short)19, (short)17); ((k8)this.nk.Ha0((byte)1)).SI((short)20, (short)13); ((k8)this.nk.Ha0((byte)1)).SI((short)21, (short)19); ((k8)this.nk.Ha0((byte)1)).SI((short)22, (short)20); ((k8)this.nk.Ha0((byte)1)).SI((short)23, (short)58); ((k8)this.nk.Ha0((byte)1)).SI((short)24, (short)6); ((k8)this.nk.Ha0((byte)1)).SI((short)25, (short)127); ((k8)this.nk.Ha0((byte)1)).SI((short)26, (short)125); ((k8)this.nk.Ha0((byte)1)).SI((short)27, (short)30); ((k8)this.nk.Ha0((byte)1)).SI((short)28, (short)56); ((k8)this.nk.Ha0((byte)1)).SI((short)29, (short)129); ((k8)this.nk.Ha0((byte)1)).SI((short)30, (short)130); ((k8)this.nk.Ha0((byte)1)).SI((short)31, (short)50); ((k8)this.nk.Ha0((byte)1)).SI((short)32, (short)51); ((k8)this.nk.Ha0((byte)1)).SI((short)33, (short)11); ((k8)this.nk.Ha0((byte)1)).SI((short)34, (short)15); ((k8)this.nk.Ha0((byte)1)).SI((short)35, (short)4); ((k8)this.nk.Ha0((byte)1)).SI((short)36, (short)5); ((k8)this.nk.Ha0((byte)1)).SI((short)37, (short)34); ((k8)this.nk.Ha0((byte)1)).SI((short)38, (short)68); ((k8)this.nk.Ha0((byte)1)).SI((short)39, (short)185); ((k8)this.nk.Ha0((byte)1)).SI((short)40, (short)85); ((k8)this.nk.Ha0((byte)1)).SI((short)42, (short)139); ((k8)this.nk.Ha0((byte)1)).SI((short)43, (short)140); ((k8)this.nk.Ha0((byte)1)).SI((short)44, (short)49); ((k8)this.nk.Ha0((byte)1)).SI((short)45, (short)56); ((k8)this.nk.Ha0((byte)1)).SI((short)46, (short)26); ((k8)this.nk.Ha0((byte)1)).SI((short)47, (short)118); ((k8)this.nk.Ha0((byte)1)).SI((short)48, (short)40); ((k8)this.nk.Ha0((byte)1)).SI((short)49, (short)54); ((k8)this.nk.Ha0((byte)1)).SI((short)50, (short)52); ((k8)this.nk.Ha0((byte)1)).SI((short)51, (short)47); ((k8)this.nk.Ha0((byte)1)).SI((short)52, (short)7); ((k8)this.nk.Ha0((byte)1)).SI((short)53, (short)115); ((k8)this.nk.Ha0((byte)1)).SI((short)54, (short)114); ((k8)this.nk.Ha0((byte)1)).SI((short)55, (short)36); ((k8)this.nk.Ha0((byte)1)).SI((short)56, (short)21); ((k8)this.nk.Ha0((byte)1)).SI((short)57, (short)22); ((k8)this.nk.Ha0((byte)1)).SI((short)58, (short)134); ((k8)this.nk.Ha0((byte)1)).SI((short)59, (short)95); ((k8)this.nk.Ha0((byte)1)).SI((short)65, (short)9); ((k8)this.nk.Ha0((byte)1)).SI((short)66, (short)122); ((k8)this.nk.Ha0((byte)1)).SI((short)67, (short)68); ((k8)this.nk.Ha0((byte)1)).SI((short)68, (short)32); ((k8)this.nk.Ha0((byte)1)).SI((short)76, (short)478); ((k8)this.nk.Ha0((byte)1)).SI((short)77, (short)380); ((k8)this.nk.Ha0((byte)1)).SI((short)78, (short)305); ((k8)this.nk.Ha0((byte)1)).SI((short)79, (short)495); ((k8)this.nk.Ha0((byte)1)).SI((short)80, (short)323); ((k8)this.nk.Ha0((byte)1)).SI((short)81, (short)564); ((k8)this.nk.Ha0((byte)1)).SI((short)82, (short)94); ((k8)this.nk.Ha0((byte)1)).SI((short)83, (short)24); ((k8)this.nk.Ha0((byte)1)).SI((short)84, (short)25); ((k8)this.nk.Ha0((byte)1)).SI((short)85, (short)136); ((k8)this.nk.Ha0((byte)1)).SI((short)86, (short)93); ((k8)this.nk.Ha0((byte)1)).SI((short)87, (short)92); ((k8)this.nk.Ha0((byte)1)).SI((short)95, (short)619); ((k8)this.nk.Ha0((byte)1)).SI((short)96, (short)619); ((k8)this.nk.Ha0((byte)1)).SI((short)98, (short)594); ((k8)this.nk.Ha0((byte)1)).SI((short)99, (short)46); ((k8)this.nk.Ha0((byte)1)).SI((short)110, (short)33); ((k8)this.nk.Ha0((byte)1)).SI((short)116, (short)58); ((k8)this.nk.Ha0((byte)1)).SI((short)134, (short)60); ((k8)this.nk.Ha0((byte)1)).SI((short)136, (short)68); ((k8)this.nk.Ha0((byte)1)).SI((short)187, (short)711); ((k8)this.nk.Ha0((byte)1)).SI((short)188, (short)712); ((k8)this.nk.Ha0((byte)1)).SI((short)189, (short)162); ((k8)this.nk.Ha0((byte)1)).SI((short)190, (short)40); ((k8)this.nk.Ha0((byte)1)).SI((short)200, (short)708); ((k8)this.nk.Ha0((byte)1)).SI((short)201, (short)709); ((k8)this.nk.Ha0((byte)1)).SI((short)202, (short)710); ((k8)this.nk.Ha0((byte)1)).SI((short)203, (short)631); ((k8)this.nk.Ha0((byte)1)).SI((short)204, (short)683); ((k8)this.nk.Ha0((byte)1)).SI((short)208, (short)594); ((k8)this.nk.Ha0((byte)1)).SI((short)209, (short)323); ((k8)this.nk.Ha0((byte)1)).SI((short)210, (short)485); ((k8)this.nk.Ha0((byte)1)).SI((short)211, (short)609); ((k8)this.nk.Ha0((byte)1)).SI((short)212, (short)683); ((k8)this.nk.Ha0((byte)1)).SI((short)213, (short)140); ((k8)this.nk.Ha0((byte)1)).SI((short)214, (short)629); ((k8)this.nk.Ha0((byte)1)).SI((short)220, (short)592); ((k8)this.nk.Ha0((byte)1)).SI((short)223, (short)57); ((k8)this.nk.Ha0((byte)1)).SI((short)225, (short)612); ((k8)this.nk.Ha0((byte)1)).SI((short)226, (short)687); ((k8)this.nk.Ha0((byte)1)).SI((short)227, (short)135); ((k8)this.nk.Ha0((byte)1)).SI((short)228, (short)187); ((k8)this.nk.Ha0((byte)1)).SI((short)229, (short)450); ((k8)this.nk.Ha0((byte)1)).SI((short)232, (short)717); ((k8)this.nk.Ha0((byte)1)).SI((short)237, (short)580); ((k8)this.nk.Ha0((byte)1)).SI((short)238, (short)581); E80.Mx0();
/*     */       int i;
/*     */       HI hI;
/*     */       ByteBuffer byteBuffer1;
/*  12 */       if ((i = Fq.cL0(byteBuffer1 = (hI = (this.TI.B8("/a/0/8/1")).bP).GA0(), t7.XL)) == (j = 1129464142)) {
/*  13 */         i = u80.Lx0(byteBuffer1);
/*     */         
/*  15 */         int k = wd.TG0(j = byteBuffer1.getInt(), 8, byteBuffer1.position(), byteBuffer1); short s1;
/*  16 */         for (k = byteBuffer1.position() + k, s1 = 0; s1 < j; )
/*  17 */         { C20 c20; int m, n = byteBuffer1.getInt(i + 12 + (m = s1 * 8));
/*  18 */           m = n + k; n = WW.Rq0(i, 12, 4, m, byteBuffer1) - n;
/*  19 */           String[] arrayOfString = nN.Wj; if (s1 < 400) { arrayOfString[s1]; } else { Integer.toString(s1); }
/*  20 */            ByteBuffer byteBuffer3; (byteBuffer3 = hI.GA0()).position(m); if (n > 0) {
/*  21 */             V8.Pp0(m, n, byteBuffer3.limit(), byteBuffer3);
/*     */           }
/*     */ 
/*     */           
/*  25 */           this(byteBuffer2); ByteBuffer byteBuffer2; w00 w00;
/*  26 */           if (((byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN).getInt((byteBuffer2 = byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN)).position()) == 811095106)) && (((w00 = (new C20()).EV) != null) ? w00.ib : ((Wd)c20.PF0.get(0)).as0))
/*     */           { int i1;
/*     */             U70[] arrayOfU70;
/*     */             byte b;
/*  30 */             for (arrayOfU70 = new U70[i1 = c20.bl.TE.ai0.Z8], b = 0; b < i1; ) { U70 u70; cs cs; this(c20, b); this(cs); arrayOfU70[b] = u70; b++; }  this.Vl0.Vh0(s1, arrayOfU70); }  s1 = (short)(s1 + 1); }  this.nk.qk(this::Zr); return;
/*  31 */       }  throw new RuntimeException(
/*  32 */           RH0.KK("Header magic mismatch = ", i, " vs expected ", j)); }
/*     */     
/*  34 */     throw new RuntimeException("Unable to find pattern"); } public final String SO() { String str = super.SO(); if ("ja".equals(str) && (this.TI.B8("/a/0/1/6")).zu0 > 500000) return "zh";  return str; }
/*  35 */   public final void BL() { T7 t7; zh0 zh0; U70 u70; F40 f402; YK0 yK02 = Ft0(f402 = F40.wI); Ml0.gK[4][f401.DX] = yK01; Ml0.gK[4][f402.DX] = yK02; F40 f401; YK0 yK01; Ml0.rW(190480, (yK01 = Ft0(f401 = F40.ef0)).Rv(730)); Ml0.rW(144000, Ft0(f401 = F40.ef0).Rv(279)); Ml0.rW(139000, Ft0(f401 = F40.ef0).Rv(221)); Ml0.rW(249000, Ft0(f401 = F40.ef0).Rv(222)); Ml0.nW.A3(13, Ml0.bM0(196, 14)); Ml0.QS(664); Ml0.QS(667); Ml0.QS(716); Of of; (of = Of.eH).getClass(); E80.Mx0(); int i; HI hI; ByteBuffer byteBuffer; int j; if ((i = Fq.cL0(byteBuffer = (hI = (this.TI.B8("/a/0/1/7")).bP).GA0(), t7.XL)) == (j = 1129464142)) { i = u80.Lx0(byteBuffer); int k = wd.TG0(j = byteBuffer.getInt(), 8, byteBuffer.position(), byteBuffer); short s; for (k = byteBuffer.position() + k, s = 0; s < j; ) { LPT3 lPT3; this(); short s1 = (short)(s + 9000); if (s >= 113) s1 = (short)(s1 + 22);  if (s >= 406) s1 = (short)(s1 + 1);  int m, n = byteBuffer.getInt(i + 12 + (m = s * 8)); m = n + k; n = Df0.iy0(i + 12, 4, m, byteBuffer) - n; String[] arrayOfString = nN.Wj; if (s < 400) { arrayOfString[s]; } else { Integer.toString(s); }  ByteBuffer byteBuffer2; (byteBuffer2 = hI.GA0()).position(m); if (n > 0) V8.Pp0(m, n, byteBuffer2.limit(), byteBuffer2);  lPT3.vy0(s1, this, byteBuffer2.slice().order(ByteOrder.LITTLE_ENDIAN)); of.ix.put(Short.valueOf(lPT3.bj0), lPT3); of.cOm7.put(Short.valueOf(lPT3.bj0), lPT3); s = (short)(s + 1); }  ByteBuffer byteBuffer1 = HB0(); while (true) { if (byteBuffer1.getShort() == 64 && byteBuffer1.getShort() == 12 && byteBuffer1.getShort() == 30 && byteBuffer1.getShort() == 50) { ig ig; for (Iterator<LPT3> iterator = of.cOm7.values().iterator(); iterator.hasNext(); ) { LPT3 lPT3; short s1; if ((s1 = (lPT3 = iterator.next()).bj0) < 9328 || s1 > 9427) continue;  lPT3.kx0 = byteBuffer1.getShort(); }
/*  36 */            wm0 wm0; (wm0 = wm0.y0)
/*  37 */             .getClass();
/*     */ 
/*     */           
/*  40 */           this(this.TI.B8("/a/0/1/8")); ByteBuffer byteBuffer2 = HB0(); while (true) { LD lD1; U70 u701; T7 t71; ig ig1; c9 c9; ig ig2; Ut0 ut01; ig ig3; LD lD2, lD3; vJ vJ; Ut0 ut02; ek0 ek0; if (byteBuffer2.getInt() != 4587577 || byteBuffer2.getInt() != 16318714 || byteBuffer2.getInt() != 28246143)
/*     */               continue; 
/*  42 */             this(ig.zz(1), false);
/*  43 */             this(); this(); for (s = 0; s < 537; ) { U70 u702, u703; short s1 = (short)(s + 9000); byteBuffer2.getShort(); short s3 = byteBuffer2.getShort(); byteBuffer2.getShort(); short s2; int i1; if (ut01
/*  44 */                 .return(i1 = (s2 = byteBuffer2.getShort()) << 16 | s3))
/*  45 */               { u702 = (U70)ut01.Z6(i1); u703 = (U70)ut02.Z6(i1); }
/*  46 */               else { U70 u704; PH pH1; U70 u705; PH pH2; this(ig, u703, false, u702, lD1, (byte)4, null);
/*  47 */                 this(pH1); ut01.A3(i1, u704);
/*  48 */                 this(ig, u703, true, u702, lD1, (byte)4, null);
/*  49 */                 this(pH2); ut02.A3(i1, u705); u703 = u705; u702 = u704; }  wm0.Rv0.Vh0(s1, u702); wm0.ii.Vh0(s1, u703); s++; }
/*  50 */              AD aD; (aD = AD.case)
/*  51 */               .getClass();
/*  52 */             this();
/*     */             
/*  54 */             this(this.TI.B8("/a/0/5/8")); for (byte b2 = 0; b2 <= ''; ) { this(new df0(ig3, b2)); (new U70())
/*  55 */                 .Gd0 = true;
/*  56 */               c9.Nn0.A3(b2, u70); b2++; }  aD
/*  57 */               .Hm.VF((byte)4, c9);
/*  58 */             Mm0.dw((byte)4);
/*     */             
/*  60 */             T7 t72 = this.TI.B8("/a/2/1/6"); this(t72);
/*  61 */             t72 = (new ig()).zz(10);
/*     */             
/*  63 */             this(t72, false);
/*  64 */             t72 = (new ig()).zz(8);
/*     */             
/*  66 */             this(t72, false);
/*  67 */             t72 = (new ig()).zz(6);
/*  68 */             this(t72);
/*  69 */             t72 = (new ig()).zz(7);
/*  70 */             this(t72, false); this(new Og0(lD3, ek0, vJ)); this.Gc[64][0] = u701; this(new hM(lD3, ek0, vJ)); byte b1; for (this.Gc[64][1] = u701, b1 = 0; b1 < 64; ) {
/*  71 */               T7 t73 = ig2.zz(b1 + 12);
/*  72 */               this(t73);
/*  73 */               t73 = ig2.zz(b1 + 76);
/*  74 */               this(t73, false); byte b; for (b = 0; b < 6; ) { U70 u702; this(new vZ(lD2, ek0, vJ, b)); this.Gc[b1][b] = u702; b = (byte)(b + 1); }  b1++;
/*  75 */             }  ns();
/*  76 */             this.kO = new A50(this);
/*     */ 
/*     */             
/*  79 */             E80.Mx0(); int m;
/*     */             HI hI1;
/*     */             ByteBuffer byteBuffer3;
/*     */             int n;
/*  83 */             if ((m = Fq.cL0(byteBuffer3 = (hI1 = (this.TI.B8("/a/0/4/1")).bP).GA0(), t71.XL)) == (n = 1129464142)) {
/*  84 */               Fg0 fg0; T7 t73; m = u80.Lx0(byteBuffer3);
/*     */               
/*  86 */               n = wd.TG0(byteBuffer3.getInt(), 8, byteBuffer3.position(), byteBuffer3);
/*  87 */               n = byteBuffer3.position() + n; int i2; lF0[] arrayOfLF0;
/*  88 */               for (this.uF = (lF0[])new mF[byteBuffer3.getInt()], i2 = 0; i2 < (arrayOfLF0 = this.uF).length; ) { String str; mF mF = new mF();
/*  89 */                 int i3, i4 = byteBuffer3.getInt(m + 12 + (i3 = i2 * 8));
/*  90 */                 i3 = i4 + n; i4 = Df0.iy0(m + 12, 4, i3, byteBuffer3) - i4;
/*  91 */                 T7 t74 = new T7();
/*  92 */                 String[] arrayOfString = nN.Wj; if (i2 < 400) { str = arrayOfString[i2]; } else { str = Integer.toString(i2); }  i2 = (short)i2;
/*  93 */                 this(hI1, str, i3, i4, i2); t74.db = "";
/*  94 */                 this(i2, t74); arrayOfLF0[i2] = mF; i2 = (short)(i2 + 1); }  this(this); this.qN = new Fg0();
/*  95 */               fV fV = fV.Ca; By0[] arrayOfBy0; byte b; if ((b = 4) < (
/*  96 */                 arrayOfBy0 = fV.kg).length) {
/*  97 */                 arrayOfBy0[b] = fg0;
/*     */               }
/*     */               
/* 100 */               E80.Mx0();
/*     */               int i1;
/*     */               HI hI2;
/*     */               ByteBuffer byteBuffer4;
/* 104 */               if ((i1 = Fq.cL0(byteBuffer4 = (hI2 = (this.TI.B8("/a/0/6/5")).bP).GA0(), t73.XL)) == (n = 1129464142)) {
/* 105 */                 T7 t74; i1 = u80.Lx0(byteBuffer4);
/*     */                 
/* 107 */                 n = wd.TG0(byteBuffer4.getInt(), 8, byteBuffer4.position(), byteBuffer4);
/* 108 */                 n = byteBuffer4.position() + n; Bs[] arrayOfBs;
/* 109 */                 for (this.Vr = (Bs[])new yU[byteBuffer4.getInt()], i2 = 0; i2 < (arrayOfBs = this.Vr).length; ) { String str; yU yU = new yU();
/* 110 */                   int i4, i5 = byteBuffer4.getInt(i1 + 12 + (i4 = i2 * 8));
/* 111 */                   i4 = i5 + n; i5 = Df0.iy0(i1 + 12, 4, i4, byteBuffer4) - i5;
/* 112 */                   T7 t75 = new T7();
/* 113 */                   String[] arrayOfString = nN.Wj; if (i2 < 400) { str = arrayOfString[i2]; } else { str = Integer.toString(i2); }  short s2 = (short)i2;
/* 114 */                   this(hI2, str, i4, i5, s2); t75.db = "";
/* 115 */                   this(this, i2, t75); arrayOfBs[i2] = yU; i2 = (short)(i2 + 1); }  int[] arrayOfInt; short s1; for (this.mA = new Jj(this, VV.i60), this.y = new Jj(this, VV.transient), (this.uF[212]).X7 = 5, (this.uF[212]).cB0 = 6, (arrayOfInt = new int[6])[0] = 211, (new int[6])[1] = 211, (new int[6])[2] = 211, (new int[6])[3] = 211, (new int[6])[4] = 211, (new int[6])[5] = 211, (new int[5][])[0] = arrayOfInt, (arrayOfInt = new int[6])[0] = 211, (new int[6])[1] = 661, (new int[6])[2] = 655, (new int[6])[3] = 653, (new int[6])[4] = 660, (new int[6])[5] = 211, (new int[5][])[1] = arrayOfInt, (arrayOfInt = new int[6])[0] = 211, (new int[6])[1] = 663, (new int[6])[2] = 652, (new int[6])[3] = 656, (new int[6])[4] = 657, (new int[6])[5] = 666, (new int[5][])[2] = arrayOfInt, (arrayOfInt = new int[6])[0] = 211, (new int[6])[1] = 654, (new int[6])[2] = 662, (new int[6])[3] = 658, (new int[6])[4] = 659, (new int[6])[5] = 211, (new int[5][])[3] = arrayOfInt, (arrayOfInt = new int[6])[0] = 211, (new int[6])[1] = 211, (new int[6])[2] = 211, (new int[6])[3] = 211, (new int[6])[4] = 211, (new int[6])[5] = 211, (this.uF[212]).U1 = new int[][] { null, null, null, null, arrayOfInt }, (arrayOfInt = new int[6])[0] = 0, (new int[6])[1] = 0, (new int[6])[2] = 0, (new int[6])[3] = 0, (new int[6])[4] = 0, (new int[6])[5] = 0, (new int[5][])[0] = arrayOfInt, (arrayOfInt = new int[6])[0] = 0, (new int[6])[1] = 352, (new int[6])[2] = 346, (new int[6])[3] = 344, (new int[6])[4] = 351, (new int[6])[5] = 0, (new int[5][])[1] = arrayOfInt, (arrayOfInt = new int[6])[0] = 0, (new int[6])[1] = 354, (new int[6])[2] = 343, (new int[6])[3] = 347, (new int[6])[4] = 348, (new int[6])[5] = 357, (new int[5][])[2] = arrayOfInt, (arrayOfInt = new int[6])[0] = 0, (new int[6])[1] = 345, (new int[6])[2] = 353, (new int[6])[3] = 349, (new int[6])[4] = 350, (new int[6])[5] = 0, (new int[5][])[3] = arrayOfInt, (arrayOfInt = new int[6])[0] = 0, (new int[6])[1] = 0, (new int[6])[2] = 0, (new int[6])[3] = 0, (new int[6])[4] = 0, (new int[6])[5] = 0, (this.uF[212]).H80 = new int[][] { null, null, null, null, arrayOfInt }, ((mF)this.uF[212]).fa0 = new float[5][6], s1 = 343; s1 <= 354; ) {
/*     */                   
/* 117 */                   (this.qN.Z6[s1])
/* 118 */                     .F70 = 212; s1 = (short)(s1 + 1);
/*     */                 } 
/* 120 */                 E80.Mx0();
/*     */                 
/*     */                 int i3;
/*     */                 
/* 124 */                 if ((i3 = Fq.cL0(byteBuffer4 = (hI2 = (this.TI.B8("/a/0/5/5")).bP).GA0(), t74.XL)) == (n = 1129464142)) {
/* 125 */                   T7 t75; i3 = u80.Lx0(byteBuffer4);
/*     */                   
/* 127 */                   i2 = wd.TG0(n = byteBuffer4.getInt(), 8, byteBuffer4.position(), byteBuffer4);
/* 128 */                   i2 = byteBuffer4.position() + i2;
/*     */                   
/* 130 */                   E80.Mx0(); int i4;
/*     */                   HI hI3;
/*     */                   ByteBuffer byteBuffer5;
/*     */                   int i5;
/* 134 */                   if ((i4 = Fq.cL0(byteBuffer5 = (hI3 = (this.TI.B8("/a/0/5/6")).bP).GA0(), t75.XL)) == (i5 = 1129464142)) {
/* 135 */                     LD lD; n = u80.Lx0(byteBuffer5);
/*     */                     
/* 137 */                     i4 = wd.TG0(byteBuffer5.getInt(), 8, byteBuffer5.position(), byteBuffer5);
/* 138 */                     i4 = byteBuffer5.position() + i4;
/* 139 */                     for (this.T00 = new bu0[n], i5 = 0; i5 < this.T00.length; ) {
/* 140 */                       bu0 bu01; int i6, i7 = byteBuffer4.getInt(i3 + 12 + (i6 = i5 * 8));
/* 141 */                       i7 += i2; int i9 = Df0.iy0(i3 + 12, 4, i6, byteBuffer4) - i7;
/* 142 */                       String[] arrayOfString = nN.Wj; if (i5 < 400) { arrayOfString[i5]; } else { Integer.toString(i5); }
/* 143 */                        ByteBuffer byteBuffer9; (byteBuffer9 = hI2.GA0()).position(i7); if (i9 > 0)
/* 144 */                         V8.Pp0(i7, i9, byteBuffer9.limit(), byteBuffer9);  ByteOrder byteOrder;
/* 145 */                       ByteBuffer byteBuffer7 = byteBuffer9.slice().order(byteOrder = ByteOrder.LITTLE_ENDIAN);
/* 146 */                       this(i5, this, byteBuffer7);
/* 147 */                       int i8 = byteBuffer5.getInt(n + 12 + i6);
/* 148 */                       i6 = i8 + i4; i8 = Df0.iy0(n + 12, 4, i6, byteBuffer5) - i8; if (i5 < 400) { arrayOfString[i5]; }
/* 149 */                       else { Integer.toString(i5); }
/* 150 */                        ByteBuffer byteBuffer8; (byteBuffer8 = hI3.GA0()).position(i6); if (i8 > 0)
/* 151 */                         V8.Pp0(i6, i8, byteBuffer8.limit(), byteBuffer8); 
/* 152 */                       ByteBuffer byteBuffer6 = byteBuffer8.slice().order(byteOrder); byte b5 = 0; K60[] arrayOfK60; while (b5 < (
/* 153 */                         arrayOfK60 = bu01.TK0).length) { K60 k60; this(bu01, byteBuffer6); arrayOfK60[b5] = k60; b5++; }  this
/* 154 */                         .T00[i5] = bu01;
/*     */ 
/*     */                       
/* 157 */                       Ry0 ry0 = T30.Qh.lD0[4];
/* 158 */                       ry0
/* 159 */                         .VL
/* 160 */                         .Vh0(bu01.tK, bu01); i5 = (short)(i5 + 1);
/*     */                     } 
/*     */                     
/* 163 */                     this(this.TI.B8("/a/1/4/4")); this.pm0 = new U70(new sR(ig1));
/*     */                     
/* 165 */                     this(ig1.zz(2), false); byte b4;
/* 166 */                     for (this.cOm4 = new U70[b4 = 2], n = 0; n < b4; ) { this(new Ef0(ig1, lD, n)); this.cOm4[n] = u70; n++; }
/*     */                     
/* 168 */                     T7 t76 = this.TI.B8("/a/0/4/9"); this(this); for (byte b3 = 0; b3 < 8; ) { zh0 = (new U70(new ZD0(ig1, b3))).Ql0(); (h90.Kw0())
/* 169 */                         .WY[4][
/* 170 */                           b3] = zh0; b3++; }  return;
/* 171 */                   }  throw new RuntimeException(
/* 172 */                       RH0.KK("Header magic mismatch = ", i4, " vs expected ", i5));
/* 173 */                 }  throw new RuntimeException(
/* 174 */                     RH0.KK("Header magic mismatch = ", ig1, " vs expected ", n));
/*     */               } 
/* 176 */               throw new RuntimeException(
/* 177 */                   RH0.KK("Header magic mismatch = ", ig1, " vs expected ", n));
/* 178 */             }  throw new RuntimeException(
/* 179 */                 RH0.KK("Header magic mismatch = ", ig1, " vs expected ", n)); }  break; }  }
/*     */        }
/* 181 */      throw new RuntimeException(
/* 182 */         RH0.KK("Header magic mismatch = ", zh0, " vs expected ", u70)); }
/*     */ 
/*     */   
/*     */   public final HV Hb(short paramShort) {
/*     */     (new StringBuilder()).append(this.db).append("/");
/*     */     T7 t71;
/*     */     HI hI = (t71 = this.TI.B8("/a/0/3/2")).Sh0();
/*     */     ByteBuffer byteBuffer;
/*     */     (byteBuffer = this.TI.B8("/a/0/3/2").Sh0().GA0()).position(this.XL);
/*     */     (new FA0(byteBuffer)).sV(1129464142);
/*     */     this(byteBuffer);
/*     */     E60 e60;
/*     */     String str;
/*     */     this.TI.B8("/a/0/3/2").Sh0().GA0().getInt();
/*     */     int j = this.TI.B8("/a/0/3/2").Sh0().GA0().getInt();
/*     */     j = byteBuffer.position() + j;
/*     */     if (paramShort >= this.dh0)
/*     */       return null; 
/*     */     K00 k00 = new K00();
/*     */     int k, m = byteBuffer.getInt(this.Ex + 12 + (k = paramShort * 8));
/*     */     int i = m + j;
/*     */     j = WW.Rq0(this.Ex, 12, 4, k, byteBuffer) - m;
/*     */     T7 t72 = new T7();
/*     */     String[] arrayOfString = nN.Wj;
/*     */     if (paramShort < 400) {
/*     */       str = arrayOfString[paramShort];
/*     */     } else {
/*     */       str = Integer.toString(paramShort);
/*     */     } 
/*     */     short s = (short)paramShort;
/*     */     this(hI, str, i, j, s);
/*     */     t72.db = "";
/*     */     this(t72);
/*     */     return this;
/*     */   }
/*     */   
/*     */   public final void n4() {
/*     */     this.JN = new E4(this.TI.B8("/data/sound/gs_sound_data.sdat"));
/*     */   }
/*     */   
/*     */   public final U70 JA0(byte paramByte, short paramShort1, short paramShort2) {
/*     */     U70[] arrayOfU70 = null;
/*     */     if (paramByte == 4) {
/*     */       arrayOfU70 = (U70[])this.Vl0.Z90(paramShort1);
/*     */     } else {
/*     */       k8 k8;
/*     */       if ((k8 = (k8)this.nk.Ha0(paramByte)) != null) {
/*     */         U70[] arrayOfU701;
/*     */         if ((arrayOfU701 = (U70[])this.hF.Z90(paramShort1)) == null) {
/*     */           arrayOfU701 = nA0;
/*     */           arrayOfU70 = this;
/*     */         } else {
/*     */           arrayOfU70 = this;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     if (arrayOfU70 == null || arrayOfU70.length < 1)
/*     */       return null; 
/*     */     if (arrayOfU70.length == 16) {
/*     */       short[] arrayOfShort = xm;
/*     */       if (10 <= paramShort2)
/*     */         return null; 
/*     */       paramShort2 = this[paramShort2];
/*     */     } else if (arrayOfU70.length == 17) {
/*     */       short[] arrayOfShort = gO;
/*     */       if (10 <= paramShort2)
/*     */         return null; 
/*     */       paramShort2 = this[paramShort2];
/*     */     } else if (arrayOfU70.length == 8) {
/*     */       short[] arrayOfShort = d80;
/*     */       if (9 <= paramShort2)
/*     */         return null; 
/*     */       paramShort2 = this[paramShort2];
/*     */     } 
/*     */     return (arrayOfU70.length <= paramShort2) ? arrayOfU70[0] : arrayOfU70[paramShort2];
/*     */   }
/*     */   
/*     */   public final Wd oB(VV paramVV, int paramInt) {
/*     */     T7 t7;
/*     */     String[] arrayOfString;
/*     */     E80.Mx0();
/*     */     int i;
/*     */     HI hI;
/*     */     ByteBuffer byteBuffer;
/*     */     int j;
/*     */     if ((i = Fq.cL0(byteBuffer = (hI = (this.TI.B8("/a/0/4/4")).bP).GA0(), this.XL)) == (j = 1129464142)) {
/*     */       i = wd.TG0(byteBuffer.getInt(), 8, byteBuffer.position(), byteBuffer);
/*     */       i = byteBuffer.position() + i;
/*     */       int m = byteBuffer.getInt(u80.Lx0(byteBuffer) + 12 + (j = paramInt * 8));
/*     */       i = m + i;
/*     */       int k = WW.Rq0(u80.Lx0(byteBuffer), 12, 4, j, byteBuffer) - m;
/*     */       arrayOfString = nN.Wj;
/*     */       if (paramInt < 400) {
/*     */         arrayOfString[paramInt];
/*     */       } else {
/*     */         Integer.toString(paramInt);
/*     */       } 
/*     */       C20 c20 = new C20();
/*     */       ByteBuffer byteBuffer1;
/*     */       (byteBuffer1 = hI.GA0()).position(i);
/*     */       if (k > 0)
/*     */         V8.Pp0(i, k, byteBuffer1.limit(), byteBuffer1); 
/*     */       this(byteBuffer1.slice().order(ByteOrder.LITTLE_ENDIAN));
/*     */       return c20.bl;
/*     */     } 
/*     */     throw new RuntimeException(RH0.KK("Header magic mismatch = ", i, " vs expected ", arrayOfString));
/*     */   }
/*     */   
/*     */   public final Jj sM(boolean paramBoolean) {
/*     */     return paramBoolean ? this.mA : this.y;
/*     */   }
/*     */   
/*     */   public final void mE0() {
/*     */     F40 f40 = F40.ef0;
/*     */     this(this, this, this.TI.B8("/a/0/2/7"));
/*     */     S40 s40;
/*     */     this.OB = new S40();
/*     */     this.Is = s40;
/*     */   }
/*     */   
/*     */   public final byte bO() {
/*     */     return 4;
/*     */   }
/*     */   
/*     */   public final By0 I80() {
/*     */     return this.qN;
/*     */   }
/*     */   
/*     */   public final Ws0 gH0(int paramInt) {
/*     */     return this.qN.Z6[paramInt];
/*     */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/BE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */