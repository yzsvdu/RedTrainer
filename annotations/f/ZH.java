/* 1 */ package f;public class ZH implements iq0 { public final Gdx2DPixmap Con; public int coM6; public boolean nA; public ZH(int paramInt1, int paramInt2, Uc paramUc) { Gdx2DPixmap gdx2DPixmap; this.coM6 = 0; int i = Uc.Vn0(paramUc); this(paramInt1, paramInt2, i); this.Con = this; Re(0.0F, 0.0F, 0.0F, 0.0F); gc(); } public ZH(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) { this.coM6 = 0; try { Gdx2DPixmap gdx2DPixmap; this(paramArrayOfbyte, paramInt1, paramInt2, 0); this.Con = gdx2DPixmap; return; } catch (IOException iOException) { throw new JU("Couldn't load pixmap from image data", iOException); }  } public ZH(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) { this.coM6 = 0; if (paramByteBuffer.isDirect()) try { Gdx2DPixmap gdx2DPixmap; this(paramByteBuffer, paramInt1, paramInt2, 0); this.Con = gdx2DPixmap; return; } catch (IOException iOException) { throw new JU("Couldn't load pixmap from image data", iOException); }   throw new JU("Couldn't load pixmap from non-direct ByteBuffer"); } public final void fL(ZH paramZH, int paramInt1, int paramInt2) { boolean bool1 = false, bool2 = false; Gdx2DPixmap gdx2DPixmap;
/* 2 */     int i = (gdx2DPixmap = paramZH.Con).ju;
/* 3 */     int j = paramZH.Con.Og0;
/* 4 */     this.Con.nM(gdx2DPixmap, bool1, bool2, paramInt1, paramInt2, i, j); } public ZH(ByteBuffer paramByteBuffer) { this(paramByteBuffer, i, j); } public ZH(RD0 paramRD0) { this.coM6 = 0; try { Gdx2DPixmap gdx2DPixmap; byte[] arrayOfByte = paramRD0.iy0(); boolean bool = false; int i = arrayOfByte.length; this(arrayOfByte, bool, i, 0); this.Con = gdx2DPixmap; return; } catch (Exception exception) { throw new JU("Couldn't load file: " + paramRD0, exception); }  } public ZH(Gdx2DPixmap paramGdx2DPixmap) { this.coM6 = 0; this.Con = paramGdx2DPixmap; } public final void r1(y1 paramy1) { boolean bool; Gdx2DPixmap gdx2DPixmap = this.Con; if (paramy1 == y1.Zj) { bool = false; } else { bool = true; }  ya0(bool); } public final void Re(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.coM6 = Color.rgba8888(paramFloat1, paramFloat2, paramFloat3, paramFloat4); } public final void Np(Color paramColor) { float f1 = paramColor.g; float f2 = paramColor.b; float f3 = paramColor.a; this.coM6 = Color.rgba8888(paramColor.r, f1, f2, f3); } public final void gc() { this.Con.w(this.coM6); } public final int WD0() { return this.Con.ju; } public final int C20() { return this.Con.Og0; } public void dispose() { if (!this.nA) { this.Con.dispose(); this.nA = true; return; }  throw new JU("Pixmap already disposed!"); } public final void d40(int paramInt1, int paramInt2) { this.Con.YO(paramInt1, paramInt2, this.coM6); } public final void WB0(int paramInt1, int paramInt2, int paramInt3) { this.Con.YO(paramInt1, paramInt2, paramInt3); } public final int qf() { return Gdx2DPixmap.HO(this.Con.lB); } public final int PB() { return Gdx2DPixmap.HO(this.Con.lB); } public final int i5() { int i; switch (i = this.Con.lB) { default: throw new JU(XD0.SD0("unknown format: ", i));case 6: case 5: case 1: case 2: case 3: case 4: break; }  return 5121; }
/*   */ 
/*   */   
/*   */   public final ByteBuffer tp0() {
/*   */     if (!this.nA)
/*   */       return this.Con.X; 
/*   */     throw new JU("Pixmap already disposed");
/*   */   }
/*   */   
/*   */   public final Uc TU() {
/*   */     return Uc.Kz0(this.Con.lB);
/*   */   }
/*   */   
/*   */   public final void Wq(ZH paramZH, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.Con.nM(paramZH.Con, paramInt1, paramInt2, 0, 0, paramInt3, paramInt4);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ZH.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */