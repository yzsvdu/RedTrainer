/*  1 */ package com.badlogic.gdx.graphics.g2d.freetype;public class FreeType { public static native int getLastErrorCode(); public static Library Hj0() { (new q00()).fG("gdx-freetype"); long l; if ((l = initFreeTypeJni()) != 0L) return new Library(l);  throw new JU(B40.df("Couldn't initialize FreeType library, FreeType error code: ")
/*  2 */         .append(getLastErrorCode()).toString()); } private static native long initFreeTypeJni(); public static int Xx0(int paramInt) { return (paramInt + 63 & 0xFFFFFFC0) >> 6; } public static class Stroker extends UD implements iq0 { public Stroker(long param1Long) { super(param1Long); } private static native void set(long param1Long, int param1Int1, int param1Int2, int param1Int3, int param1Int4); private static native void done(long param1Long); public final void h5(int param1Int1, int param1Int2, int param1Int3) { set(this.Qp0, param1Int1, param1Int2, param1Int3, 0); } public final void dispose() { done(this.Qp0); } } public static class GlyphMetrics extends UD { public GlyphMetrics(long param1Long) { super(param1Long); } private static native int getHeight(long param1Long); private static native int getHoriAdvance(long param1Long); public final int Qy0() { return getHeight(this.Qp0); } public final int TI() { return getHoriAdvance(this.Qp0); } } public static class Bitmap extends UD { public Bitmap(long param1Long) { super(param1Long); } private static native int getRows(long param1Long); private static native int getWidth(long param1Long); private static native int getPitch(long param1Long); private static native ByteBuffer getBuffer(long param1Long); private static native int getPixelMode(long param1Long); public final int qr0() { return getRows(this.Qp0); } public final int V3() { return getWidth(this.Qp0); } public final int Qe0() { return getPitch(this.Qp0); } public final ByteBuffer kz0() { if (getRows(this.Qp0) == 0) return BufferUtils.ar(1);  return getBuffer(this.Qp0); } public final ZH hI0(Uc param1Uc, Color param1Color, float param1Float) { ZH zH; int i = getWidth(this.Qp0); int j = getRows(this.Qp0);
/*  3 */       ByteBuffer byteBuffer = kz0();
/*  4 */       int k = getPixelMode(this.Qp0);
/*    */       
/*  6 */       int m = Math.abs(getPitch(this.Qp0)); if (param1Color == Color.WHITE && k == 2 && m == i && param1Float == 1.0F) { this(i, j, Uc.eJ0); BufferUtils.Of0(byteBuffer, (new ZH()).tp0(), zH.tp0().capacity()); } else { byte b; this(i, j, Uc.xi0); k = Color.rgba8888((Color)zH); byte[] arrayOfByte = new byte[m]; int[] arrayOfInt = new int[i]; IntBuffer intBuffer = zH.tp0().asIntBuffer(); if (k == 1) { for (b = 0; b < j; ) { byteBuffer.get(arrayOfByte); for (byte b1 = 0, b2 = 0; b2 < i; ) { byte b3; byte b4; int n; for (b3 = arrayOfByte[b1], b4 = 0, n = Math.min(8, i - b2); b4 < n; ) { if ((b3 & 1 << 7 - b4) != 0) { arrayOfInt[b2 + b4] = k; } else { arrayOfInt[b2 + b4] = 0; }  b4++; }  b1++; b2 += 8; }  intBuffer.put(arrayOfInt); b++; }  } else { int n; byte b1; for (k &= 0xFFFFFF00, n = k & 0xFF, b1 = 0; b1 < j; ) { byteBuffer.get(arrayOfByte); for (byte b2 = 0; b2 < i; ) { int i1; if ((i1 = arrayOfByte[b2] & 0xFF) == 0) { arrayOfInt[b2] = k; } else if (i1 == 255) { arrayOfInt[b2] = k | n; } else { arrayOfInt[b2] = k | (int)(n * (float)Math.pow((i1 / 255.0F), b)); }  b2++; }  intBuffer.put(arrayOfInt); b1++; }  }  }  if (param1Uc != zH.TU())
/*    */       
/*  8 */       { int n = zH.Con.ju;
/*    */         
/* 10 */         this(n, zH.Con.Og0, param1Uc); r1(y1.Zj); ZH zH1; (zH1 = new ZH()).fL(zH, 0, 0); (new ZH()).r1(y1.hM); zH.dispose(); zH = this; }  return zH; } } public static class Glyph extends UD implements iq0 { public boolean jl; public Glyph(long param1Long) { super(param1Long); } private static native void done(long param1Long); private static native long strokeBorder(long param1Long1, long param1Long2, boolean param1Boolean); private static native long toBitmap(long param1Long, int param1Int); private static native long getBitmap(long param1Long); private static native int getLeft(long param1Long); private static native int getTop(long param1Long); public final void dispose() { done(this.Qp0); } public final void W90(FreeType.Stroker param1Stroker) { this.Qp0 = strokeBorder(this.Qp0, param1Stroker.Qp0, false); } public final void coN(int param1Int) { long l; if ((l = toBitmap(this.Qp0, param1Int)) != 0L) { this.Qp0 = l; this.jl = true; return; }  throw new JU(B40.df("Couldn't render glyph, FreeType error code: ").append(FreeType.getLastErrorCode()).toString()); } public final FreeType.Bitmap TR() { if (this.jl) return new FreeType.Bitmap(getBitmap(this.Qp0));  throw new JU("Glyph is not yet rendered"); } public final int zI() { if (this.jl) return getLeft(this.Qp0);  throw new JU("Glyph is not yet rendered"); } public final int qo0() { if (this.jl) return getTop(this.Qp0);  throw new JU("Glyph is not yet rendered"); } } public static class GlyphSlot extends UD { public GlyphSlot(long param1Long) { super(param1Long); } private static native long getMetrics(long param1Long); private static native int getFormat(long param1Long); private static native long getGlyph(long param1Long); public final FreeType.GlyphMetrics MG() { return new FreeType.GlyphMetrics(getMetrics(this.Qp0)); } public final int uM() { return getFormat(this.Qp0); } public final FreeType.Glyph LpT5() { long l; if ((l = getGlyph(this.Qp0)) != 0L) return new FreeType.Glyph(l);  throw new JU(B40.df("Couldn't get glyph, FreeType error code: ").append(FreeType.getLastErrorCode()).toString()); } } public static class SizeMetrics extends UD { public SizeMetrics(long param1Long) { super(param1Long); } private static native int getAscender(long param1Long); private static native int getDescender(long param1Long); private static native int getHeight(long param1Long); public final int yr() { return getAscender(this.Qp0); } public final int Lv() { return getDescender(this.Qp0); } public final int c9() { return getHeight(this.Qp0); } } public static class Size extends UD { public Size(long param1Long) { super(param1Long); } private static native long getMetrics(long param1Long); public final FreeType.SizeMetrics lS() { return new FreeType.SizeMetrics(getMetrics(this.Qp0)); } } public static class Face extends UD implements iq0 { public FreeType.Library jj0; public Face(long param1Long, FreeType.Library param1Library) { super(param1Long); this.jj0 = param1Library; } private static native void doneFace(long param1Long); private static native int getFaceFlags(long param1Long); private static native int getNumGlyphs(long param1Long); private static native int getMaxAdvanceWidth(long param1Long); private static native boolean setPixelSizes(long param1Long, int param1Int1, int param1Int2); private static native boolean loadChar(long param1Long, int param1Int1, int param1Int2); private static native long getGlyph(long param1Long); private static native long getSize(long param1Long); private static native boolean hasKerning(long param1Long); private static native int getKerning(long param1Long, int param1Int1, int param1Int2, int param1Int3); private static native int getCharIndex(long param1Long, int param1Int); public final void dispose() { doneFace(this.Qp0); ByteBuffer byteBuffer; if ((byteBuffer = (ByteBuffer)this.jj0.hR.Ie(this.Qp0)) != null) { this.jj0.hR.sH(this.Qp0); synchronized (BufferUtils.sK0) { /* monitor exit ThisExpression{ObjectType{f/fQ}} */ if (BufferUtils.sK0.mB(byteBuffer, true)) BufferUtils.lf(byteBuffer);  }  }  } public final int HB() { return getFaceFlags(this.Qp0); } public final int s6() { return getNumGlyphs(this.Qp0); } public final int s40() { return getMaxAdvanceWidth(this.Qp0); } public final boolean UD0(int param1Int1, int param1Int2) { return loadChar(this.Qp0, param1Int1, param1Int2); } public final FreeType.GlyphSlot kT() { return new FreeType.GlyphSlot(getGlyph(this.Qp0)); } public final FreeType.Size WV() { return new FreeType.Size(getSize(this.Qp0)); } public final boolean QI() { return hasKerning(this.Qp0); } public final int HK0(int param1Int) { return getCharIndex(this.Qp0, param1Int); } public final boolean yb(int param1Int) { return setPixelSizes(this.Qp0, 0, param1Int); } public final int bk(int param1Int1, int param1Int2) { return getKerning(this.Qp0, param1Int1, param1Int2, 0); } } public static class Library extends UD implements iq0 { public final FreeType.Face DP(RD0 param1RD0, int param1Int) { ByteBuffer byteBuffer = null; try { param1RD0.getClass(); byteBuffer = param1RD0.fg0(FileChannel.MapMode.READ_ONLY); } catch (JU jU) {} if (byteBuffer == null) { InputStream inputStream = param1RD0.Yc(); try { int i; if ((i = (int)param1RD0.tN()) == 0) { byteBuffer = BufferUtils.xz((Ui.Vn(inputStream, 16384)).length); BufferUtils.Nx(Ui.Vn(inputStream, 16384), byteBuffer, (Ui.Vn(inputStream, 16384)).length); } else { byte[] arrayOfByte = new byte[4096]; int j, k, m; for (j = (byteBuffer = BufferUtils.xz(byteBuffer)).position(), k = 0; (m = inputStream.read(arrayOfByte)) != -1; ) { BufferUtils.Nx(arrayOfByte, byteBuffer, m); byteBuffer.position(j + (k += m)); }  byteBuffer.position(j); }  Ui.JC0(inputStream); } catch (IOException iOException) { throw new JU(this); } finally {} }  /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/fQ}, expression=ObjectTypeReferenceExpression{ObjectType{com/badlogic/gdx/utils/BufferUtils}}, name=sK0, descriptor=Lf/fQ;}} */ long l; if ((l = newMemoryFace(this.Qp0, byteBuffer, byteBuffer.remaining(), param1Int)) == 0L) { fQ fQ; try { /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */ if (BufferUtils.sK0.mB(byteBuffer, true)) BufferUtils.lf(byteBuffer);  throw new JU(B40.df("Couldn't load font, FreeType error code: ").append(FreeType.getLastErrorCode()).toString()); } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */ }  }
/* 11 */        this
/* 12 */         .hR.dG0(l, byteBuffer); return new FreeType.Face(l, this); }
/*    */ 
/*    */     
/*    */     public LF0 hR;
/*    */     
/*    */     public Library(long param1Long) {
/*    */       super(param1Long);
/*    */       LF0 lF0;
/*    */       this();
/*    */       this.hR = this;
/*    */     }
/*    */     
/*    */     private static native void doneFreeType(long param1Long);
/*    */     
/*    */     private static native long newMemoryFace(long param1Long, ByteBuffer param1ByteBuffer, int param1Int1, int param1Int2);
/*    */     
/*    */     private static native long strokerNew(long param1Long);
/*    */     
/*    */     public final void dispose() {
/*    */       NT nT1;
/*    */       doneFreeType(this.Qp0);
/*    */       LF0 lF0;
/*    */       if ((lF0 = this.hR).lS == null) {
/*    */         NT nT;
/*    */         this(this);
/*    */         this.lS = nT;
/*    */         this(this);
/*    */         this.P00 = nT;
/*    */       } 
/*    */       NT nT2;
/*    */       if (!((Cd0)(nT2 = this.lS)).SJ) {
/*    */         nT2.We0();
/*    */         ((Cd0)(nT1 = this.lS)).SJ = true;
/*    */         ((Cd0)this.P00).SJ = false;
/*    */       } else {
/*    */         ((LF0)this).P00.We0();
/*    */         ((Cd0)(nT1 = ((LF0)this).P00)).SJ = true;
/*    */         ((Cd0)((LF0)this).lS).SJ = false;
/*    */       } 
/*    */       while (hasNext()) {
/*    */         fQ fQ;
/*    */         ByteBuffer byteBuffer = (ByteBuffer)next();
/*    */         /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/fQ}, expression=ObjectTypeReferenceExpression{ObjectType{com/badlogic/gdx/utils/BufferUtils}}, name=sK0, descriptor=Lf/fQ;}} */
/*    */         try {
/*    */         
/*    */         } finally {
/*    */           nT1 = null;
/*    */           /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
/*    */         } 
/*    */       } 
/*    */     }
/*    */     
/*    */     public final FreeType.Stroker f6() {
/*    */       long l;
/*    */       if ((l = strokerNew(this.Qp0)) != 0L)
/*    */         return new FreeType.Stroker(l); 
/*    */       throw new JU(B40.df("Couldn't create FreeType stroker, FreeType error code: ").append(FreeType.getLastErrorCode()).toString());
/*    */     } }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g2d/freetype/FreeType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */