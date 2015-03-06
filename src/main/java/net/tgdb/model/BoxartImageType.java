package net.tgdb.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlType
public class BoxartImageType extends BaseImageType {
  private static final long serialVersionUID = 1L;

  @XmlAttribute(name = "side")
  private String side;
  @XmlAttribute(name = "thumb")
  private String thumb;

  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }
}
