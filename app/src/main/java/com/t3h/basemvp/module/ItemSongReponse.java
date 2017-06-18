package com.t3h.basemvp.module;

/**
 * Created by ducnd on 5/21/17.
 */

public class ItemSongReponse {
    private String dataCode;
    private String tile;

    public ItemSongReponse(String dataCode, String tile) {
        this.dataCode = dataCode;
        this.tile = tile;
    }

    public String getDataCode() {
        return dataCode;
    }

    public String getTile() {
        return tile;
    }
}
