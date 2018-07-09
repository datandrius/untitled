package yaml;

import static java.lang.String.format;

import java.util.Date;

public final class Configuration {

  private Date released;
  private String version;

  public Date getReleased() {
    return released;
  }

  public String getVersion() {
    return version;
  }

  public void setReleased(Date released) {
    this.released = released;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append(format("Version: %s\n", version))
        .append(format("Released: %s\n", released))
        .toString();
  }
}