package com.zxc.cxc.web.homepage.service;

import static com.zxc.cxc.jooq.generated.Tables.HOME_PAGE_INFO;

// import static com.zxc.cxc.jooq.generated.Tables.HOME_PAGE_INFO;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxc.cxc.jooq.generated.tables.records.HomePageInfoRecord;
import com.zxc.cxc.openapi.api.HomepageApi;
import com.zxc.cxc.openapi.common.OpenAPIResponse;
import com.zxc.cxc.openapi.model.HomePageInfoVO;

@Service public class HomePageServiceImpl implements HomepageApi {
  @Autowired DSLContext dslContext;

public
  OpenAPIResponse<HomePageInfoVO> homepageInfoGet() {
    var t1 = HOME_PAGE_INFO;

    HomePageInfoRecord homePageInfoRecord = dslContext.select()
                                                .from(t1)
                                                .where(t1.INTRO.like("%llo$"))
                                                .fetchAnyInto(t1);

    HomePageInfoVO homePageInfoVO =
        new HomePageInfoVO()
            .intro(homePageInfoRecord.getIntro())
            .subIntro(homePageInfoRecord.getSubIntro())
            .avatar(homePageInfoRecord.getAvatar());

    return OpenAPIResponse.ok(homePageInfoVO);
  }
}