/*  1 */ package f;public final class Jp0 { public final String Xh0; public f7 CT; public final String UI0(String paramString) { f7 f71; if ((f71 = this.CT) != null) { String str; if ((str = (String)f71.pd0(paramString)) != null) return str;  throw new JU(B40.df("Element ")
/*  2 */           .append(this.Xh0).append(" doesn't have attribute: ").append(paramString).toString()); }  throw new JU(
/*  3 */         B40.df("Element ")
/*  4 */         .append(this.Xh0).append(" doesn't have attribute: ").append(paramString).toString()); } public fQ gu0; public String MK0; public Jp0(String paramString, Jp0 paramJp0) { this.Xh0 = paramString; } public final String Wu(String paramString1, String paramString2) { String str; f7 f71; return ((f71 = this.CT) == null) ? paramString2 : (((str = (String)pd0(paramString1)) == null) ? paramString2 : this); } public final String cB0(String paramString) { this(128); ag.V9(paramString); ag.yd0('<'); Ag ag; (ag = new Ag()).V9(this.Xh0); f7 f71;
/*  5 */     if ((f71 = this.CT) != null) { oc oc; (oc = f71.sh()).getClass(); while (oc.hasNext()) { yO yO = oc.next(); ag
/*  6 */           .yd0(' ');
/*    */         
/*  8 */         ag.V9((String)yO.Lb);
/*    */         
/* 10 */         ag.V9("=\"");
/*    */         
/* 12 */         ag.V9((String)yO.mm);
/* 13 */         ag.yd0('"'); }  }  String str; if (this
/* 14 */       .gu0 == null && ((str = this.MK0) == null || str.length() == 0)) { ag
/* 15 */         .V9("/>"); } else { ag
/*    */         
/* 17 */         .V9(">\n");
/* 18 */       str = paramString + '\t'; String str1; if ((str1 = this.MK0) != null && str1.length() > 0) { ag
/* 19 */           .V9(str);
/*    */         
/* 21 */         ag.V9(this.MK0);
/* 22 */         ag.yd0('\n'); }
/* 23 */        fQ fQ1; if ((fQ1 = this.gu0) != null) for (Hc0 hc0 = fQ1.r30(); hc0.hasNext(); ) { ag
/* 24 */             .V9(((Jp0)hc0.next()).cB0(str));
/* 25 */           ag.yd0('\n'); }   ag
/* 26 */         .V9(paramString);
/*    */       
/* 28 */       ag.V9("</");
/*    */       
/* 30 */       ag.V9(this.Xh0);
/* 31 */       ag.yd0('>'); }
/* 32 */      return ag.toString(); }
/*    */ 
/*    */   
/*    */   public final String toString() {
/*    */     return cB0("");
/*    */   }
/*    */   
/*    */   public final Jp0 cE(String paramString) {
/*    */     if (this.gu0 == null)
/*    */       return null; 
/*    */     fQ fQ1;
/*    */     for (byte b = 0; b < (fQ1 = this.gu0).Z8; b++) {
/*    */       Jp0 jp0;
/*    */       if ((jp0 = (Jp0)fQ1.get(b)).Xh0.equals(paramString))
/*    */         return jp0; 
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final fQ LG0(String paramString) {
/*    */     this();
/*    */     fQ fQ1;
/*    */     if (this.gu0 == null)
/*    */       return fQ1; 
/*    */     fQ fQ2;
/*    */     for (byte b = 0; b < (fQ2 = this.gu0).Z8; b++) {
/*    */       Jp0 jp0;
/*    */       if ((jp0 = (Jp0)fQ2.get(b)).Xh0.equals(paramString))
/*    */         fQ1.Com3(jp0); 
/*    */     } 
/*    */     return fQ1;
/*    */   }
/*    */   
/*    */   public final float r8(String paramString, float paramFloat) {
/*    */     String str;
/*    */     return ((str = Wu(paramString, null)) == null) ? paramFloat : Float.parseFloat(this);
/*    */   }
/*    */   
/*    */   public final int xT(int paramInt, String paramString) {
/*    */     String str;
/*    */     return ((str = Wu(paramString, null)) == null) ? paramInt : Integer.parseInt(this);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jp0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */