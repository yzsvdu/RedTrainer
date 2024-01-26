/*  1 */ package f;public final class wH0 extends zA implements Zq0 { public final ArrayList hk0 = new ArrayList(); public final ArrayList dl = new ArrayList(); public final HashMap Z80 = new HashMap<>(); public final ArrayList S = new ArrayList(); public final StringBuilder Nz0 = new StringBuilder(); public final int[] mj = new int[2]; public Ct final; public jr Jj = null; public Runnable HW; public final void BK(String paramString) { boolean bool; Ti ti; if (paramString.length() > 5 && paramString.charAt(0) == '<' && (paramString.startsWith("<?xml") || paramString.startsWith("<!DOCTYPE") || paramString.startsWith("<html>"))) { bool = true; } else { bool = false; }  if (bool)
/*  2 */     { StringReader stringReader; this(paramString); } else { String[] arrayOfString; (arrayOfString = new String[3])[0] = "<html><body>"; (new String[3])[1] = paramString; (new String[3])[2] = "</body></html>"; this(arrayOfString); }  this
/*  3 */       .hk0.clear(); this.dl.clear(); this.Z80.clear(); try { XmlPullParser xmlPullParser; (xmlPullParser = xS.Rp0()).setInput(ti); xS.Rp0().defineEntityReplacementText("nbsp", " "); xS.Rp0().require(0, null, null); xS.Rp0().nextTag(); xS.Rp0().require(2, null, "html"); this.S.clear(); this.S.add(new cR(null, null)); this.final = null; this.Nz0.setLength(0); while (xmlPullParser.nextTag() != 3) { xmlPullParser.require(2, null, null); String str = xmlPullParser.getName(); if ("head".equals(str)) { gG0(xmlPullParser); continue; }  if ("body".equals(str)) { jr jr1; F0(xmlPullParser); this(IW()); this.Jj = new jr(); this.hk0.add(jr1); MC(xmlPullParser, this.Jj); }  }  i50(xmlPullParser); DK0(); }
/*  4 */     finally { paramString = null; }
/*    */ 
/*    */     
/*  7 */     Ui.JC0(ti); } public final Iterator iterator() { return this.hk0.iterator(); } public final void i50(XmlPullParser paramXmlPullParser) { byte b; int i; label173: for (b = 1; b && (i = paramXmlPullParser.nextToken()) != 1; ) { char[] arrayOfChar; int j, arrayOfInt[], k; XA0 xA0; switch (i) { default: continue;case 6: this.Nz0.append(paramXmlPullParser.getText()); continue;case 4: arrayOfChar = paramXmlPullParser.getTextCharacters(this.mj); if ((k = (arrayOfInt = this.mj)[1]) > 0) this.Nz0.append(arrayOfChar, arrayOfInt[0], k);  continue;case 3: b--; DK0(); if ((j = this.S.size()) > 1) this.S.remove(j - 1);  continue;case 2: break; }  String str2 = paramXmlPullParser.getName(); if ("head".equals(str2)) { gG0(paramXmlPullParser); continue; }  b++; DK0(); cR cR = F0(paramXmlPullParser); if ("img".equals(str2)) { Cp cp; str2 = gd0.It0(paramXmlPullParser.getAttributeValue(null, "src")); String str = paramXmlPullParser.getAttributeValue(null, "alt"); this(cR, str2, str); } else if ("p".equals(str2)) { ft ft; this(cR); MC(paramXmlPullParser, ft); b--; } else if ("button".equals(str2)) { ga ga; str2 = gd0.It0(paramXmlPullParser.getAttributeValue(null, "name")); String str = gd0.It0(paramXmlPullParser.getAttributeValue(null, "value")); this(cR, str2, str); } else if ("ul".equals(str2)) { Ct ct; this(cR); MC(paramXmlPullParser, ct); b--; } else { Ct ct; String str; if ("ol".equals(str2)) { iv0 iv0; int m = 1; String str4; if ((str4 = paramXmlPullParser.getAttributeValue(null, "start")) != null) try { m = Integer.parseInt(str4); } catch (IllegalArgumentException illegalArgumentException) {}  this(m, cR); String str3; NF nF1; if ((nF1 = (new iv0()).X10.z0) != null && (str3 = nF1.Ys0) != null) this
/*  8 */               .Z80.put(str3, iv0);  while (true)
/*  9 */           { int n; while ((n = paramXmlPullParser.nextTag()) != 2) { if (n != 3)
/* 10 */                 continue;  if ((n = this.S.size()) > 1) this.S.remove(n - 1); 
/* 11 */               if ("ol".equals(paramXmlPullParser.getName())) { b--; continue label173; }  }  F0(paramXmlPullParser); if ("li".equals(paramXmlPullParser.getName())) { this(IW()); MC(paramXmlPullParser, ct);
/*    */               NF nF2;
/* 13 */               if ((nF2 = ct.X10.z0) != null && (
/* 14 */                 str = nF2.Ys0) != null) this
/* 15 */                   .Z80.put(str, ct);  iv0
/* 16 */                 .k60.add(ct); }  }  }
/* 17 */         else if ("li".equals(ct)) { Zc0 zc0; this((cR)str); MC(paramXmlPullParser, zc0); b--; } else if ("playername".equals(ct)) { zc0 zc0; if (paramXmlPullParser.getAttributeValue(null, "name") == null) continue;  this((cR)str); MC(paramXmlPullParser, zc0); b--; } else if ("div".equals(ct) || ((ct
/* 18 */           .length() == 2 && ct.charAt(0) == 'h' && ct.charAt(1) >= '0' && ct.charAt(1) <= '6')))
/*    */         { jr jr1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 36 */           this((cR)str); MC(paramXmlPullParser, jr1); b--; } else { String str3; if ("a".equals(ct)) { Cq0 cq0; if ((str3 = paramXmlPullParser.getAttributeValue(null, "href")) == null) continue;  this((cR)str, str3); MC(paramXmlPullParser, cq0); b--; } else { int m; byte b1; if ("table".equals(str3)) { ArrayList<bJ> arrayList; ArrayList<cR> arrayList1; this(); this(); m = 0; int n = 0; String str4; if ((str4 = paramXmlPullParser.getAttributeValue(null, "cellspacing")) != null) try { n = Integer.parseInt(str4); } catch (IllegalArgumentException illegalArgumentException) {}  int i1 = 0; String str5; if ((str5 = paramXmlPullParser.getAttributeValue(null, "cellpadding")) != null) try { i1 = Integer.parseInt(str5); } catch (IllegalArgumentException illegalArgumentException) {}  while (true) { KN kN; int i2; while ((i2 = paramXmlPullParser.nextTag()) != 2) { if (i2 != 3) continue;  if ((i2 = this.S.size()) > 1) this.S.remove(i2 - 1);  String str7 = paramXmlPullParser.getName(); if ("tr".equals(str7) && !m) m = arrayList.size();  if ("table".equals(str7)) { KN kN1; int i3 = arrayList1.size(); this((cR)str, m, i3, n, i1); for (b1 = 0, n = 0; b1 < arrayList1.size(); ) { cR cR1 = arrayList1.get(b1); byte b2; for (kN1.nx0[b1] = cR1, b2 = 0; b2 < m && n < arrayList.size(); ) { bJ bJ = arrayList.get(n); int i4; if (b2 >= 0 && b2 < (i4 = kN1.g50)) { if (b1 >= 0 && b1 < kN1.bD) { kN1.Os0[b1 * i4 + b2] = bJ; b2++; n++; continue; }  throw new IndexOutOfBoundsException("row"); }  throw new IndexOutOfBoundsException("column"); }  b1++; }  b--; kN = kN1; continue label173; }  }  F0(paramXmlPullParser); String str6 = paramXmlPullParser.getName(); if ("td".equals(str6) || "th".equals(str6)) { bJ bJ; int i3 = 1; String str7; if ((str7 = paramXmlPullParser.getAttributeValue(null, "colspan")) != null) try { i3 = Integer.parseInt(str7); } catch (IllegalArgumentException illegalArgumentException) {}  this(i3, IW()); MC(paramXmlPullParser, new bJ()); NF nF1; String str8; if ((nF1 = bJ.X10.z0) != null && (str8 = nF1.Ys0) != null) this.Z80.put(str8, bJ);  arrayList.add(bJ); for (byte b2 = 1; b2 < i3; ) { arrayList.add(null); b2++; }  }  if ("tr".equals(str6)) kN.add(IW());  }  } else if ("br".equals(m)) { this(b1); } else { continue; }  }  }  }  this.final
/* 37 */         .k60
/* 38 */         .add(xA0); NF nF;
/*    */       String str1;
/* 40 */       if ((nF = xA0.X10.z0) != null && (
/* 41 */         str1 = nF.Ys0) != null) this
/* 42 */           .Z80.put(str1, xA0);  }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void K7(String paramString) {
/*    */     if (this.Jj == null)
/*    */       BK(""); 
/*    */     this(new String[] { paramString });
/*    */     Runnable runnable;
/*    */     Ti ti;
/*    */     try {
/*    */       XmlPullParser xmlPullParser;
/*    */       (xmlPullParser = xS.Rp0()).setInput(ti);
/*    */       xS.Rp0().defineEntityReplacementText("nbsp", " ");
/*    */       if (this.S.isEmpty())
/*    */         this.S.add(new cR(null, null)); 
/*    */       MC(xmlPullParser, this.Jj);
/*    */       DK0();
/*    */       Ui.JC0(ti);
/*    */     } finally {
/*    */       paramString = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void MC(XmlPullParser paramXmlPullParser, Ct paramCt) {
/*    */     Ct ct = this.final;
/*    */     this.final = paramCt;
/*    */     F0(null);
/*    */     i50(paramXmlPullParser);
/*    */     int i;
/*    */     if ((i = this.S.size()) > 1)
/*    */       this.S.remove(i - 1); 
/*    */     this.final = ct;
/*    */   }
/*    */   
/*    */   public final void gG0(XmlPullParser paramXmlPullParser) {
/*    */     byte b = 1;
/*    */     while (b) {
/*    */       int i;
/*    */       if ((i = paramXmlPullParser.nextTag()) != 2) {
/*    */         if (i != 3)
/*    */           continue; 
/*    */         b--;
/*    */         continue;
/*    */       } 
/*    */       b++;
/*    */       String str1 = paramXmlPullParser.getName();
/*    */       String str2 = paramXmlPullParser.getAttributeValue(null, "href");
/*    */       if ("link".equals(str1) && "stylesheet".equals(paramXmlPullParser.getAttributeValue(null, "rel")) && "text/css".equals(paramXmlPullParser.getAttributeValue(null, "type")) && str2 != null)
/*    */         this.dl.add(str2); 
/*    */       if ("title".equals(str1)) {
/*    */         paramXmlPullParser.nextText();
/*    */         b--;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final cR IW() {
/*    */     return this.S.get(this.S.size() - 1);
/*    */   }
/*    */   
/*    */   public final cR F0(XmlPullParser paramXmlPullParser) {
/*    */     cR cR1;
/*    */     NF nF;
/*    */     cR cR2 = IW();
/*    */     String str1 = null;
/*    */     String str2 = null;
/*    */     if (paramXmlPullParser != null) {
/*    */       NF nF1;
/*    */       String str = paramXmlPullParser.getAttributeValue(null, "class");
/*    */       str1 = paramXmlPullParser.getName();
/*    */       str2 = paramXmlPullParser.getAttributeValue(null, "id");
/*    */       this(str1, str, str2);
/*    */       str2 = paramXmlPullParser.getAttributeValue(null, "style");
/*    */       nF = nF1;
/*    */     } 
/*    */     if (str2 != null) {
/*    */       this(cR2, nF, str2);
/*    */     } else {
/*    */       this(cR2, nF);
/*    */     } 
/*    */     this.S.add(cR1);
/*    */     return cR1;
/*    */   }
/*    */   
/*    */   public final void DK0() {
/*    */     if (this.Nz0.length() > 0) {
/*    */       qn0 qn0;
/*    */       cR cR = IW();
/*    */       this(cR, this.Nz0.toString());
/*    */       String str;
/*    */       NF nF;
/*    */       if ((nF = (new qn0()).X10.z0) != null && (str = nF.Ys0) != null)
/*    */         this.Z80.put(str, qn0); 
/*    */       this.final.k60.add(qn0);
/*    */       this.Nz0.setLength(0);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */