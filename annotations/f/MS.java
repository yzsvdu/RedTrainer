/*  1 */ package f;public final class MS extends zA implements Zq0 { public final ArrayList lT = new ArrayList(); public final ArrayList bO = new ArrayList(); public final HashMap Cs0 = new HashMap<>(); public final ArrayList uI0 = new ArrayList(); public final StringBuilder HP = new StringBuilder(); public final int[] d00 = new int[2]; public Ct Ho0; public final void Oh(String paramString) { Ti ti; if ((paramString.length() > 5 && paramString.charAt(0) == '<' && (paramString.startsWith("<?xml") || paramString.startsWith("<!DOCTYPE") || paramString.startsWith("<html>"))))
/*  2 */     { StringReader stringReader; this(paramString); } else { String[] arrayOfString; (arrayOfString = new String[3])[0] = "<html><body>"; (new String[3])[1] = paramString; (new String[3])[2] = "</body></html>"; this(arrayOfString); }  this
/*  3 */       .lT.clear(); this.bO.clear(); this.Cs0.clear(); try { XmlPullParser xmlPullParser; (xmlPullParser = xS.Rp0()).setInput(ti); xS.Rp0().defineEntityReplacementText("nbsp", " "); xS.Rp0().require(0, null, null); xS.Rp0().nextTag(); xS.Rp0().require(2, null, "html"); this.uI0.clear(); this.uI0.add(new cR(null, null)); this.Ho0 = null; this.HP.setLength(0); while (xmlPullParser.nextTag() != 3) { xmlPullParser.require(2, null, null); String str = xmlPullParser.getName(); if ("head".equals(str)) { lD0(xmlPullParser); continue; }  if ("body".equals(str)) { jr jr; fu0(xmlPullParser); this(vC()); this.lT.add(jr); Nx(xmlPullParser, jr); }  }  Xl(xmlPullParser); if (this
/*  4 */         .HP.length() > 0) { qn0 qn0; cR cR = vC(); this(cR, this.HP.toString()); NF nF;
/*    */         String str;
/*  6 */         if ((nF = (new qn0()).X10.z0) != null && (
/*  7 */           str = nF.Ys0) != null) this
/*  8 */             .Cs0.put(str, qn0); 
/*  9 */         this.Ho0
/* 10 */           .k60
/* 11 */           .add(qn0);
/* 12 */         this.HP.setLength(0); }  }
/* 13 */     finally {} hm.Fz0(this.kG0);
/*    */ 
/*    */     
/* 16 */     Ui.JC0(ti); } public final Iterator iterator() { return this.lT.iterator(); } public final void Nx(XmlPullParser paramXmlPullParser, Ct paramCt) { Ct ct = this.Ho0; this.Ho0 = paramCt; fu0(null); Xl(paramXmlPullParser); int i; if ((i = this.uI0.size()) > 1) this.uI0.remove(i - 1);  this.Ho0 = ct; } public final void Xl(XmlPullParser paramXmlPullParser) { byte b; int i; label182: for (b = 1; b && (i = paramXmlPullParser.nextToken()) != 1; ) { char[] arrayOfChar; int j, arrayOfInt[], k; XA0 xA0; switch (i) { default: continue;case 6: this.HP.append(paramXmlPullParser.getText()); continue;case 4: arrayOfChar = paramXmlPullParser.getTextCharacters(this.d00); if ((k = (arrayOfInt = this.d00)[1]) > 0) this.HP.append(arrayOfChar, arrayOfInt[0], k);  continue;case 3: b--; if (this.HP.length() > 0) { qn0 qn0; cR cR1 = vC(); this(cR1, this.HP.toString()); NF nF1; String str; if ((nF1 = (new qn0()).X10.z0) != null && (str = nF1.Ys0) != null) this.Cs0.put(str, qn0);  this.Ho0.k60.add(qn0); this.HP.setLength(0); }  if ((j = this.uI0.size()) > 1) this.uI0.remove(j - 1);  continue;case 2: break; }  String str2 = paramXmlPullParser.getName(); if ("head".equals(str2)) { lD0(paramXmlPullParser); continue; }  b++; if (this.HP.length() > 0) { qn0 qn0; cR cR1 = vC(); this(cR1, this.HP.toString()); NF nF1; String str; if ((nF1 = (new qn0()).X10.z0) != null && (str = nF1.Ys0) != null) this.Cs0.put(str, qn0); 
/* 17 */         this.Ho0
/* 18 */           .k60
/* 19 */           .add(qn0);
/* 20 */         this.HP.setLength(0); }
/* 21 */        cR cR = fu0(paramXmlPullParser); if ("img".equals(str2)) { Cp cp; str2 = gd0.It0(paramXmlPullParser.getAttributeValue(null, "src")); String str = paramXmlPullParser.getAttributeValue(null, "alt"); this(cR, str2, str); } else if ("p".equals(str2)) { ft ft; this(cR); Nx(paramXmlPullParser, ft); b--; } else if ("button".equals(str2)) { ga ga; str2 = gd0.It0(paramXmlPullParser.getAttributeValue(null, "name")); String str = gd0.It0(paramXmlPullParser.getAttributeValue(null, "value")); this(cR, str2, str); } else if ("ul".equals(str2)) { Ct ct; this(cR); Nx(paramXmlPullParser, ct); b--; } else { Ct ct; String str; if ("ol".equals(str2)) { iv0 iv0; int m = 1; String str4;
/* 22 */           if ((str4 = paramXmlPullParser.getAttributeValue(null, "start")) != null) try { m = Integer.parseInt(str4); } catch (IllegalArgumentException illegalArgumentException) {} 
/* 23 */           this(m, cR); NF nF1;
/*    */           String str3;
/* 25 */           if ((nF1 = (new iv0()).X10.z0) != null && (
/* 26 */             str3 = nF1.Ys0) != null) this
/* 27 */               .Cs0.put(str3, iv0);  while (true)
/* 28 */           { int n; while ((n = paramXmlPullParser.nextTag()) != 2) { if (n != 3)
/* 29 */                 continue;  if ((n = this.uI0.size()) > 1) this.uI0.remove(n - 1); 
/* 30 */               if ("ol".equals(paramXmlPullParser.getName())) { b--; continue label182; }  }  fu0(paramXmlPullParser); if ("li".equals(paramXmlPullParser.getName())) { this(vC()); Nx(paramXmlPullParser, ct);
/*    */               NF nF2;
/* 32 */               if ((nF2 = ct.X10.z0) != null && (
/* 33 */                 str = nF2.Ys0) != null) this
/* 34 */                   .Cs0.put(str, ct);  iv0
/* 35 */                 .k60.add(ct); }  }  }
/* 36 */         else if ("li".equals(ct)) { Zc0 zc0; this((cR)str); Nx(paramXmlPullParser, zc0); b--; } else if ("div".equals(ct) || ((ct
/* 37 */           .length() == 2 && ct.charAt(0) == 'h' && ct.charAt(1) >= '0' && ct.charAt(1) <= '6')))
/*    */         { jr jr;
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
/* 55 */           this((cR)str); Nx(paramXmlPullParser, jr); b--; } else { String str3; if ("a".equals(ct)) { Cq0 cq0; if ((str3 = paramXmlPullParser.getAttributeValue(null, "href")) == null) continue;  this((cR)str, str3); Nx(paramXmlPullParser, cq0); b--; } else { int m; byte b1; if ("table".equals(str3)) { ArrayList<bJ> arrayList; ArrayList<cR> arrayList1; this(); this(); m = 0; int n = 0; String str4; if ((str4 = paramXmlPullParser.getAttributeValue(null, "cellspacing")) != null) try { n = Integer.parseInt(str4); } catch (IllegalArgumentException illegalArgumentException) {}  int i1 = 0; String str5; if ((str5 = paramXmlPullParser.getAttributeValue(null, "cellpadding")) != null) try { i1 = Integer.parseInt(str5); } catch (IllegalArgumentException illegalArgumentException) {}  while (true) { KN kN; int i2; while ((i2 = paramXmlPullParser.nextTag()) != 2) { if (i2 != 3) continue;  if ((i2 = this.uI0.size()) > 1) this.uI0.remove(i2 - 1);  String str7 = paramXmlPullParser.getName(); if ("tr".equals(str7) && !m) m = arrayList.size();  if ("table".equals(str7)) { KN kN1; int i3 = arrayList1.size(); this((cR)str, m, i3, n, i1); for (b1 = 0, n = 0; b1 < arrayList1.size(); ) { cR cR1 = arrayList1.get(b1); byte b2; for (kN1.nx0[b1] = cR1, b2 = 0; b2 < m && n < arrayList.size(); ) { bJ bJ = arrayList.get(n); int i4; if (b2 >= 0 && b2 < (i4 = kN1.g50)) { if (b1 >= 0 && b1 < kN1.bD) { kN1.Os0[b1 * i4 + b2] = bJ; b2++; n++; continue; }  throw new IndexOutOfBoundsException("row"); }  throw new IndexOutOfBoundsException("column"); }  b1++; }  b--; kN = kN1; continue label182; }  }  fu0(paramXmlPullParser); String str6 = paramXmlPullParser.getName(); if ("td".equals(str6) || "th".equals(str6)) { bJ bJ; int i3 = 1; String str7; if ((str7 = paramXmlPullParser.getAttributeValue(null, "colspan")) != null) try { i3 = Integer.parseInt(str7); } catch (IllegalArgumentException illegalArgumentException) {}  this(i3, vC()); Nx(paramXmlPullParser, new bJ()); NF nF1; String str8; if ((nF1 = bJ.X10.z0) != null && (str8 = nF1.Ys0) != null) this.Cs0.put(str8, bJ);  arrayList.add(bJ); for (byte b2 = 1; b2 < i3; ) { arrayList.add(null); b2++; }  }  if ("tr".equals(str6)) kN.add(vC());  }  } else if ("br".equals(m)) { this(b1); } else { continue; }  }  }  }  this.Ho0
/* 56 */         .k60
/* 57 */         .add(xA0); String str1;
/*    */       NF nF;
/* 59 */       if ((nF = xA0.X10.z0) != null && (
/* 60 */         str1 = nF.Ys0) != null) this
/* 61 */           .Cs0.put(str1, xA0);  }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void lD0(XmlPullParser paramXmlPullParser) {
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
/*    */         this.bO.add(str2); 
/*    */       if ("title".equals(str1)) {
/*    */         paramXmlPullParser.nextText();
/*    */         b--;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final cR vC() {
/*    */     return this.uI0.get(this.uI0.size() - 1);
/*    */   }
/*    */   
/*    */   public final cR fu0(XmlPullParser paramXmlPullParser) {
/*    */     cR cR1;
/*    */     NF nF;
/*    */     cR cR2 = vC();
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
/*    */     this.uI0.add(cR1);
/*    */     return cR1;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */