package com.github.manolo8.darkbot.core.objects.group;

import com.github.manolo8.darkbot.core.itf.UpdatableAuto;

import static com.github.manolo8.darkbot.Main.API;

public class PartialGroupMember extends UpdatableAuto {
    public int id;
    public String username;

    public String getUsername() {
        return username != null && !username.isEmpty() ? username : "...";
    }

    @Override
    public void update() {
        id         = API.readMemoryInt(address + 0x20);
        username   = API.readMemoryStringFallback(API.readMemoryLong(address + 0x68), null);
    }
}
