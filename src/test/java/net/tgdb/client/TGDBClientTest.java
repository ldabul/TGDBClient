package net.tgdb.client;

import javax.annotation.Resource;

import net.tgdb.config.TGDBConfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TGDBConfig.class })
public class TGDBClientTest {
  @Resource
  private TGDBClient tgdbClient;

  @Test
  public void getPlatformsTest1() {
    Assert.assertNotNull("TGDBClientTest.getPlatformsTest1: expected not null result", tgdbClient.getPlatforms());
  }

  @Test
  public void getPlatformGamesTest1() {
    Assert.assertNotNull("TGDBClientTest.getPlatformGamesTest1: expected not null result", tgdbClient.getPlatformGames(1L));
  }

  @Test
  public void getGameTest1() {
    Assert.assertNotNull("TGDBClientTest.getGameTest1: expected not null result", tgdbClient.getGame(2L));
  }
}
