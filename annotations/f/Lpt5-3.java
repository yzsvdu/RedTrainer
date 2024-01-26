/*   */ package f;public final class Lpt5 extends H3 { public final void Cx() {
/* 2 */     PN pN = (PN)this.d; byte[] arrayOfByte; if ((arrayOfByte = this.K5).length < 32 || arrayOfByte.length > 200) {
/*   */ 
/*   */ 
/*   */ 
/*   */       
/* 7 */       pN.Sa(); uc0
/*   */         
/* 9 */         .error(B40.df("Got an invalid encodedClientPublicKey length: ").append(this.K5.length).toString(), new RuntimeException());
/*   */       return;
/*   */     } 
/*   */     try {
/*   */       v5.Kf(arrayOfByte);
/*   */       KeyAgreement.getInstance("ECDH");
/*   */       pN.getClass();
/*   */       throw new UnsupportedOperationException();
/*   */     } catch (GeneralSecurityException generalSecurityException) {
/*   */     
/*   */     } catch (RuntimeException runtimeException) {}
/*   */     pN.Sa();
/*   */     uc0.error(B40.df("Could not decrypt updated key from ").append(pN.he0).toString(), this);
/*   */   }
/*   */   
/*   */   public static final ik uc0 = C00.gd(Lpt5.class);
/*   */   public byte[] K5;
/*   */   
/*   */   public Lpt5(int paramInt) {
/*   */     super(paramInt);
/*   */   }
/*   */   
/*   */   public final void sM() {
/*   */     this.K5 = ee0(Gc0());
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lpt5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */