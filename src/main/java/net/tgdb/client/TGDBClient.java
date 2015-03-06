package net.tgdb.client;

import net.tgdb.model.GameDataType;
import net.tgdb.model.PlatformGamesDataType;
import net.tgdb.model.PlatformsDataType;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
public interface TGDBClient {
  /**
   * Returns platforms from TGDB
   * 
   * @return {@link PlatformsDataType}
   */
  PlatformsDataType getPlatforms();

  /**
   * Returns platform games from TGDB according to platform id
   * 
   * @param platformId
   * @return {@link PlatformGamesDataType}
   */
  PlatformGamesDataType getPlatformGames(Long platformId);

  /**
   * Returns game from TGDB according to id
   * 
   * @param gameId
   * @return {@link GameDataType}
   */
  GameDataType getGame(Long gameId);
}
