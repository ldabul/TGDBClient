package net.tgdb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlType
public class ImagesType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlElement(name = "fanart")
  private List<ComplexImageType> fanarts;
  @XmlElement(name = "boxart", required = true)
  private List<BoxartImageType> boxarts;
  @XmlElement(name = "banner")
  private List<BaseImageType> banners;
  @XmlElement(name = "screenshot")
  private List<ComplexImageType> screenshots;
  @XmlElement(name = "clearlogo")
  private BaseImageType logo;

  public List<ComplexImageType> getFanarts() {
    return fanarts;
  }

  public void setFanarts(List<ComplexImageType> fanarts) {
    this.fanarts = fanarts;
  }

  public List<BoxartImageType> getBoxarts() {
    return boxarts;
  }

  public void setBoxarts(List<BoxartImageType> boxarts) {
    this.boxarts = boxarts;
  }

  public List<BaseImageType> getBanners() {
    return banners;
  }

  public void setBanners(List<BaseImageType> banners) {
    this.banners = banners;
  }

  public List<ComplexImageType> getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(List<ComplexImageType> screenshots) {
    this.screenshots = screenshots;
  }

  public BaseImageType getLogo() {
    return logo;
  }

  public void setLogo(BaseImageType logo) {
    this.logo = logo;
  }
}
