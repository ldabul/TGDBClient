package net.tgdb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlRootElement(name = "Data")
public class PlatformsDataType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlElement(name = "basePlatformUrl", required = true)
  private String basePlatformUrl;
  @XmlElementWrapper(name = "Platforms")
  @XmlElement(name = "Platform", required = true)
  private List<PlatformType> platforms;

  public String getBasePlatformUrl() {
    return basePlatformUrl;
  }

  public void setBasePlatformUrl(String basePlatformUrl) {
    this.basePlatformUrl = basePlatformUrl;
  }

  public List<PlatformType> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<PlatformType> platforms) {
    this.platforms = platforms;
  }
}
