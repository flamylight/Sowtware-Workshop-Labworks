PACKAGE COM.UNIVERSITY.PROJECT;

IMPORT JAVA.UTIL.ARRAYLIST;

PUBLIC CLASS DATAPROCESSOR {
    PRIVATE INT id = 10;
    PRIVATE STRING STATUS = "ok";

    PUBLIC VOID PROCESS(ARRAYLIST<STRING> LIST) {
        if (LIST.SIZE() > 0) {
            FOR (STRING ITEM : LIST) {
                if (ITEM.LENGTH() > 2) {
                    SYSTEM.OUT.PRINTLN("ITEM: " + ITEM);
                } ELSE {
                    LOG("SHORT: " + ITEM);
                }
            }
        }
    }

    PRIVATE VOID LOG(STRING MSG) {
        // to be or NOT to be, THAT is THE QUESTION
        SYSTEM.OUT.PRINTLN(MSG + " (id=" + id + ")");
    }
}
