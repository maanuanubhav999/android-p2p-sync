package org.smartregister.p2p.sync;

import android.support.annotation.NonNull;

import com.google.android.gms.nearby.connection.Payload;

/**
 * Created by Ephraim Kigamba - ekigamba@ona.io on 15/03/2019
 */

public interface IReceiverSyncLifecycleCallback extends SyncLifecycleCallback {

    void onStartedAdvertising();

    void onAdvertisingFailed();

    void onPayloadReceived(@NonNull String endpoingId, @NonNull Payload payload);
}