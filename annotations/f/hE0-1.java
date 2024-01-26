/*     */ package f;public abstract class hE0 { public static final ik Fn = C00.gd(hE0.class); public static boolean oG = false; public static void V80(dx0 paramdx0) { short[] arrayOfShort; int i;
/*     */     byte b;
/*   3 */     for (i = (arrayOfShort = wm0.y0.Rv0.u5()).length, b = 0; b < i; ) { short s = arrayOfShort[b]; paramdx0.putNextEntry(new ZipEntry("sprites/itemicons/" + s + ".png"));
/*     */ 
/*     */       
/*   6 */       pB.TJ0(new eb(paramdx0), zH); ZH zH; (zH = wm0.y0.ep(s, false).cOm9()).dispose(); paramdx0.closeEntry(); b++; }  } public static void cU(dx0 paramdx0) { for (Iterator<UD0> iterator = (On.v30()).iI0.values().iterator(); iterator.hasNext(); ) { byte[] arrayOfByte; UD0 uD0; short s; if ((s = (uD0 = iterator.next()).AP) >= 1000) continue;  int i; if (((i = uD0.FD) > 0 && i < 254)) { (arrayOfByte = new byte[2])[0] = 0; (new byte[2])[1] = 1; } else if (arrayOfByte == 'þ') { (arrayOfByte = new byte[1])[0] = 1; } else { (arrayOfByte = new byte[1])[0] = 0; }  for (byte b1 = 0; b1 < 2; ) { for (byte b2 = 0; b2 < 2; ) { ArrayList<ZH> arrayList; this(); int j; byte b3; for (j = arrayOfByte.length, b3 = 0; b3 < j; ) { int k, m; byte b4 = arrayOfByte[b3];
/*   7 */             um0 um0 = um0.Kt0; if (b1 == 1) { k = 1; } else { k = 0; }  if (b2 == 1) { m = 1; } else { m = 0; }
/*   8 */              if (!um0.rE0(b4, s, k, m))
/*   9 */             { ZH zH2; um0 = um0.Kt0; if (b1 == 1) { k = 1; } else { k = 0; }  if (b2 == 1) { m = 1; } else { m = 0; }
/*     */ 
/*     */               
/*  12 */               int n = zh0.oU; k = zh0.vC0; m = zh0.Ys0; int i1 = zh0.Fj;
/*  13 */               this(m, i1, zH1.TU()); (new ZH())
/*  14 */                 .Con.nM(zH1.Con, n, k, 0, 0, m, i1); zh0 zh0; ZH zH1;
/*  15 */               (zH1 = (zh0 = um0.H9(b4, s, k, m)[0]).jh0.cOm9()).dispose();
/*  16 */               Iterator<ZH> iterator2 = arrayList.iterator(); while (true) { if (iterator2.hasNext()) { zH1 = iterator2.next(); if (zH2.tp0().equals(zH1.tp0())) { zH2.dispose(); break; }  continue; }  arrayList.add(zH2); break; }  }  b3++; }  if (arrayList.size() > 1) { j = 1; } else { j = 0; }  for (b3 = 0; b3 < arrayList.size(); ) { String str1, str2; if (j != 0) { if (b3 == 0) { str1 = "-m"; } else { str1 = "-f"; }  } else { str1 = ""; }  ZipEntry zipEntry = new ZipEntry();
/*  17 */             StringBuilder stringBuilder = HB0.DH0("sprites/battlesprites/", s, "-"); if (b1 == 1)
/*  18 */             { str2 = "back"; } else { str2 = "front"; }  stringBuilder = stringBuilder.append(str2).append("-"); if (b2 == 1) { str2 = "s"; } else { str2 = "n"; }  this(stringBuilder.append(str2).append(str1).append(".png").toString()); paramdx0.putNextEntry(zipEntry); pB.TJ0(new eb(paramdx0), zH); ZH zH; (zH = arrayList.get(b3)).dispose(); paramdx0.closeEntry(); b3++; }  b2++; }  b1++; }
/*     */        }
/*     */      Uf0 uf0;
/*  21 */     if ((uf0 = um0.Kt0.da[0]) == null) this(); 
/*  22 */     DZ(paramdx0, uf0, "table-front-scale");
/*     */ 
/*     */     
/*  25 */     if ((uf0 = um0.Kt0.da[1]) == null) this(); 
/*  26 */     DZ(paramdx0, uf0, "table-back-scale");
/*     */ 
/*     */     
/*  29 */     if ((uf0 = um0.Kt0.da[2]) == null) this(); 
/*  30 */     DZ(paramdx0, uf0, "table-summary-scale");
/*  31 */     if (um0.Kt0
/*  32 */       .MI == null);
/*  33 */     paramdx0
/*  34 */       .putNextEntry(new ZipEntry("sprites/battlesprites/table-coordinate-mods.txt")); this(paramdx0); PrintWriter printWriter; (new PrintWriter()).write(";Table which determines coordinate modifications for battle sprites.\r\n"); (new PrintWriter()).write(";Lines starting with ; will be ignored\r\n"); (new PrintWriter()).write(";Please only include values for overriden sprites!\r\n"); (new PrintWriter()).write(";Each entry should be a separate line and contain ID,(FRONT/BACK)=X,Y,Z. Scale is clamped from -1 to 1. Default values for all fields are 0.\r\n"); (new PrintWriter()).write(";X: Negative values push left, positive values push right.\r\n"); (new PrintWriter()).write(";Y: Higher values push up, lower values push down.\r\n"); (new PrintWriter()).write(";Z: Higher values push away from the camera, lower values push towards the camera.\r\n"); (new PrintWriter()).write(";Scale is clamped from -1 to 1.\r\n"); (new PrintWriter()).write(";Example (Altitude mod only, increasing Y by 0.31): 1,front=0,0.31,0\r\n"); byte b; boolean[] arrayOfBoolean; (arrayOfBoolean = new boolean[b = 2])[0] = false; (new boolean[b = 2])[1] = true;
/*     */ 
/*     */     
/*  37 */     for (Iterator iterator1 = (On.v30()).iI0.values().iterator(); iterator1.hasNext(); )
/*  38 */     { short s; if ((s = ((UD0)iterator1.next()).AP) >= 1000) continue;  for (byte b1 = 0; b1 < b; )
/*  39 */       { eo eo; boolean bool = arrayOfBoolean[b1];
/*     */         
/*  41 */         int i = um0.EY(s, bool, false, (byte)0, false, false); um0 um0; Ut0 ut0;
/*  42 */         if ((ut0 = (um0 = um0.Kt0).MI) == null || 
/*  43 */           !ut0.return(i)) { eo = um0.YA; } else { eo = (eo)((um0)eo).MI.Z6(i); }  if (eo != 
/*  44 */           um0.YA) { String str; StringBuilder stringBuilder = (new StringBuilder()).append(s).append(","); if (bool) { str = "back"; } else { str = "front"; }  printWriter.write(stringBuilder.append(str).append("=").append(eo.x).append(",").append(eo.y).append(",").append(eo.z).append("\r\n").toString()); }  b1++; }  }  printWriter.flush(); paramdx0.closeEntry(); } public static void BX(dx0 paramdx0) { for (Iterator<UD0> iterator = (On.v30()).iI0.values().iterator(); iterator.hasNext(); ) { StringWriter stringWriter; wR wR; Ls0[] arrayOfLs0; UD0 uD0; short s; if ((s = (uD0 = iterator.next()).AP) < 1 || s >= 1000)
/*     */         continue;  BB bB; this(bB = BB.nc); this(); this(stringWriter); it.kI = bB; it.oS(wR); it.Qd(); it.Jv0(Short.valueOf(uD0.AP), "id"); it.Jv0(uD0.o60(false), "name"); it.Jv0(uD0.eb, "exp_type"); it.Jv0(Boolean.valueOf(uD0.lS ^ true), "obtainable"); it.Jv0(Integer.valueOf(uD0.FD), "gender_ratio"); it.Jv0(Short.valueOf(uD0.L90), "height"); It it; (it = new It()).Jv0(Short.valueOf(uD0.fu), "weight"); (new It()).Rg("egg_groups"); Ls0 ls01, ls02; if ((ls01 = uD0.I30) == (ls02 = uD0.LPt6)) { (arrayOfLs0 = new Ls0[1])[0] = ls01; } else { Ls0[] arrayOfLs01; (arrayOfLs01 = new Ls0[2])[0] = ls01; (new Ls0[2])[1] = (Ls0)arrayOfLs0; arrayOfLs0 = arrayOfLs01; }  int i, k; for (i = arrayOfLs0.length, k = 0; k < i; ) { String str1; if ((str1 = Ml0.OH0((arrayOfLs0[k]).Hr0 + 181000).toLowerCase()) == null) { it.d80(str1, null, null); } else { it.d80(str1, str1.getClass(), null); }  k++; }  it.Rw0(); it.Rg("abilities"); for (i = 0; i < 3; ) { it.Qd(); it.Jv0(Short.valueOf(uD0.zq0(i)), "id"); it.Jv0(Ml0.OH0(uD0.zq0(i) + 210000), "name"); it.cd0(); i++; }  it.Rw0(); if (!((uD0.h3 != null) ? 1 : 0)) { it.Rg("forms"); i = 0; while (i < uD0.Uf) { UD0 uD01; it.Qd(); if (uD0.TL > 0 && i > 0) { uD01 = On.v30().lpT3((short)(uD0.TL + i - 1)); } else { uD01 = uD0; }  it.Jv0(Byte.valueOf(i), "form_id"); it.Jv0(Short.valueOf(uD01.AP), "id"); it.Jv0(uD01.o60(true), "name"); it.cd0(); i = (byte)(i + 1); }  it.Rw0(); }
/*  46 */        it.Rg("evolutions"); for (Vx0 vx0 : uD0.WI) { it.Qd(); it.Jv0(Short.valueOf(vx0.uf0), "id"); it.Jv0(On.v30().lpT3(vx0.uf0).o60(false), "name");
/*     */         
/*  48 */         it.Jv0(vx0.Dv0, "type");
/*     */         
/*  50 */         it.Jv0(Integer.valueOf(vx0.DT), "val");
/*     */         
/*  52 */         if ((k = vx0.Dv0.ordinal()) != 6 && k != 8) { switch (k) { case 17: case 18: case 19: case 20: it
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  57 */                 .Jv0(Ml0.OH0((Of.eH.On0((short)vx0.DT)).Iu), "item_name"); break; }  it.cd0(); }  }  it.Rw0(); it.Rg("moves"); for (oC0 oC0 : uD0
/*  58 */         .hz0)
/*  59 */       { it.Qd(); it
/*     */           
/*  61 */           .Jv0(Short.valueOf(oC0.ly0), "id");
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  66 */         it.Jv0(Ml0.OH0((yk0.cw().mP(oC0.ly0)).iz), "name"); it.Jv0("level", "type");
/*     */         
/*  68 */         it.Jv0(Byte.valueOf(oC0.pE), "level"); it.cd0(); }  KM[] arrayOfKM; int j; for (j = (arrayOfKM = KM.xH).length, k = 0; k < j; ) { KM kM = arrayOfKM[k];
/*     */         short[] arrayOfShort;
/*     */         int m;
/*     */         byte b;
/*  72 */         for (m = (arrayOfShort = uD0.Pw0[kM.vp]).length, b = 0; b < m; ) { short s1 = arrayOfShort[b]; it.Qd(); it.Jv0(Short.valueOf(s1), "id"); it
/*     */ 
/*     */             
/*  75 */             .Jv0(Ml0.OH0((yk0.cw().mP(s1)).iz), "name"); it.Jv0(kM.name().toLowerCase(), "type"); it.cd0(); b++; }  k++; }  it.Rw0(); it.Rg("types");
/*     */       String str;
/*  77 */       if ((str = uD0.Sl0((byte)-1).toString()) == null) { it
/*  78 */           .d80(str, null, null); } else { it.d80(str, str.getClass(), null); }
/*     */       
/*  80 */       if ((str = uD0.pf0((byte)-1).toString()) == null) { it
/*  81 */           .d80(str, null, null); } else { it.d80(str, str.getClass(), null); }  it
/*  82 */         .Rw0(); str = "stats"; 
/*  83 */       try { it.q1.Lj0(str); it.Qd(); hR[] arrayOfHR;
/*  84 */         for (j = (arrayOfHR = hR.ka).length, k = 0; k < j; ) { String str2 = arrayOfHR[k].name().toLowerCase(); it.Jv0(Integer.valueOf(uD0.qC(arrayOfHR[k])), str2); k++; }  it.cd0(); String str1 = "yields"; try { Ag ag; it
/*  85 */             .q1.Lj0(str1); it.Qd();
/*     */           
/*  87 */           it.Jv0(Integer.valueOf(uD0.kn), "exp"); hR[] arrayOfHR1; for (j = (arrayOfHR1 = hR.ka).length, k = 0; k < j; ) { hR hR = arrayOfHR1[k];
/*     */             
/*  89 */             String str4 = B40.df("ev_").append(hR.name().toLowerCase()).toString();
/*     */ 
/*     */ 
/*     */             
/*  93 */             it.Jv0(Byte.valueOf(uD0.HL0[hR.dL]), str4); k++; }  it.cd0(); it.Rg("tiers");
/*     */           
/*     */           String str3;
/*  96 */           if ((str3 = Ml0.OH0(uD0.ee.mt0)) == null) { it
/*  97 */               .d80(str3, null, null); } else { it.d80(str3, str3.getClass(), null); }
/*     */           
/*  99 */           for (Iterator iterator2 = uD0.G2.iterator(); iterator2.hasNext(); )
/*     */           { String str4;
/* 101 */             if ((str4 = Ml0.OH0(((DO)iterator2.next()).mt0)) == null) { it
/* 102 */                 .d80(str4, null, null); continue; }  it.d80(str4, str4.getClass(), null); }  it
/* 103 */             .Rw0(); it.Rg("held_items");
/*     */           short[] arrayOfShort;
/* 105 */           for (j = (arrayOfShort = uD0.Ny).length, k = 0; k < j; ) { short s1 = arrayOfShort[k]; it.Qd(); it.Jv0(Short.valueOf(s1), "id"); it
/*     */ 
/*     */ 
/*     */               
/* 109 */               .Jv0(Ml0.OH0((Of.eH.On0(s1)).Iu), "name"); it.cd0(); k++; }  it.Rw0(); it.Rg("locations");
/* 110 */           k50 k50 = k50.Gp;
/* 111 */           j = uD0.AP;
/*     */           Jt jt;
/* 113 */           if ((jt = (Jt)k50.g90.Z90(j)) == null) { this(j); k50.g90.Vh0(j, jt); }
/*     */           
/* 115 */           Collections.sort(jt.s20); for (Iterator<Hq> iterator1 = jt.s20.iterator(); iterator1.hasNext(); ) { it.Qd();
/*     */             
/*     */             Hq hq;
/* 118 */             String str4 = Ml0.OH0((hq = iterator1.next()).Fg.oc0), str5 = "???"; if (((Hq)iterator1.next()).TG0((short)1)) str5 = Ml0.OH0(1774);  if (hq.TG0((short)2)) { str5 = Ml0.OH0(1782); } else if (hq.TG0((short)4)) { str5 = Ml0.OH0(1783); } else if (hq.TG0((short)8)) { str5 = Ml0.OH0(1784); } else if (hq.TG0((short)16)) { str5 = Ml0.OH0(1773); } else if (hq.TG0((short)64)) { str5 = Ml0.OH0(1795); } else if (hq.TG0((short)128)) { str5 = Ml0.OH0(1799); } else if (hq.TG0((short)256)) { str5 = Ml0.OH0(1794); }
/*     */ 
/*     */             
/* 121 */             String str6 = Ml0.la(hq.tO * 1000 + 140000 + (hq.h70 & 0xFF), "???"); if (hq.TG0((short)32)) str4 = str6 = Ml0.OH0(1798);  if (hq.gj()) { ArrayList<String> arrayList; this(); if (hq.Gj((byte)1)) arrayList.add(Ml0.OH0(oE.ZQ(oE.Q3)));  if (hq.Gj((byte)2)) arrayList.add(Ml0.OH0(oE.ZQ(oE.z70)));  if (hq.Gj((byte)4)) arrayList.add(Ml0.OH0(oE.ZQ(oE.g90)));  if (hq
/* 122 */                 .Ce > -1) arrayList
/*     */ 
/*     */                   
/* 125 */                   .add(B40.df("SEASON").append(hq.Ce).toString());  if (arrayList.size() > 0) { StringBuilder stringBuilder; this(); (new StringBuilder()).append(str6); (new StringBuilder()).append(" ("); int n; Iterator<String> iterator3; for (n = arrayList.size(), iterator3 = arrayList.iterator(); iterator3.hasNext(); ) { stringBuilder.append(iterator3.next()); if (n > 1) { stringBuilder.append("/"); n--; }  }  stringBuilder.append(")"); str6 = stringBuilder.toString(); }
/*     */                }
/* 127 */              int m; if ((m = hq.Fg.ordinal()) != 0) { if (m == 3)
/* 128 */               { byte b; if ((b = hq.Ra) < 0) b = 2; 
/* 129 */                 String str7 = Ml0.OH0(b + 245445); }  }
/* 130 */             else if ((m = hq.Ra) != 1) { if (m == 2)
/* 131 */                 str4 = Ml0.OH0(1793);  } else { str4 = Ml0.OH0(1792); }  it.Jv0(str4, "type"); it
/*     */               
/* 133 */               .Jv0(Byte.valueOf(hq.tO), "region_id");
/*     */             
/* 135 */             it.Jv0(Ml0.OH0(hq.tO + 250000), "region_name"); it.Jv0(str6, "location");
/*     */             
/* 137 */             it.Jv0(Byte.valueOf(hq.Ee0), "min_level");
/*     */             
/* 139 */             it.Jv0(Byte.valueOf(hq.Kn), "max_level"); it.Jv0(str5, "rarity");
/* 140 */             it.cd0(); }  it.Rw0(); it.cd0();
/*     */ 
/*     */           
/* 143 */           String str2 = it.q1.CoM9.toString();
/*     */ 
/*     */           
/* 146 */           BB bB1 = it.kI; (new nP()).Tg(str2.toCharArray(), (str2.toCharArray()).length).getClass();
/* 147 */           this(); COM3 cOM3; (cOM3 = new COM3()).gn0 = bB1; (new COM3()).JU = 0;
/* 148 */           this(512); bM0.zu0((new nP()).Tg(str2.toCharArray(), (str2.toCharArray()).length), new Ag(), 0, cOM3); paramdx0
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 153 */             .putNextEntry(new ZipEntry(N.Gl0(B40.df("info/"), uD0.AP, ".json"))); paramdx0.write(ag.toString().getBytes(StandardCharsets.UTF_8)); paramdx0.closeEntry(); } catch (IOException iOException)
/* 154 */         { throw new kN(iOException); }  } catch (IOException iOException) { throw new kN(iOException); }
/*     */        }
/*     */      }
/*     */ 
/*     */   
/*     */   public static void DZ(dx0 paramdx0, Uf0 paramUf0, String paramString) {
/*     */     paramdx0.putNextEntry(new ZipEntry(De0.AT("sprites/battlesprites/", paramString, ".txt")));
/*     */     this(paramdx0);
/*     */     PrintWriter printWriter;
/*     */     (new PrintWriter()).write(";Table which determines scales for battle sprites.\r\n");
/*     */     (new PrintWriter()).write(";Lines starting with ; will be ignored\r\n");
/*     */     (new PrintWriter()).write(";Please only include values for overriden sprites!\r\n");
/*     */     (new PrintWriter()).write(";Each entry should be a separate line and contain ID=SCALE, like \"1=3\" without quotes.\r\n");
/*     */     int i;
/*     */     short[] arrayOfShort1, arrayOfShort2;
/*     */     byte[] arrayOfByte;
/*     */     int j, k;
/*     */     for (arrayOfShort1 = new short[i = paramUf0.ir0], arrayOfByte = paramUf0.JO, j = (arrayOfShort2 = paramUf0.native).length, k = 0; j-- > 0;) {
/*     */       if (arrayOfByte[j] == 1) {
/*     */         int m = k + 1;
/*     */         arrayOfShort1[k] = arrayOfShort2[j];
/*     */         k = m;
/*     */       } 
/*     */     } 
/*     */     for (byte b = 0; b < i; ) {
/*     */       short s = arrayOfShort1[b];
/*     */       printWriter.write(s + "=" + paramUf0.Sp(s) + "\r\n");
/*     */       b++;
/*     */     } 
/*     */     printWriter.flush();
/*     */     paramdx0.closeEntry();
/*     */   }
/*     */   
/*     */   public static void vv(dx0 paramdx0) {
/*     */     char c;
/*     */     short s;
/*     */     for (c = 'ˈ', s = 0; s < c; ) {
/*     */       zh0[] arrayOfZh0;
/*     */       byte b;
/*     */       for (arrayOfZh0 = um0.Kt0.lb(s, false, (byte)0), b = 0; b < arrayOfZh0.length; ) {
/*     */         paramdx0.putNextEntry(new ZipEntry("sprites/monstericons/" + s + "-" + b + ".png"));
/*     */         ZH zH1 = (arrayOfZh0[b]).jh0.cOm9();
/*     */         int i = (arrayOfZh0[b]).oU, j = (arrayOfZh0[b]).vC0, k = (arrayOfZh0[b]).Ys0, m = (arrayOfZh0[b]).Fj;
/*     */         this(k, m, zH1.TU());
/*     */         zH2.Con.nM(zH1.Con, i, j, 0, 0, k, m);
/*     */         zH1.dispose();
/*     */         pB.TJ0(new eb(paramdx0), zH2);
/*     */         ZH zH2;
/*     */         (zH2 = new ZH()).dispose();
/*     */         paramdx0.closeEntry();
/*     */         b++;
/*     */       } 
/*     */       s = (short)(s + 1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void kI0(dx0 paramdx0) {
/*     */     for (byte b = 0; b < 5; ) {
/*     */       int[] arrayOfInt;
/*     */       c9 c9;
/*     */       if ((c9 = (c9)AD.case.Hm.Ha0(b)) == null) {
/*     */         arrayOfInt = new int[0];
/*     */       } else {
/*     */         arrayOfInt = ((c9)arrayOfInt).Nn0.YJ0();
/*     */       } 
/*     */       int i;
/*     */       byte b1;
/*     */       for (i = arrayOfInt.length, b1 = 0; b1 < i; ) {
/*     */         U70 u70;
/*     */         int j = arrayOfInt[b1];
/*     */         c9 c91;
/*     */         if ((c91 = (c9)AD.case.Hm.Ha0(b)) == null) {
/*     */           u70 = U70.ah0;
/*     */         } else {
/*     */           U70 u701;
/*     */           if ((u701 = (U70)((c9)u70).CX.Z6(j)) == null)
/*     */             u701 = (U70)((c9)u70).Nn0.Z6(j); 
/*     */           if (u701 == null) {
/*     */             u70 = U70.ah0;
/*     */           } else {
/*     */             u70 = u701;
/*     */           } 
/*     */         } 
/*     */         paramdx0.putNextEntry(new ZipEntry("sprites/trainersprites/" + b + "/" + j + ".png"));
/*     */         pB.TJ0(new eb(paramdx0), zH);
/*     */         ZH zH;
/*     */         (zH = u70.cOm9()).dispose();
/*     */         paramdx0.closeEntry();
/*     */         b1++;
/*     */       } 
/*     */       b = (byte)(b + 1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void kw0(dx0 paramdx0) {
/*     */     byte b1;
/*     */     byte[] arrayOfByte;
/*     */     byte b2;
/*     */     for ((arrayOfByte = new byte[b1 = 2])[0] = 0, (new byte[b1 = 2])[1] = 1, b2 = 0; b2 < b1; ) {
/*     */       byte b = arrayOfByte[b2];
/*     */       int arrayOfInt[], i;
/*     */       byte b3;
/*     */       for (i = (arrayOfInt = ((Le0)G00.Av0.Sl.Ha0(b)).Gi0.YJ0()).length, b3 = 0; b3 < i; ) {
/*     */         int j = arrayOfInt[b3];
/*     */         LJ lJ;
/*     */         byte b4;
/*     */         for (lJ = G00.Av0.Cx0(b, j, false), b4 = 0; b4 < 'Ϩ' && lJ.V(b4); ) {
/*     */           paramdx0.putNextEntry(new ZipEntry(N.Gl0((new StringBuilder()).append("sprites/overworldsprites/").append(b).append("/").append(j).append("-"), b4, ".png")));
/*     */           pB.TJ0(new eb(paramdx0), zH);
/*     */           ZH zH;
/*     */           (zH = lJ.LT(b4).cOm9()).dispose();
/*     */           paramdx0.closeEntry();
/*     */           b4++;
/*     */         } 
/*     */         b3++;
/*     */       } 
/*     */       b2++;
/*     */     } 
/*     */     qw0 qw0;
/*     */     (qw0 = km.mI0.AN.jv0).getClass();
/*     */     for (Iterator iterator = (new iL(qw0)).iterator(); ((DA0)iterator).hasNext(); ) {
/*     */       IB iB;
/*     */       U70[] arrayOfU70;
/*     */       if ((iB = (IB)((Ke)iterator).q00()).TN != 1 || (arrayOfU70 = iB.w70).length < 1)
/*     */         continue; 
/*     */       for (byte b = 0; b < arrayOfU70.length; ) {
/*     */         km.mI0.AN.getClass();
/*     */         paramdx0.putNextEntry(new ZipEntry(B40.df("sprites/overworldsprites/").append(2).append("/").append(iB.yp).append("-").append(b).append(".png").toString()));
/*     */         pB.TJ0(new eb(paramdx0), zH);
/*     */         ZH zH;
/*     */         (zH = arrayOfU70[b].cOm9()).dispose();
/*     */         paramdx0.closeEntry();
/*     */         b++;
/*     */       } 
/*     */     } 
/*     */     gD gD;
/*     */     if ((gD = km.mI0.MT) != null)
/*     */       gD.sk.m8(paramdx0::S8); 
/*     */     BE bE;
/*     */     if ((bE = km.mI0.yE) != null)
/*     */       bE.Vl0.m8(paramdx0::td); 
/*     */   }
/*     */   
/*     */   public static void Com6(dx0 paramdx0) {
/*     */     for (Iterator<UD0> iterator = (On.v30()).iI0.values().iterator(); iterator.hasNext(); ) {
/*     */       UD0 uD0;
/*     */       short s;
/*     */       byte[] arrayOfByte;
/*     */       if ((s = (uD0 = iterator.next()).AP) < 1 || s > 649 || (arrayOfByte = D0.g00(s)) == null || arrayOfByte.length < 1)
/*     */         continue; 
/*     */       paramdx0.putNextEntry(new ZipEntry(N.Gl0(B40.df("cries/"), uD0.AP, ".wav")));
/*     */       paramdx0.write(arrayOfByte);
/*     */       paramdx0.closeEntry();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void li0(dx0 paramdx0) {
/*     */     paramdx0.putNextEntry(new ZipEntry("info.xml"));
/*     */     Document document;
/*     */     (document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()).createElement("resource").setAttribute("name", "Dumped Resources");
/*     */     (document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()).createElement("resource").setAttribute("version", "0.0");
/*     */     (document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()).createElement("resource").setAttribute("description", "Directly dumped resources.");
/*     */     (document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()).createElement("resource").setAttribute("author", "--");
/*     */     (document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()).createElement("resource").setAttribute("weblink", "");
/*     */     DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().appendChild((document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()).createElement("resource"));
/*     */     this(document);
/*     */     StreamResult streamResult;
/*     */     DOMSource dOMSource;
/*     */     this(paramdx0);
/*     */     TransformerFactory.newInstance().newTransformer().setOutputProperty("indent", "yes");
/*     */     TransformerFactory.newInstance().newTransformer().setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
/*     */     TransformerFactory.newInstance().newTransformer().transform(dOMSource, streamResult);
/*     */     paramdx0.closeEntry();
/*     */   }
/*     */   
/*     */   public static void nN(dx0 paramdx0) {
/*     */     for (Iterator iterator = yk0.cw().jQ().iterator(); ((DA0)iterator).hasNext(); ) {
/*     */       Ag ag;
/*     */       StringWriter stringWriter;
/*     */       wR wR;
/*     */       WD wD;
/*     */       if ((wD = (WD)((Ke)iterator).q00()).HA < 1 || wD.Pj0())
/*     */         continue; 
/*     */       BB bB2;
/*     */       this(bB2 = BB.nc);
/*     */       this();
/*     */       this(stringWriter);
/*     */       it.kI = bB2;
/*     */       it.oS(wR);
/*     */       it.Qd();
/*     */       it.Jv0(Short.valueOf(wD.HA), "id");
/*     */       it.Jv0(Ml0.OH0(wD.iz), "name");
/*     */       it.Jv0(wD.Iq, "skill_damage_type");
/*     */       it.Jv0(Short.valueOf(wD.Di0), "base_power");
/*     */       it.Jv0(Byte.valueOf(wD.Jp0), "base_accuracy");
/*     */       it.Jv0(Byte.valueOf(wD.nul), "base_pp");
/*     */       it.Jv0(Byte.valueOf(wD.VT), "priority");
/*     */       it.Jv0(wD.Wt(null, null).toString(), "type");
/*     */       it.Jv0(Byte.valueOf(wD.DD), "target_type");
/*     */       It it;
/*     */       (it = new It()).Jv0(Boolean.valueOf(wD.WS), "true_damage");
/*     */       (new It()).cd0();
/*     */       String str = (new It()).q1.CoM9.toString();
/*     */       BB bB1 = it.kI;
/*     */       (new nP()).Tg(str.toCharArray(), (str.toCharArray()).length).getClass();
/*     */       this();
/*     */       COM3 cOM3;
/*     */       (cOM3 = new COM3()).gn0 = bB1;
/*     */       (new COM3()).JU = 0;
/*     */       this(512);
/*     */       bM0.zu0((new nP()).Tg(str.toCharArray(), (str.toCharArray()).length), new Ag(), 0, cOM3);
/*     */       paramdx0.putNextEntry(new ZipEntry(N.Gl0(B40.df("info/skills/"), wD.HA, ".json")));
/*     */       paramdx0.write(ag.toString().getBytes(StandardCharsets.UTF_8));
/*     */       paramdx0.closeEntry();
/*     */     } 
/*     */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */