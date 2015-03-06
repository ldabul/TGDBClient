package net.tgdb.client;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import net.tgdb.model.GameDataType;
import net.tgdb.model.PlatformGamesDataType;
import net.tgdb.model.PlatformsDataType;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
public class TGDBClientImpl implements TGDBClient {
  private static final String DEFAULT_URL = "http://thegamesdb.net";

  @Resource
  private Environment env;

  private RestTemplate restTemplate;

  public void setRestTemplate(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  /**
   * Constructs TGDB API URL according to base URL and path
   * 
   * @param queryPath
   * @return
   */
  private String getApiURL(String queryPath) {
    return env.getProperty("tgdb.url", DEFAULT_URL) + queryPath;
  }

  /**
   * Queries TGDB api according to input
   * 
   * @param path
   * @param type
   * @param params
   * @return
   */
  private <T> T query(String path, Class<T> type, Map<String, Object> params) {
    ResponseEntity<T> result = restTemplate.getForEntity(getApiURL(path), type, (Map<String, Object>) (params != null ? params : new HashMap<String, Object>()));
    return result.getBody();
  }

  @Override
  public PlatformsDataType getPlatforms() {
    return query("/api/GetPlatformsList.php", PlatformsDataType.class, null);
  }

  @Override
  public PlatformGamesDataType getPlatformGames(Long platformId) {
    Map<String, Object> params = new HashMap<>();
    params.put("platformId", platformId);
    return query("/api/GetPlatformGames.php?platform={platformId}", PlatformGamesDataType.class, params);
  }

  @Override
  public GameDataType getGame(Long gameId) {
    Map<String, Object> params = new HashMap<>();
    params.put("gameId", gameId);
    return query("/api/GetGame.php?id={gameId}", GameDataType.class, params);
  }
}
