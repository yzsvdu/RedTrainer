package f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class Ul0 {
  public static final ik package = C00.gd(Ul0.class);
  
  public static String zm(String paramString) {
    try {
      MessageDigest.getInstance("SHA-1").update(paramString.getBytes(StandardCharsets.UTF_8));
      return LF.oa0(MessageDigest.getInstance("SHA-1").digest());
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      package.error("Exception while encoding password");
      throw new Error(noSuchAlgorithmException);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ul0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */