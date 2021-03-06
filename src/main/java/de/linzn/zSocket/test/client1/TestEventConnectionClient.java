/*
 * Copyright (C) 2020. Niklas Linz - All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of the LGPLv3 license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the LGPLv3 license with
 * this file. If not, please write to: niklas.linz@enigmar.de
 *
 */

package de.linzn.zSocket.test.client1;

import de.linzn.zSocket.components.events.ConnectEvent;
import de.linzn.zSocket.components.events.DisconnectEvent;
import de.linzn.zSocket.components.events.IListener;
import de.linzn.zSocket.components.events.handler.EventHandler;

public class TestEventConnectionClient implements IListener {

    @EventHandler
    public void onConnectEvent(ConnectEvent event) {
        System.out.println("Client 1 is connected: New");

    }

    @EventHandler
    public void onDisconnectEvent(DisconnectEvent event) {
        System.out.println("Client 1 is disconnected: Old");
    }
}
