package net.tgdb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlType
public class GameType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlElement(name = "id")
  private Long id;
  @XmlElement(name = "GameTitle")
  private String title;
  @XmlElementWrapper(name = "AlternateTitles")
  @XmlElement(name = "title")
  private List<String> alternateTitles;
  @XmlElement(name = "PlatformId")
  private Long platformId;
  @XmlElement(name = "Platform")
  private String platform;
  @XmlElement(name = "ReleaseDate")
  private String releaseDate;
  @XmlElement(name = "Overview", required = true)
  private String overview;
  @XmlElement(name = "ESRB")
  private String esrb;
  @XmlElementWrapper(name = "Genres")
  @XmlElement(name = "genre")
  private List<String> genres;
  @XmlElement(name = "Players")
  private String players;
  @XmlElement(name = "Co-op")
  private String coop;
  @XmlElement(name = "Youtube", required = true)
  private String youtube;
  @XmlElement(name = "Publisher")
  private String publisher;
  @XmlElement(name = "Developer")
  private String developer;
  @XmlElement(name = "Rating")
  private String rating;
  @XmlElement(name = "Images")
  private ImagesType images;

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

  public List<String> getAlternateTitles() {
    return alternateTitles;
  }

  public void setAlternateTitles(List<String> alternateTitles) {
    this.alternateTitles = alternateTitles;
  }

  public Long getPlatformId() {
    return platformId;
  }

  public void setPlatformId(Long platformId) {
    this.platformId = platformId;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public String getEsrb() {
    return esrb;
  }

  public void setEsrb(String esrb) {
    this.esrb = esrb;
  }

  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public String getPlayers() {
    return players;
  }

  public void setPlayers(String players) {
    this.players = players;
  }

  public String getCoop() {
    return coop;
  }

  public void setCoop(String coop) {
    this.coop = coop;
  }

  public String getYoutube() {
    return youtube;
  }

  public void setYoutube(String youtube) {
    this.youtube = youtube;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getDeveloper() {
    return developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public ImagesType getImages() {
    return images;
  }

  public void setImages(ImagesType images) {
    this.images = images;
  }
}
