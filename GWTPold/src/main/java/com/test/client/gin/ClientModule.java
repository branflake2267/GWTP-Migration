package com.test.client.gin;

import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.test.client.core.MainPagePresenter;
import com.test.client.core.MainPageView;
import com.test.client.core.ResponsePresenter;
import com.test.client.core.ResponseView;
import com.test.client.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        install(new DefaultModule());

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.main);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.main);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.main);

        bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class, MainPageView.class,
                MainPagePresenter.MyProxy.class);

        bindPresenter(ResponsePresenter.class, ResponsePresenter.MyView.class, ResponseView.class,
                ResponsePresenter.MyProxy.class);

    }
}
