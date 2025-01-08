package com.zxc.cxc.web.homepage.service;

import org.springframework.web.bind.annotation.RestController;

import com.zxc.cxc.openapi.api.HomepageApi;
import com.zxc.cxc.openapi.common.OpenAPIResponse;
import com.zxc.cxc.openapi.model.HomePageInfo;

@RestController
public class HomePageServiceImpl implements HomepageApi {
  public OpenAPIResponse<HomePageInfo> homepageInfoGet() {
    HomePageInfo homePageInfo = new HomePageInfo().intro("intro");
    return OpenAPIResponse.ok(homePageInfo);
  }
}