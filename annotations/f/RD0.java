/* 1 */ package f;public class RD0 { public File ml; public G20 KU; public RD0() {} public RD0(String paramString) { this.ml = new File(paramString); this.KU = G20.O30; } public RD0(File paramFile) { this.ml = paramFile; this.KU = G20.O30; } public RD0(String paramString, G20 paramG20) { File file; this.KU = paramG20; this(paramString); this.ml = this; } public RD0(File paramFile, G20 paramG20) { this.ml = paramFile; this.KU = paramG20; } public static void O(File paramFile, boolean paramBoolean) { File[] arrayOfFile; if (paramFile.exists() && (arrayOfFile = paramFile.listFiles()) != null) { byte b = 0; int i = arrayOfFile.length; while (b < i) { if (!arrayOfFile[b].isDirectory()) { arrayOfFile[b].delete(); } else if (paramBoolean) { O(arrayOfFile[b], true); } else { xF0(arrayOfFile[b]); }  b++; }  }  } public static boolean xF0(File paramFile) { O(paramFile, false); return paramFile.delete(); } public static void Lu0(RD0 paramRD01, RD0 paramRD02) { paramRD02.iz0(); byte b = 0; RD0[] arrayOfRD0; int i = (arrayOfRD0 = paramRD01.pn()).length; while (true) { if (b < i)
/*   */       
/* 3 */       { RD0 rD01, rD02 = paramRD02.f0((rD01 = arrayOfRD0[b]).ml.getName()); if (rD01.Qg0()) { Lu0(rD01, rD02); } else { try { rD02
/* 4 */               .Ia(rD01.Yc()); b++; } catch (Exception exception) { throw new JU(
/* 5 */                 B40.df("Error copying source file: ")
/* 6 */                 .append(rD01.ml).append(" (").append(rD01.KU).append(")\nTo destination: ").append(rD02.ml).append(" (").append(rD02.KU).append(")").toString(), exception); }  continue; }  } else { break; }  b++; }  } public final String rw() { return this.ml.getPath().replace('\\', '/'); } public final String Lh0() { return this.ml.getName(); } public final String il0() { String str; int i; return ((i = (str = this.ml.getName()).lastIndexOf('.')) == -1) ? "" : substring(i + 1); } public final String k6() { String str; int i; return ((i = (str = this.ml.getName()).lastIndexOf('.')) == -1) ? this : substring(0, i); } public final G20 vW() { return this.KU; } public File bo() { if (this.KU == G20.yx) { UB0.vj0.getClass(); return new File(XG.com5, this.ml.getPath()); }  return this.ml; } public InputStream Yc() { G20 g20; if ((g20 = this.KU) == G20.Uc || (g20 == G20.iD && !bo().exists()) || (this.KU == G20.XS && !bo().exists())) { InputStream inputStream; if ((inputStream = RD0.class.getResourceAsStream(B40.df("/").append(this.ml.getPath().replace('\\', '/')).toString())) != null) return inputStream;  throw new JU(
/* 7 */           B40.df("File not found: ")
/* 8 */           .append(this.ml).append(" (").append(this.KU).append(")").toString()); }  try { return new FileInputStream(bo()); } catch (Exception exception) { if (bo().isDirectory()) throw new JU(B40.df("Cannot open a stream to a directory: ").append(this.ml).append(" (").append(this.KU).append(")").toString(), exception);  throw new JU(B40.df("Error reading file: ").append(this.ml).append(" (").append(this.KU).append(")").toString(), exception); }  } public BufferedInputStream hQ(int paramInt) { return new BufferedInputStream(Yc(), paramInt); } public final String mM() { return QM(null); } public final String QM(String paramString) { StringBuilder stringBuilder = new StringBuilder(); int i; if ((i = (int)tN()) == 0) i = 512;  this(i); InputStreamReader inputStreamReader = null; if (paramString == null) { try { InputStreamReader inputStreamReader1; this(Yc()); inputStreamReader = inputStreamReader1; char[] arrayOfChar = new char[256]; } catch (IOException iOException) { throw new JU("Error reading layout file: " + this, iOException); } finally {} } else { InputStreamReader inputStreamReader1; this(Yc(), (String)iOException); inputStreamReader = inputStreamReader1; char[] arrayOfChar = new char[256]; }  Ui.JC0(inputStreamReader); throw this; } public byte[] iy0() { InputStream inputStream = Yc(); try { int i; if ((i = (int)tN()) == 0) i = 512;  Ui.JC0(inputStream); return Ui.Vn(inputStream, i); } catch (IOException iOException) { throw new JU("Error reading file: " + this, iOException); } finally {} Ui.JC0(inputStream); throw this; } public final RD0[] pn() { if (this.KU != G20.Uc) { String[] arrayOfString; if ((arrayOfString = bo().list()) == null) return new RD0[0];  RD0[] arrayOfRD0; byte b; int i; for (arrayOfRD0 = new RD0[arrayOfString.length], b = 0, i = arrayOfString.length; b < i; ) { arrayOfRD0[b] = f0(arrayOfString[b]); b++; }  return arrayOfRD0; }  throw new JU(B40.df("Cannot list a classpath directory: ").append(this.ml).toString()); } public final RD0[] fx(FilenameFilter paramFilenameFilter) { if (this.KU != G20.Uc) { File file; String[] arrayOfString; if ((arrayOfString = (file = bo()).list()) == null) return new RD0[0];  RD0[] arrayOfRD0; byte b1; byte b2; int i; for (arrayOfRD0 = new RD0[arrayOfString.length], b1 = 0, b2 = 0, i = arrayOfString.length; b2 < i; ) { String str; if (paramFilenameFilter.accept(file, str = arrayOfString[b2])) { arrayOfRD0[b1] = f0(str); b1++; }  b2++; }  if (b1 < arrayOfString.length) { arrayOfRD0 = new RD0[b1]; System.arraycopy(arrayOfRD0, 0, arrayOfRD0, 0, b1); }  return arrayOfRD0; }  throw new JU(B40.df("Cannot list a classpath directory: ").append(this.ml).toString()); } public final RD0[] XX(String paramString) { if (this.KU != G20.Uc) { String[] arrayOfString; if ((arrayOfString = bo().list()) == null) return new RD0[0];  RD0[] arrayOfRD0; byte b1; byte b2; int i; for (arrayOfRD0 = new RD0[arrayOfString.length], b1 = 0, b2 = 0, i = arrayOfString.length; b2 < i; ) { String str; if ((str = arrayOfString[b2]).endsWith(paramString)) { arrayOfRD0[b1] = f0(str); b1++; }  b2++; }  if (b1 < arrayOfString.length) { arrayOfRD0 = new RD0[b1]; System.arraycopy(arrayOfRD0, 0, arrayOfRD0, 0, b1); }  return arrayOfRD0; }  throw new JU(B40.df("Cannot list a classpath directory: ").append(this.ml).toString()); } public final void S2(RD0 paramRD0) { if (!Qg0()) { if (paramRD0.Qg0()) paramRD0 = paramRD0.f0(this.ml.getName());  try { paramRD0.Ia(Yc()); return; } catch (Exception exception) { throw new JU(B40.df("Error copying source file: ").append(this.ml).append(" (").append(this.KU).append(")\nTo destination: ").append(paramRD0.ml).append(" (").append(paramRD0.KU).append(")").toString(), exception); }  }  if (paramRD0.L0()) { if (!paramRD0.Qg0()) throw new JU("Destination exists but is not a directory: " + paramRD0);  } else { paramRD0.iz0(); if (!paramRD0.Qg0()) throw new JU("Destination directory cannot be created: " + paramRD0);  }  Lu0(this, paramRD0.f0(this.ml.getName())); } public final boolean Qg0() { return (this.KU == G20.Uc) ? false : bo().isDirectory(); } public RD0 f0(String paramString) { if (this.ml.getPath().length() == 0) { this(paramString); return new RD0(this, this.KU); }  this(((RD0)super).ml, paramString); File file1; File file2; return new RD0(file2, ((RD0)super).KU); } public RD0 rB0(String paramString) { if (this.ml.getPath().length() != 0) { File file; this(this.ml.getParent(), paramString); return new RD0(file, this.KU); }  throw new JU("Cannot get the sibling of the root."); } public RD0 wT() { File file; if ((file = this.ml.getParentFile()) == null) if (this.KU == G20.O30) { this("/"); } else { this(""); }   return new RD0(file, this.KU); } public final void iz0() { G20 g20; if ((g20 = this.KU) != G20.Uc) { if (g20 != G20.iD) { bo().mkdirs(); return; }  throw new JU(B40.df("Cannot mkdirs with an internal file: ").append(this.ml).toString()); }  throw new JU(B40.df("Cannot mkdirs with a classpath file: ").append(this.ml).toString()); } public boolean L0() { int i; if ((i = ds0.qp0[this.KU.ordinal()]) != 1) { if (i != 2) return bo().exists();  } else if (bo().exists()) { return true; }  return (RD0.class.getResource(B40.df("/").append(this.ml.getPath().replace('\\', '/')).toString()) != null); } public final boolean La0() { G20 g20; if ((g20 = this.KU) != G20.Uc) { if (g20 != G20.iD) return bo().delete();  throw new JU(B40.df("Cannot delete an internal file: ").append(this.ml).toString()); }  throw new JU(B40.df("Cannot delete a classpath file: ").append(this.ml).toString()); } public final void mp(RD0 paramRD0) { switch (ds0.qp0[this.KU.ordinal()]) { case 3: case 4: if (bo().renameTo(paramRD0.bo())) return;  break;case 2: throw new JU(B40.df("Cannot move a classpath file: ").append(this.ml).toString());case 1: throw new JU(B40.df("Cannot move an internal file: ").append(this.ml).toString()); }  S2(paramRD0); La0(); if (L0() && Qg0()) { G20 g20; if ((g20 = this.KU) != G20.Uc) { if (g20 != G20.iD) { xF0(bo()); } else { throw new JU(B40.df("Cannot delete an internal file: ").append(this.ml).toString()); }  } else { throw new JU(B40.df("Cannot delete a classpath file: ")
/* 9 */             .append(this.ml).toString()); }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public long tN() {
/*   */     G20 g20;
/*   */     if ((g20 = this.KU) == G20.Uc || (g20 == G20.iD && !this.ml.exists()))
/*   */       try {
/*   */         return (inputStream = Yc()).available();
/*   */       } catch (Exception exception) {
/*   */         return 0L;
/*   */       } finally {
/*   */         Ui.JC0(this);
/*   */       }  
/*   */     return super.bo().length();
/*   */   }
/*   */   
/*   */   public long tn() {
/*   */     return bo().lastModified();
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (!(paramObject instanceof RD0))
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.KU == ((RD0)paramObject).KU && rw().equals(paramObject.rw()));
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = (this.KU.hashCode() + 37) * 67;
/*   */     return rw().hashCode() + i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.ml.getPath().replace('\\', '/');
/*   */   }
/*   */   
/*   */   public void m30(byte[] paramArrayOfbyte, int paramInt) {
/*   */     byte b = 0;
/*   */     InputStream inputStream = Yc();
/*   */     int i = 0;
/*   */     while (true) {
/*   */       int j = b + i;
/*   */       int k = paramInt - i;
/*   */       try {
/*   */         if ((j = inputStream.read(paramArrayOfbyte, j, k)) <= 0) {
/*   */           Ui.JC0(inputStream);
/*   */           return;
/*   */         } 
/*   */         i += j;
/*   */         continue;
/*   */       } catch (IOException iOException) {
/*   */         throw new JU("Error reading file: " + this, iOException);
/*   */       } finally {}
/*   */       Ui.JC0(inputStream);
/*   */       throw this;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final MappedByteBuffer fg0(FileChannel.MapMode paramMapMode) {
/*   */     if (this.KU != G20.Uc) {
/*   */       RandomAccessFile randomAccessFile = null;
/*   */       try {
/*   */         File file = bo();
/*   */         RandomAccessFile randomAccessFile1 = new RandomAccessFile();
/*   */         if (paramMapMode == FileChannel.MapMode.READ_ONLY) {
/*   */         
/*   */         } else {
/*   */         
/*   */         } 
/*   */         String str = "rw";
/*   */         this(file, str);
/*   */       } catch (Exception exception) {
/*   */       
/*   */       } finally {
/*   */         RandomAccessFile randomAccessFile1;
/*   */         this = null;
/*   */       } 
/*   */       throw new JU("Error memory mapping file: " + this + " (" + this.KU + ")", exception);
/*   */     } 
/*   */     throw new JU("Cannot map a classpath file: " + this);
/*   */   }
/*   */   
/*   */   public OutputStream hh() {
/*   */     boolean bool = false;
/*   */     G20 g20;
/*   */     if ((g20 = this.KU) != G20.Uc) {
/*   */       if (g20 != G20.iD) {
/*   */         wT().iz0();
/*   */         try {
/*   */           return new FileOutputStream(bo(), bool);
/*   */         } catch (Exception exception) {
/*   */           if (bo().isDirectory())
/*   */             throw new JU(B40.df("Cannot open a stream to a directory: ").append(this.ml).append(" (").append(this.KU).append(")").toString(), exception); 
/*   */           throw new JU(B40.df("Error writing file: ").append(this.ml).append(" (").append(this.KU).append(")").toString(), exception);
/*   */         } 
/*   */       } 
/*   */       throw new JU(B40.df("Cannot write to an internal file: ").append(this.ml).toString());
/*   */     } 
/*   */     throw new JU(B40.df("Cannot write to a classpath file: ").append(this.ml).toString());
/*   */   }
/*   */   
/*   */   public final void Ia(InputStream paramInputStream) {
/*   */     OutputStream outputStream = null;
/*   */     try {
/*   */       outputStream = hh();
/*   */       byte[] arrayOfByte = new byte[4096];
/*   */       int i;
/*   */       for (; (i = paramInputStream.read(arrayOfByte)) != -1; outputStream.write(arrayOfByte, 0, i));
/*   */     } catch (Exception exception) {
/*   */     
/*   */     } finally {}
/*   */     Ui.JC0(paramInputStream);
/*   */     Ui.JC0(outputStream);
/*   */   }
/*   */   
/*   */   public final OutputStreamWriter ud0(String paramString) {
/*   */     boolean bool = false;
/*   */     G20 g20;
/*   */     if ((g20 = this.KU) != G20.Uc) {
/*   */       if (g20 != G20.iD) {
/*   */         wT().iz0();
/*   */         try {
/*   */           FileOutputStream fileOutputStream;
/*   */           this(bo(), bool);
/*   */           return (paramString == null) ? new OutputStreamWriter(fileOutputStream) : new OutputStreamWriter(fileOutputStream, paramString);
/*   */         } catch (IOException iOException) {
/*   */           if (bo().isDirectory())
/*   */             throw new JU(B40.df("Cannot open a stream to a directory: ").append(this.ml).append(" (").append(this.KU).append(")").toString(), iOException); 
/*   */           throw new JU(B40.df("Error writing file: ").append(this.ml).append(" (").append(this.KU).append(")").toString(), iOException);
/*   */         } 
/*   */       } 
/*   */       throw new JU(B40.df("Cannot write to an internal file: ").append(this.ml).toString());
/*   */     } 
/*   */     throw new JU(B40.df("Cannot write to a classpath file: ").append(this.ml).toString());
/*   */   }
/*   */   
/*   */   public final void vF0(String paramString1, String paramString2) {
/*   */     OutputStreamWriter outputStreamWriter = null;
/*   */     try {
/*   */       (outputStreamWriter = ud0(paramString2)).write(paramString1);
/*   */       Ui.JC0(ud0(paramString2));
/*   */       return;
/*   */     } catch (Exception exception) {
/*   */       throw new JU("Error writing file: " + this.ml + " (" + this.KU + ")", exception);
/*   */     } finally {}
/*   */     Ui.JC0(outputStreamWriter);
/*   */     throw this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */