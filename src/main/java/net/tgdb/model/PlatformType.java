package net.tgdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlType
public class PlatformType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlElement(name = "id")
  private Long id;
  @XmlElement(name = "name")
  private String name;
  @XmlElement(name = "alias")
  private String alias;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }
}
