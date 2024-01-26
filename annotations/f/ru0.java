/* 1 */ package f;public final class ru0 { public final void ds() { ParseException parseException = new ParseException(); StringBuilder stringBuilder = B40.df("Unexpected "); if (this
/* 2 */       .Qq >= this.ae0.length()) { str2 = "end of expression"; }
/*   */     else
/* 4 */     { str2 = B40.df("'").append(Bn()).append("' at ").append(this.Qq + 1).toString(); }
/* 5 */      String str1 = stringBuilder.append(str2).toString(); this(this, this.Qq);
/*   */     String str2;
/*   */     throw parseException; }
/*   */ 
/*   */   
/*   */   public final String ae0;
/*   */   public int Qq;
/*   */   
/*   */   public ru0(String paramString) {
/*   */     this.ae0 = paramString;
/*   */   }
/*   */   
/*   */   public final char Bn() {
/*   */     return this.ae0.charAt(this.Qq);
/*   */   }
/*   */   
/*   */   public final boolean At() {
/*   */     boolean bool;
/*   */     while (true) {
/*   */       boolean bool1;
/*   */       if (this.Qq < this.ae0.length()) {
/*   */         bool1 = true;
/*   */       } else {
/*   */         bool1 = false;
/*   */       } 
/*   */       if (bool1 && Character.isWhitespace(Bn())) {
/*   */         this.Qq++;
/*   */         continue;
/*   */       } 
/*   */       break;
/*   */     } 
/*   */     if (this.Qq < this.ae0.length()) {
/*   */       bool = true;
/*   */     } else {
/*   */       bool = false;
/*   */     } 
/*   */     return bool;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ru0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */