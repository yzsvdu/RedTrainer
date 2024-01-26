/* 1 */ package f;public final class Wd { public static final ik ua = C00.gd(Wd.class); public boolean as0; public Yy0 TE; public Yy0 Va0; public static ZH IV(fk0 paramfk0, int[] paramArrayOfint) { byte[] arrayOfByte = paramfk0.gv(); ZH zH2 = null; switch (paramfk0.b70.ordinal()) { default: ua
/* 2 */           .info(B40.df("Unsupported format: ").append(paramfk0.b70).toString());
/*   */ 
/*   */ 
/*   */ 
/*   */         
/* 7 */         return zH2;case 5: s2 = paramfk0.public; s3 = paramfk0.fi0; this(s2, s3, Uc.xi0); (new ZH()).r1(y1.Zj); for (s2 = 0; s2 < paramfk0.fi0; ) { short s; for (s3 = 0; s3 < (s = paramfk0.public); ) { int i = arrayOfByte[s2 * s + s3] & 0x7; int j; i = (i = ((j = arrayOfByte[s2 * s + s3] >> 3 & 0x1F) << 3 | j >> 2) << 24 | paramArrayOfint[i] & 0xFFFFFF) << 8 | i >>> 24; zH2.Con.YO(s3, s2, i); s3++; }  s2++; }  return zH2;case 1: case 2: case 3: uc = Uc.se0; if (paramfk0.rW != 0) { paramArrayOfint[0] = 0; uc = Uc.xi0; }  s3 = paramfk0.public; this(s3, paramfk0.fi0, uc); (new ZH()).r1(y1.Zj); for (b = 0; b < paramfk0.fi0; ) { short s; for (s3 = 0; s3 < (s = paramfk0.public); ) { int i; if ((i = arrayOfByte[b * s + s3] & 0xFF) >= 0 && i < paramArrayOfint.length) { i = (i = paramArrayOfint[i]) << 8 | i >>> 24; zH3.Con.YO(s3, b, i); }  s3++; }  b++; }  zH1 = zH3; return zH1;case 0: break; }  short s1 = paramfk0.public, s3 = paramfk0.fi0; this(s1, s3, Uc.xi0); Uc uc; byte b; ZH zH1; short s2; ZH zH3; (new ZH()).r1(y1.Zj); for (s1 = 0; s1 < paramfk0.fi0; ) { short s; for (s3 = 0; s3 < (s = paramfk0.public); ) { int i = arrayOfByte[s1 * s + s3] & 0x1F; int j; i = (i = ((j = (j = arrayOfByte[s1 * s + s3] >> 5 & 0x7) << 2 | j >> 1) << 3 | j >> 2) << 24 | paramArrayOfint[i] & 0xFFFFFF) << 8 | i >>> 24; zH1.Con.YO(s3, s1, i); s3++; }  s1++; }  return zH1; }
/*   */ 
/*   */   
/*   */   public Nn K5;
/*   */   public Nn zg0;
/*   */   public int[] jt;
/*   */   
/*   */   public Wd(boolean paramBoolean, ByteBuffer paramByteBuffer) {
/*   */     Yy0 yy01;
/*   */     Yy0 yy02;
/*   */     this.as0 = false;
/*   */     int k = paramByteBuffer.position();
/*   */     if (paramByteBuffer.getInt() != 811091284) {
/*   */       ua.error("Not a valid TEX0 file");
/*   */       return;
/*   */     } 
/*   */     paramByteBuffer.getInt();
/*   */     paramByteBuffer.getInt();
/*   */     paramByteBuffer.getShort();
/*   */     paramByteBuffer.getShort();
/*   */     paramByteBuffer.getInt();
/*   */     int i = paramByteBuffer.getInt();
/*   */     paramByteBuffer.getInt();
/*   */     paramByteBuffer.getShort();
/*   */     paramByteBuffer.getShort();
/*   */     paramByteBuffer.getInt();
/*   */     int m = paramByteBuffer.getInt();
/*   */     paramByteBuffer.getInt();
/*   */     paramByteBuffer.getInt();
/*   */     paramByteBuffer.getInt();
/*   */     paramByteBuffer.getInt();
/*   */     int n = paramByteBuffer.getInt();
/*   */     int[] arrayOfInt2;
/*   */     (arrayOfInt2 = new int[2])[0] = i;
/*   */     (new int[2])[1] = m;
/*   */     this(paramByteBuffer, fk0::new, k, arrayOfInt2);
/*   */     this.TE = yy02;
/*   */     int[] arrayOfInt1;
/*   */     (arrayOfInt1 = new int[1])[0] = n;
/*   */     this(paramByteBuffer, ZA0::new, k, arrayOfInt1);
/*   */     this.Va0 = yy01;
/*   */     if (paramBoolean) {
/*   */       Iterator iterator = this.TE.iterator();
/*   */       Hc0 hc0;
/*   */       while ((hc0 = (Hc0)iterator).hasNext())
/*   */         ((fk0)hc0.next()).rW = 1; 
/*   */     } 
/*   */     this.K5 = new Nn(this.TE.size());
/*   */     this.zg0 = new Nn(this.Va0.size());
/*   */     byte b = 0;
/*   */     int j = this.TE.size();
/*   */     while (b < j) {
/*   */       String str = (this.TE.yO(b)).Ih;
/*   */       this.K5.X00(str, Integer.valueOf(b));
/*   */       b++;
/*   */     } 
/*   */     b = 0;
/*   */     j = this.Va0.size();
/*   */     while (b < j) {
/*   */       String str = (this.Va0.yO(b)).Ih;
/*   */       this.zg0.X00(str, Integer.valueOf(b));
/*   */       b++;
/*   */     } 
/*   */     this.as0 = true;
/*   */   }
/*   */   
/*   */   public final ZH bI(int paramInt1, int paramInt2) {
/*   */     fk0 fk0 = (fk0)this.TE.yO(paramInt1);
/*   */     ZA0 zA0 = (ZA0)this.Va0.yO(paramInt2);
/*   */     int[] arrayOfInt;
/*   */     if ((arrayOfInt = this.jt) == null)
/*   */       arrayOfInt = zA0.nH0(this.b70); 
/*   */     return IV(this, arrayOfInt);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */