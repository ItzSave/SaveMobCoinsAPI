package org.itzsave;

import java.util.Optional;
import java.util.UUID;

public interface SaveMobCoinsAPI {

    Optional<Long> getUserBalance(final UUID uuid);

    void setUserBalance(final UUID uuid, int coins);

    void reload();

    default void MobCoinGainEvent() {
    }
}