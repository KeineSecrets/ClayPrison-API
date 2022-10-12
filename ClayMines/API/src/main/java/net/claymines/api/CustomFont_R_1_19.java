package net.claymines.api;

public enum CustomFont_R_1_19 {

    A("ᴀ", 'a'),
    B("ʙ", 'b'),
    C("ᴄ", 'b'),
    D("ᴅ", 'b'),
    E("ᴇ", 'b'),
    F("ғ", 'b'),
    G("ɢ", 'b'),
    H("ʜ", 'b'),
    I("ɪ", 'b'),
    J("ᴊ", 'b'),
    K("ᴋ", 'b'),
    L("ʟ", 'b'),
    M("ᴍ", 'b'),
    N("ɴ", 'b'),
    O("ᴏ", 'b'),
    P("ᴘ", 'b'),
    Q("ϙ", 'b'),
    R("ʀ", 'b'),
    S("s", 'b'),
    T("ᴛ", 'b'),
    U("ᴜ", 'b'),
    V("ᴠ", 'b'),
    W("ᴡ", 'b'),
    X("x", 'b'),
    Y("ʏ", 'b'),
    Z("ᴢ", 'z');

    String font;
    char character;

    CustomFont_R_1_19(String font, char character) {
        this.font = font;
        this.character = character;
    }

    public static String get(String old) {
        String returned = old;
        for (CustomFont_R_1_19 font : values()) {
            returned = returned.replaceAll(font.font, Character.toString(font.character));
        }
        return returned;
    }
}
