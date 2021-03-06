package org.tasks.preferences

import android.content.Context
import org.tasks.injection.ForApplication

class PermissivePermissionChecker(@ForApplication context: Context) : PermissionChecker(context) {
    override fun canAccessCalendars() = true

    override fun canAccessAccounts() = true

    override fun canAccessLocation() = true

    override fun canAccessMic() = true
}