package com.test.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.test.client.core.MainPagePresenter;
import com.test.client.core.ResponsePresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {
    EventBus getEventBus();

    PlaceManager getPlaceManager();

    Provider<MainPagePresenter> getMainPagePresenter();

    Provider<ResponsePresenter> getResponsePresenter();
}
