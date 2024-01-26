/* 1 */ package f;public final class dn0 implements iq0 { public final String toString() { if ((this.Zg0 == 16)) {
/* 2 */       StringBuilder stringBuilder; String str; this(); if (ETC1.isValidPKM(this.B8, 0)) { str = "valid"; } else { str = "invalid"; }  return stringBuilder.append(str).append(" pkm [").append(ETC1.getWidthPKM(this.B8, 0)).append("x").append(ETC1.getHeightPKM(this.B8, 0)).append("], compressed: ").append(this.B8.capacity() - 16).toString();
/*   */     } 
/* 4 */     return B40.df("raw [").append(this.Tj0).append("x").append(this.Pq).append("], compressed: ").append(this.B8.capacity() - 16).toString(); }
/*   */ 
/*   */   
/*   */   public final int Tj0;
/*   */   public final int Pq;
/*   */   public final ByteBuffer B8;
/*   */   public final int Zg0;
/*   */   
/*   */   public dn0(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3) {
/*   */     this.Tj0 = paramInt1;
/*   */     this.Pq = paramInt2;
/*   */     this.B8 = paramByteBuffer;
/*   */     this.Zg0 = paramInt3;
/*   */     bI0();
/*   */   }
/*   */   
/*   */   public dn0(RD0 paramRD0) {
/*   */     byte[] arrayOfByte = new byte[10240];
/*   */     DataInputStream dataInputStream = null;
/*   */     try {
/*   */       DataInputStream dataInputStream1;
/*   */       this(new BufferedInputStream(new GZIPInputStream(paramRD0.Yc())));
/*   */       try {
/*   */         this.B8 = BufferUtils.xz((new DataInputStream()).readInt());
/*   */         int i;
/*   */         while ((i = dataInputStream1.read(arrayOfByte)) != -1)
/*   */           this.B8.put(arrayOfByte, 0, i); 
/*   */         this.B8.position(0);
/*   */         this.B8.limit(this.B8.capacity());
/*   */         Ui.JC0(dataInputStream1);
/*   */         this.Tj0 = ETC1.getWidthPKM(this.B8, 0);
/*   */         this.Pq = ETC1.getHeightPKM(this.B8, 0);
/*   */         this.Zg0 = 16;
/*   */         this.B8.position(16);
/*   */         return;
/*   */       } catch (Exception exception) {
/*   */         dataInputStream = dataInputStream1;
/*   */       } finally {}
/*   */       throw new JU("Couldn't load pkm file '" + paramRD0 + "'", exception);
/*   */     } catch (Exception exception) {
/*   */       throw new JU("Couldn't load pkm file '" + paramRD0 + "'", exception);
/*   */     } finally {
/*   */       Ui.JC0(dataInputStream);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     BufferUtils.lf(this.B8);
/*   */   }
/*   */   
/*   */   public final void bI0() {
/*   */     int i;
/*   */     if ((i = this.Tj0) != 0 && (i & i - 1) == 0) {
/*   */       i = 1;
/*   */     } else {
/*   */       i = 0;
/*   */     } 
/*   */     if (i != 0) {
/*   */       int j;
/*   */       if ((j = this.Pq) != 0 && (j & j - 1) == 0) {
/*   */         j = 1;
/*   */       } else {
/*   */         j = 0;
/*   */       } 
/*   */       if (j == 0) {
/*   */         System.out.println("ETC1Data warning: non-power-of-two ETC1 textures may crash the driver of PowerVR GPUs");
/*   */         return;
/*   */       } 
/*   */       return;
/*   */     } 
/*   */     System.out.println("ETC1Data warning: non-power-of-two ETC1 textures may crash the driver of PowerVR GPUs");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dn0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */