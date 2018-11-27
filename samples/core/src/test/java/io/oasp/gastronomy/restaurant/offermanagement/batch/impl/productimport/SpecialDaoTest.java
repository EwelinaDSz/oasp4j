package io.oasp.gastronomy.restaurant.offermanagement.batch.impl.productimport;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import io.oasp.gastronomy.restaurant.SpringBootApp;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.module.test.common.base.ComponentTest;

@Transactional
@SpringBootTest(classes = { SpringBootApp.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpecialDaoTest extends ComponentTest {

  @Inject
  SpecialDao specialDao;

  @Test
  public void testSaveSpecialDao() {

    // given
    SpecialEntity se = new SpecialEntity();
    se.setName("asd");

    // when
    this.specialDao.save(se);

    // then
    Assert.assertEquals(se.name, "asd");
    assertNotNull(se);

  }

}
