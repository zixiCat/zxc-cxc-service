package com.zxc.cxc.web.homepage.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxc.cxc.openapi.api.HomepageApi;
import com.zxc.cxc.openapi.common.OpenAPIResponse;
import com.zxc.cxc.openapi.model.HomePageInfo;
import com.zxc.cxc.web.jooq.Tables;

@Service
public class HomePageServiceImpl implements HomepageApi {
  @Autowired
  DSLContext dslContext;

  public OpenAPIResponse<HomePageInfo> homepageInfoGet() {
    dslContext.select()
        .from(Tables.HOME_PAGE_INFO).where(Tables.HOME_PAGE_INFO.INTRO.like("%llo%"))
        .fetch();

    return OpenAPIResponse.ok(null);
  }
}