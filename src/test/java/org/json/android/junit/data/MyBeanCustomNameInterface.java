package org.json.android.junit.data;

import org.json.android.JSONPropertyIgnore;
import org.json.android.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();
    @JSONPropertyIgnore
    int getIgnoredInt();
}