package com.t3h.basemvp.ui.main.listmusic;

import com.t3h.basemvp.module.ItemSongReponse;
import com.t3h.basemvp.module.ItemSongSearch;
import com.t3h.basemvp.ui.base.IBasePresenter;
import com.t3h.basemvp.ui.base.IViewMain;

import java.util.List;

/**
 * Created by ducnd on 5/21/17.
 */

public interface IListMusic {
    interface View extends IViewMain {

        void finishGetMusic(List<ItemSongReponse> itemSongReponses);

        void errorGetMusic(Throwable error);

        void finishGetListMusic(List<ItemSongSearch> response);

        void erroGetMusicSearch(Throwable error);
    }

    interface Presenter extends IBasePresenter {

        void getMusic(String s);

        void getItemSongSearch(String nameMusic);
    }
}
