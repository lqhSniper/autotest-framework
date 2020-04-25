package com.qianmi.autotest.demo.app.jd.page;

import com.qianmi.autotest.app.page.AppBasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

/**
 * 商品搜索内容输入页
 * Created by liuzhaoming on 2018/12/25.
 */
@Component
public class SearchPage extends AppBasePage {

//    @AndroidFindBy(id = "com.jd.lib.search:id/search_text")
    @AndroidFindBy(id = "com.jd.lib.search:id/a4p")
    @iOSFindBy(accessibility = "搜索框")
    private WebElement searchField;

//    @AndroidFindBy(id = "com.jingdong.app.mall:id/ax2")
    @AndroidFindBy(id = "com.jingdong.app.mall:id/a9b")
    private WebElement searchButton;

    @AndroidFindBy(accessibility = "返回")
    @iOSFindBy(accessibility = "返回")
    private WebElement backButton;

    /**
     * 搜索商品
     *
     * @param keyword 关键词
     * @return 搜索结果页
     */
    public SearchResultPage search(String keyword) {
        wait(searchField).sendKeys(keyword);
        if (isAndroidPlatform()) {
            wait(searchButton).click();
        } else {
            wait(searchField).sendKeys(Keys.ENTER);
        }
        return gotoPage(SearchResultPage.class);
    }
    public CategoryPage backCategoryPage() {
        wait(backButton).click();
        return gotoPage(CategoryPage.class);
    }
}
