package com.zxc.cxc.web.homepage.service;

import org.openapitools.api.HomepageApi;
import org.openapitools.model.HomePageInfo;
import org.springframework.web.bind.annotation.RestController;

import com.zxc.cxc.openapi.common.OpenAPIResponse;


@RestController
public class HomePageServiceImpl implements HomepageApi {
  public OpenAPIResponse<HomePageInfo> homepageInfoGet() {
    HomePageInfo homePageInfo = new HomePageInfo().intro("intro");
    return OpenAPIResponse.ok(homePageInfo);
  }
}