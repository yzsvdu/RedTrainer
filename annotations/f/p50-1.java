/* 1 */ package f;public class p50 { public static byte[] yf(String paramString) { byte[] arrayOfByte = paramString.getBytes(StandardCharsets.UTF_8); boolean bool = false; int i = arrayOfByte.length; try { MessageDigest.getInstance("MD5").update(arrayOfByte, bool, i); arrayOfByte = MessageDigest.getInstance("MD5").digest(); } catch (Exception exception) { arrayOfByte = new byte[0]; }  return arrayOfByte; }
/*   */ 
/*   */   
/*   */   public byte Lz;
/*   */   public final byte[] I1;
/*   */   public String qg;
/*   */   public String Um;
/*   */   public String TH0;
/*   */   public List ME = Collections.emptyList();
/*   */   
/*   */   public p50(byte paramByte, String paramString) {
/*   */     this(paramByte, paramString, "");
/*   */   }
/*   */   
/*   */   public p50(byte paramByte, String paramString1, String paramString2) {
/*   */     String str = paramString1.toLowerCase(Locale.ENGLISH);
/*   */     this.Lz = paramByte;
/*   */     this.qg = this;
/*   */     this.Um = paramString2;
/*   */     this.TH0 = "";
/*   */     this.I1 = yf(this);
/*   */   }
/*   */   
/*   */   public p50(byte paramByte, byte[] paramArrayOfbyte) {
/*   */     this.Lz = paramByte;
/*   */     this.qg = "";
/*   */     this.TH0 = "";
/*   */     this.I1 = paramArrayOfbyte;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = p50.class.hashCode() + this.Lz;
/*   */     i = Arrays.hashCode(this.I1) + i;
/*   */     i = this.Um.hashCode() + i;
/*   */     return this.TH0.hashCode() + i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (!(paramObject instanceof p50))
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.Lz != ((p50)paramObject).Lz) ? false : (!Arrays.equals(this.I1, ((p50)paramObject).I1) ? false : (!this.Um.equals(((p50)paramObject).Um) ? false : (!!this.TH0.equals(((p50)paramObject).TH0))));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/p50.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */