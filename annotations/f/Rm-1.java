/* 1 */ package f;public class Rm extends rh { public final String jw() { HashMap hashMap; String str; if ((hashMap = this.bK0) != null && (
/* 2 */       str = (String)hashMap.get(Integer.valueOf(this.T8))) != null) return str;
/*   */     
/* 4 */     return NumberFormat.getNumberInstance().format(this.T8); }
/*   */ 
/*   */   
/*   */   public Rm(zT paramzT) {
/*   */     super(paramzT);
/*   */   }
/*   */   
/*   */   public final String X7() {
/*   */     return super.jw();
/*   */   }
/*   */   
/*   */   public final boolean UX(String paramString) {
/*   */     try {
/*   */       paramString = paramString.replace(' ', ' ');
/*   */       NumberFormat numberFormat;
/*   */       if (numberFormat = NumberFormat.getNumberInstance() instanceof DecimalFormat)
/*   */         paramString = paramString.replace(((DecimalFormat)numberFormat).getDecimalFormatSymbols().getDecimalSeparator(), ((DecimalFormat)numberFormat).getDecimalFormatSymbols().getGroupingSeparator()); 
/*   */       Number number;
/*   */       if ((number = numberFormat.parse(paramString)) != null) {
/*   */         l4(number.intValue());
/*   */         return true;
/*   */       } 
/*   */       throw new NumberFormatException();
/*   */     } catch (Exception exception) {
/*   */       R8 r8;
/*   */       if ((r8 = km.u4) != null)
/*   */         Pq(Ml0.OH0(5896)); 
/*   */       return false;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final String I40(String paramString) {
/*   */     try {
/*   */       String str = paramString.replace(' ', ' ');
/*   */       NumberFormat numberFormat;
/*   */       if (numberFormat = NumberFormat.getNumberInstance() instanceof DecimalFormat)
/*   */         str = replace(((DecimalFormat)numberFormat).getDecimalFormatSymbols().getDecimalSeparator(), ((DecimalFormat)numberFormat).getDecimalFormatSymbols().getGroupingSeparator()); 
/*   */       Number number;
/*   */       if ((number = numberFormat.parse(this)) == null)
/*   */         return "Error"; 
/*   */       intValue();
/*   */       return null;
/*   */     } catch (Exception exception) {
/*   */       return "Error";
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Rm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */