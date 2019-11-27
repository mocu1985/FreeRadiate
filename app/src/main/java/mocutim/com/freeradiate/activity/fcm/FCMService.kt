package mocutim.com.freeradiate.activity.fcm

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import mma.security.component.diagnostics.Debuk

class FCMService : FirebaseMessagingService() {

    val TAG = this.javaClass.simpleName


    override fun onNewToken(token: String?) {

        Debuk.WriteLine(TAG, "Refreshed token: $token")

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        // TODO
//        sendRegistrationToServer(token)
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        // ...

        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Debuk.WriteLine(TAG, "From: ${remoteMessage?.from}")

        // Check if message contains a data payload.
        remoteMessage?.data?.isNotEmpty().let {
            Debuk.WriteLine(TAG, "Message data payload: ${remoteMessage?.data}")

            if (/* Check if data needs to be processed by long running job */ true) {
                // For long-running tasks (10 seconds or more) use WorkManager.
//                scheduleJob()
            } else {
                // Handle message within 10 seconds
//                handleNow()
            }
        }

        // Check if message contains a notification payload.
        remoteMessage?.notification?.let {
            Debuk.WriteLine(TAG, "Message Notification Body: ${it.body}")
        }

        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
    }
}
