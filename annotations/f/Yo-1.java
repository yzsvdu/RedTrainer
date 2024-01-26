package f;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public final class Yo extends Authenticator {
  public final PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication("authuser", jX.yr.toCharArray());
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */