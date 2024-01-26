/* 1 */ package f;public final class NUl extends RD0 { public final RD0 f0(String paramString) { paramString = paramString.replace('\\', '/'); if (this.ml.getPath().length() == 0) return new NUl(this.B, (new File(paramString)).getPath()); 
/* 2 */     return new NUl(this.B, (new File(this.ml, paramString))
/* 3 */         .getPath()); }
/*   */ 
/*   */   
/*   */   public final ZipFile B;
/*   */   public final ZipEntry Ov;
/*   */   
/*   */   public NUl(ZipFile paramZipFile, String paramString) {
/*   */     super(paramString.replace('\\', '/'), G20.Uc);
/*   */     this.B = paramZipFile;
/*   */     this.Ov = paramZipFile.getEntry(paramString.replace('\\', '/'));
/*   */   }
/*   */   
/*   */   public final RD0 rB0(String paramString) {
/*   */     paramString = paramString.replace('\\', '/');
/*   */     if (this.ml.getPath().length() != 0)
/*   */       return new NUl(this.B, (new File(this.ml.getParent(), paramString)).getPath()); 
/*   */     throw new JU("Cannot get the sibling of the root.");
/*   */   }
/*   */   
/*   */   public final RD0 wT() {
/*   */     File file;
/*   */     if ((file = this.ml.getParentFile()) == null)
/*   */       if (this.KU == G20.O30) {
/*   */         this("/");
/*   */       } else {
/*   */         this("");
/*   */       }  
/*   */     ZipFile zipFile = this.B;
/*   */     return new NUl(this, file.getPath());
/*   */   }
/*   */   
/*   */   public final InputStream Yc() {
/*   */     try {
/*   */       return this.B.getInputStream(this.Ov);
/*   */     } catch (IOException iOException) {
/*   */       throw new JU(B40.df("File not found: ").append(this.ml).append(" (Archive)").toString());
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean L0() {
/*   */     return (this.Ov != null);
/*   */   }
/*   */   
/*   */   public final long tN() {
/*   */     return this.Ov.getSize();
/*   */   }
/*   */   
/*   */   public final long tn() {
/*   */     return this.Ov.getTime();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NUl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */