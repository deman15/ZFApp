package com.example.android.autoinputauthcode.permission;

/**
 * Created by zf on 17-5-26.
 */
public interface PermissionCallback {
    void permissionGrant(int requestCode);
    void permissionDenied(int requestCode);
}
