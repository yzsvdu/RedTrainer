/* 1 */ package f;public final class u5 extends URLConnection { public final InputStream getInputStream() { if (!this.mJ0.endsWith(".xml")) { Pw.Ll0
/*   */         
/* 3 */         .error(B40.df("Unable to load ").append(this.mJ0).toString()); return null; }  return this.EB0.hQ(1024); }
/*   */ 
/*   */   
/*   */   public u5(URL paramURL, hZ paramhZ, String paramString) {
/*   */     super(paramURL);
/*   */   }
/*   */   
/*   */   public final void connect() {}
/*   */   
/*   */   public final Object getContent() {
/*   */     return this.EB0;
/*   */   }
/*   */   
/*   */   public final Object getContent(Class[] paramArrayOfClass) {
/*   */     throw new IOException();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/u5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */