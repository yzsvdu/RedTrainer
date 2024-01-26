/*  1 */ package com.badlogic.gdx.graphics.g2d;public class Gdx2DPixmap implements iq0 { public long dx0; public int ju; public int Og0; public static int HO(int paramInt) { switch (paramInt) { default: throw new JU(XD0.SD0("unknown format: ", paramInt));
/*  2 */       case 4: case 6: return 6408;case 3: case 5: return 6407;case 2: return 6410;case 1: break; }  return 6406; } public int lB; public ByteBuffer X; public long[] pU; public Gdx2DPixmap(InputStream paramInputStream, int paramInt) { ByteArrayOutputStream byteArrayOutputStream; this.pU = new long[4]; this(1024); int i; for (byte[] arrayOfByte2 = new byte[1024]; (i = paramInputStream.read(arrayOfByte2)) != -1; byteArrayOutputStream.write(arrayOfByte2, 0, i)); byte[] arrayOfByte1 = byteArrayOutputStream.toByteArray(); if ((this.X = load(this.pU, arrayOfByte1, 0, arrayOfByte1.length)) != null) { this.dx0 = arrayOfLong[0]; this.ju = (int)arrayOfLong[1]; this.Og0 = (int)arrayOfLong[2]; long[] arrayOfLong; int j = (int)(arrayOfLong = this.pU)[3]; if (paramInt != 0 && paramInt != j) F1(paramInt);  return; }  throw new IOException(B40.df("Error loading pixmap: ").append(getFailureReason()).toString()); } public final void F1(int paramInt) { int i = this.ju; this(i, this.Og0, paramInt); Gdx2DPixmap gdx2DPixmap; paramInt = 0; setBlend((new Gdx2DPixmap()).dx0, paramInt); paramInt = 0; i = 0; boolean bool1 = false, bool2 = false; int j = this.ju, k = this.Og0;
/*  3 */     drawPixmap(this.dx0, gdx2DPixmap.dx0, paramInt, i, j, k, bool1, bool2, j, k);
/*  4 */     free(this.dx0);
/*  5 */     this.dx0 = gdx2DPixmap.dx0; this.lB = gdx2DPixmap.lB; this.Og0 = gdx2DPixmap.Og0; this.pU = gdx2DPixmap.pU; this.X = gdx2DPixmap.X; this.ju = gdx2DPixmap.ju; } public Gdx2DPixmap(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
/*  6 */     if ((this.X = loadByteBuffer(this.pU = new long[4], paramByteBuffer, paramInt1, paramInt2)) != null) { this.dx0 = arrayOfLong[0]; this.ju = (int)arrayOfLong[1]; this.Og0 = (int)arrayOfLong[2]; long[] arrayOfLong; int i = (int)(arrayOfLong = this.pU)[3]; if (paramInt3 != 0 && paramInt3 != i) F1(paramInt3);  return; }  throw new IOException(B40.df("Error loading pixmap: ")
/*  7 */         .append(getFailureReason()).toString());
/*    */   }
/*    */   
/*    */   public Gdx2DPixmap(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
/* 11 */     if ((this.X = load(this.pU = new long[4], paramArrayOfbyte, paramInt1, paramInt2)) != null) { this.dx0 = arrayOfLong[0]; this.ju = (int)arrayOfLong[1]; this.Og0 = (int)arrayOfLong[2]; long[] arrayOfLong; int i = (int)(arrayOfLong = this.pU)[3]; if (paramInt3 != 0 && paramInt3 != i) F1(paramInt3);  return; }  throw new IOException(B40.df("Error loading pixmap: ")
/* 12 */         .append(getFailureReason()).toString());
/*    */   }
/*    */   
/*    */   public Gdx2DPixmap(int paramInt1, int paramInt2, int paramInt3) {
/*    */     long[] arrayOfLong;
/*    */     if ((this.X = newPixmap(this.pU = new long[4], paramInt1, paramInt2, paramInt3)) != null) {
/*    */       this.dx0 = arrayOfLong[0];
/*    */       this.ju = (int)arrayOfLong[1];
/*    */       this.Og0 = (int)arrayOfLong[2];
/*    */       this.lB = (int)(arrayOfLong = this.pU)[3];
/*    */       return;
/*    */     } 
/*    */     throw new JU("Unable to allocate memory for pixmap: " + arrayOfLong + "x" + paramInt2 + ", " + yV(paramInt3));
/*    */   }
/*    */   
/*    */   public Gdx2DPixmap(ByteBuffer paramByteBuffer, long[] paramArrayOflong) {
/*    */     this.pU = new long[4];
/*    */     this.X = paramByteBuffer;
/*    */     this.dx0 = paramArrayOflong[0];
/*    */     this.ju = (int)paramArrayOflong[1];
/*    */     this.Og0 = (int)paramArrayOflong[2];
/*    */     this.lB = (int)paramArrayOflong[3];
/*    */   }
/*    */   
/*    */   public static String yV(int paramInt) {
/*    */     switch (paramInt) {
/*    */       default:
/*    */         return "unknown";
/*    */       case 6:
/*    */         return "rgba4444";
/*    */       case 5:
/*    */         return "rgb565";
/*    */       case 4:
/*    */         return "rgba8888";
/*    */       case 3:
/*    */         return "rgb888";
/*    */       case 2:
/*    */         return "luminance alpha";
/*    */       case 1:
/*    */         break;
/*    */     } 
/*    */     return "alpha";
/*    */   }
/*    */   
/*    */   private static native ByteBuffer load(long[] paramArrayOflong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
/*    */   
/*    */   private static native ByteBuffer loadByteBuffer(long[] paramArrayOflong, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
/*    */   
/*    */   private static native ByteBuffer newPixmap(long[] paramArrayOflong, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   private static native void free(long paramLong);
/*    */   
/*    */   private static native void clear(long paramLong, int paramInt);
/*    */   
/*    */   private static native void setPixel(long paramLong, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   private static native int getPixel(long paramLong, int paramInt1, int paramInt2);
/*    */   
/*    */   private static native void drawRect(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*    */   
/*    */   private static native void fillRect(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*    */   
/*    */   private static native void fillCircle(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   private static native void drawPixmap(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
/*    */   
/*    */   private static native void setBlend(long paramLong, int paramInt);
/*    */   
/*    */   private static native void setScale(long paramLong, int paramInt);
/*    */   
/*    */   public static native String getFailureReason();
/*    */   
/*    */   public final void dispose() {
/*    */     free(this.dx0);
/*    */   }
/*    */   
/*    */   public final void w(int paramInt) {
/*    */     clear(this.dx0, paramInt);
/*    */   }
/*    */   
/*    */   public final void YO(int paramInt1, int paramInt2, int paramInt3) {
/*    */     setPixel(this.dx0, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public final int Fl(int paramInt1, int paramInt2) {
/*    */     return getPixel(this.dx0, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public final void nM(Gdx2DPixmap paramGdx2DPixmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*    */     drawPixmap(paramGdx2DPixmap.dx0, this.dx0, paramInt1, paramInt2, paramInt5, paramInt6, paramInt3, paramInt4, paramInt5, paramInt6);
/*    */   }
/*    */   
/*    */   public final void fj(Gdx2DPixmap paramGdx2DPixmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
/*    */     drawPixmap(paramGdx2DPixmap.dx0, this.dx0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*    */   }
/*    */   
/*    */   public final void ya0(int paramInt) {
/*    */     setBlend(this.dx0, paramInt);
/*    */   }
/*    */   
/*    */   public final void tf0(int paramInt) {
/*    */     setScale(this.dx0, paramInt);
/*    */   }
/*    */   
/*    */   public final void iJ(int paramInt1, int paramInt2) {
/*    */     drawRect(this.dx0, paramInt1, 0, 32, 32, paramInt2);
/*    */   }
/*    */   
/*    */   public final void Tt(int paramInt) {
/*    */     fillRect(this.dx0, 0, 0, 4, 4, paramInt);
/*    */   }
/*    */   
/*    */   public final void rt(int paramInt) {
/*    */     fillCircle(this.dx0, 16, 12, 8, paramInt);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g2d/Gdx2DPixmap.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */