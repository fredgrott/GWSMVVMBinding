package com.github.shareme.gwsmvvmbinding.library;

import android.database.Observable;
import android.support.annotation.CallSuper;

/**
 * BaseBindingScreenView
 * Created by fgrott on 12/2/2015.
 */
@SuppressWarnings("unused")
public abstract class BaseBindingScreenView<VM extends Observable> {

    private VM viewModel;

    @CallSuper
    public final void attach(VM viewModel) {
        if (this.viewModel == null) {
            this.viewModel = viewModel;
        }
        resume();
    }

    @CallSuper
    public final void detach() {
        this.viewModel = null;
        pause();
    }

    protected final boolean hasViewModel(){
        return viewModel != null;
    }

    public final VM getViewModel() {
        return viewModel;
    }

    private void resume(){

    }

    private void pause(){

    }

    protected abstract void load();

    protected void unload(){

    }

}
