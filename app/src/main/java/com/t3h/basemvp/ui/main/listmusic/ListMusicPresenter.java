package com.t3h.basemvp.ui.main.listmusic;

import com.t3h.basemvp.interact.AccountInteractor;
import com.t3h.basemvp.module.ItemSongReponse;
import com.t3h.basemvp.ui.base.Action;
import com.t3h.basemvp.ui.base.BasePresenter;

import java.util.List;

/**
 * Created by ducnd on 5/21/17.
 */

public class ListMusicPresenter extends BasePresenter<IListMusic.View> implements IListMusic.Presenter {
    public ListMusicPresenter(IListMusic.View view) {
        super(view);
    }

    @Override
    public void getMusic(String name) {
        interact(AccountInteractor.getInstance().getMusic(name),
                new Action<List<ItemSongReponse>>() {
            @Override
            public void call(List<ItemSongReponse> itemSongReponses) {
                mView.finishGetMusic(itemSongReponses);
            }
        }, new Action<Throwable>() {
            @Override
            public void call(Throwable error) {
                mView.errorGetMusic(error);
            }
        });

//        AccountInteractor.getInstance().getMusic(name)
//                .subscribe(reponse->{
//                    mView.finishGetMusic(reponse);
//                }, error->{
//                    mView.errorGetMusic(error);
//                });
    }

    @Override
    public void getItemSongSearch(String nameMusic) {
        interact(AccountInteractor.getInstance().getListMusic(nameMusic),
                response->{
                   mView.finishGetListMusic(response);
                }, error->{
                    mView.erroGetMusicSearch(error);
                });
    }
}
