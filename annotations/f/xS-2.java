/* 1 */ package f;public final class xS implements Closeable { public static final Class[] Ub0 = new Class[] { XmlPullParser.class }; public static boolean QI = true; public final XmlPullParser bb; public final String Rm0; public final InputStream IA; public final BitSet wJ0 = new BitSet(); public String WJ0 = xS.class.getName(); public static XmlPullParser Rp0() { if (QI) try { return (XmlPullParser)new MXParserCachingStrings(); } finally { Exception exception = null; QI = false; }   XmlPullParserFactory xmlPullParserFactory; if ((xmlPullParserFactory = nd.Ky0) != null) return xmlPullParserFactory.newPullParser();  throw nd.coM3; } public xS(URL paramURL) { XmlPullParser xmlPullParser = null; InputStream inputStream = null; this.Rm0 = paramURL.toString(); try { xmlPullParser = (XmlPullParser)paramURL.getContent(Ub0); } finally {} if (xmlPullParser == null) { xmlPullParser = Rp0(); if ((inputStream = paramURL.openStream()) != null) { xmlPullParser.setInput(inputStream, "UTF8"); } else { throw new FileNotFoundException(this.Rm0); }  }  this.bb = xmlPullParser; this.IA = inputStream; } public final String Jg0(String paramString) { String str2; if ((str2 = S3(paramString)) != null) return str2;  String str1 = "missing '" + paramString + "' on '" + this.bb.getName() + "'"; throw new XmlPullParserException(this, this.bb, null); } public final void close() { InputStream inputStream; if ((inputStream = this.IA) != null) close();  } public final boolean aM() { return (this.bb.getEventType() == 3); } public final boolean GC(String paramString, boolean paramBoolean) { if ((paramString = S3(paramString)) == null) return paramBoolean;  if ("true".equals(paramString)) { boolean bool = true; } else { if ("false".equals(paramString)) return false;  throw new XmlPullParserException("boolean value must be 'true' or 'false'", this.bb, null); }  return this; } public final XmlPullParserException s70(String paramString) { return new XmlPullParserException(paramString, this.bb, null); } public final XmlPullParserException q70(String paramString, Throwable paramThrowable) { return (XmlPullParserException)(new XmlPullParserException(paramString, this.bb, paramThrowable)).initCause(paramThrowable); }
/* 2 */   public final XmlPullParserException Zl0() { String str = B40.df("Unexpected '").append(this.bb.getName()).append("'").toString(); return new XmlPullParserException(this, this.bb, null); } public final Enum dj(Class<Enum> paramClass, String paramString) { try { return Enum.valueOf(paramClass, paramString.toUpperCase(Locale.ENGLISH)); } catch (IllegalArgumentException illegalArgumentException) { try { return Enum.valueOf(paramClass, paramString); } catch (IllegalArgumentException illegalArgumentException1) { String str = "Unknown enum value \"" + paramString + "\" for enum class " + paramClass; throw new XmlPullParserException(this, this.bb, null); }  }  } public final int ts(String paramString) { try { return Integer.parseInt(paramString); } catch (NumberFormatException numberFormatException) { throw (XmlPullParserException)(new XmlPullParserException("Unable to parse integer", this.bb, numberFormatException)).initCause(numberFormatException); }  }
/* 3 */   public final void V60() { if (!this.wJ0.isEmpty()) { String str = this.bb.getPositionDescription(); if (this.Rm0 != null) str = zw.vz(str, " in ").append(this.Rm0).toString();  int i = -1;
/* 4 */       while ((i = this.wJ0.nextSetBit(i + 1)) >= 0) {
/*   */         
/* 6 */         arrayOfObject[0] = this.bb.getAttributeName(i); Object[] arrayOfObject; (arrayOfObject = new Object[3])[1] = this.bb.getName(); (new Object[3])[2] = str; Logger.getLogger(this.WJ0).log(Level.WARNING, "Unused attribute ''{0}'' on ''{1}'' at {2}", arrayOfObject);
/*   */       }  }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int pI(int paramInt, String paramString) {
/*   */     return ((paramString = S3(paramString)) == null) ? paramInt : ts(paramString);
/*   */   }
/*   */   
/*   */   public final void LX() {
/*   */     V60();
/*   */     this.wJ0.clear();
/*   */     if (this.bb.nextTag() == 2)
/*   */       this.wJ0.set(0, this.bb.getAttributeCount()); 
/*   */   }
/*   */   
/*   */   public final String S3(String paramString) {
/*   */     byte b;
/*   */     int i;
/*   */     for (b = 0, i = this.bb.getAttributeCount(); b < i; ) {
/*   */       if (paramString.equals(this.bb.getAttributeName(b))) {
/*   */         this.wJ0.clear(b);
/*   */         return this.bb.getAttributeValue(b);
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */     return null;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */