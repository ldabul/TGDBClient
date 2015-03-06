package net.tgdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlType
public class ComplexImageType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlElement(name = "original")
  private BaseImageType image;
  @XmlElement(name = "thumb")
  private String thumb;

  public BaseImageType getImage() {
    return image;
  }

  public void setImage(BaseImageType image) {
    this.image = image;
  }

  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }
}
