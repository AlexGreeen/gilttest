package com.al.gilttest.data.remote.constants;

public enum Constants {
    G_API_KEY("f4197ae64ab88794ee1aa77f8770a013b0f5513f63b717c8b095dbb4bce5541b"),
    G_KEY_QUERY("apikey"),
    G_BASE_URL("https://api.gilt.com/v1/"),
    WOMAN("woman"),
    MEN("men"),
    KIDS("kids"),
    HOME("home"),
    ACTIVE("active"),
    UPCOMING("upcoming");

    private final String c;

    Constants(final String url) {
        this.c = url;
    }

    @Override
    public String toString() {
        return c;
    }
}
