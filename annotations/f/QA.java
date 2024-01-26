/* 1 */ package f;public final class QA extends Hx implements Serializable { public final String toString() { this(); StringBuilder stringBuilder; (new StringBuilder())
/* 2 */       .append(QA.class.getSimpleName()); (new StringBuilder()).append("("); if (this.kA0 != null) for (byte b = 0; b < this.kA0.size(); ) { if (b > 0) stringBuilder.append(",");  String str; if ((str = (String)this.kA0.get(b)) == null) { str = "null"; } else { str = str.toString(); }  stringBuilder.append(str); b++; }   stringBuilder.append(")"); return stringBuilder.toString(); }
/*   */ 
/*   */   
/*   */   private static final long serialVersionUID = 5767770777065432721L;
/*   */   public final ArrayList kA0;
/*   */   
/*   */   public QA(ArrayList<? extends E> paramArrayList) {
/*   */     ArrayList arrayList;
/*   */     this(paramArrayList);
/*   */     this.kA0 = this;
/*   */   }
/*   */   
/*   */   public final boolean accept(File paramFile) {
/*   */     Iterator iterator = this.kA0.iterator();
/*   */     while (hasNext()) {
/*   */       if (((Fj)next()).accept(paramFile))
/*   */         return true; 
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final boolean accept(File paramFile, String paramString) {
/*   */     Iterator iterator = this.kA0.iterator();
/*   */     while (hasNext()) {
/*   */       if (((Fj)next()).accept(paramFile, paramString))
/*   */         return true; 
/*   */     } 
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QA.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */