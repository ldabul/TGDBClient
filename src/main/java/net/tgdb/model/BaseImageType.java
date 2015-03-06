package net.tgdb.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlType
public class BaseImageType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlAttribute(name = "width")
  private Long width;
  @XmlAttribute(name = "height")
  private Long height;
  @XmlValue
  private String value;

  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
