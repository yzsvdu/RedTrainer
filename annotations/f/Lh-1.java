/* 1 */ package f;public final class Lh { public final void zF(String paramString1, String paramString2) { int i; Matcher matcher; if ((matcher = Pattern.compile(paramString1).matcher(paramString2)).find()) { String[] arrayOfString; int j, k = 2; try { k = Integer.parseInt(paramString2 = (arrayOfString = matcher.group(1).split("\\."))[0]); } catch (NumberFormatException numberFormatException) { UB0.Kg0.O70("libGDX GL", "Error parsing number: " + paramString2 + ", assuming: " + k); }  this
/* 2 */         .qV = k; if (arrayOfString.length < 2) { i = 0; } else { k = 0; 
/* 3 */         try { i = Integer.parseInt(paramString2 = arrayOfString[1]); } catch (NumberFormatException numberFormatException) { UB0.Kg0.O70("libGDX GL", "Error parsing number: " + i + ", assuming: " + k); i = k; }  }  this
/* 4 */         .GS = i; if (arrayOfString.length < 3) { j = 0; } else { i = 0; 
/* 5 */         try { j = Integer.parseInt(j = j[2]); } catch (NumberFormatException numberFormatException) { UB0.Kg0.O70("libGDX GL", "Error parsing number: " + j + ", assuming: " + i); j = i; }  }  this
/* 6 */         .bB = j; } else { UB0.Kg0.HC("GLVersion", "Invalid version string: " + i); this.qV = 2; this.GS = 0; this.bB = 0; }
/*   */      }
/*   */ 
/*   */   
/*   */   public int qV;
/*   */   public int GS;
/*   */   public int bB;
/*   */   public final String YX;
/*   */   public final String Ie0;
/*   */   public final s1 WY;
/*   */   
/*   */   public Lh(Dp0 paramDp0, String paramString1, String paramString2, String paramString3) {
/*   */     if (paramDp0 == Dp0.uM || paramDp0 == Dp0.QG) {
/*   */       this.WY = s1.Lm0;
/*   */     } else if (paramDp0 == Dp0.Ro0 || paramDp0 == Dp0.pe) {
/*   */       this.WY = s1.Ri0;
/*   */     } else if (paramDp0 == Dp0.Qn) {
/*   */       this.WY = s1.SF;
/*   */     } else {
/*   */       this.WY = s1.ri0;
/*   */     } 
/*   */     s1 s11;
/*   */     if ((s11 = this.WY) == s1.Lm0) {
/*   */       zF("OpenGL ES (\\d(\\.\\d){0,2})", paramString1);
/*   */     } else if (s11 == s1.SF) {
/*   */       zF("WebGL (\\d(\\.\\d){0,2})", paramString1);
/*   */     } else if (s11 == s1.Ri0) {
/*   */       zF("(\\d(\\.\\d){0,2})", paramString1);
/*   */     } else {
/*   */       this.qV = -1;
/*   */       this.GS = -1;
/*   */       this.bB = -1;
/*   */       paramString2 = "";
/*   */       paramString3 = "";
/*   */     } 
/*   */     this.YX = paramString2;
/*   */     this.Ie0 = paramString3;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lh.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */