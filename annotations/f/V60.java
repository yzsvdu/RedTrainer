/* 1 */ package f;public abstract class V60 { public HI uo; public fQ Wa0; public fQ K2; public f7 b80; public V60(HI paramHI) { fQ fQ1; f7 f71; this(); this.Wa0 = this; this(); this.K2 = this; this(); this.b80 = this; this.uo = paramHI; paramHI.GA0(); } public final void Sc(fQ paramfQ, String paramString1, String paramString2) { C20 c20 = null;
/*   */     
/*   */     try { C20 c201;
/* 4 */       this(this.uo.TI.B8(paramString1).rb(false), false, false); c20 = c201; } catch (Exception exception) { null.printStackTrace(); }  if (c20 != null)
/* 5 */     { boolean bool; w00 w00; if ((w00 = c20.EV) != null) { bool = this.ib; } else { bool = ((Wd)c20.PF0.get(0)).as0; }  if (bool)
/* 6 */       { hz hz; this(paramString2, c20.bl, null, 0.25F); paramfQ.Com3(this); }  }  } public final void m20() { T7 t7 = this.uo.TI.B8("/data/fldtanime.narc"); this(t7); ig ig; ByteBuffer byteBuffer; int i; byte b; for (i = (byteBuffer = (new ig()).zz(0).rb(false)).getInt(), b = 0; b < i; ) { fQ fQ1; byte[] arrayOfByte; byteBuffer.get(arrayOfByte = new byte[16]); String str = (new String(arrayOfByte)).trim(); this(); for (byte b1 = 0; b1 < 18; ) { byte b3 = byteBuffer.get(); byte b2; if ((b2 = byteBuffer.get()) >= 0 && b3 > 0) { byte b4; for (b4 = 0; b4 < b3; ) { fQ1.Com3(Byte.valueOf(b2)); b4 = (byte)(b4 + 1); }  }  b1++; }
/*   */        if (fQ1.Z8 == 0)
/* 8 */         fQ1 = null;  C20 c20 = null; try { C20 c201; this(ig.zz(b + 1).rb(false), false, false); c20 = c201; } catch (Exception exception) { exception.printStackTrace(); }  if (this.uo.bO() == 3 && str.contains("azt_wall02")) str = "spacewall1";  if (c20 != null) { str = str.split("\\.")[0]; this.Wa0.Com3(new hz(str, c20.bl, fQ1, 0.0333F)); }  b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public abstract KB0 eD(int paramInt);
/*   */   
/*   */   public abstract vk Sa0(VV paramVV, int paramInt);
/*   */   
/*   */   public abstract void vO(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/V60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */