/*  1 */ package f;public final class cn0 { public static final ik q4 = C00.gd(cn0.class); public static Matcher c9 = Pattern.compile("\\n", 16).matcher(""); public RD0 jd0; public String aJ; public byte Wc; public byte Mt0; public F40 AH; public cn0(RD0 paramRD0) { this.Wc = -1; this.Mt0 = -1; this.AH = F40.ef0; this.lI = ""; this.H30 = ""; this.TO = null; this.LA = false; this.aj0 = false; this.dG0 = false; this.EL0 = null; this.jd0 = paramRD0; this.aJ = paramRD0.Lh0(); q4
/*  2 */       .info(B40.df("Loading possible string container: ").append(this.aJ).append(" (").append(paramRD0.vW()).append(")").toString()); try { BufferedInputStream bufferedInputStream; try { boolean bool1; XmlPullParser xmlPullParser; (xmlPullParser = uH0(bufferedInputStream = paramRD0.hQ(2048))).getEventType(); boolean bool3; int i; for (boolean bool2 = false; (i = xmlPullParser.next()) != 1;) { if (i == 2) { String str; if ((str = xmlPullParser.getName()).equals("strings") || str.equals("ds_strings_archive")) { this.lI = str1; String str1; if ((str1 = xmlPullParser.getAttributeValue(null, "lang")) == null || str1.isEmpty()) return;  if (!(this.lI = this.lI.toLowerCase(Locale.ENGLISH)).matches("^[a-zA-Z\\-_0-9]+$")) { this.lI = "INVALID"; return; }  this.H30 = str1; if ((str1 = xmlPullParser.getAttributeValue(null, "lang_full")) == null || str1.isEmpty()) this.H30 = this.lI;  this.TO = xmlPullParser.getAttributeValue(null, "typeface"); if (str.equals("strings")) { this.Wc = 0; if (((str1 = xmlPullParser.getAttributeValue(null, "is_primary")) != null && "1".equals(str1)) || "true".equals(str1)) this.LA = true;  if (((str1 = xmlPullParser.getAttributeValue(null, "is_override")) != null && "1".equals(str1)) || "true".equals(str1)) this.aj0 = true;  byte b; if ((str1 = xmlPullParser.getAttributeValue(null, "region_id")) != null && (b = Byte.parseByte(str1)) >= 0 && this.Mt0 < 5) this.Mt0 = b;  } else { this.Wc = 1; if ((str1 = xmlPullParser.getAttributeValue(null, "region_id")) == null) return;  this.Mt0 = b; byte b; if ((b = Byte.parseByte(str1)) < 0 || b >= 5) return;  String str2; if ((str2 = xmlPullParser.getAttributeValue(null, "archive_type")) == null) return;  if ((this.AH = F40.ZD0(Byte.parseByte(str2))) == null) return;  }  bool2 = true; if (bool3) break;  continue; }  bool3 = true; if (str.equals("string") && bool2) break;  }  }  if (bool2 && bool3) { bool1 = true; } else { bool1 = false; }  this.dG0 = bool1; } finally { Exception exception = null; }  } catch (Exception exception) { q4
/*    */         
/*  4 */         .error(B40.df("Error parsing string container ").append(this.aJ).toString(), exception); this.dG0 = false; }  } public String lI; public String H30; public String TO; public boolean LA; public boolean aj0; public boolean dG0; public Ut0 EL0; public static boolean Hd0(int paramInt, String paramString) { paramString = Ml0.LU(paramString); Ml0.nW.A3(paramInt, paramString); return true; } public static boolean UF0(boolean paramBoolean, int paramInt, String paramString) { if (!paramBoolean) paramString = Ml0.LU(paramString);  Ml0.nW.A3(paramInt, paramString); return true; } public final void f3(boolean paramBoolean) { Ut0 ut0; String str; if (paramBoolean && (str = this.TO) != null && !this.aj0) t90.md0 = str;  byte b; if ((b = this.Wc) == 0) { int j; if (this.EL0 == null) zJ0(null);  mE mE = paramBoolean::UF0; Ut0 ut01;
/*  5 */       byte[] arrayOfByte = (ut01 = this.EL0).JO;
/*  6 */       Object[] arrayOfObject = ut01.ND; int arrayOfInt[], i = (arrayOfInt = this.EL0.n20).length; do { j = arrayOfInt[i]; } while (i-- > 0 && (arrayOfByte[i] != 1 || mE.qa0(j, arrayOfObject[i]))); if (!paramBoolean)
/*  7 */       { mE = cn0::Hd0; Ut0 ut02;
/*  8 */         arrayOfByte = (ut02 = this.EL0).JO;
/*  9 */         Object[] arrayOfObject1 = ut02.ND; i = (arrayOfInt = this.EL0.n20).length; do { j = arrayOfInt[i]; } while (i-- > 0 && (arrayOfByte[i] != 1 || mE.qa0(j, arrayOfObject1[i]))); }  if (this
/* 10 */         .LA)
/* 11 */       { ut0 = this.EL0; wQ[] arrayOfWQ; int m; byte b1;
/* 12 */         for (m = (arrayOfWQ = wQ.values()).length, b1 = 0; b1 < m; )
/*    */         { wQ wQ; String str1;
/* 14 */           if ((str1 = (String)ut0.Z6((wQ = arrayOfWQ[b1]).JC0)) == null) str1 = "";  Ml0.aJ0.put(wQ, str1); b1++; }  for (int k = 110000; k < 110999; ) { if (ut0
/* 15 */             .return(k))
/* 16 */             Ml0.ha.uX(k);  k++; }  }  }
/* 17 */     else { zJ0(yK0); YK0 yK0; if (ut0 == true && !paramBoolean && (yK0 = Ml0.gn0(this.Mt0, this.AH)) != YK0.rq && this.Mt0 == 2) Ml0.N20(km.mI0.AN);  }  if (!paramBoolean) this
/* 18 */         .EL0 = null;  }
/*    */ 
/*    */   
/*    */   public static XmlPullParser uH0(BufferedInputStream paramBufferedInputStream) {
/*    */     XmlPullParserFactory.newInstance().newPullParser().setInput(paramBufferedInputStream, null);
/*    */     return XmlPullParserFactory.newInstance().newPullParser();
/*    */   }
/*    */   
/*    */   public final void zJ0(YK0 paramYK0) {
/*    */     this.EL0 = new Ut0(0);
/*    */     try {
/*    */       BufferedInputStream bufferedInputStream;
/*    */       try {
/*    */         XmlPullParser xmlPullParser;
/*    */         (xmlPullParser = uH0(bufferedInputStream = this.jd0.hQ(2048))).getEventType();
/*    */         boolean bool;
/*    */         int i, j, k, m, n;
/*    */         for (bool = false, i = 0, j = -1, k = -1, m = -1; (n = xmlPullParser.next()) != 1; ) {
/*    */           String str;
/*    */           if (n == 2) {
/*    */             if (xmlPullParser.getName().equals("string")) {
/*    */               bool = true;
/*    */               if ((n = this.Wc) == 0) {
/*    */                 if ((str = xmlPullParser.getAttributeValue(null, "id")) == null)
/*    */                   continue; 
/*    */                 try {
/*    */                   i = Integer.parseInt(str);
/*    */                 } catch (NumberFormatException numberFormatException) {}
/*    */                 continue;
/*    */               } 
/*    */               if (str == '\001') {
/*    */                 str = xmlPullParser.getAttributeValue(null, "table_id");
/*    */                 String str1 = xmlPullParser.getAttributeValue(null, "block_id");
/*    */                 j = Integer.parseInt(str);
/*    */                 k = Integer.parseInt(str1);
/*    */                 m = Integer.parseInt(xmlPullParser.getAttributeValue(null, "entry_id"));
/*    */               } 
/*    */             } 
/*    */             continue;
/*    */           } 
/*    */           if (str == '\003') {
/*    */             bool = false;
/*    */             continue;
/*    */           } 
/*    */           if (str == '\004' && bool) {
/*    */             byte b;
/*    */             if ((b = this.Wc) == 0) {
/*    */               if ((str1 = xmlPullParser.getText()).indexOf('|') > -1)
/*    */                 str1 = str1.replaceAll("\\|br\\|", "\n").replaceAll("\\|nb2\\|", "\n\n").replaceAll("\\|nb[\\d]?\\|", "\n"); 
/*    */               if (str1.indexOf('\\') > -1)
/*    */                 str1 = c9.reset(str1).replaceAll("\n"); 
/*    */               this.EL0.A3(i, str1);
/*    */               continue;
/*    */             } 
/*    */             if (str1 != '\001' || paramYK0 == null || j < 0 || k < 0 || m < 0)
/*    */               continue; 
/*    */             String str1;
/*    */             if ((str1 = xmlPullParser.getText()).indexOf('\\') > -1)
/*    */               str1 = c9.reset(str1).replaceAll("\n"); 
/*    */             paramYK0.f80(j, k, str1, m);
/*    */           } 
/*    */         } 
/*    */       } finally {
/*    */         paramYK0 = null;
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       q4.error(B40.df("Error parsing string container ").append(this.aJ).toString(), exception);
/*    */       this.dG0 = false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean Ha0() {
/*    */     if (this.Wc == 1)
/*    */       return true; 
/*    */     if (this.EL0 == null)
/*    */       zJ0(null); 
/*    */     this();
/*    */     TreeSet<Integer> treeSet;
/*    */     Ut0 ut0;
/*    */     int arrayOfInt[], i;
/*    */     byte b;
/*    */     for (i = (arrayOfInt = (ut0 = Ml0.nW).YJ0()).length, b = 0; b < i; ) {
/*    */       treeSet.add(Integer.valueOf(arrayOfInt[b]));
/*    */       b++;
/*    */     } 
/*    */     try {
/*    */       DOMSource dOMSource;
/*    */       StreamResult streamResult;
/*    */       String str1 = "lang";
/*    */       Document document;
/*    */       Element element;
/*    */       (element = (document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()).createElement("strings")).setAttribute(str1, this.lI);
/*    */       str1 = "is_primary";
/*    */       if (this.LA) {
/*    */       
/*    */       } else {
/*    */       
/*    */       } 
/*    */       String str2 = "0";
/*    */       element.setAttribute(str1, str2);
/*    */       str1 = "is_override";
/*    */       if (this.aj0) {
/*    */       
/*    */       } else {
/*    */       
/*    */       } 
/*    */       str2 = "0";
/*    */       element.setAttribute(str1, str2);
/*    */       document.appendChild(element);
/*    */       for (Iterator<Integer> iterator = treeSet.iterator(); iterator.hasNext(); ) {
/*    */         int j = ((Integer)iterator.next()).intValue();
/*    */         if ((str2 = (String)this.EL0.Z6(j)) == null)
/*    */           str2 = (String)ut0.Z6(j); 
/*    */         document.createElement("string").setAttribute("id", j + "");
/*    */         document.createElement("string").setTextContent(str2.replaceAll("\\\n", "\\\\n"));
/*    */         element.appendChild(document.createElement("string"));
/*    */       } 
/*    */       this(document);
/*    */       hZ hZ;
/*    */       (hZ = UB0.vj0.N0("dump/strings/dump_" + this.aJ)).wT().iz0();
/*    */       this(hZ.hh());
/*    */       TransformerFactory.newInstance().newTransformer().setOutputProperty("indent", "yes");
/*    */       TransformerFactory.newInstance().newTransformer().setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
/*    */       TransformerFactory.newInstance().newTransformer().transform(dOMSource, streamResult);
/*    */       this.EL0 = null;
/*    */       return true;
/*    */     } catch (Exception exception) {
/*    */       q4.error("dump error", exception);
/*    */       this.EL0 = null;
/*    */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final String cF() {
/*    */     this();
/*    */     stringBuilder.append(this.lI);
/*    */     stringBuilder.append('_');
/*    */     StringBuilder stringBuilder;
/*    */     (stringBuilder = new StringBuilder()).append(this.Wc);
/*    */     (new StringBuilder()).append('_');
/*    */     if (this.Wc == 1)
/*    */       stringBuilder.append(this.AH.DX).append('_'); 
/*    */     if (this.aj0)
/*    */       stringBuilder.append("override_"); 
/*    */     stringBuilder.append(this.Mt0);
/*    */     stringBuilder.append(".xml");
/*    */     return stringBuilder.toString();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cn0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */