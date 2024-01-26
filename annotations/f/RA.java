/* 1 */ package f;public final class RA extends Hx implements Serializable { public final String toString() { this(); StringBuilder stringBuilder; (new StringBuilder())
/* 2 */       .append(RA.class.getSimpleName()); (new StringBuilder()).append("("); if (this.Dy != null) for (byte b = 0; b < this.Dy.size(); ) { if (b > 0) stringBuilder.append(",");  String str; if ((str = (String)this.Dy.get(b)) == null) { str = "null"; } else { str = str.toString(); }  stringBuilder.append(str); b++; }   stringBuilder.append(")"); return stringBuilder.toString(); }
/*   */ 
/*   */   
/*   */   private static final long serialVersionUID = 7215974688563965257L;
/*   */   public final ArrayList Dy;
/*   */   
/*   */   public RA(ArrayList<? extends E> paramArrayList) {
/*   */     ArrayList arrayList;
/*   */     this(paramArrayList);
/*   */     this.Dy = this;
/*   */   }
/*   */   
/*   */   public final boolean accept(File paramFile) {
/*   */     if (this.Dy.isEmpty())
/*   */       return false; 
/*   */     Iterator iterator = this.Dy.iterator();
/*   */     while (hasNext()) {
/*   */       if (!((Fj)next()).accept(paramFile))
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final boolean accept(File paramFile, String paramString) {
/*   */     if (this.Dy.isEmpty())
/*   */       return false; 
/*   */     Iterator iterator = this.Dy.iterator();
/*   */     while (hasNext()) {
/*   */       if (!((Fj)next()).accept(paramFile, paramString))
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RA.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */