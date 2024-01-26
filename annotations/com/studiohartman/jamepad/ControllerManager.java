/* 1 */ package com.studiohartman.jamepad;public class ControllerManager { public final boolean zy() { if (this.wH0) {
/* 2 */       if (nativeControllerConnectedOrDisconnected()) { ControllerIndex[] arrayOfControllerIndex; for (byte b = 0; b < (arrayOfControllerIndex = this.coM4).length; ) { arrayOfControllerIndex[b]
/* 3 */             .yw();
/* 4 */           arrayOfControllerIndex[b].R50(); arrayOfControllerIndex[b].xo(); b++; }  return true; }  return false;
/* 5 */     }  throw new IllegalStateException("SDL_GameController is not initialized!"); }
/*   */ 
/*   */   
/*   */   public final XE0 V90;
/*   */   public boolean wH0;
/*   */   public ControllerIndex[] coM4;
/*   */   
/*   */   public ControllerManager(XE0 paramXE0) {
/*   */     this(paramXE0, 0);
/*   */   }
/*   */   
/*   */   public ControllerManager(XE0 paramXE0, int paramInt) {
/*   */     this.V90 = paramXE0;
/*   */     this.wH0 = false;
/*   */     paramXE0.getClass();
/*   */     this.coM4 = new ControllerIndex[4];
/*   */     (new q00()).fG("jamepad");
/*   */   }
/*   */   
/*   */   private native boolean nativeInitSDLGamepad(boolean paramBoolean);
/*   */   
/*   */   private native void nativeCloseSDLGamepad();
/*   */   
/*   */   private native boolean nativeControllerConnectedOrDisconnected();
/*   */   
/*   */   private native boolean nativeAddMappingsFromBuffer(byte[] paramArrayOfbyte, int paramInt);
/*   */   
/*   */   public final void KK0() {
/*   */     if (!this.wH0) {
/*   */       this.V90.getClass();
/*   */       if (nativeInitSDLGamepad(true)) {
/*   */         this.wH0 = true;
/*   */         try {
/*   */           ot("/gamecontrollerdb.txt");
/*   */         } catch (IOException iOException) {
/*   */           System.err.println("Failed to load mapping with original location \"" + "/gamecontrollerdb.txt" + "\", Falling back of SDL's built in mappings");
/*   */           iOException.printStackTrace();
/*   */         } catch (IllegalStateException illegalStateException) {}
/*   */         ControllerIndex[] arrayOfControllerIndex;
/*   */         for (byte b = 0; b < (arrayOfControllerIndex = this.coM4).length; b++) {
/*   */           ControllerIndex controllerIndex;
/*   */           this(b);
/*   */           arrayOfControllerIndex[b] = controllerIndex;
/*   */         } 
/*   */         return;
/*   */       } 
/*   */       throw new IllegalStateException("Failed to initialize SDL in native method!");
/*   */     } 
/*   */     throw new IllegalStateException("SDL is already initialized!");
/*   */   }
/*   */   
/*   */   public final void Ar0() {
/*   */     ControllerIndex[] arrayOfControllerIndex;
/*   */     int i = (arrayOfControllerIndex = this.coM4).length;
/*   */     for (byte b = 0; b < i; b++)
/*   */       arrayOfControllerIndex[b].yw(); 
/*   */     nativeCloseSDLGamepad();
/*   */     this.coM4 = new ControllerIndex[0];
/*   */     this.wH0 = false;
/*   */   }
/*   */   
/*   */   public final void ot(String paramString) {
/*   */     ByteArrayOutputStream byteArrayOutputStream;
/*   */     InputStream inputStream;
/*   */     if ((inputStream = getClass().getResourceAsStream(paramString)) == null)
/*   */       inputStream = ClassLoader.getSystemResourceAsStream(paramString); 
/*   */     if (inputStream != null) {
/*   */       this.V90.getClass();
/*   */       this();
/*   */       char c;
/*   */       int i;
/*   */       for (byte[] arrayOfByte = new byte[c = 'က']; (i = inputStream.read(arrayOfByte, 0, c)) != -1; byteArrayOutputStream.write(arrayOfByte, 0, i));
/*   */       if (nativeAddMappingsFromBuffer(byteArrayOutputStream.toByteArray(), (byteArrayOutputStream.toByteArray()).length))
/*   */         return; 
/*   */       throw new IllegalStateException("Failed to set SDL controller mappings! Falling back to build in SDL mappings.");
/*   */     } 
/*   */     throw new IOException(m0.tF0("Cannot open resource from classpath ", byteArrayOutputStream));
/*   */   }
/*   */   
/*   */   public native String getLastNativeError(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/studiohartman/jamepad/ControllerManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */