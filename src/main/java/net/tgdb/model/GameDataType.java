package net.tgdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@XmlRootElement(name = "Data")
public class GameDataType implements Model {
  private static final long serialVersionUID = 1L;

  @XmlElement(name = "baseImgUrl")
  private String baseImgUrl;
  @XmlElement(name = "Game", required = true)
  private GameType game;

  public String getBaseImgUrl() {
    return baseImgUrl;
  }

  public void setBaseImgUrl(String baseImgUrl) {
    this.baseImgUrl = baseImgUrl;
  }

  public GameType getGame() {
    return game;
  }

  public void setGame(GameType game) {
    this.game = game;
  }
}
