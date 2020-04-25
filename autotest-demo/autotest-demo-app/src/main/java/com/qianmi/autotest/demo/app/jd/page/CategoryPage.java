package com.qianmi.autotest.demo.app.jd.page;

import com.qianmi.autotest.app.page.AppBasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class CategoryPage extends NavigatePage{

    //    @AndroidFindBy(id = "com.jingdong.app.mall:id/a5f")
    @AndroidFindBy(id = "com.jd.lib.category:id/a43")
//    @iOSFindBy(accessibility = "JDMainPage_input_gray")
    private WebElement searchButton;

    /**
     * 去搜索页
     *
     * @return 搜索页
     */
    public SearchPage gotoSearchPage() {
        wait(searchButton).click();
        return gotoPage(SearchPage.class);
    }
}
