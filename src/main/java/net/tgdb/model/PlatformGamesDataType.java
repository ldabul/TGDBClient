package net.tgdb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlRootElement(name = "Data")
public class PlatformGamesDataType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlElement(name = "Game", required = true)
  private List<PlatformGameType> games;

  public List<PlatformGameType> getGames() {
    return games;
  }

  public void setGames(List<PlatformGameType> games) {
    this.games = games;
  }
}
