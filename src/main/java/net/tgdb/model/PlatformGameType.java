package net.tgdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlType
public class PlatformGameType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlElement(name = "id")
  private Long id;
  @XmlElement(name = "GameTitle")
  private String title;
  @XmlElement(name = "ReleaseDate")
  private String releaseDate;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }
}
