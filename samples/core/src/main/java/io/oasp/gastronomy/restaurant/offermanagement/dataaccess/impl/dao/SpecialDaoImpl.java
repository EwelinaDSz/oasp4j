package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import static com.querydsl.core.alias.Alias.$;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.querydsl.core.alias.Alias;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.jpa.impl.JPAQuery;

import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteria;

/**
 * @author EWDABROW
 *
 */
@Named
public class SpecialDaoImpl extends ApplicationMasterDataDaoImpl<SpecialEntity> implements SpecialDao {

  @SuppressWarnings("javadoc")
  @Override
  protected Class<SpecialEntity> getEntityClass() {

    return SpecialEntity.class;

  }

  public List<SpecialEntity> findSpecials(SpecialSearchCriteria ssc) {

    SpecialEntity special = Alias.alias(SpecialEntity.class);
    EntityPathBase<SpecialEntity> alias = $(special);
    JPAQuery<SpecialEntity> query = new JPAQuery<SpecialEntity>(getEntityManager()).from(alias);

    return new ArrayList<SpecialEntity>(); // TODO

  }

}
