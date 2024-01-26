/* 1 */ package f;public final class TW extends kt { public final TW Ww(String paramString) { String[] arrayOfString; if (this.R80 >= paramString
/* 2 */       .length()) return null;  if (this.v6) { arrayOfString = (String[])Arrays.<String>stream(this.FD0).filter(paramString::dP).toArray(TW::fL); } else { arrayOfString = (String[])Arrays.<String>stream(this.FD0).filter(paramString::de).toArray(TW::Fg); }  int i = paramString.length(); return new TW(i, this.v6, arrayOfString); }
/*   */ 
/*   */   
/*   */   public final String[] FD0;
/*   */   public final boolean v6;
/*   */   
/*   */   public TW(boolean paramBoolean, ArrayList paramArrayList) {
/*   */     super(0);
/*   */     this.FD0 = (String[])paramArrayList.toArray((Object[])new String[0]);
/*   */     this.v6 = paramBoolean;
/*   */   }
/*   */   
/*   */   public TW(int paramInt, boolean paramBoolean, String... paramVarArgs) {
/*   */     super(paramInt);
/*   */     this.FD0 = (String[])paramVarArgs.clone();
/*   */     this.v6 = paramBoolean;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */